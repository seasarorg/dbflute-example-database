package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of VENDOR_LARGE_NAME_901234567890 as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_LARGE_NAME_901234567_ID
 *
 * [column]
 *     VENDOR_LARGE_NAME_901234567_ID, VENDOR_LARGE_NAME_9012345_NAME
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
 *     VENDOR_LARGE_NAME_90123456_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeName90123456RefList
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeName901234567890Bhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR_LARGE_NAME_901234567890"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return VendorLargeName901234567890Dbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public VendorLargeName901234567890Dbm getMyDBMeta() { return VendorLargeName901234567890Dbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public VendorLargeName901234567890 newMyEntity() { return new VendorLargeName901234567890(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public VendorLargeName901234567890CB newMyConditionBean() { return new VendorLargeName901234567890CB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * int count = vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorLargeName901234567890CB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(VendorLargeName901234567890CB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(VendorLargeName901234567890CB cb) { // called by selectPage(cb)
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
     * Select the entity by the condition-bean.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * VendorLargeName901234567890 vendorLargeName901234567890 = vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendorLargeName901234567890 != null) {
     *     ... = vendorLargeName901234567890.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntity(VendorLargeName901234567890CB cb) {
        return doSelectEntity(cb, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectEntity(VendorLargeName901234567890CB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, VendorLargeName901234567890CB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName901234567890CB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * VendorLargeName901234567890 vendorLargeName901234567890 = vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorLargeName901234567890.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectEntityWithDeletedCheck(VendorLargeName901234567890CB cb) {
        return doSelectEntityWithDeletedCheck(cb, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectEntityWithDeletedCheck(VendorLargeName901234567890CB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, VendorLargeName901234567890CB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName901234567890CB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param vendorLargeName901234567Id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectByPKValue(Long vendorLargeName901234567Id) {
        return doSelectByPKValue(vendorLargeName901234567Id, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectByPKValue(Long vendorLargeName901234567Id, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(vendorLargeName901234567Id), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param vendorLargeName901234567Id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorLargeName901234567890 selectByPKValueWithDeletedCheck(Long vendorLargeName901234567Id) {
        return doSelectByPKValueWithDeletedCheck(vendorLargeName901234567Id, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> ENTITY doSelectByPKValueWithDeletedCheck(Long vendorLargeName901234567Id, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(vendorLargeName901234567Id), entityType);
    }

    private VendorLargeName901234567890CB buildPKCB(Long vendorLargeName901234567Id) {
        assertObjectNotNull("vendorLargeName901234567Id", vendorLargeName901234567Id);
        VendorLargeName901234567890CB cb = newMyConditionBean();
        cb.query().setVendorLargeName901234567Id_Equal(vendorLargeName901234567Id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorLargeName901234567890&gt; vendorLargeName901234567890List = vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : vendorLargeName901234567890List) {
     *     ... = vendorLargeName901234567890.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorLargeName901234567890> selectList(VendorLargeName901234567890CB cb) {
        return doSelectList(cb, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> ListResultBean<ENTITY> doSelectList(VendorLargeName901234567890CB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, VendorLargeName901234567890CB>() {
            public List<ENTITY> callbackSelectList(VendorLargeName901234567890CB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorLargeName901234567890&gt; page = vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : page) {
     *     ... = vendorLargeName901234567890.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorLargeName901234567890> selectPage(VendorLargeName901234567890CB cb) {
        return doSelectPage(cb, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> PagingResultBean<ENTITY> doSelectPage(VendorLargeName901234567890CB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, VendorLargeName901234567890CB>() {
            public int callbackSelectCount(VendorLargeName901234567890CB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(VendorLargeName901234567890CB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorLargeName901234567890&gt;() {
     *     public void handle(VendorLargeName901234567890 entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorLargeName901234567890. (NotNull)
     */
    public void selectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<VendorLargeName901234567890> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, VendorLargeName901234567890.class);
    }

    protected <ENTITY extends VendorLargeName901234567890> void doSelectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, VendorLargeName901234567890CB>() {
            public void callbackSelectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(VendorLargeName901234567890CB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorLargeName901234567890CB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<VendorLargeName901234567890CB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends VendorLargeName901234567890CB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends VendorLargeName901234567890CB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeName90123456RefList(VendorLargeName901234567890 vendorLargeName901234567890, ConditionBeanSetupper<VendorLargeName90123456RefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeName901234567890, conditionBeanSetupper);
        loadVendorLargeName90123456RefList(xnewLRLs(vendorLargeName901234567890), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendorLargeName90123456RefList with the set-upper for condition-bean of referrer. <br />
     * VENDOR_LARGE_NAME_90123456_REF by VENDOR_LARGE_NAME_901234567_ID, named 'vendorLargeName90123456RefList'.
     * <pre>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">loadVendorLargeName90123456RefList</span>(vendorLargeName901234567890List, new ConditionBeanSetupper&lt;VendorLargeName90123456RefCB&gt;() {
     *     public void setup(VendorLargeName90123456RefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (VendorLargeName901234567890 vendorLargeName901234567890 : vendorLargeName901234567890List) {
     *     ... = vendorLargeName901234567890.<span style="color: #FD4747">getVendorLargeName90123456RefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setVendorLargeName901234567Id_InScope(pkList);
     * cb.query().addOrderBy_VendorLargeName901234567Id_Asc();
     * </pre>
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendorLargeName90123456RefList(List<VendorLargeName901234567890> vendorLargeName901234567890List, ConditionBeanSetupper<VendorLargeName90123456RefCB> conditionBeanSetupper) {
        xassLRArg(vendorLargeName901234567890List, conditionBeanSetupper);
        loadVendorLargeName90123456RefList(vendorLargeName901234567890List, new LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendorLargeName901234567890 The entity of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeName90123456RefList(VendorLargeName901234567890 vendorLargeName901234567890, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890, loadReferrerOption);
        loadVendorLargeName90123456RefList(xnewLRLs(vendorLargeName901234567890), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendorLargeName901234567890List The entity list of vendorLargeName901234567890. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendorLargeName90123456RefList(List<VendorLargeName901234567890> vendorLargeName901234567890List, LoadReferrerOption<VendorLargeName90123456RefCB, VendorLargeName90123456Ref> loadReferrerOption) {
        xassLRArg(vendorLargeName901234567890List, loadReferrerOption);
        if (vendorLargeName901234567890List.isEmpty()) { return; }
        final VendorLargeName90123456RefBhv referrerBhv = xgetBSFLR().select(VendorLargeName90123456RefBhv.class);
        helpLoadReferrerInternally(vendorLargeName901234567890List, loadReferrerOption, new InternalLoadReferrerCallback<VendorLargeName901234567890, Long, VendorLargeName90123456RefCB, VendorLargeName90123456Ref>() {
            public Long getPKVal(VendorLargeName901234567890 et)
            { return et.getVendorLargeName901234567Id(); }
            public void setRfLs(VendorLargeName901234567890 et, List<VendorLargeName90123456Ref> ls)
            { et.setVendorLargeName90123456RefList(ls); }
            public VendorLargeName90123456RefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(VendorLargeName90123456RefCB cb, List<Long> ls)
            { cb.query().setVendorLargeName901234567Id_InScope(ls); }
            public void qyOdFKAsc(VendorLargeName90123456RefCB cb) { cb.query().addOrderBy_VendorLargeName901234567Id_Asc(); }
            public void spFKCol(VendorLargeName90123456RefCB cb) { cb.specify().columnVendorLargeName901234567Id(); }
            public List<VendorLargeName90123456Ref> selRfLs(VendorLargeName90123456RefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(VendorLargeName90123456Ref re) { return re.getVendorLargeName901234567Id(); }
            public void setlcEt(VendorLargeName90123456Ref re, VendorLargeName901234567890 le)
            { re.setVendorLargeName901234567890(le); }
            public String getRfPrNm() { return "vendorLargeName90123456RefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key vendorLargeName901234567Id.
     * @param vendorLargeName901234567890List The list of vendorLargeName901234567890. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractVendorLargeName901234567IdList(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return helpExtractListInternally(vendorLargeName901234567890List, new InternalExtractCallback<VendorLargeName901234567890, Long>() {
            public Long getCV(VendorLargeName901234567890 et) { return et.getVendorLargeName901234567Id(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">insert</span>(vendorLargeName901234567890);
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorLargeName901234567890 The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInsert(vendorLargeName901234567890, null);
    }

    protected void doInsert(VendorLargeName901234567890 vendorLargeName901234567890, InsertOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890", vendorLargeName901234567890);
        prepareInsertOption(op);
        delegateInsert(vendorLargeName901234567890, op);
    }

    protected void prepareInsertOption(InsertOption<VendorLargeName901234567890CB> op) {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName901234567890.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName901234567890Bhv.<span style="color: #FD4747">update</span>(vendorLargeName901234567890);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final VendorLargeName901234567890 vendorLargeName901234567890) {
        doUpdate(vendorLargeName901234567890, null);
    }

    protected void doUpdate(VendorLargeName901234567890 vendorLargeName901234567890, final UpdateOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890", vendorLargeName901234567890);
        prepareUpdateOption(op);
        helpUpdateInternally(vendorLargeName901234567890, new InternalUpdateCallback<VendorLargeName901234567890>() {
            public int callbackDelegateUpdate(VendorLargeName901234567890 et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<VendorLargeName901234567890CB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected VendorLargeName901234567890CB createCBForVaryingUpdate() {
        VendorLargeName901234567890CB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected VendorLargeName901234567890CB createCBForSpecifiedUpdate() {
        VendorLargeName901234567890CB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorLargeName901234567890 The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890) {
        doInesrtOrUpdate(vendorLargeName901234567890, null, null);
    }

    protected void doInesrtOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890, final InsertOption<VendorLargeName901234567890CB> iop, final UpdateOption<VendorLargeName901234567890CB> uop) {
        helpInsertOrUpdateInternally(vendorLargeName901234567890, new InternalInsertOrUpdateCallback<VendorLargeName901234567890, VendorLargeName901234567890CB>() {
            public void callbackInsert(VendorLargeName901234567890 et) { doInsert(et, iop); }
            public void callbackUpdate(VendorLargeName901234567890 et) { doUpdate(et, uop); }
            public VendorLargeName901234567890CB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(VendorLargeName901234567890CB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<VendorLargeName901234567890CB>();
            uop = uop != null ? uop : new UpdateOption<VendorLargeName901234567890CB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName901234567890.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendorLargeName901234567890Bhv.<span style="color: #FD4747">delete</span>(vendorLargeName901234567890);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorLargeName901234567890 vendorLargeName901234567890) {
        doDelete(vendorLargeName901234567890, null);
    }

    protected void doDelete(VendorLargeName901234567890 vendorLargeName901234567890, final DeleteOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890", vendorLargeName901234567890);
        prepareDeleteOption(op);
        helpDeleteInternally(vendorLargeName901234567890, new InternalDeleteCallback<VendorLargeName901234567890>() {
            public int callbackDelegateDelete(VendorLargeName901234567890 et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<VendorLargeName901234567890CB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
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
     * <p><span style="color: #FD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     if (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">batchInsert</span>(vendorLargeName901234567890List);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        InsertOption<VendorLargeName901234567890CB> op = createInsertUpdateOption();
        return doBatchInsert(vendorLargeName901234567890List, op);
    }

    protected int[] doBatchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List, InsertOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890List", vendorLargeName901234567890List);
        prepareBatchInsertOption(vendorLargeName901234567890List, op);
        return delegateBatchInsert(vendorLargeName901234567890List, op);
    }

    protected void prepareBatchInsertOption(List<VendorLargeName901234567890> vendorLargeName901234567890List, InsertOption<VendorLargeName901234567890CB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendorLargeName901234567890List);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     *     vendorLargeName901234567890.setFooName("foo");
     *     if (...) {
     *         vendorLargeName901234567890.setFooPrice(123);
     *     } else {
     *         vendorLargeName901234567890.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorLargeName901234567890.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorLargeName901234567890List.add(vendorLargeName901234567890);
     * }
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName901234567890List);
     * </pre>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        UpdateOption<VendorLargeName901234567890CB> op = createPlainUpdateOption();
        return doBatchUpdate(vendorLargeName901234567890List, op);
    }

    protected int[] doBatchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, UpdateOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890List", vendorLargeName901234567890List);
        prepareBatchUpdateOption(vendorLargeName901234567890List, op);
        return delegateBatchUpdate(vendorLargeName901234567890List, op);
    }

    protected void prepareBatchUpdateOption(List<VendorLargeName901234567890> vendorLargeName901234567890List, UpdateOption<VendorLargeName901234567890CB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendorLargeName901234567890List);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName901234567890List, new SpecifyQuery<VendorLargeName901234567890CB>() {
     *     public void specify(VendorLargeName901234567890CB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">batchUpdate</span>(vendorLargeName901234567890List, new SpecifyQuery<VendorLargeName901234567890CB>() {
     *     public void specify(VendorLargeName901234567890CB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, SpecifyQuery<VendorLargeName901234567890CB> updateColumnSpec) {
        return doBatchUpdate(vendorLargeName901234567890List, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List) {
        return doBatchDelete(vendorLargeName901234567890List, null);
    }

    protected int[] doBatchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List, DeleteOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890List", vendorLargeName901234567890List);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendorLargeName901234567890List, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
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
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorLargeName901234567890, VendorLargeName901234567890CB&gt;() {
     *     public ConditionBean setup(vendorLargeName901234567890 entity, VendorLargeName901234567890CB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> sp, InsertOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        VendorLargeName901234567890 e = new VendorLargeName901234567890();
        VendorLargeName901234567890CB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected VendorLargeName901234567890CB createCBForQueryInsert() {
        VendorLargeName901234567890CB cb = newMyConditionBean();
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">queryUpdate</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb) {
        return doQueryUpdate(vendorLargeName901234567890, cb, null);
    }

    protected int doQueryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb, UpdateOption<VendorLargeName901234567890CB> op) {
        assertObjectNotNull("vendorLargeName901234567890", vendorLargeName901234567890); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendorLargeName901234567890, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (VendorLargeName901234567890CB)cb); }
        else { return varyingQueryUpdate(downcast(et), (VendorLargeName901234567890CB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">queryDelete</span>(vendorLargeName901234567890, cb);
     * </pre>
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorLargeName901234567890CB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(VendorLargeName901234567890CB cb, DeleteOption<VendorLargeName901234567890CB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((VendorLargeName901234567890CB)cb); }
        else { return varyingQueryDelete((VendorLargeName901234567890CB)cb, downcast(op)); }
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorLargeName901234567890.setFoo...(value);
     * vendorLargeName901234567890.setBar...(value);
     * InsertOption<VendorLargeName901234567890CB> option = new InsertOption<VendorLargeName901234567890CB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">varyingInsert</span>(vendorLargeName901234567890, option);
     * ... = vendorLargeName901234567890.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorLargeName901234567890 The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorLargeName901234567890 vendorLargeName901234567890, InsertOption<VendorLargeName901234567890CB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendorLargeName901234567890, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * vendorLargeName901234567890.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendorLargeName901234567890.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorLargeName901234567890CB&gt; option = new UpdateOption&lt;VendorLargeName901234567890CB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorLargeName901234567890CB&gt;() {
     *         public void specify(VendorLargeName901234567890CB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorLargeName901234567890Bhv.<span style="color: #FD4747">varyingUpdate</span>(vendorLargeName901234567890, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorLargeName901234567890 The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorLargeName901234567890 vendorLargeName901234567890, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendorLargeName901234567890, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorLargeName901234567890 The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorLargeName901234567890 vendorLargeName901234567890, InsertOption<VendorLargeName901234567890CB> insertOption, UpdateOption<VendorLargeName901234567890CB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendorLargeName901234567890, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorLargeName901234567890 The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorLargeName901234567890 vendorLargeName901234567890, DeleteOption<VendorLargeName901234567890CB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendorLargeName901234567890, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorLargeName901234567890> vendorLargeName901234567890List, InsertOption<VendorLargeName901234567890CB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendorLargeName901234567890List, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorLargeName901234567890> vendorLargeName901234567890List, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendorLargeName901234567890List, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorLargeName901234567890List The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorLargeName901234567890> vendorLargeName901234567890List, DeleteOption<VendorLargeName901234567890CB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendorLargeName901234567890List, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> setupper, InsertOption<VendorLargeName901234567890CB> option) {
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
     * VendorLargeName901234567890 vendorLargeName901234567890 = new VendorLargeName901234567890();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setPK...(value);</span>
     * vendorLargeName901234567890.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorLargeName901234567890.setVersionNo(value);</span>
     * VendorLargeName901234567890CB cb = new VendorLargeName901234567890CB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorLargeName901234567890CB&gt; option = new UpdateOption&lt;VendorLargeName901234567890CB&gt;();
     * option.self(new SpecifyQuery&lt;VendorLargeName901234567890CB&gt;() {
     *     public void specify(VendorLargeName901234567890CB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorLargeName901234567890Bhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendorLargeName901234567890, cb, option);
     * </pre>
     * @param vendorLargeName901234567890 The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorLargeName901234567890 vendorLargeName901234567890, VendorLargeName901234567890CB cb, UpdateOption<VendorLargeName901234567890CB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendorLargeName901234567890, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorLargeName901234567890. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorLargeName901234567890CB cb, DeleteOption<VendorLargeName901234567890CB> option) {
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
    public OutsideSqlBasicExecutor<VendorLargeName901234567890Bhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(VendorLargeName901234567890CB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(VendorLargeName901234567890CB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends VendorLargeName901234567890> void delegateSelectCursor(VendorLargeName901234567890CB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends VendorLargeName901234567890> List<ENTITY> delegateSelectList(VendorLargeName901234567890CB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(VendorLargeName901234567890 et, InsertOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(VendorLargeName901234567890 et, UpdateOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(VendorLargeName901234567890 et, UpdateOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(VendorLargeName901234567890 et, DeleteOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(VendorLargeName901234567890 et, DeleteOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<VendorLargeName901234567890> ls, InsertOption<VendorLargeName901234567890CB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<VendorLargeName901234567890> ls, UpdateOption<VendorLargeName901234567890CB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<VendorLargeName901234567890> ls, UpdateOption<VendorLargeName901234567890CB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<VendorLargeName901234567890> ls, DeleteOption<VendorLargeName901234567890CB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<VendorLargeName901234567890> ls, DeleteOption<VendorLargeName901234567890CB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(VendorLargeName901234567890 et, VendorLargeName901234567890CB inCB, ConditionBean resCB, InsertOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(VendorLargeName901234567890 et, VendorLargeName901234567890CB cb, UpdateOption<VendorLargeName901234567890CB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(VendorLargeName901234567890CB cb, DeleteOption<VendorLargeName901234567890CB> op)
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
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected VendorLargeName901234567890 downcast(Entity et) {
        return helpEntityDowncastInternally(et, VendorLargeName901234567890.class);
    }

    protected VendorLargeName901234567890CB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, VendorLargeName901234567890CB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<VendorLargeName901234567890> downcast(List<? extends Entity> ls) {
        return (List<VendorLargeName901234567890>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<VendorLargeName901234567890CB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<VendorLargeName901234567890CB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<VendorLargeName901234567890CB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<VendorLargeName901234567890CB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<VendorLargeName901234567890CB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<VendorLargeName901234567890CB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<VendorLargeName901234567890, VendorLargeName901234567890CB>)sp;
    }
}
