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
 * @author oracleman
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
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteRefTargetDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteRefTargetDbm getMyDBMeta() { return WhiteRefTargetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

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
     * int count = whiteRefTargetBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteRefTargetCB cb) {
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
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefTarget whiteRefTarget = whiteRefTargetBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteRefTarget != null) {
     *     ... = whiteRefTarget.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectEntity(WhiteRefTargetCB cb) {
        return doSelectEntity(cb, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectEntity(final WhiteRefTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteRefTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * WhiteRefTarget whiteRefTarget = whiteRefTargetBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteRefTarget.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectEntityWithDeletedCheck(WhiteRefTargetCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectEntityWithDeletedCheck(final WhiteRefTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteRefTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refTargetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectByPKValue(Long refTargetId) {
        return doSelectByPKValue(refTargetId, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectByPKValue(Long refTargetId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(refTargetId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refTargetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteRefTarget selectByPKValueWithDeletedCheck(Long refTargetId) {
        return doSelectByPKValueWithDeletedCheck(refTargetId, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> ENTITY doSelectByPKValueWithDeletedCheck(Long refTargetId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refTargetId), entityType);
    }

    private WhiteRefTargetCB buildPKCB(Long refTargetId) {
        assertObjectNotNull("refTargetId", refTargetId);
        WhiteRefTargetCB cb = newMyConditionBean();
        cb.query().setRefTargetId_Equal(refTargetId);
        return cb;
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
     * ListResultBean&lt;WhiteRefTarget&gt; whiteRefTargetList = whiteRefTargetBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteRefTarget whiteRefTarget : whiteRefTargetList) {
     *     ... = whiteRefTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteRefTarget> selectList(WhiteRefTargetCB cb) {
        return doSelectList(cb, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> ListResultBean<ENTITY> doSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteRefTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteRefTarget&gt; page = whiteRefTargetBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteRefTarget> selectPage(WhiteRefTargetCB cb) {
        return doSelectPage(cb, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> PagingResultBean<ENTITY> doSelectPage(WhiteRefTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteRefTargetCB>() {
            public int callbackSelectCount(WhiteRefTargetCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteRefTarget&gt;() {
     *     public void handle(WhiteRefTarget entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteRefTarget. (NotNull)
     */
    public void selectCursor(WhiteRefTargetCB cb, EntityRowHandler<WhiteRefTarget> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteRefTarget.class);
    }

    protected <ENTITY extends WhiteRefTarget> void doSelectCursor(WhiteRefTargetCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteRefTarget>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteRefTargetCB>() {
            public void callbackSelectCursor(WhiteRefTargetCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteRefTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteRefTargetBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteRefTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<WhiteRefTargetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteRefTargetCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
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
     * Pull out the list of foreign table 'WhiteTarget'.
     * @param whiteRefTargetList The list of whiteRefTarget. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteTarget> pulloutWhiteTarget(List<WhiteRefTarget> whiteRefTargetList) {
        return helpPulloutInternally(whiteRefTargetList, new InternalPulloutCallback<WhiteRefTarget, WhiteTarget>() {
            public WhiteTarget getFr(WhiteRefTarget e) { return e.getWhiteTarget(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteTarget e, List<WhiteRefTarget> ls)
            { e.setWhiteRefTargetList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refTargetId.
     * @param whiteRefTargetList The list of whiteRefTarget. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefTargetIdList(List<WhiteRefTarget> whiteRefTargetList) {
        return helpExtractListInternally(whiteRefTargetList, new InternalExtractCallback<WhiteRefTarget, Long>() {
            public Long getCV(WhiteRefTarget e) { return e.getRefTargetId(); }
        });
    }

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
     * whiteRefTargetBhv.<span style="color: #FD4747">insert</span>(whiteRefTarget);
     * ... = whiteRefTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteRefTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteRefTarget whiteRefTarget) {
        doInsert(whiteRefTarget, null);
    }

    protected void doInsert(WhiteRefTarget whiteRefTarget, InsertOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTarget", whiteRefTarget);
        prepareInsertOption(option);
        delegateInsert(whiteRefTarget, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteRefTargetCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * whiteRefTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteRefTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefTargetBhv.<span style="color: #FD4747">update</span>(whiteRefTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteRefTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteRefTarget whiteRefTarget) {
        doUpdate(whiteRefTarget, null);
    }

    protected void doUpdate(WhiteRefTarget whiteRefTarget, final UpdateOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTarget", whiteRefTarget);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteRefTarget, new InternalUpdateCallback<WhiteRefTarget>() {
            public int callbackDelegateUpdate(WhiteRefTarget entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteRefTargetCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteRefTargetCB createCBForVaryingUpdate() {
        WhiteRefTargetCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteRefTargetCB createCBForSpecifiedUpdate() {
        WhiteRefTargetCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteRefTarget The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteRefTarget whiteRefTarget) {
        doInesrtOrUpdate(whiteRefTarget, null, null);
    }

    protected void doInesrtOrUpdate(WhiteRefTarget whiteRefTarget, final InsertOption<WhiteRefTargetCB> insertOption, final UpdateOption<WhiteRefTargetCB> updateOption) {
        helpInsertOrUpdateInternally(whiteRefTarget, new InternalInsertOrUpdateCallback<WhiteRefTarget, WhiteRefTargetCB>() {
            public void callbackInsert(WhiteRefTarget entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteRefTarget entity) { doUpdate(entity, updateOption); }
            public WhiteRefTargetCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteRefTargetCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteRefTargetCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteRefTargetCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * whiteRefTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteRefTargetBhv.<span style="color: #FD4747">delete</span>(whiteRefTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteRefTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteRefTarget whiteRefTarget) {
        doDelete(whiteRefTarget, null);
    }

    protected void doDelete(WhiteRefTarget whiteRefTarget, final DeleteOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTarget", whiteRefTarget);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteRefTarget, new InternalDeleteCallback<WhiteRefTarget>() {
            public int callbackDelegateDelete(WhiteRefTarget entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteRefTargetCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     * whiteRefTargetBhv.<span style="color: #FD4747">batchInsert</span>(whiteRefTargetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteRefTarget> whiteRefTargetList) {
        InsertOption<WhiteRefTargetCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteRefTargetList, option);
    }

    protected int[] doBatchInsert(List<WhiteRefTarget> whiteRefTargetList, InsertOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTargetList", whiteRefTargetList);
        prepareBatchInsertOption(whiteRefTargetList, option);
        return delegateBatchInsert(whiteRefTargetList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteRefTarget> whiteRefTargetList, InsertOption<WhiteRefTargetCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteRefTargetList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * whiteRefTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefTargetList);
     * </pre>
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefTarget> whiteRefTargetList) {
        UpdateOption<WhiteRefTargetCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteRefTargetList, option);
    }

    protected int[] doBatchUpdate(List<WhiteRefTarget> whiteRefTargetList, UpdateOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTargetList", whiteRefTargetList);
        prepareBatchUpdateOption(whiteRefTargetList, option);
        return delegateBatchUpdate(whiteRefTargetList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteRefTarget> whiteRefTargetList, UpdateOption<WhiteRefTargetCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteRefTargetList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * whiteRefTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefTargetList, new SpecifyQuery<WhiteRefTargetCB>() {
     *     public void specify(WhiteRefTargetCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteRefTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteRefTargetList, new SpecifyQuery<WhiteRefTargetCB>() {
     *     public void specify(WhiteRefTargetCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteRefTarget> whiteRefTargetList, SpecifyQuery<WhiteRefTargetCB> updateColumnSpec) {
        return doBatchUpdate(whiteRefTargetList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteRefTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteRefTarget> whiteRefTargetList) {
        return doBatchDelete(whiteRefTargetList, null);
    }

    protected int[] doBatchDelete(List<WhiteRefTarget> whiteRefTargetList, DeleteOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTargetList", whiteRefTargetList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteRefTargetList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteRefTargetBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteRefTarget, WhiteRefTargetCB&gt;() {
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
    public int queryInsert(QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> setupper, InsertOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteRefTarget entity = new WhiteRefTarget();
        WhiteRefTargetCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteRefTargetCB createCBForQueryInsert() {
        WhiteRefTargetCB cb = newMyConditionBean();
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
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setPK...(value);</span>
     * whiteRefTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setVersionNo(value);</span>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #FD4747">queryUpdate</span>(whiteRefTarget, cb);
     * </pre>
     * @param whiteRefTarget The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteRefTarget whiteRefTarget, WhiteRefTargetCB cb) {
        return doQueryUpdate(whiteRefTarget, cb, null);
    }

    protected int doQueryUpdate(WhiteRefTarget whiteRefTarget, WhiteRefTargetCB cb, UpdateOption<WhiteRefTargetCB> option) {
        assertObjectNotNull("whiteRefTarget", whiteRefTarget); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteRefTarget, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteRefTargetCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteRefTargetCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * whiteRefTargetBhv.<span style="color: #FD4747">queryDelete</span>(whiteRefTarget, cb);
     * </pre>
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteRefTargetCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteRefTargetCB cb, DeleteOption<WhiteRefTargetCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteRefTargetCB)cb); }
        else { return varyingQueryDelete((WhiteRefTargetCB)cb, downcast(option)); }
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
     * WhiteRefTarget whiteRefTarget = new WhiteRefTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteRefTarget.setFoo...(value);
     * whiteRefTarget.setBar...(value);
     * InsertOption<WhiteRefTargetCB> option = new InsertOption<WhiteRefTargetCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteRefTargetBhv.<span style="color: #FD4747">varyingInsert</span>(whiteRefTarget, option);
     * ... = whiteRefTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteRefTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteRefTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteRefTargetCB&gt; option = new UpdateOption&lt;WhiteRefTargetCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteRefTargetCB&gt;() {
     *         public void specify(WhiteRefTargetCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteRefTargetBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteRefTarget, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteRefTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteRefTarget whiteRefTarget, UpdateOption<WhiteRefTargetCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteRefTarget, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteRefTarget The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteRefTarget whiteRefTarget, InsertOption<WhiteRefTargetCB> insertOption, UpdateOption<WhiteRefTargetCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteRefTarget, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteRefTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteRefTarget.setVersionNo(value);</span>
     * WhiteRefTargetCB cb = new WhiteRefTargetCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteRefTargetCB&gt; option = new UpdateOption&lt;WhiteRefTargetCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteRefTargetCB&gt;() {
     *     public void specify(WhiteRefTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteRefTargetBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteRefTarget, cb, option);
     * </pre>
     * @param whiteRefTarget The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteRefTarget. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteRefTargetCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteRefTargetCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteRefTarget> void delegateSelectCursor(WhiteRefTargetCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteRefTarget> List<ENTITY> delegateSelectList(WhiteRefTargetCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteRefTarget e, InsertOption<WhiteRefTargetCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteRefTarget e, UpdateOption<WhiteRefTargetCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteRefTarget e, UpdateOption<WhiteRefTargetCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteRefTarget e, DeleteOption<WhiteRefTargetCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteRefTarget e, DeleteOption<WhiteRefTargetCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteRefTarget> ls, InsertOption<WhiteRefTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteRefTarget> ls, UpdateOption<WhiteRefTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteRefTarget> ls, UpdateOption<WhiteRefTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteRefTarget> ls, DeleteOption<WhiteRefTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteRefTarget> ls, DeleteOption<WhiteRefTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteRefTarget e, WhiteRefTargetCB inCB, ConditionBean resCB, InsertOption<WhiteRefTargetCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteRefTarget e, WhiteRefTargetCB cb, UpdateOption<WhiteRefTargetCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteRefTargetCB cb, DeleteOption<WhiteRefTargetCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteRefTarget downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteRefTarget.class);
    }

    protected WhiteRefTargetCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteRefTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteRefTarget> downcast(List<? extends Entity> entityList) {
        return (List<WhiteRefTarget>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteRefTargetCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteRefTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteRefTargetCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteRefTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteRefTargetCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteRefTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteRefTarget, WhiteRefTargetCB>)option;
    }
}
