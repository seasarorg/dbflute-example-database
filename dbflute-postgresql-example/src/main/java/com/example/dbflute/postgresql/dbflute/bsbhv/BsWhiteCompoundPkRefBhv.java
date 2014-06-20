package com.example.dbflute.postgresql.dbflute.bsbhv;

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
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.bsbhv.loader.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of white_compound_pk_ref as TABLE. <br />
 * <pre>
 * [primary key]
 *     multiple_first_id, multiple_second_id
 *
 * [column]
 *     multiple_first_id, multiple_second_id, ref_first_id, ref_second_id
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
 *     white_compound_pk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteCompoundPk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_compound_pk_ref"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteCompoundPkRefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteCompoundPkRefDbm getMyDBMeta() { return WhiteCompoundPkRefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteCompoundPkRef newEntity() { return new WhiteCompoundPkRef(); }

    /** {@inheritDoc} */
    public WhiteCompoundPkRefCB newConditionBean() { return new WhiteCompoundPkRefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteCompoundPkRef newMyEntity() { return new WhiteCompoundPkRef(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteCompoundPkRefCB newMyConditionBean() { return new WhiteCompoundPkRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * int count = whiteCompoundPkRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteCompoundPkRefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteCompoundPkRefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteCompoundPkRefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteCompoundPkRefCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return facadeSelectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRef whiteCompoundPkRef = whiteCompoundPkRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteCompoundPkRef != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteCompoundPkRef.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntity(WhiteCompoundPkRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteCompoundPkRef facadeSelectEntity(WhiteCompoundPkRefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectEntity(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends WhiteCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return facadeSelectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * WhiteCompoundPkRef whiteCompoundPkRef = whiteCompoundPkRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteCompoundPkRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectEntityWithDeletedCheck(WhiteCompoundPkRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteCompoundPkRef facadeSelectEntityWithDeletedCheck(WhiteCompoundPkRefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectEntityWithDeletedCheck(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return facadeSelectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param multipleFirstId : PK, NotNull, int4(10). (NotNull)
     * @param multipleSecondId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectByPKValue(Integer multipleFirstId, Integer multipleSecondId) {
        return facadeSelectByPKValue(multipleFirstId, multipleSecondId);
    }

    protected WhiteCompoundPkRef facadeSelectByPKValue(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPK(multipleFirstId, multipleSecondId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectByPK(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(multipleFirstId, multipleSecondId), tp);
    }

    protected <ENTITY extends WhiteCompoundPkRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(multipleFirstId, multipleSecondId, tp), multipleFirstId, multipleSecondId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param multipleFirstId : PK, NotNull, int4(10). (NotNull)
     * @param multipleSecondId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteCompoundPkRef selectByPKValueWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId) {
        return doSelectByPKWithDeletedCheck(multipleFirstId, multipleSecondId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ENTITY doSelectByPKWithDeletedCheck(Integer multipleFirstId, Integer multipleSecondId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(multipleFirstId, multipleSecondId), tp);
    }

    protected WhiteCompoundPkRefCB xprepareCBAsPK(Integer multipleFirstId, Integer multipleSecondId) {
        assertObjectNotNull("multipleFirstId", multipleFirstId);assertObjectNotNull("multipleSecondId", multipleSecondId);
        return newConditionBean().acceptPK(multipleFirstId, multipleSecondId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteCompoundPkRef&gt; whiteCompoundPkRefList = whiteCompoundPkRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteCompoundPkRef whiteCompoundPkRef : whiteCompoundPkRefList) {
     *     ... = whiteCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteCompoundPkRef> selectList(WhiteCompoundPkRefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteCompoundPkRef> facadeSelectList(WhiteCompoundPkRefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> ListResultBean<ENTITY> doSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return facadeSelectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteCompoundPkRef&gt; page = whiteCompoundPkRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteCompoundPkRef whiteCompoundPkRef : page) {
     *     ... = whiteCompoundPkRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteCompoundPkRef> selectPage(WhiteCompoundPkRefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteCompoundPkRef> facadeSelectPage(WhiteCompoundPkRefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> PagingResultBean<ENTITY> doSelectPage(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public int callbackSelectCount(WhiteCompoundPkRefCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return facadeSelectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteCompoundPkRef&gt;() {
     *     public void handle(WhiteCompoundPkRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteCompoundPkRef. (NotNull)
     */
    public void selectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<WhiteCompoundPkRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<WhiteCompoundPkRef> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteCompoundPkRef> void doSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteCompoundPkRefCB>() {
            public void callbackSelectCursor(WhiteCompoundPkRefCB lcb, EntityRowHandler<ENTITY> lhandler, Class<ENTITY> ltp) { delegateSelectCursor(lcb, lhandler, ltp); }
            public List<ENTITY> callbackSelectList(WhiteCompoundPkRefCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteCompoundPkRefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteCompoundPkRefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteCompoundPkRefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        HpSLSExecutor<CB, RESULT> executor = createHpSLSExecutor(); // variable to resolve generic
        return createSLSFunction(cb, tp, executor);
    }

    protected <RESULT> HpSLSFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return facadeScalarSelect(tp);
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
     * @param whiteCompoundPkRefList The entity list of whiteCompoundPkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteCompoundPkRef> whiteCompoundPkRefList, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRef> handler) {
        xassLRArg(whiteCompoundPkRefList, handler);
        handler.handle(new LoaderOfWhiteCompoundPkRef().ready(whiteCompoundPkRefList, _behaviorSelector));
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
     * @param whiteCompoundPkRef The entity of whiteCompoundPkRef. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteCompoundPkRef whiteCompoundPkRef, ReferrerLoaderHandler<LoaderOfWhiteCompoundPkRef> handler) {
        xassLRArg(whiteCompoundPkRef, handler);
        handler.handle(new LoaderOfWhiteCompoundPkRef().ready(xnewLRAryLs(whiteCompoundPkRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'WhiteCompoundPk'.
     * @param whiteCompoundPkRefList The list of whiteCompoundPkRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<WhiteCompoundPk> pulloutWhiteCompoundPk(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return helpPulloutInternally(whiteCompoundPkRefList, new InternalPulloutCallback<WhiteCompoundPkRef, WhiteCompoundPk>() {
            public WhiteCompoundPk getFr(WhiteCompoundPkRef et)
            { return et.getWhiteCompoundPk(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WhiteCompoundPk et, List<WhiteCompoundPkRef> ls)
            { et.setWhiteCompoundPkRefList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">insert</span>(whiteCompoundPkRef);
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteCompoundPkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInsert(whiteCompoundPkRef, null);
    }

    protected void doInsert(WhiteCompoundPkRef et, InsertOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRef", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteCompoundPkRefCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        doInsert(downcast(et), downcast(op));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefBhv.<span style="color: #DD4747">update</span>(whiteCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteCompoundPkRef whiteCompoundPkRef) {
        doUpdate(whiteCompoundPkRef, null);
    }

    protected void doUpdate(WhiteCompoundPkRef et, final UpdateOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRef", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback<WhiteCompoundPkRef>() {
            public int callbackDelegateUpdate(WhiteCompoundPkRef let) { return delegateUpdate(let, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteCompoundPkRefCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteCompoundPkRefCB createCBForVaryingUpdate()
    { WhiteCompoundPkRefCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteCompoundPkRefCB createCBForSpecifiedUpdate()
    { WhiteCompoundPkRefCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        doUpdate(downcast(et), downcast(op));
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteCompoundPkRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef) {
        doInsertOrUpdate(whiteCompoundPkRef, null, null);
    }

    protected void doInsertOrUpdate(WhiteCompoundPkRef et, final InsertOption<WhiteCompoundPkRefCB> iop, final UpdateOption<WhiteCompoundPkRefCB> uop) {
        assertObjectNotNull("whiteCompoundPkRef", et);
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback<WhiteCompoundPkRef, WhiteCompoundPkRefCB>() {
            public void callbackInsert(WhiteCompoundPkRef let) { doInsert(let, iop); }
            public void callbackUpdate(WhiteCompoundPkRef let) { doUpdate(let, uop); }
            public WhiteCompoundPkRefCB callbackNewMyConditionBean() { return newConditionBean(); }
            public int callbackSelectCount(WhiteCompoundPkRefCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteCompoundPkRefBhv.<span style="color: #DD4747">delete</span>(whiteCompoundPkRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteCompoundPkRef whiteCompoundPkRef) {
        doDelete(whiteCompoundPkRef, null);
    }

    protected void doDelete(WhiteCompoundPkRef et, final DeleteOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRef", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback<WhiteCompoundPkRef>() {
            public int callbackDelegateDelete(WhiteCompoundPkRef let) { return delegateDelete(let, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteCompoundPkRefCB> op)
    { if (op != null) { assertDeleteOptionStatus(op); } }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        doDelete(downcast(et), downcast(op));
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">batchInsert</span>(whiteCompoundPkRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchInsert(whiteCompoundPkRefList, null);
    }

    protected int[] doBatchInsert(List<WhiteCompoundPkRef> ls, InsertOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRefList", ls);
        InsertOption<WhiteCompoundPkRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteCompoundPkRef> ls, InsertOption<WhiteCompoundPkRefCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        return doBatchInsert(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     *     whiteCompoundPkRef.setFooName("foo");
     *     if (...) {
     *         whiteCompoundPkRef.setFooPrice(123);
     *     } else {
     *         whiteCompoundPkRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteCompoundPkRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteCompoundPkRefList.add(whiteCompoundPkRef);
     * }
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkRefList);
     * </pre>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchUpdate(whiteCompoundPkRefList, null);
    }

    protected int[] doBatchUpdate(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRefList", ls);
        UpdateOption<WhiteCompoundPkRefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doBatchUpdate(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkRefList, new SpecifyQuery<WhiteCompoundPkRefCB>() {
     *     public void specify(WhiteCompoundPkRefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">batchUpdate</span>(whiteCompoundPkRefList, new SpecifyQuery<WhiteCompoundPkRefCB>() {
     *     public void specify(WhiteCompoundPkRefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, SpecifyQuery<WhiteCompoundPkRefCB> updateColumnSpec) {
        return doBatchUpdate(whiteCompoundPkRefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        return doBatchDelete(whiteCompoundPkRefList, null);
    }

    protected int[] doBatchDelete(List<WhiteCompoundPkRef> ls, DeleteOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRefList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doBatchDelete(downcast(ls), downcast(op));
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
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteCompoundPkRef, WhiteCompoundPkRefCB&gt;() {
     *     public ConditionBean setup(whiteCompoundPkRef entity, WhiteCompoundPkRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> sp, InsertOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteCompoundPkRef et = newEntity();
        WhiteCompoundPkRefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteCompoundPkRefCB createCBForQueryInsert()
    { WhiteCompoundPkRefCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op) {
        return doQueryInsert(downcast(setupper), downcast(op));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">queryUpdate</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb) {
        return doQueryUpdate(whiteCompoundPkRef, cb, null);
    }

    protected int doQueryUpdate(WhiteCompoundPkRef et, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> op) {
        assertObjectNotNull("whiteCompoundPkRef", et); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        return doQueryUpdate(downcast(et), downcast(cb), downcast(op));
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">queryDelete</span>(whiteCompoundPkRef, cb);
     * </pre>
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteCompoundPkRefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        return doQueryDelete(downcast(cb), downcast(op));
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteCompoundPkRef.setFoo...(value);
     * whiteCompoundPkRef.setBar...(value);
     * InsertOption<WhiteCompoundPkRefCB> option = new InsertOption<WhiteCompoundPkRefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">varyingInsert</span>(whiteCompoundPkRef, option);
     * ... = whiteCompoundPkRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteCompoundPkRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteCompoundPkRef whiteCompoundPkRef, InsertOption<WhiteCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteCompoundPkRef, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * whiteCompoundPkRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteCompoundPkRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *         public void specify(WhiteCompoundPkRefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteCompoundPkRefBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteCompoundPkRef, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteCompoundPkRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteCompoundPkRef whiteCompoundPkRef, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteCompoundPkRef, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteCompoundPkRef The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteCompoundPkRef whiteCompoundPkRef, InsertOption<WhiteCompoundPkRefCB> insertOption, UpdateOption<WhiteCompoundPkRefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteCompoundPkRef, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteCompoundPkRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteCompoundPkRef whiteCompoundPkRef, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteCompoundPkRef, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteCompoundPkRef> whiteCompoundPkRefList, InsertOption<WhiteCompoundPkRefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteCompoundPkRefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteCompoundPkRef> whiteCompoundPkRefList, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteCompoundPkRefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteCompoundPkRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteCompoundPkRef> whiteCompoundPkRefList, DeleteOption<WhiteCompoundPkRefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteCompoundPkRefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> setupper, InsertOption<WhiteCompoundPkRefCB> option) {
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
     * WhiteCompoundPkRef whiteCompoundPkRef = new WhiteCompoundPkRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setPK...(value);</span>
     * whiteCompoundPkRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteCompoundPkRef.setVersionNo(value);</span>
     * WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteCompoundPkRefCB&gt; option = new UpdateOption&lt;WhiteCompoundPkRefCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void specify(WhiteCompoundPkRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteCompoundPkRefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteCompoundPkRef, cb, option);
     * </pre>
     * @param whiteCompoundPkRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteCompoundPkRef whiteCompoundPkRef, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteCompoundPkRef, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteCompoundPkRef. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteCompoundPkRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteCompoundPkRefCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteCompoundPkRef> void delegateSelectCursor(WhiteCompoundPkRefCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteCompoundPkRef> List<ENTITY> delegateSelectList(WhiteCompoundPkRefCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteCompoundPkRef et, InsertOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteCompoundPkRef et, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteCompoundPkRef et, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteCompoundPkRef et, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteCompoundPkRef et, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteCompoundPkRef> ls, InsertOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteCompoundPkRef> ls, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteCompoundPkRef> ls, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteCompoundPkRef> ls, DeleteOption<WhiteCompoundPkRefCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteCompoundPkRef et, WhiteCompoundPkRefCB inCB, ConditionBean resCB, InsertOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteCompoundPkRef et, WhiteCompoundPkRefCB cb, UpdateOption<WhiteCompoundPkRefCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteCompoundPkRefCB cb, DeleteOption<WhiteCompoundPkRefCB> op)
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
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteCompoundPkRef> typeOfSelectedEntity()
    { return WhiteCompoundPkRef.class; }

    protected WhiteCompoundPkRef downcast(Entity et)
    { return helpEntityDowncastInternally(et, WhiteCompoundPkRef.class); }

    protected WhiteCompoundPkRefCB downcast(ConditionBean cb)
    { return helpConditionBeanDowncastInternally(cb, WhiteCompoundPkRefCB.class); }

    @SuppressWarnings("unchecked")
    protected List<WhiteCompoundPkRef> downcast(List<? extends Entity> ls)
    { return (List<WhiteCompoundPkRef>)ls; }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteCompoundPkRefCB> downcast(InsertOption<? extends ConditionBean> op)
    { return (InsertOption<WhiteCompoundPkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteCompoundPkRefCB> downcast(UpdateOption<? extends ConditionBean> op)
    { return (UpdateOption<WhiteCompoundPkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteCompoundPkRefCB> downcast(DeleteOption<? extends ConditionBean> op)
    { return (DeleteOption<WhiteCompoundPkRefCB>)op; }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteCompoundPkRef, WhiteCompoundPkRefCB>)sp; }
}
