package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
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
 * The behavior of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     
 *
 * [referrer table]
 *     WHITE_UQ_FK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkBhv extends AbstractBehaviorWritable<WhiteUqFk, WhiteUqFkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteUqFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkDbm getMyDBMeta() { return WhiteUqFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteUqFkCB newConditionBean() { return new WhiteUqFkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFk newMyEntity() { return new WhiteUqFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkCB newMyConditionBean() { return new WhiteUqFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkCB cb) {
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
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFk whiteUqFk = whiteUqFkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteUqFk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteUqFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntity(WhiteUqFkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteUqFk facadeSelectEntity(WhiteUqFkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteUqFkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFk whiteUqFk = whiteUqFkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntityWithDeletedCheck(WhiteUqFkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectByPKValue(Long uqFkId) {
        return facadeSelectByPKValue(uqFkId);
    }

    protected WhiteUqFk facadeSelectByPKValue(Long uqFkId) {
        return doSelectByPK(uqFkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectByPK(Long uqFkId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(uqFkId), tp);
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectOptionalByPK(Long uqFkId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(uqFkId, tp), uqFkId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqFkId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectByPKValueWithDeletedCheck(Long uqFkId) {
        return doSelectByPKWithDeletedCheck(uqFkId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectByPKWithDeletedCheck(Long uqFkId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(uqFkId), tp);
    }

    protected WhiteUqFkCB xprepareCBAsPK(Long uqFkId) {
        assertObjectNotNull("uqFkId", uqFkId);
        return newConditionBean().acceptPK(uqFkId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param uqFkCode : UQ, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WhiteUqFk> selectByUniqueOf(String uqFkCode) {
        return facadeSelectByUniqueOf(uqFkCode);
    }

    protected OptionalEntity<WhiteUqFk> facadeSelectByUniqueOf(String uqFkCode) {
        return doSelectByUniqueOf(uqFkCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteUqFk> OptionalEntity<ENTITY> doSelectByUniqueOf(String uqFkCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(uqFkCode), tp), uqFkCode);
    }

    protected WhiteUqFkCB xprepareCBAsUniqueOf(String uqFkCode) {
        assertObjectNotNull("uqFkCode", uqFkCode);
        return newConditionBean().acceptUniqueOf(uqFkCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFk&gt; whiteUqFkList = whiteUqFkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFk> selectList(WhiteUqFkCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFk&gt; page = whiteUqFkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFk whiteUqFk : page) {
     *     ... = whiteUqFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFk> selectPage(WhiteUqFkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFk&gt;() {
     *     public void handle(WhiteUqFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFk. (NotNull)
     */
    public void selectCursor(WhiteUqFkCB cb, EntityRowHandler<WhiteUqFk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteUqFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteUqFk> whiteUqFkList, ReferrerLoaderHandler<LoaderOfWhiteUqFk> handler) {
        xassLRArg(whiteUqFkList, handler);
        handler.handle(new LoaderOfWhiteUqFk().ready(whiteUqFkList, _behaviorSelector));
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
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteUqFk whiteUqFk, ReferrerLoaderHandler<LoaderOfWhiteUqFk> handler) {
        xassLRArg(whiteUqFk, handler);
        handler.handle(new LoaderOfWhiteUqFk().ready(xnewLRAryLs(whiteUqFk), _behaviorSelector));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList by the set-upper of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">loadWhiteUqFkRefByFkToPkIdList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.<span style="color: #DD4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        xassLRArg(whiteUqFkList, setupper);
        return doLoadWhiteUqFkRefByFkToPkIdList(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList by the set-upper of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">loadWhiteUqFkRefByFkToPkIdList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteUqFk.<span style="color: #DD4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        xassLRArg(whiteUqFk, setupper);
        return doLoadWhiteUqFkRefByFkToPkIdList(xnewLRLs(whiteUqFk), new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        return loadWhiteUqFkRefByFkToPkIdList(xnewLRLs(whiteUqFk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return (NestedReferrerListGateway<WhiteUqFkRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteUqFkRefByFkToPkIdList(whiteUqFkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteUqFkRef> doLoadWhiteUqFkRefByFkToPkIdList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> option) {
        return helpLoadReferrerInternally(whiteUqFkList, option, "whiteUqFkRefByFkToPkIdList");
    }

    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList by the set-upper of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">loadWhiteUqFkRefByFkToUqCodeList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.<span style="color: #DD4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        xassLRArg(whiteUqFkList, setupper);
        return doLoadWhiteUqFkRefByFkToUqCodeList(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(setupper));
    }

    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList by the set-upper of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">loadWhiteUqFkRefByFkToUqCodeList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = whiteUqFk.<span style="color: #DD4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> setupper) {
        xassLRArg(whiteUqFk, setupper);
        return doLoadWhiteUqFkRefByFkToUqCodeList(xnewLRLs(whiteUqFk), new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        return loadWhiteUqFkRefByFkToUqCodeList(xnewLRLs(whiteUqFk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return (NestedReferrerListGateway<WhiteUqFkRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteUqFkRefByFkToUqCodeList(whiteUqFkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WhiteUqFkRef> doLoadWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> option) {
        return helpLoadReferrerInternally(whiteUqFkList, option, "whiteUqFkRefByFkToUqCodeList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkId.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkIdList(List<WhiteUqFk> whiteUqFkList)
    { return helpExtractListInternally(whiteUqFkList, "uqFkId"); }

    /**
     * Extract the value list of (single) unique key uqFkCode.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqFkCodeList(List<WhiteUqFk> whiteUqFkList)
    { return helpExtractListInternally(whiteUqFkList, "uqFkCode"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * whiteUqFkBhv.<span style="color: #DD4747">insert</span>(whiteUqFk);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFk whiteUqFk) {
        doInsert(whiteUqFk, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkBhv.<span style="color: #DD4747">update</span>(whiteUqFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteUqFk whiteUqFk) {
        doUpdate(whiteUqFk, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteUqFk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFk whiteUqFk) {
        doInsertOrUpdate(whiteUqFk, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkBhv.<span style="color: #DD4747">delete</span>(whiteUqFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFk whiteUqFk) {
        doDelete(whiteUqFk, null);
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
     *     WhiteUqFk whiteUqFk = new WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     if (...) {
     *         whiteUqFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * whiteUqFkBhv.<span style="color: #DD4747">batchInsert</span>(whiteUqFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFk> whiteUqFkList) {
        return doBatchInsert(whiteUqFkList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteUqFk whiteUqFk = new WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     if (...) {
     *         whiteUqFk.setFooPrice(123);
     *     } else {
     *         whiteUqFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * whiteUqFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkList);
     * </pre>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFk> whiteUqFkList) {
        return doBatchUpdate(whiteUqFkList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteUqFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkList, new SpecifyQuery<WhiteUqFkCB>() {
     *     public void specify(WhiteUqFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteUqFkBhv.<span style="color: #DD4747">batchUpdate</span>(whiteUqFkList, new SpecifyQuery<WhiteUqFkCB>() {
     *     public void specify(WhiteUqFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFk> whiteUqFkList, SpecifyQuery<WhiteUqFkCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFk> whiteUqFkList) {
        return doBatchDelete(whiteUqFkList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteUqFkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFk, WhiteUqFkCB&gt;() {
     *     public ConditionBean setup(WhiteUqFk entity, WhiteUqFkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #DD4747">queryUpdate</span>(whiteUqFk, cb);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb) {
        return doQueryUpdate(whiteUqFk, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #DD4747">queryDelete</span>(whiteUqFk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkCB cb) {
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * InsertOption<WhiteUqFkCB> option = new InsertOption<WhiteUqFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqFkBhv.<span style="color: #DD4747">varyingInsert</span>(whiteUqFk, option);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFk whiteUqFk, InsertOption<WhiteUqFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteUqFk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkCB&gt; option = new UpdateOption&lt;WhiteUqFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *         public void specify(WhiteUqFkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqFkBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteUqFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFk whiteUqFk, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFk The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFk whiteUqFk, InsertOption<WhiteUqFkCB> insertOption, UpdateOption<WhiteUqFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteUqFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqFk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFk whiteUqFk, DeleteOption<WhiteUqFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFk> whiteUqFkList, InsertOption<WhiteUqFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFk> whiteUqFkList, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFk> whiteUqFkList, DeleteOption<WhiteUqFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqFkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> setupper, InsertOption<WhiteUqFkCB> option) {
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkCB&gt; option = new UpdateOption&lt;WhiteUqFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *     public void specify(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteUqFk, cb, option);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkCB cb, DeleteOption<WhiteUqFkCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteUqFk> typeOfSelectedEntity() { return WhiteUqFk.class; }
    protected Class<WhiteUqFk> typeOfHandlingEntity() { return WhiteUqFk.class; }
    protected Class<WhiteUqFkCB> typeOfHandlingConditionBean() { return WhiteUqFkCB.class; }
}
