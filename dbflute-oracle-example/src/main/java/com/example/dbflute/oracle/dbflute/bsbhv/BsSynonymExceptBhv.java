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
public abstract class BsSynonymExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymExceptDbm getMyDBMeta() { return SynonymExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

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
     * int count = synonymExceptBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymExceptCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymExceptCB cb) { // called by selectPage(cb)
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
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * SynonymExcept synonymExcept = synonymExceptBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (synonymExcept != null) {
     *     ... = synonymExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectEntity(SynonymExceptCB cb) {
        return doSelectEntity(cb, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectEntity(SynonymExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * SynonymExcept synonymExcept = synonymExceptBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectEntityWithDeletedCheck(SynonymExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectEntityWithDeletedCheck(SynonymExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymExceptCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param exceptId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectByPKValue(Long exceptId) {
        return doSelectByPKValue(exceptId, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectByPKValue(Long exceptId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(exceptId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param exceptId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymExcept selectByPKValueWithDeletedCheck(Long exceptId) {
        return doSelectByPKValueWithDeletedCheck(exceptId, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> ENTITY doSelectByPKValueWithDeletedCheck(Long exceptId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(exceptId), entityType);
    }

    private SynonymExceptCB buildPKCB(Long exceptId) {
        assertObjectNotNull("exceptId", exceptId);
        SynonymExceptCB cb = newMyConditionBean();
        cb.query().setExceptId_Equal(exceptId);
        return cb;
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
     * ListResultBean&lt;SynonymExcept&gt; synonymExceptList = synonymExceptBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SynonymExcept synonymExcept : synonymExceptList) {
     *     ... = synonymExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymExcept> selectList(SynonymExceptCB cb) {
        return doSelectList(cb, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> ListResultBean<ENTITY> doSelectList(SynonymExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymExceptCB>() {
            public List<ENTITY> callbackSelectList(SynonymExceptCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymExcept&gt; page = synonymExceptBhv.<span style="color: #FD4747">selectPage</span>(cb);
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
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymExcept> selectPage(SynonymExceptCB cb) {
        return doSelectPage(cb, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> PagingResultBean<ENTITY> doSelectPage(SynonymExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymExceptCB>() {
            public int callbackSelectCount(SynonymExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymExcept&gt;() {
     *     public void handle(SynonymExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymExcept. (NotNull)
     */
    public void selectCursor(SynonymExceptCB cb, EntityRowHandler<SynonymExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymExcept.class);
    }

    protected <ENTITY extends SynonymExcept> void doSelectCursor(SynonymExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymExceptCB>() {
            public void callbackSelectCursor(SynonymExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymExceptBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param synonymExcept The entity of synonymExcept. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSynonymRefExceptList(SynonymExcept synonymExcept, ConditionBeanSetupper<SynonymRefExceptCB> conditionBeanSetupper) {
        xassLRArg(synonymExcept, conditionBeanSetupper);
        loadSynonymRefExceptList(xnewLRLs(synonymExcept), conditionBeanSetupper);
    }
    /**
     * Load referrer of synonymRefExceptList with the set-upper for condition-bean of referrer. <br />
     * SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * <pre>
     * synonymExceptBhv.<span style="color: #FD4747">loadSynonymRefExceptList</span>(synonymExceptList, new ConditionBeanSetupper&lt;SynonymRefExceptCB&gt;() {
     *     public void setup(SynonymRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (SynonymExcept synonymExcept : synonymExceptList) {
     *     ... = synonymExcept.<span style="color: #FD4747">getSynonymRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param synonymExceptList The entity list of synonymExcept. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSynonymRefExceptList(List<SynonymExcept> synonymExceptList, ConditionBeanSetupper<SynonymRefExceptCB> conditionBeanSetupper) {
        xassLRArg(synonymExceptList, conditionBeanSetupper);
        loadSynonymRefExceptList(synonymExceptList, new LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param synonymExcept The entity of synonymExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSynonymRefExceptList(SynonymExcept synonymExcept, LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept> loadReferrerOption) {
        xassLRArg(synonymExcept, loadReferrerOption);
        loadSynonymRefExceptList(xnewLRLs(synonymExcept), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param synonymExceptList The entity list of synonymExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSynonymRefExceptList(List<SynonymExcept> synonymExceptList, LoadReferrerOption<SynonymRefExceptCB, SynonymRefExcept> loadReferrerOption) {
        xassLRArg(synonymExceptList, loadReferrerOption);
        if (synonymExceptList.isEmpty()) { return; }
        final SynonymRefExceptBhv referrerBhv = xgetBSFLR().select(SynonymRefExceptBhv.class);
        helpLoadReferrerInternally(synonymExceptList, loadReferrerOption, new InternalLoadReferrerCallback<SynonymExcept, Long, SynonymRefExceptCB, SynonymRefExcept>() {
            public Long getPKVal(SynonymExcept et)
            { return et.getExceptId(); }
            public void setRfLs(SynonymExcept et, List<SynonymRefExcept> ls)
            { et.setSynonymRefExceptList(ls); }
            public SynonymRefExceptCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SynonymRefExceptCB cb, List<Long> ls)
            { cb.query().setExceptId_InScope(ls); }
            public void qyOdFKAsc(SynonymRefExceptCB cb) { cb.query().addOrderBy_ExceptId_Asc(); }
            public void spFKCol(SynonymRefExceptCB cb) { cb.specify().columnExceptId(); }
            public List<SynonymRefExcept> selRfLs(SynonymRefExceptCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(SynonymRefExcept re) { return re.getExceptId(); }
            public void setlcEt(SynonymRefExcept re, SynonymExcept le)
            { re.setSynonymExcept(le); }
            public String getRfPrNm() { return "synonymRefExceptList"; }
        });
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
    public List<Long> extractExceptIdList(List<SynonymExcept> synonymExceptList) {
        return helpExtractListInternally(synonymExceptList, new InternalExtractCallback<SynonymExcept, Long>() {
            public Long getCV(SynonymExcept et) { return et.getExceptId(); }
        });
    }

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
     * synonymExceptBhv.<span style="color: #FD4747">insert</span>(synonymExcept);
     * ... = synonymExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymExcept synonymExcept) {
        doInsert(synonymExcept, null);
    }

    protected void doInsert(SynonymExcept synonymExcept, InsertOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExcept", synonymExcept);
        prepareInsertOption(op);
        delegateInsert(synonymExcept, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymExceptCB> op) {
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
     * SynonymExcept synonymExcept = new SynonymExcept();
     * synonymExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymExceptBhv.<span style="color: #FD4747">update</span>(synonymExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymExcept synonymExcept) {
        doUpdate(synonymExcept, null);
    }

    protected void doUpdate(SynonymExcept synonymExcept, final UpdateOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExcept", synonymExcept);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymExcept, new InternalUpdateCallback<SynonymExcept>() {
            public int callbackDelegateUpdate(SynonymExcept et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymExceptCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymExceptCB createCBForVaryingUpdate() {
        SynonymExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymExceptCB createCBForSpecifiedUpdate() {
        SynonymExceptCB cb = newMyConditionBean();
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
     * @param synonymExcept The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymExcept synonymExcept) {
        doInesrtOrUpdate(synonymExcept, null, null);
    }

    protected void doInesrtOrUpdate(SynonymExcept synonymExcept, final InsertOption<SynonymExceptCB> iop, final UpdateOption<SynonymExceptCB> uop) {
        helpInsertOrUpdateInternally(synonymExcept, new InternalInsertOrUpdateCallback<SynonymExcept, SynonymExceptCB>() {
            public void callbackInsert(SynonymExcept et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymExcept et) { doUpdate(et, uop); }
            public SynonymExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymExceptCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymExceptCB>();
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
     * SynonymExcept synonymExcept = new SynonymExcept();
     * synonymExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     synonymExceptBhv.<span style="color: #FD4747">delete</span>(synonymExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymExcept synonymExcept) {
        doDelete(synonymExcept, null);
    }

    protected void doDelete(SynonymExcept synonymExcept, final DeleteOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExcept", synonymExcept);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymExcept, new InternalDeleteCallback<SynonymExcept>() {
            public int callbackDelegateDelete(SynonymExcept et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymExceptCB> op) {
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
     * synonymExceptBhv.<span style="color: #FD4747">batchInsert</span>(synonymExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymExcept> synonymExceptList) {
        InsertOption<SynonymExceptCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymExceptList, op);
    }

    protected int[] doBatchInsert(List<SynonymExcept> synonymExceptList, InsertOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExceptList", synonymExceptList);
        prepareBatchInsertOption(synonymExceptList, op);
        return delegateBatchInsert(synonymExceptList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymExcept> synonymExceptList, InsertOption<SynonymExceptCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymExceptList);
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
     * synonymExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymExceptList);
     * </pre>
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymExcept> synonymExceptList) {
        UpdateOption<SynonymExceptCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymExceptList, op);
    }

    protected int[] doBatchUpdate(List<SynonymExcept> synonymExceptList, UpdateOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExceptList", synonymExceptList);
        prepareBatchUpdateOption(synonymExceptList, op);
        return delegateBatchUpdate(synonymExceptList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymExcept> synonymExceptList, UpdateOption<SynonymExceptCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymExceptList);
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
     * synonymExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymExceptList, new SpecifyQuery<SynonymExceptCB>() {
     *     public void specify(SynonymExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymExceptBhv.<span style="color: #FD4747">batchUpdate</span>(synonymExceptList, new SpecifyQuery<SynonymExceptCB>() {
     *     public void specify(SynonymExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymExcept> synonymExceptList, SpecifyQuery<SynonymExceptCB> updateColumnSpec) {
        return doBatchUpdate(synonymExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymExcept> synonymExceptList) {
        return doBatchDelete(synonymExceptList, null);
    }

    protected int[] doBatchDelete(List<SynonymExcept> synonymExceptList, DeleteOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExceptList", synonymExceptList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymExceptList, op);
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
     * synonymExceptBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymExcept, SynonymExceptCB&gt;() {
     *     public ConditionBean setup(synonymExcept entity, SynonymExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymExcept, SynonymExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymExcept, SynonymExceptCB> sp, InsertOption<SynonymExceptCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymExcept e = new SynonymExcept();
        SynonymExceptCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymExceptCB createCBForQueryInsert() {
        SynonymExceptCB cb = newMyConditionBean();
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
     * SynonymExcept synonymExcept = new SynonymExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymExcept.setPK...(value);</span>
     * synonymExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymExcept.setVersionNo(value);</span>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #FD4747">queryUpdate</span>(synonymExcept, cb);
     * </pre>
     * @param synonymExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymExcept synonymExcept, SynonymExceptCB cb) {
        return doQueryUpdate(synonymExcept, cb, null);
    }

    protected int doQueryUpdate(SynonymExcept synonymExcept, SynonymExceptCB cb, UpdateOption<SynonymExceptCB> op) {
        assertObjectNotNull("synonymExcept", synonymExcept); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymExcept, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymExceptCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * synonymExceptBhv.<span style="color: #FD4747">queryDelete</span>(synonymExcept, cb);
     * </pre>
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymExceptCB cb, DeleteOption<SynonymExceptCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymExceptCB)cb); }
        else { return varyingQueryDelete((SynonymExceptCB)cb, downcast(op)); }
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
     * synonymExceptBhv.<span style="color: #FD4747">varyingInsert</span>(synonymExcept, option);
     * ... = synonymExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymExceptCB&gt; option = new UpdateOption&lt;SynonymExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymExceptCB&gt;() {
     *         public void specify(SynonymExceptCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymExceptBhv.<span style="color: #FD4747">varyingUpdate</span>(synonymExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymExcept synonymExcept, UpdateOption<SynonymExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymExcept synonymExcept, InsertOption<SynonymExceptCB> insertOption, UpdateOption<SynonymExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
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
     * @param setupper The setup-per of query-insert. (NotNull)
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymExcept.setVersionNo(value);</span>
     * SynonymExceptCB cb = new SynonymExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymExceptCB&gt; option = new UpdateOption&lt;SynonymExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymExceptCB&gt;() {
     *     public void specify(SynonymExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymExceptBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(synonymExcept, cb, option);
     * </pre>
     * @param synonymExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymExcept> void delegateSelectCursor(SynonymExceptCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymExcept> List<ENTITY> delegateSelectList(SynonymExceptCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymExcept et, InsertOption<SynonymExceptCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymExcept et, UpdateOption<SynonymExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SynonymExcept et, UpdateOption<SynonymExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymExcept et, DeleteOption<SynonymExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SynonymExcept et, DeleteOption<SynonymExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymExcept> ls, InsertOption<SynonymExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymExcept> ls, UpdateOption<SynonymExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymExcept> ls, UpdateOption<SynonymExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymExcept> ls, DeleteOption<SynonymExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymExcept> ls, DeleteOption<SynonymExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymExcept et, SynonymExceptCB inCB, ConditionBean resCB, InsertOption<SynonymExceptCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymExcept et, SynonymExceptCB cb, UpdateOption<SynonymExceptCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymExceptCB cb, DeleteOption<SynonymExceptCB> op)
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
    protected SynonymExcept downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymExcept.class);
    }

    protected SynonymExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymExcept> downcast(List<? extends Entity> ls) {
        return (List<SynonymExcept>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymExceptCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymExceptCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymExceptCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymExcept, SynonymExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymExcept, SynonymExceptCB>)sp;
    }
}
