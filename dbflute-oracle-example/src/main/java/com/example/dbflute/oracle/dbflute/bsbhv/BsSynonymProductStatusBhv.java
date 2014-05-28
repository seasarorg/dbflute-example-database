package com.example.dbflute.oracle.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.oracle.dbflute.exbhv.*;
import com.example.dbflute.oracle.dbflute.exentity.*;
import com.example.dbflute.oracle.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.oracle.dbflute.cbean.*;

/**
 * The behavior of SYNONYM_PRODUCT_STATUS as SYNONYM. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     SYNONYM_PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     synonymProductList
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymProductStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SYNONYM_PRODUCT_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SynonymProductStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SynonymProductStatusDbm getMyDBMeta() { return SynonymProductStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SynonymProductStatus newMyEntity() { return new SynonymProductStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SynonymProductStatusCB newMyConditionBean() { return new SynonymProductStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * int count = synonymProductStatusBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SynonymProductStatusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SynonymProductStatusCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SynonymProductStatusCB cb) { // called by selectPage(cb)
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * SynonymProductStatus synonymProductStatus = synonymProductStatusBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (synonymProductStatus != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = synonymProductStatus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectEntity(SynonymProductStatusCB cb) {
        return doSelectEntity(cb, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectEntity(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SynonymProductStatusCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductStatusCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectOptionalEntity(SynonymProductStatusCB cb, Class<ENTITY> tp) {
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * SynonymProductStatus synonymProductStatus = synonymProductStatusBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = synonymProductStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectEntityWithDeletedCheck(SynonymProductStatusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectEntityWithDeletedCheck(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SynonymProductStatusCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductStatusCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productStatusCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectByPKValue(String productStatusCode) {
        return doSelectByPK(productStatusCode, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectByPK(String productStatusCode, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(productStatusCode), entityType);
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectOptionalByPK(String productStatusCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(productStatusCode, entityType), productStatusCode);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productStatusCode : PK, NotNull, CHAR(3). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SynonymProductStatus selectByPKValueWithDeletedCheck(String productStatusCode) {
        return doSelectByPKWithDeletedCheck(productStatusCode, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> ENTITY doSelectByPKWithDeletedCheck(String productStatusCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productStatusCode), entityType);
    }

    protected SynonymProductStatusCB xprepareCBAsPK(String productStatusCode) {
        assertObjectNotNull("productStatusCode", productStatusCode);
        SynonymProductStatusCB cb = newMyConditionBean(); cb.acceptPrimaryKey(productStatusCode);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param productStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SynonymProductStatus> selectByUniqueOf(String productStatusName) {
        return doSelectByUniqueOf(productStatusName, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> OptionalEntity<ENTITY> doSelectByUniqueOf(String productStatusName, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(productStatusName), entityType), productStatusName);
    }

    protected SynonymProductStatusCB xprepareCBAsUniqueOf(String productStatusName) {
        assertObjectNotNull("productStatusName", productStatusName);
        SynonymProductStatusCB cb = newMyConditionBean(); cb.acceptUniqueOf(productStatusName);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SynonymProductStatus&gt; synonymProductStatusList = synonymProductStatusBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SynonymProductStatus synonymProductStatus : synonymProductStatusList) {
     *     ... = synonymProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SynonymProductStatus> selectList(SynonymProductStatusCB cb) {
        return doSelectList(cb, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> ListResultBean<ENTITY> doSelectList(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SynonymProductStatusCB>() {
            public List<ENTITY> callbackSelectList(SynonymProductStatusCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SynonymProductStatus&gt; page = synonymProductStatusBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SynonymProductStatus synonymProductStatus : page) {
     *     ... = synonymProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SynonymProductStatus> selectPage(SynonymProductStatusCB cb) {
        return doSelectPage(cb, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> PagingResultBean<ENTITY> doSelectPage(SynonymProductStatusCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SynonymProductStatusCB>() {
            public int callbackSelectCount(SynonymProductStatusCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SynonymProductStatusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SynonymProductStatus&gt;() {
     *     public void handle(SynonymProductStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of SynonymProductStatus. (NotNull)
     */
    public void selectCursor(SynonymProductStatusCB cb, EntityRowHandler<SynonymProductStatus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SynonymProductStatus.class);
    }

    protected <ENTITY extends SynonymProductStatus> void doSelectCursor(SynonymProductStatusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SynonymProductStatusCB>() {
            public void callbackSelectCursor(SynonymProductStatusCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SynonymProductStatusCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * synonymProductStatusBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SynonymProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SynonymProductStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SynonymProductStatusCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SynonymProductStatusCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * Load referrer of synonymProductList by the set-upper of referrer. <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * <pre>
     * synonymProductStatusBhv.<span style="color: #DD4747">loadSynonymProductList</span>(synonymProductStatusList, new ConditionBeanSetupper&lt;SynonymProductCB&gt;() {
     *     public void setup(SynonymProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (SynonymProductStatus synonymProductStatus : synonymProductStatusList) {
     *     ... = synonymProductStatus.<span style="color: #DD4747">getSynonymProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param synonymProductStatusList The entity list of synonymProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymProduct> loadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, ConditionBeanSetupper<SynonymProductCB> setupper) {
        xassLRArg(synonymProductStatusList, setupper);
        return doLoadSynonymProductList(synonymProductStatusList, new LoadReferrerOption<SynonymProductCB, SynonymProduct>().xinit(setupper));
    }

    /**
     * Load referrer of synonymProductList by the set-upper of referrer. <br />
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * <pre>
     * synonymProductStatusBhv.<span style="color: #DD4747">loadSynonymProductList</span>(synonymProductStatusList, new ConditionBeanSetupper&lt;SynonymProductCB&gt;() {
     *     public void setup(SynonymProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = synonymProductStatus.<span style="color: #DD4747">getSynonymProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param synonymProductStatus The entity of synonymProductStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymProduct> loadSynonymProductList(SynonymProductStatus synonymProductStatus, ConditionBeanSetupper<SynonymProductCB> setupper) {
        xassLRArg(synonymProductStatus, setupper);
        return doLoadSynonymProductList(xnewLRLs(synonymProductStatus), new LoadReferrerOption<SynonymProductCB, SynonymProduct>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param synonymProductStatus The entity of synonymProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<SynonymProduct> loadSynonymProductList(SynonymProductStatus synonymProductStatus, LoadReferrerOption<SynonymProductCB, SynonymProduct> loadReferrerOption) {
        xassLRArg(synonymProductStatus, loadReferrerOption);
        return loadSynonymProductList(xnewLRLs(synonymProductStatus), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param synonymProductStatusList The entity list of synonymProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<SynonymProduct> loadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, LoadReferrerOption<SynonymProductCB, SynonymProduct> loadReferrerOption) {
        xassLRArg(synonymProductStatusList, loadReferrerOption);
        if (synonymProductStatusList.isEmpty()) { return (NestedReferrerLoader<SynonymProduct>)EMPTY_LOADER; }
        return doLoadSynonymProductList(synonymProductStatusList, loadReferrerOption);
    }

    protected NestedReferrerLoader<SynonymProduct> doLoadSynonymProductList(List<SynonymProductStatus> synonymProductStatusList, LoadReferrerOption<SynonymProductCB, SynonymProduct> option) {
        final SynonymProductBhv referrerBhv = xgetBSFLR().select(SynonymProductBhv.class);
        return helpLoadReferrerInternally(synonymProductStatusList, option, new InternalLoadReferrerCallback<SynonymProductStatus, String, SynonymProductCB, SynonymProduct>() {
            public String getPKVal(SynonymProductStatus et)
            { return et.getProductStatusCode(); }
            public void setRfLs(SynonymProductStatus et, List<SynonymProduct> ls)
            { et.setSynonymProductList(ls); }
            public SynonymProductCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SynonymProductCB cb, List<String> ls)
            { cb.query().setProductStatusCode_InScope(ls); }
            public void qyOdFKAsc(SynonymProductCB cb) { cb.query().addOrderBy_ProductStatusCode_Asc(); }
            public void spFKCol(SynonymProductCB cb) { cb.specify().columnProductStatusCode(); }
            public List<SynonymProduct> selRfLs(SynonymProductCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(SynonymProduct re) { return re.getProductStatusCode(); }
            public void setlcEt(SynonymProduct re, SynonymProductStatus le)
            { re.setSynonymProductStatus(le); }
            public String getRfPrNm() { return "synonymProductList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productStatusCode.
     * @param synonymProductStatusList The list of synonymProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusCodeList(List<SynonymProductStatus> synonymProductStatusList) {
        return helpExtractListInternally(synonymProductStatusList, new InternalExtractCallback<SynonymProductStatus, String>() {
            public String getCV(SynonymProductStatus et) { return et.getProductStatusCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key productStatusName.
     * @param synonymProductStatusList The list of synonymProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusNameList(List<SynonymProductStatus> synonymProductStatusList) {
        return helpExtractListInternally(synonymProductStatusList, new InternalExtractCallback<SynonymProductStatus, String>() {
            public String getCV(SynonymProductStatus et) { return et.getProductStatusName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProductStatus.setFoo...(value);
     * synonymProductStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">insert</span>(synonymProductStatus);
     * ... = synonymProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param synonymProductStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SynonymProductStatus synonymProductStatus) {
        doInsert(synonymProductStatus, null);
    }

    protected void doInsert(SynonymProductStatus synonymProductStatus, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", synonymProductStatus);
        prepareInsertOption(op);
        delegateInsert(synonymProductStatus, op);
    }

    protected void prepareInsertOption(InsertOption<SynonymProductStatusCB> op) {
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductStatusBhv.<span style="color: #DD4747">update</span>(synonymProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SynonymProductStatus synonymProductStatus) {
        doUpdate(synonymProductStatus, null);
    }

    protected void doUpdate(SynonymProductStatus synonymProductStatus, final UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", synonymProductStatus);
        prepareUpdateOption(op);
        helpUpdateInternally(synonymProductStatus, new InternalUpdateCallback<SynonymProductStatus>() {
            public int callbackDelegateUpdate(SynonymProductStatus et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SynonymProductStatusCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SynonymProductStatusCB createCBForVaryingUpdate() {
        SynonymProductStatusCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SynonymProductStatusCB createCBForSpecifiedUpdate() {
        SynonymProductStatusCB cb = newMyConditionBean();
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
     * @param synonymProductStatus The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SynonymProductStatus synonymProductStatus) {
        doInesrtOrUpdate(synonymProductStatus, null, null);
    }

    protected void doInesrtOrUpdate(SynonymProductStatus synonymProductStatus, final InsertOption<SynonymProductStatusCB> iop, final UpdateOption<SynonymProductStatusCB> uop) {
        helpInsertOrUpdateInternally(synonymProductStatus, new InternalInsertOrUpdateCallback<SynonymProductStatus, SynonymProductStatusCB>() {
            public void callbackInsert(SynonymProductStatus et) { doInsert(et, iop); }
            public void callbackUpdate(SynonymProductStatus et) { doUpdate(et, uop); }
            public SynonymProductStatusCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SynonymProductStatusCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SynonymProductStatusCB>();
            uop = uop != null ? uop : new UpdateOption<SynonymProductStatusCB>();
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     synonymProductStatusBhv.<span style="color: #DD4747">delete</span>(synonymProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SynonymProductStatus synonymProductStatus) {
        doDelete(synonymProductStatus, null);
    }

    protected void doDelete(SynonymProductStatus synonymProductStatus, final DeleteOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", synonymProductStatus);
        prepareDeleteOption(op);
        helpDeleteInternally(synonymProductStatus, new InternalDeleteCallback<SynonymProductStatus>() {
            public int callbackDelegateDelete(SynonymProductStatus et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SynonymProductStatusCB> op) {
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
     *     SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     *     synonymProductStatus.setFooName("foo");
     *     if (...) {
     *         synonymProductStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     synonymProductStatusList.add(synonymProductStatus);
     * }
     * synonymProductStatusBhv.<span style="color: #DD4747">batchInsert</span>(synonymProductStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SynonymProductStatus> synonymProductStatusList) {
        InsertOption<SynonymProductStatusCB> op = createInsertUpdateOption();
        return doBatchInsert(synonymProductStatusList, op);
    }

    protected int[] doBatchInsert(List<SynonymProductStatus> synonymProductStatusList, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", synonymProductStatusList);
        prepareBatchInsertOption(synonymProductStatusList, op);
        return delegateBatchInsert(synonymProductStatusList, op);
    }

    protected void prepareBatchInsertOption(List<SynonymProductStatus> synonymProductStatusList, InsertOption<SynonymProductStatusCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(synonymProductStatusList);
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
     *     SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     *     synonymProductStatus.setFooName("foo");
     *     if (...) {
     *         synonymProductStatus.setFooPrice(123);
     *     } else {
     *         synonymProductStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//synonymProductStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     synonymProductStatusList.add(synonymProductStatus);
     * }
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList);
     * </pre>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymProductStatus> synonymProductStatusList) {
        UpdateOption<SynonymProductStatusCB> op = createPlainUpdateOption();
        return doBatchUpdate(synonymProductStatusList, op);
    }

    protected int[] doBatchUpdate(List<SynonymProductStatus> synonymProductStatusList, UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", synonymProductStatusList);
        prepareBatchUpdateOption(synonymProductStatusList, op);
        return delegateBatchUpdate(synonymProductStatusList, op);
    }

    protected void prepareBatchUpdateOption(List<SynonymProductStatus> synonymProductStatusList, UpdateOption<SynonymProductStatusCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(synonymProductStatusList);
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
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList, new SpecifyQuery<SynonymProductStatusCB>() {
     *     public void specify(SynonymProductStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">batchUpdate</span>(synonymProductStatusList, new SpecifyQuery<SynonymProductStatusCB>() {
     *     public void specify(SynonymProductStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SynonymProductStatus> synonymProductStatusList, SpecifyQuery<SynonymProductStatusCB> updateColumnSpec) {
        return doBatchUpdate(synonymProductStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SynonymProductStatus> synonymProductStatusList) {
        return doBatchDelete(synonymProductStatusList, null);
    }

    protected int[] doBatchDelete(List<SynonymProductStatus> synonymProductStatusList, DeleteOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatusList", synonymProductStatusList);
        prepareDeleteOption(op);
        return delegateBatchDelete(synonymProductStatusList, op);
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
     * synonymProductStatusBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SynonymProductStatus, SynonymProductStatusCB&gt;() {
     *     public ConditionBean setup(synonymProductStatus entity, SynonymProductStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> sp, InsertOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SynonymProductStatus e = new SynonymProductStatus();
        SynonymProductStatusCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SynonymProductStatusCB createCBForQueryInsert() {
        SynonymProductStatusCB cb = newMyConditionBean();
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setPK...(value);</span>
     * synonymProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setVersionNo(value);</span>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">queryUpdate</span>(synonymProductStatus, cb);
     * </pre>
     * @param synonymProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SynonymProductStatus synonymProductStatus, SynonymProductStatusCB cb) {
        return doQueryUpdate(synonymProductStatus, cb, null);
    }

    protected int doQueryUpdate(SynonymProductStatus synonymProductStatus, SynonymProductStatusCB cb, UpdateOption<SynonymProductStatusCB> op) {
        assertObjectNotNull("synonymProductStatus", synonymProductStatus); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(synonymProductStatus, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SynonymProductStatusCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SynonymProductStatusCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * synonymProductStatusBhv.<span style="color: #DD4747">queryDelete</span>(synonymProductStatus, cb);
     * </pre>
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SynonymProductStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SynonymProductStatusCB cb, DeleteOption<SynonymProductStatusCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SynonymProductStatusCB)cb); }
        else { return varyingQueryDelete((SynonymProductStatusCB)cb, downcast(op)); }
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * synonymProductStatus.setFoo...(value);
     * synonymProductStatus.setBar...(value);
     * InsertOption<SynonymProductStatusCB> option = new InsertOption<SynonymProductStatusCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * synonymProductStatusBhv.<span style="color: #DD4747">varyingInsert</span>(synonymProductStatus, option);
     * ... = synonymProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param synonymProductStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SynonymProductStatus synonymProductStatus, InsertOption<SynonymProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(synonymProductStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * synonymProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * synonymProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * synonymProductStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SynonymProductStatusCB&gt; option = new UpdateOption&lt;SynonymProductStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;SynonymProductStatusCB&gt;() {
     *         public void specify(SynonymProductStatusCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     synonymProductStatusBhv.<span style="color: #DD4747">varyingUpdate</span>(synonymProductStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param synonymProductStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SynonymProductStatus synonymProductStatus, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(synonymProductStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param synonymProductStatus The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SynonymProductStatus synonymProductStatus, InsertOption<SynonymProductStatusCB> insertOption, UpdateOption<SynonymProductStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(synonymProductStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param synonymProductStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SynonymProductStatus synonymProductStatus, DeleteOption<SynonymProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(synonymProductStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SynonymProductStatus> synonymProductStatusList, InsertOption<SynonymProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(synonymProductStatusList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SynonymProductStatus> synonymProductStatusList, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(synonymProductStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param synonymProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SynonymProductStatus> synonymProductStatusList, DeleteOption<SynonymProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(synonymProductStatusList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> setupper, InsertOption<SynonymProductStatusCB> option) {
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
     * SynonymProductStatus synonymProductStatus = new SynonymProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setPK...(value);</span>
     * synonymProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//synonymProductStatus.setVersionNo(value);</span>
     * SynonymProductStatusCB cb = new SynonymProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SynonymProductStatusCB&gt; option = new UpdateOption&lt;SynonymProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;SynonymProductStatusCB&gt;() {
     *     public void specify(SynonymProductStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * synonymProductStatusBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(synonymProductStatus, cb, option);
     * </pre>
     * @param synonymProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SynonymProductStatus synonymProductStatus, SynonymProductStatusCB cb, UpdateOption<SynonymProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(synonymProductStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SynonymProductStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SynonymProductStatusCB cb, DeleteOption<SynonymProductStatusCB> option) {
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
    public OutsideSqlBasicExecutor<SynonymProductStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SynonymProductStatusCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SynonymProductStatusCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SynonymProductStatus> void delegateSelectCursor(SynonymProductStatusCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SynonymProductStatus> List<ENTITY> delegateSelectList(SynonymProductStatusCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SynonymProductStatus et, InsertOption<SynonymProductStatusCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SynonymProductStatus et, UpdateOption<SynonymProductStatusCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SynonymProductStatus et, UpdateOption<SynonymProductStatusCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SynonymProductStatus et, DeleteOption<SynonymProductStatusCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SynonymProductStatus et, DeleteOption<SynonymProductStatusCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SynonymProductStatus> ls, InsertOption<SynonymProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SynonymProductStatus> ls, UpdateOption<SynonymProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SynonymProductStatus> ls, UpdateOption<SynonymProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SynonymProductStatus> ls, DeleteOption<SynonymProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SynonymProductStatus> ls, DeleteOption<SynonymProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SynonymProductStatus et, SynonymProductStatusCB inCB, ConditionBean resCB, InsertOption<SynonymProductStatusCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SynonymProductStatus et, SynonymProductStatusCB cb, UpdateOption<SynonymProductStatusCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SynonymProductStatusCB cb, DeleteOption<SynonymProductStatusCB> op)
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
    protected SynonymProductStatus downcast(Entity et) {
        return helpEntityDowncastInternally(et, SynonymProductStatus.class);
    }

    protected SynonymProductStatusCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SynonymProductStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SynonymProductStatus> downcast(List<? extends Entity> ls) {
        return (List<SynonymProductStatus>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SynonymProductStatusCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SynonymProductStatusCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SynonymProductStatusCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SynonymProductStatusCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SynonymProductStatusCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SynonymProductStatusCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SynonymProductStatus, SynonymProductStatusCB>)sp;
    }
}
