package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of WHITE_SAME_NAME_REF_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_REF_ID
 *
 * [column]
 *     REF_REF_ID, REF_REF_NAME, REF_REF_DATE
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
public abstract class BsWhiteSameNameRefRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_SAME_NAME_REF_REF"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSameNameRefRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSameNameRefRefDbm getMyDBMeta() { return WhiteSameNameRefRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSameNameRefRef newMyEntity() { return new WhiteSameNameRefRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSameNameRefRefCB newMyConditionBean() { return new WhiteSameNameRefRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameRefRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSameNameRefRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSameNameRefRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSameNameRefRefCB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * WhiteSameNameRefRef whiteSameNameRefRef = whiteSameNameRefRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSameNameRefRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSameNameRefRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRefRef selectEntity(WhiteSameNameRefRefCB cb) {
        return doSelectEntity(cb, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> ENTITY doSelectEntity(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteSameNameRefRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteSameNameRefRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * WhiteSameNameRefRef whiteSameNameRefRef = whiteSameNameRefRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameNameRefRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRefRef selectEntityWithDeletedCheck(WhiteSameNameRefRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> ENTITY doSelectEntityWithDeletedCheck(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSameNameRefRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRefRef selectByPKValue(Long refRefId) {
        return doSelectByPKValue(refRefId, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> ENTITY doSelectByPKValue(Long refRefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(refRefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refRefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameNameRefRef selectByPKValueWithDeletedCheck(Long refRefId) {
        return doSelectByPKValueWithDeletedCheck(refRefId, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> ENTITY doSelectByPKValueWithDeletedCheck(Long refRefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refRefId), entityType);
    }

    private WhiteSameNameRefRefCB buildPKCB(Long refRefId) {
        assertObjectNotNull("refRefId", refRefId);
        WhiteSameNameRefRefCB cb = newMyConditionBean();
        cb.query().setRefRefId_Equal(refRefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSameNameRefRef&gt; whiteSameNameRefRefList = whiteSameNameRefRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteSameNameRefRef whiteSameNameRefRef : whiteSameNameRefRefList) {
     *     ... = whiteSameNameRefRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSameNameRefRef> selectList(WhiteSameNameRefRefCB cb) {
        return doSelectList(cb, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> ListResultBean<ENTITY> doSelectList(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteSameNameRefRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameRefRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSameNameRefRef&gt; page = whiteSameNameRefRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSameNameRefRef whiteSameNameRefRef : page) {
     *     ... = whiteSameNameRefRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSameNameRefRef> selectPage(WhiteSameNameRefRefCB cb) {
        return doSelectPage(cb, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> PagingResultBean<ENTITY> doSelectPage(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteSameNameRefRefCB>() {
            public int callbackSelectCount(WhiteSameNameRefRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSameNameRefRef&gt;() {
     *     public void handle(WhiteSameNameRefRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSameNameRefRef. (NotNull)
     */
    public void selectCursor(WhiteSameNameRefRefCB cb, EntityRowHandler<WhiteSameNameRefRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSameNameRefRef.class);
    }

    protected <ENTITY extends WhiteSameNameRefRef> void doSelectCursor(WhiteSameNameRefRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteSameNameRefRefCB>() {
            public void callbackSelectCursor(WhiteSameNameRefRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteSameNameRefRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSameNameRefRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSameNameRefRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSameNameRefRefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteSameNameRefRefCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key refRefId.
     * @param whiteSameNameRefRefList The list of whiteSameNameRefRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefRefIdList(List<WhiteSameNameRefRef> whiteSameNameRefRefList) {
        return helpExtractListInternally(whiteSameNameRefRefList, new InternalExtractCallback<WhiteSameNameRefRef, Long>() {
            public Long getCV(WhiteSameNameRefRef et) { return et.getRefRefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRefRef.setFoo...(value);
     * whiteSameNameRefRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.set...;</span>
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">insert</span>(whiteSameNameRefRef);
     * ... = whiteSameNameRefRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameNameRefRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSameNameRefRef whiteSameNameRefRef) {
        doInsert(whiteSameNameRefRef, null);
    }

    protected void doInsert(WhiteSameNameRefRef whiteSameNameRefRef, InsertOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRef", whiteSameNameRefRef);
        prepareInsertOption(op);
        delegateInsert(whiteSameNameRefRef, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteSameNameRefRefCB> op) {
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
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * whiteSameNameRefRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRefRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRefRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefRefBhv.<span style="color: #DD4747">update</span>(whiteSameNameRefRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRefRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSameNameRefRef whiteSameNameRefRef) {
        doUpdate(whiteSameNameRefRef, null);
    }

    protected void doUpdate(WhiteSameNameRefRef whiteSameNameRefRef, final UpdateOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRef", whiteSameNameRefRef);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteSameNameRefRef, new InternalUpdateCallback<WhiteSameNameRefRef>() {
            public int callbackDelegateUpdate(WhiteSameNameRefRef et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSameNameRefRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSameNameRefRefCB createCBForVaryingUpdate() {
        WhiteSameNameRefRefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSameNameRefRefCB createCBForSpecifiedUpdate() {
        WhiteSameNameRefRefCB cb = newMyConditionBean();
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
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSameNameRefRef The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSameNameRefRef whiteSameNameRefRef) {
        doInesrtOrUpdate(whiteSameNameRefRef, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSameNameRefRef whiteSameNameRefRef, final InsertOption<WhiteSameNameRefRefCB> iop, final UpdateOption<WhiteSameNameRefRefCB> uop) {
        helpInsertOrUpdateInternally(whiteSameNameRefRef, new InternalInsertOrUpdateCallback<WhiteSameNameRefRef, WhiteSameNameRefRefCB>() {
            public void callbackInsert(WhiteSameNameRefRef et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteSameNameRefRef et) { doUpdate(et, uop); }
            public WhiteSameNameRefRefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSameNameRefRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteSameNameRefRefCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteSameNameRefRefCB>();
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
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * whiteSameNameRefRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRefRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameRefRefBhv.<span style="color: #DD4747">delete</span>(whiteSameNameRefRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRefRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSameNameRefRef whiteSameNameRefRef) {
        doDelete(whiteSameNameRefRef, null);
    }

    protected void doDelete(WhiteSameNameRefRef whiteSameNameRefRef, final DeleteOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRef", whiteSameNameRefRef);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteSameNameRefRef, new InternalDeleteCallback<WhiteSameNameRefRef>() {
            public int callbackDelegateDelete(WhiteSameNameRefRef et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSameNameRefRefCB> op) {
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     *     whiteSameNameRefRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRefRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameRefRefList.add(whiteSameNameRefRef);
     * }
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteSameNameRefRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSameNameRefRef> whiteSameNameRefRefList) {
        InsertOption<WhiteSameNameRefRefCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteSameNameRefRefList, op);
    }

    protected int[] doBatchInsert(List<WhiteSameNameRefRef> whiteSameNameRefRefList, InsertOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRefList", whiteSameNameRefRefList);
        prepareBatchInsertOption(whiteSameNameRefRefList, op);
        return delegateBatchInsert(whiteSameNameRefRefList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteSameNameRefRef> whiteSameNameRefRefList, InsertOption<WhiteSameNameRefRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSameNameRefRefList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     *     whiteSameNameRefRef.setFooName("foo");
     *     if (...) {
     *         whiteSameNameRefRef.setFooPrice(123);
     *     } else {
     *         whiteSameNameRefRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameNameRefRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameRefRefList.add(whiteSameNameRefRef);
     * }
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameRefRefList);
     * </pre>
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameNameRefRef> whiteSameNameRefRefList) {
        UpdateOption<WhiteSameNameRefRefCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteSameNameRefRefList, op);
    }

    protected int[] doBatchUpdate(List<WhiteSameNameRefRef> whiteSameNameRefRefList, UpdateOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRefList", whiteSameNameRefRefList);
        prepareBatchUpdateOption(whiteSameNameRefRefList, op);
        return delegateBatchUpdate(whiteSameNameRefRefList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteSameNameRefRef> whiteSameNameRefRefList, UpdateOption<WhiteSameNameRefRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSameNameRefRefList);
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
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameRefRefList, new SpecifyQuery<WhiteSameNameRefRefCB>() {
     *     public void specify(WhiteSameNameRefRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteSameNameRefRefList, new SpecifyQuery<WhiteSameNameRefRefCB>() {
     *     public void specify(WhiteSameNameRefRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameNameRefRef> whiteSameNameRefRefList, SpecifyQuery<WhiteSameNameRefRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameRefRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSameNameRefRef> whiteSameNameRefRefList) {
        return doBatchDelete(whiteSameNameRefRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteSameNameRefRef> whiteSameNameRefRefList, DeleteOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRefList", whiteSameNameRefRefList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteSameNameRefRefList, op);
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
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSameNameRefRef, WhiteSameNameRefRefCB&gt;() {
     *     public ConditionBean setup(whiteSameNameRefRef entity, WhiteSameNameRefRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSameNameRefRef, WhiteSameNameRefRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSameNameRefRef, WhiteSameNameRefRefCB> sp, InsertOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteSameNameRefRef e = new WhiteSameNameRefRef();
        WhiteSameNameRefRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteSameNameRefRefCB createCBForQueryInsert() {
        WhiteSameNameRefRefCB cb = newMyConditionBean();
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
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setPK...(value);</span>
     * whiteSameNameRefRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setVersionNo(value);</span>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteSameNameRefRef, cb);
     * </pre>
     * @param whiteSameNameRefRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSameNameRefRef whiteSameNameRefRef, WhiteSameNameRefRefCB cb) {
        return doQueryUpdate(whiteSameNameRefRef, cb, null);
    }

    protected int doQueryUpdate(WhiteSameNameRefRef whiteSameNameRefRef, WhiteSameNameRefRefCB cb, UpdateOption<WhiteSameNameRefRefCB> op) {
        assertObjectNotNull("whiteSameNameRefRef", whiteSameNameRefRef); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSameNameRefRef, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteSameNameRefRefCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteSameNameRefRefCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteSameNameRefRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSameNameRefRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSameNameRefRefCB cb, DeleteOption<WhiteSameNameRefRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteSameNameRefRefCB)cb); }
        else { return varyingQueryDelete((WhiteSameNameRefRefCB)cb, downcast(op)); }
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
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRefRef.setFoo...(value);
     * whiteSameNameRefRef.setBar...(value);
     * InsertOption<WhiteSameNameRefRefCB> option = new InsertOption<WhiteSameNameRefRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteSameNameRefRef, option);
     * ... = whiteSameNameRefRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameNameRefRef The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSameNameRefRef whiteSameNameRefRef, InsertOption<WhiteSameNameRefRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameNameRefRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * whiteSameNameRefRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRefRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameNameRefRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSameNameRefRefCB&gt; option = new UpdateOption&lt;WhiteSameNameRefRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *         public void specify(WhiteSameNameRefRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameRefRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteSameNameRefRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRefRef The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSameNameRefRef whiteSameNameRefRef, UpdateOption<WhiteSameNameRefRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameNameRefRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameNameRefRef The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSameNameRefRef whiteSameNameRefRef, InsertOption<WhiteSameNameRefRefCB> insertOption, UpdateOption<WhiteSameNameRefRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSameNameRefRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameNameRefRef The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSameNameRefRef whiteSameNameRefRef, DeleteOption<WhiteSameNameRefRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSameNameRefRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSameNameRefRef> whiteSameNameRefRefList, InsertOption<WhiteSameNameRefRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSameNameRefRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSameNameRefRef> whiteSameNameRefRefList, UpdateOption<WhiteSameNameRefRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSameNameRefRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameRefRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSameNameRefRef> whiteSameNameRefRefList, DeleteOption<WhiteSameNameRefRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSameNameRefRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSameNameRefRef, WhiteSameNameRefRefCB> setupper, InsertOption<WhiteSameNameRefRefCB> option) {
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
     * WhiteSameNameRefRef whiteSameNameRefRef = new WhiteSameNameRefRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setPK...(value);</span>
     * whiteSameNameRefRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRefRef.setVersionNo(value);</span>
     * WhiteSameNameRefRefCB cb = new WhiteSameNameRefRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSameNameRefRefCB&gt; option = new UpdateOption&lt;WhiteSameNameRefRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSameNameRefRefCB&gt;() {
     *     public void specify(WhiteSameNameRefRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameRefRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteSameNameRefRef, cb, option);
     * </pre>
     * @param whiteSameNameRefRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSameNameRefRef whiteSameNameRefRef, WhiteSameNameRefRefCB cb, UpdateOption<WhiteSameNameRefRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameNameRefRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSameNameRefRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSameNameRefRefCB cb, DeleteOption<WhiteSameNameRefRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSameNameRefRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSameNameRefRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSameNameRefRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSameNameRefRef> void delegateSelectCursor(WhiteSameNameRefRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteSameNameRefRef> List<ENTITY> delegateSelectList(WhiteSameNameRefRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSameNameRefRef et, InsertOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteSameNameRefRef et, UpdateOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteSameNameRefRef et, UpdateOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteSameNameRefRef et, DeleteOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteSameNameRefRef et, DeleteOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteSameNameRefRef> ls, InsertOption<WhiteSameNameRefRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSameNameRefRef> ls, UpdateOption<WhiteSameNameRefRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSameNameRefRef> ls, UpdateOption<WhiteSameNameRefRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSameNameRefRef> ls, DeleteOption<WhiteSameNameRefRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSameNameRefRef> ls, DeleteOption<WhiteSameNameRefRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSameNameRefRef et, WhiteSameNameRefRefCB inCB, ConditionBean resCB, InsertOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSameNameRefRef et, WhiteSameNameRefRefCB cb, UpdateOption<WhiteSameNameRefRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteSameNameRefRefCB cb, DeleteOption<WhiteSameNameRefRefCB> op)
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
    protected WhiteSameNameRefRef downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteSameNameRefRef.class);
    }

    protected WhiteSameNameRefRefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSameNameRefRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSameNameRefRef> downcast(List<? extends Entity> ls) {
        return (List<WhiteSameNameRefRef>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSameNameRefRefCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteSameNameRefRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSameNameRefRefCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteSameNameRefRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSameNameRefRefCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteSameNameRefRefCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSameNameRefRef, WhiteSameNameRefRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteSameNameRefRef, WhiteSameNameRefRefCB>)sp;
    }
}
