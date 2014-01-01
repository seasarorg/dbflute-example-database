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
 * The behavior of WHITE_TARGET as TABLE. <br />
 * <pre>
 * [primary key]
 *     TARGET_ID
 * 
 * [column]
 *     TARGET_ID, TARGET_NAME
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
 *     WHITE_REF_TARGET
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteRefTargetList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTargetBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_TARGET"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteTargetDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteTargetDbm getMyDBMeta() { return WhiteTargetDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteTarget newMyEntity() { return new WhiteTarget(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteTargetCB newMyConditionBean() { return new WhiteTargetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * int count = whiteTargetBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteTargetCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteTargetCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteTargetCB cb) { // called by selectPage(cb)
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
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * WhiteTarget whiteTarget = whiteTargetBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteTarget != null) {
     *     ... = whiteTarget.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTarget selectEntity(WhiteTargetCB cb) {
        return doSelectEntity(cb, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> ENTITY doSelectEntity(final WhiteTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * WhiteTarget whiteTarget = whiteTargetBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteTarget.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTarget selectEntityWithDeletedCheck(WhiteTargetCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> ENTITY doSelectEntityWithDeletedCheck(final WhiteTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param targetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTarget selectByPKValue(Long targetId) {
        return doSelectByPKValue(targetId, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> ENTITY doSelectByPKValue(Long targetId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(targetId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param targetId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteTarget selectByPKValueWithDeletedCheck(Long targetId) {
        return doSelectByPKValueWithDeletedCheck(targetId, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> ENTITY doSelectByPKValueWithDeletedCheck(Long targetId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(targetId), entityType);
    }

    private WhiteTargetCB buildPKCB(Long targetId) {
        assertObjectNotNull("targetId", targetId);
        WhiteTargetCB cb = newMyConditionBean();
        cb.query().setTargetId_Equal(targetId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteTarget&gt; whiteTargetList = whiteTargetBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteTarget whiteTarget : whiteTargetList) {
     *     ... = whiteTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteTarget> selectList(WhiteTargetCB cb) {
        return doSelectList(cb, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> ListResultBean<ENTITY> doSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteTargetCB>() {
            public List<ENTITY> callbackSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteTarget&gt; page = whiteTargetBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteTarget whiteTarget : page) {
     *     ... = whiteTarget.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteTarget> selectPage(WhiteTargetCB cb) {
        return doSelectPage(cb, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> PagingResultBean<ENTITY> doSelectPage(WhiteTargetCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteTargetCB>() {
            public int callbackSelectCount(WhiteTargetCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * whiteTargetBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteTarget&gt;() {
     *     public void handle(WhiteTarget entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteTarget. (NotNull)
     */
    public void selectCursor(WhiteTargetCB cb, EntityRowHandler<WhiteTarget> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteTarget.class);
    }

    protected <ENTITY extends WhiteTarget> void doSelectCursor(WhiteTargetCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteTarget>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteTargetCB>() {
            public void callbackSelectCursor(WhiteTargetCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteTargetCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteTargetBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteTargetCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteTargetCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteTargetCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
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
     * @param whiteTarget The entity of whiteTarget. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteRefTargetList(WhiteTarget whiteTarget, ConditionBeanSetupper<WhiteRefTargetCB> conditionBeanSetupper) {
        xassLRArg(whiteTarget, conditionBeanSetupper);
        loadWhiteRefTargetList(xnewLRLs(whiteTarget), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteRefTargetList with the set-upper for condition-bean of referrer. <br />
     * WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * <pre>
     * whiteTargetBhv.<span style="color: #FD4747">loadWhiteRefTargetList</span>(whiteTargetList, new ConditionBeanSetupper&lt;WhiteRefTargetCB&gt;() {
     *     public void setup(WhiteRefTargetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteTarget whiteTarget : whiteTargetList) {
     *     ... = whiteTarget.<span style="color: #FD4747">getWhiteRefTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setTargetId_InScope(pkList);
     * cb.query().addOrderBy_TargetId_Asc();
     * </pre>
     * @param whiteTargetList The entity list of whiteTarget. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteRefTargetList(List<WhiteTarget> whiteTargetList, ConditionBeanSetupper<WhiteRefTargetCB> conditionBeanSetupper) {
        xassLRArg(whiteTargetList, conditionBeanSetupper);
        loadWhiteRefTargetList(whiteTargetList, new LoadReferrerOption<WhiteRefTargetCB, WhiteRefTarget>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteTarget The entity of whiteTarget. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteRefTargetList(WhiteTarget whiteTarget, LoadReferrerOption<WhiteRefTargetCB, WhiteRefTarget> loadReferrerOption) {
        xassLRArg(whiteTarget, loadReferrerOption);
        loadWhiteRefTargetList(xnewLRLs(whiteTarget), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteTargetList The entity list of whiteTarget. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteRefTargetList(List<WhiteTarget> whiteTargetList, LoadReferrerOption<WhiteRefTargetCB, WhiteRefTarget> loadReferrerOption) {
        xassLRArg(whiteTargetList, loadReferrerOption);
        if (whiteTargetList.isEmpty()) { return; }
        final WhiteRefTargetBhv referrerBhv = xgetBSFLR().select(WhiteRefTargetBhv.class);
        helpLoadReferrerInternally(whiteTargetList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteTarget, Long, WhiteRefTargetCB, WhiteRefTarget>() {
            public Long getPKVal(WhiteTarget e)
            { return e.getTargetId(); }
            public void setRfLs(WhiteTarget e, List<WhiteRefTarget> ls)
            { e.setWhiteRefTargetList(ls); }
            public WhiteRefTargetCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteRefTargetCB cb, List<Long> ls)
            { cb.query().setTargetId_InScope(ls); }
            public void qyOdFKAsc(WhiteRefTargetCB cb) { cb.query().addOrderBy_TargetId_Asc(); }
            public void spFKCol(WhiteRefTargetCB cb) { cb.specify().columnTargetId(); }
            public List<WhiteRefTarget> selRfLs(WhiteRefTargetCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteRefTarget e) { return e.getTargetId(); }
            public void setlcEt(WhiteRefTarget re, WhiteTarget le)
            { re.setWhiteTarget(le); }
            public String getRfPrNm() { return "whiteRefTargetList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key targetId.
     * @param whiteTargetList The list of whiteTarget. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTargetIdList(List<WhiteTarget> whiteTargetList) {
        return helpExtractListInternally(whiteTargetList, new InternalExtractCallback<WhiteTarget, Long>() {
            public Long getCV(WhiteTarget e) { return e.getTargetId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteTarget whiteTarget = new WhiteTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTarget.setFoo...(value);
     * whiteTarget.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTarget.set...;</span>
     * whiteTargetBhv.<span style="color: #FD4747">insert</span>(whiteTarget);
     * ... = whiteTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteTarget whiteTarget) {
        doInsert(whiteTarget, null);
    }

    protected void doInsert(WhiteTarget whiteTarget, InsertOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTarget", whiteTarget);
        prepareInsertOption(option);
        delegateInsert(whiteTarget, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteTargetCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
        if (option.hasSpecifiedInsertColumn()) {
            option.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTarget whiteTarget = new WhiteTarget();
     * whiteTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTarget.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteTargetBhv.<span style="color: #FD4747">update</span>(whiteTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteTarget whiteTarget) {
        doUpdate(whiteTarget, null);
    }

    protected void doUpdate(WhiteTarget whiteTarget, final UpdateOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTarget", whiteTarget);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteTarget, new InternalUpdateCallback<WhiteTarget>() {
            public int callbackDelegateUpdate(WhiteTarget entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteTargetCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteTargetCB createCBForVaryingUpdate() {
        WhiteTargetCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteTargetCB createCBForSpecifiedUpdate() {
        WhiteTargetCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #FD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteTarget The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteTarget whiteTarget) {
        doInesrtOrUpdate(whiteTarget, null, null);
    }

    protected void doInesrtOrUpdate(WhiteTarget whiteTarget, final InsertOption<WhiteTargetCB> insertOption, final UpdateOption<WhiteTargetCB> updateOption) {
        helpInsertOrUpdateInternally(whiteTarget, new InternalInsertOrUpdateCallback<WhiteTarget, WhiteTargetCB>() {
            public void callbackInsert(WhiteTarget entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteTarget entity) { doUpdate(entity, updateOption); }
            public WhiteTargetCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteTargetCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteTargetCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteTargetCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WhiteTarget whiteTarget = new WhiteTarget();
     * whiteTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteTargetBhv.<span style="color: #FD4747">delete</span>(whiteTarget);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param whiteTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteTarget whiteTarget) {
        doDelete(whiteTarget, null);
    }

    protected void doDelete(WhiteTarget whiteTarget, final DeleteOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTarget", whiteTarget);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteTarget, new InternalDeleteCallback<WhiteTarget>() {
            public int callbackDelegateDelete(WhiteTarget entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteTargetCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
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
     *     WhiteTarget whiteTarget = new WhiteTarget();
     *     whiteTarget.setFooName("foo");
     *     if (...) {
     *         whiteTarget.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteTargetList.add(whiteTarget);
     * }
     * whiteTargetBhv.<span style="color: #FD4747">batchInsert</span>(whiteTargetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteTarget> whiteTargetList) {
        InsertOption<WhiteTargetCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteTargetList, option);
    }

    protected int[] doBatchInsert(List<WhiteTarget> whiteTargetList, InsertOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTargetList", whiteTargetList);
        prepareBatchInsertOption(whiteTargetList, option);
        return delegateBatchInsert(whiteTargetList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteTarget> whiteTargetList, InsertOption<WhiteTargetCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteTargetList);
        prepareInsertOption(option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WhiteTarget whiteTarget = new WhiteTarget();
     *     whiteTarget.setFooName("foo");
     *     if (...) {
     *         whiteTarget.setFooPrice(123);
     *     } else {
     *         whiteTarget.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteTarget.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteTargetList.add(whiteTarget);
     * }
     * whiteTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTargetList);
     * </pre>
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTarget> whiteTargetList) {
        UpdateOption<WhiteTargetCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteTargetList, option);
    }

    protected int[] doBatchUpdate(List<WhiteTarget> whiteTargetList, UpdateOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTargetList", whiteTargetList);
        prepareBatchUpdateOption(whiteTargetList, option);
        return delegateBatchUpdate(whiteTargetList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteTarget> whiteTargetList, UpdateOption<WhiteTargetCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteTargetList);
        prepareUpdateOption(option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span> 
     * whiteTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTargetList, new SpecifyQuery<WhiteTargetCB>() {
     *     public void specify(WhiteTargetCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * whiteTargetBhv.<span style="color: #FD4747">batchUpdate</span>(whiteTargetList, new SpecifyQuery<WhiteTargetCB>() {
     *     public void specify(WhiteTargetCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteTarget> whiteTargetList, SpecifyQuery<WhiteTargetCB> updateColumnSpec) {
        return doBatchUpdate(whiteTargetList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteTarget> whiteTargetList) {
        return doBatchDelete(whiteTargetList, null);
    }

    protected int[] doBatchDelete(List<WhiteTarget> whiteTargetList, DeleteOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTargetList", whiteTargetList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteTargetList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * whiteTargetBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteTarget, WhiteTargetCB&gt;() {
     *     public ConditionBean setup(whiteTarget entity, WhiteTargetCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteTarget, WhiteTargetCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteTarget, WhiteTargetCB> setupper, InsertOption<WhiteTargetCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteTarget entity = new WhiteTarget();
        WhiteTargetCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteTargetCB createCBForQueryInsert() {
        WhiteTargetCB cb = newMyConditionBean();
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
     * WhiteTarget whiteTarget = new WhiteTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTarget.setPK...(value);</span>
     * whiteTarget.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteTarget.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteTarget.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTarget.setVersionNo(value);</span>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * whiteTargetBhv.<span style="color: #FD4747">queryUpdate</span>(whiteTarget, cb);
     * </pre>
     * @param whiteTarget The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteTarget whiteTarget, WhiteTargetCB cb) {
        return doQueryUpdate(whiteTarget, cb, null);
    }

    protected int doQueryUpdate(WhiteTarget whiteTarget, WhiteTargetCB cb, UpdateOption<WhiteTargetCB> option) {
        assertObjectNotNull("whiteTarget", whiteTarget); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteTarget, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteTargetCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteTargetCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * whiteTargetBhv.<span style="color: #FD4747">queryDelete</span>(whiteTarget, cb);
     * </pre>
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteTargetCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteTargetCB cb, DeleteOption<WhiteTargetCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteTargetCB)cb); }
        else { return varyingQueryDelete((WhiteTargetCB)cb, downcast(option)); }
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
     * WhiteTarget whiteTarget = new WhiteTarget();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteTarget.setFoo...(value);
     * whiteTarget.setBar...(value);
     * InsertOption<WhiteTargetCB> option = new InsertOption<WhiteTargetCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteTargetBhv.<span style="color: #FD4747">varyingInsert</span>(whiteTarget, option);
     * ... = whiteTarget.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteTarget The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteTarget whiteTarget, InsertOption<WhiteTargetCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteTarget, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteTarget whiteTarget = new WhiteTarget();
     * whiteTarget.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteTarget.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteTargetCB&gt; option = new UpdateOption&lt;WhiteTargetCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteTargetCB&gt;() {
     *         public void specify(WhiteTargetCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteTargetBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteTarget, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteTarget The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteTarget whiteTarget, UpdateOption<WhiteTargetCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteTarget, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteTarget The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteTarget whiteTarget, InsertOption<WhiteTargetCB> insertOption, UpdateOption<WhiteTargetCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteTarget, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteTarget The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteTarget whiteTarget, DeleteOption<WhiteTargetCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteTarget, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteTarget> whiteTargetList, InsertOption<WhiteTargetCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteTargetList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteTarget> whiteTargetList, UpdateOption<WhiteTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteTargetList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteTargetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteTarget> whiteTargetList, DeleteOption<WhiteTargetCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteTargetList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteTarget, WhiteTargetCB> setupper, InsertOption<WhiteTargetCB> option) {
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
     * WhiteTarget whiteTarget = new WhiteTarget();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteTarget.setPK...(value);</span>
     * whiteTarget.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteTarget.setVersionNo(value);</span>
     * WhiteTargetCB cb = new WhiteTargetCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteTargetCB&gt; option = new UpdateOption&lt;WhiteTargetCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteTargetCB&gt;() {
     *     public void specify(WhiteTargetCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteTargetBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteTarget, cb, option);
     * </pre>
     * @param whiteTarget The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteTarget whiteTarget, WhiteTargetCB cb, UpdateOption<WhiteTargetCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteTarget, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteTarget. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteTargetCB cb, DeleteOption<WhiteTargetCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteTargetBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteTargetCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteTargetCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteTarget> void delegateSelectCursor(WhiteTargetCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteTarget> List<ENTITY> delegateSelectList(WhiteTargetCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteTarget e, InsertOption<WhiteTargetCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteTarget e, UpdateOption<WhiteTargetCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteTarget e, UpdateOption<WhiteTargetCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteTarget e, DeleteOption<WhiteTargetCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteTarget e, DeleteOption<WhiteTargetCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteTarget> ls, InsertOption<WhiteTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteTarget> ls, UpdateOption<WhiteTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteTarget> ls, UpdateOption<WhiteTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteTarget> ls, DeleteOption<WhiteTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteTarget> ls, DeleteOption<WhiteTargetCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteTarget e, WhiteTargetCB inCB, ConditionBean resCB, InsertOption<WhiteTargetCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteTarget e, WhiteTargetCB cb, UpdateOption<WhiteTargetCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteTargetCB cb, DeleteOption<WhiteTargetCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected WhiteTarget downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteTarget.class);
    }

    protected WhiteTargetCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteTargetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteTarget> downcast(List<? extends Entity> entityList) {
        return (List<WhiteTarget>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteTargetCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteTargetCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteTargetCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteTargetCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteTarget, WhiteTargetCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteTarget, WhiteTargetCB>)option;
    }
}
