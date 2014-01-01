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
 * The behavior of ALIAS_MEMBER as ALIAS. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     MEMBER_STATUS
 * 
 * [referrer table]
 *     ALIAS_MEMBER_LOGIN
 * 
 * [foreign property]
 *     memberStatus
 * 
 * [referrer property]
 *     aliasMemberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasMemberBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "ALIAS_MEMBER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return AliasMemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasMemberDbm getMyDBMeta() { return AliasMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public AliasMember newMyEntity() { return new AliasMember(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public AliasMemberCB newMyConditionBean() { return new AliasMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * int count = aliasMemberBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasMemberCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(AliasMemberCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(AliasMemberCB cb) { // called by selectPage(cb)
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
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = aliasMemberBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (aliasMember != null) {
     *     ... = aliasMember.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntity(AliasMemberCB cb) {
        return doSelectEntity(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectEntity(final AliasMemberCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = aliasMemberBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntityWithDeletedCheck(AliasMemberCB cb) {
        return doSelectEntityWithDeletedCheck(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectEntityWithDeletedCheck(final AliasMemberCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectByPKValue(Integer memberId) {
        return doSelectByPKValue(memberId, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectByPKValue(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private AliasMemberCB buildPKCB(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        AliasMemberCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;AliasMember&gt; aliasMemberList = aliasMemberBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (AliasMember aliasMember : aliasMemberList) {
     *     ... = aliasMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasMember> selectList(AliasMemberCB cb) {
        return doSelectList(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ListResultBean<ENTITY> doSelectList(AliasMemberCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasMember&gt; page = aliasMemberBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (AliasMember aliasMember : page) {
     *     ... = aliasMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasMember> selectPage(AliasMemberCB cb) {
        return doSelectPage(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> PagingResultBean<ENTITY> doSelectPage(AliasMemberCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, AliasMemberCB>() {
            public int callbackSelectCount(AliasMemberCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasMember&gt;() {
     *     public void handle(AliasMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasMember. (NotNull)
     */
    public void selectCursor(AliasMemberCB cb, EntityRowHandler<AliasMember> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> void doSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<AliasMember>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, AliasMemberCB>() {
            public void callbackSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * aliasMemberBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<AliasMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends AliasMemberCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends AliasMemberCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadAliasMemberLoginList(AliasMember aliasMember, ConditionBeanSetupper<AliasMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(aliasMember, conditionBeanSetupper);
        loadAliasMemberLoginList(xnewLRLs(aliasMember), conditionBeanSetupper);
    }
    /**
     * Load referrer of aliasMemberLoginList with the set-upper for condition-bean of referrer. <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * aliasMemberBhv.<span style="color: #FD4747">loadAliasMemberLoginList</span>(aliasMemberList, new ConditionBeanSetupper&lt;AliasMemberLoginCB&gt;() {
     *     public void setup(AliasMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (AliasMember aliasMember : aliasMemberList) {
     *     ... = aliasMember.<span style="color: #FD4747">getAliasMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadAliasMemberLoginList(List<AliasMember> aliasMemberList, ConditionBeanSetupper<AliasMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(aliasMemberList, conditionBeanSetupper);
        loadAliasMemberLoginList(aliasMemberList, new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadAliasMemberLoginList(AliasMember aliasMember, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMember, loadReferrerOption);
        loadAliasMemberLoginList(xnewLRLs(aliasMember), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadAliasMemberLoginList(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMemberList, loadReferrerOption);
        if (aliasMemberList.isEmpty()) { return; }
        final AliasMemberLoginBhv referrerBhv = xgetBSFLR().select(AliasMemberLoginBhv.class);
        helpLoadReferrerInternally(aliasMemberList, loadReferrerOption, new InternalLoadReferrerCallback<AliasMember, Integer, AliasMemberLoginCB, AliasMemberLogin>() {
            public Integer getPKVal(AliasMember e)
            { return e.getMemberId(); }
            public void setRfLs(AliasMember e, List<AliasMemberLogin> ls)
            { e.setAliasMemberLoginList(ls); }
            public AliasMemberLoginCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(AliasMemberLoginCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(AliasMemberLoginCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(AliasMemberLoginCB cb) { cb.specify().columnMemberId(); }
            public List<AliasMemberLogin> selRfLs(AliasMemberLoginCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(AliasMemberLogin e) { return e.getMemberId(); }
            public void setlcEt(AliasMemberLogin re, AliasMember le)
            { re.setAliasMember(le); }
            public String getRfPrNm() { return "aliasMemberLoginList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<AliasMember> aliasMemberList) {
        return helpPulloutInternally(aliasMemberList, new InternalPulloutCallback<AliasMember, MemberStatus>() {
            public MemberStatus getFr(AliasMember e) { return e.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus e, List<AliasMember> ls)
            { e.setAliasMemberList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<AliasMember> aliasMemberList) {
        return helpExtractListInternally(aliasMemberList, new InternalExtractCallback<AliasMember, Integer>() {
            public Integer getCV(AliasMember e) { return e.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<AliasMember> aliasMemberList) {
        return helpExtractListInternally(aliasMemberList, new InternalExtractCallback<AliasMember, String>() {
            public String getCV(AliasMember e) { return e.getMemberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMember.setFoo...(value);
     * aliasMember.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * aliasMemberBhv.<span style="color: #FD4747">insert</span>(aliasMember);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasMember aliasMember) {
        doInsert(aliasMember, null);
    }

    protected void doInsert(AliasMember aliasMember, InsertOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareInsertOption(option);
        delegateInsert(aliasMember, option);
    }

    protected void prepareInsertOption(InsertOption<AliasMemberCB> option) {
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
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #FD4747">update</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final AliasMember aliasMember) {
        doUpdate(aliasMember, null);
    }

    protected void doUpdate(AliasMember aliasMember, final UpdateOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareUpdateOption(option);
        helpUpdateInternally(aliasMember, new InternalUpdateCallback<AliasMember>() {
            public int callbackDelegateUpdate(AliasMember entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<AliasMemberCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected AliasMemberCB createCBForVaryingUpdate() {
        AliasMemberCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected AliasMemberCB createCBForSpecifiedUpdate() {
        AliasMemberCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #FD4747">updateNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final AliasMember aliasMember) {
        doUpdateNonstrict(aliasMember, null);
    }

    protected void doUpdateNonstrict(AliasMember aliasMember, final UpdateOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(aliasMember, new InternalUpdateNonstrictCallback<AliasMember>() {
            public int callbackDelegateUpdateNonstrict(AliasMember entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasMember aliasMember) {
        doInesrtOrUpdate(aliasMember, null, null);
    }

    protected void doInesrtOrUpdate(AliasMember aliasMember, final InsertOption<AliasMemberCB> insertOption, final UpdateOption<AliasMemberCB> updateOption) {
        helpInsertOrUpdateInternally(aliasMember, new InternalInsertOrUpdateCallback<AliasMember, AliasMemberCB>() {
            public void callbackInsert(AliasMember entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(AliasMember entity) { doUpdate(entity, updateOption); }
            public AliasMemberCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(AliasMemberCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<AliasMemberCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<AliasMemberCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(AliasMember aliasMember) {
        doInesrtOrUpdateNonstrict(aliasMember, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(AliasMember aliasMember, final InsertOption<AliasMemberCB> insertOption, final UpdateOption<AliasMemberCB> updateOption) {
        helpInsertOrUpdateInternally(aliasMember, new InternalInsertOrUpdateNonstrictCallback<AliasMember>() {
            public void callbackInsert(AliasMember entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(AliasMember entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<AliasMemberCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<AliasMemberCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #FD4747">delete</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasMember aliasMember) {
        doDelete(aliasMember, null);
    }

    protected void doDelete(AliasMember aliasMember, final DeleteOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(option);
        helpDeleteInternally(aliasMember, new InternalDeleteCallback<AliasMember>() {
            public int callbackDelegateDelete(AliasMember entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<AliasMemberCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #FD4747">deleteNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(AliasMember aliasMember) {
        doDeleteNonstrict(aliasMember, null);
    }

    protected void doDeleteNonstrict(AliasMember aliasMember, final DeleteOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(aliasMember, new InternalDeleteNonstrictCallback<AliasMember>() {
            public int callbackDelegateDeleteNonstrict(AliasMember entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(aliasMember);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(AliasMember aliasMember) {
        doDeleteNonstrictIgnoreDeleted(aliasMember, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(AliasMember aliasMember, final DeleteOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(aliasMember, new InternalDeleteNonstrictIgnoreDeletedCallback<AliasMember>() {
            public int callbackDelegateDeleteNonstrict(AliasMember entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { deleteNonstrict(downcast(entity)); }
        else { varyingDeleteNonstrict(downcast(entity), downcast(option)); }
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
     *     AliasMember aliasMember = new AliasMember();
     *     aliasMember.setFooName("foo");
     *     if (...) {
     *         aliasMember.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * aliasMemberBhv.<span style="color: #FD4747">batchInsert</span>(aliasMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasMember> aliasMemberList) {
        InsertOption<AliasMemberCB> option = createInsertUpdateOption();
        return doBatchInsert(aliasMemberList, option);
    }

    protected int[] doBatchInsert(List<AliasMember> aliasMemberList, InsertOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchInsertOption(aliasMemberList, option);
        return delegateBatchInsert(aliasMemberList, option);
    }

    protected void prepareBatchInsertOption(List<AliasMember> aliasMemberList, InsertOption<AliasMemberCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(aliasMemberList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     AliasMember aliasMember = new AliasMember();
     *     aliasMember.setFooName("foo");
     *     if (...) {
     *         aliasMember.setFooPrice(123);
     *     } else {
     *         aliasMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList) {
        UpdateOption<AliasMemberCB> option = createPlainUpdateOption();
        return doBatchUpdate(aliasMemberList, option);
    }

    protected int[] doBatchUpdate(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchUpdateOption(aliasMemberList, option);
        return delegateBatchUpdate(aliasMemberList, option);
    }

    protected void prepareBatchUpdateOption(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(aliasMemberList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList, SpecifyQuery<AliasMemberCB> updateColumnSpec) {
        return doBatchUpdate(aliasMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     AliasMember aliasMember = new AliasMember();
     *     aliasMember.setFooName("foo");
     *     if (...) {
     *         aliasMember.setFooPrice(123);
     *     } else {
     *         aliasMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasMemberList.add(aliasMember);
     * }
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<AliasMember> aliasMemberList) {
        UpdateOption<AliasMemberCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(aliasMemberList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchUpdateOption(aliasMemberList, option);
        return delegateBatchUpdateNonstrict(aliasMemberList, option);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * aliasMemberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<AliasMember> aliasMemberList, SpecifyQuery<AliasMemberCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(aliasMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<AliasMember> aliasMemberList) {
        return doBatchDelete(aliasMemberList, null);
    }

    protected int[] doBatchDelete(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareDeleteOption(option);
        return delegateBatchDelete(aliasMemberList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<AliasMember> aliasMemberList) {
        return doBatchDeleteNonstrict(aliasMemberList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(aliasMemberList, option);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(option)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * aliasMemberBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasMember, AliasMemberCB&gt;() {
     *     public ConditionBean setup(aliasMember entity, AliasMemberCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> setupper, InsertOption<AliasMemberCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        AliasMember entity = new AliasMember();
        AliasMemberCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected AliasMemberCB createCBForQueryInsert() {
        AliasMemberCB cb = newMyConditionBean();
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
     * AliasMember aliasMember = new AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #FD4747">queryUpdate</span>(aliasMember, cb);
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasMember aliasMember, AliasMemberCB cb) {
        return doQueryUpdate(aliasMember, cb, null);
    }

    protected int doQueryUpdate(AliasMember aliasMember, AliasMemberCB cb, UpdateOption<AliasMemberCB> option) {
        assertObjectNotNull("aliasMember", aliasMember); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(aliasMember, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (AliasMemberCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (AliasMemberCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #FD4747">queryDelete</span>(aliasMember, cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasMemberCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(AliasMemberCB cb, DeleteOption<AliasMemberCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((AliasMemberCB)cb); }
        else { return varyingQueryDelete((AliasMemberCB)cb, downcast(option)); }
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
     * AliasMember aliasMember = new AliasMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMember.setFoo...(value);
     * aliasMember.setBar...(value);
     * InsertOption<AliasMemberCB> option = new InsertOption<AliasMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasMemberBhv.<span style="color: #FD4747">varyingInsert</span>(aliasMember, option);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasMember aliasMember, InsertOption<AliasMemberCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(aliasMember, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *         public void specify(AliasMemberCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasMemberBhv.<span style="color: #FD4747">varyingUpdate</span>(aliasMember, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasMember aliasMember, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(aliasMember, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *     public void specify(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasMemberBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(aliasMember, option);
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(AliasMember aliasMember, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(aliasMember, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasMember aliasMember, InsertOption<AliasMemberCB> insertOption, UpdateOption<AliasMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(aliasMember, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(AliasMember aliasMember, InsertOption<AliasMemberCB> insertOption, UpdateOption<AliasMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(aliasMember, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasMember aliasMember, DeleteOption<AliasMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasMember, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(AliasMember aliasMember, DeleteOption<AliasMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(aliasMember, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasMember> aliasMemberList, InsertOption<AliasMemberCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(aliasMemberList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(aliasMemberList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(aliasMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(aliasMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(aliasMemberList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> setupper, InsertOption<AliasMemberCB> option) {
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
     * AliasMember aliasMember = new AliasMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasMember.setPK...(value);</span>
     * aliasMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *     public void specify(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasMemberBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(aliasMember, cb, option);
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasMember aliasMember, AliasMemberCB cb, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(aliasMember, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasMemberCB cb, DeleteOption<AliasMemberCB> option) {
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
    public OutsideSqlBasicExecutor<AliasMemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(AliasMemberCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(AliasMemberCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends AliasMember> void delegateSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends AliasMember> List<ENTITY> delegateSelectList(AliasMemberCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(AliasMember e, InsertOption<AliasMemberCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(AliasMember e, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(AliasMember e, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(AliasMember e, DeleteOption<AliasMemberCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(AliasMember e, DeleteOption<AliasMemberCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<AliasMember> ls, InsertOption<AliasMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<AliasMember> ls, UpdateOption<AliasMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<AliasMember> ls, UpdateOption<AliasMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<AliasMember> ls, DeleteOption<AliasMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<AliasMember> ls, DeleteOption<AliasMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(AliasMember e, AliasMemberCB inCB, ConditionBean resCB, InsertOption<AliasMemberCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(AliasMember e, AliasMemberCB cb, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(AliasMemberCB cb, DeleteOption<AliasMemberCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return !(downcast(entity).getVersionNo() + "").equals("null");// For primitive type
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
    protected AliasMember downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, AliasMember.class);
    }

    protected AliasMemberCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, AliasMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<AliasMember> downcast(List<? extends Entity> entityList) {
        return (List<AliasMember>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<AliasMemberCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<AliasMemberCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasMemberCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<AliasMemberCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasMemberCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<AliasMemberCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasMember, AliasMemberCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<AliasMember, AliasMemberCB>)option;
    }
}
