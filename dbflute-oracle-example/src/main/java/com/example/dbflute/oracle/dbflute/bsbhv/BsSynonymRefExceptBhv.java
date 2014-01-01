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
 * The behavior of SYNONYM_REF_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     REF_EXCEPT_ID
 * 
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     SYNONYM_EXCEPT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     synonymExcept
 * 
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymRefExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_REF_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymRefExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymRefExceptDbm getMyDBMeta() { return SynonymRefExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymRefExcept newMyEntity() { return new SynonymRefExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymRefExceptCB newMyConditionBean() { return new SynonymRefExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * int count = synonymRefExceptBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymRefExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymRefExceptCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymRefExceptCB cb) { // called by selectPage(cb)
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
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * SynonymRefExcept synonymRefExcept = synonymRefExceptBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymRefExcept != null) {
     *     ... = synonymRefExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectEntity(SynonymRefExceptCB cb) {
        return doSelectEntity(cb, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectEntity(final SynonymRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, SynonymRefExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * SynonymRefExcept synonymRefExcept = synonymRefExceptBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymRefExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectEntityWithDeletedCheck(SynonymRefExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectEntityWithDeletedCheck(final SynonymRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymRefExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param refExceptId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectByPKValue(Long refExceptId) {
        return doSelectByPKValue(refExceptId, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectByPKValue(Long refExceptId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(refExceptId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param refExceptId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymRefExcept selectByPKValueWithDeletedCheck(Long refExceptId) {
        return doSelectByPKValueWithDeletedCheck(refExceptId, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> ENTITY doSelectByPKValueWithDeletedCheck(Long refExceptId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refExceptId), entityType);
    }

    private SynonymRefExceptCB buildPKCB(Long refExceptId) {
        assertObjectNotNull("refExceptId", refExceptId);
        SynonymRefExceptCB cb = newMyConditionBean();
        cb.query().setRefExceptId_Equal(refExceptId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymRefExcept&gt; synonymRefExceptList = synonymRefExceptBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymRefExcept synonymRefExcept : synonymRefExceptList) {
     *     ... = synonymRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymRefExcept> selectList(SynonymRefExceptCB cb) {
        return doSelectList(cb, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> ListResultBean<ENTITY> doSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SynonymRefExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymRefExcept&gt; page = synonymRefExceptBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymRefExcept synonymRefExcept : page) {
     *     ... = synonymRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymRefExcept> selectPage(SynonymRefExceptCB cb) {
        return doSelectPage(cb, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> PagingResultBean<ENTITY> doSelectPage(SynonymRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SynonymRefExceptCB>() {
            public int callbackSelectCount(SynonymRefExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymRefExcept&gt;() {
     *     public void handle(SynonymRefExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymRefExcept. (NotNull)
     */
    public void selectCursor(SynonymRefExceptCB cb, EntityRowHandler<SynonymRefExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymRefExcept.class);
    }

    protected <ENTITY extends SynonymRefExcept> void doSelectCursor(SynonymRefExceptCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<SynonymRefExcept>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, SynonymRefExceptCB>() {
            public void callbackSelectCursor(SynonymRefExceptCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(SynonymRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymRefExceptBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymRefExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymRefExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymRefExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends SynonymRefExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * Pull out the list of foreign table 'SynonymExcept'.
     * @param synonymRefExceptList The list of synonymRefExcept. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymExcept> pulloutSynonymExcept(List<SynonymRefExcept> synonymRefExceptList) {
        return helpPulloutInternally(synonymRefExceptList, new InternalPulloutCallback<SynonymRefExcept, SynonymExcept>() {
            public SynonymExcept getFr(SynonymRefExcept e) { return e.getSynonymExcept(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SynonymExcept e, List<SynonymRefExcept> ls)
            { e.setSynonymRefExceptList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refExceptId.
     * @param synonymRefExceptList The list of synonymRefExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefExceptIdList(List<SynonymRefExcept> synonymRefExceptList) {
        return helpExtractListInternally(synonymRefExceptList, new InternalExtractCallback<SynonymRefExcept, Long>() {
            public Long getCV(SynonymRefExcept e) { return e.getRefExceptId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymRefExcept.setFoo...(value);
     * synonymRefExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * synonymRefExceptBhv.<span style="color: #FD4747">insert</span>(synonymRefExcept);
     * ... = synonymRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymRefExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymRefExcept synonymRefExcept) {
        doInsert(synonymRefExcept, null);
    }

    protected void doInsert(SynonymRefExcept synonymRefExcept, InsertOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExcept", synonymRefExcept);
        prepareInsertOption(option);
        delegateInsert(synonymRefExcept, option);
    }

    protected void prepareInsertOption(InsertOption<SynonymRefExceptCB> option) {
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymRefExceptBhv.<span style="color: #FD4747">update</span>(synonymRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param synonymRefExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymRefExcept synonymRefExcept) {
        doUpdate(synonymRefExcept, null);
    }

    protected void doUpdate(SynonymRefExcept synonymRefExcept, final UpdateOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExcept", synonymRefExcept);
        prepareUpdateOption(option);
        helpUpdateInternally(synonymRefExcept, new InternalUpdateCallback<SynonymRefExcept>() {
            public int callbackDelegateUpdate(SynonymRefExcept entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymRefExceptCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymRefExceptCB createCBForVaryingUpdate() {
        SynonymRefExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymRefExceptCB createCBForSpecifiedUpdate() {
        SynonymRefExceptCB cb = newMyConditionBean();
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
     * @param synonymRefExcept The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymRefExcept synonymRefExcept) {
        doInesrtOrUpdate(synonymRefExcept, null, null);
    }

    protected void doInesrtOrUpdate(SynonymRefExcept synonymRefExcept, final InsertOption<SynonymRefExceptCB> insertOption, final UpdateOption<SynonymRefExceptCB> updateOption) {
        helpInsertOrUpdateInternally(synonymRefExcept, new InternalInsertOrUpdateCallback<SynonymRefExcept, SynonymRefExceptCB>() {
            public void callbackInsert(SynonymRefExcept entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(SynonymRefExcept entity) { doUpdate(entity, updateOption); }
            public SynonymRefExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymRefExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SynonymRefExceptCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SynonymRefExceptCB>() : updateOption;
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymRefExceptBhv.<span style="color: #FD4747">delete</span>(synonymRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param synonymRefExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymRefExcept synonymRefExcept) {
        doDelete(synonymRefExcept, null);
    }

    protected void doDelete(SynonymRefExcept synonymRefExcept, final DeleteOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExcept", synonymRefExcept);
        prepareDeleteOption(option);
        helpDeleteInternally(synonymRefExcept, new InternalDeleteCallback<SynonymRefExcept>() {
            public int callbackDelegateDelete(SynonymRefExcept entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymRefExceptCB> option) {
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
     *     SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     *     synonymRefExcept.setFooName("foo");
     *     if (...) {
     *         synonymRefExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymRefExceptList.add(synonymRefExcept);
     * }
     * synonymRefExceptBhv.<span style="color: #FD4747">batchInsert</span>(synonymRefExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymRefExcept> synonymRefExceptList) {
        InsertOption<SynonymRefExceptCB> option = createInsertUpdateOption();
        return doBatchInsert(synonymRefExceptList, option);
    }

    protected int[] doBatchInsert(List<SynonymRefExcept> synonymRefExceptList, InsertOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExceptList", synonymRefExceptList);
        prepareBatchInsertOption(synonymRefExceptList, option);
        return delegateBatchInsert(synonymRefExceptList, option);
    }

    protected void prepareBatchInsertOption(List<SynonymRefExcept> synonymRefExceptList, InsertOption<SynonymRefExceptCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymRefExceptList);
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
     *     SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     *     synonymRefExcept.setFooName("foo");
     *     if (...) {
     *         synonymRefExcept.setFooPrice(123);
     *     } else {
     *         synonymRefExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymRefExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymRefExceptList.add(synonymRefExcept);
     * }
     * synonymRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymRefExceptList);
     * </pre>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymRefExcept> synonymRefExceptList) {
        UpdateOption<SynonymRefExceptCB> option = createPlainUpdateOption();
        return doBatchUpdate(synonymRefExceptList, option);
    }

    protected int[] doBatchUpdate(List<SynonymRefExcept> synonymRefExceptList, UpdateOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExceptList", synonymRefExceptList);
        prepareBatchUpdateOption(synonymRefExceptList, option);
        return delegateBatchUpdate(synonymRefExceptList, option);
    }

    protected void prepareBatchUpdateOption(List<SynonymRefExcept> synonymRefExceptList, UpdateOption<SynonymRefExceptCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymRefExceptList);
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
     * synonymRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymRefExceptList, new SpecifyQuery<SynonymRefExceptCB>() {
     *     public void specify(SynonymRefExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * synonymRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymRefExceptList, new SpecifyQuery<SynonymRefExceptCB>() {
     *     public void specify(SynonymRefExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymRefExcept> synonymRefExceptList, SpecifyQuery<SynonymRefExceptCB> updateColumnSpec) {
        return doBatchUpdate(synonymRefExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymRefExcept> synonymRefExceptList) {
        return doBatchDelete(synonymRefExceptList, null);
    }

    protected int[] doBatchDelete(List<SynonymRefExcept> synonymRefExceptList, DeleteOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExceptList", synonymRefExceptList);
        prepareDeleteOption(option);
        return delegateBatchDelete(synonymRefExceptList, option);
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
     * synonymRefExceptBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymRefExcept, SynonymRefExceptCB&gt;() {
     *     public ConditionBean setup(synonymRefExcept entity, SynonymRefExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> setupper, InsertOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        SynonymRefExcept entity = new SynonymRefExcept();
        SynonymRefExceptCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SynonymRefExceptCB createCBForQueryInsert() {
        SynonymRefExceptCB cb = newMyConditionBean();
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setPK...(value);</span>
     * synonymRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setVersionNo(value);</span>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #FD4747">queryUpdate</span>(synonymRefExcept, cb);
     * </pre>
     * @param synonymRefExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymRefExcept synonymRefExcept, SynonymRefExceptCB cb) {
        return doQueryUpdate(synonymRefExcept, cb, null);
    }

    protected int doQueryUpdate(SynonymRefExcept synonymRefExcept, SynonymRefExceptCB cb, UpdateOption<SynonymRefExceptCB> option) {
        assertObjectNotNull("synonymRefExcept", synonymRefExcept); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymRefExcept, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SynonymRefExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SynonymRefExceptCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * synonymRefExceptBhv.<span style="color: #FD4747">queryDelete</span>(synonymRefExcept, cb);
     * </pre>
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymRefExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymRefExceptCB cb, DeleteOption<SynonymRefExceptCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SynonymRefExceptCB)cb); }
        else { return varyingQueryDelete((SynonymRefExceptCB)cb, downcast(option)); }
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymRefExcept.setFoo...(value);
     * synonymRefExcept.setBar...(value);
     * InsertOption<SynonymRefExceptCB> option = new InsertOption<SynonymRefExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymRefExceptBhv.<span style="color: #FD4747">varyingInsert</span>(synonymRefExcept, option);
     * ... = synonymRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymRefExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymRefExcept synonymRefExcept, InsertOption<SynonymRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymRefExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * synonymRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymRefExceptCB&gt; option = new UpdateOption&lt;SynonymRefExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymRefExceptCB&gt;() {
     *         public void specify(SynonymRefExceptCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymRefExceptBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymRefExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymRefExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymRefExcept synonymRefExcept, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymRefExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymRefExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymRefExcept synonymRefExcept, InsertOption<SynonymRefExceptCB> insertOption, UpdateOption<SynonymRefExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymRefExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymRefExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymRefExcept synonymRefExcept, DeleteOption<SynonymRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymRefExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymRefExcept> synonymRefExceptList, InsertOption<SynonymRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymRefExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymRefExcept> synonymRefExceptList, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymRefExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymRefExcept> synonymRefExceptList, DeleteOption<SynonymRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymRefExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> setupper, InsertOption<SynonymRefExceptCB> option) {
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
     * SynonymRefExcept synonymRefExcept = new SynonymRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setPK...(value);</span>
     * synonymRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymRefExcept.setVersionNo(value);</span>
     * SynonymRefExceptCB cb = new SynonymRefExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymRefExceptCB&gt; option = new UpdateOption&lt;SynonymRefExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymRefExceptCB&gt;() {
     *     public void specify(SynonymRefExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymRefExceptBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymRefExcept, cb, option);
     * </pre>
     * @param synonymRefExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymRefExcept synonymRefExcept, SynonymRefExceptCB cb, UpdateOption<SynonymRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymRefExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymRefExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymRefExceptCB cb, DeleteOption<SynonymRefExceptCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymRefExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymRefExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymRefExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymRefExcept> void delegateSelectCursor(SynonymRefExceptCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends SynonymRefExcept> List<ENTITY> delegateSelectList(SynonymRefExceptCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymRefExcept e, InsertOption<SynonymRefExceptCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(SynonymRefExcept e, UpdateOption<SynonymRefExceptCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(SynonymRefExcept e, UpdateOption<SynonymRefExceptCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(SynonymRefExcept e, DeleteOption<SynonymRefExceptCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(SynonymRefExcept e, DeleteOption<SynonymRefExceptCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<SynonymRefExcept> ls, InsertOption<SynonymRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymRefExcept> ls, UpdateOption<SynonymRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymRefExcept> ls, UpdateOption<SynonymRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymRefExcept> ls, DeleteOption<SynonymRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymRefExcept> ls, DeleteOption<SynonymRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymRefExcept e, SynonymRefExceptCB inCB, ConditionBean resCB, InsertOption<SynonymRefExceptCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymRefExcept e, SynonymRefExceptCB cb, UpdateOption<SynonymRefExceptCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SynonymRefExceptCB cb, DeleteOption<SynonymRefExceptCB> op)
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
    protected SynonymRefExcept downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, SynonymRefExcept.class);
    }

    protected SynonymRefExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymRefExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymRefExcept> downcast(List<? extends Entity> entityList) {
        return (List<SynonymRefExcept>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymRefExceptCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SynonymRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymRefExceptCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SynonymRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymRefExceptCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SynonymRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<SynonymRefExcept, SynonymRefExceptCB>)option;
    }
}
