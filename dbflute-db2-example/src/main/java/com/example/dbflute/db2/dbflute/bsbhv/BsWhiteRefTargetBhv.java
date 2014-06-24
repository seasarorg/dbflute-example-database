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
 * The behavior of WHITE_REF_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_TARGET_ID
 *
 * [column]
 *     REF_TARGET_ID, TARGET_ID
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
 *     WHITE_TARGET
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteTarget
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteRefTargetBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_REF_TARGET"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteRefTargetDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteRefTargetDbm getMyDBMeta() { return WhiteRefTargetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteRefTarget newEntity() { return new WhiteRefTarget(); }

    /** {@inheritDoc} */
    public WhiteRefTargetCB newConditionBean() { return new WhiteRefTargetCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteRefTarget newMyEntity() { return new WhiteRefTarget(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteRefTargetCB newMyConditionBean() { return new WhiteRefTargetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * int count = whiteRefTargetBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteRefTargetCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteRefTargetCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteRefTargetCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteRefTargetCB cb) { // called by selectPage(cb)
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
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefTarget whiteRefTarget = whiteRefTargetBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteRefTarget != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteRefTarget.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectEntity(WhiteRefTargetCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteRefTarget facadeSelectEntity(WhiteRefTargetCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectEntity(WhiteRefTargetCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteRefTarget> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteRefTargetCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefTarget whiteRefTarget = whiteRefTargetBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteRefTarget.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectEntityWithDeletedCheck(WhiteRefTargetCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteRefTarget facadeSelectEntityWithDeletedCheck(WhiteRefTargetCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectEntityWithDeletedCheck(WhiteRefTargetCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param refTargetId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectByPKValue(Long refTargetId) {
        return facadeSelectByPKValue(refTargetId);
    }

    protected WhiteRefTarget facadeSelectByPKValue(Long refTargetId) {
        return doSelectByPK(refTargetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectByPK(Long refTargetId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refTargetId), tp);
    }

    protected <ENTITY extends WhiteRefTarget> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refTargetId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refTargetId, tp), refTargetId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refTargetId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectByPKValueWithDeletedCheck(Long refTargetId) {
        return doSelectByPKWithDeletedCheck(refTargetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectByPKWithDeletedCheck(Long refTargetId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refTargetId), tp);
    }

    protected WhiteRefTargetCB xprepareCBAsPK(Long refTargetId) {
        assertObjectNotNull("refTargetId", refTargetId);
        return newConditionBean().acceptPK(refTargetId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteRefTarget&gt; whiteRefTargetList = whiteRefTargetBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteRefTarget whiteRefTarget : whiteRefTargetList) {
     *     ... = whiteRefTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteRefTarget> selectList(WhiteRefTargetCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteRefTarget> facadeSelectList(WhiteRefTargetCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> ListResultBean<ENTITY> doSelectList(WhiteRefTargetCB cb, Class<ENTITY> tp) {
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
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteRefTarget&gt; page = whiteRefTargetBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteRefTarget whiteRefTarget : page) {
     *     ... = whiteRefTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteRefTarget> selectPage(WhiteRefTargetCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteRefTarget> facadeSelectPage(WhiteRefTargetCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> PagingResultBean<ENTITY> doSelectPage(WhiteRefTargetCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteRefTarget&gt;() {
     *     public void handle(WhiteRefTarget entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteRefTarget. (NotNull)
     */
    public void selectCursor(WhiteRefTargetCB cb, EntityRowHandler<WhiteRefTarget> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteRefTargetCB cb, EntityRowHandler<WhiteRefTarget> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteRefTarget> void doSelectCursor(WhiteRefTargetCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteRefTargetBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteRefTargetCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteRefTargetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteRefTargetCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteRefTargetCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteRefTargetList The entity list of whiteRefTarget. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteRefTarget> whiteRefTargetList, ReferrerLoaderHandler<LoaderOfWhiteRefTarget> handler) {
        xassLRArg(whiteRefTargetList, handler);
        handler.handle(new LoaderOfWhiteRefTarget().ready(whiteRefTargetList, _behaviorSelector));
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
     * @param whiteRefTarget The entity of whiteRefTarget. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteRefTarget whiteRefTarget, ReferrerLoaderHandler<LoaderOfWhiteRefTarget> handler) {
        xassLRArg(whiteRefTarget, handler);
        handler.handle(new LoaderOfWhiteRefTarget().ready(xnewLRAryLs(whiteRefTarget), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteTarget'.
     * @param whiteRefTargetList The list of whiteRefTarget. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteTarget> pulloutWhiteTarget(List<WhiteRefTarget> whiteRefTargetList)
    { return helpPulloutInternally(whiteRefTargetList, "whiteTarget"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refTargetId.
     * @param whiteRefTargetList The list of whiteRefTarget. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefTargetIdList(List<WhiteRefTarget> whiteRefTargetList)
    { return helpExtractListInternally(whiteRefTargetList, "refTargetId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefTarget.setFoo...(value);
     * whiteRefTarget.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.set...;</span>
     * whiteRefTargetBhv.<span style="color: #DD4747">insert</span>(whiteRefTarget);
     * ... = whiteRefTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteRefTarget The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteRefTarget whiteRefTarget) {
        doInsert(whiteRefTarget, null);
    }

    protected void doInsert(WhiteRefTarget et, InsertOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTarget", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteRefTargetCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * whiteRefTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefTargetBhv.<span style="color: #DD4747">update</span>(whiteRefTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefTarget The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteRefTarget whiteRefTarget) {
        doUpdate(whiteRefTarget, null);
    }

    protected void doUpdate(WhiteRefTarget et, UpdateOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTarget", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteRefTargetCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteRefTargetCB createCBForVaryingUpdate()
    { WhiteRefTargetCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteRefTargetCB createCBForSpecifiedUpdate()
    { WhiteRefTargetCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteRefTarget The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteRefTarget whiteRefTarget) {
        doInsertOrUpdate(whiteRefTarget, null, null);
    }

    protected void doInsertOrUpdate(WhiteRefTarget et, InsertOption<WhiteRefTargetCB> iop, UpdateOption<WhiteRefTargetCB> uop) {
        assertObjectNotNull("whiteRefTarget", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * whiteRefTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefTargetBhv.<span style="color: #DD4747">delete</span>(whiteRefTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefTarget The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteRefTarget whiteRefTarget) {
        doDelete(whiteRefTarget, null);
    }

    protected void doDelete(WhiteRefTarget et, final DeleteOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTarget", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteRefTargetCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     *     whiteRefTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefTarget.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteRefTargetList.add(whiteRefTarget);
     * }
     * whiteRefTargetBhv.<span style="color: #DD4747">batchInsert</span>(whiteRefTargetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteRefTarget> whiteRefTargetList) {
        return doBatchInsert(whiteRefTargetList, null);
    }

    protected int[] doBatchInsert(List<WhiteRefTarget> ls, InsertOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTargetList", ls);
        InsertOption<WhiteRefTargetCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteRefTarget> ls, InsertOption<WhiteRefTargetCB> op) {
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
     *     WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     *     whiteRefTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefTarget.setFooPrice(123);
     *     } else {
     *         whiteRefTarget.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteRefTarget.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteRefTargetList.add(whiteRefTarget);
     * }
     * whiteRefTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefTargetList);
     * </pre>
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefTarget> whiteRefTargetList) {
        return doBatchUpdate(whiteRefTargetList, null);
    }

    protected int[] doBatchUpdate(List<WhiteRefTarget> ls, UpdateOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTargetList", ls);
        UpdateOption<WhiteRefTargetCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteRefTarget> ls, UpdateOption<WhiteRefTargetCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteRefTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefTargetList, new SpecifyQuery<WhiteRefTargetCB>() {
     *     public void specify(WhiteRefTargetCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteRefTargetBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefTargetList, new SpecifyQuery<WhiteRefTargetCB>() {
     *     public void specify(WhiteRefTargetCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefTarget> whiteRefTargetList, SpecifyQuery<WhiteRefTargetCB> updateColumnSpec) {
        return doBatchUpdate(whiteRefTargetList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteRefTarget> whiteRefTargetList) {
        return doBatchDelete(whiteRefTargetList, null);
    }

    protected int[] doBatchDelete(List<WhiteRefTarget> ls, DeleteOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTargetList", ls);
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
     * whiteRefTargetBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteRefTarget, WhiteRefTargetCB&gt;() {
     *     public ConditionBean setup(whiteRefTarget entity, WhiteRefTargetCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> sp, InsertOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteRefTarget et = newEntity(); WhiteRefTargetCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteRefTargetCB createCBForQueryInsert()
    { WhiteRefTargetCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setPK...(value);</span>
     * whiteRefTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setVersionNo(value);</span>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #DD4747">queryUpdate</span>(whiteRefTarget, cb);
     * </pre>
     * @param whiteRefTarget The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteRefTarget whiteRefTarget, WhiteRefTargetCB cb) {
        return doQueryUpdate(whiteRefTarget, cb, null);
    }

    protected int doQueryUpdate(WhiteRefTarget et, WhiteRefTargetCB cb, UpdateOption<WhiteRefTargetCB> op) {
        assertObjectNotNull("whiteRefTarget", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #DD4747">queryDelete</span>(whiteRefTarget, cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteRefTargetCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteRefTargetCB cb, DeleteOption<WhiteRefTargetCB> op) {
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
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefTarget.setFoo...(value);
     * whiteRefTarget.setBar...(value);
     * InsertOption<WhiteRefTargetCB> option = new InsertOption<WhiteRefTargetCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteRefTargetBhv.<span style="color: #DD4747">varyingInsert</span>(whiteRefTarget, option);
     * ... = whiteRefTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteRefTarget The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteRefTarget whiteRefTarget, InsertOption<WhiteRefTargetCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteRefTarget, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * whiteRefTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteRefTarget.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteRefTargetCB&gt; option = new UpdateOption&lt;WhiteRefTargetCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteRefTargetCB&gt;() {
     *         public void specify(WhiteRefTargetCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteRefTargetBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteRefTarget, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefTarget The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteRefTarget whiteRefTarget, UpdateOption<WhiteRefTargetCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteRefTarget, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteRefTarget The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteRefTarget whiteRefTarget, InsertOption<WhiteRefTargetCB> insertOption, UpdateOption<WhiteRefTargetCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteRefTarget, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteRefTarget The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteRefTarget whiteRefTarget, DeleteOption<WhiteRefTargetCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteRefTarget, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteRefTarget> whiteRefTargetList, InsertOption<WhiteRefTargetCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteRefTargetList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteRefTarget> whiteRefTargetList, UpdateOption<WhiteRefTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteRefTargetList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteRefTarget> whiteRefTargetList, DeleteOption<WhiteRefTargetCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteRefTargetList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> setupper, InsertOption<WhiteRefTargetCB> option) {
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
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setPK...(value);</span>
     * whiteRefTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setVersionNo(value);</span>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteRefTargetCB&gt; option = new UpdateOption&lt;WhiteRefTargetCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void specify(WhiteRefTargetCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteRefTargetBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteRefTarget, cb, option);
     * </pre>
     * @param whiteRefTarget The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteRefTarget whiteRefTarget, WhiteRefTargetCB cb, UpdateOption<WhiteRefTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteRefTarget, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteRefTargetCB cb, DeleteOption<WhiteRefTargetCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteRefTargetBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteRefTarget> typeOfSelectedEntity() { return WhiteRefTarget.class; }
    protected WhiteRefTarget downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteRefTarget.class); }
    protected WhiteRefTargetCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteRefTargetCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteRefTarget> downcast(List<? extends Entity> ls) { return (List<WhiteRefTarget>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteRefTargetCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteRefTargetCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteRefTargetCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteRefTargetCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteRefTargetCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteRefTargetCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB>)sp; }
}
