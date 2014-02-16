package com.example.dbflute.db2.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The behavior of SUMMARY_MEMBER_PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, ALLSUM_PURCHASE_PRICE, LATEST_PURCHASE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
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
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryMemberPurchaseBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SUMMARY_MEMBER_PURCHASE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SummaryMemberPurchaseDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SummaryMemberPurchaseDbm getMyDBMeta() { return SummaryMemberPurchaseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SummaryMemberPurchase newMyEntity() { return new SummaryMemberPurchase(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SummaryMemberPurchaseCB newMyConditionBean() { return new SummaryMemberPurchaseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * int count = summaryMemberPurchaseBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SummaryMemberPurchaseCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SummaryMemberPurchaseCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SummaryMemberPurchaseCB cb) { // called by selectPage(cb)
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
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * SummaryMemberPurchase summaryMemberPurchase = summaryMemberPurchaseBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (summaryMemberPurchase != null) {
     *     ... = summaryMemberPurchase.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryMemberPurchase selectEntity(SummaryMemberPurchaseCB cb) {
        return doSelectEntity(cb, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> ENTITY doSelectEntity(final SummaryMemberPurchaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SummaryMemberPurchaseCB>() {
            public List<ENTITY> callbackSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * SummaryMemberPurchase summaryMemberPurchase = summaryMemberPurchaseBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = summaryMemberPurchase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryMemberPurchase selectEntityWithDeletedCheck(SummaryMemberPurchaseCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> ENTITY doSelectEntityWithDeletedCheck(final SummaryMemberPurchaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SummaryMemberPurchaseCB>() {
            public List<ENTITY> callbackSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryMemberPurchase selectByPKValue(Integer memberId) {
        return doSelectByPKValue(memberId, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> ENTITY doSelectByPKValue(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryMemberPurchase selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private SummaryMemberPurchaseCB buildPKCB(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        SummaryMemberPurchaseCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SummaryMemberPurchase&gt; summaryMemberPurchaseList = summaryMemberPurchaseBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SummaryMemberPurchase summaryMemberPurchase : summaryMemberPurchaseList) {
     *     ... = summaryMemberPurchase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SummaryMemberPurchase> selectList(SummaryMemberPurchaseCB cb) {
        return doSelectList(cb, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> ListResultBean<ENTITY> doSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SummaryMemberPurchaseCB>() {
            public List<ENTITY> callbackSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SummaryMemberPurchase&gt; page = summaryMemberPurchaseBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SummaryMemberPurchase summaryMemberPurchase : page) {
     *     ... = summaryMemberPurchase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SummaryMemberPurchase> selectPage(SummaryMemberPurchaseCB cb) {
        return doSelectPage(cb, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> PagingResultBean<ENTITY> doSelectPage(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SummaryMemberPurchaseCB>() {
            public int callbackSelectCount(SummaryMemberPurchaseCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SummaryMemberPurchase&gt;() {
     *     public void handle(SummaryMemberPurchase entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @param entityRowHandler The handler of entity row of SummaryMemberPurchase. (NotNull)
     */
    public void selectCursor(SummaryMemberPurchaseCB cb, EntityRowHandler<SummaryMemberPurchase> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SummaryMemberPurchase.class);
    }

    protected <ENTITY extends SummaryMemberPurchase> void doSelectCursor(SummaryMemberPurchaseCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SummaryMemberPurchaseCB>() {
            public void callbackSelectCursor(SummaryMemberPurchaseCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SummaryMemberPurchaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SummaryMemberPurchaseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SummaryMemberPurchaseCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SummaryMemberPurchaseCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param summaryMemberPurchaseList The list of summaryMemberPurchase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<SummaryMemberPurchase> summaryMemberPurchaseList) {
        return helpExtractListInternally(summaryMemberPurchaseList, new InternalExtractCallback<SummaryMemberPurchase, Integer>() {
            public Integer getCV(SummaryMemberPurchase et) { return et.getMemberId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * summaryMemberPurchase.setFoo...(value);
     * summaryMemberPurchase.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.set...;</span>
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">insert</span>(summaryMemberPurchase);
     * ... = summaryMemberPurchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param summaryMemberPurchase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SummaryMemberPurchase summaryMemberPurchase) {
        doInsert(summaryMemberPurchase, null);
    }

    protected void doInsert(SummaryMemberPurchase summaryMemberPurchase, InsertOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchase", summaryMemberPurchase);
        prepareInsertOption(op);
        delegateInsert(summaryMemberPurchase, op);
    }

    protected void prepareInsertOption(InsertOption<SummaryMemberPurchaseCB> op) {
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
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * summaryMemberPurchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * summaryMemberPurchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryMemberPurchase.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     summaryMemberPurchaseBhv.<span style="color: #FD4747">update</span>(summaryMemberPurchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryMemberPurchase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SummaryMemberPurchase summaryMemberPurchase) {
        doUpdate(summaryMemberPurchase, null);
    }

    protected void doUpdate(SummaryMemberPurchase summaryMemberPurchase, final UpdateOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchase", summaryMemberPurchase);
        prepareUpdateOption(op);
        helpUpdateInternally(summaryMemberPurchase, new InternalUpdateCallback<SummaryMemberPurchase>() {
            public int callbackDelegateUpdate(SummaryMemberPurchase et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SummaryMemberPurchaseCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SummaryMemberPurchaseCB createCBForVaryingUpdate() {
        SummaryMemberPurchaseCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SummaryMemberPurchaseCB createCBForSpecifiedUpdate() {
        SummaryMemberPurchaseCB cb = newMyConditionBean();
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
     * @param summaryMemberPurchase The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SummaryMemberPurchase summaryMemberPurchase) {
        doInesrtOrUpdate(summaryMemberPurchase, null, null);
    }

    protected void doInesrtOrUpdate(SummaryMemberPurchase summaryMemberPurchase, final InsertOption<SummaryMemberPurchaseCB> iop, final UpdateOption<SummaryMemberPurchaseCB> uop) {
        helpInsertOrUpdateInternally(summaryMemberPurchase, new InternalInsertOrUpdateCallback<SummaryMemberPurchase, SummaryMemberPurchaseCB>() {
            public void callbackInsert(SummaryMemberPurchase et) { doInsert(et, iop); }
            public void callbackUpdate(SummaryMemberPurchase et) { doUpdate(et, uop); }
            public SummaryMemberPurchaseCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SummaryMemberPurchaseCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SummaryMemberPurchaseCB>();
            uop = uop != null ? uop : new UpdateOption<SummaryMemberPurchaseCB>();
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
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * summaryMemberPurchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryMemberPurchase.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     summaryMemberPurchaseBhv.<span style="color: #FD4747">delete</span>(summaryMemberPurchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryMemberPurchase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SummaryMemberPurchase summaryMemberPurchase) {
        doDelete(summaryMemberPurchase, null);
    }

    protected void doDelete(SummaryMemberPurchase summaryMemberPurchase, final DeleteOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchase", summaryMemberPurchase);
        prepareDeleteOption(op);
        helpDeleteInternally(summaryMemberPurchase, new InternalDeleteCallback<SummaryMemberPurchase>() {
            public int callbackDelegateDelete(SummaryMemberPurchase et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SummaryMemberPurchaseCB> op) {
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
     *     SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     *     summaryMemberPurchase.setFooName("foo");
     *     if (...) {
     *         summaryMemberPurchase.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     summaryMemberPurchaseList.add(summaryMemberPurchase);
     * }
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">batchInsert</span>(summaryMemberPurchaseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SummaryMemberPurchase> summaryMemberPurchaseList) {
        InsertOption<SummaryMemberPurchaseCB> op = createInsertUpdateOption();
        return doBatchInsert(summaryMemberPurchaseList, op);
    }

    protected int[] doBatchInsert(List<SummaryMemberPurchase> summaryMemberPurchaseList, InsertOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchaseList", summaryMemberPurchaseList);
        prepareBatchInsertOption(summaryMemberPurchaseList, op);
        return delegateBatchInsert(summaryMemberPurchaseList, op);
    }

    protected void prepareBatchInsertOption(List<SummaryMemberPurchase> summaryMemberPurchaseList, InsertOption<SummaryMemberPurchaseCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(summaryMemberPurchaseList);
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
     *     SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     *     summaryMemberPurchase.setFooName("foo");
     *     if (...) {
     *         summaryMemberPurchase.setFooPrice(123);
     *     } else {
     *         summaryMemberPurchase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//summaryMemberPurchase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     summaryMemberPurchaseList.add(summaryMemberPurchase);
     * }
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">batchUpdate</span>(summaryMemberPurchaseList);
     * </pre>
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SummaryMemberPurchase> summaryMemberPurchaseList) {
        UpdateOption<SummaryMemberPurchaseCB> op = createPlainUpdateOption();
        return doBatchUpdate(summaryMemberPurchaseList, op);
    }

    protected int[] doBatchUpdate(List<SummaryMemberPurchase> summaryMemberPurchaseList, UpdateOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchaseList", summaryMemberPurchaseList);
        prepareBatchUpdateOption(summaryMemberPurchaseList, op);
        return delegateBatchUpdate(summaryMemberPurchaseList, op);
    }

    protected void prepareBatchUpdateOption(List<SummaryMemberPurchase> summaryMemberPurchaseList, UpdateOption<SummaryMemberPurchaseCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(summaryMemberPurchaseList);
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
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">batchUpdate</span>(summaryMemberPurchaseList, new SpecifyQuery<SummaryMemberPurchaseCB>() {
     *     public void specify(SummaryMemberPurchaseCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">batchUpdate</span>(summaryMemberPurchaseList, new SpecifyQuery<SummaryMemberPurchaseCB>() {
     *     public void specify(SummaryMemberPurchaseCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SummaryMemberPurchase> summaryMemberPurchaseList, SpecifyQuery<SummaryMemberPurchaseCB> updateColumnSpec) {
        return doBatchUpdate(summaryMemberPurchaseList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SummaryMemberPurchase> summaryMemberPurchaseList) {
        return doBatchDelete(summaryMemberPurchaseList, null);
    }

    protected int[] doBatchDelete(List<SummaryMemberPurchase> summaryMemberPurchaseList, DeleteOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchaseList", summaryMemberPurchaseList);
        prepareDeleteOption(op);
        return delegateBatchDelete(summaryMemberPurchaseList, op);
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
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SummaryMemberPurchase, SummaryMemberPurchaseCB&gt;() {
     *     public ConditionBean setup(summaryMemberPurchase entity, SummaryMemberPurchaseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SummaryMemberPurchase, SummaryMemberPurchaseCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SummaryMemberPurchase, SummaryMemberPurchaseCB> sp, InsertOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SummaryMemberPurchase e = new SummaryMemberPurchase();
        SummaryMemberPurchaseCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SummaryMemberPurchaseCB createCBForQueryInsert() {
        SummaryMemberPurchaseCB cb = newMyConditionBean();
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
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setPK...(value);</span>
     * summaryMemberPurchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setVersionNo(value);</span>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">queryUpdate</span>(summaryMemberPurchase, cb);
     * </pre>
     * @param summaryMemberPurchase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SummaryMemberPurchase summaryMemberPurchase, SummaryMemberPurchaseCB cb) {
        return doQueryUpdate(summaryMemberPurchase, cb, null);
    }

    protected int doQueryUpdate(SummaryMemberPurchase summaryMemberPurchase, SummaryMemberPurchaseCB cb, UpdateOption<SummaryMemberPurchaseCB> op) {
        assertObjectNotNull("summaryMemberPurchase", summaryMemberPurchase); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(summaryMemberPurchase, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SummaryMemberPurchaseCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SummaryMemberPurchaseCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">queryDelete</span>(summaryMemberPurchase, cb);
     * </pre>
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SummaryMemberPurchaseCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SummaryMemberPurchaseCB cb, DeleteOption<SummaryMemberPurchaseCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SummaryMemberPurchaseCB)cb); }
        else { return varyingQueryDelete((SummaryMemberPurchaseCB)cb, downcast(op)); }
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
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * summaryMemberPurchase.setFoo...(value);
     * summaryMemberPurchase.setBar...(value);
     * InsertOption<SummaryMemberPurchaseCB> option = new InsertOption<SummaryMemberPurchaseCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">varyingInsert</span>(summaryMemberPurchase, option);
     * ... = summaryMemberPurchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param summaryMemberPurchase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SummaryMemberPurchase summaryMemberPurchase, InsertOption<SummaryMemberPurchaseCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(summaryMemberPurchase, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * summaryMemberPurchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * summaryMemberPurchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryMemberPurchase.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SummaryMemberPurchaseCB&gt; option = new UpdateOption&lt;SummaryMemberPurchaseCB&gt;();
     *     option.self(new SpecifyQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *         public void specify(SummaryMemberPurchaseCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     summaryMemberPurchaseBhv.<span style="color: #FD4747">varyingUpdate</span>(summaryMemberPurchase, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryMemberPurchase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SummaryMemberPurchase summaryMemberPurchase, UpdateOption<SummaryMemberPurchaseCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(summaryMemberPurchase, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param summaryMemberPurchase The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SummaryMemberPurchase summaryMemberPurchase, InsertOption<SummaryMemberPurchaseCB> insertOption, UpdateOption<SummaryMemberPurchaseCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(summaryMemberPurchase, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param summaryMemberPurchase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SummaryMemberPurchase summaryMemberPurchase, DeleteOption<SummaryMemberPurchaseCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(summaryMemberPurchase, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SummaryMemberPurchase> summaryMemberPurchaseList, InsertOption<SummaryMemberPurchaseCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(summaryMemberPurchaseList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SummaryMemberPurchase> summaryMemberPurchaseList, UpdateOption<SummaryMemberPurchaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(summaryMemberPurchaseList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param summaryMemberPurchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SummaryMemberPurchase> summaryMemberPurchaseList, DeleteOption<SummaryMemberPurchaseCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(summaryMemberPurchaseList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SummaryMemberPurchase, SummaryMemberPurchaseCB> setupper, InsertOption<SummaryMemberPurchaseCB> option) {
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
     * SummaryMemberPurchase summaryMemberPurchase = new SummaryMemberPurchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setPK...(value);</span>
     * summaryMemberPurchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//summaryMemberPurchase.setVersionNo(value);</span>
     * SummaryMemberPurchaseCB cb = new SummaryMemberPurchaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SummaryMemberPurchaseCB&gt; option = new UpdateOption&lt;SummaryMemberPurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;SummaryMemberPurchaseCB&gt;() {
     *     public void specify(SummaryMemberPurchaseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * summaryMemberPurchaseBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(summaryMemberPurchase, cb, option);
     * </pre>
     * @param summaryMemberPurchase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SummaryMemberPurchase summaryMemberPurchase, SummaryMemberPurchaseCB cb, UpdateOption<SummaryMemberPurchaseCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(summaryMemberPurchase, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SummaryMemberPurchase. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SummaryMemberPurchaseCB cb, DeleteOption<SummaryMemberPurchaseCB> option) {
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
    public OutsideSqlBasicExecutor<SummaryMemberPurchaseBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SummaryMemberPurchaseCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SummaryMemberPurchaseCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SummaryMemberPurchase> void delegateSelectCursor(SummaryMemberPurchaseCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SummaryMemberPurchase> List<ENTITY> delegateSelectList(SummaryMemberPurchaseCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SummaryMemberPurchase et, InsertOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SummaryMemberPurchase et, UpdateOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SummaryMemberPurchase et, UpdateOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SummaryMemberPurchase et, DeleteOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SummaryMemberPurchase et, DeleteOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SummaryMemberPurchase> ls, InsertOption<SummaryMemberPurchaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SummaryMemberPurchase> ls, UpdateOption<SummaryMemberPurchaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SummaryMemberPurchase> ls, UpdateOption<SummaryMemberPurchaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SummaryMemberPurchase> ls, DeleteOption<SummaryMemberPurchaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SummaryMemberPurchase> ls, DeleteOption<SummaryMemberPurchaseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SummaryMemberPurchase et, SummaryMemberPurchaseCB inCB, ConditionBean resCB, InsertOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SummaryMemberPurchase et, SummaryMemberPurchaseCB cb, UpdateOption<SummaryMemberPurchaseCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SummaryMemberPurchaseCB cb, DeleteOption<SummaryMemberPurchaseCB> op)
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
    protected SummaryMemberPurchase downcast(Entity et) {
        return helpEntityDowncastInternally(et, SummaryMemberPurchase.class);
    }

    protected SummaryMemberPurchaseCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SummaryMemberPurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SummaryMemberPurchase> downcast(List<? extends Entity> ls) {
        return (List<SummaryMemberPurchase>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SummaryMemberPurchaseCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SummaryMemberPurchaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SummaryMemberPurchaseCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SummaryMemberPurchaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SummaryMemberPurchaseCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SummaryMemberPurchaseCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SummaryMemberPurchase, SummaryMemberPurchaseCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SummaryMemberPurchase, SummaryMemberPurchaseCB>)sp;
    }
}
