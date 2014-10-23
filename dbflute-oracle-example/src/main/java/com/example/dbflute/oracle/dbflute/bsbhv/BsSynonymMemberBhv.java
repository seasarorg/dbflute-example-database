package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of (会員)SYNONYM_MEMBER as SYNONYM. <br />
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
public abstract class BsSynonymMemberBhv extends AbstractBehaviorWritable<SynonymMember, SynonymMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public SynonymMemberDbm getDBMeta() { return SynonymMemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymMemberDbm getMyDBMeta() { return SynonymMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymMemberCB newConditionBean() { return new SynonymMemberCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymMember newMyEntity() { return new SynonymMember(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymMemberCB newMyConditionBean() { return new SynonymMemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * int count = synonymMemberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymMemberCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * SynonymMember synonymMember = synonymMemberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymMember != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymMember.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMember selectEntity(SynonymMemberCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymMember facadeSelectEntity(SynonymMemberCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMember> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * SynonymMember synonymMember = synonymMemberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMember selectEntityWithDeletedCheck(SynonymMemberCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMember selectByPKValue(Long memberId) {
        return facadeSelectByPKValue(memberId);
    }

    protected SynonymMember facadeSelectByPKValue(Long memberId) {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMember> ENTITY doSelectByPK(Long memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends SynonymMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Long memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId (会員ID): PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymMember selectByPKValueWithDeletedCheck(Long memberId) {
        return doSelectByPKWithDeletedCheck(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMember> ENTITY doSelectByPKWithDeletedCheck(Long memberId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(memberId), tp);
    }

    protected SynonymMemberCB xprepareCBAsPK(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymMember> selectByUniqueOf(String memberAccount) {
        return facadeSelectByUniqueOf(memberAccount);
    }

    protected OptionalEntity<SynonymMember> facadeSelectByUniqueOf(String memberAccount) {
        return doSelectByUniqueOf(memberAccount, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymMember> OptionalEntity<ENTITY> doSelectByUniqueOf(String memberAccount, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), tp), memberAccount);
    }

    protected SynonymMemberCB xprepareCBAsUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        return newConditionBean().acceptUniqueOf(memberAccount);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymMember&gt; synonymMemberList = synonymMemberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymMember synonymMember : synonymMemberList) {
     *     ... = synonymMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymMember> selectList(SynonymMemberCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymMember&gt; page = synonymMemberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymMember synonymMember : page) {
     *     ... = synonymMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymMember> selectPage(SynonymMemberCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * synonymMemberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymMember&gt;() {
     *     public void handle(SynonymMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymMember. (NotNull)
     */
    public void selectCursor(SynonymMemberCB cb, EntityRowHandler<SynonymMember> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymMemberBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
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
     * @param synonymMemberList The entity list of synonymMember. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymMember> synonymMemberList, ReferrerLoaderHandler<LoaderOfSynonymMember> handler) {
        xassLRArg(synonymMemberList, handler);
        handler.handle(new LoaderOfSynonymMember().ready(synonymMemberList, _behaviorSelector));
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
     * @param synonymMember The entity of synonymMember. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymMember synonymMember, ReferrerLoaderHandler<LoaderOfSynonymMember> handler) {
        xassLRArg(synonymMember, handler);
        handler.handle(new LoaderOfSynonymMember().ready(xnewLRAryLs(synonymMember), _behaviorSelector));
    }

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * <pre>
     * synonymMemberBhv.<span style="color: #DD4747">loadSynonymMemberLoginList</span>(synonymMemberList, new ConditionBeanSetupper&lt;SynonymMemberLoginCB&gt;() {
     *     public void setup(SynonymMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (SynonymMember synonymMember : synonymMemberList) {
     *     ... = synonymMember.<span style="color: #DD4747">getSynonymMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param synonymMemberList The entity list of synonymMember. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLoginList(List<SynonymMember> synonymMemberList, ConditionBeanSetupper<SynonymMemberLoginCB> setupper) {
        xassLRArg(synonymMemberList, setupper);
        return doLoadSynonymMemberLoginList(synonymMemberList, new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(setupper));
    }

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * <pre>
     * synonymMemberBhv.<span style="color: #DD4747">loadSynonymMemberLoginList</span>(synonymMemberList, new ConditionBeanSetupper&lt;SynonymMemberLoginCB&gt;() {
     *     public void setup(SynonymMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = synonymMember.<span style="color: #DD4747">getSynonymMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param synonymMember The entity of synonymMember. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLoginList(SynonymMember synonymMember, ConditionBeanSetupper<SynonymMemberLoginCB> setupper) {
        xassLRArg(synonymMember, setupper);
        return doLoadSynonymMemberLoginList(xnewLRLs(synonymMember), new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param synonymMember The entity of synonymMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLoginList(SynonymMember synonymMember, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(synonymMember, loadReferrerOption);
        return loadSynonymMemberLoginList(xnewLRLs(synonymMember), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param synonymMemberList The entity list of synonymMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<SynonymMemberLogin> loadSynonymMemberLoginList(List<SynonymMember> synonymMemberList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(synonymMemberList, loadReferrerOption);
        if (synonymMemberList.isEmpty()) { return (NestedReferrerListGateway<SynonymMemberLogin>)EMPTY_NREF_LGWAY; }
        return doLoadSynonymMemberLoginList(synonymMemberList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<SynonymMemberLogin> doLoadSynonymMemberLoginList(List<SynonymMember> synonymMemberList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> option) {
        return helpLoadReferrerInternally(synonymMemberList, option, "synonymMemberLoginList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param synonymMemberList The list of synonymMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<SynonymMember> synonymMemberList)
    { return helpPulloutInternally(synonymMemberList, "memberStatus"); }

    /**
     * Pull out the list of referrer-as-one table 'SynonymMemberWithdrawal'.
     * @param synonymMemberList The list of synonymMember. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMemberWithdrawal> pulloutSynonymMemberWithdrawalAsOne(List<SynonymMember> synonymMemberList)
    { return helpPulloutInternally(synonymMemberList, "synonymMemberWithdrawalAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param synonymMemberList The list of synonymMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberIdList(List<SynonymMember> synonymMemberList)
    { return helpExtractListInternally(synonymMemberList, "memberId"); }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param synonymMemberList The list of synonymMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<SynonymMember> synonymMemberList)
    { return helpExtractListInternally(synonymMemberList, "memberAccount"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMember.setFoo...(value);
     * synonymMember.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMember.set...;</span>
     * synonymMemberBhv.<span style="color: #DD4747">insert</span>(synonymMember);
     * ... = synonymMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymMember synonymMember) {
        doInsert(synonymMember, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberBhv.<span style="color: #DD4747">update</span>(synonymMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymMember synonymMember) {
        doUpdate(synonymMember, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * synonymMemberBhv.<span style="color: #DD4747">updateNonstrict</span>(synonymMember);
     * </pre>
     * @param synonymMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(SynonymMember synonymMember) {
        doUpdateNonstrict(synonymMember, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymMember synonymMember) {
        doInsertOrUpdate(synonymMember, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(SynonymMember synonymMember) {
        doInsertOrUpdateNonstrict(synonymMember, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymMemberBhv.<span style="color: #DD4747">delete</span>(synonymMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymMember synonymMember) {
        doDelete(synonymMember, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * synonymMemberBhv.<span style="color: #DD4747">deleteNonstrict</span>(synonymMember);
     * </pre>
     * @param synonymMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(SynonymMember synonymMember) {
        doDeleteNonstrict(synonymMember, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * synonymMemberBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(synonymMember);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param synonymMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(SynonymMember synonymMember) {
        doDeleteNonstrictIgnoreDeleted(synonymMember, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(SynonymMember et, final DeleteOption<SynonymMemberCB> op) {
        assertObjectNotNull("synonymMember", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     SynonymMember synonymMember = new SynonymMember();
     *     synonymMember.setFooName("foo");
     *     if (...) {
     *         synonymMember.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymMemberList.add(synonymMember);
     * }
     * synonymMemberBhv.<span style="color: #DD4747">batchInsert</span>(synonymMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymMember> synonymMemberList) {
        return doBatchInsert(synonymMemberList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMember synonymMember = new SynonymMember();
     *     synonymMember.setFooName("foo");
     *     if (...) {
     *         synonymMember.setFooPrice(123);
     *     } else {
     *         synonymMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberList.add(synonymMember);
     * }
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberList);
     * </pre>
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymMember> synonymMemberList) {
        return doBatchUpdate(synonymMemberList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberList, new SpecifyQuery<SynonymMemberCB>() {
     *     public void specify(SynonymMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberList, new SpecifyQuery<SynonymMemberCB>() {
     *     public void specify(SynonymMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<SynonymMember> synonymMemberList, SpecifyQuery<SynonymMemberCB> updateColumnSpec) {
        return doBatchUpdate(synonymMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymMember synonymMember = new SynonymMember();
     *     synonymMember.setFooName("foo");
     *     if (...) {
     *         synonymMember.setFooPrice(123);
     *     } else {
     *         synonymMember.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymMember.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymMemberList.add(synonymMember);
     * }
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdate</span>(synonymMemberList);
     * </pre>
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymMember> synonymMemberList) {
        return doBatchUpdateNonstrict(synonymMemberList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymMemberList, new SpecifyQuery<SynonymMemberCB>() {
     *     public void specify(SynonymMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymMemberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(synonymMemberList, new SpecifyQuery<SynonymMemberCB>() {
     *     public void specify(SynonymMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<SynonymMember> synonymMemberList, SpecifyQuery<SynonymMemberCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(synonymMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<SynonymMember> synonymMemberList) {
        return doBatchDelete(synonymMemberList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<SynonymMember> synonymMemberList) {
        return doBatchDeleteNonstrict(synonymMemberList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymMemberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymMember, SynonymMemberCB&gt;() {
     *     public ConditionBean setup(SynonymMember entity, SynonymMemberCB intoCB) {
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
     * @param setupper The set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<SynonymMember, SynonymMemberCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMember.setPK...(value);</span>
     * synonymMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymMember.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * synonymMemberBhv.<span style="color: #DD4747">queryUpdate</span>(synonymMember, cb);
     * </pre>
     * @param synonymMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymMember synonymMember, SynonymMemberCB cb) {
        return doQueryUpdate(synonymMember, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * synonymMemberBhv.<span style="color: #DD4747">queryDelete</span>(synonymMember, cb);
     * </pre>
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymMemberCB cb) {
        return doQueryDelete(cb, null);
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
     * SynonymMember synonymMember = new SynonymMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymMember.setFoo...(value);
     * synonymMember.setBar...(value);
     * InsertOption<SynonymMemberCB> option = new InsertOption<SynonymMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymMemberBhv.<span style="color: #DD4747">varyingInsert</span>(synonymMember, option);
     * ... = synonymMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymMember synonymMember, InsertOption<SynonymMemberCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymMember, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymMemberCB&gt; option = new UpdateOption&lt;SynonymMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymMemberCB&gt;() {
     *         public void specify(SynonymMemberCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymMemberBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymMember, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymMember synonymMember, UpdateOption<SynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymMember, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SynonymMember synonymMember = new SynonymMember();
     * synonymMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * UpdateOption&lt;SynonymMemberCB&gt; option = new UpdateOption&lt;SynonymMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberCB&gt;() {
     *     public void specify(SynonymMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymMemberBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(synonymMember, option);
     * </pre>
     * @param synonymMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(SynonymMember synonymMember, UpdateOption<SynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(synonymMember, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymMember The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymMember synonymMember, InsertOption<SynonymMemberCB> insertOption, UpdateOption<SynonymMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymMember, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param synonymMember The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(SynonymMember synonymMember, InsertOption<SynonymMemberCB> insertOption, UpdateOption<SynonymMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(synonymMember, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymMember synonymMember, DeleteOption<SynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymMember, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param synonymMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(SynonymMember synonymMember, DeleteOption<SynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(synonymMember, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymMember> synonymMemberList, InsertOption<SynonymMemberCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymMemberList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymMember> synonymMemberList, UpdateOption<SynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymMemberList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<SynonymMember> synonymMemberList, UpdateOption<SynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(synonymMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymMember> synonymMemberList, DeleteOption<SynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymMemberList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param synonymMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<SynonymMember> synonymMemberList, DeleteOption<SynonymMemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(synonymMemberList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The set-upper of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<SynonymMember, SynonymMemberCB> setupper, InsertOption<SynonymMemberCB> option) {
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
     * SynonymMember synonymMember = new SynonymMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymMember.setPK...(value);</span>
     * synonymMember.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymMember.setVersionNo(value);</span>
     * SynonymMemberCB cb = new SynonymMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymMemberCB&gt; option = new UpdateOption&lt;SynonymMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymMemberCB&gt;() {
     *     public void specify(SynonymMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymMemberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymMember, cb, option);
     * </pre>
     * @param synonymMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymMember synonymMember, SynonymMemberCB cb, UpdateOption<SynonymMemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymMember, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymMember. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymMemberCB cb, DeleteOption<SynonymMemberCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymMemberBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<SynonymMemberBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymMember> typeOfSelectedEntity() { return SynonymMember.class; }
    protected Class<SynonymMember> typeOfHandlingEntity() { return SynonymMember.class; }
    protected Class<SynonymMemberCB> typeOfHandlingConditionBean() { return SynonymMemberCB.class; }
}
