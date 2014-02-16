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
 * The behavior of (会員ログイン)SYNONYM_MEMBER_LOGIN as SYNONYM. <br />
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
 *     MEMBER_VENDOR_SYNONYM, MEMBER_STATUS, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberVendorSynonym, memberStatus, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymMemberLoginBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_MEMBER_LOGIN"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymMemberLoginDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymMemberLoginDbm getMyDBMeta() { return SynonymMemberLoginDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymMemberLogin newMyEntity() { return new SynonymMemberLogin(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymMemberLoginCB newMyConditionBean() { return new SynonymMemberLoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * int count = synonymMemberLoginBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymMemberLoginCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymMemberLoginCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymMemberLoginCB cb) { // called by selectPage(cb)
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
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymMemberLogin != null) {
     *     ... = synonymMemberLogin.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberLogin selectEntity(SynonymMemberLoginCB cb) {
        return doSelectEntity(cb, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> ENTITY doSelectEntity(final SynonymMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * SynonymMemberLogin synonymMemberLogin = synonymMemberLoginBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymMemberLogin.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberLogin selectEntityWithDeletedCheck(SynonymMemberLoginCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> ENTITY doSelectEntityWithDeletedCheck(final SynonymMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
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
    public SynonymMemberLogin selectByPKValue(Long memberLoginId) {
        return doSelectByPKValue(memberLoginId, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> ENTITY doSelectByPKValue(Long memberLoginId, Class<ENTITY> entityType) {
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
    public SynonymMemberLogin selectByPKValueWithDeletedCheck(Long memberLoginId) {
        return doSelectByPKValueWithDeletedCheck(memberLoginId, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> ENTITY doSelectByPKValueWithDeletedCheck(Long memberLoginId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberLoginId), entityType);
    }

    private SynonymMemberLoginCB buildPKCB(Long memberLoginId) {
        assertObjectNotNull("memberLoginId", memberLoginId);
        SynonymMemberLoginCB cb = newMyConditionBean();
        cb.query().setMemberLoginId_Equal(memberLoginId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymMemberLogin&gt; synonymMemberLoginList = synonymMemberLoginBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymMemberLogin synonymMemberLogin : synonymMemberLoginList) {
     *     ... = synonymMemberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberLogin> selectList(SynonymMemberLoginCB cb) {
        return doSelectList(cb, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> ListResultBean<ENTITY> doSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymMemberLoginCB>() {
            public List<ENTITY> callbackSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymMemberLogin&gt; page = synonymMemberLoginBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymMemberLogin synonymMemberLogin : page) {
     *     ... = synonymMemberLogin.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberLogin> selectPage(SynonymMemberLoginCB cb) {
        return doSelectPage(cb, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> PagingResultBean<ENTITY> doSelectPage(SynonymMemberLoginCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymMemberLoginCB>() {
            public int callbackSelectCount(SynonymMemberLoginCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * synonymMemberLoginBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymMemberLogin&gt;() {
     *     public void handle(SynonymMemberLogin entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymMemberLogin. (NotNull)
     */
    public void selectCursor(SynonymMemberLoginCB cb, EntityRowHandler<SynonymMemberLogin> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymMemberLogin.class);
    }

    protected <ENTITY extends SynonymMemberLogin> void doSelectCursor(SynonymMemberLoginCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymMemberLoginCB>() {
            public void callbackSelectCursor(SynonymMemberLoginCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymMemberLoginBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymMemberLoginCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymMemberLoginCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymMemberLoginCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Pull out the list of foreign table 'MemberVendorSynonym'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberVendorSynonym> pulloutMemberVendorSynonym(List<SynonymMemberLogin> synonymMemberLoginList) {
        return helpPulloutInternally(synonymMemberLoginList, new InternalPulloutCallback<SynonymMemberLogin, MemberVendorSynonym>() {
            public MemberVendorSynonym getFr(SynonymMemberLogin et) { return et.getMemberVendorSynonym(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberVendorSynonym et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<SynonymMemberLogin> synonymMemberLoginList) {
        return helpPulloutInternally(synonymMemberLoginList, new InternalPulloutCallback<SynonymMemberLogin, MemberStatus>() {
            public MemberStatus getFr(SynonymMemberLogin et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'SynonymMember'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMember> pulloutSynonymMember(List<SynonymMemberLogin> synonymMemberLoginList) {
        return helpPulloutInternally(synonymMemberLoginList, new InternalPulloutCallback<SynonymMemberLogin, SynonymMember>() {
            public SynonymMember getFr(SynonymMemberLogin et) { return et.getSynonymMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SynonymMember et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'VendorSynonymMember'.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorSynonymMember> pulloutVendorSynonymMember(List<SynonymMemberLogin> synonymMemberLoginList) {
        return helpPulloutInternally(synonymMemberLoginList, new InternalPulloutCallback<SynonymMemberLogin, VendorSynonymMember>() {
            public VendorSynonymMember getFr(SynonymMemberLogin et) { return et.getVendorSynonymMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(VendorSynonymMember et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberLoginId.
     * @param synonymMemberLoginList The list of synonymMemberLogin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberLoginIdList(List<SynonymMemberLogin> synonymMemberLoginList) {
        return helpExtractListInternally(synonymMemberLoginList, new InternalExtractCallback<SynonymMemberLogin, Long>() {
            public Long getCV(SynonymMemberLogin et) { return et.getMemberLoginId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberLogin.setFoo...(value);
     * synonymMemberLogin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * synonymMemberLoginBhv.<span style="color: #FD4747">insert</span>(synonymMemberLogin);
     * ... = synonymMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymMemberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymMemberLogin synonymMemberLogin) {
        doInsert(synonymMemberLogin, null);
    }

    protected void doInsert(SynonymMemberLogin synonymMemberLogin, InsertOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLogin", synonymMemberLogin);
        prepareInsertOption(op);
        delegateInsert(synonymMemberLogin, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymMemberLoginCB> op) {
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
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberLoginBhv.<span style="color: #FD4747">update</span>(synonymMemberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymMemberLogin synonymMemberLogin) {
        doUpdate(synonymMemberLogin, null);
    }

    protected void doUpdate(SynonymMemberLogin synonymMemberLogin, final UpdateOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLogin", synonymMemberLogin);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymMemberLogin, new InternalUpdateCallback<SynonymMemberLogin>() {
            public int callbackDelegateUpdate(SynonymMemberLogin et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymMemberLoginCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymMemberLoginCB createCBForVaryingUpdate() {
        SynonymMemberLoginCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymMemberLoginCB createCBForSpecifiedUpdate() {
        SynonymMemberLoginCB cb = newMyConditionBean();
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
     * @param synonymMemberLogin The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymMemberLogin synonymMemberLogin) {
        doInesrtOrUpdate(synonymMemberLogin, null, null);
    }

    protected void doInesrtOrUpdate(SynonymMemberLogin synonymMemberLogin, final InsertOption<SynonymMemberLoginCB> iop, final UpdateOption<SynonymMemberLoginCB> uop) {
        helpInsertOrUpdateInternally(synonymMemberLogin, new InternalInsertOrUpdateCallback<SynonymMemberLogin, SynonymMemberLoginCB>() {
            public void callbackInsert(SynonymMemberLogin et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymMemberLogin et) { doUpdate(et, uop); }
            public SynonymMemberLoginCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymMemberLoginCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymMemberLoginCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymMemberLoginCB>();
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
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberLoginBhv.<span style="color: #FD4747">delete</span>(synonymMemberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymMemberLogin synonymMemberLogin) {
        doDelete(synonymMemberLogin, null);
    }

    protected void doDelete(SynonymMemberLogin synonymMemberLogin, final DeleteOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLogin", synonymMemberLogin);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymMemberLogin, new InternalDeleteCallback<SynonymMemberLogin>() {
            public int callbackDelegateDelete(SynonymMemberLogin et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymMemberLoginCB> op) {
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
     *     SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     *     synonymMemberLogin.setFooName("foo");
     *     if (...) {
     *         synonymMemberLogin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymMemberLoginList.add(synonymMemberLogin);
     * }
     * synonymMemberLoginBhv.<span style="color: #FD4747">batchInsert</span>(synonymMemberLoginList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymMemberLogin> synonymMemberLoginList) {
        InsertOption<SynonymMemberLoginCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymMemberLoginList, op);
    }

    protected int[] doBatchInsert(List<SynonymMemberLogin> synonymMemberLoginList, InsertOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLoginList", synonymMemberLoginList);
        prepareBatchInsertOption(synonymMemberLoginList, op);
        return delegateBatchInsert(synonymMemberLoginList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymMemberLogin> synonymMemberLoginList, InsertOption<SynonymMemberLoginCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymMemberLoginList);
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
     *     SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     *     synonymMemberLogin.setFooName("foo");
     *     if (...) {
     *         synonymMemberLogin.setFooPrice(123);
     *     } else {
     *         synonymMemberLogin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberLogin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberLoginList.add(synonymMemberLogin);
     * }
     * synonymMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(synonymMemberLoginList);
     * </pre>
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymMemberLogin> synonymMemberLoginList) {
        UpdateOption<SynonymMemberLoginCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymMemberLoginList, op);
    }

    protected int[] doBatchUpdate(List<SynonymMemberLogin> synonymMemberLoginList, UpdateOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLoginList", synonymMemberLoginList);
        prepareBatchUpdateOption(synonymMemberLoginList, op);
        return delegateBatchUpdate(synonymMemberLoginList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymMemberLogin> synonymMemberLoginList, UpdateOption<SynonymMemberLoginCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymMemberLoginList);
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
     * synonymMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(synonymMemberLoginList, new SpecifyQuery<SynonymMemberLoginCB>() {
     *     public void specify(SynonymMemberLoginCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymMemberLoginBhv.<span style="color: #FD4747">batchUpdate</span>(synonymMemberLoginList, new SpecifyQuery<SynonymMemberLoginCB>() {
     *     public void specify(SynonymMemberLoginCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymMemberLogin> synonymMemberLoginList, SpecifyQuery<SynonymMemberLoginCB> updateColumnSpec) {
        return doBatchUpdate(synonymMemberLoginList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymMemberLogin> synonymMemberLoginList) {
        return doBatchDelete(synonymMemberLoginList, null);
    }

    protected int[] doBatchDelete(List<SynonymMemberLogin> synonymMemberLoginList, DeleteOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLoginList", synonymMemberLoginList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymMemberLoginList, op);
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
     * synonymMemberLoginBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymMemberLogin, SynonymMemberLoginCB&gt;() {
     *     public ConditionBean setup(synonymMemberLogin entity, SynonymMemberLoginCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> sp, InsertOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymMemberLogin e = new SynonymMemberLogin();
        SynonymMemberLoginCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymMemberLoginCB createCBForQueryInsert() {
        SynonymMemberLoginCB cb = newMyConditionBean();
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
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * synonymMemberLoginBhv.<span style="color: #FD4747">queryUpdate</span>(synonymMemberLogin, cb);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberLogin synonymMemberLogin, SynonymMemberLoginCB cb) {
        return doQueryUpdate(synonymMemberLogin, cb, null);
    }

    protected int doQueryUpdate(SynonymMemberLogin synonymMemberLogin, SynonymMemberLoginCB cb, UpdateOption<SynonymMemberLoginCB> op) {
        assertObjectNotNull("synonymMemberLogin", synonymMemberLogin); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymMemberLogin, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymMemberLoginCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymMemberLoginCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * synonymMemberLoginBhv.<span style="color: #FD4747">queryDelete</span>(synonymMemberLogin, cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymMemberLoginCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymMemberLoginCB cb, DeleteOption<SynonymMemberLoginCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymMemberLoginCB)cb); }
        else { return varyingQueryDelete((SynonymMemberLoginCB)cb, downcast(op)); }
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
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberLogin.setFoo...(value);
     * synonymMemberLogin.setBar...(value);
     * InsertOption<SynonymMemberLoginCB> option = new InsertOption<SynonymMemberLoginCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymMemberLoginBhv.<span style="color: #FD4747">varyingInsert</span>(synonymMemberLogin, option);
     * ... = synonymMemberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymMemberLogin The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymMemberLogin synonymMemberLogin, InsertOption<SynonymMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymMemberLogin, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * synonymMemberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymMemberLogin.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymMemberLoginCB&gt; option = new UpdateOption&lt;SynonymMemberLoginCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *         public void specify(SynonymMemberLoginCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymMemberLoginBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymMemberLogin, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberLogin The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymMemberLogin synonymMemberLogin, UpdateOption<SynonymMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymMemberLogin, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymMemberLogin The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymMemberLogin synonymMemberLogin, InsertOption<SynonymMemberLoginCB> insertOption, UpdateOption<SynonymMemberLoginCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymMemberLogin, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymMemberLogin The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymMemberLogin synonymMemberLogin, DeleteOption<SynonymMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymMemberLogin, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymMemberLogin> synonymMemberLoginList, InsertOption<SynonymMemberLoginCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymMemberLoginList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymMemberLogin> synonymMemberLoginList, UpdateOption<SynonymMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymMemberLoginList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymMemberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymMemberLogin> synonymMemberLoginList, DeleteOption<SynonymMemberLoginCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymMemberLoginList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> setupper, InsertOption<SynonymMemberLoginCB> option) {
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
     * SynonymMemberLogin synonymMemberLogin = new SynonymMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setPK...(value);</span>
     * synonymMemberLogin.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberLogin.setVersionNo(value);</span>
     * SynonymMemberLoginCB cb = new SynonymMemberLoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberLoginCB&gt; option = new UpdateOption&lt;SynonymMemberLoginCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberLoginCB&gt;() {
     *     public void specify(SynonymMemberLoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymMemberLoginBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymMemberLogin, cb, option);
     * </pre>
     * @param synonymMemberLogin The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberLogin synonymMemberLogin, SynonymMemberLoginCB cb, UpdateOption<SynonymMemberLoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymMemberLogin, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymMemberLogin. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymMemberLoginCB cb, DeleteOption<SynonymMemberLoginCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymMemberLoginBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymMemberLoginCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymMemberLogin> void delegateSelectCursor(SynonymMemberLoginCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymMemberLogin> List<ENTITY> delegateSelectList(SynonymMemberLoginCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymMemberLogin et, InsertOption<SynonymMemberLoginCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymMemberLogin et, UpdateOption<SynonymMemberLoginCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SynonymMemberLogin et, UpdateOption<SynonymMemberLoginCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymMemberLogin et, DeleteOption<SynonymMemberLoginCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SynonymMemberLogin et, DeleteOption<SynonymMemberLoginCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymMemberLogin> ls, InsertOption<SynonymMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymMemberLogin> ls, UpdateOption<SynonymMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymMemberLogin> ls, UpdateOption<SynonymMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymMemberLogin> ls, DeleteOption<SynonymMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymMemberLogin> ls, DeleteOption<SynonymMemberLoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymMemberLogin et, SynonymMemberLoginCB inCB, ConditionBean resCB, InsertOption<SynonymMemberLoginCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymMemberLogin et, SynonymMemberLoginCB cb, UpdateOption<SynonymMemberLoginCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymMemberLoginCB cb, DeleteOption<SynonymMemberLoginCB> op)
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
    protected SynonymMemberLogin downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymMemberLogin.class);
    }

    protected SynonymMemberLoginCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymMemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymMemberLogin> downcast(List<? extends Entity> ls) {
        return (List<SynonymMemberLogin>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymMemberLoginCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymMemberLoginCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymMemberLoginCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymMemberLoginCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymMemberLogin, SynonymMemberLoginCB>)sp;
    }
}
