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
 * The behavior of vendor_inherit_neko as TABLE. <br />
 * <pre>
 * [primary key]
 *     neko_id
 *
 * [column]
 *     inu_id, inu_name, inu_date, neko_id, neko_name, neko_date
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
public abstract class BsVendorInheritNekoBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "vendor_inherit_neko"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorInheritNekoDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorInheritNekoDbm getMyDBMeta() { return VendorInheritNekoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorInheritNeko newEntity() { return new VendorInheritNeko(); }

    /** {@inheritDoc} */
    public VendorInheritNekoCB newConditionBean() { return new VendorInheritNekoCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorInheritNeko newMyEntity() { return new VendorInheritNeko(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorInheritNekoCB newMyConditionBean() { return new VendorInheritNekoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * int count = vendorInheritNekoBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorInheritNekoCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(VendorInheritNekoCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorInheritNekoCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorInheritNekoCB cb) { // called by selectPage(cb)
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
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorInheritNeko != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorInheritNeko.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntity(VendorInheritNekoCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorInheritNeko facadeSelectEntity(VendorInheritNekoCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ENTITY doSelectEntity(VendorInheritNekoCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends VendorInheritNeko> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorInheritNekoCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorInheritNeko.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntityWithDeletedCheck(VendorInheritNekoCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected VendorInheritNeko facadeSelectEntityWithDeletedCheck(VendorInheritNekoCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ENTITY doSelectEntityWithDeletedCheck(VendorInheritNekoCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param nekoId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectByPKValue(Integer nekoId) {
        return facadeSelectByPKValue(nekoId);
    }

    protected VendorInheritNeko facadeSelectByPKValue(Integer nekoId) {
        return doSelectByPK(nekoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ENTITY doSelectByPK(Integer nekoId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(nekoId), tp);
    }

    protected <ENTITY extends VendorInheritNeko> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer nekoId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(nekoId, tp), nekoId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param nekoId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectByPKValueWithDeletedCheck(Integer nekoId) {
        return doSelectByPKWithDeletedCheck(nekoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ENTITY doSelectByPKWithDeletedCheck(Integer nekoId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(nekoId), tp);
    }

    protected VendorInheritNekoCB xprepareCBAsPK(Integer nekoId) {
        assertObjectNotNull("nekoId", nekoId);
        return newConditionBean().acceptPK(nekoId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorInheritNeko&gt; vendorInheritNekoList = vendorInheritNekoBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorInheritNeko vendorInheritNeko : vendorInheritNekoList) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorInheritNeko> selectList(VendorInheritNekoCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<VendorInheritNeko> facadeSelectList(VendorInheritNekoCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ListResultBean<ENTITY> doSelectList(VendorInheritNekoCB cb, Class<ENTITY> tp) {
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
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorInheritNeko&gt; page = vendorInheritNekoBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorInheritNeko vendorInheritNeko : page) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorInheritNeko> selectPage(VendorInheritNekoCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<VendorInheritNeko> facadeSelectPage(VendorInheritNekoCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> PagingResultBean<ENTITY> doSelectPage(VendorInheritNekoCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorInheritNeko&gt;() {
     *     public void handle(VendorInheritNeko entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorInheritNeko. (NotNull)
     */
    public void selectCursor(VendorInheritNekoCB cb, EntityRowHandler<VendorInheritNeko> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(VendorInheritNekoCB cb, EntityRowHandler<VendorInheritNeko> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> void doSelectCursor(VendorInheritNekoCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * vendorInheritNekoBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorInheritNekoCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorInheritNekoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<VendorInheritNekoCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends VendorInheritNekoCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param vendorInheritNekoList The entity list of vendorInheritNeko. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorInheritNeko> vendorInheritNekoList, ReferrerLoaderHandler<LoaderOfVendorInheritNeko> handler) {
        xassLRArg(vendorInheritNekoList, handler);
        handler.handle(new LoaderOfVendorInheritNeko().ready(vendorInheritNekoList, _behaviorSelector));
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
     * @param vendorInheritNeko The entity of vendorInheritNeko. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorInheritNeko vendorInheritNeko, ReferrerLoaderHandler<LoaderOfVendorInheritNeko> handler) {
        xassLRArg(vendorInheritNeko, handler);
        handler.handle(new LoaderOfVendorInheritNeko().ready(xnewLRAryLs(vendorInheritNeko), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key nekoId.
     * @param vendorInheritNekoList The list of vendorInheritNeko. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractNekoIdList(List<VendorInheritNeko> vendorInheritNekoList)
    { return helpExtractListInternally(vendorInheritNekoList, "nekoId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritNeko.setFoo...(value);
     * vendorInheritNeko.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">insert</span>(vendorInheritNeko);
     * ... = vendorInheritNeko.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorInheritNeko The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorInheritNeko vendorInheritNeko) {
        doInsert(vendorInheritNeko, null);
    }

    protected void doInsert(VendorInheritNeko et, InsertOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNeko", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<VendorInheritNekoCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritNeko.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritNekoBhv.<span style="color: #DD4747">update</span>(vendorInheritNeko);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorInheritNeko vendorInheritNeko) {
        doUpdate(vendorInheritNeko, null);
    }

    protected void doUpdate(VendorInheritNeko et, UpdateOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNeko", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<VendorInheritNekoCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected VendorInheritNekoCB createCBForVaryingUpdate()
    { VendorInheritNekoCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected VendorInheritNekoCB createCBForSpecifiedUpdate()
    { VendorInheritNekoCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorInheritNeko The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorInheritNeko vendorInheritNeko) {
        doInsertOrUpdate(vendorInheritNeko, null, null);
    }

    protected void doInsertOrUpdate(VendorInheritNeko et, InsertOption<VendorInheritNekoCB> iop, UpdateOption<VendorInheritNekoCB> uop) {
        assertObjectNotNull("vendorInheritNeko", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritNekoBhv.<span style="color: #DD4747">delete</span>(vendorInheritNeko);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorInheritNeko vendorInheritNeko) {
        doDelete(vendorInheritNeko, null);
    }

    protected void doDelete(VendorInheritNeko et, final DeleteOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNeko", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<VendorInheritNekoCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     *     vendorInheritNeko.setFooName("foo");
     *     if (...) {
     *         vendorInheritNeko.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorInheritNekoList.add(vendorInheritNeko);
     * }
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchInsert</span>(vendorInheritNekoList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchInsert(vendorInheritNekoList, null);
    }

    protected int[] doBatchInsert(List<VendorInheritNeko> ls, InsertOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNekoList", ls);
        InsertOption<VendorInheritNekoCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<VendorInheritNeko> ls, InsertOption<VendorInheritNekoCB> op) {
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
     *     VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     *     vendorInheritNeko.setFooName("foo");
     *     if (...) {
     *         vendorInheritNeko.setFooPrice(123);
     *     } else {
     *         vendorInheritNeko.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorInheritNeko.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorInheritNekoList.add(vendorInheritNeko);
     * }
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchUpdate</span>(vendorInheritNekoList);
     * </pre>
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchUpdate(vendorInheritNekoList, null);
    }

    protected int[] doBatchUpdate(List<VendorInheritNeko> ls, UpdateOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNekoList", ls);
        UpdateOption<VendorInheritNekoCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<VendorInheritNeko> ls, UpdateOption<VendorInheritNekoCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchUpdate</span>(vendorInheritNekoList, new SpecifyQuery<VendorInheritNekoCB>() {
     *     public void specify(VendorInheritNekoCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchUpdate</span>(vendorInheritNekoList, new SpecifyQuery<VendorInheritNekoCB>() {
     *     public void specify(VendorInheritNekoCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorInheritNeko> vendorInheritNekoList, SpecifyQuery<VendorInheritNekoCB> updateColumnSpec) {
        return doBatchUpdate(vendorInheritNekoList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchDelete(vendorInheritNekoList, null);
    }

    protected int[] doBatchDelete(List<VendorInheritNeko> ls, DeleteOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNekoList", ls);
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
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorInheritNeko, VendorInheritNekoCB&gt;() {
     *     public ConditionBean setup(vendorInheritNeko entity, VendorInheritNekoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> sp, InsertOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        VendorInheritNeko et = newEntity(); VendorInheritNekoCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected VendorInheritNekoCB createCBForQueryInsert()
    { VendorInheritNekoCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryUpdate</span>(vendorInheritNeko, cb);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorInheritNeko vendorInheritNeko, VendorInheritNekoCB cb) {
        return doQueryUpdate(vendorInheritNeko, cb, null);
    }

    protected int doQueryUpdate(VendorInheritNeko et, VendorInheritNekoCB cb, UpdateOption<VendorInheritNekoCB> op) {
        assertObjectNotNull("vendorInheritNeko", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryDelete</span>(vendorInheritNeko, cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorInheritNekoCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorInheritNekoCB cb, DeleteOption<VendorInheritNekoCB> op) {
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
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritNeko.setFoo...(value);
     * vendorInheritNeko.setBar...(value);
     * InsertOption<VendorInheritNekoCB> option = new InsertOption<VendorInheritNekoCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorInheritNekoBhv.<span style="color: #DD4747">varyingInsert</span>(vendorInheritNeko, option);
     * ... = vendorInheritNeko.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorInheritNeko The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorInheritNeko vendorInheritNeko, InsertOption<VendorInheritNekoCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorInheritNeko, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritNeko.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorInheritNekoCB&gt; option = new UpdateOption&lt;VendorInheritNekoCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorInheritNekoCB&gt;() {
     *         public void specify(VendorInheritNekoCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorInheritNekoBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorInheritNeko, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorInheritNeko vendorInheritNeko, UpdateOption<VendorInheritNekoCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorInheritNeko, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorInheritNeko The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorInheritNeko vendorInheritNeko, InsertOption<VendorInheritNekoCB> insertOption, UpdateOption<VendorInheritNekoCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorInheritNeko, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorInheritNeko The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorInheritNeko vendorInheritNeko, DeleteOption<VendorInheritNekoCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorInheritNeko, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorInheritNeko> vendorInheritNekoList, InsertOption<VendorInheritNekoCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorInheritNekoList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorInheritNeko> vendorInheritNekoList, UpdateOption<VendorInheritNekoCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorInheritNekoList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorInheritNeko> vendorInheritNekoList, DeleteOption<VendorInheritNekoCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorInheritNekoList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> setupper, InsertOption<VendorInheritNekoCB> option) {
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
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorInheritNekoCB&gt; option = new UpdateOption&lt;VendorInheritNekoCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void specify(VendorInheritNekoCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorInheritNeko, cb, option);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorInheritNeko vendorInheritNeko, VendorInheritNekoCB cb, UpdateOption<VendorInheritNekoCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorInheritNeko, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorInheritNekoCB cb, DeleteOption<VendorInheritNekoCB> option) {
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
    public OutsideSqlBasicExecutor<VendorInheritNekoBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<VendorInheritNeko> typeOfSelectedEntity() { return VendorInheritNeko.class; }
    protected VendorInheritNeko downcast(Entity et) { return helpEntityDowncastInternally(et, VendorInheritNeko.class); }
    protected VendorInheritNekoCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, VendorInheritNekoCB.class); }
    @SuppressWarnings("unchecked")
    protected List<VendorInheritNeko> downcast(List<? extends Entity> ls) { return (List<VendorInheritNeko>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<VendorInheritNekoCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<VendorInheritNekoCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorInheritNekoCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<VendorInheritNekoCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorInheritNekoCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<VendorInheritNekoCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB>)sp; }
}
