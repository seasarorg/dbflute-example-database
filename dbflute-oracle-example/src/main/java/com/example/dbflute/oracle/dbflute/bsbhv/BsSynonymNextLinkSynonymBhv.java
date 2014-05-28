package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of SYNONYM_NEXT_LINK_SYNONYM as SYNONYM. <br />
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
public abstract class BsSynonymNextLinkSynonymBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_LINK_SYNONYM"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymNextLinkSynonymDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkSynonymDbm getMyDBMeta() { return SynonymNextLinkSynonymDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkSynonym newMyEntity() { return new SynonymNextLinkSynonym(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkSynonymCB newMyConditionBean() { return new SynonymNextLinkSynonymCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkSynonymCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextLinkSynonymCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextLinkSynonymCB cb) { // called by selectPage(cb)
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
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSynonym synonymNextLinkSynonym = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymNextLinkSynonym != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymNextLinkSynonym.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntity(SynonymNextLinkSynonymCB cb) {
        return doSelectEntity(cb, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectEntity(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymNextLinkSynonymCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSynonymCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) {
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
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSynonym synonymNextLinkSynonym = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkSynonym.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectEntityWithDeletedCheck(SynonymNextLinkSynonymCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectEntityWithDeletedCheck(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymNextLinkSynonymCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSynonymCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectByPKValue(Long productId) {
        return doSelectByPK(productId, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectByPK(Long productId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(productId), entityType);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(productId, entityType), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSynonym selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKWithDeletedCheck(productId, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ENTITY doSelectByPKWithDeletedCheck(Long productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), entityType);
    }

    protected SynonymNextLinkSynonymCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        SynonymNextLinkSynonymCB cb = newMyConditionBean(); cb.acceptPrimaryKey(productId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkSynonym&gt; synonymNextLinkSynonymList = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymNextLinkSynonym synonymNextLinkSynonym : synonymNextLinkSynonymList) {
     *     ... = synonymNextLinkSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSynonym> selectList(SynonymNextLinkSynonymCB cb) {
        return doSelectList(cb, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> ListResultBean<ENTITY> doSelectList(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymNextLinkSynonymCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSynonymCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkSynonym&gt; page = synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkSynonym synonymNextLinkSynonym : page) {
     *     ... = synonymNextLinkSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSynonym> selectPage(SynonymNextLinkSynonymCB cb) {
        return doSelectPage(cb, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> PagingResultBean<ENTITY> doSelectPage(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymNextLinkSynonymCB>() {
            public int callbackSelectCount(SynonymNextLinkSynonymCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkSynonym&gt;() {
     *     public void handle(SynonymNextLinkSynonym entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkSynonym. (NotNull)
     */
    public void selectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<SynonymNextLinkSynonym> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymNextLinkSynonym.class);
    }

    protected <ENTITY extends SynonymNextLinkSynonym> void doSelectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymNextLinkSynonymCB>() {
            public void callbackSelectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymNextLinkSynonymCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymNextLinkSynonymCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymNextLinkSynonymCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param synonymNextLinkSynonymList The list of synonymNextLinkSynonym. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return helpExtractListInternally(synonymNextLinkSynonymList, new InternalExtractCallback<SynonymNextLinkSynonym, Long>() {
            public Long getCV(SynonymNextLinkSynonym et) { return et.getProductId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">insert</span>(synonymNextLinkSynonym);
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkSynonym The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInsert(synonymNextLinkSynonym, null);
    }

    protected void doInsert(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareInsertOption(op);
        delegateInsert(synonymNextLinkSynonym, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextLinkSynonymCB> op) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">update</span>(synonymNextLinkSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdate(synonymNextLinkSynonym, null);
    }

    protected void doUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, final UpdateOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymNextLinkSynonym, new InternalUpdateCallback<SynonymNextLinkSynonym>() {
            public int callbackDelegateUpdate(SynonymNextLinkSynonym et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextLinkSynonymCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymNextLinkSynonymCB createCBForVaryingUpdate() {
        SynonymNextLinkSynonymCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymNextLinkSynonymCB createCBForSpecifiedUpdate() {
        SynonymNextLinkSynonymCB cb = newMyConditionBean();
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">updateNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doUpdateNonstrict(synonymNextLinkSynonym, null);
    }

    protected void doUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, final UpdateOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(synonymNextLinkSynonym, new InternalUpdateNonstrictCallback<SynonymNextLinkSynonym>() {
            public int callbackDelegateUpdateNonstrict(SynonymNextLinkSynonym et) { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInesrtOrUpdate(synonymNextLinkSynonym, null, null);
    }

    protected void doInesrtOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, final InsertOption<SynonymNextLinkSynonymCB> iop, final UpdateOption<SynonymNextLinkSynonymCB> uop) {
        helpInsertOrUpdateInternally(synonymNextLinkSynonym, new InternalInsertOrUpdateCallback<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB>() {
            public void callbackInsert(SynonymNextLinkSynonym et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymNextLinkSynonym et) { doUpdate(et, uop); }
            public SynonymNextLinkSynonymCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymNextLinkSynonymCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextLinkSynonymCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextLinkSynonymCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymNextLinkSynonym The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doInesrtOrUpdateNonstrict(synonymNextLinkSynonym, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, final InsertOption<SynonymNextLinkSynonymCB> iop, final UpdateOption<SynonymNextLinkSynonymCB> uop) {
        helpInsertOrUpdateInternally(synonymNextLinkSynonym, new InternalInsertOrUpdateNonstrictCallback<SynonymNextLinkSynonym>() {
            public void callbackInsert(SynonymNextLinkSynonym et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(SynonymNextLinkSynonym et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextLinkSynonymCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextLinkSynonymCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">delete</span>(synonymNextLinkSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDelete(synonymNextLinkSynonym, null);
    }

    protected void doDelete(SynonymNextLinkSynonym synonymNextLinkSynonym, final DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymNextLinkSynonym, new InternalDeleteCallback<SynonymNextLinkSynonym>() {
            public int callbackDelegateDelete(SynonymNextLinkSynonym et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextLinkSynonymCB> op) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">deleteNonstrict</span>(synonymNextLinkSynonym);
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDeleteNonstrict(synonymNextLinkSynonym, null);
    }

    protected void doDeleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, final DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(synonymNextLinkSynonym, new InternalDeleteNonstrictCallback<SynonymNextLinkSynonym>() {
            public int callbackDelegateDeleteNonstrict(SynonymNextLinkSynonym et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(synonymNextLinkSynonym);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymNextLinkSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymNextLinkSynonym synonymNextLinkSynonym) {
        doDeleteNonstrictIgnoreDeleted(synonymNextLinkSynonym, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymNextLinkSynonym synonymNextLinkSynonym, final DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(synonymNextLinkSynonym, new InternalDeleteNonstrictIgnoreDeletedCallback<SynonymNextLinkSynonym>() {
            public int callbackDelegateDeleteNonstrict(SynonymNextLinkSynonym et) { return delegateDeleteNonstrict(et, op); } });
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchInsert</span>(synonymNextLinkSynonymList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        InsertOption<SynonymNextLinkSynonymCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymNextLinkSynonymList, op);
    }

    protected int[] doBatchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, InsertOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonymList", synonymNextLinkSynonymList);
        prepareBatchInsertOption(synonymNextLinkSynonymList, op);
        return delegateBatchInsert(synonymNextLinkSynonymList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, InsertOption<SynonymNextLinkSynonymCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymNextLinkSynonymList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        UpdateOption<SynonymNextLinkSynonymCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymNextLinkSynonymList, op);
    }

    protected int[] doBatchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonymList", synonymNextLinkSynonymList);
        prepareBatchUpdateOption(synonymNextLinkSynonymList, op);
        return delegateBatchUpdate(synonymNextLinkSynonymList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymNextLinkSynonymList);
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
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, SpecifyQuery<SynonymNextLinkSynonymCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     *     synonymNextLinkSynonym.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSynonym.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSynonymList.add(synonymNextLinkSynonym);
     * }
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(synonymNextLinkSynonymList);
     * </pre>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        UpdateOption<SynonymNextLinkSynonymCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonymList", synonymNextLinkSynonymList);
        prepareBatchUpdateOption(synonymNextLinkSynonymList, op);
        return delegateBatchUpdateNonstrict(synonymNextLinkSynonymList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymNextLinkSynonymList, new SpecifyQuery<SynonymNextLinkSynonymCB>() {
     *     public void specify(SynonymNextLinkSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, SpecifyQuery<SynonymNextLinkSynonymCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDelete(synonymNextLinkSynonymList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonymList", synonymNextLinkSynonymList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymNextLinkSynonymList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList) {
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonymList", synonymNextLinkSynonymList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(synonymNextLinkSynonymList, op);
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
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkSynonym, SynonymNextLinkSynonymCB&gt;() {
     *     public ConditionBean setup(synonymNextLinkSynonym entity, SynonymNextLinkSynonymCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> sp, InsertOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymNextLinkSynonym e = new SynonymNextLinkSynonym();
        SynonymNextLinkSynonymCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymNextLinkSynonymCB createCBForQueryInsert() {
        SynonymNextLinkSynonymCB cb = newMyConditionBean();
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryUpdate</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb) {
        return doQueryUpdate(synonymNextLinkSynonym, cb, null);
    }

    protected int doQueryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb, UpdateOption<SynonymNextLinkSynonymCB> op) {
        assertObjectNotNull("synonymNextLinkSynonym", synonymNextLinkSynonym); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymNextLinkSynonym, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymNextLinkSynonymCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymNextLinkSynonymCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">queryDelete</span>(synonymNextLinkSynonym, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkSynonymCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextLinkSynonymCB cb, DeleteOption<SynonymNextLinkSynonymCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymNextLinkSynonymCB)cb); }
        else { return varyingQueryDelete((SynonymNextLinkSynonymCB)cb, downcast(op)); }
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSynonym.setFoo...(value);
     * synonymNextLinkSynonym.setBar...(value);
     * InsertOption<SynonymNextLinkSynonymCB> option = new InsertOption<SynonymNextLinkSynonymCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingInsert</span>(synonymNextLinkSynonym, option);
     * ... = synonymNextLinkSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkSynonym The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkSynonym, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *         public void specify(SynonymNextLinkSynonymCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymNextLinkSynonym, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSynonym The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkSynonym, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * synonymNextLinkSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *     public void specify(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(synonymNextLinkSynonym, option);
     * </pre>
     * @param synonymNextLinkSynonym The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymNextLinkSynonym, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkSynonym The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> insertOption, UpdateOption<SynonymNextLinkSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymNextLinkSynonym, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, InsertOption<SynonymNextLinkSynonymCB> insertOption, UpdateOption<SynonymNextLinkSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(synonymNextLinkSynonym, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkSynonym synonymNextLinkSynonym, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkSynonym, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymNextLinkSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymNextLinkSynonym synonymNextLinkSynonym, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymNextLinkSynonym, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, InsertOption<SynonymNextLinkSynonymCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymNextLinkSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymNextLinkSynonym> synonymNextLinkSynonymList, DeleteOption<SynonymNextLinkSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymNextLinkSynonymList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> setupper, InsertOption<SynonymNextLinkSynonymCB> option) {
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
     * SynonymNextLinkSynonym synonymNextLinkSynonym = new SynonymNextLinkSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setPK...(value);</span>
     * synonymNextLinkSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSynonym.setVersionNo(value);</span>
     * SynonymNextLinkSynonymCB cb = new SynonymNextLinkSynonymCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkSynonymCB&gt; option = new UpdateOption&lt;SynonymNextLinkSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSynonymCB&gt;() {
     *     public void specify(SynonymNextLinkSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSynonymBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymNextLinkSynonym, cb, option);
     * </pre>
     * @param synonymNextLinkSynonym The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSynonym synonymNextLinkSynonym, SynonymNextLinkSynonymCB cb, UpdateOption<SynonymNextLinkSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkSynonym, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextLinkSynonym. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkSynonymCB cb, DeleteOption<SynonymNextLinkSynonymCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkSynonymBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymNextLinkSynonymCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymNextLinkSynonymCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymNextLinkSynonym> void delegateSelectCursor(SynonymNextLinkSynonymCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymNextLinkSynonym> List<ENTITY> delegateSelectList(SynonymNextLinkSynonymCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymNextLinkSynonym et, InsertOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymNextLinkSynonym et, UpdateOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(SynonymNextLinkSynonym et, UpdateOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymNextLinkSynonym et, DeleteOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(SynonymNextLinkSynonym et, DeleteOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymNextLinkSynonym> ls, InsertOption<SynonymNextLinkSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymNextLinkSynonym> ls, UpdateOption<SynonymNextLinkSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymNextLinkSynonym> ls, UpdateOption<SynonymNextLinkSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymNextLinkSynonym> ls, DeleteOption<SynonymNextLinkSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymNextLinkSynonym> ls, DeleteOption<SynonymNextLinkSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymNextLinkSynonym et, SynonymNextLinkSynonymCB inCB, ConditionBean resCB, InsertOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymNextLinkSynonym et, SynonymNextLinkSynonymCB cb, UpdateOption<SynonymNextLinkSynonymCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymNextLinkSynonymCB cb, DeleteOption<SynonymNextLinkSynonymCB> op)
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
    protected SynonymNextLinkSynonym downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymNextLinkSynonym.class);
    }

    protected SynonymNextLinkSynonymCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymNextLinkSynonymCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymNextLinkSynonym> downcast(List<? extends Entity> ls) {
        return (List<SynonymNextLinkSynonym>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextLinkSynonymCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymNextLinkSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextLinkSynonymCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymNextLinkSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextLinkSynonymCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymNextLinkSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymNextLinkSynonym, SynonymNextLinkSynonymCB>)sp;
    }
}
