package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of (会員)MEMBER_VENDOR_SYNONYM as SYNONYM. <br />
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
public abstract class BsMemberVendorSynonymBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER_VENDOR_SYNONYM"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MemberVendorSynonymDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MemberVendorSynonymDbm getMyDBMeta() { return MemberVendorSynonymDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MemberVendorSynonym newMyEntity() { return new MemberVendorSynonym(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MemberVendorSynonymCB newMyConditionBean() { return new MemberVendorSynonymCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * int count = memberVendorSynonymBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MemberVendorSynonymCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MemberVendorSynonymCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MemberVendorSynonymCB cb) { // called by selectPage(cb)
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
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * MemberVendorSynonym memberVendorSynonym = memberVendorSynonymBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (memberVendorSynonym != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = memberVendorSynonym.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberVendorSynonym selectEntity(MemberVendorSynonymCB cb) {
        return doSelectEntity(cb, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> ENTITY doSelectEntity(MemberVendorSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MemberVendorSynonymCB>() {
            public List<ENTITY> callbackSelectList(MemberVendorSynonymCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends MemberVendorSynonym> OptionalEntity<ENTITY> doSelectOptionalEntity(MemberVendorSynonymCB cb, Class<ENTITY> tp) {
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
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * MemberVendorSynonym memberVendorSynonym = memberVendorSynonymBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberVendorSynonym.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberVendorSynonym selectEntityWithDeletedCheck(MemberVendorSynonymCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> ENTITY doSelectEntityWithDeletedCheck(MemberVendorSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MemberVendorSynonymCB>() {
            public List<ENTITY> callbackSelectList(MemberVendorSynonymCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
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
    public MemberVendorSynonym selectByPKValue(Long memberId) {
        return doSelectByPKValue(memberId, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> ENTITY doSelectByPKValue(Long memberId, Class<ENTITY> entityType) {
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
    public MemberVendorSynonym selectByPKValueWithDeletedCheck(Long memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> ENTITY doSelectByPKValueWithDeletedCheck(Long memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private MemberVendorSynonymCB buildPKCB(Long memberId) {
        assertObjectNotNull("memberId", memberId);
        MemberVendorSynonymCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MemberVendorSynonym&gt; memberVendorSynonymList = memberVendorSynonymBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MemberVendorSynonym memberVendorSynonym : memberVendorSynonymList) {
     *     ... = memberVendorSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberVendorSynonym> selectList(MemberVendorSynonymCB cb) {
        return doSelectList(cb, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> ListResultBean<ENTITY> doSelectList(MemberVendorSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MemberVendorSynonymCB>() {
            public List<ENTITY> callbackSelectList(MemberVendorSynonymCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberVendorSynonym&gt; page = memberVendorSynonymBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberVendorSynonym memberVendorSynonym : page) {
     *     ... = memberVendorSynonym.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberVendorSynonym> selectPage(MemberVendorSynonymCB cb) {
        return doSelectPage(cb, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> PagingResultBean<ENTITY> doSelectPage(MemberVendorSynonymCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MemberVendorSynonymCB>() {
            public int callbackSelectCount(MemberVendorSynonymCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MemberVendorSynonymCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * memberVendorSynonymBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberVendorSynonym&gt;() {
     *     public void handle(MemberVendorSynonym entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberVendorSynonym. (NotNull)
     */
    public void selectCursor(MemberVendorSynonymCB cb, EntityRowHandler<MemberVendorSynonym> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MemberVendorSynonym.class);
    }

    protected <ENTITY extends MemberVendorSynonym> void doSelectCursor(MemberVendorSynonymCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MemberVendorSynonymCB>() {
            public void callbackSelectCursor(MemberVendorSynonymCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MemberVendorSynonymCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberVendorSynonymBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberVendorSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MemberVendorSynonymCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MemberVendorSynonymCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MemberVendorSynonymCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * <pre>
     * memberVendorSynonymBhv.<span style="color: #DD4747">loadSynonymMemberLoginList</span>(memberVendorSynonymList, new ConditionBeanSetupper&lt;SynonymMemberLoginCB&gt;() {
     *     public void setup(SynonymMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (MemberVendorSynonym memberVendorSynonym : memberVendorSynonymList) {
     *     ... = memberVendorSynonym.<span style="color: #DD4747">getSynonymMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberVendorSynonymList The entity list of memberVendorSynonym. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymMemberLogin> loadSynonymMemberLoginList(List<MemberVendorSynonym> memberVendorSynonymList, ConditionBeanSetupper<SynonymMemberLoginCB> setupper) {
        xassLRArg(memberVendorSynonymList, setupper);
        return doLoadSynonymMemberLoginList(memberVendorSynonymList, new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(setupper));
    }

    /**
     * Load referrer of synonymMemberLoginList by the set-upper of referrer. <br />
     * (会員ログイン)SYNONYM_MEMBER_LOGIN by MEMBER_ID, named 'synonymMemberLoginList'.
     * <pre>
     * memberVendorSynonymBhv.<span style="color: #DD4747">loadSynonymMemberLoginList</span>(memberVendorSynonymList, new ConditionBeanSetupper&lt;SynonymMemberLoginCB&gt;() {
     *     public void setup(SynonymMemberLoginCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = memberVendorSynonym.<span style="color: #DD4747">getSynonymMemberLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberVendorSynonym The entity of memberVendorSynonym. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymMemberLogin> loadSynonymMemberLoginList(MemberVendorSynonym memberVendorSynonym, ConditionBeanSetupper<SynonymMemberLoginCB> setupper) {
        xassLRArg(memberVendorSynonym, setupper);
        return doLoadSynonymMemberLoginList(xnewLRLs(memberVendorSynonym), new LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param memberVendorSynonym The entity of memberVendorSynonym. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymMemberLogin> loadSynonymMemberLoginList(MemberVendorSynonym memberVendorSynonym, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(memberVendorSynonym, loadReferrerOption);
        return loadSynonymMemberLoginList(xnewLRLs(memberVendorSynonym), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param memberVendorSynonymList The entity list of memberVendorSynonym. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<SynonymMemberLogin> loadSynonymMemberLoginList(List<MemberVendorSynonym> memberVendorSynonymList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> loadReferrerOption) {
        xassLRArg(memberVendorSynonymList, loadReferrerOption);
        if (memberVendorSynonymList.isEmpty()) { return (NestedReferrerLoader<SynonymMemberLogin>)EMPTY_LOADER; }
        return doLoadSynonymMemberLoginList(memberVendorSynonymList, loadReferrerOption);
    }

    protected NestedReferrerLoader<SynonymMemberLogin> doLoadSynonymMemberLoginList(List<MemberVendorSynonym> memberVendorSynonymList, LoadReferrerOption<SynonymMemberLoginCB, SynonymMemberLogin> option) {
        final SynonymMemberLoginBhv referrerBhv = xgetBSFLR().select(SynonymMemberLoginBhv.class);
        return helpLoadReferrerInternally(memberVendorSynonymList, option, new InternalLoadReferrerCallback<MemberVendorSynonym, Long, SynonymMemberLoginCB, SynonymMemberLogin>() {
            public Long getPKVal(MemberVendorSynonym et)
            { return et.getMemberId(); }
            public void setRfLs(MemberVendorSynonym et, List<SynonymMemberLogin> ls)
            { et.setSynonymMemberLoginList(ls); }
            public SynonymMemberLoginCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SynonymMemberLoginCB cb, List<Long> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(SynonymMemberLoginCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(SynonymMemberLoginCB cb) { cb.specify().columnMemberId(); }
            public List<SynonymMemberLogin> selRfLs(SynonymMemberLoginCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(SynonymMemberLogin re) { return re.getMemberId(); }
            public void setlcEt(SynonymMemberLogin re, MemberVendorSynonym le)
            { re.setMemberVendorSynonym(le); }
            public String getRfPrNm() { return "synonymMemberLoginList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param memberVendorSynonymList The list of memberVendorSynonym. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<MemberVendorSynonym> memberVendorSynonymList) {
        return helpPulloutInternally(memberVendorSynonymList, new InternalPulloutCallback<MemberVendorSynonym, MemberStatus>() {
            public MemberStatus getFr(MemberVendorSynonym et) { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<MemberVendorSynonym> ls)
            { et.setMemberVendorSynonymList(ls); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'SynonymMemberWithdrawal'.
     * @param memberVendorSynonymList The list of memberVendorSynonym. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<SynonymMemberWithdrawal> pulloutSynonymMemberWithdrawalAsOne(List<MemberVendorSynonym> memberVendorSynonymList) {
        return helpPulloutInternally(memberVendorSynonymList, new InternalPulloutCallback<MemberVendorSynonym, SynonymMemberWithdrawal>() {
            public SynonymMemberWithdrawal getFr(MemberVendorSynonym et) { return et.getSynonymMemberWithdrawalAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SynonymMemberWithdrawal et, List<MemberVendorSynonym> ls)
            { if (!ls.isEmpty()) { et.setMemberVendorSynonym(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberVendorSynonymList The list of memberVendorSynonym. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractMemberIdList(List<MemberVendorSynonym> memberVendorSynonymList) {
        return helpExtractListInternally(memberVendorSynonymList, new InternalExtractCallback<MemberVendorSynonym, Long>() {
            public Long getCV(MemberVendorSynonym et) { return et.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberVendorSynonymList The list of memberVendorSynonym. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<MemberVendorSynonym> memberVendorSynonymList) {
        return helpExtractListInternally(memberVendorSynonymList, new InternalExtractCallback<MemberVendorSynonym, String>() {
            public String getCV(MemberVendorSynonym et) { return et.getMemberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberVendorSynonym.setFoo...(value);
     * memberVendorSynonym.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.set...;</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">insert</span>(memberVendorSynonym);
     * ... = memberVendorSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberVendorSynonym The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MemberVendorSynonym memberVendorSynonym) {
        doInsert(memberVendorSynonym, null);
    }

    protected void doInsert(MemberVendorSynonym memberVendorSynonym, InsertOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareInsertOption(op);
        delegateInsert(memberVendorSynonym, op);
    }

    protected void prepareInsertOption(InsertOption<MemberVendorSynonymCB> op) {
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberVendorSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberVendorSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberVendorSynonymBhv.<span style="color: #DD4747">update</span>(memberVendorSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberVendorSynonym The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final MemberVendorSynonym memberVendorSynonym) {
        doUpdate(memberVendorSynonym, null);
    }

    protected void doUpdate(MemberVendorSynonym memberVendorSynonym, final UpdateOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareUpdateOption(op);
        helpUpdateInternally(memberVendorSynonym, new InternalUpdateCallback<MemberVendorSynonym>() {
            public int callbackDelegateUpdate(MemberVendorSynonym et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MemberVendorSynonymCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MemberVendorSynonymCB createCBForVaryingUpdate() {
        MemberVendorSynonymCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MemberVendorSynonymCB createCBForSpecifiedUpdate() {
        MemberVendorSynonymCB cb = newMyConditionBean();
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberVendorSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">updateNonstrict</span>(memberVendorSynonym);
     * </pre>
     * @param memberVendorSynonym The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(final MemberVendorSynonym memberVendorSynonym) {
        doUpdateNonstrict(memberVendorSynonym, null);
    }

    protected void doUpdateNonstrict(MemberVendorSynonym memberVendorSynonym, final UpdateOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(memberVendorSynonym, new InternalUpdateNonstrictCallback<MemberVendorSynonym>() {
            public int callbackDelegateUpdateNonstrict(MemberVendorSynonym et) { return delegateUpdateNonstrict(et, op); } });
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
     * @param memberVendorSynonym The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MemberVendorSynonym memberVendorSynonym) {
        doInesrtOrUpdate(memberVendorSynonym, null, null);
    }

    protected void doInesrtOrUpdate(MemberVendorSynonym memberVendorSynonym, final InsertOption<MemberVendorSynonymCB> iop, final UpdateOption<MemberVendorSynonymCB> uop) {
        helpInsertOrUpdateInternally(memberVendorSynonym, new InternalInsertOrUpdateCallback<MemberVendorSynonym, MemberVendorSynonymCB>() {
            public void callbackInsert(MemberVendorSynonym et) { doInsert(et, iop); }
            public void callbackUpdate(MemberVendorSynonym et) { doUpdate(et, uop); }
            public MemberVendorSynonymCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MemberVendorSynonymCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MemberVendorSynonymCB>();
            uop = uop != null ? uop : new UpdateOption<MemberVendorSynonymCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberVendorSynonym The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MemberVendorSynonym memberVendorSynonym) {
        doInesrtOrUpdateNonstrict(memberVendorSynonym, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MemberVendorSynonym memberVendorSynonym, final InsertOption<MemberVendorSynonymCB> iop, final UpdateOption<MemberVendorSynonymCB> uop) {
        helpInsertOrUpdateInternally(memberVendorSynonym, new InternalInsertOrUpdateNonstrictCallback<MemberVendorSynonym>() {
            public void callbackInsert(MemberVendorSynonym et) { doInsert(et, iop); }
            public void callbackUpdateNonstrict(MemberVendorSynonym et) { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MemberVendorSynonymCB>();
            uop = uop != null ? uop : new UpdateOption<MemberVendorSynonymCB>();
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberVendorSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberVendorSynonymBhv.<span style="color: #DD4747">delete</span>(memberVendorSynonym);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberVendorSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MemberVendorSynonym memberVendorSynonym) {
        doDelete(memberVendorSynonym, null);
    }

    protected void doDelete(MemberVendorSynonym memberVendorSynonym, final DeleteOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareDeleteOption(op);
        helpDeleteInternally(memberVendorSynonym, new InternalDeleteCallback<MemberVendorSynonym>() {
            public int callbackDelegateDelete(MemberVendorSynonym et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MemberVendorSynonymCB> op) {
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">deleteNonstrict</span>(memberVendorSynonym);
     * </pre>
     * @param memberVendorSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MemberVendorSynonym memberVendorSynonym) {
        doDeleteNonstrict(memberVendorSynonym, null);
    }

    protected void doDeleteNonstrict(MemberVendorSynonym memberVendorSynonym, final DeleteOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(memberVendorSynonym, new InternalDeleteNonstrictCallback<MemberVendorSynonym>() {
            public int callbackDelegateDeleteNonstrict(MemberVendorSynonym et) { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(memberVendorSynonym);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param memberVendorSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MemberVendorSynonym memberVendorSynonym) {
        doDeleteNonstrictIgnoreDeleted(memberVendorSynonym, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MemberVendorSynonym memberVendorSynonym, final DeleteOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(memberVendorSynonym, new InternalDeleteNonstrictIgnoreDeletedCallback<MemberVendorSynonym>() {
            public int callbackDelegateDeleteNonstrict(MemberVendorSynonym et) { return delegateDeleteNonstrict(et, op); } });
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
     *     MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     *     memberVendorSynonym.setFooName("foo");
     *     if (...) {
     *         memberVendorSynonym.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberVendorSynonymList.add(memberVendorSynonym);
     * }
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchInsert</span>(memberVendorSynonymList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MemberVendorSynonym> memberVendorSynonymList) {
        InsertOption<MemberVendorSynonymCB> op = createInsertUpdateOption();
        return doBatchInsert(memberVendorSynonymList, op);
    }

    protected int[] doBatchInsert(List<MemberVendorSynonym> memberVendorSynonymList, InsertOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonymList", memberVendorSynonymList);
        prepareBatchInsertOption(memberVendorSynonymList, op);
        return delegateBatchInsert(memberVendorSynonymList, op);
    }

    protected void prepareBatchInsertOption(List<MemberVendorSynonym> memberVendorSynonymList, InsertOption<MemberVendorSynonymCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberVendorSynonymList);
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
     *     MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     *     memberVendorSynonym.setFooName("foo");
     *     if (...) {
     *         memberVendorSynonym.setFooPrice(123);
     *     } else {
     *         memberVendorSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberVendorSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberVendorSynonymList.add(memberVendorSynonym);
     * }
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(memberVendorSynonymList);
     * </pre>
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MemberVendorSynonym> memberVendorSynonymList) {
        UpdateOption<MemberVendorSynonymCB> op = createPlainUpdateOption();
        return doBatchUpdate(memberVendorSynonymList, op);
    }

    protected int[] doBatchUpdate(List<MemberVendorSynonym> memberVendorSynonymList, UpdateOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonymList", memberVendorSynonymList);
        prepareBatchUpdateOption(memberVendorSynonymList, op);
        return delegateBatchUpdate(memberVendorSynonymList, op);
    }

    protected void prepareBatchUpdateOption(List<MemberVendorSynonym> memberVendorSynonymList, UpdateOption<MemberVendorSynonymCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberVendorSynonymList);
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
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(memberVendorSynonymList, new SpecifyQuery<MemberVendorSynonymCB>() {
     *     public void specify(MemberVendorSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(memberVendorSynonymList, new SpecifyQuery<MemberVendorSynonymCB>() {
     *     public void specify(MemberVendorSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MemberVendorSynonym> memberVendorSynonymList, SpecifyQuery<MemberVendorSynonymCB> updateColumnSpec) {
        return doBatchUpdate(memberVendorSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     *     memberVendorSynonym.setFooName("foo");
     *     if (...) {
     *         memberVendorSynonym.setFooPrice(123);
     *     } else {
     *         memberVendorSynonym.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberVendorSynonym.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberVendorSynonymList.add(memberVendorSynonym);
     * }
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdate</span>(memberVendorSynonymList);
     * </pre>
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MemberVendorSynonym> memberVendorSynonymList) {
        UpdateOption<MemberVendorSynonymCB> option = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberVendorSynonymList, option);
    }

    protected int[] doBatchUpdateNonstrict(List<MemberVendorSynonym> memberVendorSynonymList, UpdateOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonymList", memberVendorSynonymList);
        prepareBatchUpdateOption(memberVendorSynonymList, op);
        return delegateBatchUpdateNonstrict(memberVendorSynonymList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberVendorSynonymList, new SpecifyQuery<MemberVendorSynonymCB>() {
     *     public void specify(MemberVendorSynonymCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberVendorSynonymList, new SpecifyQuery<MemberVendorSynonymCB>() {
     *     public void specify(MemberVendorSynonymCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MemberVendorSynonym> memberVendorSynonymList, SpecifyQuery<MemberVendorSynonymCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(memberVendorSynonymList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MemberVendorSynonym> memberVendorSynonymList) {
        return doBatchDelete(memberVendorSynonymList, null);
    }

    protected int[] doBatchDelete(List<MemberVendorSynonym> memberVendorSynonymList, DeleteOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonymList", memberVendorSynonymList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberVendorSynonymList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MemberVendorSynonym> memberVendorSynonymList) {
        return doBatchDeleteNonstrict(memberVendorSynonymList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MemberVendorSynonym> memberVendorSynonymList, DeleteOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonymList", memberVendorSynonymList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(memberVendorSynonymList, op);
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
     * memberVendorSynonymBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberVendorSynonym, MemberVendorSynonymCB&gt;() {
     *     public ConditionBean setup(memberVendorSynonym entity, MemberVendorSynonymCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MemberVendorSynonym, MemberVendorSynonymCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MemberVendorSynonym, MemberVendorSynonymCB> sp, InsertOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        MemberVendorSynonym e = new MemberVendorSynonym();
        MemberVendorSynonymCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MemberVendorSynonymCB createCBForQueryInsert() {
        MemberVendorSynonymCB cb = newMyConditionBean();
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setPK...(value);</span>
     * memberVendorSynonym.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * memberVendorSynonymBhv.<span style="color: #DD4747">queryUpdate</span>(memberVendorSynonym, cb);
     * </pre>
     * @param memberVendorSynonym The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberVendorSynonym memberVendorSynonym, MemberVendorSynonymCB cb) {
        return doQueryUpdate(memberVendorSynonym, cb, null);
    }

    protected int doQueryUpdate(MemberVendorSynonym memberVendorSynonym, MemberVendorSynonymCB cb, UpdateOption<MemberVendorSynonymCB> op) {
        assertObjectNotNull("memberVendorSynonym", memberVendorSynonym); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(memberVendorSynonym, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MemberVendorSynonymCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MemberVendorSynonymCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * memberVendorSynonymBhv.<span style="color: #DD4747">queryDelete</span>(memberVendorSynonym, cb);
     * </pre>
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberVendorSynonymCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MemberVendorSynonymCB cb, DeleteOption<MemberVendorSynonymCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MemberVendorSynonymCB)cb); }
        else { return varyingQueryDelete((MemberVendorSynonymCB)cb, downcast(op)); }
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberVendorSynonym.setFoo...(value);
     * memberVendorSynonym.setBar...(value);
     * InsertOption<MemberVendorSynonymCB> option = new InsertOption<MemberVendorSynonymCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberVendorSynonymBhv.<span style="color: #DD4747">varyingInsert</span>(memberVendorSynonym, option);
     * ... = memberVendorSynonym.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberVendorSynonym The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MemberVendorSynonym memberVendorSynonym, InsertOption<MemberVendorSynonymCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberVendorSynonym, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberVendorSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberVendorSynonym.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberVendorSynonymCB&gt; option = new UpdateOption&lt;MemberVendorSynonymCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberVendorSynonymCB&gt;() {
     *         public void specify(MemberVendorSynonymCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberVendorSynonymBhv.<span style="color: #DD4747">varyingUpdate</span>(memberVendorSynonym, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberVendorSynonym The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MemberVendorSynonym memberVendorSynonym, UpdateOption<MemberVendorSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberVendorSynonym, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * memberVendorSynonym.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberVendorSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * UpdateOption&lt;MemberVendorSynonymCB&gt; option = new UpdateOption&lt;MemberVendorSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberVendorSynonymCB&gt;() {
     *     public void specify(MemberVendorSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(memberVendorSynonym, option);
     * </pre>
     * @param memberVendorSynonym The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MemberVendorSynonym memberVendorSynonym, UpdateOption<MemberVendorSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(memberVendorSynonym, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberVendorSynonym The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MemberVendorSynonym memberVendorSynonym, InsertOption<MemberVendorSynonymCB> insertOption, UpdateOption<MemberVendorSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberVendorSynonym, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberVendorSynonym The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MemberVendorSynonym memberVendorSynonym, InsertOption<MemberVendorSynonymCB> insertOption, UpdateOption<MemberVendorSynonymCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(memberVendorSynonym, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberVendorSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MemberVendorSynonym memberVendorSynonym, DeleteOption<MemberVendorSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberVendorSynonym, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberVendorSynonym The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MemberVendorSynonym memberVendorSynonym, DeleteOption<MemberVendorSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(memberVendorSynonym, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MemberVendorSynonym> memberVendorSynonymList, InsertOption<MemberVendorSynonymCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberVendorSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MemberVendorSynonym> memberVendorSynonymList, UpdateOption<MemberVendorSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberVendorSynonymList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MemberVendorSynonym> memberVendorSynonymList, UpdateOption<MemberVendorSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberVendorSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MemberVendorSynonym> memberVendorSynonymList, DeleteOption<MemberVendorSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberVendorSynonymList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberVendorSynonymList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MemberVendorSynonym> memberVendorSynonymList, DeleteOption<MemberVendorSynonymCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberVendorSynonymList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MemberVendorSynonym, MemberVendorSynonymCB> setupper, InsertOption<MemberVendorSynonymCB> option) {
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
     * MemberVendorSynonym memberVendorSynonym = new MemberVendorSynonym();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setPK...(value);</span>
     * memberVendorSynonym.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberVendorSynonym.setVersionNo(value);</span>
     * MemberVendorSynonymCB cb = new MemberVendorSynonymCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberVendorSynonymCB&gt; option = new UpdateOption&lt;MemberVendorSynonymCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberVendorSynonymCB&gt;() {
     *     public void specify(MemberVendorSynonymCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberVendorSynonymBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(memberVendorSynonym, cb, option);
     * </pre>
     * @param memberVendorSynonym The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberVendorSynonym memberVendorSynonym, MemberVendorSynonymCB cb, UpdateOption<MemberVendorSynonymCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberVendorSynonym, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MemberVendorSynonym. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberVendorSynonymCB cb, DeleteOption<MemberVendorSynonymCB> option) {
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
    public OutsideSqlBasicExecutor<MemberVendorSynonymBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MemberVendorSynonymCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MemberVendorSynonymCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MemberVendorSynonym> void delegateSelectCursor(MemberVendorSynonymCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends MemberVendorSynonym> List<ENTITY> delegateSelectList(MemberVendorSynonymCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MemberVendorSynonym et, InsertOption<MemberVendorSynonymCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(MemberVendorSynonym et, UpdateOption<MemberVendorSynonymCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected int delegateUpdateNonstrict(MemberVendorSynonym et, UpdateOption<MemberVendorSynonymCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(MemberVendorSynonym et, DeleteOption<MemberVendorSynonymCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected int delegateDeleteNonstrict(MemberVendorSynonym et, DeleteOption<MemberVendorSynonymCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<MemberVendorSynonym> ls, InsertOption<MemberVendorSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MemberVendorSynonym> ls, UpdateOption<MemberVendorSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MemberVendorSynonym> ls, UpdateOption<MemberVendorSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MemberVendorSynonym> ls, DeleteOption<MemberVendorSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MemberVendorSynonym> ls, DeleteOption<MemberVendorSynonymCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MemberVendorSynonym et, MemberVendorSynonymCB inCB, ConditionBean resCB, InsertOption<MemberVendorSynonymCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MemberVendorSynonym et, MemberVendorSynonymCB cb, UpdateOption<MemberVendorSynonymCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MemberVendorSynonymCB cb, DeleteOption<MemberVendorSynonymCB> op)
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
    protected MemberVendorSynonym downcast(Entity et) {
        return helpEntityDowncastInternally(et, MemberVendorSynonym.class);
    }

    protected MemberVendorSynonymCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MemberVendorSynonymCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MemberVendorSynonym> downcast(List<? extends Entity> ls) {
        return (List<MemberVendorSynonym>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MemberVendorSynonymCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MemberVendorSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MemberVendorSynonymCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MemberVendorSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MemberVendorSynonymCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MemberVendorSynonymCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MemberVendorSynonym, MemberVendorSynonymCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<MemberVendorSynonym, MemberVendorSynonymCB>)sp;
    }
}
