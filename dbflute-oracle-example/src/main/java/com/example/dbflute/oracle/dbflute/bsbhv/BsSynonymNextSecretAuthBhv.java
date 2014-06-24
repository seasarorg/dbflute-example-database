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
 * The behavior of (隣の秘密で権限あり)SYNONYM_NEXT_SECRET_AUTH as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_AUTH_CODE
 *
 * [column]
 *     SECRET_AUTH_CODE, SECRET_AUTH_NAME
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
public abstract class BsSynonymNextSecretAuthBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_SECRET_AUTH"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return SynonymNextSecretAuthDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextSecretAuthDbm getMyDBMeta() { return SynonymNextSecretAuthDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextSecretAuth newEntity() { return new SynonymNextSecretAuth(); }

    /** {@inheritDoc} */
    public SynonymNextSecretAuthCB newConditionBean() { return new SynonymNextSecretAuthCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextSecretAuth newMyEntity() { return new SynonymNextSecretAuth(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextSecretAuthCB newMyConditionBean() { return new SynonymNextSecretAuthCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextSecretAuthBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextSecretAuthCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(SynonymNextSecretAuthCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextSecretAuthCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextSecretAuthCB cb) { // called by selectPage(cb)
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
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * SynonymNextSecretAuth synonymNextSecretAuth = synonymNextSecretAuthBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextSecretAuth != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextSecretAuth.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectEntity(SynonymNextSecretAuthCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymNextSecretAuth facadeSelectEntity(SynonymNextSecretAuthCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectEntity(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends SynonymNextSecretAuth> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * SynonymNextSecretAuth synonymNextSecretAuth = synonymNextSecretAuthBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextSecretAuth.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectEntityWithDeletedCheck(SynonymNextSecretAuthCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected SynonymNextSecretAuth facadeSelectEntityWithDeletedCheck(SynonymNextSecretAuthCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectEntityWithDeletedCheck(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param secretAuthCode (隣の秘密２コード): PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectByPKValue(String secretAuthCode) {
        return facadeSelectByPKValue(secretAuthCode);
    }

    protected SynonymNextSecretAuth facadeSelectByPKValue(String secretAuthCode) {
        return doSelectByPK(secretAuthCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectByPK(String secretAuthCode, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(secretAuthCode), tp);
    }

    protected <ENTITY extends SynonymNextSecretAuth> OptionalEntity<ENTITY> doSelectOptionalByPK(String secretAuthCode, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(secretAuthCode, tp), secretAuthCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param secretAuthCode (隣の秘密２コード): PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectByPKValueWithDeletedCheck(String secretAuthCode) {
        return doSelectByPKWithDeletedCheck(secretAuthCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectByPKWithDeletedCheck(String secretAuthCode, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(secretAuthCode), tp);
    }

    protected SynonymNextSecretAuthCB xprepareCBAsPK(String secretAuthCode) {
        assertObjectNotNull("secretAuthCode", secretAuthCode);
        return newConditionBean().acceptPK(secretAuthCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextSecretAuth&gt; synonymNextSecretAuthList = synonymNextSecretAuthBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextSecretAuth synonymNextSecretAuth : synonymNextSecretAuthList) {
     *     ... = synonymNextSecretAuth.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextSecretAuth> selectList(SynonymNextSecretAuthCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<SynonymNextSecretAuth> facadeSelectList(SynonymNextSecretAuthCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> ListResultBean<ENTITY> doSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
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
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextSecretAuth&gt; page = synonymNextSecretAuthBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextSecretAuth synonymNextSecretAuth : page) {
     *     ... = synonymNextSecretAuth.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextSecretAuth> selectPage(SynonymNextSecretAuthCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<SynonymNextSecretAuth> facadeSelectPage(SynonymNextSecretAuthCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> PagingResultBean<ENTITY> doSelectPage(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextSecretAuth&gt;() {
     *     public void handle(SynonymNextSecretAuth entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextSecretAuth. (NotNull)
     */
    public void selectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<SynonymNextSecretAuth> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<SynonymNextSecretAuth> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSecretAuth> void doSelectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextSecretAuthCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextSecretAuthCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<SynonymNextSecretAuthCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends SynonymNextSecretAuthCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param synonymNextSecretAuthList The entity list of synonymNextSecretAuth. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextSecretAuth> synonymNextSecretAuthList, ReferrerLoaderHandler<LoaderOfSynonymNextSecretAuth> handler) {
        xassLRArg(synonymNextSecretAuthList, handler);
        handler.handle(new LoaderOfSynonymNextSecretAuth().ready(synonymNextSecretAuthList, _behaviorSelector));
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
     * @param synonymNextSecretAuth The entity of synonymNextSecretAuth. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextSecretAuth synonymNextSecretAuth, ReferrerLoaderHandler<LoaderOfSynonymNextSecretAuth> handler) {
        xassLRArg(synonymNextSecretAuth, handler);
        handler.handle(new LoaderOfSynonymNextSecretAuth().ready(xnewLRAryLs(synonymNextSecretAuth), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key secretAuthCode.
     * @param synonymNextSecretAuthList The list of synonymNextSecretAuth. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretAuthCodeList(List<SynonymNextSecretAuth> synonymNextSecretAuthList)
    { return helpExtractListInternally(synonymNextSecretAuthList, "secretAuthCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSecretAuth.setFoo...(value);
     * synonymNextSecretAuth.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">insert</span>(synonymNextSecretAuth);
     * ... = synonymNextSecretAuth.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextSecretAuth The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextSecretAuth synonymNextSecretAuth) {
        doInsert(synonymNextSecretAuth, null);
    }

    protected void doInsert(SynonymNextSecretAuth et, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextSecretAuthCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSecretAuth.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSecretAuth.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSecretAuthBhv.<span style="color: #DD4747">update</span>(synonymNextSecretAuth);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextSecretAuth synonymNextSecretAuth) {
        doUpdate(synonymNextSecretAuth, null);
    }

    protected void doUpdate(SynonymNextSecretAuth et, UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextSecretAuthCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected SynonymNextSecretAuthCB createCBForVaryingUpdate()
    { SynonymNextSecretAuthCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected SynonymNextSecretAuthCB createCBForSpecifiedUpdate()
    { SynonymNextSecretAuthCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextSecretAuth The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextSecretAuth synonymNextSecretAuth) {
        doInsertOrUpdate(synonymNextSecretAuth, null, null);
    }

    protected void doInsertOrUpdate(SynonymNextSecretAuth et, InsertOption<SynonymNextSecretAuthCB> iop, UpdateOption<SynonymNextSecretAuthCB> uop) {
        assertObjectNotNull("synonymNextSecretAuth", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSecretAuth.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSecretAuthBhv.<span style="color: #DD4747">delete</span>(synonymNextSecretAuth);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextSecretAuth synonymNextSecretAuth) {
        doDelete(synonymNextSecretAuth, null);
    }

    protected void doDelete(SynonymNextSecretAuth et, final DeleteOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextSecretAuthCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     *     synonymNextSecretAuth.setFooName("foo");
     *     if (...) {
     *         synonymNextSecretAuth.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextSecretAuthList.add(synonymNextSecretAuth);
     * }
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextSecretAuthList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        return doBatchInsert(synonymNextSecretAuthList, null);
    }

    protected int[] doBatchInsert(List<SynonymNextSecretAuth> ls, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", ls);
        InsertOption<SynonymNextSecretAuthCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<SynonymNextSecretAuth> ls, InsertOption<SynonymNextSecretAuthCB> op) {
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
     *     SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     *     synonymNextSecretAuth.setFooName("foo");
     *     if (...) {
     *         synonymNextSecretAuth.setFooPrice(123);
     *     } else {
     *         synonymNextSecretAuth.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextSecretAuth.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextSecretAuthList.add(synonymNextSecretAuth);
     * }
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSecretAuthList);
     * </pre>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        return doBatchUpdate(synonymNextSecretAuthList, null);
    }

    protected int[] doBatchUpdate(List<SynonymNextSecretAuth> ls, UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", ls);
        UpdateOption<SynonymNextSecretAuthCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextSecretAuth> ls, UpdateOption<SynonymNextSecretAuthCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSecretAuthList, new SpecifyQuery<SynonymNextSecretAuthCB>() {
     *     public void specify(SynonymNextSecretAuthCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSecretAuthList, new SpecifyQuery<SynonymNextSecretAuthCB>() {
     *     public void specify(SynonymNextSecretAuthCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList, SpecifyQuery<SynonymNextSecretAuthCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextSecretAuthList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        return doBatchDelete(synonymNextSecretAuthList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextSecretAuth> ls, DeleteOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", ls);
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
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextSecretAuth, SynonymNextSecretAuthCB&gt;() {
     *     public ConditionBean setup(synonymNextSecretAuth entity, SynonymNextSecretAuthCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> sp, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        SynonymNextSecretAuth et = newEntity(); SynonymNextSecretAuthCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected SynonymNextSecretAuthCB createCBForQueryInsert()
    { SynonymNextSecretAuthCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setPK...(value);</span>
     * synonymNextSecretAuth.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setVersionNo(value);</span>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextSecretAuth, cb);
     * </pre>
     * @param synonymNextSecretAuth The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextSecretAuth synonymNextSecretAuth, SynonymNextSecretAuthCB cb) {
        return doQueryUpdate(synonymNextSecretAuth, cb, null);
    }

    protected int doQueryUpdate(SynonymNextSecretAuth et, SynonymNextSecretAuthCB cb, UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextSecretAuth, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextSecretAuthCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextSecretAuthCB cb, DeleteOption<SynonymNextSecretAuthCB> op) {
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSecretAuth.setFoo...(value);
     * synonymNextSecretAuth.setBar...(value);
     * InsertOption<SynonymNextSecretAuthCB> option = new InsertOption<SynonymNextSecretAuthCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextSecretAuth, option);
     * ... = synonymNextSecretAuth.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextSecretAuth The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextSecretAuth synonymNextSecretAuth, InsertOption<SynonymNextSecretAuthCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextSecretAuth, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSecretAuth.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSecretAuth.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextSecretAuthCB&gt; option = new UpdateOption&lt;SynonymNextSecretAuthCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *         public void specify(SynonymNextSecretAuthCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextSecretAuthBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextSecretAuth, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextSecretAuth synonymNextSecretAuth, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextSecretAuth, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextSecretAuth The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextSecretAuth synonymNextSecretAuth, InsertOption<SynonymNextSecretAuthCB> insertOption, UpdateOption<SynonymNextSecretAuthCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymNextSecretAuth, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextSecretAuth The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextSecretAuth synonymNextSecretAuth, DeleteOption<SynonymNextSecretAuthCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextSecretAuth, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextSecretAuth> synonymNextSecretAuthList, InsertOption<SynonymNextSecretAuthCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextSecretAuthList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextSecretAuthList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextSecretAuth> synonymNextSecretAuthList, DeleteOption<SynonymNextSecretAuthCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextSecretAuthList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> setupper, InsertOption<SynonymNextSecretAuthCB> option) {
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setPK...(value);</span>
     * synonymNextSecretAuth.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setVersionNo(value);</span>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextSecretAuthCB&gt; option = new UpdateOption&lt;SynonymNextSecretAuthCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void specify(SynonymNextSecretAuthCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextSecretAuthBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextSecretAuth, cb, option);
     * </pre>
     * @param synonymNextSecretAuth The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextSecretAuth synonymNextSecretAuth, SynonymNextSecretAuthCB cb, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextSecretAuth, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextSecretAuthCB cb, DeleteOption<SynonymNextSecretAuthCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextSecretAuthBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<SynonymNextSecretAuth> typeOfSelectedEntity() { return SynonymNextSecretAuth.class; }
    protected SynonymNextSecretAuth downcast(Entity et) { return helpEntityDowncastInternally(et, SynonymNextSecretAuth.class); }
    protected SynonymNextSecretAuthCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, SynonymNextSecretAuthCB.class); }
    @SuppressWarnings("unchecked")
    protected List<SynonymNextSecretAuth> downcast(List<? extends Entity> ls) { return (List<SynonymNextSecretAuth>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextSecretAuthCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<SynonymNextSecretAuthCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextSecretAuthCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<SynonymNextSecretAuthCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextSecretAuthCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<SynonymNextSecretAuthCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB>)sp; }
}
