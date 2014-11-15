package com.example.dbflute.postgresql.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.HpSLSFunction;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.postgresql.dbflute.exbhv.*;
import com.example.dbflute.postgresql.dbflute.bsbhv.loader.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;
import com.example.dbflute.postgresql.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;

/**
 * The behavior of white_not_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     not_pk_id, not_pk_name, not_pk_integer
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNotPkBhv extends AbstractBehaviorReadable<WhiteNotPk, WhiteNotPkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WhiteNotPkDbm getDBMeta() { return WhiteNotPkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteNotPkDbm getMyDBMeta() { return WhiteNotPkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WhiteNotPkCB newConditionBean() { return new WhiteNotPkCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteNotPk newMyEntity() { return new WhiteNotPk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteNotPkCB newMyConditionBean() { return new WhiteNotPkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * int count = whiteNotPkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteNotPkCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * WhiteNotPk whiteNotPk = whiteNotPkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteNotPk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteNotPk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNotPk selectEntity(WhiteNotPkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WhiteNotPk facadeSelectEntity(WhiteNotPkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WhiteNotPk> OptionalEntity<ENTITY> doSelectOptionalEntity(WhiteNotPkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * WhiteNotPk whiteNotPk = whiteNotPkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteNotPk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteNotPk selectEntityWithDeletedCheck(WhiteNotPkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteNotPk&gt; whiteNotPkList = whiteNotPkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (WhiteNotPk whiteNotPk : whiteNotPkList) {
     *     ... = whiteNotPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteNotPk> selectList(WhiteNotPkCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteNotPk&gt; page = whiteNotPkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteNotPk whiteNotPk : page) {
     *     ... = whiteNotPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteNotPk> selectPage(WhiteNotPkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WhiteNotPkCB cb = new WhiteNotPkCB();
     * cb.query().setFoo...(value);
     * whiteNotPkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteNotPk&gt;() {
     *     public void handle(WhiteNotPk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteNotPk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteNotPk. (NotNull)
     */
    public void selectCursor(WhiteNotPkCB cb, EntityRowHandler<WhiteNotPk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteNotPkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteNotPkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WhiteNotPkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteNotPkList The entity list of whiteNotPk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WhiteNotPk> whiteNotPkList, ReferrerLoaderHandler<LoaderOfWhiteNotPk> handler) {
        xassLRArg(whiteNotPkList, handler);
        handler.handle(new LoaderOfWhiteNotPk().ready(whiteNotPkList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param whiteNotPk The entity of whiteNotPk. (NotNull)
     * @param handler The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WhiteNotPk whiteNotPk, ReferrerLoaderHandler<LoaderOfWhiteNotPk> handler) {
        xassLRArg(whiteNotPk, handler);
        handler.handle(new LoaderOfWhiteNotPk().ready(xnewLRAryLs(whiteNotPk), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity for a table not defined primary key. <br />
     * The auto-setup for common columns is unsupported.
     * <pre>
     * WhiteNotPk whiteNotPk = new WhiteNotPk();
     * whiteNotPk.setFoo...(value);
     * whiteNotPk.setBar...(value);
     * whiteNotPkBhv.<span style="color: #DD4747">insert</span>(whiteNotPk);
     * </pre>
     * @param whiteNotPk The entity for insert. (NotNull)
     */
    public void insert(WhiteNotPk whiteNotPk) {
        assertObjectNotNull("whiteNotPk", whiteNotPk);
        delegateInsertNoPK(whiteNotPk, null);
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
    public OutsideSqlBasicExecutor<WhiteNotPkBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WhiteNotPkBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Hyper Patch
    //                                                                         ===========
    @Override
    protected <RESULT extends WhiteNotPk> org.seasar.dbflute.bhv.core.command.SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectListCBCommandHyperPatch<RESULT>();
    }

    @Override
    protected <RESULT extends WhiteNotPk> org.seasar.dbflute.bhv.core.command.SelectCursorCBCommand<RESULT> newSelectCursorCBCommand() {
        return new com.example.dbflute.postgresql.dbflute.allcommon.DBFluteConfig.SelectCursorCBCommandHyperPatch<RESULT>();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WhiteNotPk> typeOfSelectedEntity() { return WhiteNotPk.class; }
    protected Class<WhiteNotPk> typeOfHandlingEntity() { return WhiteNotPk.class; }
    protected Class<WhiteNotPkCB> typeOfHandlingConditionBean() { return WhiteNotPkCB.class; }
}
