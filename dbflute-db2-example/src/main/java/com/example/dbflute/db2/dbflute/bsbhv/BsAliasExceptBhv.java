package com.example.dbflute.db2.dbflute.bsbhv;

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
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.bsbhv.loader.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The behavior of ALIAS_EXCEPT as ALIAS. <br />
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     ALIAS_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasRefExceptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "ALIAS_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return AliasExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasExceptDbm getMyDBMeta() { return AliasExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public AliasExcept newEntity() { return new AliasExcept(); }

    /** {@inheritDoc} */
    public AliasExceptCB newConditionBean() { return new AliasExceptCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public AliasExcept newMyEntity() { return new AliasExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public AliasExceptCB newMyConditionBean() { return new AliasExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * int count = aliasExceptBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasExceptCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(AliasExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(AliasExceptCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(AliasExceptCB cb) { // called by selectPage(cb)
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
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * AliasExcept aliasExcept = aliasExceptBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (aliasExcept != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectEntity(AliasExceptCB cb) {
        return facadeSelectEntity(cb);
    }

    protected AliasExcept facadeSelectEntity(AliasExceptCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectEntity(AliasExceptCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends AliasExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(AliasExceptCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * AliasExcept aliasExcept = aliasExceptBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectEntityWithDeletedCheck(AliasExceptCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected AliasExcept facadeSelectEntityWithDeletedCheck(AliasExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectEntityWithDeletedCheck(AliasExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param exceptId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectByPKValue(Long exceptId) {
        return facadeSelectByPKValue(exceptId);
    }

    protected AliasExcept facadeSelectByPKValue(Long exceptId) {
        return doSelectByPK(exceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectByPK(Long exceptId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(exceptId), tp);
    }

    protected <ENTITY extends AliasExcept> OptionalEntity<ENTITY> doSelectOptionalByPK(Long exceptId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(exceptId, tp), exceptId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param exceptId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectByPKValueWithDeletedCheck(Long exceptId) {
        return doSelectByPKWithDeletedCheck(exceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectByPKWithDeletedCheck(Long exceptId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(exceptId), tp);
    }

    protected AliasExceptCB xprepareCBAsPK(Long exceptId) {
        assertObjectNotNull("exceptId", exceptId);
        return newConditionBean().acceptPK(exceptId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;AliasExcept&gt; aliasExceptList = aliasExceptBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (AliasExcept aliasExcept : aliasExceptList) {
     *     ... = aliasExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasExcept> selectList(AliasExceptCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<AliasExcept> facadeSelectList(AliasExceptCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> ListResultBean<ENTITY> doSelectList(AliasExceptCB cb, Class<ENTITY> tp) {
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
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasExcept&gt; page = aliasExceptBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (AliasExcept aliasExcept : page) {
     *     ... = aliasExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasExcept> selectPage(AliasExceptCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<AliasExcept> facadeSelectPage(AliasExceptCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> PagingResultBean<ENTITY> doSelectPage(AliasExceptCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasExcept&gt;() {
     *     public void handle(AliasExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasExcept. (NotNull)
     */
    public void selectCursor(AliasExceptCB cb, EntityRowHandler<AliasExcept> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(AliasExceptCB cb, EntityRowHandler<AliasExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasExcept> void doSelectCursor(AliasExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * aliasExceptBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<AliasExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<AliasExceptCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends AliasExceptCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param aliasExceptList The entity list of aliasExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<AliasExcept> aliasExceptList, ReferrerLoaderHandler<LoaderOfAliasExcept> handler) {
        xassLRArg(aliasExceptList, handler);
        handler.handle(new LoaderOfAliasExcept().ready(aliasExceptList, _behaviorSelector));
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
     * @param aliasExcept The entity of aliasExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(AliasExcept aliasExcept, ReferrerLoaderHandler<LoaderOfAliasExcept> handler) {
        xassLRArg(aliasExcept, handler);
        handler.handle(new LoaderOfAliasExcept().ready(xnewLRAryLs(aliasExcept), _behaviorSelector));
    }

    /**
     * Load referrer of aliasRefExceptList by the set-upper of referrer. <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * <pre>
     * aliasExceptBhv.<span style="color: #DD4747">loadAliasRefExceptList</span>(aliasExceptList, new ConditionBeanSetupper&lt;AliasRefExceptCB&gt;() {
     *     public void setup(AliasRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (AliasExcept aliasExcept : aliasExceptList) {
     *     ... = aliasExcept.<span style="color: #DD4747">getAliasRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param aliasExceptList The entity list of aliasExcept. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasRefExcept> loadAliasRefExceptList(List<AliasExcept> aliasExceptList, ConditionBeanSetupper<AliasRefExceptCB> setupper) {
        xassLRArg(aliasExceptList, setupper);
        return doLoadAliasRefExceptList(aliasExceptList, new LoadReferrerOption<AliasRefExceptCB, AliasRefExcept>().xinit(setupper));
    }

    /**
     * Load referrer of aliasRefExceptList by the set-upper of referrer. <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * <pre>
     * aliasExceptBhv.<span style="color: #DD4747">loadAliasRefExceptList</span>(aliasExceptList, new ConditionBeanSetupper&lt;AliasRefExceptCB&gt;() {
     *     public void setup(AliasRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = aliasExcept.<span style="color: #DD4747">getAliasRefExceptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param aliasExcept The entity of aliasExcept. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasRefExcept> loadAliasRefExceptList(AliasExcept aliasExcept, ConditionBeanSetupper<AliasRefExceptCB> setupper) {
        xassLRArg(aliasExcept, setupper);
        return doLoadAliasRefExceptList(xnewLRLs(aliasExcept), new LoadReferrerOption<AliasRefExceptCB, AliasRefExcept>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param aliasExcept The entity of aliasExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasRefExcept> loadAliasRefExceptList(AliasExcept aliasExcept, LoadReferrerOption<AliasRefExceptCB, AliasRefExcept> loadReferrerOption) {
        xassLRArg(aliasExcept, loadReferrerOption);
        return loadAliasRefExceptList(xnewLRLs(aliasExcept), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param aliasExceptList The entity list of aliasExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<AliasRefExcept> loadAliasRefExceptList(List<AliasExcept> aliasExceptList, LoadReferrerOption<AliasRefExceptCB, AliasRefExcept> loadReferrerOption) {
        xassLRArg(aliasExceptList, loadReferrerOption);
        if (aliasExceptList.isEmpty()) { return (NestedReferrerListGateway<AliasRefExcept>)EMPTY_NREF_LGWAY; }
        return doLoadAliasRefExceptList(aliasExceptList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<AliasRefExcept> doLoadAliasRefExceptList(List<AliasExcept> aliasExceptList, LoadReferrerOption<AliasRefExceptCB, AliasRefExcept> option) {
        return helpLoadReferrerInternally(aliasExceptList, option, "aliasRefExceptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key exceptId.
     * @param aliasExceptList The list of aliasExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractExceptIdList(List<AliasExcept> aliasExceptList)
    { return helpExtractListInternally(aliasExceptList, "exceptId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasExcept.setFoo...(value);
     * aliasExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * aliasExceptBhv.<span style="color: #DD4747">insert</span>(aliasExcept);
     * ... = aliasExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasExcept aliasExcept) {
        doInsert(aliasExcept, null);
    }

    protected void doInsert(AliasExcept et, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<AliasExceptCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasExceptBhv.<span style="color: #DD4747">update</span>(aliasExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(AliasExcept aliasExcept) {
        doUpdate(aliasExcept, null);
    }

    protected void doUpdate(AliasExcept et, UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<AliasExceptCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected AliasExceptCB createCBForVaryingUpdate()
    { AliasExceptCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected AliasExceptCB createCBForSpecifiedUpdate()
    { AliasExceptCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasExcept The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasExcept aliasExcept) {
        doInsertOrUpdate(aliasExcept, null, null);
    }

    protected void doInsertOrUpdate(AliasExcept et, InsertOption<AliasExceptCB> iop, UpdateOption<AliasExceptCB> uop) {
        assertObjectNotNull("aliasExcept", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasExceptBhv.<span style="color: #DD4747">delete</span>(aliasExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasExcept aliasExcept) {
        doDelete(aliasExcept, null);
    }

    protected void doDelete(AliasExcept et, final DeleteOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<AliasExceptCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     AliasExcept aliasExcept = new AliasExcept();
     *     aliasExcept.setFooName("foo");
     *     if (...) {
     *         aliasExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasExceptList.add(aliasExcept);
     * }
     * aliasExceptBhv.<span style="color: #DD4747">batchInsert</span>(aliasExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasExcept> aliasExceptList) {
        return doBatchInsert(aliasExceptList, null);
    }

    protected int[] doBatchInsert(List<AliasExcept> ls, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", ls);
        InsertOption<AliasExceptCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<AliasExcept> ls, InsertOption<AliasExceptCB> op) {
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
     *     AliasExcept aliasExcept = new AliasExcept();
     *     aliasExcept.setFooName("foo");
     *     if (...) {
     *         aliasExcept.setFooPrice(123);
     *     } else {
     *         aliasExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasExceptList.add(aliasExcept);
     * }
     * aliasExceptBhv.<span style="color: #DD4747">batchUpdate</span>(aliasExceptList);
     * </pre>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasExcept> aliasExceptList) {
        return doBatchUpdate(aliasExceptList, null);
    }

    protected int[] doBatchUpdate(List<AliasExcept> ls, UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", ls);
        UpdateOption<AliasExceptCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<AliasExcept> ls, UpdateOption<AliasExceptCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * aliasExceptBhv.<span style="color: #DD4747">batchUpdate</span>(aliasExceptList, new SpecifyQuery<AliasExceptCB>() {
     *     public void specify(AliasExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * aliasExceptBhv.<span style="color: #DD4747">batchUpdate</span>(aliasExceptList, new SpecifyQuery<AliasExceptCB>() {
     *     public void specify(AliasExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasExcept> aliasExceptList, SpecifyQuery<AliasExceptCB> updateColumnSpec) {
        return doBatchUpdate(aliasExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<AliasExcept> aliasExceptList) {
        return doBatchDelete(aliasExceptList, null);
    }

    protected int[] doBatchDelete(List<AliasExcept> ls, DeleteOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", ls);
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
     * aliasExceptBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasExcept, AliasExceptCB&gt;() {
     *     public ConditionBean setup(aliasExcept entity, AliasExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> sp, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        AliasExcept et = newEntity(); AliasExceptCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected AliasExceptCB createCBForQueryInsert()
    { AliasExceptCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasExcept.setPK...(value);</span>
     * aliasExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasExcept.setVersionNo(value);</span>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #DD4747">queryUpdate</span>(aliasExcept, cb);
     * </pre>
     * @param aliasExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasExcept aliasExcept, AliasExceptCB cb) {
        return doQueryUpdate(aliasExcept, cb, null);
    }

    protected int doQueryUpdate(AliasExcept et, AliasExceptCB cb, UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #DD4747">queryDelete</span>(aliasExcept, cb);
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(AliasExceptCB cb, DeleteOption<AliasExceptCB> op) {
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
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasExcept.setFoo...(value);
     * aliasExcept.setBar...(value);
     * InsertOption<AliasExceptCB> option = new InsertOption<AliasExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasExceptBhv.<span style="color: #DD4747">varyingInsert</span>(aliasExcept, option);
     * ... = aliasExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasExcept aliasExcept, InsertOption<AliasExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(aliasExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasExceptCB&gt; option = new UpdateOption&lt;AliasExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasExceptCB&gt;() {
     *         public void specify(AliasExceptCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasExceptBhv.<span style="color: #DD4747">varyingUpdate</span>(aliasExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasExcept aliasExcept, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(aliasExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasExcept The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasExcept aliasExcept, InsertOption<AliasExceptCB> insertOption, UpdateOption<AliasExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(aliasExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasExcept The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasExcept aliasExcept, DeleteOption<AliasExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasExcept> aliasExceptList, InsertOption<AliasExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(aliasExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasExcept> aliasExceptList, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(aliasExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasExcept> aliasExceptList, DeleteOption<AliasExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(aliasExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> setupper, InsertOption<AliasExceptCB> option) {
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
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasExcept.setPK...(value);</span>
     * aliasExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasExcept.setVersionNo(value);</span>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasExceptCB&gt; option = new UpdateOption&lt;AliasExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasExceptCB&gt;() {
     *     public void specify(AliasExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasExceptBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(aliasExcept, cb, option);
     * </pre>
     * @param aliasExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasExcept aliasExcept, AliasExceptCB cb, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(aliasExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasExceptCB cb, DeleteOption<AliasExceptCB> option) {
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
    public OutsideSqlBasicExecutor<AliasExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<AliasExcept> typeOfSelectedEntity() { return AliasExcept.class; }
    protected AliasExcept downcast(Entity et) { return helpEntityDowncastInternally(et, AliasExcept.class); }
    protected AliasExceptCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, AliasExceptCB.class); }
    @SuppressWarnings("unchecked")
    protected List<AliasExcept> downcast(List<? extends Entity> ls) { return (List<AliasExcept>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<AliasExceptCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<AliasExceptCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasExceptCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<AliasExceptCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasExceptCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<AliasExceptCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasExcept, AliasExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<AliasExcept, AliasExceptCB>)sp; }
}
