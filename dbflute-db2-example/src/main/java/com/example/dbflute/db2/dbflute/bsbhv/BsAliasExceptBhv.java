package com.example.dbflute.db2.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.db2.dbflute.exbhv.*;
import com.example.dbflute.db2.dbflute.exentity.*;
import com.example.dbflute.db2.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.db2.dbflute.cbean.*;

/**
 * The behavior of ALIAS_EXCEPT as ALIAS. <br />
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
 *     ALIAS_REF_EXCEPT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     aliasRefExceptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAliasExceptBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "ALIAS_EXCEPT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return AliasExceptDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public AliasExceptDbm getMyDBMeta() { return AliasExceptDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public AliasExcept newMyEntity() { return new AliasExcept(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public AliasExceptCB newMyConditionBean() { return new AliasExceptCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * int count = aliasExceptBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(AliasExceptCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(AliasExceptCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(AliasExceptCB cb) { // called by selectPage(cb)
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
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * AliasExcept aliasExcept = aliasExceptBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (aliasExcept != null) {
     *     ... = aliasExcept.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectEntity(AliasExceptCB cb) {
        return doSelectEntity(cb, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectEntity(final AliasExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, AliasExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * AliasExcept aliasExcept = aliasExceptBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = aliasExcept.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public AliasExcept selectEntityWithDeletedCheck(AliasExceptCB cb) {
        return doSelectEntityWithDeletedCheck(cb, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectEntityWithDeletedCheck(final AliasExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, AliasExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); } });
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
    public AliasExcept selectByPKValue(Long exceptId) {
        return doSelectByPKValue(exceptId, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectByPKValue(Long exceptId, Class<ENTITY> entityType) {
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
    public AliasExcept selectByPKValueWithDeletedCheck(Long exceptId) {
        return doSelectByPKValueWithDeletedCheck(exceptId, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> ENTITY doSelectByPKValueWithDeletedCheck(Long exceptId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(exceptId), entityType);
    }

    private AliasExceptCB buildPKCB(Long exceptId) {
        assertObjectNotNull("exceptId", exceptId);
        AliasExceptCB cb = newMyConditionBean();
        cb.query().setExceptId_Equal(exceptId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;AliasExcept&gt; aliasExceptList = aliasExceptBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (AliasExcept aliasExcept : aliasExceptList) {
     *     ... = aliasExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<AliasExcept> selectList(AliasExceptCB cb) {
        return doSelectList(cb, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> ListResultBean<ENTITY> doSelectList(AliasExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, AliasExceptCB>() {
            public List<ENTITY> callbackSelectList(AliasExceptCB cb, Class<ENTITY> tp) { return delegateSelectList(cb, tp); } });
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
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;AliasExcept&gt; page = aliasExceptBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (AliasExcept aliasExcept : page) {
     *     ... = aliasExcept.get...();
     * }
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<AliasExcept> selectPage(AliasExceptCB cb) {
        return doSelectPage(cb, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> PagingResultBean<ENTITY> doSelectPage(AliasExceptCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, AliasExceptCB>() {
            public int callbackSelectCount(AliasExceptCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(AliasExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;AliasExcept&gt;() {
     *     public void handle(AliasExcept entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param entityRowHandler The handler of entity row of AliasExcept. (NotNull)
     */
    public void selectCursor(AliasExceptCB cb, EntityRowHandler<AliasExcept> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, AliasExcept.class);
    }

    protected <ENTITY extends AliasExcept> void doSelectCursor(AliasExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, AliasExceptCB>() {
            public void callbackSelectCursor(AliasExceptCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(AliasExceptCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * aliasExceptBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(AliasExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<AliasExceptCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends AliasExceptCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends AliasExceptCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param aliasExcept The entity of aliasExcept. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadAliasRefExceptList(AliasExcept aliasExcept, ConditionBeanSetupper<AliasRefExceptCB> conditionBeanSetupper) {
        xassLRArg(aliasExcept, conditionBeanSetupper);
        loadAliasRefExceptList(xnewLRLs(aliasExcept), conditionBeanSetupper);
    }
    /**
     * Load referrer of aliasRefExceptList with the set-upper for condition-bean of referrer. <br />
     * ALIAS_REF_EXCEPT by EXCEPT_ID, named 'aliasRefExceptList'.
     * <pre>
     * aliasExceptBhv.<span style="color: #FD4747">loadAliasRefExceptList</span>(aliasExceptList, new ConditionBeanSetupper&lt;AliasRefExceptCB&gt;() {
     *     public void setup(AliasRefExceptCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (AliasExcept aliasExcept : aliasExceptList) {
     *     ... = aliasExcept.<span style="color: #FD4747">getAliasRefExceptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setExceptId_InScope(pkList);
     * cb.query().addOrderBy_ExceptId_Asc();
     * </pre>
     * @param aliasExceptList The entity list of aliasExcept. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadAliasRefExceptList(List<AliasExcept> aliasExceptList, ConditionBeanSetupper<AliasRefExceptCB> conditionBeanSetupper) {
        xassLRArg(aliasExceptList, conditionBeanSetupper);
        loadAliasRefExceptList(aliasExceptList, new LoadReferrerOption<AliasRefExceptCB, AliasRefExcept>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param aliasExcept The entity of aliasExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadAliasRefExceptList(AliasExcept aliasExcept, LoadReferrerOption<AliasRefExceptCB, AliasRefExcept> loadReferrerOption) {
        xassLRArg(aliasExcept, loadReferrerOption);
        loadAliasRefExceptList(xnewLRLs(aliasExcept), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param aliasExceptList The entity list of aliasExcept. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadAliasRefExceptList(List<AliasExcept> aliasExceptList, LoadReferrerOption<AliasRefExceptCB, AliasRefExcept> loadReferrerOption) {
        xassLRArg(aliasExceptList, loadReferrerOption);
        if (aliasExceptList.isEmpty()) { return; }
        final AliasRefExceptBhv referrerBhv = xgetBSFLR().select(AliasRefExceptBhv.class);
        helpLoadReferrerInternally(aliasExceptList, loadReferrerOption, new InternalLoadReferrerCallback<AliasExcept, Long, AliasRefExceptCB, AliasRefExcept>() {
            public Long getPKVal(AliasExcept et)
            { return et.getExceptId(); }
            public void setRfLs(AliasExcept et, List<AliasRefExcept> ls)
            { et.setAliasRefExceptList(ls); }
            public AliasRefExceptCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(AliasRefExceptCB cb, List<Long> ls)
            { cb.query().setExceptId_InScope(ls); }
            public void qyOdFKAsc(AliasRefExceptCB cb) { cb.query().addOrderBy_ExceptId_Asc(); }
            public void spFKCol(AliasRefExceptCB cb) { cb.specify().columnExceptId(); }
            public List<AliasRefExcept> selRfLs(AliasRefExceptCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(AliasRefExcept re) { return re.getExceptId(); }
            public void setlcEt(AliasRefExcept re, AliasExcept le)
            { re.setAliasExcept(le); }
            public String getRfPrNm() { return "aliasRefExceptList"; }
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
     * @param aliasExceptList The list of aliasExcept. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractExceptIdList(List<AliasExcept> aliasExceptList) {
        return helpExtractListInternally(aliasExceptList, new InternalExtractCallback<AliasExcept, Long>() {
            public Long getCV(AliasExcept et) { return et.getExceptId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasExcept.setFoo...(value);
     * aliasExcept.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * aliasExceptBhv.<span style="color: #FD4747">insert</span>(aliasExcept);
     * ... = aliasExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param aliasExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(AliasExcept aliasExcept) {
        doInsert(aliasExcept, null);
    }

    protected void doInsert(AliasExcept aliasExcept, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", aliasExcept);
        prepareInsertOption(op);
        delegateInsert(aliasExcept, op);
    }

    protected void prepareInsertOption(InsertOption<AliasExceptCB> op) {
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
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasExceptBhv.<span style="color: #FD4747">update</span>(aliasExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final AliasExcept aliasExcept) {
        doUpdate(aliasExcept, null);
    }

    protected void doUpdate(AliasExcept aliasExcept, final UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", aliasExcept);
        prepareUpdateOption(op);
        helpUpdateInternally(aliasExcept, new InternalUpdateCallback<AliasExcept>() {
            public int callbackDelegateUpdate(AliasExcept et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<AliasExceptCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected AliasExceptCB createCBForVaryingUpdate() {
        AliasExceptCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected AliasExceptCB createCBForSpecifiedUpdate() {
        AliasExceptCB cb = newMyConditionBean();
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
     * @param aliasExcept The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(AliasExcept aliasExcept) {
        doInesrtOrUpdate(aliasExcept, null, null);
    }

    protected void doInesrtOrUpdate(AliasExcept aliasExcept, final InsertOption<AliasExceptCB> iop, final UpdateOption<AliasExceptCB> uop) {
        helpInsertOrUpdateInternally(aliasExcept, new InternalInsertOrUpdateCallback<AliasExcept, AliasExceptCB>() {
            public void callbackInsert(AliasExcept et) { doInsert(et, iop); }
            public void callbackUpdate(AliasExcept et) { doUpdate(et, uop); }
            public AliasExceptCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(AliasExceptCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<AliasExceptCB>();
            uop = uop != null ? uop : new UpdateOption<AliasExceptCB>();
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
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     aliasExceptBhv.<span style="color: #FD4747">delete</span>(aliasExcept);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(AliasExcept aliasExcept) {
        doDelete(aliasExcept, null);
    }

    protected void doDelete(AliasExcept aliasExcept, final DeleteOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", aliasExcept);
        prepareDeleteOption(op);
        helpDeleteInternally(aliasExcept, new InternalDeleteCallback<AliasExcept>() {
            public int callbackDelegateDelete(AliasExcept et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<AliasExceptCB> op) {
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
     *     AliasExcept aliasExcept = new AliasExcept();
     *     aliasExcept.setFooName("foo");
     *     if (...) {
     *         aliasExcept.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     aliasExceptList.add(aliasExcept);
     * }
     * aliasExceptBhv.<span style="color: #FD4747">batchInsert</span>(aliasExceptList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<AliasExcept> aliasExceptList) {
        InsertOption<AliasExceptCB> op = createInsertUpdateOption();
        return doBatchInsert(aliasExceptList, op);
    }

    protected int[] doBatchInsert(List<AliasExcept> aliasExceptList, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", aliasExceptList);
        prepareBatchInsertOption(aliasExceptList, op);
        return delegateBatchInsert(aliasExceptList, op);
    }

    protected void prepareBatchInsertOption(List<AliasExcept> aliasExceptList, InsertOption<AliasExceptCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(aliasExceptList);
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
     *     AliasExcept aliasExcept = new AliasExcept();
     *     aliasExcept.setFooName("foo");
     *     if (...) {
     *         aliasExcept.setFooPrice(123);
     *     } else {
     *         aliasExcept.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//aliasExcept.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     aliasExceptList.add(aliasExcept);
     * }
     * aliasExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasExceptList);
     * </pre>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasExcept> aliasExceptList) {
        UpdateOption<AliasExceptCB> op = createPlainUpdateOption();
        return doBatchUpdate(aliasExceptList, op);
    }

    protected int[] doBatchUpdate(List<AliasExcept> aliasExceptList, UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", aliasExceptList);
        prepareBatchUpdateOption(aliasExceptList, op);
        return delegateBatchUpdate(aliasExceptList, op);
    }

    protected void prepareBatchUpdateOption(List<AliasExcept> aliasExceptList, UpdateOption<AliasExceptCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(aliasExceptList);
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
     * aliasExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasExceptList, new SpecifyQuery<AliasExceptCB>() {
     *     public void specify(AliasExceptCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * aliasExceptBhv.<span style="color: #FD4747">batchUpdate</span>(aliasExceptList, new SpecifyQuery<AliasExceptCB>() {
     *     public void specify(AliasExceptCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<AliasExcept> aliasExceptList, SpecifyQuery<AliasExceptCB> updateColumnSpec) {
        return doBatchUpdate(aliasExceptList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<AliasExcept> aliasExceptList) {
        return doBatchDelete(aliasExceptList, null);
    }

    protected int[] doBatchDelete(List<AliasExcept> aliasExceptList, DeleteOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExceptList", aliasExceptList);
        prepareDeleteOption(op);
        return delegateBatchDelete(aliasExceptList, op);
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
     * aliasExceptBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;AliasExcept, AliasExceptCB&gt;() {
     *     public ConditionBean setup(aliasExcept entity, AliasExceptCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> sp, InsertOption<AliasExceptCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        AliasExcept e = new AliasExcept();
        AliasExceptCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected AliasExceptCB createCBForQueryInsert() {
        AliasExceptCB cb = newMyConditionBean();
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
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasExcept.setPK...(value);</span>
     * aliasExcept.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//aliasExcept.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//aliasExcept.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasExcept.setVersionNo(value);</span>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #FD4747">queryUpdate</span>(aliasExcept, cb);
     * </pre>
     * @param aliasExcept The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(AliasExcept aliasExcept, AliasExceptCB cb) {
        return doQueryUpdate(aliasExcept, cb, null);
    }

    protected int doQueryUpdate(AliasExcept aliasExcept, AliasExceptCB cb, UpdateOption<AliasExceptCB> op) {
        assertObjectNotNull("aliasExcept", aliasExcept); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(aliasExcept, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (AliasExceptCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (AliasExceptCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * aliasExceptBhv.<span style="color: #FD4747">queryDelete</span>(aliasExcept, cb);
     * </pre>
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(AliasExceptCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(AliasExceptCB cb, DeleteOption<AliasExceptCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((AliasExceptCB)cb); }
        else { return varyingQueryDelete((AliasExceptCB)cb, downcast(op)); }
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
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * aliasExcept.setFoo...(value);
     * aliasExcept.setBar...(value);
     * InsertOption<AliasExceptCB> option = new InsertOption<AliasExceptCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * aliasExceptBhv.<span style="color: #FD4747">varyingInsert</span>(aliasExcept, option);
     * ... = aliasExcept.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param aliasExcept The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(AliasExcept aliasExcept, InsertOption<AliasExceptCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(aliasExcept, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * AliasExcept aliasExcept = new AliasExcept();
     * aliasExcept.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * aliasExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * aliasExcept.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;AliasExceptCB&gt; option = new UpdateOption&lt;AliasExceptCB&gt;();
     *     option.self(new SpecifyQuery&lt;AliasExceptCB&gt;() {
     *         public void specify(AliasExceptCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     aliasExceptBhv.<span style="color: #FD4747">varyingUpdate</span>(aliasExcept, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param aliasExcept The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(AliasExcept aliasExcept, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(aliasExcept, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param aliasExcept The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(AliasExcept aliasExcept, InsertOption<AliasExceptCB> insertOption, UpdateOption<AliasExceptCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(aliasExcept, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param aliasExcept The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(AliasExcept aliasExcept, DeleteOption<AliasExceptCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(aliasExcept, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<AliasExcept> aliasExceptList, InsertOption<AliasExceptCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(aliasExceptList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<AliasExcept> aliasExceptList, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(aliasExceptList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param aliasExceptList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<AliasExcept> aliasExceptList, DeleteOption<AliasExceptCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(aliasExceptList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<AliasExcept, AliasExceptCB> setupper, InsertOption<AliasExceptCB> option) {
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
     * AliasExcept aliasExcept = new AliasExcept();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//aliasExcept.setPK...(value);</span>
     * aliasExcept.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//aliasExcept.setVersionNo(value);</span>
     * AliasExceptCB cb = new AliasExceptCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;AliasExceptCB&gt; option = new UpdateOption&lt;AliasExceptCB&gt;();
     * option.self(new SpecifyQuery&lt;AliasExceptCB&gt;() {
     *     public void specify(AliasExceptCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * aliasExceptBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(aliasExcept, cb, option);
     * </pre>
     * @param aliasExcept The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(AliasExcept aliasExcept, AliasExceptCB cb, UpdateOption<AliasExceptCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(aliasExcept, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of AliasExcept. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(AliasExceptCB cb, DeleteOption<AliasExceptCB> option) {
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
    public OutsideSqlBasicExecutor<AliasExceptBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(AliasExceptCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(AliasExceptCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends AliasExcept> void delegateSelectCursor(AliasExceptCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends AliasExcept> List<ENTITY> delegateSelectList(AliasExceptCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(AliasExcept et, InsertOption<AliasExceptCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(AliasExcept et, UpdateOption<AliasExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(AliasExcept et, UpdateOption<AliasExceptCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(AliasExcept et, DeleteOption<AliasExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(AliasExcept et, DeleteOption<AliasExceptCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<AliasExcept> ls, InsertOption<AliasExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<AliasExcept> ls, UpdateOption<AliasExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<AliasExcept> ls, UpdateOption<AliasExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<AliasExcept> ls, DeleteOption<AliasExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<AliasExcept> ls, DeleteOption<AliasExceptCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(AliasExcept et, AliasExceptCB inCB, ConditionBean resCB, InsertOption<AliasExceptCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(AliasExcept et, AliasExceptCB cb, UpdateOption<AliasExceptCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(AliasExceptCB cb, DeleteOption<AliasExceptCB> op)
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
    protected AliasExcept downcast(Entity et) {
        return helpEntityDowncastInternally(et, AliasExcept.class);
    }

    protected AliasExceptCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, AliasExceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<AliasExcept> downcast(List<? extends Entity> ls) {
        return (List<AliasExcept>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<AliasExceptCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<AliasExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<AliasExceptCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<AliasExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<AliasExceptCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<AliasExceptCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<AliasExcept, AliasExceptCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<AliasExcept, AliasExceptCB>)sp;
    }
}
