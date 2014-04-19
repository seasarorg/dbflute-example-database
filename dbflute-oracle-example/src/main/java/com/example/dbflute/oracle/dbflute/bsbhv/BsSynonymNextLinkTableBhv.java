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
 * The behavior of SYNONYM_NEXT_LINK_TABLE as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsSynonymNextLinkTableBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_LINK_TABLE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymNextLinkTableDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkTableDbm getMyDBMeta() { return SynonymNextLinkTableDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkTable newMyEntity() { return new SynonymNextLinkTable(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkTableCB newMyConditionBean() { return new SynonymNextLinkTableCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkTableBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkTableCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextLinkTableCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextLinkTableCB cb) { // called by selectPage(cb)
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
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkTable synonymNextLinkTable = synonymNextLinkTableBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymNextLinkTable != null) {
     *     ... = synonymNextLinkTable.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectEntity(SynonymNextLinkTableCB cb) {
        return doSelectEntity(cb, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectEntity(SynonymNextLinkTableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymNextLinkTableCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkTableCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkTable synonymNextLinkTable = synonymNextLinkTableBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkTable.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectEntityWithDeletedCheck(SynonymNextLinkTableCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectEntityWithDeletedCheck(SynonymNextLinkTableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymNextLinkTableCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkTableCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectByPKValue(Long productId) {
        return doSelectByPKValue(productId, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectByPKValue(Long productId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(productId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkTable selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKValueWithDeletedCheck(productId, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> ENTITY doSelectByPKValueWithDeletedCheck(Long productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productId), entityType);
    }

    private SynonymNextLinkTableCB buildPKCB(Long productId) {
        assertObjectNotNull("productId", productId);
        SynonymNextLinkTableCB cb = newMyConditionBean();
        cb.query().setProductId_Equal(productId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkTable&gt; synonymNextLinkTableList = synonymNextLinkTableBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymNextLinkTable synonymNextLinkTable : synonymNextLinkTableList) {
     *     ... = synonymNextLinkTable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkTable> selectList(SynonymNextLinkTableCB cb) {
        return doSelectList(cb, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> ListResultBean<ENTITY> doSelectList(SynonymNextLinkTableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymNextLinkTableCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkTableCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkTable&gt; page = synonymNextLinkTableBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkTable synonymNextLinkTable : page) {
     *     ... = synonymNextLinkTable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkTable> selectPage(SynonymNextLinkTableCB cb) {
        return doSelectPage(cb, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> PagingResultBean<ENTITY> doSelectPage(SynonymNextLinkTableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymNextLinkTableCB>() {
            public int callbackSelectCount(SynonymNextLinkTableCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkTableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkTable&gt;() {
     *     public void handle(SynonymNextLinkTable entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkTable. (NotNull)
     */
    public void selectCursor(SynonymNextLinkTableCB cb, EntityRowHandler<SynonymNextLinkTable> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymNextLinkTable.class);
    }

    protected <ENTITY extends SynonymNextLinkTable> void doSelectCursor(SynonymNextLinkTableCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymNextLinkTableCB>() {
            public void callbackSelectCursor(SynonymNextLinkTableCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkTableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymNextLinkTableCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymNextLinkTableCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymNextLinkTableCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key productId.
     * @param synonymNextLinkTableList The list of synonymNextLinkTable. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return helpExtractListInternally(synonymNextLinkTableList, new InternalExtractCallback<SynonymNextLinkTable, Long>() {
            public Long getCV(SynonymNextLinkTable et) { return et.getProductId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkTable.setFoo...(value);
     * synonymNextLinkTable.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">insert</span>(synonymNextLinkTable);
     * ... = synonymNextLinkTable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkTable The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkTable synonymNextLinkTable) {
        doInsert(synonymNextLinkTable, null);
    }

    protected void doInsert(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareInsertOption(op);
        delegateInsert(synonymNextLinkTable, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextLinkTableCB> op) {
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
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkTable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkTableBhv.<span style="color: #FD4747">update</span>(synonymNextLinkTable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymNextLinkTable synonymNextLinkTable) {
        doUpdate(synonymNextLinkTable, null);
    }

    protected void doUpdate(SynonymNextLinkTable synonymNextLinkTable, final UpdateOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymNextLinkTable, new InternalUpdateCallback<SynonymNextLinkTable>() {
            public int callbackDelegateUpdate(SynonymNextLinkTable et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextLinkTableCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymNextLinkTableCB createCBForVaryingUpdate() {
        SynonymNextLinkTableCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymNextLinkTableCB createCBForSpecifiedUpdate() {
        SynonymNextLinkTableCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">updateNonstrict</span>(synonymNextLinkTable);
     * </pre>
     * @param synonymNextLinkTable The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final SynonymNextLinkTable synonymNextLinkTable) {
        doUpdateNonstrict(synonymNextLinkTable, null);
    }

    protected void doUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, final UpdateOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(synonymNextLinkTable, new InternalUpdateNonstrictCallback<SynonymNextLinkTable>() {
            public int callbackDelegateUpdateNonstrict(SynonymNextLinkTable et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkTable The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkTable synonymNextLinkTable) {
        doInesrtOrUpdate(synonymNextLinkTable, null, null);
    }

    protected void doInesrtOrUpdate(SynonymNextLinkTable synonymNextLinkTable, final InsertOption<SynonymNextLinkTableCB> iop, final UpdateOption<SynonymNextLinkTableCB> uop) {
        helpInsertOrUpdateInternally(synonymNextLinkTable, new InternalInsertOrUpdateCallback<SynonymNextLinkTable, SynonymNextLinkTableCB>() {
            public void callbackInsert(SynonymNextLinkTable et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymNextLinkTable et) { doUpdate(et, uop); }
            public SynonymNextLinkTableCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymNextLinkTableCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextLinkTableCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextLinkTableCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkTable The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable) {
        doInesrtOrUpdateNonstrict(synonymNextLinkTable, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, final InsertOption<SynonymNextLinkTableCB> iop, final UpdateOption<SynonymNextLinkTableCB> uop) {
        helpInsertOrUpdateInternally(synonymNextLinkTable, new InternalInsertOrUpdateNonstrictCallback<SynonymNextLinkTable>() {
            public void callbackInsert(SynonymNextLinkTable et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(SynonymNextLinkTable et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextLinkTableCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextLinkTableCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkTable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkTableBhv.<span style="color: #FD4747">delete</span>(synonymNextLinkTable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkTable synonymNextLinkTable) {
        doDelete(synonymNextLinkTable, null);
    }

    protected void doDelete(SynonymNextLinkTable synonymNextLinkTable, final DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymNextLinkTable, new InternalDeleteCallback<SynonymNextLinkTable>() {
            public int callbackDelegateDelete(SynonymNextLinkTable et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextLinkTableCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">deleteNonstrict</span>(synonymNextLinkTable);
     * </pre>
     * @param synonymNextLinkTable The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymNextLinkTable synonymNextLinkTable) {
        doDeleteNonstrict(synonymNextLinkTable, null);
    }

    protected void doDeleteNonstrict(SynonymNextLinkTable synonymNextLinkTable, final DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(synonymNextLinkTable, new InternalDeleteNonstrictCallback<SynonymNextLinkTable>() {
            public int callbackDelegateDeleteNonstrict(SynonymNextLinkTable et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(synonymNextLinkTable);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymNextLinkTable The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymNextLinkTable synonymNextLinkTable) {
        doDeleteNonstrictIgnoreDeleted(synonymNextLinkTable, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymNextLinkTable synonymNextLinkTable, final DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(synonymNextLinkTable, new InternalDeleteNonstrictIgnoreDeletedCallback<SynonymNextLinkTable>() {
            public int callbackDelegateDeleteNonstrict(SynonymNextLinkTable et) { return delegateDeleteNonstrict(et, op); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { deleteNonstrict(downcast(et)); }
        else { varyingDeleteNonstrict(downcast(et), downcast(op)); }
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
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchInsert</span>(synonymNextLinkTableList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        InsertOption<SynonymNextLinkTableCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymNextLinkTableList, op);
    }

    protected int[] doBatchInsert(List<SynonymNextLinkTable> synonymNextLinkTableList, InsertOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTableList", synonymNextLinkTableList);
        prepareBatchInsertOption(synonymNextLinkTableList, op);
        return delegateBatchInsert(synonymNextLinkTableList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymNextLinkTable> synonymNextLinkTableList, InsertOption<SynonymNextLinkTableCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymNextLinkTableList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     } else {
     *         synonymNextLinkTable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkTable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkTableList);
     * </pre>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        UpdateOption<SynonymNextLinkTableCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymNextLinkTableList, op);
    }

    protected int[] doBatchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTableList", synonymNextLinkTableList);
        prepareBatchUpdateOption(synonymNextLinkTableList, op);
        return delegateBatchUpdate(synonymNextLinkTableList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymNextLinkTableList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList, SpecifyQuery<SynonymNextLinkTableCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkTableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     *     synonymNextLinkTable.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkTable.setFooPrice(123);
     *     } else {
     *         synonymNextLinkTable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkTable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkTableList.add(synonymNextLinkTable);
     * }
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkTableList);
     * </pre>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        UpdateOption<SynonymNextLinkTableCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(synonymNextLinkTableList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTableList", synonymNextLinkTableList);
        prepareBatchUpdateOption(synonymNextLinkTableList, op);
        return delegateBatchUpdateNonstrict(synonymNextLinkTableList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(synonymNextLinkTableList, new SpecifyQuery<SynonymNextLinkTableCB>() {
     *     public void specify(SynonymNextLinkTableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, SpecifyQuery<SynonymNextLinkTableCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymNextLinkTableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchDelete(synonymNextLinkTableList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTableList", synonymNextLinkTableList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymNextLinkTableList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList) {
        return doBatchDeleteNonstrict(synonymNextLinkTableList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTableList", synonymNextLinkTableList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(synonymNextLinkTableList, op);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkTable, SynonymNextLinkTableCB&gt;() {
     *     public ConditionBean setup(synonymNextLinkTable entity, SynonymNextLinkTableCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> sp, InsertOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymNextLinkTable e = new SynonymNextLinkTable();
        SynonymNextLinkTableCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymNextLinkTableCB createCBForQueryInsert() {
        SynonymNextLinkTableCB cb = newMyConditionBean();
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
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setPK...(value);</span>
     * synonymNextLinkTable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #FD4747">queryUpdate</span>(synonymNextLinkTable, cb);
     * </pre>
     * @param synonymNextLinkTable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkTable synonymNextLinkTable, SynonymNextLinkTableCB cb) {
        return doQueryUpdate(synonymNextLinkTable, cb, null);
    }

    protected int doQueryUpdate(SynonymNextLinkTable synonymNextLinkTable, SynonymNextLinkTableCB cb, UpdateOption<SynonymNextLinkTableCB> op) {
        assertObjectNotNull("synonymNextLinkTable", synonymNextLinkTable); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymNextLinkTable, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymNextLinkTableCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymNextLinkTableCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkTableBhv.<span style="color: #FD4747">queryDelete</span>(synonymNextLinkTable, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkTableCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextLinkTableCB cb, DeleteOption<SynonymNextLinkTableCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymNextLinkTableCB)cb); }
        else { return varyingQueryDelete((SynonymNextLinkTableCB)cb, downcast(op)); }
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
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkTable.setFoo...(value);
     * synonymNextLinkTable.setBar...(value);
     * InsertOption<SynonymNextLinkTableCB> option = new InsertOption<SynonymNextLinkTableCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkTableBhv.<span style="color: #FD4747">varyingInsert</span>(synonymNextLinkTable, option);
     * ... = synonymNextLinkTable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkTable The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkTable, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkTable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *         public void specify(SynonymNextLinkTableCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkTableBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymNextLinkTable, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkTable The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkTable synonymNextLinkTable, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkTable, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * synonymNextLinkTable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *     public void specify(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(synonymNextLinkTable, option);
     * </pre>
     * @param synonymNextLinkTable The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymNextLinkTable, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkTable The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> insertOption, UpdateOption<SynonymNextLinkTableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymNextLinkTable, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymNextLinkTable The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymNextLinkTable synonymNextLinkTable, InsertOption<SynonymNextLinkTableCB> insertOption, UpdateOption<SynonymNextLinkTableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(synonymNextLinkTable, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkTable The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkTable synonymNextLinkTable, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkTable, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymNextLinkTable The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymNextLinkTable synonymNextLinkTable, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymNextLinkTable, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkTable> synonymNextLinkTableList, InsertOption<SynonymNextLinkTableCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkTableList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkTableList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymNextLinkTableList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkTableList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymNextLinkTableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymNextLinkTable> synonymNextLinkTableList, DeleteOption<SynonymNextLinkTableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymNextLinkTableList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> setupper, InsertOption<SynonymNextLinkTableCB> option) {
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
     * SynonymNextLinkTable synonymNextLinkTable = new SynonymNextLinkTable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setPK...(value);</span>
     * synonymNextLinkTable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkTable.setVersionNo(value);</span>
     * SynonymNextLinkTableCB cb = new SynonymNextLinkTableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkTableCB&gt; option = new UpdateOption&lt;SynonymNextLinkTableCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkTableCB&gt;() {
     *     public void specify(SynonymNextLinkTableCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkTableBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymNextLinkTable, cb, option);
     * </pre>
     * @param synonymNextLinkTable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkTable synonymNextLinkTable, SynonymNextLinkTableCB cb, UpdateOption<SynonymNextLinkTableCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkTable, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextLinkTable. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkTableCB cb, DeleteOption<SynonymNextLinkTableCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkTableBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymNextLinkTableCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymNextLinkTableCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymNextLinkTable> void delegateSelectCursor(SynonymNextLinkTableCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymNextLinkTable> List<ENTITY> delegateSelectList(SynonymNextLinkTableCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymNextLinkTable et, InsertOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymNextLinkTable et, UpdateOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(SynonymNextLinkTable et, UpdateOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymNextLinkTable et, DeleteOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(SynonymNextLinkTable et, DeleteOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymNextLinkTable> ls, InsertOption<SynonymNextLinkTableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymNextLinkTable> ls, UpdateOption<SynonymNextLinkTableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymNextLinkTable> ls, UpdateOption<SynonymNextLinkTableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymNextLinkTable> ls, DeleteOption<SynonymNextLinkTableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymNextLinkTable> ls, DeleteOption<SynonymNextLinkTableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymNextLinkTable et, SynonymNextLinkTableCB inCB, ConditionBean resCB, InsertOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymNextLinkTable et, SynonymNextLinkTableCB cb, UpdateOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymNextLinkTableCB cb, DeleteOption<SynonymNextLinkTableCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return !(downcast(et).getVersionNo() + "").equals("null");// For primitive type
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
    protected SynonymNextLinkTable downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymNextLinkTable.class);
    }

    protected SynonymNextLinkTableCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymNextLinkTableCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymNextLinkTable> downcast(List<? extends Entity> ls) {
        return (List<SynonymNextLinkTable>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextLinkTableCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymNextLinkTableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextLinkTableCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymNextLinkTableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextLinkTableCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymNextLinkTableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymNextLinkTable, SynonymNextLinkTableCB>)sp;
    }
}
