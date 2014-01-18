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
 * The behavior of next_schema_product as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_id
 *
 * [column]
 *     product_id, product_name
 *
 * [sequence]
 *     nextschema.next_schema_product_product_id_seq
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
 *     white_same_name
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSameNameList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextSchemaProductBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "next_schema_product"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return NextSchemaProductDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextSchemaProductDbm getMyDBMeta() { return NextSchemaProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextSchemaProduct newMyEntity() { return new NextSchemaProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextSchemaProductCB newMyConditionBean() { return new NextSchemaProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * int count = nextSchemaProductBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextSchemaProductCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(NextSchemaProductCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(NextSchemaProductCB cb) { // called by selectPage(cb)
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
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (nextSchemaProduct != null) {
     *     ... = nextSchemaProduct.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntity(NextSchemaProductCB cb) {
        return doSelectEntity(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectEntity(final NextSchemaProductCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntityWithDeletedCheck(NextSchemaProductCB cb) {
        return doSelectEntityWithDeletedCheck(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectEntityWithDeletedCheck(final NextSchemaProductCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValue(Integer productId) {
        return doSelectByPKValue(productId, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPKValue(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(productId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValueWithDeletedCheck(Integer productId) {
        return doSelectByPKValueWithDeletedCheck(productId, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPKValueWithDeletedCheck(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productId), entityType);
    }

    private NextSchemaProductCB buildPKCB(Integer productId) {
        assertObjectNotNull("productId", productId);
        NextSchemaProductCB cb = newMyConditionBean();
        cb.query().setProductId_Equal(productId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextSchemaProduct&gt; nextSchemaProductList = nextSchemaProductBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (NextSchemaProduct nextSchemaProduct : nextSchemaProductList) {
     *     ... = nextSchemaProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProduct> selectList(NextSchemaProductCB cb) {
        return doSelectList(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ListResultBean<ENTITY> doSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProduct&gt; page = nextSchemaProductBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextSchemaProduct nextSchemaProduct : page) {
     *     ... = nextSchemaProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProduct> selectPage(NextSchemaProductCB cb) {
        return doSelectPage(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> PagingResultBean<ENTITY> doSelectPage(NextSchemaProductCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, NextSchemaProductCB>() {
            public int callbackSelectCount(NextSchemaProductCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextSchemaProduct&gt;() {
     *     public void handle(NextSchemaProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of NextSchemaProduct. (NotNull)
     */
    public void selectCursor(NextSchemaProductCB cb, EntityRowHandler<NextSchemaProduct> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> void doSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<NextSchemaProduct>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, NextSchemaProductCB>() {
            public void callbackSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * nextSchemaProductBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<NextSchemaProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends NextSchemaProductCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, resultType);
    }

    protected <RESULT, CB extends NextSchemaProductCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> resultType) {
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br />
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Integer selectNextVal() {
        return doSelectNextVal(Integer.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> resultType) {
        return delegateSelectNextVal(resultType);
    }

    @Override
    protected Number doReadNextVal() {
        return selectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param nextSchemaProduct The entity of nextSchemaProduct. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameList(NextSchemaProduct nextSchemaProduct, ConditionBeanSetupper<WhiteSameNameCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProduct, conditionBeanSetupper);
        loadWhiteSameNameList(xnewLRLs(nextSchemaProduct), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteSameNameList with the set-upper for condition-bean of referrer. <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * <pre>
     * nextSchemaProductBhv.<span style="color: #FD4747">loadWhiteSameNameList</span>(nextSchemaProductList, new ConditionBeanSetupper&lt;WhiteSameNameCB&gt;() {
     *     public void setup(WhiteSameNameCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (NextSchemaProduct nextSchemaProduct : nextSchemaProductList) {
     *     ... = nextSchemaProduct.<span style="color: #FD4747">getWhiteSameNameList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setNextSchemaProductId_InScope(pkList);
     * cb.query().addOrderBy_NextSchemaProductId_Asc();
     * </pre>
     * @param nextSchemaProductList The entity list of nextSchemaProduct. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteSameNameList(List<NextSchemaProduct> nextSchemaProductList, ConditionBeanSetupper<WhiteSameNameCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProductList, conditionBeanSetupper);
        loadWhiteSameNameList(nextSchemaProductList, new LoadReferrerOption<WhiteSameNameCB, WhiteSameName>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param nextSchemaProduct The entity of nextSchemaProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameList(NextSchemaProduct nextSchemaProduct, LoadReferrerOption<WhiteSameNameCB, WhiteSameName> loadReferrerOption) {
        xassLRArg(nextSchemaProduct, loadReferrerOption);
        loadWhiteSameNameList(xnewLRLs(nextSchemaProduct), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param nextSchemaProductList The entity list of nextSchemaProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteSameNameList(List<NextSchemaProduct> nextSchemaProductList, LoadReferrerOption<WhiteSameNameCB, WhiteSameName> loadReferrerOption) {
        xassLRArg(nextSchemaProductList, loadReferrerOption);
        if (nextSchemaProductList.isEmpty()) { return; }
        final WhiteSameNameBhv referrerBhv = xgetBSFLR().select(WhiteSameNameBhv.class);
        helpLoadReferrerInternally(nextSchemaProductList, loadReferrerOption, new InternalLoadReferrerCallback<NextSchemaProduct, Integer, WhiteSameNameCB, WhiteSameName>() {
            public Integer getPKVal(NextSchemaProduct e)
            { return e.getProductId(); }
            public void setRfLs(NextSchemaProduct e, List<WhiteSameName> ls)
            { e.setWhiteSameNameList(ls); }
            public WhiteSameNameCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSameNameCB cb, List<Integer> ls)
            { cb.query().setNextSchemaProductId_InScope(ls); }
            public void qyOdFKAsc(WhiteSameNameCB cb) { cb.query().addOrderBy_NextSchemaProductId_Asc(); }
            public void spFKCol(WhiteSameNameCB cb) { cb.specify().columnNextSchemaProductId(); }
            public List<WhiteSameName> selRfLs(WhiteSameNameCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteSameName e) { return e.getNextSchemaProductId(); }
            public void setlcEt(WhiteSameName re, NextSchemaProduct le)
            { re.setNextSchemaProduct(le); }
            public String getRfPrNm() { return "whiteSameNameList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param nextSchemaProductList The list of nextSchemaProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractProductIdList(List<NextSchemaProduct> nextSchemaProductList) {
        return helpExtractListInternally(nextSchemaProductList, new InternalExtractCallback<NextSchemaProduct, Integer>() {
            public Integer getCV(NextSchemaProduct e) { return e.getProductId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProduct.setFoo...(value);
     * nextSchemaProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * nextSchemaProductBhv.<span style="color: #FD4747">insert</span>(nextSchemaProduct);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProduct nextSchemaProduct) {
        doInsert(nextSchemaProduct, null);
    }

    protected void doInsert(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareInsertOption(option);
        delegateInsert(nextSchemaProduct, option);
    }

    protected void prepareInsertOption(InsertOption<NextSchemaProductCB> option) {
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #FD4747">update</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final NextSchemaProduct nextSchemaProduct) {
        doUpdate(nextSchemaProduct, null);
    }

    protected void doUpdate(NextSchemaProduct nextSchemaProduct, final UpdateOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareUpdateOption(option);
        helpUpdateInternally(nextSchemaProduct, new InternalUpdateCallback<NextSchemaProduct>() {
            public int callbackDelegateUpdate(NextSchemaProduct entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<NextSchemaProductCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected NextSchemaProductCB createCBForVaryingUpdate() {
        NextSchemaProductCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected NextSchemaProductCB createCBForSpecifiedUpdate() {
        NextSchemaProductCB cb = newMyConditionBean();
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
     * @param nextSchemaProduct The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProduct nextSchemaProduct) {
        doInesrtOrUpdate(nextSchemaProduct, null, null);
    }

    protected void doInesrtOrUpdate(NextSchemaProduct nextSchemaProduct, final InsertOption<NextSchemaProductCB> insertOption, final UpdateOption<NextSchemaProductCB> updateOption) {
        helpInsertOrUpdateInternally(nextSchemaProduct, new InternalInsertOrUpdateCallback<NextSchemaProduct, NextSchemaProductCB>() {
            public void callbackInsert(NextSchemaProduct entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(NextSchemaProduct entity) { doUpdate(entity, updateOption); }
            public NextSchemaProductCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(NextSchemaProductCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<NextSchemaProductCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<NextSchemaProductCB>() : updateOption;
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #FD4747">delete</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProduct nextSchemaProduct) {
        doDelete(nextSchemaProduct, null);
    }

    protected void doDelete(NextSchemaProduct nextSchemaProduct, final DeleteOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareDeleteOption(option);
        helpDeleteInternally(nextSchemaProduct, new InternalDeleteCallback<NextSchemaProduct>() {
            public int callbackDelegateDelete(NextSchemaProduct entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<NextSchemaProductCB> option) {
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
     *     NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     *     nextSchemaProduct.setFooName("foo");
     *     if (...) {
     *         nextSchemaProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextSchemaProductList.add(nextSchemaProduct);
     * }
     * nextSchemaProductBhv.<span style="color: #FD4747">batchInsert</span>(nextSchemaProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProduct> nextSchemaProductList) {
        InsertOption<NextSchemaProductCB> option = createInsertUpdateOption();
        return doBatchInsert(nextSchemaProductList, option);
    }

    protected int[] doBatchInsert(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareBatchInsertOption(nextSchemaProductList, option);
        return delegateBatchInsert(nextSchemaProductList, option);
    }

    protected void prepareBatchInsertOption(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(nextSchemaProductList);
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
     *     NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     *     nextSchemaProduct.setFooName("foo");
     *     if (...) {
     *         nextSchemaProduct.setFooPrice(123);
     *     } else {
     *         nextSchemaProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductList.add(nextSchemaProduct);
     * }
     * nextSchemaProductBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductList);
     * </pre>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList) {
        UpdateOption<NextSchemaProductCB> option = createPlainUpdateOption();
        return doBatchUpdate(nextSchemaProductList, option);
    }

    protected int[] doBatchUpdate(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareBatchUpdateOption(nextSchemaProductList, option);
        return delegateBatchUpdate(nextSchemaProductList, option);
    }

    protected void prepareBatchUpdateOption(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(nextSchemaProductList);
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
     * nextSchemaProductBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextSchemaProductBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList, SpecifyQuery<NextSchemaProductCB> updateColumnSpec) {
        return doBatchUpdate(nextSchemaProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchDelete(nextSchemaProductList, null);
    }

    protected int[] doBatchDelete(List<NextSchemaProduct> nextSchemaProductList, DeleteOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareDeleteOption(option);
        return delegateBatchDelete(nextSchemaProductList, option);
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
     * nextSchemaProductBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProduct, NextSchemaProductCB&gt;() {
     *     public ConditionBean setup(nextSchemaProduct entity, NextSchemaProductCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> setupper, InsertOption<NextSchemaProductCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        NextSchemaProduct entity = new NextSchemaProduct();
        NextSchemaProductCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected NextSchemaProductCB createCBForQueryInsert() {
        NextSchemaProductCB cb = newMyConditionBean();
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setPK...(value);</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #FD4747">queryUpdate</span>(nextSchemaProduct, cb);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb) {
        return doQueryUpdate(nextSchemaProduct, cb, null);
    }

    protected int doQueryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> option) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(nextSchemaProduct, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (NextSchemaProductCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (NextSchemaProductCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #FD4747">queryDelete</span>(nextSchemaProduct, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((NextSchemaProductCB)cb); }
        else { return varyingQueryDelete((NextSchemaProductCB)cb, downcast(option)); }
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProduct.setFoo...(value);
     * nextSchemaProduct.setBar...(value);
     * InsertOption<NextSchemaProductCB> option = new InsertOption<NextSchemaProductCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * nextSchemaProductBhv.<span style="color: #FD4747">varyingInsert</span>(nextSchemaProduct, option);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(nextSchemaProduct, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProduct.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *         public void specify(NextSchemaProductCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextSchemaProductBhv.<span style="color: #FD4747">varyingUpdate</span>(nextSchemaProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextSchemaProduct nextSchemaProduct, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(nextSchemaProduct, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextSchemaProduct The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> insertOption, UpdateOption<NextSchemaProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(nextSchemaProduct, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param nextSchemaProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextSchemaProduct nextSchemaProduct, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(nextSchemaProduct, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(nextSchemaProductList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(nextSchemaProductList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextSchemaProduct> nextSchemaProductList, DeleteOption<NextSchemaProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(nextSchemaProductList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> setupper, InsertOption<NextSchemaProductCB> option) {
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setPK...(value);</span>
     * nextSchemaProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setVersionNo(value);</span>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *     public void specify(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(nextSchemaProduct, cb, option);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(nextSchemaProduct, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> option) {
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
    public OutsideSqlBasicExecutor<NextSchemaProductBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(NextSchemaProductCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(NextSchemaProductCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends NextSchemaProduct> void delegateSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends NextSchemaProduct> List<ENTITY> delegateSelectList(NextSchemaProductCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }
    protected <RESULT> RESULT delegateSelectNextVal(Class<RESULT> rt) { return invoke(createSelectNextValCommand(rt)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(NextSchemaProduct e, InsertOption<NextSchemaProductCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(NextSchemaProduct e, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(NextSchemaProduct e, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(NextSchemaProduct e, DeleteOption<NextSchemaProductCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(NextSchemaProduct e, DeleteOption<NextSchemaProductCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<NextSchemaProduct> ls, InsertOption<NextSchemaProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<NextSchemaProduct> ls, UpdateOption<NextSchemaProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<NextSchemaProduct> ls, UpdateOption<NextSchemaProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<NextSchemaProduct> ls, DeleteOption<NextSchemaProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<NextSchemaProduct> ls, DeleteOption<NextSchemaProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(NextSchemaProduct e, NextSchemaProductCB inCB, ConditionBean resCB, InsertOption<NextSchemaProductCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(NextSchemaProduct e, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> op)
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
    protected NextSchemaProduct downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, NextSchemaProduct.class);
    }

    protected NextSchemaProductCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, NextSchemaProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<NextSchemaProduct> downcast(List<? extends Entity> entityList) {
        return (List<NextSchemaProduct>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<NextSchemaProductCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<NextSchemaProductCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<NextSchemaProductCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<NextSchemaProductCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<NextSchemaProductCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<NextSchemaProductCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB>)option;
    }
}
