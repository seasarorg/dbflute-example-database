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
 * The behavior of (隣の秘密で権限あり)SYNONYM_NEXT_SECRET_AUTH as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_AUTH_CODE
 *
 * [column]
 *     SECRET_AUTH_CODE, SECRET_AUTH_NAME
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
public abstract class BsSynonymNextSecretAuthBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_SECRET_AUTH"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymNextSecretAuthDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextSecretAuthDbm getMyDBMeta() { return SynonymNextSecretAuthDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextSecretAuth newMyEntity() { return new SynonymNextSecretAuth(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextSecretAuthCB newMyConditionBean() { return new SynonymNextSecretAuthCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextSecretAuthBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextSecretAuthCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextSecretAuthCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextSecretAuthCB cb) { // called by selectPage(cb)
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
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * SynonymNextSecretAuth synonymNextSecretAuth = synonymNextSecretAuthBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymNextSecretAuth != null) {
     *     ... = synonymNextSecretAuth.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectEntity(SynonymNextSecretAuthCB cb) {
        return doSelectEntity(cb, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectEntity(final SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymNextSecretAuthCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * SynonymNextSecretAuth synonymNextSecretAuth = synonymNextSecretAuthBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextSecretAuth.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectEntityWithDeletedCheck(SynonymNextSecretAuthCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectEntityWithDeletedCheck(final SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymNextSecretAuthCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param secretAuthCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectByPKValue(String secretAuthCode) {
        return doSelectByPKValue(secretAuthCode, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectByPKValue(String secretAuthCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(secretAuthCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param secretAuthCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextSecretAuth selectByPKValueWithDeletedCheck(String secretAuthCode) {
        return doSelectByPKValueWithDeletedCheck(secretAuthCode, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> ENTITY doSelectByPKValueWithDeletedCheck(String secretAuthCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(secretAuthCode), entityType);
    }

    private SynonymNextSecretAuthCB buildPKCB(String secretAuthCode) {
        assertObjectNotNull("secretAuthCode", secretAuthCode);
        SynonymNextSecretAuthCB cb = newMyConditionBean();
        cb.query().setSecretAuthCode_Equal(secretAuthCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextSecretAuth&gt; synonymNextSecretAuthList = synonymNextSecretAuthBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymNextSecretAuth synonymNextSecretAuth : synonymNextSecretAuthList) {
     *     ... = synonymNextSecretAuth.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextSecretAuth> selectList(SynonymNextSecretAuthCB cb) {
        return doSelectList(cb, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> ListResultBean<ENTITY> doSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymNextSecretAuthCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextSecretAuth&gt; page = synonymNextSecretAuthBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextSecretAuth synonymNextSecretAuth : page) {
     *     ... = synonymNextSecretAuth.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextSecretAuth> selectPage(SynonymNextSecretAuthCB cb) {
        return doSelectPage(cb, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> PagingResultBean<ENTITY> doSelectPage(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymNextSecretAuthCB>() {
            public int callbackSelectCount(SynonymNextSecretAuthCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextSecretAuth&gt;() {
     *     public void handle(SynonymNextSecretAuth entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextSecretAuth. (NotNull)
     */
    public void selectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<SynonymNextSecretAuth> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymNextSecretAuth.class);
    }

    protected <ENTITY extends SynonymNextSecretAuth> void doSelectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymNextSecretAuthCB>() {
            public void callbackSelectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextSecretAuthCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymNextSecretAuthCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymNextSecretAuthCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymNextSecretAuthCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key secretAuthCode.
     * @param synonymNextSecretAuthList The list of synonymNextSecretAuth. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretAuthCodeList(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        return helpExtractListInternally(synonymNextSecretAuthList, new InternalExtractCallback<SynonymNextSecretAuth, String>() {
            public String getCV(SynonymNextSecretAuth et) { return et.getSecretAuthCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSecretAuth.setFoo...(value);
     * synonymNextSecretAuth.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">insert</span>(synonymNextSecretAuth);
     * ... = synonymNextSecretAuth.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextSecretAuth The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextSecretAuth synonymNextSecretAuth) {
        doInsert(synonymNextSecretAuth, null);
    }

    protected void doInsert(SynonymNextSecretAuth synonymNextSecretAuth, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", synonymNextSecretAuth);
        prepareInsertOption(op);
        delegateInsert(synonymNextSecretAuth, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextSecretAuthCB> op) {
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSecretAuth.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSecretAuth.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSecretAuthBhv.<span style="color: #FD4747">update</span>(synonymNextSecretAuth);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymNextSecretAuth synonymNextSecretAuth) {
        doUpdate(synonymNextSecretAuth, null);
    }

    protected void doUpdate(SynonymNextSecretAuth synonymNextSecretAuth, final UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", synonymNextSecretAuth);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymNextSecretAuth, new InternalUpdateCallback<SynonymNextSecretAuth>() {
            public int callbackDelegateUpdate(SynonymNextSecretAuth et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextSecretAuthCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymNextSecretAuthCB createCBForVaryingUpdate() {
        SynonymNextSecretAuthCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymNextSecretAuthCB createCBForSpecifiedUpdate() {
        SynonymNextSecretAuthCB cb = newMyConditionBean();
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
     * @param synonymNextSecretAuth The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextSecretAuth synonymNextSecretAuth) {
        doInesrtOrUpdate(synonymNextSecretAuth, null, null);
    }

    protected void doInesrtOrUpdate(SynonymNextSecretAuth synonymNextSecretAuth, final InsertOption<SynonymNextSecretAuthCB> iop, final UpdateOption<SynonymNextSecretAuthCB> uop) {
        helpInsertOrUpdateInternally(synonymNextSecretAuth, new InternalInsertOrUpdateCallback<SynonymNextSecretAuth, SynonymNextSecretAuthCB>() {
            public void callbackInsert(SynonymNextSecretAuth et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymNextSecretAuth et) { doUpdate(et, uop); }
            public SynonymNextSecretAuthCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymNextSecretAuthCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextSecretAuthCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextSecretAuthCB>();
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSecretAuth.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextSecretAuthBhv.<span style="color: #FD4747">delete</span>(synonymNextSecretAuth);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextSecretAuth synonymNextSecretAuth) {
        doDelete(synonymNextSecretAuth, null);
    }

    protected void doDelete(SynonymNextSecretAuth synonymNextSecretAuth, final DeleteOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", synonymNextSecretAuth);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymNextSecretAuth, new InternalDeleteCallback<SynonymNextSecretAuth>() {
            public int callbackDelegateDelete(SynonymNextSecretAuth et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextSecretAuthCB> op) {
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
     *     SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     *     synonymNextSecretAuth.setFooName("foo");
     *     if (...) {
     *         synonymNextSecretAuth.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextSecretAuthList.add(synonymNextSecretAuth);
     * }
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">batchInsert</span>(synonymNextSecretAuthList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        InsertOption<SynonymNextSecretAuthCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymNextSecretAuthList, op);
    }

    protected int[] doBatchInsert(List<SynonymNextSecretAuth> synonymNextSecretAuthList, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", synonymNextSecretAuthList);
        prepareBatchInsertOption(synonymNextSecretAuthList, op);
        return delegateBatchInsert(synonymNextSecretAuthList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymNextSecretAuth> synonymNextSecretAuthList, InsertOption<SynonymNextSecretAuthCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymNextSecretAuthList);
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
     *     SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     *     synonymNextSecretAuth.setFooName("foo");
     *     if (...) {
     *         synonymNextSecretAuth.setFooPrice(123);
     *     } else {
     *         synonymNextSecretAuth.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextSecretAuth.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextSecretAuthList.add(synonymNextSecretAuth);
     * }
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSecretAuthList);
     * </pre>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        UpdateOption<SynonymNextSecretAuthCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymNextSecretAuthList, op);
    }

    protected int[] doBatchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList, UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", synonymNextSecretAuthList);
        prepareBatchUpdateOption(synonymNextSecretAuthList, op);
        return delegateBatchUpdate(synonymNextSecretAuthList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextSecretAuth> synonymNextSecretAuthList, UpdateOption<SynonymNextSecretAuthCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymNextSecretAuthList);
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
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSecretAuthList, new SpecifyQuery<SynonymNextSecretAuthCB>() {
     *     public void specify(SynonymNextSecretAuthCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextSecretAuthList, new SpecifyQuery<SynonymNextSecretAuthCB>() {
     *     public void specify(SynonymNextSecretAuthCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList, SpecifyQuery<SynonymNextSecretAuthCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextSecretAuthList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextSecretAuth> synonymNextSecretAuthList) {
        return doBatchDelete(synonymNextSecretAuthList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextSecretAuth> synonymNextSecretAuthList, DeleteOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuthList", synonymNextSecretAuthList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymNextSecretAuthList, op);
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
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextSecretAuth, SynonymNextSecretAuthCB&gt;() {
     *     public ConditionBean setup(synonymNextSecretAuth entity, SynonymNextSecretAuthCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> sp, InsertOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymNextSecretAuth e = new SynonymNextSecretAuth();
        SynonymNextSecretAuthCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymNextSecretAuthCB createCBForQueryInsert() {
        SynonymNextSecretAuthCB cb = newMyConditionBean();
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setPK...(value);</span>
     * synonymNextSecretAuth.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setVersionNo(value);</span>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">queryUpdate</span>(synonymNextSecretAuth, cb);
     * </pre>
     * @param synonymNextSecretAuth The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextSecretAuth synonymNextSecretAuth, SynonymNextSecretAuthCB cb) {
        return doQueryUpdate(synonymNextSecretAuth, cb, null);
    }

    protected int doQueryUpdate(SynonymNextSecretAuth synonymNextSecretAuth, SynonymNextSecretAuthCB cb, UpdateOption<SynonymNextSecretAuthCB> op) {
        assertObjectNotNull("synonymNextSecretAuth", synonymNextSecretAuth); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymNextSecretAuth, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymNextSecretAuthCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymNextSecretAuthCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">queryDelete</span>(synonymNextSecretAuth, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextSecretAuthCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextSecretAuthCB cb, DeleteOption<SynonymNextSecretAuthCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymNextSecretAuthCB)cb); }
        else { return varyingQueryDelete((SynonymNextSecretAuthCB)cb, downcast(op)); }
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextSecretAuth.setFoo...(value);
     * synonymNextSecretAuth.setBar...(value);
     * InsertOption<SynonymNextSecretAuthCB> option = new InsertOption<SynonymNextSecretAuthCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">varyingInsert</span>(synonymNextSecretAuth, option);
     * ... = synonymNextSecretAuth.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextSecretAuth The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextSecretAuth synonymNextSecretAuth, InsertOption<SynonymNextSecretAuthCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextSecretAuth, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * synonymNextSecretAuth.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextSecretAuth.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextSecretAuth.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextSecretAuthCB&gt; option = new UpdateOption&lt;SynonymNextSecretAuthCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *         public void specify(SynonymNextSecretAuthCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextSecretAuthBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymNextSecretAuth, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextSecretAuth The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextSecretAuth synonymNextSecretAuth, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextSecretAuth, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextSecretAuth The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextSecretAuth synonymNextSecretAuth, InsertOption<SynonymNextSecretAuthCB> insertOption, UpdateOption<SynonymNextSecretAuthCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymNextSecretAuth, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextSecretAuth The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextSecretAuth synonymNextSecretAuth, DeleteOption<SynonymNextSecretAuthCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextSecretAuth, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextSecretAuth> synonymNextSecretAuthList, InsertOption<SynonymNextSecretAuthCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextSecretAuthList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextSecretAuth> synonymNextSecretAuthList, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextSecretAuthList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextSecretAuthList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextSecretAuth> synonymNextSecretAuthList, DeleteOption<SynonymNextSecretAuthCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextSecretAuthList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> setupper, InsertOption<SynonymNextSecretAuthCB> option) {
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
     * SynonymNextSecretAuth synonymNextSecretAuth = new SynonymNextSecretAuth();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setPK...(value);</span>
     * synonymNextSecretAuth.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextSecretAuth.setVersionNo(value);</span>
     * SynonymNextSecretAuthCB cb = new SynonymNextSecretAuthCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextSecretAuthCB&gt; option = new UpdateOption&lt;SynonymNextSecretAuthCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextSecretAuthCB&gt;() {
     *     public void specify(SynonymNextSecretAuthCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextSecretAuthBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymNextSecretAuth, cb, option);
     * </pre>
     * @param synonymNextSecretAuth The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextSecretAuth synonymNextSecretAuth, SynonymNextSecretAuthCB cb, UpdateOption<SynonymNextSecretAuthCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextSecretAuth, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextSecretAuth. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextSecretAuthCB cb, DeleteOption<SynonymNextSecretAuthCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextSecretAuthBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymNextSecretAuthCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymNextSecretAuthCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymNextSecretAuth> void delegateSelectCursor(SynonymNextSecretAuthCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymNextSecretAuth> List<ENTITY> delegateSelectList(SynonymNextSecretAuthCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymNextSecretAuth et, InsertOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymNextSecretAuth et, UpdateOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SynonymNextSecretAuth et, UpdateOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymNextSecretAuth et, DeleteOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SynonymNextSecretAuth et, DeleteOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymNextSecretAuth> ls, InsertOption<SynonymNextSecretAuthCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymNextSecretAuth> ls, UpdateOption<SynonymNextSecretAuthCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymNextSecretAuth> ls, UpdateOption<SynonymNextSecretAuthCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymNextSecretAuth> ls, DeleteOption<SynonymNextSecretAuthCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymNextSecretAuth> ls, DeleteOption<SynonymNextSecretAuthCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymNextSecretAuth et, SynonymNextSecretAuthCB inCB, ConditionBean resCB, InsertOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymNextSecretAuth et, SynonymNextSecretAuthCB cb, UpdateOption<SynonymNextSecretAuthCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymNextSecretAuthCB cb, DeleteOption<SynonymNextSecretAuthCB> op)
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
    protected SynonymNextSecretAuth downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymNextSecretAuth.class);
    }

    protected SynonymNextSecretAuthCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymNextSecretAuthCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymNextSecretAuth> downcast(List<? extends Entity> ls) {
        return (List<SynonymNextSecretAuth>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextSecretAuthCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymNextSecretAuthCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextSecretAuthCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymNextSecretAuthCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextSecretAuthCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymNextSecretAuthCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymNextSecretAuth, SynonymNextSecretAuthCB>)sp;
    }
}
