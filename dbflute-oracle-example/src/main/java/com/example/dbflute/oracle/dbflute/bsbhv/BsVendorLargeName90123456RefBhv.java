package com.example.dbflute.oracle.dbflute.bsbhv;

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
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.bsbhv.loader.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of VENDOR_LARGE_NAME_90123456_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_90123_REF_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_90123_REF_ID, VENDOR_LARGE_NAME_901_REF_NAME, VENDOR_LARGE_NAME_901234567_ID
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
 *     VENDOR_LARGE_NAME_901234567890
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorLargeName901234567890
 *
 * [referrer property]
 *     
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName90123456RefBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_LARGE_NAME_90123456_REF"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() { return VendorLargeName90123456RefDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeName90123456RefDbm getMyDBMeta() { return VendorLargeName90123456RefDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorLargeName90123456Ref newEntity() { return new VendorLargeName90123456Ref(); }

    /** {@inheritDoc} */
    public VendorLargeName90123456RefCB newConditionBean() { return new VendorLargeName90123456RefCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeName90123456Ref newMyEntity() { return new VendorLargeName90123456Ref(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeName90123456RefCB newMyConditionBean() { return new VendorLargeName90123456RefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeName90123456RefCB cb) {
        return facadeSelectCount(cb);
    }

    protected int facadeSelectCount(VendorLargeName90123456RefCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorLargeName90123456RefCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorLargeName90123456RefCB cb) { // called by selectPage(cb)
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
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorLargeName90123456Ref != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorLargeName90123456Ref.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectEntity(VendorLargeName90123456RefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorLargeName90123456Ref facadeSelectEntity(VendorLargeName90123456RefCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectEntity(VendorLargeName90123456RefCB cb, Class<ENTITY> tp) {
        return helpSelectEntityInternally(cb, tp);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorLargeName90123456RefCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeName90123456Ref.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectEntityWithDeletedCheck(VendorLargeName90123456RefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    protected VendorLargeName90123456Ref facadeSelectEntityWithDeletedCheck(VendorLargeName90123456RefCB cb) {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectEntityWithDeletedCheck(VendorLargeName90123456RefCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp);
    }

    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) { return facadeSelectEntityWithDeletedCheck(downcast(cb)); }

    /**
     * Select the entity by the primary-key value.
     * @param vendorLargeName90123RefId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectByPKValue(Long vendorLargeName90123RefId) {
        return facadeSelectByPKValue(vendorLargeName90123RefId);
    }

    protected VendorLargeName90123456Ref facadeSelectByPKValue(Long vendorLargeName90123RefId) {
        return doSelectByPK(vendorLargeName90123RefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectByPK(Long vendorLargeName90123RefId, Class<ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(vendorLargeName90123RefId), tp);
    }

    protected <ENTITY extends VendorLargeName90123456Ref> OptionalEntity<ENTITY> doSelectOptionalByPK(Long vendorLargeName90123RefId, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(vendorLargeName90123RefId, tp), vendorLargeName90123RefId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorLargeName90123RefId : PK, NotNull, NUMBER(16). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName90123456Ref selectByPKValueWithDeletedCheck(Long vendorLargeName90123RefId) {
        return doSelectByPKWithDeletedCheck(vendorLargeName90123RefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ENTITY doSelectByPKWithDeletedCheck(Long vendorLargeName90123RefId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(vendorLargeName90123RefId), tp);
    }

    protected VendorLargeName90123456RefCB xprepareCBAsPK(Long vendorLargeName90123RefId) {
        assertObjectNotNull("vendorLargeName90123RefId", vendorLargeName90123RefId);
        return newConditionBean().acceptPK(vendorLargeName90123RefId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeName90123456Ref&gt; vendorLargeName90123456RefList = vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorLargeName90123456Ref vendorLargeName90123456Ref : vendorLargeName90123456RefList) {
     *     ... = vendorLargeName90123456Ref.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName90123456Ref> selectList(VendorLargeName90123456RefCB cb) {
        return facadeSelectList(cb);
    }

    protected ListResultBean<VendorLargeName90123456Ref> facadeSelectList(VendorLargeName90123456RefCB cb) {
        return doSelectList(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> ListResultBean<ENTITY> doSelectList(VendorLargeName90123456RefCB cb, Class<ENTITY> tp) {
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
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeName90123456Ref&gt; page = vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeName90123456Ref vendorLargeName90123456Ref : page) {
     *     ... = vendorLargeName90123456Ref.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName90123456Ref> selectPage(VendorLargeName90123456RefCB cb) {
        return facadeSelectPage(cb);
    }

    protected PagingResultBean<VendorLargeName90123456Ref> facadeSelectPage(VendorLargeName90123456RefCB cb) {
        return doSelectPage(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> PagingResultBean<ENTITY> doSelectPage(VendorLargeName90123456RefCB cb, Class<ENTITY> tp) {
        return helpSelectPageInternally(cb, tp);
    }

    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) { return facadeSelectPage(downcast(cb)); }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeName90123456Ref&gt;() {
     *     public void handle(VendorLargeName90123456Ref entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeName90123456Ref. (NotNull)
     */
    public void selectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<VendorLargeName90123456Ref> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    protected void facadeSelectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<VendorLargeName90123456Ref> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorLargeName90123456Ref> void doSelectCursor(VendorLargeName90123456RefCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
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
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeName90123456RefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorLargeName90123456RefCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    protected <RESULT> HpSLSFunction<VendorLargeName90123456RefCB, RESULT> facadeScalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected <RESULT, CB extends VendorLargeName90123456RefCB> HpSLSFunction<CB, RESULT> doScalarSelect(final Class<RESULT> tp, final CB cb) {
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
     * @param vendorLargeName90123456RefList The entity list of vendorLargeName90123456Ref. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, ReferrerLoaderHandler<LoaderOfVendorLargeName90123456Ref> handler) {
        xassLRArg(vendorLargeName90123456RefList, handler);
        handler.handle(new LoaderOfVendorLargeName90123456Ref().ready(vendorLargeName90123456RefList, _behaviorSelector));
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
     * @param vendorLargeName90123456Ref The entity of vendorLargeName90123456Ref. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorLargeName90123456Ref vendorLargeName90123456Ref, ReferrerLoaderHandler<LoaderOfVendorLargeName90123456Ref> handler) {
        xassLRArg(vendorLargeName90123456Ref, handler);
        handler.handle(new LoaderOfVendorLargeName90123456Ref().ready(xnewLRAryLs(vendorLargeName90123456Ref), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'VendorLargeName901234567890'.
     * @param vendorLargeName90123456RefList The list of vendorLargeName90123456Ref. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorLargeName901234567890> pulloutVendorLargeName901234567890(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList)
    { return helpPulloutInternally(vendorLargeName90123456RefList, "vendorLargeName901234567890"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorLargeName90123RefId.
     * @param vendorLargeName90123456RefList The list of vendorLargeName90123456Ref. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorLargeName90123RefIdList(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList)
    { return helpExtractListInternally(vendorLargeName90123456RefList, "vendorLargeName90123RefId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName90123456Ref.setFoo...(value);
     * vendorLargeName90123456Ref.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">insert</span>(vendorLargeName90123456Ref);
     * ... = vendorLargeName90123456Ref.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeName90123456Ref The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doInsert(vendorLargeName90123456Ref, null);
    }

    protected void doInsert(VendorLargeName90123456Ref et, InsertOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456Ref", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected void prepareInsertOption(InsertOption<VendorLargeName90123456RefCB> op) {
        if (op == null) { return; } assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) { op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) { doInsert(downcast(et), downcast(op)); }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName90123456Ref.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName90123456RefBhv.<span style="color: #DD4747">update</span>(vendorLargeName90123456Ref);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName90123456Ref The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doUpdate(vendorLargeName90123456Ref, null);
    }

    protected void doUpdate(VendorLargeName90123456Ref et, UpdateOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456Ref", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected void prepareUpdateOption(UpdateOption<VendorLargeName90123456RefCB> op) {
        if (op == null) { return; } assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected VendorLargeName90123456RefCB createCBForVaryingUpdate()
    { VendorLargeName90123456RefCB cb = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected VendorLargeName90123456RefCB createCBForSpecifiedUpdate()
    { VendorLargeName90123456RefCB cb = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) { doUpdate(downcast(et), downcast(op)); }

    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op)
    { doModify(et, op); }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorLargeName90123456Ref The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doInsertOrUpdate(vendorLargeName90123456Ref, null, null);
    }

    protected void doInsertOrUpdate(VendorLargeName90123456Ref et, InsertOption<VendorLargeName90123456RefCB> iop, UpdateOption<VendorLargeName90123456RefCB> uop) {
        assertObjectNotNull("vendorLargeName90123456Ref", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)); }

    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop)
    { doCreateOrModify(et, iop, uop); }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName90123456RefBhv.<span style="color: #DD4747">delete</span>(vendorLargeName90123456Ref);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName90123456Ref The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeName90123456Ref vendorLargeName90123456Ref) {
        doDelete(vendorLargeName90123456Ref, null);
    }

    protected void doDelete(VendorLargeName90123456Ref et, final DeleteOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456Ref", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected void prepareDeleteOption(DeleteOption<VendorLargeName90123456RefCB> op) { if (op != null) { assertDeleteOptionStatus(op); } }

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
     *     VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     *     vendorLargeName90123456Ref.setFooName("foo");
     *     if (...) {
     *         vendorLargeName90123456Ref.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeName90123456RefList.add(vendorLargeName90123456Ref);
     * }
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">batchInsert</span>(vendorLargeName90123456RefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return doBatchInsert(vendorLargeName90123456RefList, null);
    }

    protected int[] doBatchInsert(List<VendorLargeName90123456Ref> ls, InsertOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456RefList", ls);
        InsertOption<VendorLargeName90123456RefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainInsertOption(); }
        prepareBatchInsertOption(ls, rlop); // required
        return delegateBatchInsert(ls, rlop);
    }

    protected void prepareBatchInsertOption(List<VendorLargeName90123456Ref> ls, InsertOption<VendorLargeName90123456RefCB> op) {
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
     *     VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     *     vendorLargeName90123456Ref.setFooName("foo");
     *     if (...) {
     *         vendorLargeName90123456Ref.setFooPrice(123);
     *     } else {
     *         vendorLargeName90123456Ref.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeName90123456RefList.add(vendorLargeName90123456Ref);
     * }
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName90123456RefList);
     * </pre>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return doBatchUpdate(vendorLargeName90123456RefList, null);
    }

    protected int[] doBatchUpdate(List<VendorLargeName90123456Ref> ls, UpdateOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456RefList", ls);
        UpdateOption<VendorLargeName90123456RefCB> rlop; if (op != null) { rlop = op; } else { rlop = createPlainUpdateOption(); }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected void prepareBatchUpdateOption(List<VendorLargeName90123456Ref> ls, UpdateOption<VendorLargeName90123456RefCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) { return doBatchUpdate(downcast(ls), downcast(op)); }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName90123456RefList, new SpecifyQuery<VendorLargeName90123456RefCB>() {
     *     public void specify(VendorLargeName90123456RefCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorLargeName90123456RefList, new SpecifyQuery<VendorLargeName90123456RefCB>() {
     *     public void specify(VendorLargeName90123456RefCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, SpecifyQuery<VendorLargeName90123456RefCB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeName90123456RefList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op)
    { return doLumpModify(ls, op); }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList) {
        return doBatchDelete(vendorLargeName90123456RefList, null);
    }

    protected int[] doBatchDelete(List<VendorLargeName90123456Ref> ls, DeleteOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456RefList", ls);
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
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeName90123456Ref, VendorLargeName90123456RefCB&gt;() {
     *     public ConditionBean setup(vendorLargeName90123456Ref entity, VendorLargeName90123456RefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> sp, InsertOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        VendorLargeName90123456Ref et = newEntity(); VendorLargeName90123456RefCB cb = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected VendorLargeName90123456RefCB createCBForQueryInsert()
    { VendorLargeName90123456RefCB cb = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> op)
    { return doQueryInsert(downcast(setupper), downcast(op)); }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setPK...(value);</span>
     * vendorLargeName90123456Ref.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setVersionNo(value);</span>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">queryUpdate</span>(vendorLargeName90123456Ref, cb);
     * </pre>
     * @param vendorLargeName90123456Ref The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, VendorLargeName90123456RefCB cb) {
        return doQueryUpdate(vendorLargeName90123456Ref, cb, null);
    }

    protected int doQueryUpdate(VendorLargeName90123456Ref et, VendorLargeName90123456RefCB cb, UpdateOption<VendorLargeName90123456RefCB> op) {
        assertObjectNotNull("vendorLargeName90123456Ref", et); assertCBStateValid(cb); prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(et, cb, op) : 0;
    }

    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op)
    { return doQueryUpdate(downcast(et), downcast(cb), downcast(op)); }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">queryDelete</span>(vendorLargeName90123456Ref, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeName90123456RefCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorLargeName90123456RefCB cb, DeleteOption<VendorLargeName90123456RefCB> op) {
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName90123456Ref.setFoo...(value);
     * vendorLargeName90123456Ref.setBar...(value);
     * InsertOption<VendorLargeName90123456RefCB> option = new InsertOption<VendorLargeName90123456RefCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">varyingInsert</span>(vendorLargeName90123456Ref, option);
     * ... = vendorLargeName90123456Ref.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeName90123456Ref The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeName90123456Ref vendorLargeName90123456Ref, InsertOption<VendorLargeName90123456RefCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeName90123456Ref, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * vendorLargeName90123456Ref.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName90123456Ref.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorLargeName90123456Ref.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeName90123456RefCB&gt; option = new UpdateOption&lt;VendorLargeName90123456RefCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *         public void specify(VendorLargeName90123456RefCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeName90123456RefBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorLargeName90123456Ref, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName90123456Ref The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeName90123456Ref, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeName90123456Ref The entity of insert or update. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, InsertOption<VendorLargeName90123456RefCB> insertOption, UpdateOption<VendorLargeName90123456RefCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInsertOrUpdate(vendorLargeName90123456Ref, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeName90123456Ref The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeName90123456Ref vendorLargeName90123456Ref, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeName90123456Ref, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, InsertOption<VendorLargeName90123456RefCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeName90123456RefList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeName90123456RefList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeName90123456RefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeName90123456Ref> vendorLargeName90123456RefList, DeleteOption<VendorLargeName90123456RefCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeName90123456RefList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> setupper, InsertOption<VendorLargeName90123456RefCB> option) {
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
     * VendorLargeName90123456Ref vendorLargeName90123456Ref = new VendorLargeName90123456Ref();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setPK...(value);</span>
     * vendorLargeName90123456Ref.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName90123456Ref.setVersionNo(value);</span>
     * VendorLargeName90123456RefCB cb = new VendorLargeName90123456RefCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeName90123456RefCB&gt; option = new UpdateOption&lt;VendorLargeName90123456RefCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void specify(VendorLargeName90123456RefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeName90123456RefBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorLargeName90123456Ref, cb, option);
     * </pre>
     * @param vendorLargeName90123456Ref The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName90123456Ref vendorLargeName90123456Ref, VendorLargeName90123456RefCB cb, UpdateOption<VendorLargeName90123456RefCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeName90123456Ref, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeName90123456Ref. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeName90123456RefCB cb, DeleteOption<VendorLargeName90123456RefCB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeName90123456RefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Class<VendorLargeName90123456Ref> typeOfSelectedEntity() { return VendorLargeName90123456Ref.class; }
    protected VendorLargeName90123456Ref downcast(Entity et) { return helpEntityDowncastInternally(et, VendorLargeName90123456Ref.class); }
    protected VendorLargeName90123456RefCB downcast(ConditionBean cb) { return helpConditionBeanDowncastInternally(cb, VendorLargeName90123456RefCB.class); }
    @SuppressWarnings("unchecked")
    protected List<VendorLargeName90123456Ref> downcast(List<? extends Entity> ls) { return (List<VendorLargeName90123456Ref>)ls; }
    @SuppressWarnings("unchecked")
    protected InsertOption<VendorLargeName90123456RefCB> downcast(InsertOption<? extends ConditionBean> op) { return (InsertOption<VendorLargeName90123456RefCB>)op; }
    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorLargeName90123456RefCB> downcast(UpdateOption<? extends ConditionBean> op) { return (UpdateOption<VendorLargeName90123456RefCB>)op; }
    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorLargeName90123456RefCB> downcast(DeleteOption<? extends ConditionBean> op) { return (DeleteOption<VendorLargeName90123456RefCB>)op; }
    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp)
    { return (QueryInsertSetupper<VendorLargeName90123456Ref, VendorLargeName90123456RefCB>)sp; }
}
