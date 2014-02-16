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
 * The behavior of (会員)VENDOR_SYNONYM_MEMBER as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, REGISTER_PROCESS, UPDATE_DATETIME, UPDATE_USER, UPDATE_PROCESS, VERSION_NO
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
 *     MEMBER_STATUS, SYNONYM_MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     SYNONYM_MEMBER_LOGIN, SYNONYM_MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, synonymMemberWithdrawalAsOne
 *
 * [referrer property]
 *     synonymMemberLoginList
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorSynonymMemberBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_SYNONYM_MEMBER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorSynonymMemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorSynonymMemberDbm getMyDBMeta() { return VendorSynonymMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorSynonymMember newMyEntity() { return new VendorSynonymMember(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorSynonymMemberCB newMyConditionBean() { return new VendorSynonymMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * int count = vendorSynonymMemberBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorSynonymMemberCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorSynonymMemberCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorSynonymMemberCB cb) { // called by selectPage(cb)
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
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * VendorSynonymMember vendorSynonymMember = vendorSynonymMemberBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorSynonymMember != null) {
     *     ... = vendorSynonymMember.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSynonymMember selectEntity(VendorSynonymMemberCB cb) {
        return doSelectEntity(cb, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> ENTITY doSelectEntity(final VendorSynonymMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, VendorSynonymMemberCB>() {
            public List<ENTITY> callbackSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * VendorSynonymMember vendorSynonymMember = vendorSynonymMemberBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorSynonymMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorSynonymMember selectEntityWithDeletedCheck(VendorSynonymMemberCB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> ENTITY doSelectEntityWithDeletedCheck(final VendorSynonymMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorSynonymMemberCB>() {
            public List<ENTITY> callbackSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
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
    public VendorSynonymMember selectByPKValue(Long memberId) {
        return doSelectByPKValue(memberId, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> ENTITY doSelectByPKValue(Long memberId, Class<ENTITY> entityType) {
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
    public VendorSynonymMember selectByPKValueWithDeletedCheck(Long memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> ENTITY doSelectByPKValueWithDeletedCheck(Long memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private VendorSynonymMemberCB buildPKCB(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        VendorSynonymMemberCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorSynonymMember&gt; vendorSynonymMemberList = vendorSynonymMemberBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorSynonymMember vendorSynonymMember : vendorSynonymMemberList) {
     *     ... = vendorSynonymMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorSynonymMember> selectList(VendorSynonymMemberCB cb) {
        return doSelectList(cb, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> ListResultBean<ENTITY> doSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, VendorSynonymMemberCB>() {
            public List<ENTITY> callbackSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorSynonymMember&gt; page = vendorSynonymMemberBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorSynonymMember vendorSynonymMember : page) {
     *     ... = vendorSynonymMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorSynonymMember> selectPage(VendorSynonymMemberCB cb) {
        return doSelectPage(cb, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> PagingResultBean<ENTITY> doSelectPage(VendorSynonymMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, VendorSynonymMemberCB>() {
            public int callbackSelectCount(VendorSynonymMemberCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * vendorSynonymMemberBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorSynonymMember&gt;() {
     *     public void handle(VendorSynonymMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorSynonymMember. (NotNull)
     */
    public void selectCursor(VendorSynonymMemberCB cb, EntityRowHandler<VendorSynonymMember> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorSynonymMember.class);
    }

    protected <ENTITY extends VendorSynonymMember> void doSelectCursor(VendorSynonymMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, VendorSynonymMemberCB>() {
            public void callbackSelectCursor(VendorSynonymMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorSynonymMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorSynonymMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorSynonymMemberCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends VendorSynonymMemberCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorSynonymMember The entity of vendorSynonymMember. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSynonymMemberLoginList(VendorSynonymMember vendorSynonymMember, ConditionBeanSetupper<SynonymMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(vendorSynonymMember, conditionBeanSetupper);
        loadSynonymMemberLoginList(xnewLRLs(vendorSynonymMember), conditionBeanSetupper);
    }
    /**
     * Load referrer of synonymMemberLoginList with the set-upper for condition-bean of referrer. <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * <pre>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">loadSynonymMemberLoginList</span>(vendorSynonymMemberList, new ConditionBeanSetupper&lt;SynonymMemberLoginCB&gt;() {
     *     public void setup(SynonymMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorSynonymMember vendorSynonymMember : vendorSynonymMemberList) {
     *     ... = vendorSynonymMember.<span style="color: #FD4747">getSynonymMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param vendorSynonymMemberList The entity list of vendorSynonymMember. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSynonymMemberLoginList(List<VendorSynonymMember> vendorSynonymMemberList, ConditionBeanSetupper<SynonymMemberLoginCB> conditionBeanSetupper) {
        xassLRArg(vendorSynonymMemberList, conditionBeanSetupper);
        loadSynonymMemberLoginList(vendorSynonymMemberList, new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorSynonymMember The entity of vendorSynonymMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSynonymMemberLoginList(VendorSynonymMember vendorSynonymMember, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(vendorSynonymMember, loadReferrerOption);
        loadSynonymMemberLoginList(xnewLRLs(vendorSynonymMember), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorSynonymMemberList The entity list of vendorSynonymMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSynonymMemberLoginList(List<VendorSynonymMember> vendorSynonymMemberList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(vendorSynonymMemberList, loadReferrerOption);
        if (vendorSynonymMemberList.isEmpty()) { return; }
        final SynonymMemberLoginBhv referrerBhv = xgetBSFLR().select(SynonymMemberLoginBhv.class);
        helpLoadReferrerInternally(vendorSynonymMemberList, loadReferrerOption, new InternalLoadReferrerCallback<VendorSynonymMember, Long, SynonymMemberLoginCB, SynonymMemberLogin>() {
            public Long getPKVal(VendorSynonymMember et)
            { return et.getMemberId(); }
            public void setRfLs(VendorSynonymMember et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
            public SynonymMemberLoginCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SynonymMemberLoginCB cb, List<Long> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(SynonymMemberLoginCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(SynonymMemberLoginCB cb) { cb.specify().columnMemberId(); }
            public List<SynonymMemberLogin> selRfLs(SynonymMemberLoginCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(SynonymMemberLogin re) { return re.getMemberId(); }
            public void setlcEt(SynonymMemberLogin re, VendorSynonymMember le)
            { re.setVendorSynonymMember(le); }
            public String getRfPrNm() { return "synonymMemberLoginList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param vendorSynonymMemberList The list of vendorSynonymMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<VendorSynonymMember> vendorSynonymMemberList) {
        return helpPulloutInternally(vendorSynonymMemberList, new InternalPulloutCallback<VendorSynonymMember, MemberStatus>() {
            public MemberStatus getFr(VendorSynonymMember et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<VendorSynonymMember> ls)
            { et.setVendorSynonymMemberList(ls); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'SynonymMemberWithdrawal'.
     * @param vendorSynonymMemberList The list of vendorSynonymMember. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMemberWithdrawal> pulloutSynonymMemberWithdrawalAsOne(List<VendorSynonymMember> vendorSynonymMemberList) {
        return helpPulloutInternally(vendorSynonymMemberList, new InternalPulloutCallback<VendorSynonymMember, SynonymMemberWithdrawal>() {
            public SynonymMemberWithdrawal getFr(VendorSynonymMember et) { return et.getSynonymMemberWithdrawalAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SynonymMemberWithdrawal et, List<VendorSynonymMember> ls)
            { if (!ls.isEmpty()) { et.setVendorSynonymMember(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param vendorSynonymMemberList The list of vendorSynonymMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberIdList(List<VendorSynonymMember> vendorSynonymMemberList) {
        return helpExtractListInternally(vendorSynonymMemberList, new InternalExtractCallback<VendorSynonymMember, Long>() {
            public Long getCV(VendorSynonymMember et) { return et.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param vendorSynonymMemberList The list of vendorSynonymMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<VendorSynonymMember> vendorSynonymMemberList) {
        return helpExtractListInternally(vendorSynonymMemberList, new InternalExtractCallback<VendorSynonymMember, String>() {
            public String getCV(VendorSynonymMember et) { return et.getMemberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSynonymMember.setFoo...(value);
     * vendorSynonymMember.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.set...;</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">insert</span>(vendorSynonymMember);
     * ... = vendorSynonymMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorSynonymMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorSynonymMember vendorSynonymMember) {
        doInsert(vendorSynonymMember, null);
    }

    protected void doInsert(VendorSynonymMember vendorSynonymMember, InsertOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareInsertOption(op);
        delegateInsert(vendorSynonymMember, op);
    }

    protected void prepareInsertOption(InsertOption<VendorSynonymMemberCB> op) {
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSynonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSynonymMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorSynonymMemberBhv.<span style="color: #FD4747">update</span>(vendorSynonymMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSynonymMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorSynonymMember vendorSynonymMember) {
        doUpdate(vendorSynonymMember, null);
    }

    protected void doUpdate(VendorSynonymMember vendorSynonymMember, final UpdateOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorSynonymMember, new InternalUpdateCallback<VendorSynonymMember>() {
            public int callbackDelegateUpdate(VendorSynonymMember et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorSynonymMemberCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorSynonymMemberCB createCBForVaryingUpdate() {
        VendorSynonymMemberCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorSynonymMemberCB createCBForSpecifiedUpdate() {
        VendorSynonymMemberCB cb = newMyConditionBean();
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSynonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">updateNonstrict</span>(vendorSynonymMember);
     * </pre>
     * @param vendorSynonymMember The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final VendorSynonymMember vendorSynonymMember) {
        doUpdateNonstrict(vendorSynonymMember, null);
    }

    protected void doUpdateNonstrict(VendorSynonymMember vendorSynonymMember, final UpdateOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(vendorSynonymMember, new InternalUpdateNonstrictCallback<VendorSynonymMember>() {
            public int callbackDelegateUpdateNonstrict(VendorSynonymMember et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param vendorSynonymMember The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorSynonymMember vendorSynonymMember) {
        doInesrtOrUpdate(vendorSynonymMember, null, null);
    }

    protected void doInesrtOrUpdate(VendorSynonymMember vendorSynonymMember, final InsertOption<VendorSynonymMemberCB> iop, final UpdateOption<VendorSynonymMemberCB> uop) {
        helpInsertOrUpdateInternally(vendorSynonymMember, new InternalInsertOrUpdateCallback<VendorSynonymMember, VendorSynonymMemberCB>() {
            public void callbackInsert(VendorSynonymMember et) { doInsert(et, iop); }
            public void callbackUpdate(VendorSynonymMember et) { doUpdate(et, uop); }
            public VendorSynonymMemberCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorSynonymMemberCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<VendorSynonymMemberCB>();
            uop = uop != null ? uop : new UpdateOption<VendorSynonymMemberCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorSynonymMember The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(VendorSynonymMember vendorSynonymMember) {
        doInesrtOrUpdateNonstrict(vendorSynonymMember, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(VendorSynonymMember vendorSynonymMember, final InsertOption<VendorSynonymMemberCB> iop, final UpdateOption<VendorSynonymMemberCB> uop) {
        helpInsertOrUpdateInternally(vendorSynonymMember, new InternalInsertOrUpdateNonstrictCallback<VendorSynonymMember>() {
            public void callbackInsert(VendorSynonymMember et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(VendorSynonymMember et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<VendorSynonymMemberCB>();
            uop = uop != null ? uop : new UpdateOption<VendorSynonymMemberCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSynonymMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorSynonymMemberBhv.<span style="color: #FD4747">delete</span>(vendorSynonymMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSynonymMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorSynonymMember vendorSynonymMember) {
        doDelete(vendorSynonymMember, null);
    }

    protected void doDelete(VendorSynonymMember vendorSynonymMember, final DeleteOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorSynonymMember, new InternalDeleteCallback<VendorSynonymMember>() {
            public int callbackDelegateDelete(VendorSynonymMember et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorSynonymMemberCB> op) {
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">deleteNonstrict</span>(vendorSynonymMember);
     * </pre>
     * @param vendorSynonymMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(VendorSynonymMember vendorSynonymMember) {
        doDeleteNonstrict(vendorSynonymMember, null);
    }

    protected void doDeleteNonstrict(VendorSynonymMember vendorSynonymMember, final DeleteOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(vendorSynonymMember, new InternalDeleteNonstrictCallback<VendorSynonymMember>() {
            public int callbackDelegateDeleteNonstrict(VendorSynonymMember et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(vendorSynonymMember);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param vendorSynonymMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(VendorSynonymMember vendorSynonymMember) {
        doDeleteNonstrictIgnoreDeleted(vendorSynonymMember, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(VendorSynonymMember vendorSynonymMember, final DeleteOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(vendorSynonymMember, new InternalDeleteNonstrictIgnoreDeletedCallback<VendorSynonymMember>() {
            public int callbackDelegateDeleteNonstrict(VendorSynonymMember et) { return delegateDeleteNonstrict(et, op); } });
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
     *     VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     *     vendorSynonymMember.setFooName("foo");
     *     if (...) {
     *         vendorSynonymMember.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorSynonymMemberList.add(vendorSynonymMember);
     * }
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchInsert</span>(vendorSynonymMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorSynonymMember> vendorSynonymMemberList) {
        InsertOption<VendorSynonymMemberCB> op = createInsertUpdateOption();
        return doBatchInsert(vendorSynonymMemberList, op);
    }

    protected int[] doBatchInsert(List<VendorSynonymMember> vendorSynonymMemberList, InsertOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMemberList", vendorSynonymMemberList);
        prepareBatchInsertOption(vendorSynonymMemberList, op);
        return delegateBatchInsert(vendorSynonymMemberList, op);
    }

    protected void prepareBatchInsertOption(List<VendorSynonymMember> vendorSynonymMemberList, InsertOption<VendorSynonymMemberCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorSynonymMemberList);
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
     *     VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     *     vendorSynonymMember.setFooName("foo");
     *     if (...) {
     *         vendorSynonymMember.setFooPrice(123);
     *     } else {
     *         vendorSynonymMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorSynonymMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorSynonymMemberList.add(vendorSynonymMember);
     * }
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSynonymMemberList);
     * </pre>
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<VendorSynonymMember> vendorSynonymMemberList) {
        UpdateOption<VendorSynonymMemberCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorSynonymMemberList, op);
    }

    protected int[] doBatchUpdate(List<VendorSynonymMember> vendorSynonymMemberList, UpdateOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMemberList", vendorSynonymMemberList);
        prepareBatchUpdateOption(vendorSynonymMemberList, op);
        return delegateBatchUpdate(vendorSynonymMemberList, op);
    }

    protected void prepareBatchUpdateOption(List<VendorSynonymMember> vendorSynonymMemberList, UpdateOption<VendorSynonymMemberCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorSynonymMemberList);
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
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSynonymMemberList, new SpecifyQuery<VendorSynonymMemberCB>() {
     *     public void specify(VendorSynonymMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSynonymMemberList, new SpecifyQuery<VendorSynonymMemberCB>() {
     *     public void specify(VendorSynonymMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<VendorSynonymMember> vendorSynonymMemberList, SpecifyQuery<VendorSynonymMemberCB> updateColumnSpec) {
        return doBatchUpdate(vendorSynonymMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     *     vendorSynonymMember.setFooName("foo");
     *     if (...) {
     *         vendorSynonymMember.setFooPrice(123);
     *     } else {
     *         vendorSynonymMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorSynonymMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorSynonymMemberList.add(vendorSynonymMember);
     * }
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdate</span>(vendorSynonymMemberList);
     * </pre>
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<VendorSynonymMember> vendorSynonymMemberList) {
        UpdateOption<VendorSynonymMemberCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(vendorSynonymMemberList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<VendorSynonymMember> vendorSynonymMemberList, UpdateOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMemberList", vendorSynonymMemberList);
        prepareBatchUpdateOption(vendorSynonymMemberList, op);
        return delegateBatchUpdateNonstrict(vendorSynonymMemberList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(vendorSynonymMemberList, new SpecifyQuery<VendorSynonymMemberCB>() {
     *     public void specify(VendorSynonymMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">batchUpdateNonstrict</span>(vendorSynonymMemberList, new SpecifyQuery<VendorSynonymMemberCB>() {
     *     public void specify(VendorSynonymMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<VendorSynonymMember> vendorSynonymMemberList, SpecifyQuery<VendorSynonymMemberCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(vendorSynonymMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<VendorSynonymMember> vendorSynonymMemberList) {
        return doBatchDelete(vendorSynonymMemberList, null);
    }

    protected int[] doBatchDelete(List<VendorSynonymMember> vendorSynonymMemberList, DeleteOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMemberList", vendorSynonymMemberList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorSynonymMemberList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<VendorSynonymMember> vendorSynonymMemberList) {
        return doBatchDeleteNonstrict(vendorSynonymMemberList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<VendorSynonymMember> vendorSynonymMemberList, DeleteOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMemberList", vendorSynonymMemberList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(vendorSynonymMemberList, op);
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
     * vendorSynonymMemberBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorSynonymMember, VendorSynonymMemberCB&gt;() {
     *     public ConditionBean setup(vendorSynonymMember entity, VendorSynonymMemberCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorSynonymMember, VendorSynonymMemberCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorSynonymMember, VendorSynonymMemberCB> sp, InsertOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        VendorSynonymMember e = new VendorSynonymMember();
        VendorSynonymMemberCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected VendorSynonymMemberCB createCBForQueryInsert() {
        VendorSynonymMemberCB cb = newMyConditionBean();
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setPK...(value);</span>
     * vendorSynonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * vendorSynonymMemberBhv.<span style="color: #FD4747">queryUpdate</span>(vendorSynonymMember, cb);
     * </pre>
     * @param vendorSynonymMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorSynonymMember vendorSynonymMember, VendorSynonymMemberCB cb) {
        return doQueryUpdate(vendorSynonymMember, cb, null);
    }

    protected int doQueryUpdate(VendorSynonymMember vendorSynonymMember, VendorSynonymMemberCB cb, UpdateOption<VendorSynonymMemberCB> op) {
        assertObjectNotNull("vendorSynonymMember", vendorSynonymMember); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorSynonymMember, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (VendorSynonymMemberCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (VendorSynonymMemberCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * vendorSynonymMemberBhv.<span style="color: #FD4747">queryDelete</span>(vendorSynonymMember, cb);
     * </pre>
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorSynonymMemberCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorSynonymMemberCB cb, DeleteOption<VendorSynonymMemberCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((VendorSynonymMemberCB)cb); }
        else { return varyingQueryDelete((VendorSynonymMemberCB)cb, downcast(op)); }
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorSynonymMember.setFoo...(value);
     * vendorSynonymMember.setBar...(value);
     * InsertOption<VendorSynonymMemberCB> option = new InsertOption<VendorSynonymMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorSynonymMemberBhv.<span style="color: #FD4747">varyingInsert</span>(vendorSynonymMember, option);
     * ... = vendorSynonymMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorSynonymMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorSynonymMember vendorSynonymMember, InsertOption<VendorSynonymMemberCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorSynonymMember, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSynonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorSynonymMember.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorSynonymMemberCB&gt; option = new UpdateOption&lt;VendorSynonymMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorSynonymMemberCB&gt;() {
     *         public void specify(VendorSynonymMemberCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorSynonymMemberBhv.<span style="color: #FD4747">varyingUpdate</span>(vendorSynonymMember, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorSynonymMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorSynonymMember vendorSynonymMember, UpdateOption<VendorSynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorSynonymMember, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * vendorSynonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorSynonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * UpdateOption&lt;VendorSynonymMemberCB&gt; option = new UpdateOption&lt;VendorSynonymMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void specify(VendorSynonymMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(vendorSynonymMember, option);
     * </pre>
     * @param vendorSynonymMember The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(VendorSynonymMember vendorSynonymMember, UpdateOption<VendorSynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(vendorSynonymMember, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorSynonymMember The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorSynonymMember vendorSynonymMember, InsertOption<VendorSynonymMemberCB> insertOption, UpdateOption<VendorSynonymMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorSynonymMember, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param vendorSynonymMember The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(VendorSynonymMember vendorSynonymMember, InsertOption<VendorSynonymMemberCB> insertOption, UpdateOption<VendorSynonymMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(vendorSynonymMember, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorSynonymMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorSynonymMember vendorSynonymMember, DeleteOption<VendorSynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorSynonymMember, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param vendorSynonymMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(VendorSynonymMember vendorSynonymMember, DeleteOption<VendorSynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(vendorSynonymMember, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorSynonymMember> vendorSynonymMemberList, InsertOption<VendorSynonymMemberCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorSynonymMemberList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorSynonymMember> vendorSynonymMemberList, UpdateOption<VendorSynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorSynonymMemberList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<VendorSynonymMember> vendorSynonymMemberList, UpdateOption<VendorSynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(vendorSynonymMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorSynonymMember> vendorSynonymMemberList, DeleteOption<VendorSynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorSynonymMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param vendorSynonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<VendorSynonymMember> vendorSynonymMemberList, DeleteOption<VendorSynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(vendorSynonymMemberList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorSynonymMember, VendorSynonymMemberCB> setupper, InsertOption<VendorSynonymMemberCB> option) {
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
     * VendorSynonymMember vendorSynonymMember = new VendorSynonymMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setPK...(value);</span>
     * vendorSynonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorSynonymMember.setVersionNo(value);</span>
     * VendorSynonymMemberCB cb = new VendorSynonymMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorSynonymMemberCB&gt; option = new UpdateOption&lt;VendorSynonymMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorSynonymMemberCB&gt;() {
     *     public void specify(VendorSynonymMemberCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorSynonymMemberBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorSynonymMember, cb, option);
     * </pre>
     * @param vendorSynonymMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorSynonymMember vendorSynonymMember, VendorSynonymMemberCB cb, UpdateOption<VendorSynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorSynonymMember, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorSynonymMember. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorSynonymMemberCB cb, DeleteOption<VendorSynonymMemberCB> option) {
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
    public OutsideSqlBasicExecutor<VendorSynonymMemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorSynonymMemberCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorSynonymMemberCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorSynonymMember> void delegateSelectCursor(VendorSynonymMemberCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends VendorSynonymMember> List<ENTITY> delegateSelectList(VendorSynonymMemberCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorSynonymMember et, InsertOption<VendorSynonymMemberCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(VendorSynonymMember et, UpdateOption<VendorSynonymMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(VendorSynonymMember et, UpdateOption<VendorSynonymMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(VendorSynonymMember et, DeleteOption<VendorSynonymMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(VendorSynonymMember et, DeleteOption<VendorSynonymMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<VendorSynonymMember> ls, InsertOption<VendorSynonymMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorSynonymMember> ls, UpdateOption<VendorSynonymMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorSynonymMember> ls, UpdateOption<VendorSynonymMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorSynonymMember> ls, DeleteOption<VendorSynonymMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorSynonymMember> ls, DeleteOption<VendorSynonymMemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorSynonymMember et, VendorSynonymMemberCB inCB, ConditionBean resCB, InsertOption<VendorSynonymMemberCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorSynonymMember et, VendorSynonymMemberCB cb, UpdateOption<VendorSynonymMemberCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(VendorSynonymMemberCB cb, DeleteOption<VendorSynonymMemberCB> op)
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
    protected VendorSynonymMember downcast(Entity et) {
        return helpEntityDowncastInternally(et, VendorSynonymMember.class);
    }

    protected VendorSynonymMemberCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorSynonymMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorSynonymMember> downcast(List<? extends Entity> ls) {
        return (List<VendorSynonymMember>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorSynonymMemberCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<VendorSynonymMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorSynonymMemberCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<VendorSynonymMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorSynonymMemberCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<VendorSynonymMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorSynonymMember, VendorSynonymMemberCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<VendorSynonymMember, VendorSynonymMemberCB>)sp;
    }
}
