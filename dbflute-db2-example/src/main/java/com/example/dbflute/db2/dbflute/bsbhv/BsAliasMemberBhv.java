package com.example.dbflute.db2.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
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
     * int count = aliasMemberBhv.<span style="color: #DD4747">selectCount</span>(cb);
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
        return doSelectEntity(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectEntity(AliasMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends AliasMember> OptionalEntity<ENTITY> doSelectOptionalEntity(AliasMemberCB cb, Class<ENTITY> tp) {
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
     * AliasMemberCB cb = new AliasMemberCB();
     * cb.query().setFoo...(value);
     * AliasMember aliasMember = aliasMemberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasMember.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasMember selectEntityWithDeletedCheck(AliasMemberCB cb) {
        return doSelectEntityWithDeletedCheck(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ENTITY doSelectEntityWithDeletedCheck(AliasMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
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
        return doSelectList(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> ListResultBean<ENTITY> doSelectList(AliasMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, AliasMemberCB>() {
            public List<ENTITY> callbackSelectList(AliasMemberCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
        return doSelectPage(cb, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> PagingResultBean<ENTITY> doSelectPage(AliasMemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, AliasMemberCB>() {
            public int callbackSelectCount(AliasMemberCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
        doSelectCursor(cb, entityRowHandler, AliasMember.class);
    }

    protected <ENTITY extends AliasMember> void doSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, AliasMemberCB>() {
            public void callbackSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(AliasMemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
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
    public <RESULT> SLFunction<AliasMemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends AliasMemberCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends AliasMemberCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    public NestedReferrerLoader<AliasMemberLogin> loadAliasMemberLoginList(List<AliasMember> aliasMemberList, ConditionBeanSetupper<AliasMemberLoginCB> setupper) {
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
    public NestedReferrerLoader<AliasMemberLogin> loadAliasMemberLoginList(AliasMember aliasMember, ConditionBeanSetupper<AliasMemberLoginCB> setupper) {
        xassLRArg(aliasMember, setupper);
        return doLoadAliasMemberLoginList(xnewLRLs(aliasMember), new LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param aliasMember The entity of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<AliasMemberLogin> loadAliasMemberLoginList(AliasMember aliasMember, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMember, loadReferrerOption);
        return loadAliasMemberLoginList(xnewLRLs(aliasMember), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param aliasMemberList The entity list of aliasMember. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<AliasMemberLogin> loadAliasMemberLoginList(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> loadReferrerOption) {
        xassLRArg(aliasMemberList, loadReferrerOption);
        if (aliasMemberList.isEmpty()) { return (NestedReferrerLoader<AliasMemberLogin>)EMPTY_LOADER; }
        return doLoadAliasMemberLoginList(aliasMemberList, loadReferrerOption);
    }

    protected NestedReferrerLoader<AliasMemberLogin> doLoadAliasMemberLoginList(List<AliasMember> aliasMemberList, LoadReferrerOption<AliasMemberLoginCB, AliasMemberLogin> option) {
        final AliasMemberLoginBhv referrerBhv = xgetBSFLR().select(AliasMemberLoginBhv.class);
        return helpLoadReferrerInternally(aliasMemberList, option, new InternalLoadReferrerCallback<AliasMember, Integer, AliasMemberLoginCB, AliasMemberLogin>() {
            public Integer getPKVal(AliasMember et)
            { return et.getMemberId(); }
            public void setRfLs(AliasMember et, List<AliasMemberLogin> ls)
            { et.setAliasMemberLoginList(ls); }
            public AliasMemberLoginCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(AliasMemberLoginCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(AliasMemberLoginCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(AliasMemberLoginCB cb) { cb.specify().columnMemberId(); }
            public List<AliasMemberLogin> selRfLs(AliasMemberLoginCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(AliasMemberLogin re) { return re.getMemberId(); }
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
            public MemberStatus getFr(AliasMember et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<AliasMember> ls)
            { et.setAliasMemberList(ls); }
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
            public Integer getCV(AliasMember et) { return et.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param aliasMemberList The list of aliasMember. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<AliasMember> aliasMemberList) {
        return helpExtractListInternally(aliasMemberList, new InternalExtractCallback<AliasMember, String>() {
            public String getCV(AliasMember et) { return et.getMemberAccount(); }
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
     * aliasMemberBhv.<span style="color: #DD4747">insert</span>(aliasMember);
     * ... = aliasMember.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasMember aliasMember) {
        doInsert(aliasMember, null);
    }

    protected void doInsert(AliasMember aliasMember, InsertOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareInsertOption(op);
        delegateInsert(aliasMember, op);
    }

    protected void prepareInsertOption(InsertOption<AliasMemberCB> op) {
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
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasMember.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasMember.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasMember.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #DD4747">update</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final AliasMember aliasMember) {
        doUpdate(aliasMember, null);
    }

    protected void doUpdate(AliasMember aliasMember, final UpdateOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareUpdateOption(op);
        helpUpdateInternally(aliasMember, new InternalUpdateCallback<AliasMember>() {
            public int callbackDelegateUpdate(AliasMember et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<AliasMemberCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
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
     * aliasMemberBhv.<span style="color: #DD4747">updateNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final AliasMember aliasMember) {
        doUpdateNonstrict(aliasMember, null);
    }

    protected void doUpdateNonstrict(AliasMember aliasMember, final UpdateOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(aliasMember, new InternalUpdateNonstrictCallback<AliasMember>() {
            public int callbackDelegateUpdateNonstrict(AliasMember et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasMember aliasMember) {
        doInesrtOrUpdate(aliasMember, null, null);
    }

    protected void doInesrtOrUpdate(AliasMember aliasMember, final InsertOption<AliasMemberCB> iop, final UpdateOption<AliasMemberCB> uop) {
        helpInsertOrUpdateInternally(aliasMember, new InternalInsertOrUpdateCallback<AliasMember, AliasMemberCB>() {
            public void callbackInsert(AliasMember et) { doInsert(et, iop); }
            public void callbackUpdate(AliasMember et) { doUpdate(et, uop); }
            public AliasMemberCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(AliasMemberCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<AliasMemberCB>();
            uop = uop != null ? uop : new UpdateOption<AliasMemberCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(AliasMember aliasMember) {
        doInesrtOrUpdateNonstrict(aliasMember, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(AliasMember aliasMember, final InsertOption<AliasMemberCB> iop, final UpdateOption<AliasMemberCB> uop) {
        helpInsertOrUpdateInternally(aliasMember, new InternalInsertOrUpdateNonstrictCallback<AliasMember>() {
            public void callbackInsert(AliasMember et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(AliasMember et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<AliasMemberCB>();
            uop = uop != null ? uop : new UpdateOption<AliasMemberCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasMember.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     aliasMemberBhv.<span style="color: #DD4747">delete</span>(aliasMember);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasMember aliasMember) {
        doDelete(aliasMember, null);
    }

    protected void doDelete(AliasMember aliasMember, final DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(op);
        helpDeleteInternally(aliasMember, new InternalDeleteCallback<AliasMember>() {
            public int callbackDelegateDelete(AliasMember et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<AliasMemberCB> op) {
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
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #DD4747">deleteNonstrict</span>(aliasMember);
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(AliasMember aliasMember) {
        doDeleteNonstrict(aliasMember, null);
    }

    protected void doDeleteNonstrict(AliasMember aliasMember, final DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(aliasMember, new InternalDeleteNonstrictCallback<AliasMember>() {
            public int callbackDelegateDeleteNonstrict(AliasMember et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * AliasMember aliasMember = new AliasMember();
     * aliasMember.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasMember.setVersionNo(value);</span>
     * aliasMemberBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(aliasMember);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(AliasMember aliasMember) {
        doDeleteNonstrictIgnoreDeleted(aliasMember, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(AliasMember aliasMember, final DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(aliasMember, new InternalDeleteNonstrictIgnoreDeletedCallback<AliasMember>() {
            public int callbackDelegateDeleteNonstrict(AliasMember et) { return delegateDeleteNonstrict(et, op); } });
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
        InsertOption<AliasMemberCB> op = createInsertUpdateOption();
        return doBatchInsert(aliasMemberList, op);
    }

    protected int[] doBatchInsert(List<AliasMember> aliasMemberList, InsertOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchInsertOption(aliasMemberList, op);
        return delegateBatchInsert(aliasMemberList, op);
    }

    protected void prepareBatchInsertOption(List<AliasMember> aliasMemberList, InsertOption<AliasMemberCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(aliasMemberList);
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
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<AliasMember> aliasMemberList) {
        UpdateOption<AliasMemberCB> op = createPlainUpdateOption();
        return doBatchUpdate(aliasMemberList, op);
    }

    protected int[] doBatchUpdate(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchUpdateOption(aliasMemberList, op);
        return delegateBatchUpdate(aliasMemberList, op);
    }

    protected void prepareBatchUpdateOption(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(aliasMemberList);
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
     * @param aliasMemberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
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
        UpdateOption<AliasMemberCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(aliasMemberList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<AliasMember> aliasMemberList, UpdateOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareBatchUpdateOption(aliasMemberList, op);
        return delegateBatchUpdateNonstrict(aliasMemberList, op);
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

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
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

    protected int[] doBatchDelete(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareDeleteOption(op);
        return delegateBatchDelete(aliasMemberList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
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

    protected int[] doBatchDeleteNonstrict(List<AliasMember> aliasMemberList, DeleteOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMemberList", aliasMemberList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(aliasMemberList, op);
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
     * aliasMemberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasMember, AliasMemberCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<AliasMember, AliasMemberCB> sp, InsertOption<AliasMemberCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        AliasMember e = new AliasMember();
        AliasMemberCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
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

    protected int doQueryUpdate(AliasMember aliasMember, AliasMemberCB cb, UpdateOption<AliasMemberCB> op) {
        assertObjectNotNull("aliasMember", aliasMember); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(aliasMember, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (AliasMemberCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (AliasMemberCB)cb, downcast(op)); }
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

    protected int doQueryDelete(AliasMemberCB cb, DeleteOption<AliasMemberCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((AliasMemberCB)cb); }
        else { return varyingQueryDelete((AliasMemberCB)cb, downcast(op)); }
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
     * @param aliasMember The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
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
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
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
     * @param aliasMember The entity of update target. (NotNull, PrimaryKeyNotNull)
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
     * @param aliasMember The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @param aliasMember The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
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
    protected <ENTITY extends AliasMember> void delegateSelectCursor(AliasMemberCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends AliasMember> List<ENTITY> delegateSelectList(AliasMemberCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(AliasMember et, InsertOption<AliasMemberCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(AliasMember et, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(AliasMember et, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(AliasMember et, DeleteOption<AliasMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(AliasMember et, DeleteOption<AliasMemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

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

    protected int delegateQueryInsert(AliasMember et, AliasMemberCB inCB, ConditionBean resCB, InsertOption<AliasMemberCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(AliasMember et, AliasMemberCB cb, UpdateOption<AliasMemberCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(AliasMemberCB cb, DeleteOption<AliasMemberCB> op)
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
    protected AliasMember downcast(Entity et) {
        return helpEntityDowncastInternally(et, AliasMember.class);
    }

    protected AliasMemberCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, AliasMemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<AliasMember> downcast(List<? extends Entity> ls) {
        return (List<AliasMember>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<AliasMemberCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<AliasMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasMemberCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<AliasMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasMemberCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<AliasMemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasMember, AliasMemberCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<AliasMember, AliasMemberCB>)sp;
    }
}
