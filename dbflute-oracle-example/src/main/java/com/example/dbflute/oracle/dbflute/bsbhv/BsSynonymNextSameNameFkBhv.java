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
 * The behavior of SYNONYM_NEXT_SAME_NAME_FK as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     REF_ID
 *
 * [column]
 *     REF_ID, REF_NAME, SAME_NAME_ID
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
public abstract class BsSynonymNextSameNameFkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_SAME_NAME_FK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return SynonymNextSameNameFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextSameNameFkDbm getMyDBMeta() { return SynonymNextSameNameFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymNextSameNameFk newEntity() { return new SynonymNextSameNameFk(); }

    /** {@inheritDoc} */
    public SynonymNextSameNameFkCB newConditionBean() { return new SynonymNextSameNameFkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextSameNameFk newMyEntity() { return new SynonymNextSameNameFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextSameNameFkCB newMyConditionBean() { return new SynonymNextSameNameFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextSameNameFkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextSameNameFkCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(SynonymNextSameNameFkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextSameNameFkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextSameNameFkCB cb) { // called by selectPage(cb)
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
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * SynonymNextSameNameFk synonymNextSameNameFk = synonymNextSameNameFkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextSameNameFk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextSameNameFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectEntity(SynonymNextSameNameFkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymNextSameNameFk facadeSelectEntity(SynonymNextSameNameFkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectEntity(SynonymNextSameNameFkCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends SynonymNextSameNameFk> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextSameNameFkCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * SynonymNextSameNameFk synonymNextSameNameFk = synonymNextSameNameFkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextSameNameFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectEntityWithDeletedCheck(SynonymNextSameNameFkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected SynonymNextSameNameFk facadeSelectEntityWithDeletedCheck(SynonymNextSameNameFkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectEntityWithDeletedCheck(SynonymNextSameNameFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param refId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectByPKValue(Long refId) {
        return facadeSelectByPKValue(refId);
    }

    protected SynonymNextSameNameFk facadeSelectByPKValue(Long refId) {
        return doSelectByPK(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectByPK(Long refId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(refId), tp);
    }

    protected <ENTITY extends SynonymNextSameNameFk> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(refId, tp), refId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectByPKValueWithDeletedCheck(Long refId) {
        return doSelectByPKWithDeletedCheck(refId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectByPKWithDeletedCheck(Long refId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refId), tp);
    }

    protected SynonymNextSameNameFkCB xprepareCBAsPK(Long refId) {
        assertObjectNotNull("refId", refId);
        return newConditionBean().acceptPK(refId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextSameNameFk&gt; synonymNextSameNameFkList = synonymNextSameNameFkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextSameNameFk synonymNextSameNameFk : synonymNextSameNameFkList) {
     *     ... = synonymNextSameNameFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextSameNameFk> selectList(SynonymNextSameNameFkCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<SynonymNextSameNameFk> facadeSelectList(SynonymNextSameNameFkCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> ListResultBean<ENTITY> doSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> tp) {
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
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextSameNameFk&gt; page = synonymNextSameNameFkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextSameNameFk synonymNextSameNameFk : page) {
     *     ... = synonymNextSameNameFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextSameNameFk> selectPage(SynonymNextSameNameFkCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<SynonymNextSameNameFk> facadeSelectPage(SynonymNextSameNameFkCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> PagingResultBean<ENTITY> doSelectPage(SynonymNextSameNameFkCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextSameNameFk&gt;() {
     *     public void handle(SynonymNextSameNameFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextSameNameFk. (NotNull)
     */
    public void selectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<SynonymNextSameNameFk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<SynonymNextSameNameFk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymNextSameNameFk> void doSelectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextSameNameFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymNextSameNameFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<SynonymNextSameNameFkCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends SynonymNextSameNameFkCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param synonymNextSameNameFkList The entity list of synonymNextSameNameFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymNextSameNameFk> synonymNextSameNameFkList, ReferrerLoaderHandler<LoaderOfSynonymNextSameNameFk> handler) {
        xassLRArg(synonymNextSameNameFkList, handler);
        handler.handle(new LoaderOfSynonymNextSameNameFk().ready(synonymNextSameNameFkList, _behaviorSelector));
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
     * @param synonymNextSameNameFk The entity of synonymNextSameNameFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymNextSameNameFk synonymNextSameNameFk, ReferrerLoaderHandler<LoaderOfSynonymNextSameNameFk> handler) {
        xassLRArg(synonymNextSameNameFk, handler);
        handler.handle(new LoaderOfSynonymNextSameNameFk().ready(xnewLRAryLs(synonymNextSameNameFk), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param synonymNextSameNameFkList The list of synonymNextSameNameFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefIdList(List<SynonymNextSameNameFk> synonymNextSameNameFkList)
    { return helpExtractListInternally(synonymNextSameNameFkList, "refId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSameNameFk.setFoo...(value);
     * synonymNextSameNameFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.set...;</span>
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">insert</span>(synonymNextSameNameFk);
     * ... = synonymNextSameNameFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextSameNameFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextSameNameFk synonymNextSameNameFk) {
        doInsert(synonymNextSameNameFk, null);
    }

    protected void doInsert(SynonymNextSameNameFk et, InsertOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFk", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextSameNameFkCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * synonymNextSameNameFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSameNameFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSameNameFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSameNameFkBhv.<span style="color: #DD4747">update</span>(synonymNextSameNameFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSameNameFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymNextSameNameFk synonymNextSameNameFk) {
        doUpdate(synonymNextSameNameFk, null);
    }

    protected void doUpdate(SynonymNextSameNameFk et, UpdateOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFk", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextSameNameFkCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected SynonymNextSameNameFkCB createCBForVaryingUpdate()
    { SynonymNextSameNameFkCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected SynonymNextSameNameFkCB createCBForSpecifiedUpdate()
    { SynonymNextSameNameFkCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextSameNameFk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextSameNameFk synonymNextSameNameFk) {
        doInsertOrUpdate(synonymNextSameNameFk, null, null);
    }

    protected void doInsertOrUpdate(SynonymNextSameNameFk et, InsertOption<SynonymNextSameNameFkCB> iop, UpdateOption<SynonymNextSameNameFkCB> uop) {
        assertObjectNotNull("synonymNextSameNameFk", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * synonymNextSameNameFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSameNameFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSameNameFkBhv.<span style="color: #DD4747">delete</span>(synonymNextSameNameFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSameNameFk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextSameNameFk synonymNextSameNameFk) {
        doDelete(synonymNextSameNameFk, null);
    }

    protected void doDelete(SynonymNextSameNameFk et, final DeleteOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFk", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextSameNameFkCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     *     synonymNextSameNameFk.setFooName("foo");
     *     if (...) {
     *         synonymNextSameNameFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextSameNameFkList.add(synonymNextSameNameFk);
     * }
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextSameNameFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        return doBatchInsert(synonymNextSameNameFkList, null);
    }

    protected int[] doBatchInsert(List<SynonymNextSameNameFk> ls, InsertOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFkList", ls);
        InsertOption<SynonymNextSameNameFkCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<SynonymNextSameNameFk> ls, InsertOption<SynonymNextSameNameFkCB> op) {
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
     *     SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     *     synonymNextSameNameFk.setFooName("foo");
     *     if (...) {
     *         synonymNextSameNameFk.setFooPrice(123);
     *     } else {
     *         synonymNextSameNameFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextSameNameFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextSameNameFkList.add(synonymNextSameNameFk);
     * }
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSameNameFkList);
     * </pre>
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        return doBatchUpdate(synonymNextSameNameFkList, null);
    }

    protected int[] doBatchUpdate(List<SynonymNextSameNameFk> ls, UpdateOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFkList", ls);
        UpdateOption<SynonymNextSameNameFkCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextSameNameFk> ls, UpdateOption<SynonymNextSameNameFkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSameNameFkList, new SpecifyQuery<SynonymNextSameNameFkCB>() {
     *     public void specify(SynonymNextSameNameFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextSameNameFkList, new SpecifyQuery<SynonymNextSameNameFkCB>() {
     *     public void specify(SynonymNextSameNameFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList, SpecifyQuery<SynonymNextSameNameFkCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextSameNameFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        return doBatchDelete(synonymNextSameNameFkList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextSameNameFk> ls, DeleteOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFkList", ls);
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
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextSameNameFk, SynonymNextSameNameFkCB&gt;() {
     *     public ConditionBean setup(synonymNextSameNameFk entity, SynonymNextSameNameFkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> sp, InsertOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        SynonymNextSameNameFk et = newEntity(); SynonymNextSameNameFkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected SynonymNextSameNameFkCB createCBForQueryInsert()
    { SynonymNextSameNameFkCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setPK...(value);</span>
     * synonymNextSameNameFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setVersionNo(value);</span>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextSameNameFk, cb);
     * </pre>
     * @param synonymNextSameNameFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextSameNameFk synonymNextSameNameFk, SynonymNextSameNameFkCB cb) {
        return doQueryUpdate(synonymNextSameNameFk, cb, null);
    }

    protected int doQueryUpdate(SynonymNextSameNameFk et, SynonymNextSameNameFkCB cb, UpdateOption<SynonymNextSameNameFkCB> op) {
        assertObjectNotNull("synonymNextSameNameFk", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextSameNameFk, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextSameNameFkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextSameNameFkCB cb, DeleteOption<SynonymNextSameNameFkCB> op) {
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSameNameFk.setFoo...(value);
     * synonymNextSameNameFk.setBar...(value);
     * InsertOption<SynonymNextSameNameFkCB> option = new InsertOption<SynonymNextSameNameFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextSameNameFk, option);
     * ... = synonymNextSameNameFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextSameNameFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextSameNameFk synonymNextSameNameFk, InsertOption<SynonymNextSameNameFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextSameNameFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * synonymNextSameNameFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSameNameFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymNextSameNameFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextSameNameFkCB&gt; option = new UpdateOption&lt;SynonymNextSameNameFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextSameNameFkCB&gt;() {
     *         public void specify(SynonymNextSameNameFkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextSameNameFkBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextSameNameFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSameNameFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextSameNameFk synonymNextSameNameFk, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextSameNameFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextSameNameFk The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextSameNameFk synonymNextSameNameFk, InsertOption<SynonymNextSameNameFkCB> insertOption, UpdateOption<SynonymNextSameNameFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymNextSameNameFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextSameNameFk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextSameNameFk synonymNextSameNameFk, DeleteOption<SynonymNextSameNameFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextSameNameFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextSameNameFk> synonymNextSameNameFkList, InsertOption<SynonymNextSameNameFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextSameNameFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextSameNameFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextSameNameFk> synonymNextSameNameFkList, DeleteOption<SynonymNextSameNameFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextSameNameFkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> setupper, InsertOption<SynonymNextSameNameFkCB> option) {
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setPK...(value);</span>
     * synonymNextSameNameFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setVersionNo(value);</span>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextSameNameFkCB&gt; option = new UpdateOption&lt;SynonymNextSameNameFkCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextSameNameFkCB&gt;() {
     *     public void specify(SynonymNextSameNameFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextSameNameFkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextSameNameFk, cb, option);
     * </pre>
     * @param synonymNextSameNameFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextSameNameFk synonymNextSameNameFk, SynonymNextSameNameFkCB cb, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextSameNameFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextSameNameFkCB cb, DeleteOption<SynonymNextSameNameFkCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextSameNameFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<SynonymNextSameNameFk> typeOfSelectedEntity() { return SynonymNextSameNameFk.class; }
    protected SynonymNextSameNameFk downcast(Entity et) { return helpEntityDowncastInternally(et, SynonymNextSameNameFk.class); }
    protected SynonymNextSameNameFkCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, SynonymNextSameNameFkCB.class); }
    @SuppressWarnings("unchecked")
    protected List<SynonymNextSameNameFk> downcast(List<? extends Entity> ls) { return (List<SynonymNextSameNameFk>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextSameNameFkCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<SynonymNextSameNameFkCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextSameNameFkCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<SynonymNextSameNameFkCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextSameNameFkCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<SynonymNextSameNameFkCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB>)sp; }
}
