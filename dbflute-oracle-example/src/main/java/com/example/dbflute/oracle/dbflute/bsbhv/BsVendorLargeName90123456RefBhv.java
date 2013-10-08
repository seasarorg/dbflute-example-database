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
 * The behavior of VENDOR_LARGE_NAME_90123456_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_90123_REF_ID
 * 
 * [column]
 *     VENDOR_LARGE_NAME_90123_REF_ID, VENDOR_LARGE_NAME_901_REF_NAME, VENDOR_LARGE_NAME_901234567_ID
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
 *     VENDOR_LARGE_NAME_901234567890
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorLargeName901234567890
 * 
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName90123456RefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_LARGE_NAME_90123456_REF"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorLargeName90123456RefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeName90123456RefDbm getMyDBMeta() { return VendorLargeName90123456RefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeName90123456Ref newMyEntity() { return new VendorLargeName90123456Ref(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeName90123456RefCB newMyConditionBean() { return new VendorLargeName90123456RefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeName90123456RefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorLargeName90123456RefCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorLargeName90123456RefCB cb) { // called by selectPage(cb)
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
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorLargeName90123456Ref != null) {
     *     ... = vendorLargeName90123456Ref.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectEntity(VendorLargeName90123456RefCB cb) {
        return doSelectEntity(cb, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectEntity(final VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorLargeName90123456RefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeName90123456Ref.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectEntityWithDeletedCheck(VendorLargeName90123456RefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectEntityWithDeletedCheck(final VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorLargeName90123456RefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorLargeName90123RefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectByPKValue(Long vendorLargeName90123RefId) {
        return doSelectByPKValue(vendorLargeName90123RefId, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectByPKValue(Long vendorLargeName90123RefId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(vendorLargeName90123RefId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorLargeName90123RefId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectByPKValueWithDeletedCheck(Long vendorLargeName90123RefId) {
        return doSelectByPKValueWithDeletedCheck(vendorLargeName90123RefId, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectByPKValueWithDeletedCheck(Long vendorLargeName90123RefId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(vendorLargeName90123RefId), entityType);
    }

    private VendorLargeName90123456RefCB buildPKCB(Long vendorLargeName90123RefId) {
        assertObjectNotNull("vendorLargeName90123RefId", vendorLargeName90123RefId);
        VendorLargeName90123456RefCB cb = newMyConditionBean();
        cb.query().setVendorLargeName90123RefId_Equal(vendorLargeName90123RefId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeName90123456Ref&gt; vendorLargeName90123456RefList = vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorLargeName90123456Ref vendorLargeName90123456Ref : vendorLargeName90123456RefList) {
     *     ... = vendorLargeName90123456Ref.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName90123456Ref> selectList(VendorLargeName90123456RefCB cb) {
        return doSelectList(cb, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ListResultBean<ENTITY> doSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorLargeName90123456RefCB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeName90123456Ref&gt; page = vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeName90123456Ref vendorLargeName90123456Ref : page) {
     *     ... = vendorLargeName90123456Ref.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName90123456Ref> selectPage(VendorLargeName90123456RefCB cb) {
        return doSelectPage(cb, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> PagingResultBean<ENTITY> doSelectPage(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorLargeName90123456RefCB>() {
            public int callbackSelectCount(VendorLargeName90123456RefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeName90123456Ref&gt;() {
     *     public void handle(VendorLargeName90123456Ref entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeName90123456Ref. (NotNull)
     */
    public void selectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<VendorLargeName90123456Ref> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorLargeName90123456Ref.class);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> void doSelectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorLargeName90123456Ref>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorLargeName90123456RefCB>() {
            public void callbackSelectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeName90123456RefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorLargeName90123456RefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorLargeName90123456RefCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'VendorLargeName901234567890'.
     * @param vendorLargeName90123456RefList The list of vendorLargeName90123456Ref. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeName901234567890> pulloutVendorLargeName901234567890(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return helpPulloutInternally(vendorLargeName90123456RefList, new InternalPulloutCallback<VendorLargeName90123456Ref, VendorLargeName901234567890>() {
            public VendorLargeName901234567890 getFr(VendorLargeName90123456Ref e) { return e.getVendorLargeName901234567890(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorLargeName901234567890 e, List<VendorLargeName90123456Ref> ls)
            { e.setVendorLargeName90123456RefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorLargeName90123RefId.
     * @param vendorLargeName90123456RefList The list of vendorLargeName90123456Ref. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorLargeName90123RefIdList(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return helpExtractListInternally(vendorLargeName90123456RefList, new InternalExtractCallback<VendorLargeName90123456Ref, Long>() {
            public Long getCV(VendorLargeName90123456Ref e) { return e.getVendorLargeName90123RefId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName90123456Ref.setFoo...(value);
     * vendorLargeName90123456Ref.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">insert</span>(vendorLargeName90123456Ref);
     * ... = vendorLargeName90123456Ref.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeName90123456Ref The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doInsert(vendorLargeName90123456Ref, null);
    }

    protected void doInsert(VendorLargeName90123456Ref vendorLargeName90123456Ref, InsertOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456Ref", vendorLargeName90123456Ref);
        prepareInsertOption(option);
        delegateInsert(vendorLargeName90123456Ref, option);
    }

    protected void prepareInsertOption(InsertOption<VendorLargeName90123456RefCB> option) {
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName90123456Ref.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName90123456RefBhv.<span style="color: #FD4747">update</span>(vendorLargeName90123456Ref);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorLargeName90123456Ref The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doUpdate(vendorLargeName90123456Ref, null);
    }

    protected void doUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, final UpdateOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456Ref", vendorLargeName90123456Ref);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorLargeName90123456Ref, new InternalUpdateCallback<VendorLargeName90123456Ref>() {
            public int callbackDelegateUpdate(VendorLargeName90123456Ref entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorLargeName90123456RefCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorLargeName90123456RefCB createCBForVaryingUpdate() {
        VendorLargeName90123456RefCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorLargeName90123456RefCB createCBForSpecifiedUpdate() {
        VendorLargeName90123456RefCB cb = newMyConditionBean();
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
     * @param vendorLargeName90123456Ref The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doInesrtOrUpdate(vendorLargeName90123456Ref, null, null);
    }

    protected void doInesrtOrUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, final InsertOption<VendorLargeName90123456RefCB> insertOption, final UpdateOption<VendorLargeName90123456RefCB> updateOption) {
        helpInsertOrUpdateInternally(vendorLargeName90123456Ref, new InternalInsertOrUpdateCallback<VendorLargeName90123456Ref, VendorLargeName90123456RefCB>() {
            public void callbackInsert(VendorLargeName90123456Ref entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorLargeName90123456Ref entity) { doUpdate(entity, updateOption); }
            public VendorLargeName90123456RefCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorLargeName90123456RefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorLargeName90123456RefCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorLargeName90123456RefCB>() : updateOption;
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName90123456RefBhv.<span style="color: #FD4747">delete</span>(vendorLargeName90123456Ref);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorLargeName90123456Ref The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doDelete(vendorLargeName90123456Ref, null);
    }

    protected void doDelete(VendorLargeName90123456Ref vendorLargeName90123456Ref, final DeleteOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456Ref", vendorLargeName90123456Ref);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorLargeName90123456Ref, new InternalDeleteCallback<VendorLargeName90123456Ref>() {
            public int callbackDelegateDelete(VendorLargeName90123456Ref entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorLargeName90123456RefCB> option) {
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
     *     VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     *     vendorLargeName90123456Ref.setFooName("foo");
     *     if (...) {
     *         vendorLargeName90123456Ref.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeName90123456RefList.add(vendorLargeName90123456Ref);
     * }
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">batchInsert</span>(vendorLargeName90123456RefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        InsertOption<VendorLargeName90123456RefCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorLargeName90123456RefList, option);
    }

    protected int[] doBatchInsert(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, InsertOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456RefList", vendorLargeName90123456RefList);
        prepareBatchInsertOption(vendorLargeName90123456RefList, option);
        return delegateBatchInsert(vendorLargeName90123456RefList, option);
    }

    protected void prepareBatchInsertOption(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, InsertOption<VendorLargeName90123456RefCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorLargeName90123456RefList);
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
     *     VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     *     vendorLargeName90123456Ref.setFooName("foo");
     *     if (...) {
     *         vendorLargeName90123456Ref.setFooPrice(123);
     *     } else {
     *         vendorLargeName90123456Ref.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeName90123456RefList.add(vendorLargeName90123456Ref);
     * }
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName90123456RefList);
     * </pre>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        UpdateOption<VendorLargeName90123456RefCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorLargeName90123456RefList, option);
    }

    protected int[] doBatchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456RefList", vendorLargeName90123456RefList);
        prepareBatchUpdateOption(vendorLargeName90123456RefList, option);
        return delegateBatchUpdate(vendorLargeName90123456RefList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, UpdateOption<VendorLargeName90123456RefCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorLargeName90123456RefList);
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
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName90123456RefList, new SpecifyQuery<VendorLargeName90123456RefCB>() {
     *     public void specify(VendorLargeName90123456RefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName90123456RefList, new SpecifyQuery<VendorLargeName90123456RefCB>() {
     *     public void specify(VendorLargeName90123456RefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, SpecifyQuery<VendorLargeName90123456RefCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeName90123456RefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return doBatchDelete(vendorLargeName90123456RefList, null);
    }

    protected int[] doBatchDelete(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456RefList", vendorLargeName90123456RefList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorLargeName90123456RefList, option);
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
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeName90123456Ref, VendorLargeName90123456RefCB&gt;() {
     *     public ConditionBean setup(vendorLargeName90123456Ref entity, VendorLargeName90123456RefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> setupper, InsertOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorLargeName90123456Ref entity = new VendorLargeName90123456Ref();
        VendorLargeName90123456RefCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorLargeName90123456RefCB createCBForQueryInsert() {
        VendorLargeName90123456RefCB cb = newMyConditionBean();
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setPK...(value);</span>
     * vendorLargeName90123456Ref.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setVersionNo(value);</span>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">queryUpdate</span>(vendorLargeName90123456Ref, cb);
     * </pre>
     * @param vendorLargeName90123456Ref The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, VendorLargeName90123456RefCB cb) {
        return doQueryUpdate(vendorLargeName90123456Ref, cb, null);
    }

    protected int doQueryUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, VendorLargeName90123456RefCB cb, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertObjectNotNull("vendorLargeName90123456Ref", vendorLargeName90123456Ref); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorLargeName90123456Ref, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorLargeName90123456RefCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorLargeName90123456RefCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">queryDelete</span>(vendorLargeName90123456Ref, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeName90123456RefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorLargeName90123456RefCB cb, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorLargeName90123456RefCB)cb); }
        else { return varyingQueryDelete((VendorLargeName90123456RefCB)cb, downcast(option)); }
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName90123456Ref.setFoo...(value);
     * vendorLargeName90123456Ref.setBar...(value);
     * InsertOption<VendorLargeName90123456RefCB> option = new InsertOption<VendorLargeName90123456RefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">varyingInsert</span>(vendorLargeName90123456Ref, option);
     * ... = vendorLargeName90123456Ref.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeName90123456Ref The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeName90123456Ref vendorLargeName90123456Ref, InsertOption<VendorLargeName90123456RefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeName90123456Ref, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName90123456Ref.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeName90123456RefCB&gt; option = new UpdateOption&lt;VendorLargeName90123456RefCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *         public void specify(VendorLargeName90123456RefCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeName90123456RefBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorLargeName90123456Ref, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName90123456Ref The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeName90123456Ref, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeName90123456Ref The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, InsertOption<VendorLargeName90123456RefCB> insertOption, UpdateOption<VendorLargeName90123456RefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorLargeName90123456Ref, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeName90123456Ref The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeName90123456Ref vendorLargeName90123456Ref, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeName90123456Ref, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, InsertOption<VendorLargeName90123456RefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeName90123456RefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeName90123456RefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeName90123456RefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> setupper, InsertOption<VendorLargeName90123456RefCB> option) {
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setPK...(value);</span>
     * vendorLargeName90123456Ref.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setVersionNo(value);</span>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeName90123456RefCB&gt; option = new UpdateOption&lt;VendorLargeName90123456RefCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void specify(VendorLargeName90123456RefCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeName90123456RefBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorLargeName90123456Ref, cb, option);
     * </pre>
     * @param vendorLargeName90123456Ref The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, VendorLargeName90123456RefCB cb, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeName90123456Ref, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeName90123456RefCB cb, DeleteOption<VendorLargeName90123456RefCB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeName90123456RefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorLargeName90123456RefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorLargeName90123456RefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorLargeName90123456Ref> void delegateSelectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorLargeName90123456Ref> List<ENTITY> delegateSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorLargeName90123456Ref e, InsertOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorLargeName90123456Ref e, UpdateOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorLargeName90123456Ref e, UpdateOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorLargeName90123456Ref e, DeleteOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorLargeName90123456Ref e, DeleteOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorLargeName90123456Ref> ls, InsertOption<VendorLargeName90123456RefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorLargeName90123456Ref> ls, UpdateOption<VendorLargeName90123456RefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorLargeName90123456Ref> ls, UpdateOption<VendorLargeName90123456RefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorLargeName90123456Ref> ls, DeleteOption<VendorLargeName90123456RefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorLargeName90123456Ref> ls, DeleteOption<VendorLargeName90123456RefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorLargeName90123456Ref e, VendorLargeName90123456RefCB inCB, ConditionBean resCB, InsertOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorLargeName90123456Ref e, VendorLargeName90123456RefCB cb, UpdateOption<VendorLargeName90123456RefCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorLargeName90123456RefCB cb, DeleteOption<VendorLargeName90123456RefCB> op)
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
    protected VendorLargeName90123456Ref downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorLargeName90123456Ref.class);
    }

    protected VendorLargeName90123456RefCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorLargeName90123456RefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorLargeName90123456Ref> downcast(List<? extends Entity> entityList) {
        return (List<VendorLargeName90123456Ref>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorLargeName90123456RefCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorLargeName90123456RefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorLargeName90123456RefCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorLargeName90123456RefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorLargeName90123456RefCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorLargeName90123456RefCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB>)option;
    }
}
