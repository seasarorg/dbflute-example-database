package com.example.dbflute.oracle.dbflute.bsbhv;

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
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of SYNONYM_PRODUCT_STATUS as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     SYNONYM_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymProductList
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymProductStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_PRODUCT_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return SynonymProductStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymProductStatusDbm getMyDBMeta() { return SynonymProductStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymProductStatus newEntity() { return new SynonymProductStatus(); }

    /** {@inheritDoc} */
    public SynonymProductStatusCB newConditionBean() { return new SynonymProductStatusCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymProductStatus newMyEntity() { return new SynonymProductStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymProductStatusCB newMyConditionBean() { return new SynonymProductStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * int count = synonymProductStatusBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymProductStatusCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(SynonymProductStatusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymProductStatusCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymProductStatusCB cb) { // called by selectPage(cb)
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * SynonymProductStatus synonymProductStatus = synonymProductStatusBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymProductStatus != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymProductStatus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectEntity(SynonymProductStatusCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymProductStatus facadeSelectEntity(SynonymProductStatusCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectEntity(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * SynonymProductStatus synonymProductStatus = synonymProductStatusBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymProductStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectEntityWithDeletedCheck(SynonymProductStatusCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected SynonymProductStatus facadeSelectEntityWithDeletedCheck(SynonymProductStatusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectEntityWithDeletedCheck(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param productStatusCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectByPKValue(String productStatusCode) {
        return facadeSelectByPKValue(productStatusCode);
    }

    protected SynonymProductStatus facadeSelectByPKValue(String productStatusCode) {
        return doSelectByPK(productStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectByPK(String productStatusCode, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productStatusCode), tp);
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(String productStatusCode, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productStatusCode, tp), productStatusCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productStatusCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectByPKValueWithDeletedCheck(String productStatusCode) {
        return doSelectByPKWithDeletedCheck(productStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectByPKWithDeletedCheck(String productStatusCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productStatusCode), tp);
    }

    protected SynonymProductStatusCB xprepareCBAsPK(String productStatusCode) {
        assertObjectNotNull("productStatusCode", productStatusCode);
        return newConditionBean().acceptPK(productStatusCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param productStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymProductStatus> selectByUniqueOf(String productStatusName) {
        return facadeSelectByUniqueOf(productStatusName);
    }

    protected OptionalEntity<SynonymProductStatus> facadeSelectByUniqueOf(String productStatusName) {
        return doSelectByUniqueOf(productStatusName, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectByUniqueOf(String productStatusName, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(productStatusName), tp), productStatusName);
    }

    protected SynonymProductStatusCB xprepareCBAsUniqueOf(String productStatusName) {
        assertObjectNotNull("productStatusName", productStatusName);
        return newConditionBean().acceptUniqueOf(productStatusName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymProductStatus&gt; synonymProductStatusList = synonymProductStatusBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymProductStatus synonymProductStatus : synonymProductStatusList) {
     *     ... = synonymProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymProductStatus> selectList(SynonymProductStatusCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<SynonymProductStatus> facadeSelectList(SynonymProductStatusCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> ListResultBean<ENTITY> doSelectList(SynonymProductStatusCB cb, Class<ENTITY> tp) {
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymProductStatus&gt; page = synonymProductStatusBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymProductStatus synonymProductStatus : page) {
     *     ... = synonymProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymProductStatus> selectPage(SynonymProductStatusCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<SynonymProductStatus> facadeSelectPage(SynonymProductStatusCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> PagingResultBean<ENTITY> doSelectPage(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymProductStatus&gt;() {
     *     public void handle(SynonymProductStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymProductStatus. (NotNull)
     */
    public void selectCursor(SynonymProductStatusCB cb, EntityRowHandler<SynonymProductStatus> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(SynonymProductStatusCB cb, EntityRowHandler<SynonymProductStatus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymProductStatus> void doSelectCursor(SynonymProductStatusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * synonymProductStatusBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymProductStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<SynonymProductStatusCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends SynonymProductStatusCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param synonymProductStatusList The entity list of synonymProductStatus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymProductStatus> synonymProductStatusList, ReferrerLoaderHandler<LoaderOfSynonymProductStatus> handler) {
        xassLRArg(synonymProductStatusList, handler);
        handler.handle(new LoaderOfSynonymProductStatus().ready(synonymProductStatusList, _behaviorSelector));
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
     * @param synonymProductStatus The entity of synonymProductStatus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymProductStatus synonymProductStatus, ReferrerLoaderHandler<LoaderOfSynonymProductStatus> handler) {
        xassLRArg(synonymProductStatus, handler);
        handler.handle(new LoaderOfSynonymProductStatus().ready(xnewLRAryLs(synonymProductStatus), _behaviorSelector));
    }

    /**
     * Load referrer of synonymProductList by the set-upper of referrer. <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * <pre>
     * synonymProductStatusBhv.<span style="color: #DD4747">loadSynonymProductList</span>(synonymProductStatusList, new ConditionBeanSetupper&lt;SynonymProductCB&gt;() {
     *     public void setup(SynonymProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (SynonymProductStatus synonymProductStatus : synonymProductStatusList) {
     *     ... = synonymProductStatus.<span style="color: #DD4747">getSynonymProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param synonymProductStatusList The entity list of synonymProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymProduct> loadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, ConditionBeanSetupper<SynonymProductCB> setupper) {
        xassLRArg(synonymProductStatusList, setupper);
        return doLoadSynonymProductList(synonymProductStatusList, new LoadReferrerOption<SynonymProductCB, SynonymProduct>().xinit(setupper));
    }

    /**
     * Load referrer of synonymProductList by the set-upper of referrer. <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * <pre>
     * synonymProductStatusBhv.<span style="color: #DD4747">loadSynonymProductList</span>(synonymProductStatusList, new ConditionBeanSetupper&lt;SynonymProductCB&gt;() {
     *     public void setup(SynonymProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = synonymProductStatus.<span style="color: #DD4747">getSynonymProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param synonymProductStatus The entity of synonymProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymProduct> loadSynonymProductList(SynonymProductStatus synonymProductStatus, ConditionBeanSetupper<SynonymProductCB> setupper) {
        xassLRArg(synonymProductStatus, setupper);
        return doLoadSynonymProductList(xnewLRLs(synonymProductStatus), new LoadReferrerOption<SynonymProductCB, SynonymProduct>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param synonymProductStatus The entity of synonymProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymProduct> loadSynonymProductList(SynonymProductStatus synonymProductStatus, LoadReferrerOption<SynonymProductCB, SynonymProduct> loadReferrerOption) {
        xassLRArg(synonymProductStatus, loadReferrerOption);
        return loadSynonymProductList(xnewLRLs(synonymProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param synonymProductStatusList The entity list of synonymProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<SynonymProduct> loadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, LoadReferrerOption<SynonymProductCB, SynonymProduct> loadReferrerOption) {
        xassLRArg(synonymProductStatusList, loadReferrerOption);
        if (synonymProductStatusList.isEmpty()) { return (NestedReferrerListGateway<SynonymProduct>)EMPTY_NREF_LGWAY; }
        return doLoadSynonymProductList(synonymProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<SynonymProduct> doLoadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, LoadReferrerOption<SynonymProductCB, SynonymProduct> option) {
        return helpLoadReferrerInternally(synonymProductStatusList, option, "synonymProductList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productStatusCode.
     * @param synonymProductStatusList The list of synonymProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusCodeList(List<SynonymProductStatus> synonymProductStatusList)
    { return helpExtractListInternally(synonymProductStatusList, "productStatusCode"); }

    /**
     * Extract the value list of (single) unique key productStatusName.
     * @param synonymProductStatusList The list of synonymProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusNameList(List<SynonymProductStatus> synonymProductStatusList)
    { return helpExtractListInternally(synonymProductStatusList, "productStatusName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProductStatus.setFoo...(value);
     * synonymProductStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">insert</span>(synonymProductStatus);
     * ... = synonymProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymProductStatus synonymProductStatus) {
        doInsert(synonymProductStatus, null);
    }

    protected void doInsert(SynonymProductStatus et, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymProductStatusCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductStatusBhv.<span style="color: #DD4747">update</span>(synonymProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymProductStatus synonymProductStatus) {
        doUpdate(synonymProductStatus, null);
    }

    protected void doUpdate(SynonymProductStatus et, UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<SynonymProductStatusCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected SynonymProductStatusCB createCBForVaryingUpdate()
    { SynonymProductStatusCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected SynonymProductStatusCB createCBForSpecifiedUpdate()
    { SynonymProductStatusCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymProductStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymProductStatus synonymProductStatus) {
        doInsertOrUpdate(synonymProductStatus, null, null);
    }

    protected void doInsertOrUpdate(SynonymProductStatus et, InsertOption<SynonymProductStatusCB> iop, UpdateOption<SynonymProductStatusCB> uop) {
        assertObjectNotNull("synonymProductStatus", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductStatusBhv.<span style="color: #DD4747">delete</span>(synonymProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymProductStatus synonymProductStatus) {
        doDelete(synonymProductStatus, null);
    }

    protected void doDelete(SynonymProductStatus et, final DeleteOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<SynonymProductStatusCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     *     synonymProductStatus.setFooName("foo");
     *     if (...) {
     *         synonymProductStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymProductStatusList.add(synonymProductStatus);
     * }
     * synonymProductStatusBhv.<span style="color: #DD4747">batchInsert</span>(synonymProductStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymProductStatus> synonymProductStatusList) {
        return doBatchInsert(synonymProductStatusList, null);
    }

    protected int[] doBatchInsert(List<SynonymProductStatus> ls, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", ls);
        InsertOption<SynonymProductStatusCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<SynonymProductStatus> ls, InsertOption<SynonymProductStatusCB> op) {
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
     *     SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     *     synonymProductStatus.setFooName("foo");
     *     if (...) {
     *         synonymProductStatus.setFooPrice(123);
     *     } else {
     *         synonymProductStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymProductStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymProductStatusList.add(synonymProductStatus);
     * }
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList);
     * </pre>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymProductStatus> synonymProductStatusList) {
        return doBatchUpdate(synonymProductStatusList, null);
    }

    protected int[] doBatchUpdate(List<SynonymProductStatus> ls, UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", ls);
        UpdateOption<SynonymProductStatusCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<SynonymProductStatus> ls, UpdateOption<SynonymProductStatusCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList, new SpecifyQuery<SynonymProductStatusCB>() {
     *     public void specify(SynonymProductStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList, new SpecifyQuery<SynonymProductStatusCB>() {
     *     public void specify(SynonymProductStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymProductStatus> synonymProductStatusList, SpecifyQuery<SynonymProductStatusCB> updateColumnSpec) {
        return doBatchUpdate(synonymProductStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymProductStatus> synonymProductStatusList) {
        return doBatchDelete(synonymProductStatusList, null);
    }

    protected int[] doBatchDelete(List<SynonymProductStatus> ls, DeleteOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", ls);
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
     * synonymProductStatusBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymProductStatus, SynonymProductStatusCB&gt;() {
     *     public ConditionBean setup(synonymProductStatus entity, SynonymProductStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> sp, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        SynonymProductStatus et = newEntity(); SynonymProductStatusCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected SynonymProductStatusCB createCBForQueryInsert()
    { SynonymProductStatusCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setPK...(value);</span>
     * synonymProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setVersionNo(value);</span>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">queryUpdate</span>(synonymProductStatus, cb);
     * </pre>
     * @param synonymProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymProductStatus synonymProductStatus, SynonymProductStatusCB cb) {
        return doQueryUpdate(synonymProductStatus, cb, null);
    }

    protected int doQueryUpdate(SynonymProductStatus et, SynonymProductStatusCB cb, UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">queryDelete</span>(synonymProductStatus, cb);
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymProductStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymProductStatusCB cb, DeleteOption<SynonymProductStatusCB> op) {
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProductStatus.setFoo...(value);
     * synonymProductStatus.setBar...(value);
     * InsertOption<SynonymProductStatusCB> option = new InsertOption<SynonymProductStatusCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymProductStatusBhv.<span style="color: #DD4747">varyingInsert</span>(synonymProductStatus, option);
     * ... = synonymProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymProductStatus synonymProductStatus, InsertOption<SynonymProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymProductStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymProductStatusCB&gt; option = new UpdateOption&lt;SynonymProductStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymProductStatusCB&gt;() {
     *         public void specify(SynonymProductStatusCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymProductStatusBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymProductStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymProductStatus synonymProductStatus, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymProductStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymProductStatus The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymProductStatus synonymProductStatus, InsertOption<SynonymProductStatusCB> insertOption, UpdateOption<SynonymProductStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymProductStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymProductStatus synonymProductStatus, DeleteOption<SynonymProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymProductStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymProductStatus> synonymProductStatusList, InsertOption<SynonymProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymProductStatusList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymProductStatus> synonymProductStatusList, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymProductStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymProductStatus> synonymProductStatusList, DeleteOption<SynonymProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymProductStatusList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> setupper, InsertOption<SynonymProductStatusCB> option) {
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setPK...(value);</span>
     * synonymProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setVersionNo(value);</span>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymProductStatusCB&gt; option = new UpdateOption&lt;SynonymProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void specify(SynonymProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymProductStatus, cb, option);
     * </pre>
     * @param synonymProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymProductStatus synonymProductStatus, SynonymProductStatusCB cb, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymProductStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymProductStatusCB cb, DeleteOption<SynonymProductStatusCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymProductStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<SynonymProductStatus> typeOfSelectedEntity() { return SynonymProductStatus.class; }
    protected SynonymProductStatus downcast(Entity et) { return helpEntityDowncastInternally(et, SynonymProductStatus.class); }
    protected SynonymProductStatusCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, SynonymProductStatusCB.class); }
    @SuppressWarnings("unchecked")
    protected List<SynonymProductStatus> downcast(List<? extends Entity> ls) { return (List<SynonymProductStatus>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymProductStatusCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<SynonymProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymProductStatusCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<SynonymProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymProductStatusCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<SynonymProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB>)sp; }
}
