package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of vendor_date_fk as TABLE. <br />
 * <pre>
 * [primary key]
 *     bar_id
 *
 * [column]
 *     bar_id, bar_date
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
 *     vendor_date_pk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorDatePk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDateFkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_date_fk"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorDateFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorDateFkDbm getMyDBMeta() { return VendorDateFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorDateFk newMyEntity() { return new VendorDateFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorDateFkCB newMyConditionBean() { return new VendorDateFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * int count = vendorDateFkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorDateFkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorDateFkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorDateFkCB cb) { // called by selectPage(cb)
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
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * VendorDateFk vendorDateFk = vendorDateFkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorDateFk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorDateFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDateFk selectEntity(VendorDateFkCB cb) {
        return doSelectEntity(cb, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> ENTITY doSelectEntity(VendorDateFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, VendorDateFkCB>() {
            public List<ENTITY> callbackSelectList(VendorDateFkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends VendorDateFk> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorDateFkCB cb, Class<ENTITY> tp) {
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
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * VendorDateFk vendorDateFk = vendorDateFkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorDateFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDateFk selectEntityWithDeletedCheck(VendorDateFkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> ENTITY doSelectEntityWithDeletedCheck(VendorDateFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorDateFkCB>() {
            public List<ENTITY> callbackSelectList(VendorDateFkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param barId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDateFk selectByPKValue(Integer barId) {
        return doSelectByPK(barId, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> ENTITY doSelectByPK(Integer barId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(barId), entityType);
    }

    protected <ENTITY extends VendorDateFk> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer barId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(barId, entityType), barId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param barId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDateFk selectByPKValueWithDeletedCheck(Integer barId) {
        return doSelectByPKWithDeletedCheck(barId, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> ENTITY doSelectByPKWithDeletedCheck(Integer barId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(barId), entityType);
    }

    protected VendorDateFkCB xprepareCBAsPK(Integer barId) {
        assertObjectNotNull("barId", barId);
        VendorDateFkCB cb = newMyConditionBean(); cb.acceptPrimaryKey(barId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorDateFk&gt; vendorDateFkList = vendorDateFkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorDateFk vendorDateFk : vendorDateFkList) {
     *     ... = vendorDateFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorDateFk> selectList(VendorDateFkCB cb) {
        return doSelectList(cb, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> ListResultBean<ENTITY> doSelectList(VendorDateFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, VendorDateFkCB>() {
            public List<ENTITY> callbackSelectList(VendorDateFkCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorDateFk&gt; page = vendorDateFkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorDateFk vendorDateFk : page) {
     *     ... = vendorDateFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorDateFk> selectPage(VendorDateFkCB cb) {
        return doSelectPage(cb, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> PagingResultBean<ENTITY> doSelectPage(VendorDateFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, VendorDateFkCB>() {
            public int callbackSelectCount(VendorDateFkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorDateFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * vendorDateFkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorDateFk&gt;() {
     *     public void handle(VendorDateFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorDateFk. (NotNull)
     */
    public void selectCursor(VendorDateFkCB cb, EntityRowHandler<VendorDateFk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorDateFk.class);
    }

    protected <ENTITY extends VendorDateFk> void doSelectCursor(VendorDateFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, VendorDateFkCB>() {
            public void callbackSelectCursor(VendorDateFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(VendorDateFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorDateFkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorDateFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorDateFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorDateFkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends VendorDateFkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'VendorDatePk'.
     * @param vendorDateFkList The list of vendorDateFk. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorDatePk> pulloutVendorDatePk(List<VendorDateFk> vendorDateFkList) {
        return helpPulloutInternally(vendorDateFkList, new InternalPulloutCallback<VendorDateFk, VendorDatePk>() {
            public VendorDatePk getFr(VendorDateFk et)
            { return et.getVendorDatePk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorDatePk et, List<VendorDateFk> ls)
            { et.setVendorDateFkList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key barId.
     * @param vendorDateFkList The list of vendorDateFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractBarIdList(List<VendorDateFk> vendorDateFkList) {
        return helpExtractListInternally(vendorDateFkList, new InternalExtractCallback<VendorDateFk, Integer>() {
            public Integer getCV(VendorDateFk et) { return et.getBarId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDateFk.setFoo...(value);
     * vendorDateFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDateFk.set...;</span>
     * vendorDateFkBhv.<span style="color: #DD4747">insert</span>(vendorDateFk);
     * ... = vendorDateFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorDateFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorDateFk vendorDateFk) {
        doInsert(vendorDateFk, null);
    }

    protected void doInsert(VendorDateFk vendorDateFk, InsertOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFk", vendorDateFk);
        prepareInsertOption(op);
        delegateInsert(vendorDateFk, op);
    }

    protected void prepareInsertOption(InsertOption<VendorDateFkCB> op) {
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
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * vendorDateFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDateFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDateFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDateFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDateFkBhv.<span style="color: #DD4747">update</span>(vendorDateFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDateFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorDateFk vendorDateFk) {
        doUpdate(vendorDateFk, null);
    }

    protected void doUpdate(VendorDateFk vendorDateFk, final UpdateOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFk", vendorDateFk);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorDateFk, new InternalUpdateCallback<VendorDateFk>() {
            public int callbackDelegateUpdate(VendorDateFk et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorDateFkCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorDateFkCB createCBForVaryingUpdate() {
        VendorDateFkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorDateFkCB createCBForSpecifiedUpdate() {
        VendorDateFkCB cb = newMyConditionBean();
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
     * @param vendorDateFk The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorDateFk vendorDateFk) {
        doInesrtOrUpdate(vendorDateFk, null, null);
    }

    protected void doInesrtOrUpdate(VendorDateFk vendorDateFk, final InsertOption<VendorDateFkCB> iop, final UpdateOption<VendorDateFkCB> uop) {
        helpInsertOrUpdateInternally(vendorDateFk, new InternalInsertOrUpdateCallback<VendorDateFk, VendorDateFkCB>() {
            public void callbackInsert(VendorDateFk et) { doInsert(et, iop); }
            public void callbackUpdate(VendorDateFk et) { doUpdate(et, uop); }
            public VendorDateFkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorDateFkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<VendorDateFkCB>();
            uop = uop != null ? uop : new UpdateOption<VendorDateFkCB>();
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
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * vendorDateFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDateFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDateFkBhv.<span style="color: #DD4747">delete</span>(vendorDateFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDateFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorDateFk vendorDateFk) {
        doDelete(vendorDateFk, null);
    }

    protected void doDelete(VendorDateFk vendorDateFk, final DeleteOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFk", vendorDateFk);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorDateFk, new InternalDeleteCallback<VendorDateFk>() {
            public int callbackDelegateDelete(VendorDateFk et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorDateFkCB> op) {
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
     *     VendorDateFk vendorDateFk = new VendorDateFk();
     *     vendorDateFk.setFooName("foo");
     *     if (...) {
     *         vendorDateFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorDateFkList.add(vendorDateFk);
     * }
     * vendorDateFkBhv.<span style="color: #DD4747">batchInsert</span>(vendorDateFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorDateFk> vendorDateFkList) {
        InsertOption<VendorDateFkCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorDateFkList, op);
    }

    protected int[] doBatchInsert(List<VendorDateFk> vendorDateFkList, InsertOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFkList", vendorDateFkList);
        prepareBatchInsertOption(vendorDateFkList, op);
        return delegateBatchInsert(vendorDateFkList, op);
    }

    protected void prepareBatchInsertOption(List<VendorDateFk> vendorDateFkList, InsertOption<VendorDateFkCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorDateFkList);
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
     *     VendorDateFk vendorDateFk = new VendorDateFk();
     *     vendorDateFk.setFooName("foo");
     *     if (...) {
     *         vendorDateFk.setFooPrice(123);
     *     } else {
     *         vendorDateFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorDateFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorDateFkList.add(vendorDateFk);
     * }
     * vendorDateFkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDateFkList);
     * </pre>
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDateFk> vendorDateFkList) {
        UpdateOption<VendorDateFkCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorDateFkList, op);
    }

    protected int[] doBatchUpdate(List<VendorDateFk> vendorDateFkList, UpdateOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFkList", vendorDateFkList);
        prepareBatchUpdateOption(vendorDateFkList, op);
        return delegateBatchUpdate(vendorDateFkList, op);
    }

    protected void prepareBatchUpdateOption(List<VendorDateFk> vendorDateFkList, UpdateOption<VendorDateFkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorDateFkList);
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
     * vendorDateFkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDateFkList, new SpecifyQuery<VendorDateFkCB>() {
     *     public void specify(VendorDateFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorDateFkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDateFkList, new SpecifyQuery<VendorDateFkCB>() {
     *     public void specify(VendorDateFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDateFk> vendorDateFkList, SpecifyQuery<VendorDateFkCB> updateColumnSpec) {
        return doBatchUpdate(vendorDateFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorDateFk> vendorDateFkList) {
        return doBatchDelete(vendorDateFkList, null);
    }

    protected int[] doBatchDelete(List<VendorDateFk> vendorDateFkList, DeleteOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFkList", vendorDateFkList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorDateFkList, op);
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
     * vendorDateFkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorDateFk, VendorDateFkCB&gt;() {
     *     public ConditionBean setup(vendorDateFk entity, VendorDateFkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorDateFk, VendorDateFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorDateFk, VendorDateFkCB> sp, InsertOption<VendorDateFkCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        VendorDateFk e = new VendorDateFk();
        VendorDateFkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected VendorDateFkCB createCBForQueryInsert() {
        VendorDateFkCB cb = newMyConditionBean();
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
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setPK...(value);</span>
     * vendorDateFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDateFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setVersionNo(value);</span>
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * vendorDateFkBhv.<span style="color: #DD4747">queryUpdate</span>(vendorDateFk, cb);
     * </pre>
     * @param vendorDateFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorDateFk vendorDateFk, VendorDateFkCB cb) {
        return doQueryUpdate(vendorDateFk, cb, null);
    }

    protected int doQueryUpdate(VendorDateFk vendorDateFk, VendorDateFkCB cb, UpdateOption<VendorDateFkCB> op) {
        assertObjectNotNull("vendorDateFk", vendorDateFk); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorDateFk, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (VendorDateFkCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (VendorDateFkCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * vendorDateFkBhv.<span style="color: #DD4747">queryDelete</span>(vendorDateFk, cb);
     * </pre>
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorDateFkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorDateFkCB cb, DeleteOption<VendorDateFkCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((VendorDateFkCB)cb); }
        else { return varyingQueryDelete((VendorDateFkCB)cb, downcast(op)); }
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
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDateFk.setFoo...(value);
     * vendorDateFk.setBar...(value);
     * InsertOption<VendorDateFkCB> option = new InsertOption<VendorDateFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorDateFkBhv.<span style="color: #DD4747">varyingInsert</span>(vendorDateFk, option);
     * ... = vendorDateFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorDateFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorDateFk vendorDateFk, InsertOption<VendorDateFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorDateFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * vendorDateFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDateFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorDateFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorDateFkCB&gt; option = new UpdateOption&lt;VendorDateFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorDateFkCB&gt;() {
     *         public void specify(VendorDateFkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorDateFkBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorDateFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDateFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorDateFk vendorDateFk, UpdateOption<VendorDateFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorDateFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorDateFk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorDateFk vendorDateFk, InsertOption<VendorDateFkCB> insertOption, UpdateOption<VendorDateFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorDateFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorDateFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorDateFk vendorDateFk, DeleteOption<VendorDateFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorDateFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorDateFk> vendorDateFkList, InsertOption<VendorDateFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorDateFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorDateFk> vendorDateFkList, UpdateOption<VendorDateFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorDateFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorDateFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorDateFk> vendorDateFkList, DeleteOption<VendorDateFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorDateFkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorDateFk, VendorDateFkCB> setupper, InsertOption<VendorDateFkCB> option) {
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
     * VendorDateFk vendorDateFk = new VendorDateFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setPK...(value);</span>
     * vendorDateFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDateFk.setVersionNo(value);</span>
     * VendorDateFkCB cb = new VendorDateFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorDateFkCB&gt; option = new UpdateOption&lt;VendorDateFkCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorDateFkCB&gt;() {
     *     public void specify(VendorDateFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorDateFkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorDateFk, cb, option);
     * </pre>
     * @param vendorDateFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorDateFk vendorDateFk, VendorDateFkCB cb, UpdateOption<VendorDateFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorDateFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorDateFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorDateFkCB cb, DeleteOption<VendorDateFkCB> option) {
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
    public OutsideSqlBasicExecutor<VendorDateFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorDateFkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorDateFkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorDateFk> void delegateSelectCursor(VendorDateFkCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends VendorDateFk> List<ENTITY> delegateSelectList(VendorDateFkCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorDateFk et, InsertOption<VendorDateFkCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(VendorDateFk et, UpdateOption<VendorDateFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(VendorDateFk et, UpdateOption<VendorDateFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(VendorDateFk et, DeleteOption<VendorDateFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(VendorDateFk et, DeleteOption<VendorDateFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<VendorDateFk> ls, InsertOption<VendorDateFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorDateFk> ls, UpdateOption<VendorDateFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorDateFk> ls, UpdateOption<VendorDateFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorDateFk> ls, DeleteOption<VendorDateFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorDateFk> ls, DeleteOption<VendorDateFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorDateFk et, VendorDateFkCB inCB, ConditionBean resCB, InsertOption<VendorDateFkCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorDateFk et, VendorDateFkCB cb, UpdateOption<VendorDateFkCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(VendorDateFkCB cb, DeleteOption<VendorDateFkCB> op)
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
    protected VendorDateFk downcast(Entity et) {
        return helpEntityDowncastInternally(et, VendorDateFk.class);
    }

    protected VendorDateFkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorDateFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorDateFk> downcast(List<? extends Entity> ls) {
        return (List<VendorDateFk>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorDateFkCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<VendorDateFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorDateFkCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<VendorDateFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorDateFkCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<VendorDateFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorDateFk, VendorDateFkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<VendorDateFk, VendorDateFkCB>)sp;
    }
}
