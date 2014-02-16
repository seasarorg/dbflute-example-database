package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of VENDOR-NON COMPILABLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     NON-COMPILABLE ID
 *
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID
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
 *     VENDOR-NON COMPILABLE
 *
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 *
 * [foreign property]
 *     vendor_non_compilableSelf
 *
 * [referrer property]
 *     vendor_non_compilableSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor_non_compilableBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "VENDOR-NON COMPILABLE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return Vendor_non_compilableDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public Vendor_non_compilableDbm getMyDBMeta() { return Vendor_non_compilableDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Vendor_non_compilable newMyEntity() { return new Vendor_non_compilable(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public Vendor_non_compilableCB newMyConditionBean() { return new Vendor_non_compilableCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * int count = vendor_non_compilableBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(Vendor_non_compilableCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(Vendor_non_compilableCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(Vendor_non_compilableCB cb) { // called by selectPage(cb)
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
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (vendor_non_compilable != null) {
     *     ... = vendor_non_compilable.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntity(Vendor_non_compilableCB cb) {
        return doSelectEntity(cb, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectEntity(final Vendor_non_compilableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, Vendor_non_compilableCB>() {
            public List<ENTITY> callbackSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * Vendor_non_compilable vendor_non_compilable = vendor_non_compilableBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor_non_compilable.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntityWithDeletedCheck(Vendor_non_compilableCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectEntityWithDeletedCheck(final Vendor_non_compilableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, Vendor_non_compilableCB>() {
            public List<ENTITY> callbackSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param non_compilable_id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectByPKValue(Integer non_compilable_id) {
        return doSelectByPKValue(non_compilable_id, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectByPKValue(Integer non_compilable_id, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(non_compilable_id), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param non_compilable_id The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectByPKValueWithDeletedCheck(Integer non_compilable_id) {
        return doSelectByPKValueWithDeletedCheck(non_compilable_id, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectByPKValueWithDeletedCheck(Integer non_compilable_id, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(non_compilable_id), entityType);
    }

    private Vendor_non_compilableCB buildPKCB(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        Vendor_non_compilableCB cb = newMyConditionBean();
        cb.query().setNon_compilable_id_Equal(non_compilable_id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Vendor_non_compilable&gt; vendor_non_compilableList = vendor_non_compilableBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Vendor_non_compilable vendor_non_compilable : vendor_non_compilableList) {
     *     ... = vendor_non_compilable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor_non_compilable> selectList(Vendor_non_compilableCB cb) {
        return doSelectList(cb, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> ListResultBean<ENTITY> doSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, Vendor_non_compilableCB>() {
            public List<ENTITY> callbackSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Vendor_non_compilable&gt; page = vendor_non_compilableBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Vendor_non_compilable vendor_non_compilable : page) {
     *     ... = vendor_non_compilable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor_non_compilable> selectPage(Vendor_non_compilableCB cb) {
        return doSelectPage(cb, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> PagingResultBean<ENTITY> doSelectPage(Vendor_non_compilableCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, Vendor_non_compilableCB>() {
            public int callbackSelectCount(Vendor_non_compilableCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Vendor_non_compilable&gt;() {
     *     public void handle(Vendor_non_compilable entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param entityRowHandler The handler of entity row of Vendor_non_compilable. (NotNull)
     */
    public void selectCursor(Vendor_non_compilableCB cb, EntityRowHandler<Vendor_non_compilable> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Vendor_non_compilable.class);
    }

    protected <ENTITY extends Vendor_non_compilable> void doSelectCursor(Vendor_non_compilableCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, Vendor_non_compilableCB>() {
            public void callbackSelectCursor(Vendor_non_compilableCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<Vendor_non_compilableCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends Vendor_non_compilableCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends Vendor_non_compilableCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendor_non_compilableSelfList(Vendor_non_compilable vendor_non_compilable, ConditionBeanSetupper<Vendor_non_compilableCB> conditionBeanSetupper) {
        xassLRArg(vendor_non_compilable, conditionBeanSetupper);
        loadVendor_non_compilableSelfList(xnewLRLs(vendor_non_compilable), conditionBeanSetupper);
    }
    /**
     * Load referrer of vendor_non_compilableSelfList with the set-upper for condition-bean of referrer. <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableSelfList'.
     * <pre>
     * vendor_non_compilableBhv.<span style="color: #FD4747">loadVendor_non_compilableSelfList</span>(vendor_non_compilableList, new ConditionBeanSetupper&lt;Vendor_non_compilableCB&gt;() {
     *     public void setup(Vendor_non_compilableCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Vendor_non_compilable vendor_non_compilable : vendor_non_compilableList) {
     *     ... = vendor_non_compilable.<span style="color: #FD4747">getVendor_non_compilableSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadVendor_non_compilableSelfList(List<Vendor_non_compilable> vendor_non_compilableList, ConditionBeanSetupper<Vendor_non_compilableCB> conditionBeanSetupper) {
        xassLRArg(vendor_non_compilableList, conditionBeanSetupper);
        loadVendor_non_compilableSelfList(vendor_non_compilableList, new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendor_non_compilableSelfList(Vendor_non_compilable vendor_non_compilable, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilable, loadReferrerOption);
        loadVendor_non_compilableSelfList(xnewLRLs(vendor_non_compilable), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadVendor_non_compilableSelfList(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilableList, loadReferrerOption);
        if (vendor_non_compilableList.isEmpty()) { return; }
        final Vendor_non_compilableBhv referrerBhv = xgetBSFLR().select(Vendor_non_compilableBhv.class);
        helpLoadReferrerInternally(vendor_non_compilableList, loadReferrerOption, new InternalLoadReferrerCallback<Vendor_non_compilable, Integer, Vendor_non_compilableCB, Vendor_non_compilable>() {
            public Integer getPKVal(Vendor_non_compilable et)
            { return et.getNon_compilable_id(); }
            public void setRfLs(Vendor_non_compilable et, List<Vendor_non_compilable> ls)
            { et.setVendor_non_compilableSelfList(ls); }
            public Vendor_non_compilableCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(Vendor_non_compilableCB cb, List<Integer> ls)
            { cb.query().setParent_id_InScope(ls); }
            public void qyOdFKAsc(Vendor_non_compilableCB cb) { cb.query().addOrderBy_Parent_id_Asc(); }
            public void spFKCol(Vendor_non_compilableCB cb) { cb.specify().columnParent_id(); }
            public List<Vendor_non_compilable> selRfLs(Vendor_non_compilableCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Vendor_non_compilable re) { return re.getParent_id(); }
            public void setlcEt(Vendor_non_compilable re, Vendor_non_compilable le)
            { re.setVendor_non_compilableSelf(le); }
            public String getRfPrNm() { return "vendor_non_compilableSelfList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Vendor_non_compilable'.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Vendor_non_compilable> pulloutVendor_non_compilableSelf(List<Vendor_non_compilable> vendor_non_compilableList) {
        return helpPulloutInternally(vendor_non_compilableList, new InternalPulloutCallback<Vendor_non_compilable, Vendor_non_compilable>() {
            public Vendor_non_compilable getFr(Vendor_non_compilable et) { return et.getVendor_non_compilableSelf(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Vendor_non_compilable et, List<Vendor_non_compilable> ls)
            { et.setVendor_non_compilableSelfList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key non_compilable_id.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractNon_compilable_idList(List<Vendor_non_compilable> vendor_non_compilableList) {
        return helpExtractListInternally(vendor_non_compilableList, new InternalExtractCallback<Vendor_non_compilable, Integer>() {
            public Integer getCV(Vendor_non_compilable et) { return et.getNon_compilable_id(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * vendor_non_compilableBhv.<span style="color: #FD4747">insert</span>(vendor_non_compilable);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendor_non_compilable The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Vendor_non_compilable vendor_non_compilable) {
        doInsert(vendor_non_compilable, null);
    }

    protected void doInsert(Vendor_non_compilable vendor_non_compilable, InsertOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilable", vendor_non_compilable);
        prepareInsertOption(op);
        delegateInsert(vendor_non_compilable, op);
    }

    protected void prepareInsertOption(InsertOption<Vendor_non_compilableCB> op) {
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor_non_compilable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendor_non_compilableBhv.<span style="color: #FD4747">update</span>(vendor_non_compilable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final Vendor_non_compilable vendor_non_compilable) {
        doUpdate(vendor_non_compilable, null);
    }

    protected void doUpdate(Vendor_non_compilable vendor_non_compilable, final UpdateOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilable", vendor_non_compilable);
        prepareUpdateOption(op);
        helpUpdateInternally(vendor_non_compilable, new InternalUpdateCallback<Vendor_non_compilable>() {
            public int callbackDelegateUpdate(Vendor_non_compilable et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<Vendor_non_compilableCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected Vendor_non_compilableCB createCBForVaryingUpdate() {
        Vendor_non_compilableCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected Vendor_non_compilableCB createCBForSpecifiedUpdate() {
        Vendor_non_compilableCB cb = newMyConditionBean();
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
     * @param vendor_non_compilable The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Vendor_non_compilable vendor_non_compilable) {
        doInesrtOrUpdate(vendor_non_compilable, null, null);
    }

    protected void doInesrtOrUpdate(Vendor_non_compilable vendor_non_compilable, final InsertOption<Vendor_non_compilableCB> iop, final UpdateOption<Vendor_non_compilableCB> uop) {
        helpInsertOrUpdateInternally(vendor_non_compilable, new InternalInsertOrUpdateCallback<Vendor_non_compilable, Vendor_non_compilableCB>() {
            public void callbackInsert(Vendor_non_compilable et) { doInsert(et, iop); }
            public void callbackUpdate(Vendor_non_compilable et) { doUpdate(et, uop); }
            public Vendor_non_compilableCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(Vendor_non_compilableCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<Vendor_non_compilableCB>();
            uop = uop != null ? uop : new UpdateOption<Vendor_non_compilableCB>();
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor_non_compilable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     vendor_non_compilableBhv.<span style="color: #FD4747">delete</span>(vendor_non_compilable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Vendor_non_compilable vendor_non_compilable) {
        doDelete(vendor_non_compilable, null);
    }

    protected void doDelete(Vendor_non_compilable vendor_non_compilable, final DeleteOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilable", vendor_non_compilable);
        prepareDeleteOption(op);
        helpDeleteInternally(vendor_non_compilable, new InternalDeleteCallback<Vendor_non_compilable>() {
            public int callbackDelegateDelete(Vendor_non_compilable et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<Vendor_non_compilableCB> op) {
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
     *     Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     if (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * vendor_non_compilableBhv.<span style="color: #FD4747">batchInsert</span>(vendor_non_compilableList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Vendor_non_compilable> vendor_non_compilableList) {
        InsertOption<Vendor_non_compilableCB> op = createInsertUpdateOption();
        return doBatchInsert(vendor_non_compilableList, op);
    }

    protected int[] doBatchInsert(List<Vendor_non_compilable> vendor_non_compilableList, InsertOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilableList", vendor_non_compilableList);
        prepareBatchInsertOption(vendor_non_compilableList, op);
        return delegateBatchInsert(vendor_non_compilableList, op);
    }

    protected void prepareBatchInsertOption(List<Vendor_non_compilable> vendor_non_compilableList, InsertOption<Vendor_non_compilableCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(vendor_non_compilableList);
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
     *     Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     if (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     } else {
     *         vendor_non_compilable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor_non_compilable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * vendor_non_compilableBhv.<span style="color: #FD4747">batchUpdate</span>(vendor_non_compilableList);
     * </pre>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor_non_compilable> vendor_non_compilableList) {
        UpdateOption<Vendor_non_compilableCB> op = createPlainUpdateOption();
        return doBatchUpdate(vendor_non_compilableList, op);
    }

    protected int[] doBatchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, UpdateOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilableList", vendor_non_compilableList);
        prepareBatchUpdateOption(vendor_non_compilableList, op);
        return delegateBatchUpdate(vendor_non_compilableList, op);
    }

    protected void prepareBatchUpdateOption(List<Vendor_non_compilable> vendor_non_compilableList, UpdateOption<Vendor_non_compilableCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(vendor_non_compilableList);
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
     * vendor_non_compilableBhv.<span style="color: #FD4747">batchUpdate</span>(vendor_non_compilableList, new SpecifyQuery<Vendor_non_compilableCB>() {
     *     public void specify(Vendor_non_compilableCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * vendor_non_compilableBhv.<span style="color: #FD4747">batchUpdate</span>(vendor_non_compilableList, new SpecifyQuery<Vendor_non_compilableCB>() {
     *     public void specify(Vendor_non_compilableCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, SpecifyQuery<Vendor_non_compilableCB> updateColumnSpec) {
        return doBatchUpdate(vendor_non_compilableList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchDelete(vendor_non_compilableList, null);
    }

    protected int[] doBatchDelete(List<Vendor_non_compilable> vendor_non_compilableList, DeleteOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilableList", vendor_non_compilableList);
        prepareDeleteOption(op);
        return delegateBatchDelete(vendor_non_compilableList, op);
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
     * vendor_non_compilableBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Vendor_non_compilable, Vendor_non_compilableCB&gt;() {
     *     public ConditionBean setup(vendor_non_compilable entity, Vendor_non_compilableCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> sp, InsertOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        Vendor_non_compilable e = new Vendor_non_compilable();
        Vendor_non_compilableCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected Vendor_non_compilableCB createCBForQueryInsert() {
        Vendor_non_compilableCB cb = newMyConditionBean();
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #FD4747">queryUpdate</span>(vendor_non_compilable, cb);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb) {
        return doQueryUpdate(vendor_non_compilable, cb, null);
    }

    protected int doQueryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb, UpdateOption<Vendor_non_compilableCB> op) {
        assertObjectNotNull("vendor_non_compilable", vendor_non_compilable); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(vendor_non_compilable, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (Vendor_non_compilableCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (Vendor_non_compilableCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * vendor_non_compilableBhv.<span style="color: #FD4747">queryDelete</span>(vendor_non_compilable, cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(Vendor_non_compilableCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(Vendor_non_compilableCB cb, DeleteOption<Vendor_non_compilableCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((Vendor_non_compilableCB)cb); }
        else { return varyingQueryDelete((Vendor_non_compilableCB)cb, downcast(op)); }
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * InsertOption<Vendor_non_compilableCB> option = new InsertOption<Vendor_non_compilableCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendor_non_compilableBhv.<span style="color: #FD4747">varyingInsert</span>(vendor_non_compilable, option);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendor_non_compilable The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Vendor_non_compilable vendor_non_compilable, InsertOption<Vendor_non_compilableCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(vendor_non_compilable, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * vendor_non_compilable.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;Vendor_non_compilableCB&gt; option = new UpdateOption&lt;Vendor_non_compilableCB&gt;();
     *     option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *         public void specify(Vendor_non_compilableCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendor_non_compilableBhv.<span style="color: #FD4747">varyingUpdate</span>(vendor_non_compilable, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Vendor_non_compilable vendor_non_compilable, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(vendor_non_compilable, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendor_non_compilable The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Vendor_non_compilable vendor_non_compilable, InsertOption<Vendor_non_compilableCB> insertOption, UpdateOption<Vendor_non_compilableCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(vendor_non_compilable, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendor_non_compilable The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Vendor_non_compilable vendor_non_compilable, DeleteOption<Vendor_non_compilableCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(vendor_non_compilable, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Vendor_non_compilable> vendor_non_compilableList, InsertOption<Vendor_non_compilableCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(vendor_non_compilableList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(vendor_non_compilableList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Vendor_non_compilable> vendor_non_compilableList, DeleteOption<Vendor_non_compilableCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(vendor_non_compilableList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> setupper, InsertOption<Vendor_non_compilableCB> option) {
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
     * Vendor_non_compilable vendor_non_compilable = new Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor_non_compilableCB&gt; option = new UpdateOption&lt;Vendor_non_compilableCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void specify(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendor_non_compilableBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(vendor_non_compilable, cb, option);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb, UpdateOption<Vendor_non_compilableCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(vendor_non_compilable, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(Vendor_non_compilableCB cb, DeleteOption<Vendor_non_compilableCB> option) {
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
    public OutsideSqlBasicExecutor<Vendor_non_compilableBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(Vendor_non_compilableCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(Vendor_non_compilableCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Vendor_non_compilable> void delegateSelectCursor(Vendor_non_compilableCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends Vendor_non_compilable> List<ENTITY> delegateSelectList(Vendor_non_compilableCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Vendor_non_compilable et, InsertOption<Vendor_non_compilableCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(Vendor_non_compilable et, UpdateOption<Vendor_non_compilableCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(Vendor_non_compilable et, UpdateOption<Vendor_non_compilableCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(Vendor_non_compilable et, DeleteOption<Vendor_non_compilableCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(Vendor_non_compilable et, DeleteOption<Vendor_non_compilableCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<Vendor_non_compilable> ls, InsertOption<Vendor_non_compilableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Vendor_non_compilable> ls, UpdateOption<Vendor_non_compilableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Vendor_non_compilable> ls, UpdateOption<Vendor_non_compilableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Vendor_non_compilable> ls, DeleteOption<Vendor_non_compilableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Vendor_non_compilable> ls, DeleteOption<Vendor_non_compilableCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Vendor_non_compilable et, Vendor_non_compilableCB inCB, ConditionBean resCB, InsertOption<Vendor_non_compilableCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Vendor_non_compilable et, Vendor_non_compilableCB cb, UpdateOption<Vendor_non_compilableCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(Vendor_non_compilableCB cb, DeleteOption<Vendor_non_compilableCB> op)
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
    protected Vendor_non_compilable downcast(Entity et) {
        return helpEntityDowncastInternally(et, Vendor_non_compilable.class);
    }

    protected Vendor_non_compilableCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, Vendor_non_compilableCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Vendor_non_compilable> downcast(List<? extends Entity> ls) {
        return (List<Vendor_non_compilable>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<Vendor_non_compilableCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<Vendor_non_compilableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<Vendor_non_compilableCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<Vendor_non_compilableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<Vendor_non_compilableCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<Vendor_non_compilableCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB>)sp;
    }
}
