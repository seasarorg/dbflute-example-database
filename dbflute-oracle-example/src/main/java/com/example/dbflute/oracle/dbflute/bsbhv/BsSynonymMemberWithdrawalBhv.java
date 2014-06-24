package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSExecutor;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of SYNONYM_MEMBER_WITHDRAWAL as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
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
 *     MEMBER_VENDOR_SYNONYM, WITHDRAWAL_REASON, SYNONYM_MEMBER, VENDOR_SYNONYM_MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberVendorSynonym, withdrawalReason, synonymMember, vendorSynonymMember
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymMemberWithdrawalBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_MEMBER_WITHDRAWAL"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return SynonymMemberWithdrawalDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymMemberWithdrawalDbm getMyDBMeta() { return SynonymMemberWithdrawalDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymMemberWithdrawal newEntity() { return new SynonymMemberWithdrawal(); }

    /** {@inheritDoc} */
    public SynonymMemberWithdrawalCB newConditionBean() { return new SynonymMemberWithdrawalCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymMemberWithdrawal newMyEntity() { return new SynonymMemberWithdrawal(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymMemberWithdrawalCB newMyConditionBean() { return new SynonymMemberWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * int count = synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymMemberWithdrawalCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(SynonymMemberWithdrawalCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymMemberWithdrawalCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymMemberWithdrawalCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    protected int doReadCount(ConditionBean cb) { return facadeSelectCount(downcast(cb)); }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymMemberWithdrawal != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymMemberWithdrawal.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectEntity(SynonymMemberWithdrawalCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymMemberWithdrawal facadeSelectEntity(SynonymMemberWithdrawalCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ENTITY doSelectEntity(SynonymMemberWithdrawalCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends SynonymMemberWithdrawal> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymMemberWithdrawalCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * SynonymMemberWithdrawal synonymMemberWithdrawal = synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymMemberWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectEntityWithDeletedCheck(SynonymMemberWithdrawalCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected SynonymMemberWithdrawal facadeSelectEntityWithDeletedCheck(SynonymMemberWithdrawalCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ENTITY doSelectEntityWithDeletedCheck(SynonymMemberWithdrawalCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectByPKValue(Long memberId) {
        return facadeSelectByPKValue(memberId);
    }

    protected SynonymMemberWithdrawal facadeSelectByPKValue(Long memberId) {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ENTITY doSelectByPK(Long memberId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends SynonymMemberWithdrawal> OptionalEntity<ENTITY> doSelectOptionalByPK(Long memberId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId : PK, NotNull, NUMBER(16), FK to MEMBER_VENDOR_SYNONYM. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMemberWithdrawal selectByPKValueWithDeletedCheck(Long memberId) {
        return doSelectByPKWithDeletedCheck(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ENTITY doSelectByPKWithDeletedCheck(Long memberId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(memberId), tp);
    }

    protected SynonymMemberWithdrawalCB xprepareCBAsPK(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymMemberWithdrawal&gt; synonymMemberWithdrawalList = synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymMemberWithdrawal synonymMemberWithdrawal : synonymMemberWithdrawalList) {
     *     ... = synonymMemberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMemberWithdrawal> selectList(SynonymMemberWithdrawalCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<SynonymMemberWithdrawal> facadeSelectList(SynonymMemberWithdrawalCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> ListResultBean<ENTITY> doSelectList(SynonymMemberWithdrawalCB cb, Class<ENTITY> tp) {
        return helpSelectListInternally(cb, tp);
    }

    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) { return facadeSelectList(downcast(cb)); }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymMemberWithdrawal&gt; page = synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymMemberWithdrawal synonymMemberWithdrawal : page) {
     *     ... = synonymMemberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMemberWithdrawal> selectPage(SynonymMemberWithdrawalCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<SynonymMemberWithdrawal> facadeSelectPage(SynonymMemberWithdrawalCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> PagingResultBean<ENTITY> doSelectPage(SynonymMemberWithdrawalCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymMemberWithdrawal&gt;() {
     *     public void handle(SynonymMemberWithdrawal entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymMemberWithdrawal. (NotNull)
     */
    public void selectCursor(SynonymMemberWithdrawalCB cb, EntityRowHandler<SynonymMemberWithdrawal> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(SynonymMemberWithdrawalCB cb, EntityRowHandler<SynonymMemberWithdrawal> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMemberWithdrawal> void doSelectCursor(SynonymMemberWithdrawalCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymMemberWithdrawalCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<SynonymMemberWithdrawalCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends SynonymMemberWithdrawalCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) { return facadeScalarSelect(tp); }

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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param synonymMemberWithdrawalList The entity list of synonymMemberWithdrawal. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, ReferrerLoaderHandler<LoaderOfSynonymMemberWithdrawal> handler) {
        xassLRArg(synonymMemberWithdrawalList, handler);
        handler.handle(new LoaderOfSynonymMemberWithdrawal().ready(synonymMemberWithdrawalList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param synonymMemberWithdrawal The entity of synonymMemberWithdrawal. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymMemberWithdrawal synonymMemberWithdrawal, ReferrerLoaderHandler<LoaderOfSynonymMemberWithdrawal> handler) {
        xassLRArg(synonymMemberWithdrawal, handler);
        handler.handle(new LoaderOfSynonymMemberWithdrawal().ready(xnewLRAryLs(synonymMemberWithdrawal), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberVendorSynonym'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberVendorSynonym> pulloutMemberVendorSynonym(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "memberVendorSynonym"); }

    /**
     * Pull out the list of foreign table 'WithdrawalReason'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WithdrawalReason> pulloutWithdrawalReason(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "withdrawalReason"); }

    /**
     * Pull out the list of foreign table 'SynonymMember'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMember> pulloutSynonymMember(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "synonymMember"); }

    /**
     * Pull out the list of foreign table 'VendorSynonymMember'.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorSynonymMember> pulloutVendorSynonymMember(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpPulloutInternally(synonymMemberWithdrawalList, "vendorSynonymMember"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param synonymMemberWithdrawalList The list of synonymMemberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberIdList(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList)
    { return helpExtractListInternally(synonymMemberWithdrawalList, "memberId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberWithdrawal.setFoo...(value);
     * synonymMemberWithdrawal.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">insert</span>(synonymMemberWithdrawal);
     * ... = synonymMemberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymMemberWithdrawal The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsert(synonymMemberWithdrawal, null);
    }

    protected void doInsert(SynonymMemberWithdrawal et, InsertOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymMemberWithdrawalCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberWithdrawalBhv.<span style="color: #DD4747">update</span>(synonymMemberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doUpdate(synonymMemberWithdrawal, null);
    }

    protected void doUpdate(SynonymMemberWithdrawal et, UpdateOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<SynonymMemberWithdrawalCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected SynonymMemberWithdrawalCB createCBForVaryingUpdate()
    { SynonymMemberWithdrawalCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected SynonymMemberWithdrawalCB createCBForSpecifiedUpdate()
    { SynonymMemberWithdrawalCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">updateNonstrict</span>(synonymMemberWithdrawal);
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doUpdateNonstrict(synonymMemberWithdrawal, null);
    }

    protected void doUpdateNonstrict(SynonymMemberWithdrawal et, UpdateOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareUpdateOption(op); helpUpdateNonstrictInternally(et, op);
    }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doUpdateNonstrict(downcast(et), downcast(op)); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsertOrUpdate(synonymMemberWithdrawal, null, null);
    }

    protected void doInsertOrUpdate(SynonymMemberWithdrawal et, InsertOption<SynonymMemberWithdrawalCB> iop, UpdateOption<SynonymMemberWithdrawalCB> uop) {
        assertObjectNotNull("synonymMemberWithdrawal", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doInsertOrUpdateNonstrict(synonymMemberWithdrawal, null, null);
    }

    protected void doInsertOrUpdateNonstrict(SynonymMemberWithdrawal et, InsertOption<SynonymMemberWithdrawalCB> iop, UpdateOption<SynonymMemberWithdrawalCB> uop) {
        assertObjectNotNull("synonymMemberWithdrawal", et); helpInsertOrUpdateNonstrictInternally(et, iop, uop);
    }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop)); }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberWithdrawalBhv.<span style="color: #DD4747">delete</span>(synonymMemberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doDelete(synonymMemberWithdrawal, null);
    }

    protected void doDelete(SynonymMemberWithdrawal et, final DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<SynonymMemberWithdrawalCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">deleteNonstrict</span>(synonymMemberWithdrawal);
     * </pre>
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doDeleteNonstrict(synonymMemberWithdrawal, null);
    }

    protected void doDeleteNonstrict(SynonymMemberWithdrawal et, final DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareDeleteOption(op); helpDeleteNonstrictInternally(et, op);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(synonymMemberWithdrawal);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymMemberWithdrawal synonymMemberWithdrawal) {
        doDeleteNonstrictIgnoreDeleted(synonymMemberWithdrawal, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymMemberWithdrawal et, final DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doDeleteNonstrict(downcast(et), downcast(op)); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     if (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchInsert</span>(synonymMemberWithdrawalList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchInsert(synonymMemberWithdrawalList, null);
    }

    protected int[] doBatchInsert(List<SynonymMemberWithdrawal> ls, InsertOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawalList", ls);
        InsertOption<SynonymMemberWithdrawalCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<SynonymMemberWithdrawal> ls, InsertOption<SynonymMemberWithdrawalCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     if (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     } else {
     *         synonymMemberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberWithdrawalList);
     * </pre>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchUpdate(synonymMemberWithdrawalList, null);
    }

    protected int[] doBatchUpdate(List<SynonymMemberWithdrawal> ls, UpdateOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawalList", ls);
        UpdateOption<SynonymMemberWithdrawalCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<SynonymMemberWithdrawal> ls, UpdateOption<SynonymMemberWithdrawalCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberWithdrawalList, new SpecifyQuery<SynonymMemberWithdrawalCB>() {
     *     public void specify(SynonymMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberWithdrawalList, new SpecifyQuery<SynonymMemberWithdrawalCB>() {
     *     public void specify(SynonymMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, SpecifyQuery<SynonymMemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdate(synonymMemberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     *     synonymMemberWithdrawal.setFooName("foo");
     *     if (...) {
     *         synonymMemberWithdrawal.setFooPrice(123);
     *     } else {
     *         synonymMemberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMemberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberWithdrawalList.add(synonymMemberWithdrawal);
     * }
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberWithdrawalList);
     * </pre>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchUpdateNonstrict(synonymMemberWithdrawalList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<SynonymMemberWithdrawal> ls, UpdateOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawalList", ls);
        UpdateOption<SynonymMemberWithdrawalCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop);
        return delegateBatchUpdateNonstrict(ls, rlop);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymMemberWithdrawalList, new SpecifyQuery<SynonymMemberWithdrawalCB>() {
     *     public void specify(SynonymMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymMemberWithdrawalList, new SpecifyQuery<SynonymMemberWithdrawalCB>() {
     *     public void specify(SynonymMemberWithdrawalCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, SpecifyQuery<SynonymMemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymMemberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doBatchUpdateNonstrict(downcast(ls), downcast(op)); }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchDelete(synonymMemberWithdrawalList, null);
    }

    protected int[] doBatchDelete(List<SynonymMemberWithdrawal> ls, DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawalList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        return doBatchDeleteNonstrict(synonymMemberWithdrawalList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<SynonymMemberWithdrawal> ls, DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawalList", ls);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doBatchDeleteNonstrict(downcast(ls), downcast(op)); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymMemberWithdrawal, SynonymMemberWithdrawalCB&gt;() {
     *     public ConditionBean setup(synonymMemberWithdrawal entity, SynonymMemberWithdrawalCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> sp, InsertOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        SynonymMemberWithdrawal et = newEntity(); SynonymMemberWithdrawalCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected SynonymMemberWithdrawalCB createCBForQueryInsert()
    { SynonymMemberWithdrawalCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">queryUpdate</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, SynonymMemberWithdrawalCB cb) {
        return doQueryUpdate(synonymMemberWithdrawal, cb, null);
    }

    protected int doQueryUpdate(SynonymMemberWithdrawal et, SynonymMemberWithdrawalCB cb, UpdateOption<SynonymMemberWithdrawalCB> op) {
        assertObjectNotNull("synonymMemberWithdrawal", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">queryDelete</span>(synonymMemberWithdrawal, cb);
     * </pre>
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymMemberWithdrawalCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymMemberWithdrawalCB cb, DeleteOption<SynonymMemberWithdrawalCB> op) {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) { return doQueryDelete(downcast(cb), downcast(op)); }

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
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMemberWithdrawal.setFoo...(value);
     * synonymMemberWithdrawal.setBar...(value);
     * InsertOption<SynonymMemberWithdrawalCB> option = new InsertOption<SynonymMemberWithdrawalCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">varyingInsert</span>(synonymMemberWithdrawal, option);
     * ... = synonymMemberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymMemberWithdrawal The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymMemberWithdrawal synonymMemberWithdrawal, InsertOption<SynonymMemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymMemberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMemberWithdrawal.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = new UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *         public void specify(SynonymMemberWithdrawalCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymMemberWithdrawalBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymMemberWithdrawal, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, UpdateOption<SynonymMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymMemberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * synonymMemberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = new UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void specify(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(synonymMemberWithdrawal, option);
     * </pre>
     * @param synonymMemberWithdrawal The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, UpdateOption<SynonymMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymMemberWithdrawal, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, InsertOption<SynonymMemberWithdrawalCB> insertOption, UpdateOption<SynonymMemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymMemberWithdrawal, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymMemberWithdrawal The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, InsertOption<SynonymMemberWithdrawalCB> insertOption, UpdateOption<SynonymMemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(synonymMemberWithdrawal, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymMemberWithdrawal synonymMemberWithdrawal, DeleteOption<SynonymMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymMemberWithdrawal, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymMemberWithdrawal The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymMemberWithdrawal synonymMemberWithdrawal, DeleteOption<SynonymMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymMemberWithdrawal, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, InsertOption<SynonymMemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymMemberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, UpdateOption<SynonymMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymMemberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, UpdateOption<SynonymMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymMemberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, DeleteOption<SynonymMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymMemberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymMemberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList, DeleteOption<SynonymMemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymMemberWithdrawalList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> setupper, InsertOption<SynonymMemberWithdrawalCB> option) {
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
     * SynonymMemberWithdrawal synonymMemberWithdrawal = new SynonymMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setPK...(value);</span>
     * synonymMemberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMemberWithdrawal.setVersionNo(value);</span>
     * SynonymMemberWithdrawalCB cb = new SynonymMemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberWithdrawalCB&gt; option = new UpdateOption&lt;SynonymMemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberWithdrawalCB&gt;() {
     *     public void specify(SynonymMemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymMemberWithdrawalBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymMemberWithdrawal, cb, option);
     * </pre>
     * @param synonymMemberWithdrawal The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMemberWithdrawal synonymMemberWithdrawal, SynonymMemberWithdrawalCB cb, UpdateOption<SynonymMemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymMemberWithdrawal, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymMemberWithdrawal. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymMemberWithdrawalCB cb, DeleteOption<SynonymMemberWithdrawalCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymMemberWithdrawalBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return downcast(et).getVersionNo() != null;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<SynonymMemberWithdrawal> typeOfSelectedEntity() { return SynonymMemberWithdrawal.class; }
    protected SynonymMemberWithdrawal downcast(Entity et) { return helpEntityDowncastInternally(et, SynonymMemberWithdrawal.class); }
    protected SynonymMemberWithdrawalCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, SynonymMemberWithdrawalCB.class); }
    @SuppressWarnings("unchecked")
    protected List<SynonymMemberWithdrawal> downcast(List<? extends Entity> ls) { return (List<SynonymMemberWithdrawal>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymMemberWithdrawalCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<SynonymMemberWithdrawalCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymMemberWithdrawalCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<SynonymMemberWithdrawalCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymMemberWithdrawalCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<SynonymMemberWithdrawalCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<SynonymMemberWithdrawal, SynonymMemberWithdrawalCB>)sp; }
}
