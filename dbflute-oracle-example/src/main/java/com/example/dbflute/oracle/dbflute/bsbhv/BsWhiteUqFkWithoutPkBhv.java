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
 * The behavior of WHITE_UQ_FK_WITHOUT_PK as TABLE. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     UQ_FK_CODE, UQ_FK_NAME
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
 *     WHITE_UQ_FK_WITHOUT_PK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkWithoutPkRefList
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkWithoutPkBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_UQ_FK_WITHOUT_PK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqFkWithoutPkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkWithoutPkDbm getMyDBMeta() { return WhiteUqFkWithoutPkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFkWithoutPk newMyEntity() { return new WhiteUqFkWithoutPk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkWithoutPkCB newMyConditionBean() { return new WhiteUqFkWithoutPkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkWithoutPkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqFkWithoutPkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqFkWithoutPkCB cb) { // called by selectPage(cb)
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
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkWithoutPk whiteUqFkWithoutPk = whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqFkWithoutPk != null) {
     *     ... = whiteUqFkWithoutPk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPk selectEntity(WhiteUqFkWithoutPkCB cb) {
        return doSelectEntity(cb, WhiteUqFkWithoutPk.class);
    }

    protected <ENTITY extends WhiteUqFkWithoutPk> ENTITY doSelectEntity(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteUqFkWithoutPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkWithoutPkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFkWithoutPk whiteUqFkWithoutPk = whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFkWithoutPk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFkWithoutPk selectEntityWithDeletedCheck(WhiteUqFkWithoutPkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqFkWithoutPk.class);
    }

    protected <ENTITY extends WhiteUqFkWithoutPk> ENTITY doSelectEntityWithDeletedCheck(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqFkWithoutPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkWithoutPkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFkWithoutPk&gt; whiteUqFkWithoutPkList = whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqFkWithoutPk whiteUqFkWithoutPk : whiteUqFkWithoutPkList) {
     *     ... = whiteUqFkWithoutPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFkWithoutPk> selectList(WhiteUqFkWithoutPkCB cb) {
        return doSelectList(cb, WhiteUqFkWithoutPk.class);
    }

    protected <ENTITY extends WhiteUqFkWithoutPk> ListResultBean<ENTITY> doSelectList(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteUqFkWithoutPkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkWithoutPkCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFkWithoutPk&gt; page = whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFkWithoutPk whiteUqFkWithoutPk : page) {
     *     ... = whiteUqFkWithoutPk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFkWithoutPk> selectPage(WhiteUqFkWithoutPkCB cb) {
        return doSelectPage(cb, WhiteUqFkWithoutPk.class);
    }

    protected <ENTITY extends WhiteUqFkWithoutPk> PagingResultBean<ENTITY> doSelectPage(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteUqFkWithoutPkCB>() {
            public int callbackSelectCount(WhiteUqFkWithoutPkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkWithoutPkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFkWithoutPk&gt;() {
     *     public void handle(WhiteUqFkWithoutPk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFkWithoutPk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFkWithoutPk. (NotNull)
     */
    public void selectCursor(WhiteUqFkWithoutPkCB cb, EntityRowHandler<WhiteUqFkWithoutPk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqFkWithoutPk.class);
    }

    protected <ENTITY extends WhiteUqFkWithoutPk> void doSelectCursor(WhiteUqFkWithoutPkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteUqFkWithoutPkCB>() {
            public void callbackSelectCursor(WhiteUqFkWithoutPkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkWithoutPkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkWithoutPkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteUqFkWithoutPkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqFkWithoutPkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteUqFkWithoutPkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

    /**
     * Extract the value list of (single) unique key uqFkCode.
     * @param whiteUqFkWithoutPkList The list of whiteUqFkWithoutPk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqFkCodeList(List<WhiteUqFkWithoutPk> whiteUqFkWithoutPkList) {
        return helpExtractListInternally(whiteUqFkWithoutPkList, new InternalExtractCallback<WhiteUqFkWithoutPk, String>() {
            public String getCV(WhiteUqFkWithoutPk et) { return et.getUqFkCode(); }
        });
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
    public OutsideSqlBasicExecutor<WhiteUqFkWithoutPkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqFkWithoutPkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqFkWithoutPkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqFkWithoutPk> void delegateSelectCursor(WhiteUqFkWithoutPkCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteUqFkWithoutPk> List<ENTITY> delegateSelectList(WhiteUqFkWithoutPkCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

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
    protected WhiteUqFkWithoutPk downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteUqFkWithoutPk.class);
    }

    protected WhiteUqFkWithoutPkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqFkWithoutPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqFkWithoutPk> downcast(List<? extends Entity> ls) {
        return (List<WhiteUqFkWithoutPk>)ls;
    }
}
