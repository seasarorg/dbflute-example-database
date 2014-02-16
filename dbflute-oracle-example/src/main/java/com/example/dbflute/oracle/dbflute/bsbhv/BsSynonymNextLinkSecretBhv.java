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
 * The behavior of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     SECRET_CODE
 *
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
public abstract class BsSynonymNextLinkSecretBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_NEXT_LINK_SECRET"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymNextLinkSecretDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymNextLinkSecretDbm getMyDBMeta() { return SynonymNextLinkSecretDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymNextLinkSecret newMyEntity() { return new SynonymNextLinkSecret(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymNextLinkSecretCB newMyConditionBean() { return new SynonymNextLinkSecretCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * int count = synonymNextLinkSecretBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymNextLinkSecretCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymNextLinkSecretCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymNextLinkSecretCB cb) { // called by selectPage(cb)
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
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSecret synonymNextLinkSecret = synonymNextLinkSecretBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymNextLinkSecret != null) {
     *     ... = synonymNextLinkSecret.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectEntity(SynonymNextLinkSecretCB cb) {
        return doSelectEntity(cb, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectEntity(final SynonymNextLinkSecretCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymNextLinkSecretCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * SynonymNextLinkSecret synonymNextLinkSecret = synonymNextLinkSecretBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymNextLinkSecret.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectEntityWithDeletedCheck(SynonymNextLinkSecretCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectEntityWithDeletedCheck(final SynonymNextLinkSecretCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymNextLinkSecretCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param secretCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectByPKValue(String secretCode) {
        return doSelectByPKValue(secretCode, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectByPKValue(String secretCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(secretCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param secretCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymNextLinkSecret selectByPKValueWithDeletedCheck(String secretCode) {
        return doSelectByPKValueWithDeletedCheck(secretCode, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> ENTITY doSelectByPKValueWithDeletedCheck(String secretCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(secretCode), entityType);
    }

    private SynonymNextLinkSecretCB buildPKCB(String secretCode) {
        assertObjectNotNull("secretCode", secretCode);
        SynonymNextLinkSecretCB cb = newMyConditionBean();
        cb.query().setSecretCode_Equal(secretCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymNextLinkSecret&gt; synonymNextLinkSecretList = synonymNextLinkSecretBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymNextLinkSecret synonymNextLinkSecret : synonymNextLinkSecretList) {
     *     ... = synonymNextLinkSecret.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymNextLinkSecret> selectList(SynonymNextLinkSecretCB cb) {
        return doSelectList(cb, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> ListResultBean<ENTITY> doSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymNextLinkSecretCB>() {
            public List<ENTITY> callbackSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymNextLinkSecret&gt; page = synonymNextLinkSecretBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymNextLinkSecret synonymNextLinkSecret : page) {
     *     ... = synonymNextLinkSecret.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymNextLinkSecret> selectPage(SynonymNextLinkSecretCB cb) {
        return doSelectPage(cb, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> PagingResultBean<ENTITY> doSelectPage(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymNextLinkSecretCB>() {
            public int callbackSelectCount(SynonymNextLinkSecretCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymNextLinkSecret&gt;() {
     *     public void handle(SynonymNextLinkSecret entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymNextLinkSecret. (NotNull)
     */
    public void selectCursor(SynonymNextLinkSecretCB cb, EntityRowHandler<SynonymNextLinkSecret> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymNextLinkSecret.class);
    }

    protected <ENTITY extends SynonymNextLinkSecret> void doSelectCursor(SynonymNextLinkSecretCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymNextLinkSecretCB>() {
            public void callbackSelectCursor(SynonymNextLinkSecretCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymNextLinkSecretCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymNextLinkSecretCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymNextLinkSecretCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymNextLinkSecretCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Extract the value list of (single) primary key secretCode.
     * @param synonymNextLinkSecretList The list of synonymNextLinkSecret. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretCodeList(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return helpExtractListInternally(synonymNextLinkSecretList, new InternalExtractCallback<SynonymNextLinkSecret, String>() {
            public String getCV(SynonymNextLinkSecret et) { return et.getSecretCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key secretName.
     * @param synonymNextLinkSecretList The list of synonymNextLinkSecret. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSecretNameList(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return helpExtractListInternally(synonymNextLinkSecretList, new InternalExtractCallback<SynonymNextLinkSecret, String>() {
            public String getCV(SynonymNextLinkSecret et) { return et.getSecretName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSecret.setFoo...(value);
     * synonymNextLinkSecret.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">insert</span>(synonymNextLinkSecret);
     * ... = synonymNextLinkSecret.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymNextLinkSecret The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymNextLinkSecret synonymNextLinkSecret) {
        doInsert(synonymNextLinkSecret, null);
    }

    protected void doInsert(SynonymNextLinkSecret synonymNextLinkSecret, InsertOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecret", synonymNextLinkSecret);
        prepareInsertOption(op);
        delegateInsert(synonymNextLinkSecret, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymNextLinkSecretCB> op) {
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSecret.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSecret.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSecretBhv.<span style="color: #FD4747">update</span>(synonymNextLinkSecret);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymNextLinkSecret synonymNextLinkSecret) {
        doUpdate(synonymNextLinkSecret, null);
    }

    protected void doUpdate(SynonymNextLinkSecret synonymNextLinkSecret, final UpdateOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecret", synonymNextLinkSecret);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymNextLinkSecret, new InternalUpdateCallback<SynonymNextLinkSecret>() {
            public int callbackDelegateUpdate(SynonymNextLinkSecret et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymNextLinkSecretCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymNextLinkSecretCB createCBForVaryingUpdate() {
        SynonymNextLinkSecretCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymNextLinkSecretCB createCBForSpecifiedUpdate() {
        SynonymNextLinkSecretCB cb = newMyConditionBean();
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
     * @param synonymNextLinkSecret The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymNextLinkSecret synonymNextLinkSecret) {
        doInesrtOrUpdate(synonymNextLinkSecret, null, null);
    }

    protected void doInesrtOrUpdate(SynonymNextLinkSecret synonymNextLinkSecret, final InsertOption<SynonymNextLinkSecretCB> iop, final UpdateOption<SynonymNextLinkSecretCB> uop) {
        helpInsertOrUpdateInternally(synonymNextLinkSecret, new InternalInsertOrUpdateCallback<SynonymNextLinkSecret, SynonymNextLinkSecretCB>() {
            public void callbackInsert(SynonymNextLinkSecret et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymNextLinkSecret et) { doUpdate(et, uop); }
            public SynonymNextLinkSecretCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymNextLinkSecretCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymNextLinkSecretCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymNextLinkSecretCB>();
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSecret.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymNextLinkSecretBhv.<span style="color: #FD4747">delete</span>(synonymNextLinkSecret);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymNextLinkSecret synonymNextLinkSecret) {
        doDelete(synonymNextLinkSecret, null);
    }

    protected void doDelete(SynonymNextLinkSecret synonymNextLinkSecret, final DeleteOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecret", synonymNextLinkSecret);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymNextLinkSecret, new InternalDeleteCallback<SynonymNextLinkSecret>() {
            public int callbackDelegateDelete(SynonymNextLinkSecret et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymNextLinkSecretCB> op) {
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
     *     SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     *     synonymNextLinkSecret.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSecret.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymNextLinkSecretList.add(synonymNextLinkSecret);
     * }
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">batchInsert</span>(synonymNextLinkSecretList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        InsertOption<SynonymNextLinkSecretCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymNextLinkSecretList, op);
    }

    protected int[] doBatchInsert(List<SynonymNextLinkSecret> synonymNextLinkSecretList, InsertOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecretList", synonymNextLinkSecretList);
        prepareBatchInsertOption(synonymNextLinkSecretList, op);
        return delegateBatchInsert(synonymNextLinkSecretList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymNextLinkSecret> synonymNextLinkSecretList, InsertOption<SynonymNextLinkSecretCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymNextLinkSecretList);
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
     *     SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     *     synonymNextLinkSecret.setFooName("foo");
     *     if (...) {
     *         synonymNextLinkSecret.setFooPrice(123);
     *     } else {
     *         synonymNextLinkSecret.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymNextLinkSecret.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymNextLinkSecretList.add(synonymNextLinkSecret);
     * }
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkSecretList);
     * </pre>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        UpdateOption<SynonymNextLinkSecretCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymNextLinkSecretList, op);
    }

    protected int[] doBatchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList, UpdateOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecretList", synonymNextLinkSecretList);
        prepareBatchUpdateOption(synonymNextLinkSecretList, op);
        return delegateBatchUpdate(synonymNextLinkSecretList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymNextLinkSecret> synonymNextLinkSecretList, UpdateOption<SynonymNextLinkSecretCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymNextLinkSecretList);
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
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkSecretList, new SpecifyQuery<SynonymNextLinkSecretCB>() {
     *     public void specify(SynonymNextLinkSecretCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">batchUpdate</span>(synonymNextLinkSecretList, new SpecifyQuery<SynonymNextLinkSecretCB>() {
     *     public void specify(SynonymNextLinkSecretCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList, SpecifyQuery<SynonymNextLinkSecretCB> updateColumnSpec) {
        return doBatchUpdate(synonymNextLinkSecretList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymNextLinkSecret> synonymNextLinkSecretList) {
        return doBatchDelete(synonymNextLinkSecretList, null);
    }

    protected int[] doBatchDelete(List<SynonymNextLinkSecret> synonymNextLinkSecretList, DeleteOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecretList", synonymNextLinkSecretList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymNextLinkSecretList, op);
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
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymNextLinkSecret, SynonymNextLinkSecretCB&gt;() {
     *     public ConditionBean setup(synonymNextLinkSecret entity, SynonymNextLinkSecretCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> sp, InsertOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymNextLinkSecret e = new SynonymNextLinkSecret();
        SynonymNextLinkSecretCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymNextLinkSecretCB createCBForQueryInsert() {
        SynonymNextLinkSecretCB cb = newMyConditionBean();
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setPK...(value);</span>
     * synonymNextLinkSecret.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setVersionNo(value);</span>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">queryUpdate</span>(synonymNextLinkSecret, cb);
     * </pre>
     * @param synonymNextLinkSecret The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymNextLinkSecret synonymNextLinkSecret, SynonymNextLinkSecretCB cb) {
        return doQueryUpdate(synonymNextLinkSecret, cb, null);
    }

    protected int doQueryUpdate(SynonymNextLinkSecret synonymNextLinkSecret, SynonymNextLinkSecretCB cb, UpdateOption<SynonymNextLinkSecretCB> op) {
        assertObjectNotNull("synonymNextLinkSecret", synonymNextLinkSecret); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymNextLinkSecret, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymNextLinkSecretCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymNextLinkSecretCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">queryDelete</span>(synonymNextLinkSecret, cb);
     * </pre>
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymNextLinkSecretCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymNextLinkSecretCB cb, DeleteOption<SynonymNextLinkSecretCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymNextLinkSecretCB)cb); }
        else { return varyingQueryDelete((SynonymNextLinkSecretCB)cb, downcast(op)); }
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymNextLinkSecret.setFoo...(value);
     * synonymNextLinkSecret.setBar...(value);
     * InsertOption<SynonymNextLinkSecretCB> option = new InsertOption<SynonymNextLinkSecretCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">varyingInsert</span>(synonymNextLinkSecret, option);
     * ... = synonymNextLinkSecret.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymNextLinkSecret The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymNextLinkSecret synonymNextLinkSecret, InsertOption<SynonymNextLinkSecretCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymNextLinkSecret, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * synonymNextLinkSecret.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymNextLinkSecret.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymNextLinkSecret.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymNextLinkSecretCB&gt; option = new UpdateOption&lt;SynonymNextLinkSecretCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *         public void specify(SynonymNextLinkSecretCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymNextLinkSecretBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymNextLinkSecret, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymNextLinkSecret The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymNextLinkSecret synonymNextLinkSecret, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymNextLinkSecret, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymNextLinkSecret The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymNextLinkSecret synonymNextLinkSecret, InsertOption<SynonymNextLinkSecretCB> insertOption, UpdateOption<SynonymNextLinkSecretCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymNextLinkSecret, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymNextLinkSecret The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymNextLinkSecret synonymNextLinkSecret, DeleteOption<SynonymNextLinkSecretCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymNextLinkSecret, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymNextLinkSecret> synonymNextLinkSecretList, InsertOption<SynonymNextLinkSecretCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymNextLinkSecretList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymNextLinkSecret> synonymNextLinkSecretList, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymNextLinkSecretList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymNextLinkSecretList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymNextLinkSecret> synonymNextLinkSecretList, DeleteOption<SynonymNextLinkSecretCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymNextLinkSecretList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> setupper, InsertOption<SynonymNextLinkSecretCB> option) {
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
     * SynonymNextLinkSecret synonymNextLinkSecret = new SynonymNextLinkSecret();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setPK...(value);</span>
     * synonymNextLinkSecret.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymNextLinkSecret.setVersionNo(value);</span>
     * SynonymNextLinkSecretCB cb = new SynonymNextLinkSecretCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymNextLinkSecretCB&gt; option = new UpdateOption&lt;SynonymNextLinkSecretCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymNextLinkSecretCB&gt;() {
     *     public void specify(SynonymNextLinkSecretCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymNextLinkSecretBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymNextLinkSecret, cb, option);
     * </pre>
     * @param synonymNextLinkSecret The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymNextLinkSecret synonymNextLinkSecret, SynonymNextLinkSecretCB cb, UpdateOption<SynonymNextLinkSecretCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymNextLinkSecret, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymNextLinkSecret. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymNextLinkSecretCB cb, DeleteOption<SynonymNextLinkSecretCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymNextLinkSecretBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymNextLinkSecretCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymNextLinkSecretCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymNextLinkSecret> void delegateSelectCursor(SynonymNextLinkSecretCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymNextLinkSecret> List<ENTITY> delegateSelectList(SynonymNextLinkSecretCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymNextLinkSecret et, InsertOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymNextLinkSecret et, UpdateOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SynonymNextLinkSecret et, UpdateOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymNextLinkSecret et, DeleteOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SynonymNextLinkSecret et, DeleteOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymNextLinkSecret> ls, InsertOption<SynonymNextLinkSecretCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymNextLinkSecret> ls, UpdateOption<SynonymNextLinkSecretCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymNextLinkSecret> ls, UpdateOption<SynonymNextLinkSecretCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymNextLinkSecret> ls, DeleteOption<SynonymNextLinkSecretCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymNextLinkSecret> ls, DeleteOption<SynonymNextLinkSecretCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymNextLinkSecret et, SynonymNextLinkSecretCB inCB, ConditionBean resCB, InsertOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymNextLinkSecret et, SynonymNextLinkSecretCB cb, UpdateOption<SynonymNextLinkSecretCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymNextLinkSecretCB cb, DeleteOption<SynonymNextLinkSecretCB> op)
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
    protected SynonymNextLinkSecret downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymNextLinkSecret.class);
    }

    protected SynonymNextLinkSecretCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymNextLinkSecretCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymNextLinkSecret> downcast(List<? extends Entity> ls) {
        return (List<SynonymNextLinkSecret>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymNextLinkSecretCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymNextLinkSecretCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymNextLinkSecretCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymNextLinkSecretCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymNextLinkSecretCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymNextLinkSecretCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymNextLinkSecret, SynonymNextLinkSecretCB>)sp;
    }
}
