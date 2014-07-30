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
 * The behavior of vendor_part_man as TABLE. <br />
 * <pre>
 * [primary key]
 *     part_man_id
 *
 * [column]
 *     part_man_id, part_man_name, part_man_point, part_man_date
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
public abstract class BsVendorPartManBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_part_man"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorPartManDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorPartManDbm getMyDBMeta() { return VendorPartManDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorPartMan newEntity() { return new VendorPartMan(); }

    /** {@inheritDoc} */
    public VendorPartManCB newConditionBean() { return new VendorPartManCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorPartMan newMyEntity() { return new VendorPartMan(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorPartManCB newMyConditionBean() { return new VendorPartManCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * int count = vendorPartManBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorPartManCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(VendorPartManCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorPartManCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorPartManCB cb) { // called by selectPage(cb)
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
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * VendorPartMan vendorPartMan = vendorPartManBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorPartMan != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorPartMan.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorPartMan selectEntity(VendorPartManCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorPartMan facadeSelectEntity(VendorPartManCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> ENTITY doSelectEntity(VendorPartManCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends VendorPartMan> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorPartManCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * VendorPartMan vendorPartMan = vendorPartManBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorPartMan.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorPartMan selectEntityWithDeletedCheck(VendorPartManCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected VendorPartMan facadeSelectEntityWithDeletedCheck(VendorPartManCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> ENTITY doSelectEntityWithDeletedCheck(VendorPartManCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param partManId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorPartMan selectByPKValue(Integer partManId) {
        return facadeSelectByPKValue(partManId);
    }

    protected VendorPartMan facadeSelectByPKValue(Integer partManId) {
        return doSelectByPK(partManId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> ENTITY doSelectByPK(Integer partManId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(partManId), tp);
    }

    protected <ENTITY extends VendorPartMan> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer partManId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(partManId, tp), partManId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param partManId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorPartMan selectByPKValueWithDeletedCheck(Integer partManId) {
        return doSelectByPKWithDeletedCheck(partManId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> ENTITY doSelectByPKWithDeletedCheck(Integer partManId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(partManId), tp);
    }

    protected VendorPartManCB xprepareCBAsPK(Integer partManId) {
        assertObjectNotNull("partManId", partManId);
        return newConditionBean().acceptPK(partManId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorPartMan&gt; vendorPartManList = vendorPartManBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorPartMan vendorPartMan : vendorPartManList) {
     *     ... = vendorPartMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorPartMan> selectList(VendorPartManCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<VendorPartMan> facadeSelectList(VendorPartManCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> ListResultBean<ENTITY> doSelectList(VendorPartManCB cb, Class<ENTITY> tp) {
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
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorPartMan&gt; page = vendorPartManBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorPartMan vendorPartMan : page) {
     *     ... = vendorPartMan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorPartMan> selectPage(VendorPartManCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<VendorPartMan> facadeSelectPage(VendorPartManCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> PagingResultBean<ENTITY> doSelectPage(VendorPartManCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * vendorPartManBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorPartMan&gt;() {
     *     public void handle(VendorPartMan entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorPartMan. (NotNull)
     */
    public void selectCursor(VendorPartManCB cb, EntityRowHandler<VendorPartMan> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(VendorPartManCB cb, EntityRowHandler<VendorPartMan> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorPartMan> void doSelectCursor(VendorPartManCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * vendorPartManBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorPartManCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorPartManCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<VendorPartManCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends VendorPartManCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param vendorPartManList The entity list of vendorPartMan. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorPartMan> vendorPartManList, ReferrerLoaderHandler<LoaderOfVendorPartMan> handler) {
        xassLRArg(vendorPartManList, handler);
        handler.handle(new LoaderOfVendorPartMan().ready(vendorPartManList, _behaviorSelector));
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
     * @param vendorPartMan The entity of vendorPartMan. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorPartMan vendorPartMan, ReferrerLoaderHandler<LoaderOfVendorPartMan> handler) {
        xassLRArg(vendorPartMan, handler);
        handler.handle(new LoaderOfVendorPartMan().ready(xnewLRAryLs(vendorPartMan), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key partManId.
     * @param vendorPartManList The list of vendorPartMan. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractPartManIdList(List<VendorPartMan> vendorPartManList)
    { return helpExtractListInternally(vendorPartManList, "partManId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorPartMan.setFoo...(value);
     * vendorPartMan.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPartMan.set...;</span>
     * vendorPartManBhv.<span style="color: #DD4747">insert</span>(vendorPartMan);
     * ... = vendorPartMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorPartMan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorPartMan vendorPartMan) {
        doInsert(vendorPartMan, null);
    }

    protected void doInsert(VendorPartMan et, InsertOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartMan", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<VendorPartManCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * vendorPartMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorPartMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPartMan.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorPartMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorPartManBhv.<span style="color: #DD4747">update</span>(vendorPartMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorPartMan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorPartMan vendorPartMan) {
        doUpdate(vendorPartMan, null);
    }

    protected void doUpdate(VendorPartMan et, UpdateOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartMan", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<VendorPartManCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected VendorPartManCB createCBForVaryingUpdate()
    { VendorPartManCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected VendorPartManCB createCBForSpecifiedUpdate()
    { VendorPartManCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorPartMan The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorPartMan vendorPartMan) {
        doInsertOrUpdate(vendorPartMan, null, null);
    }

    protected void doInsertOrUpdate(VendorPartMan et, InsertOption<VendorPartManCB> iop, UpdateOption<VendorPartManCB> uop) {
        assertObjectNotNull("vendorPartMan", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * vendorPartMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorPartMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorPartManBhv.<span style="color: #DD4747">delete</span>(vendorPartMan);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorPartMan The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorPartMan vendorPartMan) {
        doDelete(vendorPartMan, null);
    }

    protected void doDelete(VendorPartMan et, final DeleteOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartMan", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<VendorPartManCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     VendorPartMan vendorPartMan = new VendorPartMan();
     *     vendorPartMan.setFooName("foo");
     *     if (...) {
     *         vendorPartMan.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorPartManList.add(vendorPartMan);
     * }
     * vendorPartManBhv.<span style="color: #DD4747">batchInsert</span>(vendorPartManList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorPartMan> vendorPartManList) {
        return doBatchInsert(vendorPartManList, null);
    }

    protected int[] doBatchInsert(List<VendorPartMan> ls, InsertOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartManList", ls);
        InsertOption<VendorPartManCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<VendorPartMan> ls, InsertOption<VendorPartManCB> op) {
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
     *     VendorPartMan vendorPartMan = new VendorPartMan();
     *     vendorPartMan.setFooName("foo");
     *     if (...) {
     *         vendorPartMan.setFooPrice(123);
     *     } else {
     *         vendorPartMan.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorPartMan.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorPartManList.add(vendorPartMan);
     * }
     * vendorPartManBhv.<span style="color: #DD4747">batchUpdate</span>(vendorPartManList);
     * </pre>
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorPartMan> vendorPartManList) {
        return doBatchUpdate(vendorPartManList, null);
    }

    protected int[] doBatchUpdate(List<VendorPartMan> ls, UpdateOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartManList", ls);
        UpdateOption<VendorPartManCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<VendorPartMan> ls, UpdateOption<VendorPartManCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorPartManBhv.<span style="color: #DD4747">batchUpdate</span>(vendorPartManList, new SpecifyQuery<VendorPartManCB>() {
     *     public void specify(VendorPartManCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorPartManBhv.<span style="color: #DD4747">batchUpdate</span>(vendorPartManList, new SpecifyQuery<VendorPartManCB>() {
     *     public void specify(VendorPartManCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorPartMan> vendorPartManList, SpecifyQuery<VendorPartManCB> updateColumnSpec) {
        return doBatchUpdate(vendorPartManList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorPartMan> vendorPartManList) {
        return doBatchDelete(vendorPartManList, null);
    }

    protected int[] doBatchDelete(List<VendorPartMan> ls, DeleteOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartManList", ls);
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
     * vendorPartManBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorPartMan, VendorPartManCB&gt;() {
     *     public ConditionBean setup(vendorPartMan entity, VendorPartManCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorPartMan, VendorPartManCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorPartMan, VendorPartManCB> sp, InsertOption<VendorPartManCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        VendorPartMan et = newEntity(); VendorPartManCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected VendorPartManCB createCBForQueryInsert()
    { VendorPartManCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setPK...(value);</span>
     * vendorPartMan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPartMan.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setVersionNo(value);</span>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * vendorPartManBhv.<span style="color: #DD4747">queryUpdate</span>(vendorPartMan, cb);
     * </pre>
     * @param vendorPartMan The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorPartMan vendorPartMan, VendorPartManCB cb) {
        return doQueryUpdate(vendorPartMan, cb, null);
    }

    protected int doQueryUpdate(VendorPartMan et, VendorPartManCB cb, UpdateOption<VendorPartManCB> op) {
        assertObjectNotNull("vendorPartMan", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * vendorPartManBhv.<span style="color: #DD4747">queryDelete</span>(vendorPartMan, cb);
     * </pre>
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorPartManCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorPartManCB cb, DeleteOption<VendorPartManCB> op) {
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
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorPartMan.setFoo...(value);
     * vendorPartMan.setBar...(value);
     * InsertOption<VendorPartManCB> option = new InsertOption<VendorPartManCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorPartManBhv.<span style="color: #DD4747">varyingInsert</span>(vendorPartMan, option);
     * ... = vendorPartMan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorPartMan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorPartMan vendorPartMan, InsertOption<VendorPartManCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorPartMan, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * vendorPartMan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorPartMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorPartMan.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorPartManCB&gt; option = new UpdateOption&lt;VendorPartManCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorPartManCB&gt;() {
     *         public void specify(VendorPartManCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorPartManBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorPartMan, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorPartMan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorPartMan vendorPartMan, UpdateOption<VendorPartManCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorPartMan, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorPartMan The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorPartMan vendorPartMan, InsertOption<VendorPartManCB> insertOption, UpdateOption<VendorPartManCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorPartMan, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorPartMan The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorPartMan vendorPartMan, DeleteOption<VendorPartManCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorPartMan, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorPartMan> vendorPartManList, InsertOption<VendorPartManCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorPartManList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorPartMan> vendorPartManList, UpdateOption<VendorPartManCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorPartManList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorPartManList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorPartMan> vendorPartManList, DeleteOption<VendorPartManCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorPartManList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorPartMan, VendorPartManCB> setupper, InsertOption<VendorPartManCB> option) {
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
     * VendorPartMan vendorPartMan = new VendorPartMan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setPK...(value);</span>
     * vendorPartMan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorPartMan.setVersionNo(value);</span>
     * VendorPartManCB cb = new VendorPartManCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorPartManCB&gt; option = new UpdateOption&lt;VendorPartManCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorPartManCB&gt;() {
     *     public void specify(VendorPartManCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorPartManBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorPartMan, cb, option);
     * </pre>
     * @param vendorPartMan The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorPartMan vendorPartMan, VendorPartManCB cb, UpdateOption<VendorPartManCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorPartMan, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorPartMan. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorPartManCB cb, DeleteOption<VendorPartManCB> option) {
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
    public OutsideSqlBasicExecutor<VendorPartManBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<VendorPartMan> typeOfSelectedEntity() { return VendorPartMan.class; }
    protected VendorPartMan downcast(Entity et) { return helpEntityDowncastInternally(et, VendorPartMan.class); }
    protected VendorPartManCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, VendorPartManCB.class); }
    @SuppressWarnings("unchecked")
    protected List<VendorPartMan> downcast(List<? extends Entity> ls) { return (List<VendorPartMan>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<VendorPartManCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<VendorPartManCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorPartManCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<VendorPartManCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorPartManCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<VendorPartManCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorPartMan, VendorPartManCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<VendorPartMan, VendorPartManCB>)sp; }
}
