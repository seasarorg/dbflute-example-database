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
 * The behavior of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
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
 *     WHITE_REF_NEXT_TARGET, NEXT_SCHEMA_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteRefNextTargetList, nextSchemaProductList
 * </pre>
 * @author oracleman
 */
public abstract class BsNextSchemaProductStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "NEXT_SCHEMA_PRODUCT_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return NextSchemaProductStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextSchemaProductStatusDbm getMyDBMeta() { return NextSchemaProductStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public NextSchemaProductStatus newEntity() { return new NextSchemaProductStatus(); }

    /** {@inheritDoc} */
    public NextSchemaProductStatusCB newConditionBean() { return new NextSchemaProductStatusCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextSchemaProductStatus newMyEntity() { return new NextSchemaProductStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextSchemaProductStatusCB newMyConditionBean() { return new NextSchemaProductStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * int count = nextSchemaProductStatusBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextSchemaProductStatusCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(NextSchemaProductStatusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(NextSchemaProductStatusCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(NextSchemaProductStatusCB cb) { // called by selectPage(cb)
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
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * NextSchemaProductStatus nextSchemaProductStatus = nextSchemaProductStatusBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (nextSchemaProductStatus != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = nextSchemaProductStatus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntity(NextSchemaProductStatusCB cb) {
        return facadeSelectEntity(cb);
    }

    protected NextSchemaProductStatus facadeSelectEntity(NextSchemaProductStatusCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectEntity(NextSchemaProductStatusCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(NextSchemaProductStatusCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * NextSchemaProductStatus nextSchemaProductStatus = nextSchemaProductStatusBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProductStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntityWithDeletedCheck(NextSchemaProductStatusCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected NextSchemaProductStatus facadeSelectEntityWithDeletedCheck(NextSchemaProductStatusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectEntityWithDeletedCheck(NextSchemaProductStatusCB cb, Class<ENTITY> tp) {
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
    public NextSchemaProductStatus selectByPKValue(String productStatusCode) {
        return facadeSelectByPKValue(productStatusCode);
    }

    protected NextSchemaProductStatus facadeSelectByPKValue(String productStatusCode) {
        return doSelectByPK(productStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectByPK(String productStatusCode, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productStatusCode), tp);
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(String productStatusCode, Class<ENTITY> tp) {
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
    public NextSchemaProductStatus selectByPKValueWithDeletedCheck(String productStatusCode) {
        return doSelectByPKWithDeletedCheck(productStatusCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectByPKWithDeletedCheck(String productStatusCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productStatusCode), tp);
    }

    protected NextSchemaProductStatusCB xprepareCBAsPK(String productStatusCode) {
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
    public OptionalEntity<NextSchemaProductStatus> selectByUniqueOf(String productStatusName) {
        return facadeSelectByUniqueOf(productStatusName);
    }

    protected OptionalEntity<NextSchemaProductStatus> facadeSelectByUniqueOf(String productStatusName) {
        return doSelectByUniqueOf(productStatusName, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> OptionalEntity<ENTITY> doSelectByUniqueOf(String productStatusName, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(productStatusName), tp), productStatusName);
    }

    protected NextSchemaProductStatusCB xprepareCBAsUniqueOf(String productStatusName) {
        assertObjectNotNull("productStatusName", productStatusName);
        return newConditionBean().acceptUniqueOf(productStatusName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextSchemaProductStatus&gt; nextSchemaProductStatusList = nextSchemaProductStatusBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProductStatus> selectList(NextSchemaProductStatusCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<NextSchemaProductStatus> facadeSelectList(NextSchemaProductStatusCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> ListResultBean<ENTITY> doSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> tp) {
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
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProductStatus&gt; page = nextSchemaProductStatusBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextSchemaProductStatus nextSchemaProductStatus : page) {
     *     ... = nextSchemaProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProductStatus> selectPage(NextSchemaProductStatusCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<NextSchemaProductStatus> facadeSelectPage(NextSchemaProductStatusCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> PagingResultBean<ENTITY> doSelectPage(NextSchemaProductStatusCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextSchemaProductStatus&gt;() {
     *     public void handle(NextSchemaProductStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of NextSchemaProductStatus. (NotNull)
     */
    public void selectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<NextSchemaProductStatus> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<NextSchemaProductStatus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextSchemaProductStatus> void doSelectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<NextSchemaProductStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<NextSchemaProductStatusCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends NextSchemaProductStatusCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<NextSchemaProductStatus> nextSchemaProductStatusList, ReferrerLoaderHandler<LoaderOfNextSchemaProductStatus> handler) {
        xassLRArg(nextSchemaProductStatusList, handler);
        handler.handle(new LoaderOfNextSchemaProductStatus().ready(nextSchemaProductStatusList, _behaviorSelector));
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
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(NextSchemaProductStatus nextSchemaProductStatus, ReferrerLoaderHandler<LoaderOfNextSchemaProductStatus> handler) {
        xassLRArg(nextSchemaProductStatus, handler);
        handler.handle(new LoaderOfNextSchemaProductStatus().ready(xnewLRAryLs(nextSchemaProductStatus), _behaviorSelector));
    }

    /**
     * Load referrer of whiteRefNextTargetList by the set-upper of referrer. <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">loadWhiteRefNextTargetList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;WhiteRefNextTargetCB&gt;() {
     *     public void setup(WhiteRefNextTargetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.<span style="color: #DD4747">getWhiteRefNextTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTargetList(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<WhiteRefNextTargetCB> setupper) {
        xassLRArg(nextSchemaProductStatusList, setupper);
        return doLoadWhiteRefNextTargetList(nextSchemaProductStatusList, new LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget>().xinit(setupper));
    }

    /**
     * Load referrer of whiteRefNextTargetList by the set-upper of referrer. <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">loadWhiteRefNextTargetList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;WhiteRefNextTargetCB&gt;() {
     *     public void setup(WhiteRefNextTargetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = nextSchemaProductStatus.<span style="color: #DD4747">getWhiteRefNextTargetList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTargetList(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<WhiteRefNextTargetCB> setupper) {
        xassLRArg(nextSchemaProductStatus, setupper);
        return doLoadWhiteRefNextTargetList(xnewLRLs(nextSchemaProductStatus), new LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTargetList(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        return loadWhiteRefNextTargetList(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteRefNextTarget> loadWhiteRefNextTargetList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return (NestedReferrerListGateway<WhiteRefNextTarget>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteRefNextTargetList(nextSchemaProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteRefNextTarget> doLoadWhiteRefNextTargetList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> option) {
        return helpLoadReferrerInternally(nextSchemaProductStatusList, option, "whiteRefNextTargetList");
    }

    /**
     * Load referrer of nextSchemaProductList by the set-upper of referrer. <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">loadNextSchemaProductList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;NextSchemaProductCB&gt;() {
     *     public void setup(NextSchemaProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.<span style="color: #DD4747">getNextSchemaProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProductList(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<NextSchemaProductCB> setupper) {
        xassLRArg(nextSchemaProductStatusList, setupper);
        return doLoadNextSchemaProductList(nextSchemaProductStatusList, new LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct>().xinit(setupper));
    }

    /**
     * Load referrer of nextSchemaProductList by the set-upper of referrer. <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">loadNextSchemaProductList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;NextSchemaProductCB&gt;() {
     *     public void setup(NextSchemaProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = nextSchemaProductStatus.<span style="color: #DD4747">getNextSchemaProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProductList(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<NextSchemaProductCB> setupper) {
        xassLRArg(nextSchemaProductStatus, setupper);
        return doLoadNextSchemaProductList(xnewLRLs(nextSchemaProductStatus), new LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProductList(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        return loadNextSchemaProductList(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<NextSchemaProduct> loadNextSchemaProductList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return (NestedReferrerListGateway<NextSchemaProduct>)EMPTY_NREF_LGWAY; }
        return doLoadNextSchemaProductList(nextSchemaProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<NextSchemaProduct> doLoadNextSchemaProductList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> option) {
        return helpLoadReferrerInternally(nextSchemaProductStatusList, option, "nextSchemaProductList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productStatusCode.
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusCodeList(List<NextSchemaProductStatus> nextSchemaProductStatusList)
    { return helpExtractListInternally(nextSchemaProductStatusList, "productStatusCode"); }

    /**
     * Extract the value list of (single) unique key productStatusName.
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusNameList(List<NextSchemaProductStatus> nextSchemaProductStatusList)
    { return helpExtractListInternally(nextSchemaProductStatusList, "productStatusName"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">insert</span>(nextSchemaProductStatus);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProductStatus nextSchemaProductStatus) {
        doInsert(nextSchemaProductStatus, null);
    }

    protected void doInsert(NextSchemaProductStatus et, InsertOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatus", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<NextSchemaProductStatusCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductStatusBhv.<span style="color: #DD4747">update</span>(nextSchemaProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(NextSchemaProductStatus nextSchemaProductStatus) {
        doUpdate(nextSchemaProductStatus, null);
    }

    protected void doUpdate(NextSchemaProductStatus et, UpdateOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatus", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<NextSchemaProductStatusCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected NextSchemaProductStatusCB createCBForVaryingUpdate()
    { NextSchemaProductStatusCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected NextSchemaProductStatusCB createCBForSpecifiedUpdate()
    { NextSchemaProductStatusCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextSchemaProductStatus The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus) {
        doInsertOrUpdate(nextSchemaProductStatus, null, null);
    }

    protected void doInsertOrUpdate(NextSchemaProductStatus et, InsertOption<NextSchemaProductStatusCB> iop, UpdateOption<NextSchemaProductStatusCB> uop) {
        assertObjectNotNull("nextSchemaProductStatus", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductStatusBhv.<span style="color: #DD4747">delete</span>(nextSchemaProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProductStatus nextSchemaProductStatus) {
        doDelete(nextSchemaProductStatus, null);
    }

    protected void doDelete(NextSchemaProductStatus et, final DeleteOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatus", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<NextSchemaProductStatusCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     if (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">batchInsert</span>(nextSchemaProductStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchInsert(nextSchemaProductStatusList, null);
    }

    protected int[] doBatchInsert(List<NextSchemaProductStatus> ls, InsertOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatusList", ls);
        InsertOption<NextSchemaProductStatusCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<NextSchemaProductStatus> ls, InsertOption<NextSchemaProductStatusCB> op) {
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
     *     NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     if (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     } else {
     *         nextSchemaProductStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProductStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductStatusList);
     * </pre>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchUpdate(nextSchemaProductStatusList, null);
    }

    protected int[] doBatchUpdate(List<NextSchemaProductStatus> ls, UpdateOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatusList", ls);
        UpdateOption<NextSchemaProductStatusCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<NextSchemaProductStatus> ls, UpdateOption<NextSchemaProductStatusCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductStatusList, new SpecifyQuery<NextSchemaProductStatusCB>() {
     *     public void specify(NextSchemaProductStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductStatusList, new SpecifyQuery<NextSchemaProductStatusCB>() {
     *     public void specify(NextSchemaProductStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, SpecifyQuery<NextSchemaProductStatusCB> updateColumnSpec) {
        return doBatchUpdate(nextSchemaProductStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchDelete(nextSchemaProductStatusList, null);
    }

    protected int[] doBatchDelete(List<NextSchemaProductStatus> ls, DeleteOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatusList", ls);
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
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProductStatus, NextSchemaProductStatusCB&gt;() {
     *     public ConditionBean setup(nextSchemaProductStatus entity, NextSchemaProductStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> sp, InsertOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        NextSchemaProductStatus et = newEntity(); NextSchemaProductStatusCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected NextSchemaProductStatusCB createCBForQueryInsert()
    { NextSchemaProductStatusCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">queryUpdate</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb) {
        return doQueryUpdate(nextSchemaProductStatus, cb, null);
    }

    protected int doQueryUpdate(NextSchemaProductStatus et, NextSchemaProductStatusCB cb, UpdateOption<NextSchemaProductStatusCB> op) {
        assertObjectNotNull("nextSchemaProductStatus", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">queryDelete</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextSchemaProductStatusCB cb, DeleteOption<NextSchemaProductStatusCB> op) {
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * InsertOption<NextSchemaProductStatusCB> option = new InsertOption<NextSchemaProductStatusCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">varyingInsert</span>(nextSchemaProductStatus, option);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProductStatus The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextSchemaProductStatus nextSchemaProductStatus, InsertOption<NextSchemaProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(nextSchemaProductStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * nextSchemaProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductStatusCB&gt; option = new UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *         public void specify(NextSchemaProductStatusCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextSchemaProductStatusBhv.<span style="color: #DD4747">varyingUpdate</span>(nextSchemaProductStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextSchemaProductStatus nextSchemaProductStatus, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(nextSchemaProductStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextSchemaProductStatus The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus, InsertOption<NextSchemaProductStatusCB> insertOption, UpdateOption<NextSchemaProductStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(nextSchemaProductStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param nextSchemaProductStatus The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextSchemaProductStatus nextSchemaProductStatus, DeleteOption<NextSchemaProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(nextSchemaProductStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList, InsertOption<NextSchemaProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(nextSchemaProductStatusList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(nextSchemaProductStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList, DeleteOption<NextSchemaProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(nextSchemaProductStatusList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> setupper, InsertOption<NextSchemaProductStatusCB> option) {
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductStatusCB&gt; option = new UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void specify(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductStatusBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(nextSchemaProductStatus, cb, option);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(nextSchemaProductStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextSchemaProductStatusCB cb, DeleteOption<NextSchemaProductStatusCB> option) {
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
    public OutsideSqlBasicExecutor<NextSchemaProductStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<NextSchemaProductStatus> typeOfSelectedEntity() { return NextSchemaProductStatus.class; }
    protected NextSchemaProductStatus downcast(Entity et) { return helpEntityDowncastInternally(et, NextSchemaProductStatus.class); }
    protected NextSchemaProductStatusCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, NextSchemaProductStatusCB.class); }
    @SuppressWarnings("unchecked")
    protected List<NextSchemaProductStatus> downcast(List<? extends Entity> ls) { return (List<NextSchemaProductStatus>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<NextSchemaProductStatusCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<NextSchemaProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<NextSchemaProductStatusCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<NextSchemaProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<NextSchemaProductStatusCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<NextSchemaProductStatusCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB>)sp; }
}
