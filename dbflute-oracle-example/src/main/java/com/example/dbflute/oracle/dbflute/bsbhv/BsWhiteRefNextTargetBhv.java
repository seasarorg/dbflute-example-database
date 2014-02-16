package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of WHITE_REF_NEXT_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_NEXT_TARGET_ID
 *
 * [column]
 *     REF_NEXT_TARGET_ID, NEXT_TARGET_CODE
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
 *     NEXT_SCHEMA_PRODUCT_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     nextSchemaProductStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefNextTargetBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_REF_NEXT_TARGET"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteRefNextTargetDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteRefNextTargetDbm getMyDBMeta() { return WhiteRefNextTargetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteRefNextTarget newMyEntity() { return new WhiteRefNextTarget(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteRefNextTargetCB newMyConditionBean() { return new WhiteRefNextTargetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * int count = whiteRefNextTargetBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteRefNextTargetCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteRefNextTargetCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteRefNextTargetCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextTarget whiteRefNextTarget = whiteRefNextTargetBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteRefNextTarget != null) {
     *     ... = whiteRefNextTarget.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectEntity(WhiteRefNextTargetCB cb) {
        return doSelectEntity(cb, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectEntity(final WhiteRefNextTargetCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteRefNextTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextTarget whiteRefNextTarget = whiteRefNextTargetBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteRefNextTarget.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectEntityWithDeletedCheck(WhiteRefNextTargetCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectEntityWithDeletedCheck(final WhiteRefNextTargetCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteRefNextTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refNextTargetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectByPKValue(Long refNextTargetId) {
        return doSelectByPKValue(refNextTargetId, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectByPKValue(Long refNextTargetId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(refNextTargetId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refNextTargetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextTarget selectByPKValueWithDeletedCheck(Long refNextTargetId) {
        return doSelectByPKValueWithDeletedCheck(refNextTargetId, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> ENTITY doSelectByPKValueWithDeletedCheck(Long refNextTargetId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refNextTargetId), entityType);
    }

    private WhiteRefNextTargetCB buildPKCB(Long refNextTargetId) {
        assertObjectNotNull("refNextTargetId", refNextTargetId);
        WhiteRefNextTargetCB cb = newMyConditionBean();
        cb.query().setRefNextTargetId_Equal(refNextTargetId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteRefNextTarget&gt; whiteRefNextTargetList = whiteRefNextTargetBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteRefNextTarget whiteRefNextTarget : whiteRefNextTargetList) {
     *     ... = whiteRefNextTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteRefNextTarget> selectList(WhiteRefNextTargetCB cb) {
        return doSelectList(cb, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> ListResultBean<ENTITY> doSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteRefNextTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteRefNextTarget&gt; page = whiteRefNextTargetBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteRefNextTarget whiteRefNextTarget : page) {
     *     ... = whiteRefNextTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteRefNextTarget> selectPage(WhiteRefNextTargetCB cb) {
        return doSelectPage(cb, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> PagingResultBean<ENTITY> doSelectPage(WhiteRefNextTargetCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteRefNextTargetCB>() {
            public int callbackSelectCount(WhiteRefNextTargetCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteRefNextTarget&gt;() {
     *     public void handle(WhiteRefNextTarget entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteRefNextTarget. (NotNull)
     */
    public void selectCursor(WhiteRefNextTargetCB cb, EntityRowHandler<WhiteRefNextTarget> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteRefNextTarget.class);
    }

    protected <ENTITY extends WhiteRefNextTarget> void doSelectCursor(WhiteRefNextTargetCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteRefNextTargetCB>() {
            public void callbackSelectCursor(WhiteRefNextTargetCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteRefNextTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteRefNextTargetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteRefNextTargetCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteRefNextTargetCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextSchemaProductStatus'.
     * @param whiteRefNextTargetList The list of whiteRefNextTarget. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextSchemaProductStatus> pulloutNextSchemaProductStatus(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return helpPulloutInternally(whiteRefNextTargetList, new InternalPulloutCallback<WhiteRefNextTarget, NextSchemaProductStatus>() {
            public NextSchemaProductStatus getFr(WhiteRefNextTarget et) { return et.getNextSchemaProductStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(NextSchemaProductStatus et, List<WhiteRefNextTarget> ls)
            { et.setWhiteRefNextTargetList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refNextTargetId.
     * @param whiteRefNextTargetList The list of whiteRefNextTarget. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefNextTargetIdList(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return helpExtractListInternally(whiteRefNextTargetList, new InternalExtractCallback<WhiteRefNextTarget, Long>() {
            public Long getCV(WhiteRefNextTarget et) { return et.getRefNextTargetId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextTarget.setFoo...(value);
     * whiteRefNextTarget.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">insert</span>(whiteRefNextTarget);
     * ... = whiteRefNextTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteRefNextTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteRefNextTarget whiteRefNextTarget) {
        doInsert(whiteRefNextTarget, null);
    }

    protected void doInsert(WhiteRefNextTarget whiteRefNextTarget, InsertOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTarget", whiteRefNextTarget);
        prepareInsertOption(op);
        delegateInsert(whiteRefNextTarget, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteRefNextTargetCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextTargetBhv.<span style="color: #FD4747">update</span>(whiteRefNextTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteRefNextTarget whiteRefNextTarget) {
        doUpdate(whiteRefNextTarget, null);
    }

    protected void doUpdate(WhiteRefNextTarget whiteRefNextTarget, final UpdateOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTarget", whiteRefNextTarget);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteRefNextTarget, new InternalUpdateCallback<WhiteRefNextTarget>() {
            public int callbackDelegateUpdate(WhiteRefNextTarget et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteRefNextTargetCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteRefNextTargetCB createCBForVaryingUpdate() {
        WhiteRefNextTargetCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteRefNextTargetCB createCBForSpecifiedUpdate() {
        WhiteRefNextTargetCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteRefNextTarget The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteRefNextTarget whiteRefNextTarget) {
        doInesrtOrUpdate(whiteRefNextTarget, null, null);
    }

    protected void doInesrtOrUpdate(WhiteRefNextTarget whiteRefNextTarget, final InsertOption<WhiteRefNextTargetCB> iop, final UpdateOption<WhiteRefNextTargetCB> uop) {
        helpInsertOrUpdateInternally(whiteRefNextTarget, new InternalInsertOrUpdateCallback<WhiteRefNextTarget, WhiteRefNextTargetCB>() {
            public void callbackInsert(WhiteRefNextTarget et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteRefNextTarget et) { doUpdate(et, uop); }
            public WhiteRefNextTargetCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteRefNextTargetCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteRefNextTargetCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteRefNextTargetCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextTargetBhv.<span style="color: #FD4747">delete</span>(whiteRefNextTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteRefNextTarget whiteRefNextTarget) {
        doDelete(whiteRefNextTarget, null);
    }

    protected void doDelete(WhiteRefNextTarget whiteRefNextTarget, final DeleteOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTarget", whiteRefNextTarget);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteRefNextTarget, new InternalDeleteCallback<WhiteRefNextTarget>() {
            public int callbackDelegateDelete(WhiteRefNextTarget et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteRefNextTargetCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     *     whiteRefNextTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefNextTarget.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteRefNextTargetList.add(whiteRefNextTarget);
     * }
     * whiteRefNextTargetBhv.<span style="color: #FD4747">batchInsert</span>(whiteRefNextTargetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        InsertOption<WhiteRefNextTargetCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteRefNextTargetList, op);
    }

    protected int[] doBatchInsert(List<WhiteRefNextTarget> whiteRefNextTargetList, InsertOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTargetList", whiteRefNextTargetList);
        prepareBatchInsertOption(whiteRefNextTargetList, op);
        return delegateBatchInsert(whiteRefNextTargetList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteRefNextTarget> whiteRefNextTargetList, InsertOption<WhiteRefNextTargetCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteRefNextTargetList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     *     whiteRefNextTarget.setFooName("foo");
     *     if (...) {
     *         whiteRefNextTarget.setFooPrice(123);
     *     } else {
     *         whiteRefNextTarget.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteRefNextTarget.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteRefNextTargetList.add(whiteRefNextTarget);
     * }
     * whiteRefNextTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefNextTargetList);
     * </pre>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        UpdateOption<WhiteRefNextTargetCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteRefNextTargetList, op);
    }

    protected int[] doBatchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList, UpdateOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTargetList", whiteRefNextTargetList);
        prepareBatchUpdateOption(whiteRefNextTargetList, op);
        return delegateBatchUpdate(whiteRefNextTargetList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteRefNextTarget> whiteRefNextTargetList, UpdateOption<WhiteRefNextTargetCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteRefNextTargetList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefNextTargetList, new SpecifyQuery<WhiteRefNextTargetCB>() {
     *     public void specify(WhiteRefNextTargetCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefNextTargetList, new SpecifyQuery<WhiteRefNextTargetCB>() {
     *     public void specify(WhiteRefNextTargetCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList, SpecifyQuery<WhiteRefNextTargetCB> updateColumnSpec) {
        return doBatchUpdate(whiteRefNextTargetList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        return doBatchDelete(whiteRefNextTargetList, null);
    }

    protected int[] doBatchDelete(List<WhiteRefNextTarget> whiteRefNextTargetList, DeleteOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTargetList", whiteRefNextTargetList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteRefNextTargetList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteRefNextTarget, WhiteRefNextTargetCB&gt;() {
     *     public ConditionBean setup(whiteRefNextTarget entity, WhiteRefNextTargetCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> sp, InsertOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteRefNextTarget e = new WhiteRefNextTarget();
        WhiteRefNextTargetCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteRefNextTargetCB createCBForQueryInsert() {
        WhiteRefNextTargetCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setPK...(value);</span>
     * whiteRefNextTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setVersionNo(value);</span>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #FD4747">queryUpdate</span>(whiteRefNextTarget, cb);
     * </pre>
     * @param whiteRefNextTarget The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteRefNextTarget whiteRefNextTarget, WhiteRefNextTargetCB cb) {
        return doQueryUpdate(whiteRefNextTarget, cb, null);
    }

    protected int doQueryUpdate(WhiteRefNextTarget whiteRefNextTarget, WhiteRefNextTargetCB cb, UpdateOption<WhiteRefNextTargetCB> op) {
        assertObjectNotNull("whiteRefNextTarget", whiteRefNextTarget); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteRefNextTarget, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteRefNextTargetCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteRefNextTargetCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefNextTargetBhv.<span style="color: #FD4747">queryDelete</span>(whiteRefNextTarget, cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteRefNextTargetCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteRefNextTargetCB cb, DeleteOption<WhiteRefNextTargetCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteRefNextTargetCB)cb); }
        else { return varyingQueryDelete((WhiteRefNextTargetCB)cb, downcast(op)); }
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
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextTarget.setFoo...(value);
     * whiteRefNextTarget.setBar...(value);
     * InsertOption<WhiteRefNextTargetCB> option = new InsertOption<WhiteRefNextTargetCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteRefNextTargetBhv.<span style="color: #FD4747">varyingInsert</span>(whiteRefNextTarget, option);
     * ... = whiteRefNextTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteRefNextTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteRefNextTarget whiteRefNextTarget, InsertOption<WhiteRefNextTargetCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteRefNextTarget, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * whiteRefNextTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteRefNextTargetCB&gt; option = new UpdateOption&lt;WhiteRefNextTargetCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteRefNextTargetCB&gt;() {
     *         public void specify(WhiteRefNextTargetCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteRefNextTargetBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteRefNextTarget, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteRefNextTarget whiteRefNextTarget, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteRefNextTarget, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteRefNextTarget The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteRefNextTarget whiteRefNextTarget, InsertOption<WhiteRefNextTargetCB> insertOption, UpdateOption<WhiteRefNextTargetCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteRefNextTarget, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteRefNextTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteRefNextTarget whiteRefNextTarget, DeleteOption<WhiteRefNextTargetCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteRefNextTarget, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteRefNextTarget> whiteRefNextTargetList, InsertOption<WhiteRefNextTargetCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteRefNextTargetList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteRefNextTarget> whiteRefNextTargetList, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteRefNextTargetList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteRefNextTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteRefNextTarget> whiteRefNextTargetList, DeleteOption<WhiteRefNextTargetCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteRefNextTargetList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> setupper, InsertOption<WhiteRefNextTargetCB> option) {
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
     * WhiteRefNextTarget whiteRefNextTarget = new WhiteRefNextTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setPK...(value);</span>
     * whiteRefNextTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextTarget.setVersionNo(value);</span>
     * WhiteRefNextTargetCB cb = new WhiteRefNextTargetCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteRefNextTargetCB&gt; option = new UpdateOption&lt;WhiteRefNextTargetCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteRefNextTargetCB&gt;() {
     *     public void specify(WhiteRefNextTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteRefNextTargetBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteRefNextTarget, cb, option);
     * </pre>
     * @param whiteRefNextTarget The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteRefNextTarget whiteRefNextTarget, WhiteRefNextTargetCB cb, UpdateOption<WhiteRefNextTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteRefNextTarget, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteRefNextTarget. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteRefNextTargetCB cb, DeleteOption<WhiteRefNextTargetCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteRefNextTargetBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteRefNextTargetCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteRefNextTargetCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteRefNextTarget> void delegateSelectCursor(WhiteRefNextTargetCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteRefNextTarget> List<ENTITY> delegateSelectList(WhiteRefNextTargetCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteRefNextTarget et, InsertOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteRefNextTarget et, UpdateOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteRefNextTarget et, UpdateOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteRefNextTarget et, DeleteOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteRefNextTarget et, DeleteOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteRefNextTarget> ls, InsertOption<WhiteRefNextTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteRefNextTarget> ls, UpdateOption<WhiteRefNextTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteRefNextTarget> ls, UpdateOption<WhiteRefNextTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteRefNextTarget> ls, DeleteOption<WhiteRefNextTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteRefNextTarget> ls, DeleteOption<WhiteRefNextTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteRefNextTarget et, WhiteRefNextTargetCB inCB, ConditionBean resCB, InsertOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteRefNextTarget et, WhiteRefNextTargetCB cb, UpdateOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteRefNextTargetCB cb, DeleteOption<WhiteRefNextTargetCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteRefNextTarget downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteRefNextTarget.class);
    }

    protected WhiteRefNextTargetCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteRefNextTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteRefNextTarget> downcast(List<? extends Entity> ls) {
        return (List<WhiteRefNextTarget>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteRefNextTargetCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteRefNextTargetCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteRefNextTargetCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteRefNextTargetCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteRefNextTargetCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteRefNextTargetCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteRefNextTarget, WhiteRefNextTargetCB>)sp;
    }
}
