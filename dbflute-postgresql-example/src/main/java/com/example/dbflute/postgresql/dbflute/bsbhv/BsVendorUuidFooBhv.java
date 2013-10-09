package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of vendor_uuid_foo as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_id
 * 
 * [column]
 *     foo_id, foo_name, bar_id
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
 *     vendor_uuid_bar
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorUuidBar
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidFooBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_uuid_foo"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorUuidFooDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorUuidFooDbm getMyDBMeta() { return VendorUuidFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorUuidFoo newMyEntity() { return new VendorUuidFoo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorUuidFooCB newMyConditionBean() { return new VendorUuidFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * int count = vendorUuidFooBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorUuidFooCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorUuidFooCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorUuidFooCB cb) { // called by selectPage(cb)
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
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorUuidFoo != null) {
     *     ... = vendorUuidFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntity(VendorUuidFooCB cb) {
        return doSelectEntity(cb, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> ENTITY doSelectEntity(final VendorUuidFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, VendorUuidFooCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorUuidFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntityWithDeletedCheck(VendorUuidFooCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> ENTITY doSelectEntityWithDeletedCheck(final VendorUuidFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorUuidFooCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectByPKValue(java.util.UUID fooId) {
        return doSelectByPKValue(fooId, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> ENTITY doSelectByPKValue(java.util.UUID fooId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(fooId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param fooId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectByPKValueWithDeletedCheck(java.util.UUID fooId) {
        return doSelectByPKValueWithDeletedCheck(fooId, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> ENTITY doSelectByPKValueWithDeletedCheck(java.util.UUID fooId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(fooId), entityType);
    }

    private VendorUuidFooCB buildPKCB(java.util.UUID fooId) {
        assertObjectNotNull("fooId", fooId);
        VendorUuidFooCB cb = newMyConditionBean();
        cb.query().setFooId_Equal(fooId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorUuidFoo&gt; vendorUuidFooList = vendorUuidFooBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorUuidFoo vendorUuidFoo : vendorUuidFooList) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidFoo> selectList(VendorUuidFooCB cb) {
        return doSelectList(cb, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> ListResultBean<ENTITY> doSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, VendorUuidFooCB>() {
            public List<ENTITY> callbackSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorUuidFoo&gt; page = vendorUuidFooBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorUuidFoo vendorUuidFoo : page) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidFoo> selectPage(VendorUuidFooCB cb) {
        return doSelectPage(cb, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> PagingResultBean<ENTITY> doSelectPage(VendorUuidFooCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, VendorUuidFooCB>() {
            public int callbackSelectCount(VendorUuidFooCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorUuidFoo&gt;() {
     *     public void handle(VendorUuidFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorUuidFoo. (NotNull)
     */
    public void selectCursor(VendorUuidFooCB cb, EntityRowHandler<VendorUuidFoo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorUuidFoo.class);
    }

    protected <ENTITY extends VendorUuidFoo> void doSelectCursor(VendorUuidFooCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<VendorUuidFoo>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, VendorUuidFooCB>() {
            public void callbackSelectCursor(VendorUuidFooCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(VendorUuidFooCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorUuidFooBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorUuidFooCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<VendorUuidFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorUuidFooCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'VendorUuidBar'.
     * @param vendorUuidFooList The list of vendorUuidFoo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorUuidBar> pulloutVendorUuidBar(List<VendorUuidFoo> vendorUuidFooList) {
        return helpPulloutInternally(vendorUuidFooList, new InternalPulloutCallback<VendorUuidFoo, VendorUuidBar>() {
            public VendorUuidBar getFr(VendorUuidFoo e) { return e.getVendorUuidBar(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorUuidBar e, List<VendorUuidFoo> ls)
            { e.setVendorUuidFooList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fooId.
     * @param vendorUuidFooList The list of vendorUuidFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.UUID> extractFooIdList(List<VendorUuidFoo> vendorUuidFooList) {
        return helpExtractListInternally(vendorUuidFooList, new InternalExtractCallback<VendorUuidFoo, java.util.UUID>() {
            public java.util.UUID getCV(VendorUuidFoo e) { return e.getFooId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidFoo.setFoo...(value);
     * vendorUuidFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * vendorUuidFooBhv.<span style="color: #FD4747">insert</span>(vendorUuidFoo);
     * ... = vendorUuidFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorUuidFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorUuidFoo vendorUuidFoo) {
        doInsert(vendorUuidFoo, null);
    }

    protected void doInsert(VendorUuidFoo vendorUuidFoo, InsertOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFoo", vendorUuidFoo);
        prepareInsertOption(option);
        delegateInsert(vendorUuidFoo, option);
    }

    protected void prepareInsertOption(InsertOption<VendorUuidFooCB> option) {
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidFooBhv.<span style="color: #FD4747">update</span>(vendorUuidFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorUuidFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorUuidFoo vendorUuidFoo) {
        doUpdate(vendorUuidFoo, null);
    }

    protected void doUpdate(VendorUuidFoo vendorUuidFoo, final UpdateOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFoo", vendorUuidFoo);
        prepareUpdateOption(option);
        helpUpdateInternally(vendorUuidFoo, new InternalUpdateCallback<VendorUuidFoo>() {
            public int callbackDelegateUpdate(VendorUuidFoo entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorUuidFooCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorUuidFooCB createCBForVaryingUpdate() {
        VendorUuidFooCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorUuidFooCB createCBForSpecifiedUpdate() {
        VendorUuidFooCB cb = newMyConditionBean();
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
     * @param vendorUuidFoo The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorUuidFoo vendorUuidFoo) {
        doInesrtOrUpdate(vendorUuidFoo, null, null);
    }

    protected void doInesrtOrUpdate(VendorUuidFoo vendorUuidFoo, final InsertOption<VendorUuidFooCB> insertOption, final UpdateOption<VendorUuidFooCB> updateOption) {
        helpInsertOrUpdateInternally(vendorUuidFoo, new InternalInsertOrUpdateCallback<VendorUuidFoo, VendorUuidFooCB>() {
            public void callbackInsert(VendorUuidFoo entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(VendorUuidFoo entity) { doUpdate(entity, updateOption); }
            public VendorUuidFooCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorUuidFooCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<VendorUuidFooCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<VendorUuidFooCB>() : updateOption;
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidFooBhv.<span style="color: #FD4747">delete</span>(vendorUuidFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param vendorUuidFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorUuidFoo vendorUuidFoo) {
        doDelete(vendorUuidFoo, null);
    }

    protected void doDelete(VendorUuidFoo vendorUuidFoo, final DeleteOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFoo", vendorUuidFoo);
        prepareDeleteOption(option);
        helpDeleteInternally(vendorUuidFoo, new InternalDeleteCallback<VendorUuidFoo>() {
            public int callbackDelegateDelete(VendorUuidFoo entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorUuidFooCB> option) {
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
     *     VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     *     vendorUuidFoo.setFooName("foo");
     *     if (...) {
     *         vendorUuidFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorUuidFooList.add(vendorUuidFoo);
     * }
     * vendorUuidFooBhv.<span style="color: #FD4747">batchInsert</span>(vendorUuidFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorUuidFoo> vendorUuidFooList) {
        InsertOption<VendorUuidFooCB> option = createInsertUpdateOption();
        return doBatchInsert(vendorUuidFooList, option);
    }

    protected int[] doBatchInsert(List<VendorUuidFoo> vendorUuidFooList, InsertOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFooList", vendorUuidFooList);
        prepareBatchInsertOption(vendorUuidFooList, option);
        return delegateBatchInsert(vendorUuidFooList, option);
    }

    protected void prepareBatchInsertOption(List<VendorUuidFoo> vendorUuidFooList, InsertOption<VendorUuidFooCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorUuidFooList);
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
     *     VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     *     vendorUuidFoo.setFooName("foo");
     *     if (...) {
     *         vendorUuidFoo.setFooPrice(123);
     *     } else {
     *         vendorUuidFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorUuidFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorUuidFooList.add(vendorUuidFoo);
     * }
     * vendorUuidFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidFooList);
     * </pre>
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidFoo> vendorUuidFooList) {
        UpdateOption<VendorUuidFooCB> option = createPlainUpdateOption();
        return doBatchUpdate(vendorUuidFooList, option);
    }

    protected int[] doBatchUpdate(List<VendorUuidFoo> vendorUuidFooList, UpdateOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFooList", vendorUuidFooList);
        prepareBatchUpdateOption(vendorUuidFooList, option);
        return delegateBatchUpdate(vendorUuidFooList, option);
    }

    protected void prepareBatchUpdateOption(List<VendorUuidFoo> vendorUuidFooList, UpdateOption<VendorUuidFooCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorUuidFooList);
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
     * vendorUuidFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidFooList, new SpecifyQuery<VendorUuidFooCB>() {
     *     public void specify(VendorUuidFooCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * vendorUuidFooBhv.<span style="color: #FD4747">batchUpdate</span>(vendorUuidFooList, new SpecifyQuery<VendorUuidFooCB>() {
     *     public void specify(VendorUuidFooCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidFoo> vendorUuidFooList, SpecifyQuery<VendorUuidFooCB> updateColumnSpec) {
        return doBatchUpdate(vendorUuidFooList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorUuidFoo> vendorUuidFooList) {
        return doBatchDelete(vendorUuidFooList, null);
    }

    protected int[] doBatchDelete(List<VendorUuidFoo> vendorUuidFooList, DeleteOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFooList", vendorUuidFooList);
        prepareDeleteOption(option);
        return delegateBatchDelete(vendorUuidFooList, option);
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
     * vendorUuidFooBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorUuidFoo, VendorUuidFooCB&gt;() {
     *     public ConditionBean setup(vendorUuidFoo entity, VendorUuidFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> setupper, InsertOption<VendorUuidFooCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        VendorUuidFoo entity = new VendorUuidFoo();
        VendorUuidFooCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected VendorUuidFooCB createCBForQueryInsert() {
        VendorUuidFooCB cb = newMyConditionBean();
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #FD4747">queryUpdate</span>(vendorUuidFoo, cb);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidFoo vendorUuidFoo, VendorUuidFooCB cb) {
        return doQueryUpdate(vendorUuidFoo, cb, null);
    }

    protected int doQueryUpdate(VendorUuidFoo vendorUuidFoo, VendorUuidFooCB cb, UpdateOption<VendorUuidFooCB> option) {
        assertObjectNotNull("vendorUuidFoo", vendorUuidFoo); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorUuidFoo, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (VendorUuidFooCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (VendorUuidFooCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #FD4747">queryDelete</span>(vendorUuidFoo, cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorUuidFooCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorUuidFooCB cb, DeleteOption<VendorUuidFooCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((VendorUuidFooCB)cb); }
        else { return varyingQueryDelete((VendorUuidFooCB)cb, downcast(option)); }
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidFoo.setFoo...(value);
     * vendorUuidFoo.setBar...(value);
     * InsertOption<VendorUuidFooCB> option = new InsertOption<VendorUuidFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorUuidFooBhv.<span style="color: #FD4747">varyingInsert</span>(vendorUuidFoo, option);
     * ... = vendorUuidFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorUuidFoo The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorUuidFoo vendorUuidFoo, InsertOption<VendorUuidFooCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorUuidFoo, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorUuidFoo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorUuidFooCB&gt; option = new UpdateOption&lt;VendorUuidFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorUuidFooCB&gt;() {
     *         public void specify(VendorUuidFooCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorUuidFooBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorUuidFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidFoo The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorUuidFoo vendorUuidFoo, UpdateOption<VendorUuidFooCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorUuidFoo, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorUuidFoo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorUuidFoo vendorUuidFoo, InsertOption<VendorUuidFooCB> insertOption, UpdateOption<VendorUuidFooCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorUuidFoo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorUuidFoo The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorUuidFoo vendorUuidFoo, DeleteOption<VendorUuidFooCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorUuidFoo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorUuidFoo> vendorUuidFooList, InsertOption<VendorUuidFooCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorUuidFooList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorUuidFoo> vendorUuidFooList, UpdateOption<VendorUuidFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorUuidFooList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorUuidFoo> vendorUuidFooList, DeleteOption<VendorUuidFooCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorUuidFooList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> setupper, InsertOption<VendorUuidFooCB> option) {
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidFooCB&gt; option = new UpdateOption&lt;VendorUuidFooCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidFooCB&gt;() {
     *     public void specify(VendorUuidFooCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorUuidFooBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorUuidFoo, cb, option);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidFoo vendorUuidFoo, VendorUuidFooCB cb, UpdateOption<VendorUuidFooCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorUuidFoo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorUuidFooCB cb, DeleteOption<VendorUuidFooCB> option) {
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
    public OutsideSqlBasicExecutor<VendorUuidFooBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorUuidFooCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorUuidFooCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorUuidFoo> void delegateSelectCursor(VendorUuidFooCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends VendorUuidFoo> List<ENTITY> delegateSelectList(VendorUuidFooCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorUuidFoo e, InsertOption<VendorUuidFooCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(VendorUuidFoo e, UpdateOption<VendorUuidFooCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(VendorUuidFoo e, UpdateOption<VendorUuidFooCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(VendorUuidFoo e, DeleteOption<VendorUuidFooCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(VendorUuidFoo e, DeleteOption<VendorUuidFooCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<VendorUuidFoo> ls, InsertOption<VendorUuidFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorUuidFoo> ls, UpdateOption<VendorUuidFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorUuidFoo> ls, UpdateOption<VendorUuidFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorUuidFoo> ls, DeleteOption<VendorUuidFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorUuidFoo> ls, DeleteOption<VendorUuidFooCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorUuidFoo e, VendorUuidFooCB inCB, ConditionBean resCB, InsertOption<VendorUuidFooCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorUuidFoo e, VendorUuidFooCB cb, UpdateOption<VendorUuidFooCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(VendorUuidFooCB cb, DeleteOption<VendorUuidFooCB> op)
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
    protected VendorUuidFoo downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, VendorUuidFoo.class);
    }

    protected VendorUuidFooCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorUuidFooCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorUuidFoo> downcast(List<? extends Entity> entityList) {
        return (List<VendorUuidFoo>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorUuidFooCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<VendorUuidFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorUuidFooCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<VendorUuidFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorUuidFooCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<VendorUuidFooCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB>)option;
    }
}
