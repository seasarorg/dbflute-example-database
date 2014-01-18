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
 * The behavior of white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_integer, next_schema_product_id
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
 *     NEXT_SCHEMA_PRODUCT
 *
 * [referrer table]
 *     white_same_name_ref
 *
 * [foreign property]
 *     nextSchemaProduct
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "white_same_name"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteSameNameDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteSameNameDbm getMyDBMeta() { return WhiteSameNameDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteSameName newMyEntity() { return new WhiteSameName(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteSameNameCB newMyConditionBean() { return new WhiteSameNameCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * int count = whiteSameNameBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteSameNameCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteSameNameCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteSameNameCB cb) { // called by selectPage(cb)
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
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * WhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteSameName != null) {
     *     ... = whiteSameName.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectEntity(WhiteSameNameCB cb) {
        return doSelectEntity(cb, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectEntity(final WhiteSameNameCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, WhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * WhiteSameName whiteSameName = whiteSameNameBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameName.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectEntityWithDeletedCheck(WhiteSameNameCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectEntityWithDeletedCheck(final WhiteSameNameCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectByPKValue(Long sameNameId) {
        return doSelectByPKValue(sameNameId, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectByPKValue(Long sameNameId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(sameNameId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param sameNameId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteSameName selectByPKValueWithDeletedCheck(Long sameNameId) {
        return doSelectByPKValueWithDeletedCheck(sameNameId, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> ENTITY doSelectByPKValueWithDeletedCheck(Long sameNameId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(sameNameId), entityType);
    }

    private WhiteSameNameCB buildPKCB(Long sameNameId) {
        assertObjectNotNull("sameNameId", sameNameId);
        WhiteSameNameCB cb = newMyConditionBean();
        cb.query().setSameNameId_Equal(sameNameId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteSameName&gt; whiteSameNameList = whiteSameNameBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteSameName> selectList(WhiteSameNameCB cb) {
        return doSelectList(cb, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> ListResultBean<ENTITY> doSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, WhiteSameNameCB>() {
            public List<ENTITY> callbackSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteSameName&gt; page = whiteSameNameBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteSameName whiteSameName : page) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteSameName> selectPage(WhiteSameNameCB cb) {
        return doSelectPage(cb, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> PagingResultBean<ENTITY> doSelectPage(WhiteSameNameCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, WhiteSameNameCB>() {
            public int callbackSelectCount(WhiteSameNameCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteSameName&gt;() {
     *     public void handle(WhiteSameName entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteSameName. (NotNull)
     */
    public void selectCursor(WhiteSameNameCB cb, EntityRowHandler<WhiteSameName> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteSameName.class);
    }

    protected <ENTITY extends WhiteSameName> void doSelectCursor(WhiteSameNameCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<WhiteSameName>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, WhiteSameNameCB>() {
            public void callbackSelectCursor(WhiteSameNameCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(WhiteSameNameCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteSameNameBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteSameNameCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteSameNameCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends WhiteSameNameCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
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
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameRefList(WhiteSameName whiteSameName, ConditionBeanSetupper<WhiteSameNameRefCB> conditionBeanSetupper) {
        xassLRArg(whiteSameName, conditionBeanSetupper);
        loadWhiteSameNameRefList(xnewLRLs(whiteSameName), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteSameNameRefList with the set-upper for condition-bean of referrer. <br />
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * whiteSameNameBhv.<span style="color: #FD4747">loadWhiteSameNameRefList</span>(whiteSameNameList, new ConditionBeanSetupper&lt;WhiteSameNameRefCB&gt;() {
     *     public void setup(WhiteSameNameRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteSameName whiteSameName : whiteSameNameList) {
     *     ... = whiteSameName.<span style="color: #FD4747">getWhiteSameNameRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameRefList(List<WhiteSameName> whiteSameNameList, ConditionBeanSetupper<WhiteSameNameRefCB> conditionBeanSetupper) {
        xassLRArg(whiteSameNameList, conditionBeanSetupper);
        loadWhiteSameNameRefList(whiteSameNameList, new LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameRefList(WhiteSameName whiteSameName, LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameName, loadReferrerOption);
        loadWhiteSameNameRefList(xnewLRLs(whiteSameName), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameRefList(List<WhiteSameName> whiteSameNameList, LoadReferrerOption<WhiteSameNameRefCB, WhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameNameList, loadReferrerOption);
        if (whiteSameNameList.isEmpty()) { return; }
        final WhiteSameNameRefBhv referrerBhv = xgetBSFLR().select(WhiteSameNameRefBhv.class);
        helpLoadReferrerInternally(whiteSameNameList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteSameName, Long, WhiteSameNameRefCB, WhiteSameNameRef>() {
            public Long getPKVal(WhiteSameName e)
            { return e.getSameNameId(); }
            public void setRfLs(WhiteSameName e, List<WhiteSameNameRef> ls)
            { e.setWhiteSameNameRefList(ls); }
            public WhiteSameNameRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSameNameRefCB cb, List<Long> ls)
            { cb.query().setSameNameId_InScope(ls); }
            public void qyOdFKAsc(WhiteSameNameRefCB cb) { cb.query().addOrderBy_SameNameId_Asc(); }
            public void spFKCol(WhiteSameNameRefCB cb) { cb.specify().columnSameNameId(); }
            public List<WhiteSameNameRef> selRfLs(WhiteSameNameRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteSameNameRef e) { return e.getSameNameId(); }
            public void setlcEt(WhiteSameNameRef re, WhiteSameName le)
            { re.setWhiteSameName(le); }
            public String getRfPrNm() { return "whiteSameNameRefList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextSchemaProduct'.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextSchemaProduct> pulloutNextSchemaProduct(List<WhiteSameName> whiteSameNameList) {
        return helpPulloutInternally(whiteSameNameList, new InternalPulloutCallback<WhiteSameName, NextSchemaProduct>() {
            public NextSchemaProduct getFr(WhiteSameName e) { return e.getNextSchemaProduct(); }
            public boolean hasRf() { return true; }
            public void setRfLs(NextSchemaProduct e, List<WhiteSameName> ls)
            { e.setWhiteSameNameList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameId.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSameNameIdList(List<WhiteSameName> whiteSameNameList) {
        return helpExtractListInternally(whiteSameNameList, new InternalExtractCallback<WhiteSameName, Long>() {
            public Long getCV(WhiteSameName e) { return e.getSameNameId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * whiteSameNameBhv.<span style="color: #FD4747">insert</span>(whiteSameName);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameName The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteSameName whiteSameName) {
        doInsert(whiteSameName, null);
    }

    protected void doInsert(WhiteSameName whiteSameName, InsertOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareInsertOption(option);
        delegateInsert(whiteSameName, option);
    }

    protected void prepareInsertOption(InsertOption<WhiteSameNameCB> option) {
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #FD4747">update</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteSameName whiteSameName) {
        doUpdate(whiteSameName, null);
    }

    protected void doUpdate(WhiteSameName whiteSameName, final UpdateOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareUpdateOption(option);
        helpUpdateInternally(whiteSameName, new InternalUpdateCallback<WhiteSameName>() {
            public int callbackDelegateUpdate(WhiteSameName entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteSameNameCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteSameNameCB createCBForVaryingUpdate() {
        WhiteSameNameCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteSameNameCB createCBForSpecifiedUpdate() {
        WhiteSameNameCB cb = newMyConditionBean();
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
     * @param whiteSameName The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteSameName whiteSameName) {
        doInesrtOrUpdate(whiteSameName, null, null);
    }

    protected void doInesrtOrUpdate(WhiteSameName whiteSameName, final InsertOption<WhiteSameNameCB> insertOption, final UpdateOption<WhiteSameNameCB> updateOption) {
        helpInsertOrUpdateInternally(whiteSameName, new InternalInsertOrUpdateCallback<WhiteSameName, WhiteSameNameCB>() {
            public void callbackInsert(WhiteSameName entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(WhiteSameName entity) { doUpdate(entity, updateOption); }
            public WhiteSameNameCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteSameNameCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<WhiteSameNameCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<WhiteSameNameCB>() : updateOption;
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteSameNameBhv.<span style="color: #FD4747">delete</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteSameName whiteSameName) {
        doDelete(whiteSameName, null);
    }

    protected void doDelete(WhiteSameName whiteSameName, final DeleteOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameName", whiteSameName);
        prepareDeleteOption(option);
        helpDeleteInternally(whiteSameName, new InternalDeleteCallback<WhiteSameName>() {
            public int callbackDelegateDelete(WhiteSameName entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteSameNameCB> option) {
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
     *     WhiteSameName whiteSameName = new WhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * whiteSameNameBhv.<span style="color: #FD4747">batchInsert</span>(whiteSameNameList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteSameName> whiteSameNameList) {
        InsertOption<WhiteSameNameCB> option = createInsertUpdateOption();
        return doBatchInsert(whiteSameNameList, option);
    }

    protected int[] doBatchInsert(List<WhiteSameName> whiteSameNameList, InsertOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareBatchInsertOption(whiteSameNameList, option);
        return delegateBatchInsert(whiteSameNameList, option);
    }

    protected void prepareBatchInsertOption(List<WhiteSameName> whiteSameNameList, InsertOption<WhiteSameNameCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteSameNameList);
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
     *     WhiteSameName whiteSameName = new WhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     } else {
     *         whiteSameName.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameName.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList);
     * </pre>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameName> whiteSameNameList) {
        UpdateOption<WhiteSameNameCB> option = createPlainUpdateOption();
        return doBatchUpdate(whiteSameNameList, option);
    }

    protected int[] doBatchUpdate(List<WhiteSameName> whiteSameNameList, UpdateOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareBatchUpdateOption(whiteSameNameList, option);
        return delegateBatchUpdate(whiteSameNameList, option);
    }

    protected void prepareBatchUpdateOption(List<WhiteSameName> whiteSameNameList, UpdateOption<WhiteSameNameCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteSameNameList);
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
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<WhiteSameNameCB>() {
     *     public void specify(WhiteSameNameCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteSameNameBhv.<span style="color: #FD4747">batchUpdate</span>(whiteSameNameList, new SpecifyQuery<WhiteSameNameCB>() {
     *     public void specify(WhiteSameNameCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteSameName> whiteSameNameList, SpecifyQuery<WhiteSameNameCB> updateColumnSpec) {
        return doBatchUpdate(whiteSameNameList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteSameName> whiteSameNameList) {
        return doBatchDelete(whiteSameNameList, null);
    }

    protected int[] doBatchDelete(List<WhiteSameName> whiteSameNameList, DeleteOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameNameList", whiteSameNameList);
        prepareDeleteOption(option);
        return delegateBatchDelete(whiteSameNameList, option);
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
     * whiteSameNameBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteSameName, WhiteSameNameCB&gt;() {
     *     public ConditionBean setup(whiteSameName entity, WhiteSameNameCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> setupper, InsertOption<WhiteSameNameCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        WhiteSameName entity = new WhiteSameName();
        WhiteSameNameCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected WhiteSameNameCB createCBForQueryInsert() {
        WhiteSameNameCB cb = newMyConditionBean();
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">queryUpdate</span>(whiteSameName, cb);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteSameName whiteSameName, WhiteSameNameCB cb) {
        return doQueryUpdate(whiteSameName, cb, null);
    }

    protected int doQueryUpdate(WhiteSameName whiteSameName, WhiteSameNameCB cb, UpdateOption<WhiteSameNameCB> option) {
        assertObjectNotNull("whiteSameName", whiteSameName); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteSameName, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (WhiteSameNameCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (WhiteSameNameCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * whiteSameNameBhv.<span style="color: #FD4747">queryDelete</span>(whiteSameName, cb);
     * </pre>
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteSameNameCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteSameNameCB cb, DeleteOption<WhiteSameNameCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((WhiteSameNameCB)cb); }
        else { return varyingQueryDelete((WhiteSameNameCB)cb, downcast(option)); }
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * InsertOption<WhiteSameNameCB> option = new InsertOption<WhiteSameNameCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteSameNameBhv.<span style="color: #FD4747">varyingInsert</span>(whiteSameName, option);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameName The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteSameName whiteSameName, InsertOption<WhiteSameNameCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteSameName, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteSameName whiteSameName = new WhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteSameName.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteSameNameCB&gt; option = new UpdateOption&lt;WhiteSameNameCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteSameNameCB&gt;() {
     *         public void specify(WhiteSameNameCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteSameNameBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteSameName, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteSameName whiteSameName, UpdateOption<WhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteSameName, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameName The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteSameName whiteSameName, InsertOption<WhiteSameNameCB> insertOption, UpdateOption<WhiteSameNameCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteSameName, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameName The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteSameName whiteSameName, DeleteOption<WhiteSameNameCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteSameName, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteSameName> whiteSameNameList, InsertOption<WhiteSameNameCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteSameNameList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteSameName> whiteSameNameList, UpdateOption<WhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteSameNameList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteSameName> whiteSameNameList, DeleteOption<WhiteSameNameCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteSameNameList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> setupper, InsertOption<WhiteSameNameCB> option) {
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
     * WhiteSameName whiteSameName = new WhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * WhiteSameNameCB cb = new WhiteSameNameCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteSameNameCB&gt; option = new UpdateOption&lt;WhiteSameNameCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteSameNameCB&gt;() {
     *     public void specify(WhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteSameNameBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteSameName, cb, option);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteSameName whiteSameName, WhiteSameNameCB cb, UpdateOption<WhiteSameNameCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteSameName, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteSameName. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteSameNameCB cb, DeleteOption<WhiteSameNameCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteSameNameBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteSameNameCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteSameNameCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteSameName> void delegateSelectCursor(WhiteSameNameCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends WhiteSameName> List<ENTITY> delegateSelectList(WhiteSameNameCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteSameName e, InsertOption<WhiteSameNameCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(WhiteSameName e, UpdateOption<WhiteSameNameCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(WhiteSameName e, UpdateOption<WhiteSameNameCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(WhiteSameName e, DeleteOption<WhiteSameNameCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(WhiteSameName e, DeleteOption<WhiteSameNameCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<WhiteSameName> ls, InsertOption<WhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteSameName> ls, UpdateOption<WhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteSameName> ls, UpdateOption<WhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteSameName> ls, DeleteOption<WhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteSameName> ls, DeleteOption<WhiteSameNameCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteSameName e, WhiteSameNameCB inCB, ConditionBean resCB, InsertOption<WhiteSameNameCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteSameName e, WhiteSameNameCB cb, UpdateOption<WhiteSameNameCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(WhiteSameNameCB cb, DeleteOption<WhiteSameNameCB> op)
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
    protected WhiteSameName downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, WhiteSameName.class);
    }

    protected WhiteSameNameCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteSameNameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteSameName> downcast(List<? extends Entity> entityList) {
        return (List<WhiteSameName>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteSameNameCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<WhiteSameNameCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteSameNameCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<WhiteSameNameCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteSameNameCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<WhiteSameNameCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteSameName, WhiteSameNameCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<WhiteSameName, WhiteSameNameCB>)option;
    }
}
