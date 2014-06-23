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
 * The behavior of white_xls_man as TABLE. <br />
 * <pre>
 * [primary key]
 *     xls_man_id
 *
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsManBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_xls_man"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return WhiteXlsManDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteXlsManDbm getMyDBMeta() { return WhiteXlsManDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteXlsMan newEntity() { return new WhiteXlsMan(); }

    /** {@inheritDoc} */
    public WhiteXlsManCB newConditionBean() { return new WhiteXlsManCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteXlsMan newMyEntity() { return new WhiteXlsMan(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteXlsManCB newMyConditionBean() { return new WhiteXlsManCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * int count = whiteXlsManBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteXlsManCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(WhiteXlsManCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteXlsManCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteXlsManCB cb) { // called by selectPage(cb)
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
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * WhiteXlsMan whiteXlsMan = whiteXlsManBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteXlsMan != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteXlsMan.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectEntity(WhiteXlsManCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteXlsMan facadeSelectEntity(WhiteXlsManCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectEntity(WhiteXlsManCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends WhiteXlsMan> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteXlsManCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * WhiteXlsMan whiteXlsMan = whiteXlsManBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteXlsMan.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectEntityWithDeletedCheck(WhiteXlsManCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected WhiteXlsMan facadeSelectEntityWithDeletedCheck(WhiteXlsManCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectEntityWithDeletedCheck(WhiteXlsManCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param xlsManId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectByPKValue(Long xlsManId) {
        return facadeSelectByPKValue(xlsManId);
    }

    protected WhiteXlsMan facadeSelectByPKValue(Long xlsManId) {
        return doSelectByPK(xlsManId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectByPK(Long xlsManId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(xlsManId), tp);
    }

    protected <ENTITY extends WhiteXlsMan> OptionalEntity<ENTITY> doSelectOptionalByPK(Long xlsManId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(xlsManId, tp), xlsManId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param xlsManId : PK, NotNull, int8(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteXlsMan selectByPKValueWithDeletedCheck(Long xlsManId) {
        return doSelectByPKWithDeletedCheck(xlsManId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> ENTITY doSelectByPKWithDeletedCheck(Long xlsManId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(xlsManId), tp);
    }

    protected WhiteXlsManCB xprepareCBAsPK(Long xlsManId) {
        assertObjectNotNull("xlsManId", xlsManId);
        return newConditionBean().acceptPK(xlsManId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteXlsMan&gt; whiteXlsManList = whiteXlsManBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteXlsMan whiteXlsMan : whiteXlsManList) {
     *     ... = whiteXlsMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteXlsMan> selectList(WhiteXlsManCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<WhiteXlsMan> facadeSelectList(WhiteXlsManCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> ListResultBean<ENTITY> doSelectList(WhiteXlsManCB cb, Class<ENTITY> tp) {
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
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteXlsMan&gt; page = whiteXlsManBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteXlsMan whiteXlsMan : page) {
     *     ... = whiteXlsMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteXlsMan> selectPage(WhiteXlsManCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<WhiteXlsMan> facadeSelectPage(WhiteXlsManCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> PagingResultBean<ENTITY> doSelectPage(WhiteXlsManCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteXlsMan&gt;() {
     *     public void handle(WhiteXlsMan entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteXlsMan. (NotNull)
     */
    public void selectCursor(WhiteXlsManCB cb, EntityRowHandler<WhiteXlsMan> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(WhiteXlsManCB cb, EntityRowHandler<WhiteXlsMan> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteXlsMan> void doSelectCursor(WhiteXlsManCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * whiteXlsManBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteXlsManCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteXlsManCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<WhiteXlsManCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends WhiteXlsManCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param whiteXlsManList The entity list of whiteXlsMan. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteXlsMan> whiteXlsManList, ReferrerLoaderHandler<LoaderOfWhiteXlsMan> handler) {
        xassLRArg(whiteXlsManList, handler);
        handler.handle(new LoaderOfWhiteXlsMan().ready(whiteXlsManList, _behaviorSelector));
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
     * @param whiteXlsMan The entity of whiteXlsMan. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteXlsMan whiteXlsMan, ReferrerLoaderHandler<LoaderOfWhiteXlsMan> handler) {
        xassLRArg(whiteXlsMan, handler);
        handler.handle(new LoaderOfWhiteXlsMan().ready(xnewLRAryLs(whiteXlsMan), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key xlsManId.
     * @param whiteXlsManList The list of whiteXlsMan. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractXlsManIdList(List<WhiteXlsMan> whiteXlsManList)
    { return helpExtractListInternally(whiteXlsManList, "xlsManId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteXlsMan.setFoo...(value);
     * whiteXlsMan.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * whiteXlsManBhv.<span style="color: #DD4747">insert</span>(whiteXlsMan);
     * ... = whiteXlsMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteXlsMan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteXlsMan whiteXlsMan) {
        doInsert(whiteXlsMan, null);
    }

    protected void doInsert(WhiteXlsMan et, InsertOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsMan", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteXlsManCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteXlsMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteXlsMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteXlsManBhv.<span style="color: #DD4747">update</span>(whiteXlsMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteXlsMan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WhiteXlsMan whiteXlsMan) {
        doUpdate(whiteXlsMan, null);
    }

    protected void doUpdate(WhiteXlsMan et, UpdateOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsMan", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<WhiteXlsManCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected WhiteXlsManCB createCBForVaryingUpdate()
    { WhiteXlsManCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected WhiteXlsManCB createCBForSpecifiedUpdate()
    { WhiteXlsManCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteXlsMan The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteXlsMan whiteXlsMan) {
        doInsertOrUpdate(whiteXlsMan, null, null);
    }

    protected void doInsertOrUpdate(WhiteXlsMan et, InsertOption<WhiteXlsManCB> iop, UpdateOption<WhiteXlsManCB> uop) {
        assertObjectNotNull("whiteXlsMan", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteXlsMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     whiteXlsManBhv.<span style="color: #DD4747">delete</span>(whiteXlsMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteXlsMan The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteXlsMan whiteXlsMan) {
        doDelete(whiteXlsMan, null);
    }

    protected void doDelete(WhiteXlsMan et, final DeleteOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsMan", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<WhiteXlsManCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) { doDelete(downcast(et), downcast(op)); }

    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op)
    { doRemove(et, op); }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     *     whiteXlsMan.setFooName("foo");
     *     if (...) {
     *         whiteXlsMan.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteXlsManList.add(whiteXlsMan);
     * }
     * whiteXlsManBhv.<span style="color: #DD4747">batchInsert</span>(whiteXlsManList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteXlsMan> whiteXlsManList) {
        return doBatchInsert(whiteXlsManList, null);
    }

    protected int[] doBatchInsert(List<WhiteXlsMan> ls, InsertOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsManList", ls);
        InsertOption<WhiteXlsManCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<WhiteXlsMan> ls, InsertOption<WhiteXlsManCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) { return doBatchInsert(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     *     whiteXlsMan.setFooName("foo");
     *     if (...) {
     *         whiteXlsMan.setFooPrice(123);
     *     } else {
     *         whiteXlsMan.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteXlsMan.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteXlsManList.add(whiteXlsMan);
     * }
     * whiteXlsManBhv.<span style="color: #DD4747">batchUpdate</span>(whiteXlsManList);
     * </pre>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteXlsMan> whiteXlsManList) {
        return doBatchUpdate(whiteXlsManList, null);
    }

    protected int[] doBatchUpdate(List<WhiteXlsMan> ls, UpdateOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsManList", ls);
        UpdateOption<WhiteXlsManCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<WhiteXlsMan> ls, UpdateOption<WhiteXlsManCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * whiteXlsManBhv.<span style="color: #DD4747">batchUpdate</span>(whiteXlsManList, new SpecifyQuery<WhiteXlsManCB>() {
     *     public void specify(WhiteXlsManCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteXlsManBhv.<span style="color: #DD4747">batchUpdate</span>(whiteXlsManList, new SpecifyQuery<WhiteXlsManCB>() {
     *     public void specify(WhiteXlsManCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteXlsMan> whiteXlsManList, SpecifyQuery<WhiteXlsManCB> updateColumnSpec) {
        return doBatchUpdate(whiteXlsManList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteXlsMan> whiteXlsManList) {
        return doBatchDelete(whiteXlsManList, null);
    }

    protected int[] doBatchDelete(List<WhiteXlsMan> ls, DeleteOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsManList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) { return doBatchDelete(downcast(ls), downcast(op)); }

    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op)
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteXlsManBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteXlsMan, WhiteXlsManCB&gt;() {
     *     public ConditionBean setup(whiteXlsMan entity, WhiteXlsManCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> sp, InsertOption<WhiteXlsManCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        WhiteXlsMan et = newEntity(); WhiteXlsManCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected WhiteXlsManCB createCBForQueryInsert()
    { WhiteXlsManCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setPK...(value);</span>
     * whiteXlsMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setVersionNo(value);</span>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #DD4747">queryUpdate</span>(whiteXlsMan, cb);
     * </pre>
     * @param whiteXlsMan The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteXlsMan whiteXlsMan, WhiteXlsManCB cb) {
        return doQueryUpdate(whiteXlsMan, cb, null);
    }

    protected int doQueryUpdate(WhiteXlsMan et, WhiteXlsManCB cb, UpdateOption<WhiteXlsManCB> op) {
        assertObjectNotNull("whiteXlsMan", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * whiteXlsManBhv.<span style="color: #DD4747">queryDelete</span>(whiteXlsMan, cb);
     * </pre>
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteXlsManCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteXlsManCB cb, DeleteOption<WhiteXlsManCB> op) {
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteXlsMan.setFoo...(value);
     * whiteXlsMan.setBar...(value);
     * InsertOption<WhiteXlsManCB> option = new InsertOption<WhiteXlsManCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteXlsManBhv.<span style="color: #DD4747">varyingInsert</span>(whiteXlsMan, option);
     * ... = whiteXlsMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteXlsMan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteXlsMan whiteXlsMan, InsertOption<WhiteXlsManCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteXlsMan, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * whiteXlsMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteXlsMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteXlsMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteXlsManCB&gt; option = new UpdateOption&lt;WhiteXlsManCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteXlsManCB&gt;() {
     *         public void specify(WhiteXlsManCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteXlsManBhv.<span style="color: #DD4747">varyingUpdate</span>(whiteXlsMan, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteXlsMan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteXlsMan whiteXlsMan, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteXlsMan, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteXlsMan The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteXlsMan whiteXlsMan, InsertOption<WhiteXlsManCB> insertOption, UpdateOption<WhiteXlsManCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(whiteXlsMan, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteXlsMan The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteXlsMan whiteXlsMan, DeleteOption<WhiteXlsManCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteXlsMan, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteXlsMan> whiteXlsManList, InsertOption<WhiteXlsManCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteXlsManList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteXlsMan> whiteXlsManList, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteXlsManList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteXlsManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteXlsMan> whiteXlsManList, DeleteOption<WhiteXlsManCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteXlsManList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> setupper, InsertOption<WhiteXlsManCB> option) {
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
     * WhiteXlsMan whiteXlsMan = new WhiteXlsMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setPK...(value);</span>
     * whiteXlsMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteXlsMan.setVersionNo(value);</span>
     * WhiteXlsManCB cb = new WhiteXlsManCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteXlsManCB&gt; option = new UpdateOption&lt;WhiteXlsManCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteXlsManCB&gt;() {
     *     public void specify(WhiteXlsManCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteXlsManBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(whiteXlsMan, cb, option);
     * </pre>
     * @param whiteXlsMan The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteXlsMan whiteXlsMan, WhiteXlsManCB cb, UpdateOption<WhiteXlsManCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteXlsMan, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteXlsMan. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteXlsManCB cb, DeleteOption<WhiteXlsManCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteXlsManBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<WhiteXlsMan> typeOfSelectedEntity() { return WhiteXlsMan.class; }
    protected WhiteXlsMan downcast(Entity et) { return helpEntityDowncastInternally(et, WhiteXlsMan.class); }
    protected WhiteXlsManCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, WhiteXlsManCB.class); }
    @SuppressWarnings("unchecked")
    protected List<WhiteXlsMan> downcast(List<? extends Entity> ls) { return (List<WhiteXlsMan>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteXlsManCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<WhiteXlsManCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteXlsManCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<WhiteXlsManCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteXlsManCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<WhiteXlsManCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<WhiteXlsMan, WhiteXlsManCB>)sp; }
}
