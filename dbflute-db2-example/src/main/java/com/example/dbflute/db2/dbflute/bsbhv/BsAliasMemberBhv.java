package com.example.dbflute.db2.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.bsbhv.loader.*;
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
public abstract class BsAliasMemberBhv extends AbstractBehaviorWritable<AliasMember, AliasMemberCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public AliasMemberDbm getDBMeta() { return AliasMemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasMemberDbm getMyDBMeta() { return AliasMemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public AliasMemberCB newConditionBean() { return new AliasMemberCB(); }

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
     * int count = aliasMemberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasMemberCB cb) {
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
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = aliasMemberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (aliasMember != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = aliasMember.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntity(AliasMemberCB cb) {
        return facadeSelectEntity(cb);
    }

    protected AliasMember facadeSelectEntity(AliasMemberCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectOptionalEntity(AliasMemberCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = aliasMemberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntityWithDeletedCheck(AliasMemberCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectByPKValue(Integer memberId) {
        return facadeSelectByPKValue(memberId);
    }

    protected AliasMember facadeSelectByPKValue(Integer memberId) {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberId), tp);
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberId, tp), memberId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId (会員ID): PK, NotNull, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKWithDeletedCheck(memberId, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectByPKWithDeletedCheck(Integer memberId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(memberId), tp);
    }

    protected AliasMemberCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<AliasMember> selectByUniqueOf(String memberAccount) {
        return facadeSelectByUniqueOf(memberAccount);
    }

    protected OptionalEntity<AliasMember> facadeSelectByUniqueOf(String memberAccount) {
        return doSelectByUniqueOf(memberAccount, typeOfSelectedEntity());
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectByUniqueOf(String memberAccount, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), tp), memberAccount);
    }

    protected AliasMemberCB xprepareCBAsUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        return newConditionBean().acceptUniqueOf(memberAccount);
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
     * ListResultBean&lt;AliasMember&gt; aliasMemberList = aliasMemberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (AliasMember aliasMember : aliasMemberList) {
     *     ... = aliasMember.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasMember> selectList(AliasMemberCB cb) {
        return facadeSelectList(cb);
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasMember&gt; page = aliasMemberBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasMember> selectPage(AliasMemberCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasMember&gt;() {
     *     public void handle(AliasMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasMember. (NotNull)
     */
    public void selectCursor(AliasMemberCB cb, EntityRowHandler<AliasMember> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * aliasMemberBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<AliasMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<AliasMember> aliasMemberList, ReferrerLoaderHandler<LoaderOfAliasMember> handler) {
        xassLRArg(aliasMemberList, handler);
        handler.handle(new LoaderOfAliasMember().ready(aliasMemberList, _behaviorSelector));
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
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(AliasMember aliasMember, ReferrerLoaderHandler<LoaderOfAliasMember> handler) {
        xassLRArg(aliasMember, handler);
        handler.handle(new LoaderOfAliasMember().ready(xnewLRAryLs(aliasMember), _behaviorSelector));
    }

    /**
     * Load referrer of aliasMemberLoginList by the set-upper of referrer. <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * aliasMemberBhv.<span style="color: #DD4747">loadAliasMemberLoginList</span>(aliasMemberList, new ConditionBeanSetupper&lt;AliasMemberLoginCB&gt;() {
     *     public void setup(AliasMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (AliasMember aliasMember : aliasMemberList) {
     *     ... = aliasMember.<span style="color: #DD4747">getAliasMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLoginList(List<AliasMember> aliasMemberList, ConditionBeanSetupper<AliasMemberLoginCB> setupper) {
        xassLRArg(aliasMemberList, setupper);
        return doLoadAliasMemberLoginList(aliasMemberList, new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(setupper));
    }

    /**
     * Load referrer of aliasMemberLoginList by the set-upper of referrer. <br />
     * ALIAS_MEMBER_LOGIN by MEMBER_ID, named 'aliasMemberLoginList'.
     * <pre>
     * aliasMemberBhv.<span style="color: #DD4747">loadAliasMemberLoginList</span>(aliasMemberList, new ConditionBeanSetupper&lt;AliasMemberLoginCB&gt;() {
     *     public void setup(AliasMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = aliasMember.<span style="color: #DD4747">getAliasMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLoginList(AliasMember aliasMember, ConditionBeanSetupper<AliasMemberLoginCB> setupper) {
        xassLRArg(aliasMember, setupper);
        return doLoadAliasMemberLoginList(xnewLRLs(aliasMember), new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLoginList(AliasMember aliasMember, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMember, loadReferrerOption);
        return loadAliasMemberLoginList(xnewLRLs(aliasMember), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<AliasMemberLogin> loadAliasMemberLoginList(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMemberList, loadReferrerOption);
        if (aliasMemberList.isEmpty()) { return (NestedReferrerListGateway<AliasMemberLogin>)EMPTY_NREF_LGWAY; }
        return doLoadAliasMemberLoginList(aliasMemberList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<AliasMemberLogin> doLoadAliasMemberLoginList(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> option) {
        return helpLoadReferrerInternally(aliasMemberList, option, "aliasMemberLoginList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<AliasMember> aliasMemberList)
    { return helpPulloutInternally(aliasMemberList, "memberStatus"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<AliasMember> aliasMemberList)
    { return helpExtractListInternally(aliasMemberList, "memberId"); }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<AliasMember> aliasMemberList)
    { return helpExtractListInternally(aliasMemberList, "memberAccount"); }

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
     * aliasMemberBhv.<span style="color: #DD4747">insert</span>(aliasMember);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasMember aliasMember) {
        doInsert(aliasMember, null);
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #DD4747">update</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(AliasMember aliasMember) {
        doUpdate(aliasMember, null);
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #DD4747">updateNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(AliasMember aliasMember) {
        doUpdateNonstrict(aliasMember, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasMember aliasMember) {
        doInsertOrUpdate(aliasMember, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasMember The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(AliasMember aliasMember) {
        doInsertOrUpdateNonstrict(aliasMember, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #DD4747">delete</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasMember aliasMember) {
        doDelete(aliasMember, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #DD4747">deleteNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(AliasMember aliasMember) {
        doDeleteNonstrict(aliasMember, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(aliasMember);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(AliasMember aliasMember) {
        doDeleteNonstrictIgnoreDeleted(aliasMember, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(AliasMember et, final DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     * aliasMemberBhv.<span style="color: #DD4747">batchInsert</span>(aliasMemberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasMember> aliasMemberList) {
        return doBatchInsert(aliasMemberList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList) {
        return doBatchUpdate(aliasMemberList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdate</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdate</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList, SpecifyQuery<AliasMemberCB> updateColumnSpec) {
        return doBatchUpdate(aliasMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
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
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdate</span>(aliasMemberList);
     * </pre>
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<AliasMember> aliasMemberList) {
        return doBatchUpdateNonstrict(aliasMemberList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * aliasMemberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(aliasMemberList, new SpecifyQuery<AliasMemberCB>() {
     *     public void specify(AliasMemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<AliasMember> aliasMemberList, SpecifyQuery<AliasMemberCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(aliasMemberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<AliasMember> aliasMemberList) {
        return doBatchDelete(aliasMemberList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<AliasMember> aliasMemberList) {
        return doBatchDeleteNonstrict(aliasMemberList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * aliasMemberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasMember, AliasMemberCB&gt;() {
     *     public ConditionBean setup(AliasMember entity, AliasMemberCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> setupper) {
        return doQueryInsert(setupper, null);
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #DD4747">queryUpdate</span>(aliasMember, cb);
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasMember aliasMember, AliasMemberCB cb) {
        return doQueryUpdate(aliasMember, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * aliasMemberBhv.<span style="color: #DD4747">queryDelete</span>(aliasMember, cb);
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasMemberCB cb) {
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
     * AliasMember aliasMember = new AliasMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasMember.setFoo...(value);
     * aliasMember.setBar...(value);
     * InsertOption<AliasMemberCB> option = new InsertOption<AliasMemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasMemberBhv.<span style="color: #DD4747">varyingInsert</span>(aliasMember, option);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasMember The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * aliasMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *         public void specify(AliasMemberCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasMemberBhv.<span style="color: #DD4747">varyingUpdate</span>(aliasMember, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *     public void specify(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasMemberBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(aliasMember, option);
     * </pre>
     * @param aliasMember The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(AliasMember aliasMember, UpdateOption<AliasMemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(aliasMember, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasMember The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasMember aliasMember, InsertOption<AliasMemberCB> insertOption, UpdateOption<AliasMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(aliasMember, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param aliasMember The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(AliasMember aliasMember, InsertOption<AliasMemberCB> insertOption, UpdateOption<AliasMemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdateNonstrict(aliasMember, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasMember aliasMember, DeleteOption<AliasMemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasMember, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param aliasMember The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The set-upper of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasMemberCB&gt; option = new UpdateOption&lt;AliasMemberCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasMemberCB&gt;() {
     *     public void specify(AliasMemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasMemberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(aliasMember, cb, option);
     * </pre>
     * @param aliasMember The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
        OutsideSqlAllFacadeExecutor<AliasMemberBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends AliasMember> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.db2.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends AliasMember> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.db2.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends AliasMember> typeOfSelectedEntity() { return AliasMember.class; }
    protected Class<AliasMember> typeOfHandlingEntity() { return AliasMember.class; }
    protected Class<AliasMemberCB> typeOfHandlingConditionBean() { return AliasMemberCB.class; }
}
