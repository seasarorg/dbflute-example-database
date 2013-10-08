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
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymNextSameNameFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextSameNameFkDbm getMyDBMeta() { return SynonymNextSameNameFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

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
     * int count = synonymNextSameNameFkBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextSameNameFkCB cb) {
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
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * SynonymNextSameNameFk synonymNextSameNameFk = synonymNextSameNameFkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymNextSameNameFk != null) {
     *     ... = synonymNextSameNameFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectEntity(SynonymNextSameNameFkCB cb) {
        return doSelectEntity(cb, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectEntity(final SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, SynonymNextSameNameFkCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * SynonymNextSameNameFk synonymNextSameNameFk = synonymNextSameNameFkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextSameNameFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectEntityWithDeletedCheck(SynonymNextSameNameFkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectEntityWithDeletedCheck(final SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymNextSameNameFkCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectByPKValue(Long refId) {
        return doSelectByPKValue(refId, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectByPKValue(Long refId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(refId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSameNameFk selectByPKValueWithDeletedCheck(Long refId) {
        return doSelectByPKValueWithDeletedCheck(refId, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> ENTITY doSelectByPKValueWithDeletedCheck(Long refId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refId), entityType);
    }

    private SynonymNextSameNameFkCB buildPKCB(Long refId) {
        assertObjectNotNull("refId", refId);
        SynonymNextSameNameFkCB cb = newMyConditionBean();
        cb.query().setRefId_Equal(refId);
        return cb;
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
     * ListResultBean&lt;SynonymNextSameNameFk&gt; synonymNextSameNameFkList = synonymNextSameNameFkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymNextSameNameFk synonymNextSameNameFk : synonymNextSameNameFkList) {
     *     ... = synonymNextSameNameFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextSameNameFk> selectList(SynonymNextSameNameFkCB cb) {
        return doSelectList(cb, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> ListResultBean<ENTITY> doSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SynonymNextSameNameFkCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextSameNameFk&gt; page = synonymNextSameNameFkBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextSameNameFk> selectPage(SynonymNextSameNameFkCB cb) {
        return doSelectPage(cb, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> PagingResultBean<ENTITY> doSelectPage(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SynonymNextSameNameFkCB>() {
            public int callbackSelectCount(SynonymNextSameNameFkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextSameNameFk&gt;() {
     *     public void handle(SynonymNextSameNameFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextSameNameFk. (NotNull)
     */
    public void selectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<SynonymNextSameNameFk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymNextSameNameFk.class);
    }

    protected <ENTITY extends SynonymNextSameNameFk> void doSelectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<SynonymNextSameNameFk>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, SynonymNextSameNameFkCB>() {
            public void callbackSelectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextSameNameFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<SynonymNextSameNameFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymNextSameNameFkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refId.
     * @param synonymNextSameNameFkList The list of synonymNextSameNameFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefIdList(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        return helpExtractListInternally(synonymNextSameNameFkList, new InternalExtractCallback<SynonymNextSameNameFk, Long>() {
            public Long getCV(SynonymNextSameNameFk e) { return e.getRefId(); }
        });
    }

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
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">insert</span>(synonymNextSameNameFk);
     * ... = synonymNextSameNameFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextSameNameFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextSameNameFk synonymNextSameNameFk) {
        doInsert(synonymNextSameNameFk, null);
    }

    protected void doInsert(SynonymNextSameNameFk synonymNextSameNameFk, InsertOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFk", synonymNextSameNameFk);
        prepareInsertOption(option);
        delegateInsert(synonymNextSameNameFk, option);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextSameNameFkCB> option) {
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * synonymNextSameNameFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSameNameFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSameNameFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSameNameFkBhv.<span style="color: #FD4747">update</span>(synonymNextSameNameFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param synonymNextSameNameFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymNextSameNameFk synonymNextSameNameFk) {
        doUpdate(synonymNextSameNameFk, null);
    }

    protected void doUpdate(SynonymNextSameNameFk synonymNextSameNameFk, final UpdateOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFk", synonymNextSameNameFk);
        prepareUpdateOption(option);
        helpUpdateInternally(synonymNextSameNameFk, new InternalUpdateCallback<SynonymNextSameNameFk>() {
            public int callbackDelegateUpdate(SynonymNextSameNameFk entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextSameNameFkCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymNextSameNameFkCB createCBForVaryingUpdate() {
        SynonymNextSameNameFkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymNextSameNameFkCB createCBForSpecifiedUpdate() {
        SynonymNextSameNameFkCB cb = newMyConditionBean();
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
     * @param synonymNextSameNameFk The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextSameNameFk synonymNextSameNameFk) {
        doInesrtOrUpdate(synonymNextSameNameFk, null, null);
    }

    protected void doInesrtOrUpdate(SynonymNextSameNameFk synonymNextSameNameFk, final InsertOption<SynonymNextSameNameFkCB> insertOption, final UpdateOption<SynonymNextSameNameFkCB> updateOption) {
        helpInsertOrUpdateInternally(synonymNextSameNameFk, new InternalInsertOrUpdateCallback<SynonymNextSameNameFk, SynonymNextSameNameFkCB>() {
            public void callbackInsert(SynonymNextSameNameFk entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(SynonymNextSameNameFk entity) { doUpdate(entity, updateOption); }
            public SynonymNextSameNameFkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymNextSameNameFkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SynonymNextSameNameFkCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SynonymNextSameNameFkCB>() : updateOption;
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * synonymNextSameNameFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSameNameFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSameNameFkBhv.<span style="color: #FD4747">delete</span>(synonymNextSameNameFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param synonymNextSameNameFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextSameNameFk synonymNextSameNameFk) {
        doDelete(synonymNextSameNameFk, null);
    }

    protected void doDelete(SynonymNextSameNameFk synonymNextSameNameFk, final DeleteOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFk", synonymNextSameNameFk);
        prepareDeleteOption(option);
        helpDeleteInternally(synonymNextSameNameFk, new InternalDeleteCallback<SynonymNextSameNameFk>() {
            public int callbackDelegateDelete(SynonymNextSameNameFk entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextSameNameFkCB> option) {
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
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">batchInsert</span>(synonymNextSameNameFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        InsertOption<SynonymNextSameNameFkCB> option = createInsertUpdateOption();
        return doBatchInsert(synonymNextSameNameFkList, option);
    }

    protected int[] doBatchInsert(List<SynonymNextSameNameFk> synonymNextSameNameFkList, InsertOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFkList", synonymNextSameNameFkList);
        prepareBatchInsertOption(synonymNextSameNameFkList, option);
        return delegateBatchInsert(synonymNextSameNameFkList, option);
    }

    protected void prepareBatchInsertOption(List<SynonymNextSameNameFk> synonymNextSameNameFkList, InsertOption<SynonymNextSameNameFkCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymNextSameNameFkList);
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
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSameNameFkList);
     * </pre>
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        UpdateOption<SynonymNextSameNameFkCB> option = createPlainUpdateOption();
        return doBatchUpdate(synonymNextSameNameFkList, option);
    }

    protected int[] doBatchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFkList", synonymNextSameNameFkList);
        prepareBatchUpdateOption(synonymNextSameNameFkList, option);
        return delegateBatchUpdate(synonymNextSameNameFkList, option);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextSameNameFk> synonymNextSameNameFkList, UpdateOption<SynonymNextSameNameFkCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymNextSameNameFkList);
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
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSameNameFkList, new SpecifyQuery<SynonymNextSameNameFkCB>() {
     *     public void specify(SynonymNextSameNameFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSameNameFkList, new SpecifyQuery<SynonymNextSameNameFkCB>() {
     *     public void specify(SynonymNextSameNameFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSameNameFk> synonymNextSameNameFkList, SpecifyQuery<SynonymNextSameNameFkCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextSameNameFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextSameNameFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextSameNameFk> synonymNextSameNameFkList) {
        return doBatchDelete(synonymNextSameNameFkList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextSameNameFk> synonymNextSameNameFkList, DeleteOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFkList", synonymNextSameNameFkList);
        prepareDeleteOption(option);
        return delegateBatchDelete(synonymNextSameNameFkList, option);
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
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextSameNameFk, SynonymNextSameNameFkCB&gt;() {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> setupper, InsertOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        SynonymNextSameNameFk entity = new SynonymNextSameNameFk();
        SynonymNextSameNameFkCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SynonymNextSameNameFkCB createCBForQueryInsert() {
        SynonymNextSameNameFkCB cb = newMyConditionBean();
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setPK...(value);</span>
     * synonymNextSameNameFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setVersionNo(value);</span>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">queryUpdate</span>(synonymNextSameNameFk, cb);
     * </pre>
     * @param synonymNextSameNameFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextSameNameFk synonymNextSameNameFk, SynonymNextSameNameFkCB cb) {
        return doQueryUpdate(synonymNextSameNameFk, cb, null);
    }

    protected int doQueryUpdate(SynonymNextSameNameFk synonymNextSameNameFk, SynonymNextSameNameFkCB cb, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertObjectNotNull("synonymNextSameNameFk", synonymNextSameNameFk); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymNextSameNameFk, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SynonymNextSameNameFkCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SynonymNextSameNameFkCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">queryDelete</span>(synonymNextSameNameFk, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextSameNameFkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextSameNameFkCB cb, DeleteOption<SynonymNextSameNameFkCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SynonymNextSameNameFkCB)cb); }
        else { return varyingQueryDelete((SynonymNextSameNameFkCB)cb, downcast(option)); }
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
     * SynonymNextSameNameFk synonymNextSameNameFk = new SynonymNextSameNameFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSameNameFk.setFoo...(value);
     * synonymNextSameNameFk.setBar...(value);
     * InsertOption<SynonymNextSameNameFkCB> option = new InsertOption<SynonymNextSameNameFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">varyingInsert</span>(synonymNextSameNameFk, option);
     * ... = synonymNextSameNameFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextSameNameFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSameNameFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextSameNameFkCB&gt; option = new UpdateOption&lt;SynonymNextSameNameFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextSameNameFkCB&gt;() {
     *         public void specify(SynonymNextSameNameFkCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextSameNameFkBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymNextSameNameFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSameNameFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextSameNameFk synonymNextSameNameFk, UpdateOption<SynonymNextSameNameFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextSameNameFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextSameNameFk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextSameNameFk synonymNextSameNameFk, InsertOption<SynonymNextSameNameFkCB> insertOption, UpdateOption<SynonymNextSameNameFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymNextSameNameFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextSameNameFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSameNameFk.setVersionNo(value);</span>
     * SynonymNextSameNameFkCB cb = new SynonymNextSameNameFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextSameNameFkCB&gt; option = new UpdateOption&lt;SynonymNextSameNameFkCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextSameNameFkCB&gt;() {
     *     public void specify(SynonymNextSameNameFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextSameNameFkBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymNextSameNameFk, cb, option);
     * </pre>
     * @param synonymNextSameNameFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextSameNameFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymNextSameNameFkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymNextSameNameFkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymNextSameNameFk> void delegateSelectCursor(SynonymNextSameNameFkCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends SynonymNextSameNameFk> List<ENTITY> delegateSelectList(SynonymNextSameNameFkCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymNextSameNameFk e, InsertOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(SynonymNextSameNameFk e, UpdateOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(SynonymNextSameNameFk e, UpdateOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(SynonymNextSameNameFk e, DeleteOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(SynonymNextSameNameFk e, DeleteOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<SynonymNextSameNameFk> ls, InsertOption<SynonymNextSameNameFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymNextSameNameFk> ls, UpdateOption<SynonymNextSameNameFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymNextSameNameFk> ls, UpdateOption<SynonymNextSameNameFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymNextSameNameFk> ls, DeleteOption<SynonymNextSameNameFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymNextSameNameFk> ls, DeleteOption<SynonymNextSameNameFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymNextSameNameFk e, SynonymNextSameNameFkCB inCB, ConditionBean resCB, InsertOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymNextSameNameFk e, SynonymNextSameNameFkCB cb, UpdateOption<SynonymNextSameNameFkCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SynonymNextSameNameFkCB cb, DeleteOption<SynonymNextSameNameFkCB> op)
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
    protected SynonymNextSameNameFk downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, SynonymNextSameNameFk.class);
    }

    protected SynonymNextSameNameFkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymNextSameNameFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymNextSameNameFk> downcast(List<? extends Entity> entityList) {
        return (List<SynonymNextSameNameFk>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextSameNameFkCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SynonymNextSameNameFkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextSameNameFkCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SynonymNextSameNameFkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextSameNameFkCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SynonymNextSameNameFkCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<SynonymNextSameNameFk, SynonymNextSameNameFkCB>)option;
    }
}
