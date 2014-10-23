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
 * The behavior of SYNONYM_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     EXCEPT_ID
 *
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     SYNONYM_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymRefExceptList
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymExceptBhv extends AbstractBehaviorWritable<SynonymExcept, SynonymExceptCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public SynonymExceptDbm getDBMeta() { return SynonymExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymExceptDbm getMyDBMeta() { return SynonymExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public SynonymExceptCB newConditionBean() { return new SynonymExceptCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymExcept newMyEntity() { return new SynonymExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymExceptCB newMyConditionBean() { return new SynonymExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * int count = synonymExceptBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymExceptCB cb) {
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
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * SynonymExcept synonymExcept = synonymExceptBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymExcept != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectEntity(SynonymExceptCB cb) {
        return facadeSelectEntity(cb);
    }

    protected SynonymExcept facadeSelectEntity(SynonymExceptCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymExcept> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymExceptCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * SynonymExcept synonymExcept = synonymExceptBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectEntityWithDeletedCheck(SynonymExceptCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param exceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectByPKValue(Long exceptId) {
        return facadeSelectByPKValue(exceptId);
    }

    protected SynonymExcept facadeSelectByPKValue(Long exceptId) {
        return doSelectByPK(exceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectByPK(Long exceptId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(exceptId), tp);
    }

    protected <ENTITY extends SynonymExcept> OptionalEntity<ENTITY> doSelectOptionalByPK(Long exceptId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(exceptId, tp), exceptId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param exceptId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectByPKValueWithDeletedCheck(Long exceptId) {
        return doSelectByPKWithDeletedCheck(exceptId, typeOfSelectedEntity());
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectByPKWithDeletedCheck(Long exceptId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(exceptId), tp);
    }

    protected SynonymExceptCB xprepareCBAsPK(Long exceptId) {
        assertObjectNotNull("exceptId", exceptId);
        return newConditionBean().acceptPK(exceptId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymExcept&gt; synonymExceptList = synonymExceptBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymExcept synonymExcept : synonymExceptList) {
     *     ... = synonymExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymExcept> selectList(SynonymExceptCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymExcept&gt; page = synonymExceptBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymExcept synonymExcept : page) {
     *     ... = synonymExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymExcept> selectPage(SynonymExceptCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymExcept&gt;() {
     *     public void handle(SynonymExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymExcept. (NotNull)
     */
    public void selectCursor(SynonymExceptCB cb, EntityRowHandler<SynonymExcept> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymExceptBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<SynonymExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param synonymExceptList The entity list of synonymExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<SynonymExcept> synonymExceptList, ReferrerLoaderHandler<LoaderOfSynonymExcept> handler) {
        xassLRArg(synonymExceptList, handler);
        handler.handle(new LoaderOfSynonymExcept().ready(synonymExceptList, _behaviorSelector));
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
     * @param synonymExcept The entity of synonymExcept. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(SynonymExcept synonymExcept, ReferrerLoaderHandler<LoaderOfSynonymExcept> handler) {
        xassLRArg(synonymExcept, handler);
        handler.handle(new LoaderOfSynonymExcept().ready(xnewLRAryLs(synonymExcept), _behaviorSelector));
    }

    /**
     * Load referrer of synonymRefExceptList by the set-upper of referrer. <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * <pre>
     * synonymExceptBhv.<span style="color: #DD4747">loadSynonymRefExceptList</span>(synonymExceptList, new ConditionBeanSetupper&lt;SynonymRefExceptCB&gt;() {
     *     public void setup(SynonymRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (SynonymExcept synonymExcept : synonymExceptList) {
     *     ... = synonymExcept.<span style="color: #DD4747">getSynonymRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param synonymExceptList The entity list of synonymExcept. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymRefExcept> loadSynonymRefExceptList(List<SynonymExcept> synonymExceptList, ConditionBeanSetupper<SynonymRefExceptCB> setupper) {
        xassLRArg(synonymExceptList, setupper);
        return doLoadSynonymRefExceptList(synonymExceptList, new LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept>().xinit(setupper));
    }

    /**
     * Load referrer of synonymRefExceptList by the set-upper of referrer. <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * <pre>
     * synonymExceptBhv.<span style="color: #DD4747">loadSynonymRefExceptList</span>(synonymExceptList, new ConditionBeanSetupper&lt;SynonymRefExceptCB&gt;() {
     *     public void setup(SynonymRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = synonymExcept.<span style="color: #DD4747">getSynonymRefExceptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param synonymExcept The entity of synonymExcept. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymRefExcept> loadSynonymRefExceptList(SynonymExcept synonymExcept, ConditionBeanSetupper<SynonymRefExceptCB> setupper) {
        xassLRArg(synonymExcept, setupper);
        return doLoadSynonymRefExceptList(xnewLRLs(synonymExcept), new LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param synonymExcept The entity of synonymExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<SynonymRefExcept> loadSynonymRefExceptList(SynonymExcept synonymExcept, LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept> loadReferrerOption) {
        xassLRArg(synonymExcept, loadReferrerOption);
        return loadSynonymRefExceptList(xnewLRLs(synonymExcept), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param synonymExceptList The entity list of synonymExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<SynonymRefExcept> loadSynonymRefExceptList(List<SynonymExcept> synonymExceptList, LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept> loadReferrerOption) {
        xassLRArg(synonymExceptList, loadReferrerOption);
        if (synonymExceptList.isEmpty()) { return (NestedReferrerListGateway<SynonymRefExcept>)EMPTY_NREF_LGWAY; }
        return doLoadSynonymRefExceptList(synonymExceptList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<SynonymRefExcept> doLoadSynonymRefExceptList(List<SynonymExcept> synonymExceptList, LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept> option) {
        return helpLoadReferrerInternally(synonymExceptList, option, "synonymRefExceptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key exceptId.
     * @param synonymExceptList The list of synonymExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractExceptIdList(List<SynonymExcept> synonymExceptList)
    { return helpExtractListInternally(synonymExceptList, "exceptId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymExcept synonymExcept = new SynonymExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymExcept.setFoo...(value);
     * synonymExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymExcept.set...;</span>
     * synonymExceptBhv.<span style="color: #DD4747">insert</span>(synonymExcept);
     * ... = synonymExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymExcept synonymExcept) {
        doInsert(synonymExcept, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymExcept synonymExcept = new SynonymExcept();
     * synonymExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymExceptBhv.<span style="color: #DD4747">update</span>(synonymExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(SynonymExcept synonymExcept) {
        doUpdate(synonymExcept, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param synonymExcept The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymExcept synonymExcept) {
        doInsertOrUpdate(synonymExcept, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SynonymExcept synonymExcept = new SynonymExcept();
     * synonymExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymExceptBhv.<span style="color: #DD4747">delete</span>(synonymExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymExcept synonymExcept) {
        doDelete(synonymExcept, null);
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
     *     SynonymExcept synonymExcept = new SynonymExcept();
     *     synonymExcept.setFooName("foo");
     *     if (...) {
     *         synonymExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymExceptList.add(synonymExcept);
     * }
     * synonymExceptBhv.<span style="color: #DD4747">batchInsert</span>(synonymExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymExcept> synonymExceptList) {
        return doBatchInsert(synonymExceptList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SynonymExcept synonymExcept = new SynonymExcept();
     *     synonymExcept.setFooName("foo");
     *     if (...) {
     *         synonymExcept.setFooPrice(123);
     *     } else {
     *         synonymExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymExceptList.add(synonymExcept);
     * }
     * synonymExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymExceptList);
     * </pre>
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymExcept> synonymExceptList) {
        return doBatchUpdate(synonymExceptList, null);
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * synonymExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymExceptList, new SpecifyQuery<SynonymExceptCB>() {
     *     public void specify(SynonymExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymExceptBhv.<span style="color: #DD4747">batchUpdate</span>(synonymExceptList, new SpecifyQuery<SynonymExceptCB>() {
     *     public void specify(SynonymExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymExcept> synonymExceptList, SpecifyQuery<SynonymExceptCB> updateColumnSpec) {
        return doBatchUpdate(synonymExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymExcept> synonymExceptList) {
        return doBatchDelete(synonymExceptList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * synonymExceptBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymExcept, SynonymExceptCB&gt;() {
     *     public ConditionBean setup(SynonymExcept entity, SynonymExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymExcept, SynonymExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SynonymExcept synonymExcept = new SynonymExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymExcept.setPK...(value);</span>
     * synonymExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymExcept.setVersionNo(value);</span>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #DD4747">queryUpdate</span>(synonymExcept, cb);
     * </pre>
     * @param synonymExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymExcept synonymExcept, SynonymExceptCB cb) {
        return doQueryUpdate(synonymExcept, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #DD4747">queryDelete</span>(synonymExcept, cb);
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymExceptCB cb) {
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
     * SynonymExcept synonymExcept = new SynonymExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymExcept.setFoo...(value);
     * synonymExcept.setBar...(value);
     * InsertOption<SynonymExceptCB> option = new InsertOption<SynonymExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymExceptBhv.<span style="color: #DD4747">varyingInsert</span>(synonymExcept, option);
     * ... = synonymExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymExcept The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymExcept synonymExcept, InsertOption<SynonymExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymExcept synonymExcept = new SynonymExcept();
     * synonymExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * synonymExcept.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymExceptCB&gt; option = new UpdateOption&lt;SynonymExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymExceptCB&gt;() {
     *         public void specify(SynonymExceptCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymExceptBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymExcept synonymExcept, UpdateOption<SynonymExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymExcept The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymExcept synonymExcept, InsertOption<SynonymExceptCB> insertOption, UpdateOption<SynonymExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(synonymExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymExcept The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymExcept synonymExcept, DeleteOption<SynonymExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymExcept> synonymExceptList, InsertOption<SynonymExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymExcept> synonymExceptList, UpdateOption<SynonymExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymExcept> synonymExceptList, DeleteOption<SynonymExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymExcept, SynonymExceptCB> setupper, InsertOption<SynonymExceptCB> option) {
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
     * SynonymExcept synonymExcept = new SynonymExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymExcept.setPK...(value);</span>
     * synonymExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymExcept.setVersionNo(value);</span>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymExceptCB&gt; option = new UpdateOption&lt;SynonymExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymExceptCB&gt;() {
     *     public void specify(SynonymExceptCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymExceptBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymExcept, cb, option);
     * </pre>
     * @param synonymExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymExcept synonymExcept, SynonymExceptCB cb, UpdateOption<SynonymExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymExceptCB cb, DeleteOption<SynonymExceptCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymExceptBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<SynonymExceptBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends SynonymExcept> typeOfSelectedEntity() { return SynonymExcept.class; }
    protected Class<SynonymExcept> typeOfHandlingEntity() { return SynonymExcept.class; }
    protected Class<SynonymExceptCB> typeOfHandlingConditionBean() { return SynonymExceptCB.class; }
}
