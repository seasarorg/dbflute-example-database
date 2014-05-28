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
 * The behavior of WHITE_REF_NEXT_EXCEPT as TABLE. <br />
 * <pre>
 * [primary key]
 *     REF_NEXT_EXCEPT_ID
 *
 * [column]
 *     REF_NEXT_EXCEPT_ID, NEXT_EXCEPT_CODE
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
public abstract class BsWhiteRefNextExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_REF_NEXT_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteRefNextExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteRefNextExceptDbm getMyDBMeta() { return WhiteRefNextExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteRefNextExcept newMyEntity() { return new WhiteRefNextExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteRefNextExceptCB newMyConditionBean() { return new WhiteRefNextExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * int count = whiteRefNextExceptBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteRefNextExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteRefNextExceptCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteRefNextExceptCB cb) { // called by selectPage(cb)
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
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextExcept whiteRefNextExcept = whiteRefNextExceptBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteRefNextExcept != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteRefNextExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextExcept selectEntity(WhiteRefNextExceptCB cb) {
        return doSelectEntity(cb, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> ENTITY doSelectEntity(WhiteRefNextExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteRefNextExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteRefNextExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteRefNextExceptCB cb, Class<ENTITY> tp) {
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
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * WhiteRefNextExcept whiteRefNextExcept = whiteRefNextExceptBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteRefNextExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextExcept selectEntityWithDeletedCheck(WhiteRefNextExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> ENTITY doSelectEntityWithDeletedCheck(WhiteRefNextExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteRefNextExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refNextExceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextExcept selectByPKValue(Long refNextExceptId) {
        return doSelectByPK(refNextExceptId, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> ENTITY doSelectByPK(Long refNextExceptId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(refNextExceptId), entityType);
    }

    protected <ENTITY extends WhiteRefNextExcept> OptionalEntity<ENTITY> doSelectOptionalByPK(Long refNextExceptId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(refNextExceptId, entityType), refNextExceptId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refNextExceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefNextExcept selectByPKValueWithDeletedCheck(Long refNextExceptId) {
        return doSelectByPKWithDeletedCheck(refNextExceptId, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> ENTITY doSelectByPKWithDeletedCheck(Long refNextExceptId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(refNextExceptId), entityType);
    }

    protected WhiteRefNextExceptCB xprepareCBAsPK(Long refNextExceptId) {
        assertObjectNotNull("refNextExceptId", refNextExceptId);
        WhiteRefNextExceptCB cb = newMyConditionBean(); cb.acceptPrimaryKey(refNextExceptId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteRefNextExcept&gt; whiteRefNextExceptList = whiteRefNextExceptBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteRefNextExcept whiteRefNextExcept : whiteRefNextExceptList) {
     *     ... = whiteRefNextExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteRefNextExcept> selectList(WhiteRefNextExceptCB cb) {
        return doSelectList(cb, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> ListResultBean<ENTITY> doSelectList(WhiteRefNextExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteRefNextExceptCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefNextExceptCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteRefNextExcept&gt; page = whiteRefNextExceptBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteRefNextExcept whiteRefNextExcept : page) {
     *     ... = whiteRefNextExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteRefNextExcept> selectPage(WhiteRefNextExceptCB cb) {
        return doSelectPage(cb, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> PagingResultBean<ENTITY> doSelectPage(WhiteRefNextExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteRefNextExceptCB>() {
            public int callbackSelectCount(WhiteRefNextExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteRefNextExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * whiteRefNextExceptBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteRefNextExcept&gt;() {
     *     public void handle(WhiteRefNextExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteRefNextExcept. (NotNull)
     */
    public void selectCursor(WhiteRefNextExceptCB cb, EntityRowHandler<WhiteRefNextExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteRefNextExcept.class);
    }

    protected <ENTITY extends WhiteRefNextExcept> void doSelectCursor(WhiteRefNextExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteRefNextExceptCB>() {
            public void callbackSelectCursor(WhiteRefNextExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteRefNextExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteRefNextExceptBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteRefNextExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteRefNextExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteRefNextExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteRefNextExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key refNextExceptId.
     * @param whiteRefNextExceptList The list of whiteRefNextExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefNextExceptIdList(List<WhiteRefNextExcept> whiteRefNextExceptList) {
        return helpExtractListInternally(whiteRefNextExceptList, new InternalExtractCallback<WhiteRefNextExcept, Long>() {
            public Long getCV(WhiteRefNextExcept et) { return et.getRefNextExceptId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextExcept.setFoo...(value);
     * whiteRefNextExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.set...;</span>
     * whiteRefNextExceptBhv.<span style="color: #DD4747">insert</span>(whiteRefNextExcept);
     * ... = whiteRefNextExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteRefNextExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteRefNextExcept whiteRefNextExcept) {
        doInsert(whiteRefNextExcept, null);
    }

    protected void doInsert(WhiteRefNextExcept whiteRefNextExcept, InsertOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExcept", whiteRefNextExcept);
        prepareInsertOption(op);
        delegateInsert(whiteRefNextExcept, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteRefNextExceptCB> op) {
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
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * whiteRefNextExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextExceptBhv.<span style="color: #DD4747">update</span>(whiteRefNextExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteRefNextExcept whiteRefNextExcept) {
        doUpdate(whiteRefNextExcept, null);
    }

    protected void doUpdate(WhiteRefNextExcept whiteRefNextExcept, final UpdateOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExcept", whiteRefNextExcept);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteRefNextExcept, new InternalUpdateCallback<WhiteRefNextExcept>() {
            public int callbackDelegateUpdate(WhiteRefNextExcept et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteRefNextExceptCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteRefNextExceptCB createCBForVaryingUpdate() {
        WhiteRefNextExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteRefNextExceptCB createCBForSpecifiedUpdate() {
        WhiteRefNextExceptCB cb = newMyConditionBean();
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
     * @param whiteRefNextExcept The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteRefNextExcept whiteRefNextExcept) {
        doInesrtOrUpdate(whiteRefNextExcept, null, null);
    }

    protected void doInesrtOrUpdate(WhiteRefNextExcept whiteRefNextExcept, final InsertOption<WhiteRefNextExceptCB> iop, final UpdateOption<WhiteRefNextExceptCB> uop) {
        helpInsertOrUpdateInternally(whiteRefNextExcept, new InternalInsertOrUpdateCallback<WhiteRefNextExcept, WhiteRefNextExceptCB>() {
            public void callbackInsert(WhiteRefNextExcept et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteRefNextExcept et) { doUpdate(et, uop); }
            public WhiteRefNextExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteRefNextExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteRefNextExceptCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteRefNextExceptCB>();
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
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * whiteRefNextExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefNextExceptBhv.<span style="color: #DD4747">delete</span>(whiteRefNextExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteRefNextExcept whiteRefNextExcept) {
        doDelete(whiteRefNextExcept, null);
    }

    protected void doDelete(WhiteRefNextExcept whiteRefNextExcept, final DeleteOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExcept", whiteRefNextExcept);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteRefNextExcept, new InternalDeleteCallback<WhiteRefNextExcept>() {
            public int callbackDelegateDelete(WhiteRefNextExcept et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteRefNextExceptCB> op) {
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
     *     WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     *     whiteRefNextExcept.setFooName("foo");
     *     if (...) {
     *         whiteRefNextExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteRefNextExceptList.add(whiteRefNextExcept);
     * }
     * whiteRefNextExceptBhv.<span style="color: #DD4747">batchInsert</span>(whiteRefNextExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteRefNextExcept> whiteRefNextExceptList) {
        InsertOption<WhiteRefNextExceptCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteRefNextExceptList, op);
    }

    protected int[] doBatchInsert(List<WhiteRefNextExcept> whiteRefNextExceptList, InsertOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExceptList", whiteRefNextExceptList);
        prepareBatchInsertOption(whiteRefNextExceptList, op);
        return delegateBatchInsert(whiteRefNextExceptList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteRefNextExcept> whiteRefNextExceptList, InsertOption<WhiteRefNextExceptCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteRefNextExceptList);
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
     *     WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     *     whiteRefNextExcept.setFooName("foo");
     *     if (...) {
     *         whiteRefNextExcept.setFooPrice(123);
     *     } else {
     *         whiteRefNextExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteRefNextExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteRefNextExceptList.add(whiteRefNextExcept);
     * }
     * whiteRefNextExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextExceptList);
     * </pre>
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextExcept> whiteRefNextExceptList) {
        UpdateOption<WhiteRefNextExceptCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteRefNextExceptList, op);
    }

    protected int[] doBatchUpdate(List<WhiteRefNextExcept> whiteRefNextExceptList, UpdateOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExceptList", whiteRefNextExceptList);
        prepareBatchUpdateOption(whiteRefNextExceptList, op);
        return delegateBatchUpdate(whiteRefNextExceptList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteRefNextExcept> whiteRefNextExceptList, UpdateOption<WhiteRefNextExceptCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteRefNextExceptList);
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
     * whiteRefNextExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextExceptList, new SpecifyQuery<WhiteRefNextExceptCB>() {
     *     public void specify(WhiteRefNextExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteRefNextExceptBhv.<span style="color: #DD4747">batchUpdate</span>(whiteRefNextExceptList, new SpecifyQuery<WhiteRefNextExceptCB>() {
     *     public void specify(WhiteRefNextExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefNextExcept> whiteRefNextExceptList, SpecifyQuery<WhiteRefNextExceptCB> updateColumnSpec) {
        return doBatchUpdate(whiteRefNextExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteRefNextExcept> whiteRefNextExceptList) {
        return doBatchDelete(whiteRefNextExceptList, null);
    }

    protected int[] doBatchDelete(List<WhiteRefNextExcept> whiteRefNextExceptList, DeleteOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExceptList", whiteRefNextExceptList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteRefNextExceptList, op);
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
     * whiteRefNextExceptBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteRefNextExcept, WhiteRefNextExceptCB&gt;() {
     *     public ConditionBean setup(whiteRefNextExcept entity, WhiteRefNextExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteRefNextExcept, WhiteRefNextExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteRefNextExcept, WhiteRefNextExceptCB> sp, InsertOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteRefNextExcept e = new WhiteRefNextExcept();
        WhiteRefNextExceptCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteRefNextExceptCB createCBForQueryInsert() {
        WhiteRefNextExceptCB cb = newMyConditionBean();
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
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setPK...(value);</span>
     * whiteRefNextExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setVersionNo(value);</span>
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * whiteRefNextExceptBhv.<span style="color: #DD4747">queryUpdate</span>(whiteRefNextExcept, cb);
     * </pre>
     * @param whiteRefNextExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteRefNextExcept whiteRefNextExcept, WhiteRefNextExceptCB cb) {
        return doQueryUpdate(whiteRefNextExcept, cb, null);
    }

    protected int doQueryUpdate(WhiteRefNextExcept whiteRefNextExcept, WhiteRefNextExceptCB cb, UpdateOption<WhiteRefNextExceptCB> op) {
        assertObjectNotNull("whiteRefNextExcept", whiteRefNextExcept); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteRefNextExcept, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteRefNextExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteRefNextExceptCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * whiteRefNextExceptBhv.<span style="color: #DD4747">queryDelete</span>(whiteRefNextExcept, cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteRefNextExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteRefNextExceptCB cb, DeleteOption<WhiteRefNextExceptCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteRefNextExceptCB)cb); }
        else { return varyingQueryDelete((WhiteRefNextExceptCB)cb, downcast(op)); }
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
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefNextExcept.setFoo...(value);
     * whiteRefNextExcept.setBar...(value);
     * InsertOption<WhiteRefNextExceptCB> option = new InsertOption<WhiteRefNextExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteRefNextExceptBhv.<span style="color: #DD4747">varyingInsert</span>(whiteRefNextExcept, option);
     * ... = whiteRefNextExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteRefNextExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteRefNextExcept whiteRefNextExcept, InsertOption<WhiteRefNextExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteRefNextExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * whiteRefNextExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefNextExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefNextExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteRefNextExceptCB&gt; option = new UpdateOption&lt;WhiteRefNextExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteRefNextExceptCB&gt;() {
     *         public void specify(WhiteRefNextExceptCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteRefNextExceptBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteRefNextExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefNextExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteRefNextExcept whiteRefNextExcept, UpdateOption<WhiteRefNextExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteRefNextExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteRefNextExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteRefNextExcept whiteRefNextExcept, InsertOption<WhiteRefNextExceptCB> insertOption, UpdateOption<WhiteRefNextExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteRefNextExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteRefNextExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteRefNextExcept whiteRefNextExcept, DeleteOption<WhiteRefNextExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteRefNextExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteRefNextExcept> whiteRefNextExceptList, InsertOption<WhiteRefNextExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteRefNextExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteRefNextExcept> whiteRefNextExceptList, UpdateOption<WhiteRefNextExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteRefNextExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteRefNextExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteRefNextExcept> whiteRefNextExceptList, DeleteOption<WhiteRefNextExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteRefNextExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteRefNextExcept, WhiteRefNextExceptCB> setupper, InsertOption<WhiteRefNextExceptCB> option) {
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
     * WhiteRefNextExcept whiteRefNextExcept = new WhiteRefNextExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setPK...(value);</span>
     * whiteRefNextExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefNextExcept.setVersionNo(value);</span>
     * WhiteRefNextExceptCB cb = new WhiteRefNextExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteRefNextExceptCB&gt; option = new UpdateOption&lt;WhiteRefNextExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteRefNextExceptCB&gt;() {
     *     public void specify(WhiteRefNextExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteRefNextExceptBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteRefNextExcept, cb, option);
     * </pre>
     * @param whiteRefNextExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteRefNextExcept whiteRefNextExcept, WhiteRefNextExceptCB cb, UpdateOption<WhiteRefNextExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteRefNextExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteRefNextExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteRefNextExceptCB cb, DeleteOption<WhiteRefNextExceptCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteRefNextExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteRefNextExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteRefNextExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteRefNextExcept> void delegateSelectCursor(WhiteRefNextExceptCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteRefNextExcept> List<ENTITY> delegateSelectList(WhiteRefNextExceptCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteRefNextExcept et, InsertOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteRefNextExcept et, UpdateOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteRefNextExcept et, UpdateOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteRefNextExcept et, DeleteOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteRefNextExcept et, DeleteOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteRefNextExcept> ls, InsertOption<WhiteRefNextExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteRefNextExcept> ls, UpdateOption<WhiteRefNextExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteRefNextExcept> ls, UpdateOption<WhiteRefNextExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteRefNextExcept> ls, DeleteOption<WhiteRefNextExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteRefNextExcept> ls, DeleteOption<WhiteRefNextExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteRefNextExcept et, WhiteRefNextExceptCB inCB, ConditionBean resCB, InsertOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteRefNextExcept et, WhiteRefNextExceptCB cb, UpdateOption<WhiteRefNextExceptCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteRefNextExceptCB cb, DeleteOption<WhiteRefNextExceptCB> op)
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
    protected WhiteRefNextExcept downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteRefNextExcept.class);
    }

    protected WhiteRefNextExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteRefNextExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteRefNextExcept> downcast(List<? extends Entity> ls) {
        return (List<WhiteRefNextExcept>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteRefNextExceptCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteRefNextExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteRefNextExceptCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteRefNextExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteRefNextExceptCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteRefNextExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteRefNextExcept, WhiteRefNextExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteRefNextExcept, WhiteRefNextExceptCB>)sp;
    }
}
