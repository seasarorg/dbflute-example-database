package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
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
     * int count = nextSchemaProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
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
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (nextSchemaProduct != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = nextSchemaProduct.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntity(NextSchemaProductCB cb) {
        return doSelectEntity(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectEntity(NextSchemaProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends NextSchemaProduct> OptionalEntity<ENTITY> doSelectOptionalEntity(NextSchemaProductCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * NextSchemaProduct nextSchemaProduct = nextSchemaProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectEntityWithDeletedCheck(NextSchemaProductCB cb) {
        return doSelectEntityWithDeletedCheck(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectEntityWithDeletedCheck(NextSchemaProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValue(Integer productId) {
        return doSelectByPK(productId, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPK(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(productId), entityType);
    }

    protected <ENTITY extends NextSchemaProduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer productId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(productId, entityType), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId : PK, ID, NotNull, serial(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProduct selectByPKValueWithDeletedCheck(Integer productId) {
        return doSelectByPKWithDeletedCheck(productId, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ENTITY doSelectByPKWithDeletedCheck(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), entityType);
    }

    protected NextSchemaProductCB xprepareCBAsPK(Integer productId) {
        assertObjectNotNull("productId", productId);
        NextSchemaProductCB cb = newMyConditionBean(); cb.acceptPrimaryKey(productId);
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
     * ListResultBean&lt;NextSchemaProduct&gt; nextSchemaProductList = nextSchemaProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (NextSchemaProduct nextSchemaProduct : nextSchemaProductList) {
     *     ... = nextSchemaProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProduct> selectList(NextSchemaProductCB cb) {
        return doSelectList(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> ListResultBean<ENTITY> doSelectList(NextSchemaProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, NextSchemaProductCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProduct&gt; page = nextSchemaProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
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
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProduct> selectPage(NextSchemaProductCB cb) {
        return doSelectPage(cb, NextSchemaProduct.class);
    }

    protected <ENTITY extends NextSchemaProduct> PagingResultBean<ENTITY> doSelectPage(NextSchemaProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, NextSchemaProductCB>() {
            public int callbackSelectCount(NextSchemaProductCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * nextSchemaProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextSchemaProduct&gt;() {
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

    protected <ENTITY extends NextSchemaProduct> void doSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, NextSchemaProductCB>() {
            public void callbackSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(NextSchemaProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * nextSchemaProductBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextSchemaProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
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

    protected <RESULT, CB extends NextSchemaProductCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends NextSchemaProductCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
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

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return selectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of whiteSameNameList by the set-upper of referrer. <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * <pre>
     * nextSchemaProductBhv.<span style="color: #DD4747">loadWhiteSameNameList</span>(nextSchemaProductList, new ConditionBeanSetupper&lt;WhiteSameNameCB&gt;() {
     *     public void setup(WhiteSameNameCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (NextSchemaProduct nextSchemaProduct : nextSchemaProductList) {
     *     ... = nextSchemaProduct.<span style="color: #DD4747">getWhiteSameNameList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextSchemaProductId_InScope(pkList);
     * cb.query().addOrderBy_NextSchemaProductId_Asc();
     * </pre>
     * @param nextSchemaProductList The entity list of nextSchemaProduct. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSameName> loadWhiteSameNameList(List<NextSchemaProduct> nextSchemaProductList, ConditionBeanSetupper<WhiteSameNameCB> setupper) {
        xassLRArg(nextSchemaProductList, setupper);
        return doLoadWhiteSameNameList(nextSchemaProductList, new LoadReferrerOption<WhiteSameNameCB, WhiteSameName>().xinit(setupper));
    }

    /**
     * Load referrer of whiteSameNameList by the set-upper of referrer. <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * <pre>
     * nextSchemaProductBhv.<span style="color: #DD4747">loadWhiteSameNameList</span>(nextSchemaProductList, new ConditionBeanSetupper&lt;WhiteSameNameCB&gt;() {
     *     public void setup(WhiteSameNameCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = nextSchemaProduct.<span style="color: #DD4747">getWhiteSameNameList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextSchemaProductId_InScope(pkList);
     * cb.query().addOrderBy_NextSchemaProductId_Asc();
     * </pre>
     * @param nextSchemaProduct The entity of nextSchemaProduct. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSameName> loadWhiteSameNameList(NextSchemaProduct nextSchemaProduct, ConditionBeanSetupper<WhiteSameNameCB> setupper) {
        xassLRArg(nextSchemaProduct, setupper);
        return doLoadWhiteSameNameList(xnewLRLs(nextSchemaProduct), new LoadReferrerOption<WhiteSameNameCB, WhiteSameName>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param nextSchemaProduct The entity of nextSchemaProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<WhiteSameName> loadWhiteSameNameList(NextSchemaProduct nextSchemaProduct, LoadReferrerOption<WhiteSameNameCB, WhiteSameName> loadReferrerOption) {
        xassLRArg(nextSchemaProduct, loadReferrerOption);
        return loadWhiteSameNameList(xnewLRLs(nextSchemaProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param nextSchemaProductList The entity list of nextSchemaProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<WhiteSameName> loadWhiteSameNameList(List<NextSchemaProduct> nextSchemaProductList, LoadReferrerOption<WhiteSameNameCB, WhiteSameName> loadReferrerOption) {
        xassLRArg(nextSchemaProductList, loadReferrerOption);
        if (nextSchemaProductList.isEmpty()) { return (NestedReferrerLoader<WhiteSameName>)EMPTY_LOADER; }
        return doLoadWhiteSameNameList(nextSchemaProductList, loadReferrerOption);
    }

    protected NestedReferrerLoader<WhiteSameName> doLoadWhiteSameNameList(List<NextSchemaProduct> nextSchemaProductList, LoadReferrerOption<WhiteSameNameCB, WhiteSameName> option) {
        final WhiteSameNameBhv referrerBhv = xgetBSFLR().select(WhiteSameNameBhv.class);
        return helpLoadReferrerInternally(nextSchemaProductList, option, new InternalLoadReferrerCallback<NextSchemaProduct, Integer, WhiteSameNameCB, WhiteSameName>() {
            public Integer getPKVal(NextSchemaProduct et)
            { return et.getProductId(); }
            public void setRfLs(NextSchemaProduct et, List<WhiteSameName> ls)
            { et.setWhiteSameNameList(ls); }
            public WhiteSameNameCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteSameNameCB cb, List<Integer> ls)
            { cb.query().setNextSchemaProductId_InScope(ls); }
            public void qyOdFKAsc(WhiteSameNameCB cb) { cb.query().addOrderBy_NextSchemaProductId_Asc(); }
            public void spFKCol(WhiteSameNameCB cb) { cb.specify().columnNextSchemaProductId(); }
            public List<WhiteSameName> selRfLs(WhiteSameNameCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(WhiteSameName re) { return re.getNextSchemaProductId(); }
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
            public Integer getCV(NextSchemaProduct et) { return et.getProductId(); }
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
     * nextSchemaProductBhv.<span style="color: #DD4747">insert</span>(nextSchemaProduct);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProduct nextSchemaProduct) {
        doInsert(nextSchemaProduct, null);
    }

    protected void doInsert(NextSchemaProduct nextSchemaProduct, InsertOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareInsertOption(op);
        delegateInsert(nextSchemaProduct, op);
    }

    protected void prepareInsertOption(InsertOption<NextSchemaProductCB> op) {
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #DD4747">update</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final NextSchemaProduct nextSchemaProduct) {
        doUpdate(nextSchemaProduct, null);
    }

    protected void doUpdate(NextSchemaProduct nextSchemaProduct, final UpdateOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareUpdateOption(op);
        helpUpdateInternally(nextSchemaProduct, new InternalUpdateCallback<NextSchemaProduct>() {
            public int callbackDelegateUpdate(NextSchemaProduct et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<NextSchemaProductCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
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
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param nextSchemaProduct The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProduct nextSchemaProduct) {
        doInesrtOrUpdate(nextSchemaProduct, null, null);
    }

    protected void doInesrtOrUpdate(NextSchemaProduct nextSchemaProduct, final InsertOption<NextSchemaProductCB> iop, final UpdateOption<NextSchemaProductCB> uop) {
        helpInsertOrUpdateInternally(nextSchemaProduct, new InternalInsertOrUpdateCallback<NextSchemaProduct, NextSchemaProductCB>() {
            public void callbackInsert(NextSchemaProduct et) { doInsert(et, iop); }
            public void callbackUpdate(NextSchemaProduct et) { doUpdate(et, uop); }
            public NextSchemaProductCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(NextSchemaProductCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<NextSchemaProductCB>();
            uop = uop != null ? uop : new UpdateOption<NextSchemaProductCB>();
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
     * NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
     * nextSchemaProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductBhv.<span style="color: #DD4747">delete</span>(nextSchemaProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProduct nextSchemaProduct) {
        doDelete(nextSchemaProduct, null);
    }

    protected void doDelete(NextSchemaProduct nextSchemaProduct, final DeleteOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct);
        prepareDeleteOption(op);
        helpDeleteInternally(nextSchemaProduct, new InternalDeleteCallback<NextSchemaProduct>() {
            public int callbackDelegateDelete(NextSchemaProduct et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<NextSchemaProductCB> op) {
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
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
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
     * nextSchemaProductBhv.<span style="color: #DD4747">batchInsert</span>(nextSchemaProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProduct> nextSchemaProductList) {
        InsertOption<NextSchemaProductCB> op = createInsertUpdateOption();
        return doBatchInsert(nextSchemaProductList, op);
    }

    protected int[] doBatchInsert(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareBatchInsertOption(nextSchemaProductList, op);
        return delegateBatchInsert(nextSchemaProductList, op);
    }

    protected void prepareBatchInsertOption(List<NextSchemaProduct> nextSchemaProductList, InsertOption<NextSchemaProductCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(nextSchemaProductList);
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
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
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
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList);
     * </pre>
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList) {
        UpdateOption<NextSchemaProductCB> op = createPlainUpdateOption();
        return doBatchUpdate(nextSchemaProductList, op);
    }

    protected int[] doBatchUpdate(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareBatchUpdateOption(nextSchemaProductList, op);
        return delegateBatchUpdate(nextSchemaProductList, op);
    }

    protected void prepareBatchUpdateOption(List<NextSchemaProduct> nextSchemaProductList, UpdateOption<NextSchemaProductCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(nextSchemaProductList);
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
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">batchUpdate</span>(nextSchemaProductList, new SpecifyQuery<NextSchemaProductCB>() {
     *     public void specify(NextSchemaProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProduct> nextSchemaProductList, SpecifyQuery<NextSchemaProductCB> updateColumnSpec) {
        return doBatchUpdate(nextSchemaProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextSchemaProduct> nextSchemaProductList) {
        return doBatchDelete(nextSchemaProductList, null);
    }

    protected int[] doBatchDelete(List<NextSchemaProduct> nextSchemaProductList, DeleteOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProductList", nextSchemaProductList);
        prepareDeleteOption(op);
        return delegateBatchDelete(nextSchemaProductList, op);
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
     * nextSchemaProductBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProduct, NextSchemaProductCB&gt;() {
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

    protected int doQueryInsert(QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> sp, InsertOption<NextSchemaProductCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        NextSchemaProduct e = new NextSchemaProduct();
        NextSchemaProductCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
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
     * nextSchemaProductBhv.<span style="color: #DD4747">queryUpdate</span>(nextSchemaProduct, cb);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb) {
        return doQueryUpdate(nextSchemaProduct, cb, null);
    }

    protected int doQueryUpdate(NextSchemaProduct nextSchemaProduct, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> op) {
        assertObjectNotNull("nextSchemaProduct", nextSchemaProduct); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(nextSchemaProduct, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (NextSchemaProductCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (NextSchemaProductCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductCB cb = new NextSchemaProductCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductBhv.<span style="color: #DD4747">queryDelete</span>(nextSchemaProduct, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((NextSchemaProductCB)cb); }
        else { return varyingQueryDelete((NextSchemaProductCB)cb, downcast(op)); }
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
     * nextSchemaProductBhv.<span style="color: #DD4747">varyingInsert</span>(nextSchemaProduct, option);
     * ... = nextSchemaProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * nextSchemaProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductCB&gt; option = new UpdateOption&lt;NextSchemaProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductCB&gt;() {
     *         public void specify(NextSchemaProductCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextSchemaProductBhv.<span style="color: #DD4747">varyingUpdate</span>(nextSchemaProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
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
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
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
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(nextSchemaProduct, cb, option);
     * </pre>
     * @param nextSchemaProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
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
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
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
    protected <ENTITY extends NextSchemaProduct> void delegateSelectCursor(NextSchemaProductCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends NextSchemaProduct> List<ENTITY> delegateSelectList(NextSchemaProductCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }
    protected <RESULT> RESULT delegateSelectNextVal(Class<RESULT> tp) { return invoke(createSelectNextValCommand(tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(NextSchemaProduct et, InsertOption<NextSchemaProductCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(NextSchemaProduct et, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(NextSchemaProduct et, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(NextSchemaProduct et, DeleteOption<NextSchemaProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(NextSchemaProduct et, DeleteOption<NextSchemaProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

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

    protected int delegateQueryInsert(NextSchemaProduct et, NextSchemaProductCB inCB, ConditionBean resCB, InsertOption<NextSchemaProductCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(NextSchemaProduct et, NextSchemaProductCB cb, UpdateOption<NextSchemaProductCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(NextSchemaProductCB cb, DeleteOption<NextSchemaProductCB> op)
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
    protected NextSchemaProduct downcast(Entity et) {
        return helpEntityDowncastInternally(et, NextSchemaProduct.class);
    }

    protected NextSchemaProductCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, NextSchemaProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<NextSchemaProduct> downcast(List<? extends Entity> ls) {
        return (List<NextSchemaProduct>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<NextSchemaProductCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<NextSchemaProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<NextSchemaProductCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<NextSchemaProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<NextSchemaProductCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<NextSchemaProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<NextSchemaProduct, NextSchemaProductCB>)sp;
    }
}
