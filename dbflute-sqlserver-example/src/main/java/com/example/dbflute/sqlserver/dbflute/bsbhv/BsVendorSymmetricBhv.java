package com.example.dbflute.sqlserver.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.sqlserver.dbflute.exbhv.*;
import com.example.dbflute.sqlserver.dbflute.exentity.*;
import com.example.dbflute.sqlserver.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.sqlserver.dbflute.cbean.*;

/**
 * The behavior of VENDOR_SYMMETRIC as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_SYMMETRIC_ID
 *
 * [column]
 *     VENDOR_SYMMETRIC_ID, PLAIN_TEXT, ENCRYPTED_DATA
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
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorSymmetricBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    public static final String PATH_various_vendorcheck_executeSymmetricOpen = "various:vendorcheck:executeSymmetricOpen";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_SYMMETRIC"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorSymmetricDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorSymmetricDbm getMyDBMeta() { return VendorSymmetricDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorSymmetric newMyEntity() { return new VendorSymmetric(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorSymmetricCB newMyConditionBean() { return new VendorSymmetricCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * int count = vendorSymmetricBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorSymmetricCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorSymmetricCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorSymmetricCB cb) { // called by selectPage(cb)
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
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * VendorSymmetric vendorSymmetric = vendorSymmetricBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorSymmetric != null) {
     *     ... = vendorSymmetric.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectEntity(VendorSymmetricCB cb) {
        return doSelectEntity(cb, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectEntity(final VendorSymmetricCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, VendorSymmetricCB>() {
            public List<ENTITY> callbackSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * VendorSymmetric vendorSymmetric = vendorSymmetricBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorSymmetric.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectEntityWithDeletedCheck(VendorSymmetricCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectEntityWithDeletedCheck(final VendorSymmetricCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorSymmetricCB>() {
            public List<ENTITY> callbackSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorSymmetricId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectByPKValue(Long vendorSymmetricId) {
        return doSelectByPKValue(vendorSymmetricId, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectByPKValue(Long vendorSymmetricId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(vendorSymmetricId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorSymmetricId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSymmetric selectByPKValueWithDeletedCheck(Long vendorSymmetricId) {
        return doSelectByPKValueWithDeletedCheck(vendorSymmetricId, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> ENTITY doSelectByPKValueWithDeletedCheck(Long vendorSymmetricId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(vendorSymmetricId), entityType);
    }

    private VendorSymmetricCB buildPKCB(Long vendorSymmetricId) {
        assertObjectNotNull("vendorSymmetricId", vendorSymmetricId);
        VendorSymmetricCB cb = newMyConditionBean();
        cb.query().setVendorSymmetricId_Equal(vendorSymmetricId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorSymmetric&gt; vendorSymmetricList = vendorSymmetricBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorSymmetric vendorSymmetric : vendorSymmetricList) {
     *     ... = vendorSymmetric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorSymmetric> selectList(VendorSymmetricCB cb) {
        return doSelectList(cb, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> ListResultBean<ENTITY> doSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, VendorSymmetricCB>() {
            public List<ENTITY> callbackSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorSymmetric&gt; page = vendorSymmetricBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorSymmetric vendorSymmetric : page) {
     *     ... = vendorSymmetric.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorSymmetric> selectPage(VendorSymmetricCB cb) {
        return doSelectPage(cb, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> PagingResultBean<ENTITY> doSelectPage(VendorSymmetricCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, VendorSymmetricCB>() {
            public int callbackSelectCount(VendorSymmetricCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorSymmetric&gt;() {
     *     public void handle(VendorSymmetric entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorSymmetric. (NotNull)
     */
    public void selectCursor(VendorSymmetricCB cb, EntityRowHandler<VendorSymmetric> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorSymmetric.class);
    }

    protected <ENTITY extends VendorSymmetric> void doSelectCursor(VendorSymmetricCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, VendorSymmetricCB>() {
            public void callbackSelectCursor(VendorSymmetricCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(VendorSymmetricCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorSymmetricBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorSymmetricCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorSymmetricCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorSymmetricCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends VendorSymmetricCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key vendorSymmetricId.
     * @param vendorSymmetricList The list of vendorSymmetric. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorSymmetricIdList(List<VendorSymmetric> vendorSymmetricList) {
        return helpExtractListInternally(vendorSymmetricList, new InternalExtractCallback<VendorSymmetric, Long>() {
            public Long getCV(VendorSymmetric et) { return et.getVendorSymmetricId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSymmetric.setFoo...(value);
     * vendorSymmetric.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * vendorSymmetricBhv.<span style="color: #FD4747">insert</span>(vendorSymmetric);
     * ... = vendorSymmetric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorSymmetric The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorSymmetric vendorSymmetric) {
        doInsert(vendorSymmetric, null);
    }

    protected void doInsert(VendorSymmetric vendorSymmetric, InsertOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetric", vendorSymmetric);
        prepareInsertOption(op);
        delegateInsert(vendorSymmetric, op);
    }

    protected void prepareInsertOption(InsertOption<VendorSymmetricCB> op) {
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSymmetric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSymmetric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorSymmetricBhv.<span style="color: #FD4747">update</span>(vendorSymmetric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorSymmetric vendorSymmetric) {
        doUpdate(vendorSymmetric, null);
    }

    protected void doUpdate(VendorSymmetric vendorSymmetric, final UpdateOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetric", vendorSymmetric);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorSymmetric, new InternalUpdateCallback<VendorSymmetric>() {
            public int callbackDelegateUpdate(VendorSymmetric et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorSymmetricCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorSymmetricCB createCBForVaryingUpdate() {
        VendorSymmetricCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorSymmetricCB createCBForSpecifiedUpdate() {
        VendorSymmetricCB cb = newMyConditionBean();
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
     * @param vendorSymmetric The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorSymmetric vendorSymmetric) {
        doInesrtOrUpdate(vendorSymmetric, null, null);
    }

    protected void doInesrtOrUpdate(VendorSymmetric vendorSymmetric, final InsertOption<VendorSymmetricCB> iop, final UpdateOption<VendorSymmetricCB> uop) {
        helpInsertOrUpdateInternally(vendorSymmetric, new InternalInsertOrUpdateCallback<VendorSymmetric, VendorSymmetricCB>() {
            public void callbackInsert(VendorSymmetric et) { doInsert(et, iop); }
            public void callbackUpdate(VendorSymmetric et) { doUpdate(et, uop); }
            public VendorSymmetricCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorSymmetricCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<VendorSymmetricCB>();
            uop = uop != null ? uop : new UpdateOption<VendorSymmetricCB>();
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSymmetric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorSymmetricBhv.<span style="color: #FD4747">delete</span>(vendorSymmetric);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorSymmetric vendorSymmetric) {
        doDelete(vendorSymmetric, null);
    }

    protected void doDelete(VendorSymmetric vendorSymmetric, final DeleteOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetric", vendorSymmetric);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorSymmetric, new InternalDeleteCallback<VendorSymmetric>() {
            public int callbackDelegateDelete(VendorSymmetric et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorSymmetricCB> op) {
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
     *     VendorSymmetric vendorSymmetric = new VendorSymmetric();
     *     vendorSymmetric.setFooName("foo");
     *     if (...) {
     *         vendorSymmetric.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorSymmetricList.add(vendorSymmetric);
     * }
     * vendorSymmetricBhv.<span style="color: #FD4747">batchInsert</span>(vendorSymmetricList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorSymmetric> vendorSymmetricList) {
        InsertOption<VendorSymmetricCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorSymmetricList, op);
    }

    protected int[] doBatchInsert(List<VendorSymmetric> vendorSymmetricList, InsertOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetricList", vendorSymmetricList);
        prepareBatchInsertOption(vendorSymmetricList, op);
        return delegateBatchInsert(vendorSymmetricList, op);
    }

    protected void prepareBatchInsertOption(List<VendorSymmetric> vendorSymmetricList, InsertOption<VendorSymmetricCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorSymmetricList);
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
     *     VendorSymmetric vendorSymmetric = new VendorSymmetric();
     *     vendorSymmetric.setFooName("foo");
     *     if (...) {
     *         vendorSymmetric.setFooPrice(123);
     *     } else {
     *         vendorSymmetric.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorSymmetric.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorSymmetricList.add(vendorSymmetric);
     * }
     * vendorSymmetricBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSymmetricList);
     * </pre>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorSymmetric> vendorSymmetricList) {
        UpdateOption<VendorSymmetricCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorSymmetricList, op);
    }

    protected int[] doBatchUpdate(List<VendorSymmetric> vendorSymmetricList, UpdateOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetricList", vendorSymmetricList);
        prepareBatchUpdateOption(vendorSymmetricList, op);
        return delegateBatchUpdate(vendorSymmetricList, op);
    }

    protected void prepareBatchUpdateOption(List<VendorSymmetric> vendorSymmetricList, UpdateOption<VendorSymmetricCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorSymmetricList);
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
     * vendorSymmetricBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSymmetricList, new SpecifyQuery<VendorSymmetricCB>() {
     *     public void specify(VendorSymmetricCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorSymmetricBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSymmetricList, new SpecifyQuery<VendorSymmetricCB>() {
     *     public void specify(VendorSymmetricCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorSymmetric> vendorSymmetricList, SpecifyQuery<VendorSymmetricCB> updateColumnSpec) {
        return doBatchUpdate(vendorSymmetricList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorSymmetric> vendorSymmetricList) {
        return doBatchDelete(vendorSymmetricList, null);
    }

    protected int[] doBatchDelete(List<VendorSymmetric> vendorSymmetricList, DeleteOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetricList", vendorSymmetricList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorSymmetricList, op);
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
     * vendorSymmetricBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorSymmetric, VendorSymmetricCB&gt;() {
     *     public ConditionBean setup(vendorSymmetric entity, VendorSymmetricCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> sp, InsertOption<VendorSymmetricCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        VendorSymmetric e = new VendorSymmetric();
        VendorSymmetricCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected VendorSymmetricCB createCBForQueryInsert() {
        VendorSymmetricCB cb = newMyConditionBean();
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setPK...(value);</span>
     * vendorSymmetric.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setVersionNo(value);</span>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #FD4747">queryUpdate</span>(vendorSymmetric, cb);
     * </pre>
     * @param vendorSymmetric The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorSymmetric vendorSymmetric, VendorSymmetricCB cb) {
        return doQueryUpdate(vendorSymmetric, cb, null);
    }

    protected int doQueryUpdate(VendorSymmetric vendorSymmetric, VendorSymmetricCB cb, UpdateOption<VendorSymmetricCB> op) {
        assertObjectNotNull("vendorSymmetric", vendorSymmetric); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorSymmetric, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (VendorSymmetricCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (VendorSymmetricCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * vendorSymmetricBhv.<span style="color: #FD4747">queryDelete</span>(vendorSymmetric, cb);
     * </pre>
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorSymmetricCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorSymmetricCB cb, DeleteOption<VendorSymmetricCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((VendorSymmetricCB)cb); }
        else { return varyingQueryDelete((VendorSymmetricCB)cb, downcast(op)); }
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSymmetric.setFoo...(value);
     * vendorSymmetric.setBar...(value);
     * InsertOption<VendorSymmetricCB> option = new InsertOption<VendorSymmetricCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorSymmetricBhv.<span style="color: #FD4747">varyingInsert</span>(vendorSymmetric, option);
     * ... = vendorSymmetric.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorSymmetric The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorSymmetric vendorSymmetric, InsertOption<VendorSymmetricCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorSymmetric, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * vendorSymmetric.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSymmetric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSymmetric.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorSymmetricCB&gt; option = new UpdateOption&lt;VendorSymmetricCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorSymmetricCB&gt;() {
     *         public void specify(VendorSymmetricCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorSymmetricBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorSymmetric, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSymmetric The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorSymmetric vendorSymmetric, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorSymmetric, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorSymmetric The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorSymmetric vendorSymmetric, InsertOption<VendorSymmetricCB> insertOption, UpdateOption<VendorSymmetricCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorSymmetric, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorSymmetric The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorSymmetric vendorSymmetric, DeleteOption<VendorSymmetricCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorSymmetric, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorSymmetric> vendorSymmetricList, InsertOption<VendorSymmetricCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorSymmetricList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorSymmetric> vendorSymmetricList, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorSymmetricList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorSymmetricList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorSymmetric> vendorSymmetricList, DeleteOption<VendorSymmetricCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorSymmetricList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> setupper, InsertOption<VendorSymmetricCB> option) {
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
     * VendorSymmetric vendorSymmetric = new VendorSymmetric();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setPK...(value);</span>
     * vendorSymmetric.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSymmetric.setVersionNo(value);</span>
     * VendorSymmetricCB cb = new VendorSymmetricCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorSymmetricCB&gt; option = new UpdateOption&lt;VendorSymmetricCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorSymmetricCB&gt;() {
     *     public void specify(VendorSymmetricCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorSymmetricBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorSymmetric, cb, option);
     * </pre>
     * @param vendorSymmetric The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorSymmetric vendorSymmetric, VendorSymmetricCB cb, UpdateOption<VendorSymmetricCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorSymmetric, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorSymmetric. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorSymmetricCB cb, DeleteOption<VendorSymmetricCB> option) {
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
    public OutsideSqlBasicExecutor<VendorSymmetricBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorSymmetricCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorSymmetricCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorSymmetric> void delegateSelectCursor(VendorSymmetricCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends VendorSymmetric> List<ENTITY> delegateSelectList(VendorSymmetricCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorSymmetric et, InsertOption<VendorSymmetricCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(VendorSymmetric et, UpdateOption<VendorSymmetricCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(VendorSymmetric et, UpdateOption<VendorSymmetricCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(VendorSymmetric et, DeleteOption<VendorSymmetricCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(VendorSymmetric et, DeleteOption<VendorSymmetricCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<VendorSymmetric> ls, InsertOption<VendorSymmetricCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorSymmetric> ls, UpdateOption<VendorSymmetricCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorSymmetric> ls, UpdateOption<VendorSymmetricCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorSymmetric> ls, DeleteOption<VendorSymmetricCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorSymmetric> ls, DeleteOption<VendorSymmetricCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorSymmetric et, VendorSymmetricCB inCB, ConditionBean resCB, InsertOption<VendorSymmetricCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorSymmetric et, VendorSymmetricCB cb, UpdateOption<VendorSymmetricCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(VendorSymmetricCB cb, DeleteOption<VendorSymmetricCB> op)
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
    protected VendorSymmetric downcast(Entity et) {
        return helpEntityDowncastInternally(et, VendorSymmetric.class);
    }

    protected VendorSymmetricCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorSymmetricCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorSymmetric> downcast(List<? extends Entity> ls) {
        return (List<VendorSymmetric>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorSymmetricCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<VendorSymmetricCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorSymmetricCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<VendorSymmetricCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorSymmetricCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<VendorSymmetricCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<VendorSymmetric, VendorSymmetricCB>)sp;
    }
}
