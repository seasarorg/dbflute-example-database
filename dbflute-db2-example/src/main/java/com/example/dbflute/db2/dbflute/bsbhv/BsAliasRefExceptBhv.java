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
 * The behavior of ALIAS_REF_EXCEPT as ALIAS. <br />
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
 *     ALIAS_EXCEPT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     aliasExcept
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasRefExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "ALIAS_REF_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return AliasRefExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasRefExceptDbm getMyDBMeta() { return AliasRefExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public AliasRefExcept newMyEntity() { return new AliasRefExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public AliasRefExceptCB newMyConditionBean() { return new AliasRefExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * int count = aliasRefExceptBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasRefExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(AliasRefExceptCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(AliasRefExceptCB cb) { // called by selectPage(cb)
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
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * AliasRefExcept aliasRefExcept = aliasRefExceptBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (aliasRefExcept != null) {
     *     ... = aliasRefExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntity(AliasRefExceptCB cb) {
        return doSelectEntity(cb, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> ENTITY doSelectEntity(final AliasRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, AliasRefExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * AliasRefExcept aliasRefExcept = aliasRefExceptBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasRefExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasRefExcept selectEntityWithDeletedCheck(AliasRefExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> ENTITY doSelectEntityWithDeletedCheck(final AliasRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, AliasRefExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
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
    public AliasRefExcept selectByPKValue(Long refExceptId) {
        return doSelectByPKValue(refExceptId, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> ENTITY doSelectByPKValue(Long refExceptId, Class<ENTITY> entityType) {
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
    public AliasRefExcept selectByPKValueWithDeletedCheck(Long refExceptId) {
        return doSelectByPKValueWithDeletedCheck(refExceptId, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> ENTITY doSelectByPKValueWithDeletedCheck(Long refExceptId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(refExceptId), entityType);
    }

    private AliasRefExceptCB buildPKCB(Long refExceptId) {
        assertObjectNotNull("refExceptId", refExceptId);
        AliasRefExceptCB cb = newMyConditionBean();
        cb.query().setRefExceptId_Equal(refExceptId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;AliasRefExcept&gt; aliasRefExceptList = aliasRefExceptBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (AliasRefExcept aliasRefExcept : aliasRefExceptList) {
     *     ... = aliasRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasRefExcept> selectList(AliasRefExceptCB cb) {
        return doSelectList(cb, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> ListResultBean<ENTITY> doSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, AliasRefExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasRefExcept&gt; page = aliasRefExceptBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (AliasRefExcept aliasRefExcept : page) {
     *     ... = aliasRefExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasRefExcept> selectPage(AliasRefExceptCB cb) {
        return doSelectPage(cb, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> PagingResultBean<ENTITY> doSelectPage(AliasRefExceptCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, AliasRefExceptCB>() {
            public int callbackSelectCount(AliasRefExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * aliasRefExceptBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasRefExcept&gt;() {
     *     public void handle(AliasRefExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasRefExcept. (NotNull)
     */
    public void selectCursor(AliasRefExceptCB cb, EntityRowHandler<AliasRefExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, AliasRefExcept.class);
    }

    protected <ENTITY extends AliasRefExcept> void doSelectCursor(AliasRefExceptCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<AliasRefExcept>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, AliasRefExceptCB>() {
            public void callbackSelectCursor(AliasRefExceptCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(AliasRefExceptCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * aliasRefExceptBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasRefExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<AliasRefExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends AliasRefExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends AliasRefExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * Pull out the list of foreign table 'AliasExcept'.
     * @param aliasRefExceptList The list of aliasRefExcept. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<AliasExcept> pulloutAliasExcept(List<AliasRefExcept> aliasRefExceptList) {
        return helpPulloutInternally(aliasRefExceptList, new InternalPulloutCallback<AliasRefExcept, AliasExcept>() {
            public AliasExcept getFr(AliasRefExcept e) { return e.getAliasExcept(); }
            public boolean hasRf() { return true; }
            public void setRfLs(AliasExcept e, List<AliasRefExcept> ls)
            { e.setAliasRefExceptList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key refExceptId.
     * @param aliasRefExceptList The list of aliasRefExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractRefExceptIdList(List<AliasRefExcept> aliasRefExceptList) {
        return helpExtractListInternally(aliasRefExceptList, new InternalExtractCallback<AliasRefExcept, Long>() {
            public Long getCV(AliasRefExcept e) { return e.getRefExceptId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasRefExcept.setFoo...(value);
     * aliasRefExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * aliasRefExceptBhv.<span style="color: #FD4747">insert</span>(aliasRefExcept);
     * ... = aliasRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasRefExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasRefExcept aliasRefExcept) {
        doInsert(aliasRefExcept, null);
    }

    protected void doInsert(AliasRefExcept aliasRefExcept, InsertOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExcept", aliasRefExcept);
        prepareInsertOption(option);
        delegateInsert(aliasRefExcept, option);
    }

    protected void prepareInsertOption(InsertOption<AliasRefExceptCB> option) {
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
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasRefExceptBhv.<span style="color: #FD4747">update</span>(aliasRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param aliasRefExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final AliasRefExcept aliasRefExcept) {
        doUpdate(aliasRefExcept, null);
    }

    protected void doUpdate(AliasRefExcept aliasRefExcept, final UpdateOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExcept", aliasRefExcept);
        prepareUpdateOption(option);
        helpUpdateInternally(aliasRefExcept, new InternalUpdateCallback<AliasRefExcept>() {
            public int callbackDelegateUpdate(AliasRefExcept entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<AliasRefExceptCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected AliasRefExceptCB createCBForVaryingUpdate() {
        AliasRefExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected AliasRefExceptCB createCBForSpecifiedUpdate() {
        AliasRefExceptCB cb = newMyConditionBean();
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
     * @param aliasRefExcept The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasRefExcept aliasRefExcept) {
        doInesrtOrUpdate(aliasRefExcept, null, null);
    }

    protected void doInesrtOrUpdate(AliasRefExcept aliasRefExcept, final InsertOption<AliasRefExceptCB> insertOption, final UpdateOption<AliasRefExceptCB> updateOption) {
        helpInsertOrUpdateInternally(aliasRefExcept, new InternalInsertOrUpdateCallback<AliasRefExcept, AliasRefExceptCB>() {
            public void callbackInsert(AliasRefExcept entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(AliasRefExcept entity) { doUpdate(entity, updateOption); }
            public AliasRefExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(AliasRefExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<AliasRefExceptCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<AliasRefExceptCB>() : updateOption;
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
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasRefExceptBhv.<span style="color: #FD4747">delete</span>(aliasRefExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param aliasRefExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasRefExcept aliasRefExcept) {
        doDelete(aliasRefExcept, null);
    }

    protected void doDelete(AliasRefExcept aliasRefExcept, final DeleteOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExcept", aliasRefExcept);
        prepareDeleteOption(option);
        helpDeleteInternally(aliasRefExcept, new InternalDeleteCallback<AliasRefExcept>() {
            public int callbackDelegateDelete(AliasRefExcept entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<AliasRefExceptCB> option) {
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
     *     AliasRefExcept aliasRefExcept = new AliasRefExcept();
     *     aliasRefExcept.setFooName("foo");
     *     if (...) {
     *         aliasRefExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasRefExceptList.add(aliasRefExcept);
     * }
     * aliasRefExceptBhv.<span style="color: #FD4747">batchInsert</span>(aliasRefExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasRefExcept> aliasRefExceptList) {
        InsertOption<AliasRefExceptCB> option = createInsertUpdateOption();
        return doBatchInsert(aliasRefExceptList, option);
    }

    protected int[] doBatchInsert(List<AliasRefExcept> aliasRefExceptList, InsertOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExceptList", aliasRefExceptList);
        prepareBatchInsertOption(aliasRefExceptList, option);
        return delegateBatchInsert(aliasRefExceptList, option);
    }

    protected void prepareBatchInsertOption(List<AliasRefExcept> aliasRefExceptList, InsertOption<AliasRefExceptCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(aliasRefExceptList);
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
     *     AliasRefExcept aliasRefExcept = new AliasRefExcept();
     *     aliasRefExcept.setFooName("foo");
     *     if (...) {
     *         aliasRefExcept.setFooPrice(123);
     *     } else {
     *         aliasRefExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasRefExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasRefExceptList.add(aliasRefExcept);
     * }
     * aliasRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasRefExceptList);
     * </pre>
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasRefExcept> aliasRefExceptList) {
        UpdateOption<AliasRefExceptCB> option = createPlainUpdateOption();
        return doBatchUpdate(aliasRefExceptList, option);
    }

    protected int[] doBatchUpdate(List<AliasRefExcept> aliasRefExceptList, UpdateOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExceptList", aliasRefExceptList);
        prepareBatchUpdateOption(aliasRefExceptList, option);
        return delegateBatchUpdate(aliasRefExceptList, option);
    }

    protected void prepareBatchUpdateOption(List<AliasRefExcept> aliasRefExceptList, UpdateOption<AliasRefExceptCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(aliasRefExceptList);
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
     * aliasRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasRefExceptList, new SpecifyQuery<AliasRefExceptCB>() {
     *     public void specify(AliasRefExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * aliasRefExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasRefExceptList, new SpecifyQuery<AliasRefExceptCB>() {
     *     public void specify(AliasRefExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasRefExcept> aliasRefExceptList, SpecifyQuery<AliasRefExceptCB> updateColumnSpec) {
        return doBatchUpdate(aliasRefExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<AliasRefExcept> aliasRefExceptList) {
        return doBatchDelete(aliasRefExceptList, null);
    }

    protected int[] doBatchDelete(List<AliasRefExcept> aliasRefExceptList, DeleteOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExceptList", aliasRefExceptList);
        prepareDeleteOption(option);
        return delegateBatchDelete(aliasRefExceptList, option);
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
     * aliasRefExceptBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasRefExcept, AliasRefExceptCB&gt;() {
     *     public ConditionBean setup(aliasRefExcept entity, AliasRefExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> setupper, InsertOption<AliasRefExceptCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        AliasRefExcept entity = new AliasRefExcept();
        AliasRefExceptCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected AliasRefExceptCB createCBForQueryInsert() {
        AliasRefExceptCB cb = newMyConditionBean();
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
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * aliasRefExceptBhv.<span style="color: #FD4747">queryUpdate</span>(aliasRefExcept, cb);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasRefExcept aliasRefExcept, AliasRefExceptCB cb) {
        return doQueryUpdate(aliasRefExcept, cb, null);
    }

    protected int doQueryUpdate(AliasRefExcept aliasRefExcept, AliasRefExceptCB cb, UpdateOption<AliasRefExceptCB> option) {
        assertObjectNotNull("aliasRefExcept", aliasRefExcept); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(aliasRefExcept, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (AliasRefExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (AliasRefExceptCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * aliasRefExceptBhv.<span style="color: #FD4747">queryDelete</span>(aliasRefExcept, cb);
     * </pre>
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasRefExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(AliasRefExceptCB cb, DeleteOption<AliasRefExceptCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((AliasRefExceptCB)cb); }
        else { return varyingQueryDelete((AliasRefExceptCB)cb, downcast(option)); }
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
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasRefExcept.setFoo...(value);
     * aliasRefExcept.setBar...(value);
     * InsertOption<AliasRefExceptCB> option = new InsertOption<AliasRefExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasRefExceptBhv.<span style="color: #FD4747">varyingInsert</span>(aliasRefExcept, option);
     * ... = aliasRefExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasRefExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasRefExcept aliasRefExcept, InsertOption<AliasRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(aliasRefExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * aliasRefExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasRefExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasRefExceptCB&gt; option = new UpdateOption&lt;AliasRefExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasRefExceptCB&gt;() {
     *         public void specify(AliasRefExceptCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasRefExceptBhv.<span style="color: #FD4747">varyingUpdate</span>(aliasRefExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasRefExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasRefExcept aliasRefExcept, UpdateOption<AliasRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(aliasRefExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasRefExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasRefExcept aliasRefExcept, InsertOption<AliasRefExceptCB> insertOption, UpdateOption<AliasRefExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(aliasRefExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasRefExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasRefExcept aliasRefExcept, DeleteOption<AliasRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasRefExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasRefExcept> aliasRefExceptList, InsertOption<AliasRefExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(aliasRefExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasRefExcept> aliasRefExceptList, UpdateOption<AliasRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(aliasRefExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param aliasRefExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasRefExcept> aliasRefExceptList, DeleteOption<AliasRefExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(aliasRefExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> setupper, InsertOption<AliasRefExceptCB> option) {
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
     * AliasRefExcept aliasRefExcept = new AliasRefExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setPK...(value);</span>
     * aliasRefExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasRefExcept.setVersionNo(value);</span>
     * AliasRefExceptCB cb = new AliasRefExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasRefExceptCB&gt; option = new UpdateOption&lt;AliasRefExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasRefExceptCB&gt;() {
     *     public void specify(AliasRefExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasRefExceptBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(aliasRefExcept, cb, option);
     * </pre>
     * @param aliasRefExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasRefExcept aliasRefExcept, AliasRefExceptCB cb, UpdateOption<AliasRefExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(aliasRefExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasRefExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasRefExceptCB cb, DeleteOption<AliasRefExceptCB> option) {
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
    public OutsideSqlBasicExecutor<AliasRefExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(AliasRefExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(AliasRefExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends AliasRefExcept> void delegateSelectCursor(AliasRefExceptCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends AliasRefExcept> List<ENTITY> delegateSelectList(AliasRefExceptCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(AliasRefExcept e, InsertOption<AliasRefExceptCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(AliasRefExcept e, UpdateOption<AliasRefExceptCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(AliasRefExcept e, UpdateOption<AliasRefExceptCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(AliasRefExcept e, DeleteOption<AliasRefExceptCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(AliasRefExcept e, DeleteOption<AliasRefExceptCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<AliasRefExcept> ls, InsertOption<AliasRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<AliasRefExcept> ls, UpdateOption<AliasRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<AliasRefExcept> ls, UpdateOption<AliasRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<AliasRefExcept> ls, DeleteOption<AliasRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<AliasRefExcept> ls, DeleteOption<AliasRefExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(AliasRefExcept e, AliasRefExceptCB inCB, ConditionBean resCB, InsertOption<AliasRefExceptCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(AliasRefExcept e, AliasRefExceptCB cb, UpdateOption<AliasRefExceptCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(AliasRefExceptCB cb, DeleteOption<AliasRefExceptCB> op)
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
    protected AliasRefExcept downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, AliasRefExcept.class);
    }

    protected AliasRefExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, AliasRefExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<AliasRefExcept> downcast(List<? extends Entity> entityList) {
        return (List<AliasRefExcept>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<AliasRefExceptCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<AliasRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasRefExceptCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<AliasRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasRefExceptCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<AliasRefExceptCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<AliasRefExcept, AliasRefExceptCB>)option;
    }
}
