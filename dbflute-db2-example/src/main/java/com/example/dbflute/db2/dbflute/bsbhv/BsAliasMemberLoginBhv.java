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
 * The behavior of ALIAS_MEMBER_LOGIN as ALIAS. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
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
 *     ALIAS_MEMBER, MEMBER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     aliasMember, memberStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasMemberLoginBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "ALIAS_MEMBER_LOGIN"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return AliasMemberLoginDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasMemberLoginDbm getMyDBMeta() { return AliasMemberLoginDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public AliasMemberLogin newMyEntity() { return new AliasMemberLogin(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public AliasMemberLoginCB newMyConditionBean() { return new AliasMemberLoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * int count = aliasMemberLoginBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasMemberLoginCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(AliasMemberLoginCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(AliasMemberLoginCB cb) { // called by selectPage(cb)
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
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * AliasMemberLogin aliasMemberLogin = aliasMemberLoginBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (aliasMemberLogin != null) {
     *     ... = aliasMemberLogin.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMemberLogin selectEntity(AliasMemberLoginCB cb) {
        return doSelectEntity(cb, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> ENTITY doSelectEntity(final AliasMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, AliasMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * AliasMemberLogin aliasMemberLogin = aliasMemberLoginBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasMemberLogin.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMemberLogin selectEntityWithDeletedCheck(AliasMemberLoginCB cb) {
        return doSelectEntityWithDeletedCheck(cb, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> ENTITY doSelectEntityWithDeletedCheck(final AliasMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, AliasMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberLoginId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMemberLogin selectByPKValue(Long memberLoginId) {
        return doSelectByPKValue(memberLoginId, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> ENTITY doSelectByPKValue(Long memberLoginId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberLoginId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberLoginId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMemberLogin selectByPKValueWithDeletedCheck(Long memberLoginId) {
        return doSelectByPKValueWithDeletedCheck(memberLoginId, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> ENTITY doSelectByPKValueWithDeletedCheck(Long memberLoginId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberLoginId), entityType);
    }

    private AliasMemberLoginCB buildPKCB(Long memberLoginId) {
        assertObjectNotNull("memberLoginId", memberLoginId);
        AliasMemberLoginCB cb = newMyConditionBean();
        cb.query().setMemberLoginId_Equal(memberLoginId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;AliasMemberLogin&gt; aliasMemberLoginList = aliasMemberLoginBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (AliasMemberLogin aliasMemberLogin : aliasMemberLoginList) {
     *     ... = aliasMemberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasMemberLogin> selectList(AliasMemberLoginCB cb) {
        return doSelectList(cb, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> ListResultBean<ENTITY> doSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, AliasMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasMemberLogin&gt; page = aliasMemberLoginBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (AliasMemberLogin aliasMemberLogin : page) {
     *     ... = aliasMemberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasMemberLogin> selectPage(AliasMemberLoginCB cb) {
        return doSelectPage(cb, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> PagingResultBean<ENTITY> doSelectPage(AliasMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, AliasMemberLoginCB>() {
            public int callbackSelectCount(AliasMemberLoginCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * aliasMemberLoginBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasMemberLogin&gt;() {
     *     public void handle(AliasMemberLogin entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasMemberLogin. (NotNull)
     */
    public void selectCursor(AliasMemberLoginCB cb, EntityRowHandler<AliasMemberLogin> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, AliasMemberLogin.class);
    }

    protected <ENTITY extends AliasMemberLogin> void doSelectCursor(AliasMemberLoginCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, AliasMemberLoginCB>() {
            public void callbackSelectCursor(AliasMemberLoginCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * aliasMemberLoginBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<AliasMemberLoginCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends AliasMemberLoginCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends AliasMemberLoginCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'AliasMember'.
     * @param aliasMemberLoginList The list of aliasMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<AliasMember> pulloutAliasMember(List<AliasMemberLogin> aliasMemberLoginList) {
        return helpPulloutInternally(aliasMemberLoginList, new InternalPulloutCallback<AliasMemberLogin, AliasMember>() {
            public AliasMember getFr(AliasMemberLogin et) { return et.getAliasMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(AliasMember et, List<AliasMemberLogin> ls)
            { et.setAliasMemberLoginList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param aliasMemberLoginList The list of aliasMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<AliasMemberLogin> aliasMemberLoginList) {
        return helpPulloutInternally(aliasMemberLoginList, new InternalPulloutCallback<AliasMemberLogin, MemberStatus>() {
            public MemberStatus getFr(AliasMemberLogin et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<AliasMemberLogin> ls)
            { et.setAliasMemberLoginList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberLoginId.
     * @param aliasMemberLoginList The list of aliasMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberLoginIdList(List<AliasMemberLogin> aliasMemberLoginList) {
        return helpExtractListInternally(aliasMemberLoginList, new InternalExtractCallback<AliasMemberLogin, Long>() {
            public Long getCV(AliasMemberLogin et) { return et.getMemberLoginId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMemberLogin.setFoo...(value);
     * aliasMemberLogin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.set...;</span>
     * aliasMemberLoginBhv.<span style="color: #FD4747">insert</span>(aliasMemberLogin);
     * ... = aliasMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasMemberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasMemberLogin aliasMemberLogin) {
        doInsert(aliasMemberLogin, null);
    }

    protected void doInsert(AliasMemberLogin aliasMemberLogin, InsertOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLogin", aliasMemberLogin);
        prepareInsertOption(op);
        delegateInsert(aliasMemberLogin, op);
    }

    protected void prepareInsertOption(InsertOption<AliasMemberLoginCB> op) {
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
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * aliasMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberLoginBhv.<span style="color: #FD4747">update</span>(aliasMemberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMemberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final AliasMemberLogin aliasMemberLogin) {
        doUpdate(aliasMemberLogin, null);
    }

    protected void doUpdate(AliasMemberLogin aliasMemberLogin, final UpdateOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLogin", aliasMemberLogin);
        prepareUpdateOption(op);
        helpUpdateInternally(aliasMemberLogin, new InternalUpdateCallback<AliasMemberLogin>() {
            public int callbackDelegateUpdate(AliasMemberLogin et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<AliasMemberLoginCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected AliasMemberLoginCB createCBForVaryingUpdate() {
        AliasMemberLoginCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected AliasMemberLoginCB createCBForSpecifiedUpdate() {
        AliasMemberLoginCB cb = newMyConditionBean();
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
     * @param aliasMemberLogin The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasMemberLogin aliasMemberLogin) {
        doInesrtOrUpdate(aliasMemberLogin, null, null);
    }

    protected void doInesrtOrUpdate(AliasMemberLogin aliasMemberLogin, final InsertOption<AliasMemberLoginCB> iop, final UpdateOption<AliasMemberLoginCB> uop) {
        helpInsertOrUpdateInternally(aliasMemberLogin, new InternalInsertOrUpdateCallback<AliasMemberLogin, AliasMemberLoginCB>() {
            public void callbackInsert(AliasMemberLogin et) { doInsert(et, iop); }
            public void callbackUpdate(AliasMemberLogin et) { doUpdate(et, uop); }
            public AliasMemberLoginCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(AliasMemberLoginCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<AliasMemberLoginCB>();
            uop = uop != null ? uop : new UpdateOption<AliasMemberLoginCB>();
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
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * aliasMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberLoginBhv.<span style="color: #FD4747">delete</span>(aliasMemberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMemberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasMemberLogin aliasMemberLogin) {
        doDelete(aliasMemberLogin, null);
    }

    protected void doDelete(AliasMemberLogin aliasMemberLogin, final DeleteOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLogin", aliasMemberLogin);
        prepareDeleteOption(op);
        helpDeleteInternally(aliasMemberLogin, new InternalDeleteCallback<AliasMemberLogin>() {
            public int callbackDelegateDelete(AliasMemberLogin et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<AliasMemberLoginCB> op) {
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
     *     AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     *     aliasMemberLogin.setFooName("foo");
     *     if (...) {
     *         aliasMemberLogin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasMemberLoginList.add(aliasMemberLogin);
     * }
     * aliasMemberLoginBhv.<span style="color: #FD4747">batchInsert</span>(aliasMemberLoginList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasMemberLogin> aliasMemberLoginList) {
        InsertOption<AliasMemberLoginCB> op = createInsertUpdateOption();
        return doBatchInsert(aliasMemberLoginList, op);
    }

    protected int[] doBatchInsert(List<AliasMemberLogin> aliasMemberLoginList, InsertOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLoginList", aliasMemberLoginList);
        prepareBatchInsertOption(aliasMemberLoginList, op);
        return delegateBatchInsert(aliasMemberLoginList, op);
    }

    protected void prepareBatchInsertOption(List<AliasMemberLogin> aliasMemberLoginList, InsertOption<AliasMemberLoginCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(aliasMemberLoginList);
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
     *     AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     *     aliasMemberLogin.setFooName("foo");
     *     if (...) {
     *         aliasMemberLogin.setFooPrice(123);
     *     } else {
     *         aliasMemberLogin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasMemberLogin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasMemberLoginList.add(aliasMemberLogin);
     * }
     * aliasMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberLoginList);
     * </pre>
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasMemberLogin> aliasMemberLoginList) {
        UpdateOption<AliasMemberLoginCB> op = createPlainUpdateOption();
        return doBatchUpdate(aliasMemberLoginList, op);
    }

    protected int[] doBatchUpdate(List<AliasMemberLogin> aliasMemberLoginList, UpdateOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLoginList", aliasMemberLoginList);
        prepareBatchUpdateOption(aliasMemberLoginList, op);
        return delegateBatchUpdate(aliasMemberLoginList, op);
    }

    protected void prepareBatchUpdateOption(List<AliasMemberLogin> aliasMemberLoginList, UpdateOption<AliasMemberLoginCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(aliasMemberLoginList);
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
     * aliasMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberLoginList, new SpecifyQuery<AliasMemberLoginCB>() {
     *     public void specify(AliasMemberLoginCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * aliasMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberLoginList, new SpecifyQuery<AliasMemberLoginCB>() {
     *     public void specify(AliasMemberLoginCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasMemberLogin> aliasMemberLoginList, SpecifyQuery<AliasMemberLoginCB> updateColumnSpec) {
        return doBatchUpdate(aliasMemberLoginList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<AliasMemberLogin> aliasMemberLoginList) {
        return doBatchDelete(aliasMemberLoginList, null);
    }

    protected int[] doBatchDelete(List<AliasMemberLogin> aliasMemberLoginList, DeleteOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLoginList", aliasMemberLoginList);
        prepareDeleteOption(op);
        return delegateBatchDelete(aliasMemberLoginList, op);
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
     * aliasMemberLoginBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasMemberLogin, AliasMemberLoginCB&gt;() {
     *     public ConditionBean setup(aliasMemberLogin entity, AliasMemberLoginCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasMemberLogin, AliasMemberLoginCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<AliasMemberLogin, AliasMemberLoginCB> sp, InsertOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        AliasMemberLogin e = new AliasMemberLogin();
        AliasMemberLoginCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected AliasMemberLoginCB createCBForQueryInsert() {
        AliasMemberLoginCB cb = newMyConditionBean();
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
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setPK...(value);</span>
     * aliasMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setVersionNo(value);</span>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * aliasMemberLoginBhv.<span style="color: #FD4747">queryUpdate</span>(aliasMemberLogin, cb);
     * </pre>
     * @param aliasMemberLogin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasMemberLogin aliasMemberLogin, AliasMemberLoginCB cb) {
        return doQueryUpdate(aliasMemberLogin, cb, null);
    }

    protected int doQueryUpdate(AliasMemberLogin aliasMemberLogin, AliasMemberLoginCB cb, UpdateOption<AliasMemberLoginCB> op) {
        assertObjectNotNull("aliasMemberLogin", aliasMemberLogin); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(aliasMemberLogin, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (AliasMemberLoginCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (AliasMemberLoginCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * aliasMemberLoginBhv.<span style="color: #FD4747">queryDelete</span>(aliasMemberLogin, cb);
     * </pre>
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasMemberLoginCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(AliasMemberLoginCB cb, DeleteOption<AliasMemberLoginCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((AliasMemberLoginCB)cb); }
        else { return varyingQueryDelete((AliasMemberLoginCB)cb, downcast(op)); }
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
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMemberLogin.setFoo...(value);
     * aliasMemberLogin.setBar...(value);
     * InsertOption<AliasMemberLoginCB> option = new InsertOption<AliasMemberLoginCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasMemberLoginBhv.<span style="color: #FD4747">varyingInsert</span>(aliasMemberLogin, option);
     * ... = aliasMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasMemberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasMemberLogin aliasMemberLogin, InsertOption<AliasMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(aliasMemberLogin, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * aliasMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasMemberLoginCB&gt; option = new UpdateOption&lt;AliasMemberLoginCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasMemberLoginCB&gt;() {
     *         public void specify(AliasMemberLoginCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasMemberLoginBhv.<span style="color: #FD4747">varyingUpdate</span>(aliasMemberLogin, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMemberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasMemberLogin aliasMemberLogin, UpdateOption<AliasMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(aliasMemberLogin, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasMemberLogin The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasMemberLogin aliasMemberLogin, InsertOption<AliasMemberLoginCB> insertOption, UpdateOption<AliasMemberLoginCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(aliasMemberLogin, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasMemberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasMemberLogin aliasMemberLogin, DeleteOption<AliasMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasMemberLogin, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasMemberLogin> aliasMemberLoginList, InsertOption<AliasMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(aliasMemberLoginList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasMemberLogin> aliasMemberLoginList, UpdateOption<AliasMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(aliasMemberLoginList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param aliasMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasMemberLogin> aliasMemberLoginList, DeleteOption<AliasMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(aliasMemberLoginList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasMemberLogin, AliasMemberLoginCB> setupper, InsertOption<AliasMemberLoginCB> option) {
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
     * AliasMemberLogin aliasMemberLogin = new AliasMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setPK...(value);</span>
     * aliasMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMemberLogin.setVersionNo(value);</span>
     * AliasMemberLoginCB cb = new AliasMemberLoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasMemberLoginCB&gt; option = new UpdateOption&lt;AliasMemberLoginCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasMemberLoginCB&gt;() {
     *     public void specify(AliasMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasMemberLoginBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(aliasMemberLogin, cb, option);
     * </pre>
     * @param aliasMemberLogin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasMemberLogin aliasMemberLogin, AliasMemberLoginCB cb, UpdateOption<AliasMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(aliasMemberLogin, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasMemberLogin. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasMemberLoginCB cb, DeleteOption<AliasMemberLoginCB> option) {
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
    public OutsideSqlBasicExecutor<AliasMemberLoginBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(AliasMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(AliasMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends AliasMemberLogin> void delegateSelectCursor(AliasMemberLoginCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends AliasMemberLogin> List<ENTITY> delegateSelectList(AliasMemberLoginCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(AliasMemberLogin et, InsertOption<AliasMemberLoginCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(AliasMemberLogin et, UpdateOption<AliasMemberLoginCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(AliasMemberLogin et, UpdateOption<AliasMemberLoginCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(AliasMemberLogin et, DeleteOption<AliasMemberLoginCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(AliasMemberLogin et, DeleteOption<AliasMemberLoginCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<AliasMemberLogin> ls, InsertOption<AliasMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<AliasMemberLogin> ls, UpdateOption<AliasMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<AliasMemberLogin> ls, UpdateOption<AliasMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<AliasMemberLogin> ls, DeleteOption<AliasMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<AliasMemberLogin> ls, DeleteOption<AliasMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(AliasMemberLogin et, AliasMemberLoginCB inCB, ConditionBean resCB, InsertOption<AliasMemberLoginCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(AliasMemberLogin et, AliasMemberLoginCB cb, UpdateOption<AliasMemberLoginCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(AliasMemberLoginCB cb, DeleteOption<AliasMemberLoginCB> op)
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
    protected AliasMemberLogin downcast(Entity et) {
        return helpEntityDowncastInternally(et, AliasMemberLogin.class);
    }

    protected AliasMemberLoginCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, AliasMemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<AliasMemberLogin> downcast(List<? extends Entity> ls) {
        return (List<AliasMemberLogin>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<AliasMemberLoginCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<AliasMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasMemberLoginCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<AliasMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasMemberLoginCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<AliasMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasMemberLogin, AliasMemberLoginCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<AliasMemberLogin, AliasMemberLoginCB>)sp;
    }
}
