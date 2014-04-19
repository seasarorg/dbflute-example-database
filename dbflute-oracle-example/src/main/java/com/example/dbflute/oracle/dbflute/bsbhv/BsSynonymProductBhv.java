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
 * The behavior of (商品)SYNONYM_PRODUCT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
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
 *     SYNONYM_PRODUCT_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     synonymProductStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymProductBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_PRODUCT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymProductDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymProductDbm getMyDBMeta() { return SynonymProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymProduct newMyEntity() { return new SynonymProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymProductCB newMyConditionBean() { return new SynonymProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * int count = synonymProductBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymProductCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymProductCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymProductCB cb) { // called by selectPage(cb)
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
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * SynonymProduct synonymProduct = synonymProductBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymProduct != null) {
     *     ... = synonymProduct.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProduct selectEntity(SynonymProductCB cb) {
        return doSelectEntity(cb, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> ENTITY doSelectEntity(SynonymProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymProductCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * SynonymProduct synonymProduct = synonymProductBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProduct selectEntityWithDeletedCheck(SynonymProductCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> ENTITY doSelectEntityWithDeletedCheck(SynonymProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymProductCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
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
    public SynonymProduct selectByPKValue(Long productId) {
        return doSelectByPKValue(productId, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> ENTITY doSelectByPKValue(Long productId, Class<ENTITY> entityType) {
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
    public SynonymProduct selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKValueWithDeletedCheck(productId, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> ENTITY doSelectByPKValueWithDeletedCheck(Long productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productId), entityType);
    }

    private SynonymProductCB buildPKCB(Long productId) {
        assertObjectNotNull("productId", productId);
        SynonymProductCB cb = newMyConditionBean();
        cb.query().setProductId_Equal(productId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymProduct&gt; synonymProductList = synonymProductBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymProduct synonymProduct : synonymProductList) {
     *     ... = synonymProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymProduct> selectList(SynonymProductCB cb) {
        return doSelectList(cb, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> ListResultBean<ENTITY> doSelectList(SynonymProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymProductCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymProduct&gt; page = synonymProductBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymProduct synonymProduct : page) {
     *     ... = synonymProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymProduct> selectPage(SynonymProductCB cb) {
        return doSelectPage(cb, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> PagingResultBean<ENTITY> doSelectPage(SynonymProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymProductCB>() {
            public int callbackSelectCount(SynonymProductCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * synonymProductBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymProduct&gt;() {
     *     public void handle(SynonymProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymProduct. (NotNull)
     */
    public void selectCursor(SynonymProductCB cb, EntityRowHandler<SynonymProduct> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymProduct.class);
    }

    protected <ENTITY extends SynonymProduct> void doSelectCursor(SynonymProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymProductCB>() {
            public void callbackSelectCursor(SynonymProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymProductBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymProductCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymProductCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymProductCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'SynonymProductStatus'.
     * @param synonymProductList The list of synonymProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymProductStatus> pulloutSynonymProductStatus(List<SynonymProduct> synonymProductList) {
        return helpPulloutInternally(synonymProductList, new InternalPulloutCallback<SynonymProduct, SynonymProductStatus>() {
            public SynonymProductStatus getFr(SynonymProduct et) { return et.getSynonymProductStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SynonymProductStatus et, List<SynonymProduct> ls)
            { et.setSynonymProductList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param synonymProductList The list of synonymProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymProduct> synonymProductList) {
        return helpExtractListInternally(synonymProductList, new InternalExtractCallback<SynonymProduct, Long>() {
            public Long getCV(SynonymProduct et) { return et.getProductId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key productHandleCode.
     * @param synonymProductList The list of synonymProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductHandleCodeList(List<SynonymProduct> synonymProductList) {
        return helpExtractListInternally(synonymProductList, new InternalExtractCallback<SynonymProduct, String>() {
            public String getCV(SynonymProduct et) { return et.getProductHandleCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymProduct synonymProduct = new SynonymProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProduct.setFoo...(value);
     * synonymProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProduct.set...;</span>
     * synonymProductBhv.<span style="color: #FD4747">insert</span>(synonymProduct);
     * ... = synonymProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymProduct synonymProduct) {
        doInsert(synonymProduct, null);
    }

    protected void doInsert(SynonymProduct synonymProduct, InsertOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareInsertOption(op);
        delegateInsert(synonymProduct, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymProductCB> op) {
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductBhv.<span style="color: #FD4747">update</span>(synonymProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymProduct synonymProduct) {
        doUpdate(synonymProduct, null);
    }

    protected void doUpdate(SynonymProduct synonymProduct, final UpdateOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymProduct, new InternalUpdateCallback<SynonymProduct>() {
            public int callbackDelegateUpdate(SynonymProduct et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymProductCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymProductCB createCBForVaryingUpdate() {
        SynonymProductCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymProductCB createCBForSpecifiedUpdate() {
        SynonymProductCB cb = newMyConditionBean();
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * synonymProductBhv.<span style="color: #FD4747">updateNonstrict</span>(synonymProduct);
     * </pre>
     * @param synonymProduct The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final SynonymProduct synonymProduct) {
        doUpdateNonstrict(synonymProduct, null);
    }

    protected void doUpdateNonstrict(SynonymProduct synonymProduct, final UpdateOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(synonymProduct, new InternalUpdateNonstrictCallback<SynonymProduct>() {
            public int callbackDelegateUpdateNonstrict(SynonymProduct et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param synonymProduct The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymProduct synonymProduct) {
        doInesrtOrUpdate(synonymProduct, null, null);
    }

    protected void doInesrtOrUpdate(SynonymProduct synonymProduct, final InsertOption<SynonymProductCB> iop, final UpdateOption<SynonymProductCB> uop) {
        helpInsertOrUpdateInternally(synonymProduct, new InternalInsertOrUpdateCallback<SynonymProduct, SynonymProductCB>() {
            public void callbackInsert(SynonymProduct et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymProduct et) { doUpdate(et, uop); }
            public SynonymProductCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymProductCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymProductCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymProductCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymProduct The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymProduct synonymProduct) {
        doInesrtOrUpdateNonstrict(synonymProduct, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(SynonymProduct synonymProduct, final InsertOption<SynonymProductCB> iop, final UpdateOption<SynonymProductCB> uop) {
        helpInsertOrUpdateInternally(synonymProduct, new InternalInsertOrUpdateNonstrictCallback<SynonymProduct>() {
            public void callbackInsert(SynonymProduct et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(SynonymProduct et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymProductCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymProductCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductBhv.<span style="color: #FD4747">delete</span>(synonymProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymProduct synonymProduct) {
        doDelete(synonymProduct, null);
    }

    protected void doDelete(SynonymProduct synonymProduct, final DeleteOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymProduct, new InternalDeleteCallback<SynonymProduct>() {
            public int callbackDelegateDelete(SynonymProduct et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymProductCB> op) {
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * synonymProductBhv.<span style="color: #FD4747">deleteNonstrict</span>(synonymProduct);
     * </pre>
     * @param synonymProduct The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymProduct synonymProduct) {
        doDeleteNonstrict(synonymProduct, null);
    }

    protected void doDeleteNonstrict(SynonymProduct synonymProduct, final DeleteOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(synonymProduct, new InternalDeleteNonstrictCallback<SynonymProduct>() {
            public int callbackDelegateDeleteNonstrict(SynonymProduct et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * synonymProductBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(synonymProduct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymProduct The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymProduct synonymProduct) {
        doDeleteNonstrictIgnoreDeleted(synonymProduct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymProduct synonymProduct, final DeleteOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(synonymProduct, new InternalDeleteNonstrictIgnoreDeletedCallback<SynonymProduct>() {
            public int callbackDelegateDeleteNonstrict(SynonymProduct et) { return delegateDeleteNonstrict(et, op); } });
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
     *     SynonymProduct synonymProduct = new SynonymProduct();
     *     synonymProduct.setFooName("foo");
     *     if (...) {
     *         synonymProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymProductList.add(synonymProduct);
     * }
     * synonymProductBhv.<span style="color: #FD4747">batchInsert</span>(synonymProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymProduct> synonymProductList) {
        InsertOption<SynonymProductCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymProductList, op);
    }

    protected int[] doBatchInsert(List<SynonymProduct> synonymProductList, InsertOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProductList", synonymProductList);
        prepareBatchInsertOption(synonymProductList, op);
        return delegateBatchInsert(synonymProductList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymProduct> synonymProductList, InsertOption<SynonymProductCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymProductList);
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
     *     SynonymProduct synonymProduct = new SynonymProduct();
     *     synonymProduct.setFooName("foo");
     *     if (...) {
     *         synonymProduct.setFooPrice(123);
     *     } else {
     *         synonymProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymProductList.add(synonymProduct);
     * }
     * synonymProductBhv.<span style="color: #FD4747">batchUpdate</span>(synonymProductList);
     * </pre>
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymProduct> synonymProductList) {
        UpdateOption<SynonymProductCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymProductList, op);
    }

    protected int[] doBatchUpdate(List<SynonymProduct> synonymProductList, UpdateOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProductList", synonymProductList);
        prepareBatchUpdateOption(synonymProductList, op);
        return delegateBatchUpdate(synonymProductList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymProduct> synonymProductList, UpdateOption<SynonymProductCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymProductList);
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
     * synonymProductBhv.<span style="color: #FD4747">batchUpdate</span>(synonymProductList, new SpecifyQuery<SynonymProductCB>() {
     *     public void specify(SynonymProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymProductBhv.<span style="color: #FD4747">batchUpdate</span>(synonymProductList, new SpecifyQuery<SynonymProductCB>() {
     *     public void specify(SynonymProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymProduct> synonymProductList, SpecifyQuery<SynonymProductCB> updateColumnSpec) {
        return doBatchUpdate(synonymProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymProduct synonymProduct = new SynonymProduct();
     *     synonymProduct.setFooName("foo");
     *     if (...) {
     *         synonymProduct.setFooPrice(123);
     *     } else {
     *         synonymProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymProductList.add(synonymProduct);
     * }
     * synonymProductBhv.<span style="color: #FD4747">batchUpdate</span>(synonymProductList);
     * </pre>
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymProduct> synonymProductList) {
        UpdateOption<SynonymProductCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(synonymProductList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<SynonymProduct> synonymProductList, UpdateOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProductList", synonymProductList);
        prepareBatchUpdateOption(synonymProductList, op);
        return delegateBatchUpdateNonstrict(synonymProductList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymProductBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(synonymProductList, new SpecifyQuery<SynonymProductCB>() {
     *     public void specify(SynonymProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymProductBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(synonymProductList, new SpecifyQuery<SynonymProductCB>() {
     *     public void specify(SynonymProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymProduct> synonymProductList, SpecifyQuery<SynonymProductCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymProduct> synonymProductList) {
        return doBatchDelete(synonymProductList, null);
    }

    protected int[] doBatchDelete(List<SynonymProduct> synonymProductList, DeleteOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProductList", synonymProductList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymProductList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymProduct> synonymProductList) {
        return doBatchDeleteNonstrict(synonymProductList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<SynonymProduct> synonymProductList, DeleteOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProductList", synonymProductList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(synonymProductList, op);
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
     * synonymProductBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymProduct, SynonymProductCB&gt;() {
     *     public ConditionBean setup(synonymProduct entity, SynonymProductCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymProduct, SynonymProductCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymProduct, SynonymProductCB> sp, InsertOption<SynonymProductCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymProduct e = new SynonymProduct();
        SynonymProductCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymProductCB createCBForQueryInsert() {
        SynonymProductCB cb = newMyConditionBean();
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProduct.setPK...(value);</span>
     * synonymProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * synonymProductBhv.<span style="color: #FD4747">queryUpdate</span>(synonymProduct, cb);
     * </pre>
     * @param synonymProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymProduct synonymProduct, SynonymProductCB cb) {
        return doQueryUpdate(synonymProduct, cb, null);
    }

    protected int doQueryUpdate(SynonymProduct synonymProduct, SynonymProductCB cb, UpdateOption<SynonymProductCB> op) {
        assertObjectNotNull("synonymProduct", synonymProduct); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymProduct, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymProductCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymProductCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * synonymProductBhv.<span style="color: #FD4747">queryDelete</span>(synonymProduct, cb);
     * </pre>
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymProductCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymProductCB cb, DeleteOption<SynonymProductCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymProductCB)cb); }
        else { return varyingQueryDelete((SynonymProductCB)cb, downcast(op)); }
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProduct.setFoo...(value);
     * synonymProduct.setBar...(value);
     * InsertOption<SynonymProductCB> option = new InsertOption<SynonymProductCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymProductBhv.<span style="color: #FD4747">varyingInsert</span>(synonymProduct, option);
     * ... = synonymProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymProduct synonymProduct, InsertOption<SynonymProductCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymProduct, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymProductCB&gt; option = new UpdateOption&lt;SynonymProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymProductCB&gt;() {
     *         public void specify(SynonymProductCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymProductBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymProduct synonymProduct, UpdateOption<SynonymProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymProduct, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymProduct synonymProduct = new SynonymProduct();
     * synonymProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymProductCB&gt; option = new UpdateOption&lt;SynonymProductCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymProductCB&gt;() {
     *     public void specify(SynonymProductCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymProductBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(synonymProduct, option);
     * </pre>
     * @param synonymProduct The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymProduct synonymProduct, UpdateOption<SynonymProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymProduct, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymProduct The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymProduct synonymProduct, InsertOption<SynonymProductCB> insertOption, UpdateOption<SynonymProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymProduct, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymProduct The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymProduct synonymProduct, InsertOption<SynonymProductCB> insertOption, UpdateOption<SynonymProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(synonymProduct, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymProduct synonymProduct, DeleteOption<SynonymProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymProduct, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymProduct synonymProduct, DeleteOption<SynonymProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymProduct, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymProduct> synonymProductList, InsertOption<SynonymProductCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymProductList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymProduct> synonymProductList, UpdateOption<SynonymProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymProductList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymProduct> synonymProductList, UpdateOption<SynonymProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymProductList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymProduct> synonymProductList, DeleteOption<SynonymProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymProductList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymProduct> synonymProductList, DeleteOption<SynonymProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymProductList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymProduct, SynonymProductCB> setupper, InsertOption<SynonymProductCB> option) {
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
     * SynonymProduct synonymProduct = new SynonymProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProduct.setPK...(value);</span>
     * synonymProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProduct.setVersionNo(value);</span>
     * SynonymProductCB cb = new SynonymProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymProductCB&gt; option = new UpdateOption&lt;SynonymProductCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymProductCB&gt;() {
     *     public void specify(SynonymProductCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymProductBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymProduct, cb, option);
     * </pre>
     * @param synonymProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymProduct synonymProduct, SynonymProductCB cb, UpdateOption<SynonymProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymProduct, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymProduct. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymProductCB cb, DeleteOption<SynonymProductCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymProductBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymProductCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymProductCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymProduct> void delegateSelectCursor(SynonymProductCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymProduct> List<ENTITY> delegateSelectList(SynonymProductCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymProduct et, InsertOption<SynonymProductCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymProduct et, UpdateOption<SynonymProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(SynonymProduct et, UpdateOption<SynonymProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymProduct et, DeleteOption<SynonymProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(SynonymProduct et, DeleteOption<SynonymProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymProduct> ls, InsertOption<SynonymProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymProduct> ls, UpdateOption<SynonymProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymProduct> ls, UpdateOption<SynonymProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymProduct> ls, DeleteOption<SynonymProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymProduct> ls, DeleteOption<SynonymProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymProduct et, SynonymProductCB inCB, ConditionBean resCB, InsertOption<SynonymProductCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymProduct et, SynonymProductCB cb, UpdateOption<SynonymProductCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymProductCB cb, DeleteOption<SynonymProductCB> op)
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
    protected SynonymProduct downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymProduct.class);
    }

    protected SynonymProductCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymProduct> downcast(List<? extends Entity> ls) {
        return (List<SynonymProduct>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymProductCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymProductCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymProductCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymProduct, SynonymProductCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymProduct, SynonymProductCB>)sp;
    }
}
