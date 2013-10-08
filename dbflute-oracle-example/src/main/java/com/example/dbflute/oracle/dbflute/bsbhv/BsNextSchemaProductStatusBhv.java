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
 * The behavior of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
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
 *     WHITE_REF_NEXT_TARGET, NEXT_SCHEMA_PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteRefNextTargetList, nextSchemaProductList
 * </pre>
 * @author oracleman
 */
public abstract class BsNextSchemaProductStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "NEXT_SCHEMA_PRODUCT_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return NextSchemaProductStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public NextSchemaProductStatusDbm getMyDBMeta() { return NextSchemaProductStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public NextSchemaProductStatus newMyEntity() { return new NextSchemaProductStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public NextSchemaProductStatusCB newMyConditionBean() { return new NextSchemaProductStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * int count = nextSchemaProductStatusBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextSchemaProductStatusCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(NextSchemaProductStatusCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(NextSchemaProductStatusCB cb) { // called by selectPage(cb)
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
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * NextSchemaProductStatus nextSchemaProductStatus = nextSchemaProductStatusBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (nextSchemaProductStatus != null) {
     *     ... = nextSchemaProductStatus.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntity(NextSchemaProductStatusCB cb) {
        return doSelectEntity(cb, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectEntity(final NextSchemaProductStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, entityType, new InternalSelectEntityCallback<ENTITY, NextSchemaProductStatusCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * NextSchemaProductStatus nextSchemaProductStatus = nextSchemaProductStatusBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = nextSchemaProductStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectEntityWithDeletedCheck(NextSchemaProductStatusCB cb) {
        return doSelectEntityWithDeletedCheck(cb, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectEntityWithDeletedCheck(final NextSchemaProductStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, entityType, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, NextSchemaProductStatusCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectByPKValue(String productStatusCode) {
        return doSelectByPKValue(productStatusCode, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectByPKValue(String productStatusCode, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(productStatusCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextSchemaProductStatus selectByPKValueWithDeletedCheck(String productStatusCode) {
        return doSelectByPKValueWithDeletedCheck(productStatusCode, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> ENTITY doSelectByPKValueWithDeletedCheck(String productStatusCode, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(productStatusCode), entityType);
    }

    private NextSchemaProductStatusCB buildPKCB(String productStatusCode) {
        assertObjectNotNull("productStatusCode", productStatusCode);
        NextSchemaProductStatusCB cb = newMyConditionBean();
        cb.query().setProductStatusCode_Equal(productStatusCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;NextSchemaProductStatus&gt; nextSchemaProductStatusList = nextSchemaProductStatusBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextSchemaProductStatus> selectList(NextSchemaProductStatusCB cb) {
        return doSelectList(cb, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> ListResultBean<ENTITY> doSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, NextSchemaProductStatusCB>() {
            public List<ENTITY> callbackSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextSchemaProductStatus&gt; page = nextSchemaProductStatusBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (NextSchemaProductStatus nextSchemaProductStatus : page) {
     *     ... = nextSchemaProductStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextSchemaProductStatus> selectPage(NextSchemaProductStatusCB cb) {
        return doSelectPage(cb, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> PagingResultBean<ENTITY> doSelectPage(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, NextSchemaProductStatusCB>() {
            public int callbackSelectCount(NextSchemaProductStatusCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextSchemaProductStatus&gt;() {
     *     public void handle(NextSchemaProductStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of NextSchemaProductStatus. (NotNull)
     */
    public void selectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<NextSchemaProductStatus> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, NextSchemaProductStatus.class);
    }

    protected <ENTITY extends NextSchemaProductStatus> void doSelectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<NextSchemaProductStatus>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        helpSelectCursorInternally(cb, entityRowHandler, entityType, new InternalSelectCursorCallback<ENTITY, NextSchemaProductStatusCB>() {
            public void callbackSelectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) { delegateSelectCursor(cb, entityRowHandler, entityType); }
            public List<ENTITY> callbackSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<NextSchemaProductStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends NextSchemaProductStatusCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
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
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteRefNextTargetList(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<WhiteRefNextTargetCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProductStatus, conditionBeanSetupper);
        loadWhiteRefNextTargetList(xnewLRLs(nextSchemaProductStatus), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteRefNextTargetList with the set-upper for condition-bean of referrer. <br />
     * WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">loadWhiteRefNextTargetList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;WhiteRefNextTargetCB&gt;() {
     *     public void setup(WhiteRefNextTargetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.<span style="color: #FD4747">getWhiteRefNextTargetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setNextTargetCode_InScope(pkList);
     * cb.query().addOrderBy_NextTargetCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteRefNextTargetList(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<WhiteRefNextTargetCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProductStatusList, conditionBeanSetupper);
        loadWhiteRefNextTargetList(nextSchemaProductStatusList, new LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteRefNextTargetList(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        loadWhiteRefNextTargetList(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteRefNextTargetList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<WhiteRefNextTargetCB, WhiteRefNextTarget> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return; }
        final WhiteRefNextTargetBhv referrerBhv = xgetBSFLR().select(WhiteRefNextTargetBhv.class);
        helpLoadReferrerInternally(nextSchemaProductStatusList, loadReferrerOption, new InternalLoadReferrerCallback<NextSchemaProductStatus, String, WhiteRefNextTargetCB, WhiteRefNextTarget>() {
            public String getPKVal(NextSchemaProductStatus e)
            { return e.getProductStatusCode(); }
            public void setRfLs(NextSchemaProductStatus e, List<WhiteRefNextTarget> ls)
            { e.setWhiteRefNextTargetList(ls); }
            public WhiteRefNextTargetCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteRefNextTargetCB cb, List<String> ls)
            { cb.query().setNextTargetCode_InScope(ls); }
            public void qyOdFKAsc(WhiteRefNextTargetCB cb) { cb.query().addOrderBy_NextTargetCode_Asc(); }
            public void spFKCol(WhiteRefNextTargetCB cb) { cb.specify().columnNextTargetCode(); }
            public List<WhiteRefNextTarget> selRfLs(WhiteRefNextTargetCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteRefNextTarget e) { return e.getNextTargetCode(); }
            public void setlcEt(WhiteRefNextTarget re, NextSchemaProductStatus le)
            { re.setNextSchemaProductStatus(le); }
            public String getRfPrNm() { return "whiteRefNextTargetList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextSchemaProductList(NextSchemaProductStatus nextSchemaProductStatus, ConditionBeanSetupper<NextSchemaProductCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProductStatus, conditionBeanSetupper);
        loadNextSchemaProductList(xnewLRLs(nextSchemaProductStatus), conditionBeanSetupper);
    }
    /**
     * Load referrer of nextSchemaProductList with the set-upper for condition-bean of referrer. <br />
     * (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * <pre>
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">loadNextSchemaProductList</span>(nextSchemaProductStatusList, new ConditionBeanSetupper&lt;NextSchemaProductCB&gt;() {
     *     public void setup(NextSchemaProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (NextSchemaProductStatus nextSchemaProductStatus : nextSchemaProductStatusList) {
     *     ... = nextSchemaProductStatus.<span style="color: #FD4747">getNextSchemaProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadNextSchemaProductList(List<NextSchemaProductStatus> nextSchemaProductStatusList, ConditionBeanSetupper<NextSchemaProductCB> conditionBeanSetupper) {
        xassLRArg(nextSchemaProductStatusList, conditionBeanSetupper);
        loadNextSchemaProductList(nextSchemaProductStatusList, new LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param nextSchemaProductStatus The entity of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextSchemaProductList(NextSchemaProductStatus nextSchemaProductStatus, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatus, loadReferrerOption);
        loadNextSchemaProductList(xnewLRLs(nextSchemaProductStatus), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param nextSchemaProductStatusList The entity list of nextSchemaProductStatus. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextSchemaProductList(List<NextSchemaProductStatus> nextSchemaProductStatusList, LoadReferrerOption<NextSchemaProductCB, NextSchemaProduct> loadReferrerOption) {
        xassLRArg(nextSchemaProductStatusList, loadReferrerOption);
        if (nextSchemaProductStatusList.isEmpty()) { return; }
        final NextSchemaProductBhv referrerBhv = xgetBSFLR().select(NextSchemaProductBhv.class);
        helpLoadReferrerInternally(nextSchemaProductStatusList, loadReferrerOption, new InternalLoadReferrerCallback<NextSchemaProductStatus, String, NextSchemaProductCB, NextSchemaProduct>() {
            public String getPKVal(NextSchemaProductStatus e)
            { return e.getProductStatusCode(); }
            public void setRfLs(NextSchemaProductStatus e, List<NextSchemaProduct> ls)
            { e.setNextSchemaProductList(ls); }
            public NextSchemaProductCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(NextSchemaProductCB cb, List<String> ls)
            { cb.query().setProductStatusCode_InScope(ls); }
            public void qyOdFKAsc(NextSchemaProductCB cb) { cb.query().addOrderBy_ProductStatusCode_Asc(); }
            public void spFKCol(NextSchemaProductCB cb) { cb.specify().columnProductStatusCode(); }
            public List<NextSchemaProduct> selRfLs(NextSchemaProductCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(NextSchemaProduct e) { return e.getProductStatusCode(); }
            public void setlcEt(NextSchemaProduct re, NextSchemaProductStatus le)
            { re.setNextSchemaProductStatus(le); }
            public String getRfPrNm() { return "nextSchemaProductList"; }
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
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusCodeList(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return helpExtractListInternally(nextSchemaProductStatusList, new InternalExtractCallback<NextSchemaProductStatus, String>() {
            public String getCV(NextSchemaProductStatus e) { return e.getProductStatusCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key productStatusName.
     * @param nextSchemaProductStatusList The list of nextSchemaProductStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductStatusNameList(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return helpExtractListInternally(nextSchemaProductStatusList, new InternalExtractCallback<NextSchemaProductStatus, String>() {
            public String getCV(NextSchemaProductStatus e) { return e.getProductStatusName(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">insert</span>(nextSchemaProductStatus);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param nextSchemaProductStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextSchemaProductStatus nextSchemaProductStatus) {
        doInsert(nextSchemaProductStatus, null);
    }

    protected void doInsert(NextSchemaProductStatus nextSchemaProductStatus, InsertOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatus", nextSchemaProductStatus);
        prepareInsertOption(option);
        delegateInsert(nextSchemaProductStatus, option);
    }

    protected void prepareInsertOption(InsertOption<NextSchemaProductStatusCB> option) {
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProductStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductStatusBhv.<span style="color: #FD4747">update</span>(nextSchemaProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param nextSchemaProductStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final NextSchemaProductStatus nextSchemaProductStatus) {
        doUpdate(nextSchemaProductStatus, null);
    }

    protected void doUpdate(NextSchemaProductStatus nextSchemaProductStatus, final UpdateOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatus", nextSchemaProductStatus);
        prepareUpdateOption(option);
        helpUpdateInternally(nextSchemaProductStatus, new InternalUpdateCallback<NextSchemaProductStatus>() {
            public int callbackDelegateUpdate(NextSchemaProductStatus entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<NextSchemaProductStatusCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected NextSchemaProductStatusCB createCBForVaryingUpdate() {
        NextSchemaProductStatusCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected NextSchemaProductStatusCB createCBForSpecifiedUpdate() {
        NextSchemaProductStatusCB cb = newMyConditionBean();
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
     * @param nextSchemaProductStatus The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus) {
        doInesrtOrUpdate(nextSchemaProductStatus, null, null);
    }

    protected void doInesrtOrUpdate(NextSchemaProductStatus nextSchemaProductStatus, final InsertOption<NextSchemaProductStatusCB> insertOption, final UpdateOption<NextSchemaProductStatusCB> updateOption) {
        helpInsertOrUpdateInternally(nextSchemaProductStatus, new InternalInsertOrUpdateCallback<NextSchemaProductStatus, NextSchemaProductStatusCB>() {
            public void callbackInsert(NextSchemaProductStatus entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(NextSchemaProductStatus entity) { doUpdate(entity, updateOption); }
            public NextSchemaProductStatusCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(NextSchemaProductStatusCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<NextSchemaProductStatusCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<NextSchemaProductStatusCB>() : updateOption;
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProductStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     nextSchemaProductStatusBhv.<span style="color: #FD4747">delete</span>(nextSchemaProductStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param nextSchemaProductStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextSchemaProductStatus nextSchemaProductStatus) {
        doDelete(nextSchemaProductStatus, null);
    }

    protected void doDelete(NextSchemaProductStatus nextSchemaProductStatus, final DeleteOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatus", nextSchemaProductStatus);
        prepareDeleteOption(option);
        helpDeleteInternally(nextSchemaProductStatus, new InternalDeleteCallback<NextSchemaProductStatus>() {
            public int callbackDelegateDelete(NextSchemaProductStatus entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<NextSchemaProductStatusCB> option) {
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
     *     NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     if (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">batchInsert</span>(nextSchemaProductStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        InsertOption<NextSchemaProductStatusCB> option = createInsertUpdateOption();
        return doBatchInsert(nextSchemaProductStatusList, option);
    }

    protected int[] doBatchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList, InsertOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatusList", nextSchemaProductStatusList);
        prepareBatchInsertOption(nextSchemaProductStatusList, option);
        return delegateBatchInsert(nextSchemaProductStatusList, option);
    }

    protected void prepareBatchInsertOption(List<NextSchemaProductStatus> nextSchemaProductStatusList, InsertOption<NextSchemaProductStatusCB> option) {
        option.xallowInsertColumnModifiedPropertiesFragmented();
        option.xacceptInsertColumnModifiedPropertiesIfNeeds(nextSchemaProductStatusList);
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
     *     NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     *     nextSchemaProductStatus.setFooName("foo");
     *     if (...) {
     *         nextSchemaProductStatus.setFooPrice(123);
     *     } else {
     *         nextSchemaProductStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//nextSchemaProductStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     nextSchemaProductStatusList.add(nextSchemaProductStatus);
     * }
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductStatusList);
     * </pre>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        UpdateOption<NextSchemaProductStatusCB> option = createPlainUpdateOption();
        return doBatchUpdate(nextSchemaProductStatusList, option);
    }

    protected int[] doBatchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, UpdateOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatusList", nextSchemaProductStatusList);
        prepareBatchUpdateOption(nextSchemaProductStatusList, option);
        return delegateBatchUpdate(nextSchemaProductStatusList, option);
    }

    protected void prepareBatchUpdateOption(List<NextSchemaProductStatus> nextSchemaProductStatusList, UpdateOption<NextSchemaProductStatusCB> option) {
        option.xacceptUpdateColumnModifiedPropertiesIfNeeds(nextSchemaProductStatusList);
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
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductStatusList, new SpecifyQuery<NextSchemaProductStatusCB>() {
     *     public void specify(NextSchemaProductStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span> 
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">batchUpdate</span>(nextSchemaProductStatusList, new SpecifyQuery<NextSchemaProductStatusCB>() {
     *     public void specify(NextSchemaProductStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, SpecifyQuery<NextSchemaProductStatusCB> updateColumnSpec) {
        return doBatchUpdate(nextSchemaProductStatusList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList) {
        return doBatchDelete(nextSchemaProductStatusList, null);
    }

    protected int[] doBatchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList, DeleteOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatusList", nextSchemaProductStatusList);
        prepareDeleteOption(option);
        return delegateBatchDelete(nextSchemaProductStatusList, option);
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
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;NextSchemaProductStatus, NextSchemaProductStatusCB&gt;() {
     *     public ConditionBean setup(nextSchemaProductStatus entity, NextSchemaProductStatusCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> setupper, InsertOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        NextSchemaProductStatus entity = new NextSchemaProductStatus();
        NextSchemaProductStatusCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected NextSchemaProductStatusCB createCBForQueryInsert() {
        NextSchemaProductStatusCB cb = newMyConditionBean();
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">queryUpdate</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb) {
        return doQueryUpdate(nextSchemaProductStatus, cb, null);
    }

    protected int doQueryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb, UpdateOption<NextSchemaProductStatusCB> option) {
        assertObjectNotNull("nextSchemaProductStatus", nextSchemaProductStatus); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(nextSchemaProductStatus, cb, option) : 0;
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (NextSchemaProductStatusCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (NextSchemaProductStatusCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">queryDelete</span>(nextSchemaProductStatus, cb);
     * </pre>
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextSchemaProductStatusCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(NextSchemaProductStatusCB cb, DeleteOption<NextSchemaProductStatusCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, option) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((NextSchemaProductStatusCB)cb); }
        else { return varyingQueryDelete((NextSchemaProductStatusCB)cb, downcast(option)); }
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * nextSchemaProductStatus.setFoo...(value);
     * nextSchemaProductStatus.setBar...(value);
     * InsertOption<NextSchemaProductStatusCB> option = new InsertOption<NextSchemaProductStatusCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">varyingInsert</span>(nextSchemaProductStatus, option);
     * ... = nextSchemaProductStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param nextSchemaProductStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextSchemaProductStatus nextSchemaProductStatus, InsertOption<NextSchemaProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(nextSchemaProductStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * nextSchemaProductStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * nextSchemaProductStatus.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextSchemaProductStatusCB&gt; option = new UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *         public void specify(NextSchemaProductStatusCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     nextSchemaProductStatusBhv.<span style="color: #FD4747">varyingUpdate</span>(nextSchemaProductStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param nextSchemaProductStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextSchemaProductStatus nextSchemaProductStatus, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(nextSchemaProductStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param nextSchemaProductStatus The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextSchemaProductStatus nextSchemaProductStatus, InsertOption<NextSchemaProductStatusCB> insertOption, UpdateOption<NextSchemaProductStatusCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(nextSchemaProductStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param nextSchemaProductStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextSchemaProductStatus nextSchemaProductStatus, DeleteOption<NextSchemaProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(nextSchemaProductStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextSchemaProductStatus> nextSchemaProductStatusList, InsertOption<NextSchemaProductStatusCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(nextSchemaProductStatusList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextSchemaProductStatus> nextSchemaProductStatusList, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(nextSchemaProductStatusList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param nextSchemaProductStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextSchemaProductStatus> nextSchemaProductStatusList, DeleteOption<NextSchemaProductStatusCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(nextSchemaProductStatusList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> setupper, InsertOption<NextSchemaProductStatusCB> option) {
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
     * NextSchemaProductStatus nextSchemaProductStatus = new NextSchemaProductStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setPK...(value);</span>
     * nextSchemaProductStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//nextSchemaProductStatus.setVersionNo(value);</span>
     * NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextSchemaProductStatusCB&gt; option = new UpdateOption&lt;NextSchemaProductStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;NextSchemaProductStatusCB&gt;() {
     *     public void specify(NextSchemaProductStatusCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * nextSchemaProductStatusBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(nextSchemaProductStatus, cb, option);
     * </pre>
     * @param nextSchemaProductStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextSchemaProductStatus nextSchemaProductStatus, NextSchemaProductStatusCB cb, UpdateOption<NextSchemaProductStatusCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(nextSchemaProductStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextSchemaProductStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextSchemaProductStatusCB cb, DeleteOption<NextSchemaProductStatusCB> option) {
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
    public OutsideSqlBasicExecutor<NextSchemaProductStatusBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(NextSchemaProductStatusCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(NextSchemaProductStatusCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends NextSchemaProductStatus> void delegateSelectCursor(NextSchemaProductStatusCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends NextSchemaProductStatus> List<ENTITY> delegateSelectList(NextSchemaProductStatusCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(NextSchemaProductStatus e, InsertOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(NextSchemaProductStatus e, UpdateOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(NextSchemaProductStatus e, UpdateOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(NextSchemaProductStatus e, DeleteOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(NextSchemaProductStatus e, DeleteOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<NextSchemaProductStatus> ls, InsertOption<NextSchemaProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<NextSchemaProductStatus> ls, UpdateOption<NextSchemaProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<NextSchemaProductStatus> ls, UpdateOption<NextSchemaProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<NextSchemaProductStatus> ls, DeleteOption<NextSchemaProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<NextSchemaProductStatus> ls, DeleteOption<NextSchemaProductStatusCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(NextSchemaProductStatus e, NextSchemaProductStatusCB inCB, ConditionBean resCB, InsertOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(NextSchemaProductStatus e, NextSchemaProductStatusCB cb, UpdateOption<NextSchemaProductStatusCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(NextSchemaProductStatusCB cb, DeleteOption<NextSchemaProductStatusCB> op)
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
    protected NextSchemaProductStatus downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, NextSchemaProductStatus.class);
    }

    protected NextSchemaProductStatusCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, NextSchemaProductStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<NextSchemaProductStatus> downcast(List<? extends Entity> entityList) {
        return (List<NextSchemaProductStatus>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<NextSchemaProductStatusCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<NextSchemaProductStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<NextSchemaProductStatusCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<NextSchemaProductStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<NextSchemaProductStatusCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<NextSchemaProductStatusCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<NextSchemaProductStatus, NextSchemaProductStatusCB>)option;
    }
}
