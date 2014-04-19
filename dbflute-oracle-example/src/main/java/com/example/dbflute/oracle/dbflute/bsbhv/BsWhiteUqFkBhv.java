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
 * The behavior of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "WHITE_UQ_FK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return WhiteUqFkDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WhiteUqFkDbm getMyDBMeta() { return WhiteUqFkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WhiteUqFk newMyEntity() { return new WhiteUqFk(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WhiteUqFkCB newMyConditionBean() { return new WhiteUqFkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * int count = whiteUqFkBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WhiteUqFkCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(WhiteUqFkCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(WhiteUqFkCB cb) { // called by selectPage(cb)
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
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFk whiteUqFk = whiteUqFkBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (whiteUqFk != null) {
     *     ... = whiteUqFk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntity(WhiteUqFkCB cb) {
        return doSelectEntity(cb, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectEntity(WhiteUqFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, WhiteUqFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * WhiteUqFk whiteUqFk = whiteUqFkBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteUqFk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectEntityWithDeletedCheck(WhiteUqFkCB cb) {
        return doSelectEntityWithDeletedCheck(cb, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectEntityWithDeletedCheck(WhiteUqFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, WhiteUqFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param uqFkId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectByPKValue(Long uqFkId) {
        return doSelectByPKValue(uqFkId, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectByPKValue(Long uqFkId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(uqFkId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param uqFkId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WhiteUqFk selectByPKValueWithDeletedCheck(Long uqFkId) {
        return doSelectByPKValueWithDeletedCheck(uqFkId, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> ENTITY doSelectByPKValueWithDeletedCheck(Long uqFkId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(uqFkId), entityType);
    }

    private WhiteUqFkCB buildPKCB(Long uqFkId) {
        assertObjectNotNull("uqFkId", uqFkId);
        WhiteUqFkCB cb = newMyConditionBean();
        cb.query().setUqFkId_Equal(uqFkId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;WhiteUqFk&gt; whiteUqFkList = whiteUqFkBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WhiteUqFk> selectList(WhiteUqFkCB cb) {
        return doSelectList(cb, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> ListResultBean<ENTITY> doSelectList(WhiteUqFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, WhiteUqFkCB>() {
            public List<ENTITY> callbackSelectList(WhiteUqFkCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
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
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WhiteUqFk&gt; page = whiteUqFkBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (WhiteUqFk whiteUqFk : page) {
     *     ... = whiteUqFk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WhiteUqFk> selectPage(WhiteUqFkCB cb) {
        return doSelectPage(cb, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> PagingResultBean<ENTITY> doSelectPage(WhiteUqFkCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, WhiteUqFkCB>() {
            public int callbackSelectCount(WhiteUqFkCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(WhiteUqFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
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
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;WhiteUqFk&gt;() {
     *     public void handle(WhiteUqFk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param entityRowHandler The handler of entity row of WhiteUqFk. (NotNull)
     */
    public void selectCursor(WhiteUqFkCB cb, EntityRowHandler<WhiteUqFk> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, WhiteUqFk.class);
    }

    protected <ENTITY extends WhiteUqFk> void doSelectCursor(WhiteUqFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, WhiteUqFkCB>() {
            public void callbackSelectCursor(WhiteUqFkCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(WhiteUqFkCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * whiteUqFkBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<WhiteUqFkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends WhiteUqFkCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends WhiteUqFkCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
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
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToPkIdList(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFk, conditionBeanSetupper);
        loadWhiteUqFkRefByFkToPkIdList(xnewLRLs(whiteUqFk), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqFkRefByFkToPkIdList with the set-upper for condition-bean of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #FD4747">loadWhiteUqFkRefByFkToPkIdList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.<span style="color: #FD4747">getWhiteUqFkRefByFkToPkIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFkToPkId_InScope(pkList);
     * cb.query().addOrderBy_FkToPkId_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToPkIdList(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFkList, conditionBeanSetupper);
        loadWhiteUqFkRefByFkToPkIdList(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToPkIdList(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        loadWhiteUqFkRefByFkToPkIdList(xnewLRLs(whiteUqFk), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToPkIdList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return; }
        final WhiteUqFkRefBhv referrerBhv = xgetBSFLR().select(WhiteUqFkRefBhv.class);
        helpLoadReferrerInternally(whiteUqFkList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqFk, Long, WhiteUqFkRefCB, WhiteUqFkRef>() {
            public Long getPKVal(WhiteUqFk et)
            { return et.getUqFkId(); }
            public void setRfLs(WhiteUqFk et, List<WhiteUqFkRef> ls)
            { et.setWhiteUqFkRefByFkToPkIdList(ls); }
            public WhiteUqFkRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqFkRefCB cb, List<Long> ls)
            { cb.query().setFkToPkId_InScope(ls); }
            public void qyOdFKAsc(WhiteUqFkRefCB cb) { cb.query().addOrderBy_FkToPkId_Asc(); }
            public void spFKCol(WhiteUqFkRefCB cb) { cb.specify().columnFkToPkId(); }
            public List<WhiteUqFkRef> selRfLs(WhiteUqFkRefCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(WhiteUqFkRef re) { return re.getFkToPkId(); }
            public void setlcEt(WhiteUqFkRef re, WhiteUqFk le)
            { re.setWhiteUqFkByFkToPkId(le); }
            public String getRfPrNm() { return "whiteUqFkRefByFkToPkIdList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToUqCodeList(WhiteUqFk whiteUqFk, ConditionBeanSetupper<WhiteUqFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFk, conditionBeanSetupper);
        loadWhiteUqFkRefByFkToUqCodeList(xnewLRLs(whiteUqFk), conditionBeanSetupper);
    }
    /**
     * Load referrer of whiteUqFkRefByFkToUqCodeList with the set-upper for condition-bean of referrer. <br />
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * <pre>
     * whiteUqFkBhv.<span style="color: #FD4747">loadWhiteUqFkRefByFkToUqCodeList</span>(whiteUqFkList, new ConditionBeanSetupper&lt;WhiteUqFkRefCB&gt;() {
     *     public void setup(WhiteUqFkRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (WhiteUqFk whiteUqFk : whiteUqFkList) {
     *     ... = whiteUqFk.<span style="color: #FD4747">getWhiteUqFkRefByFkToUqCodeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setFkToUqCode_InScope(pkList);
     * cb.query().addOrderBy_FkToUqCode_Asc();
     * </pre>
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFk> whiteUqFkList, ConditionBeanSetupper<WhiteUqFkRefCB> conditionBeanSetupper) {
        xassLRArg(whiteUqFkList, conditionBeanSetupper);
        loadWhiteUqFkRefByFkToUqCodeList(whiteUqFkList, new LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param whiteUqFk The entity of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToUqCodeList(WhiteUqFk whiteUqFk, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFk, loadReferrerOption);
        loadWhiteUqFkRefByFkToUqCodeList(xnewLRLs(whiteUqFk), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param whiteUqFkList The entity list of whiteUqFk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFk> whiteUqFkList, LoadReferrerOption<WhiteUqFkRefCB, WhiteUqFkRef> loadReferrerOption) {
        xassLRArg(whiteUqFkList, loadReferrerOption);
        if (whiteUqFkList.isEmpty()) { return; }
        final WhiteUqFkRefBhv referrerBhv = xgetBSFLR().select(WhiteUqFkRefBhv.class);
        helpLoadReferrerInternally(whiteUqFkList, loadReferrerOption, new InternalLoadReferrerCallback<WhiteUqFk, String, WhiteUqFkRefCB, WhiteUqFkRef>() {
            public String getPKVal(WhiteUqFk et)
            { return et.getUqFkCode(); }
            public void setRfLs(WhiteUqFk et, List<WhiteUqFkRef> ls)
            { et.setWhiteUqFkRefByFkToUqCodeList(ls); }
            public WhiteUqFkRefCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(WhiteUqFkRefCB cb, List<String> ls)
            { cb.query().setFkToUqCode_InScope(ls); }
            public void qyOdFKAsc(WhiteUqFkRefCB cb) { cb.query().addOrderBy_FkToUqCode_Asc(); }
            public void spFKCol(WhiteUqFkRefCB cb) { cb.specify().columnFkToUqCode(); }
            public List<WhiteUqFkRef> selRfLs(WhiteUqFkRefCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(WhiteUqFkRef re) { return re.getFkToUqCode(); }
            public void setlcEt(WhiteUqFkRef re, WhiteUqFk le)
            { re.setWhiteUqFkByFkToUqCode(le); }
            public String getRfPrNm() { return "whiteUqFkRefByFkToUqCodeList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key uqFkId.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractUqFkIdList(List<WhiteUqFk> whiteUqFkList) {
        return helpExtractListInternally(whiteUqFkList, new InternalExtractCallback<WhiteUqFk, Long>() {
            public Long getCV(WhiteUqFk et) { return et.getUqFkId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key uqFkCode.
     * @param whiteUqFkList The list of whiteUqFk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractUqFkCodeList(List<WhiteUqFk> whiteUqFkList) {
        return helpExtractListInternally(whiteUqFkList, new InternalExtractCallback<WhiteUqFk, String>() {
            public String getCV(WhiteUqFk et) { return et.getUqFkCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * whiteUqFkBhv.<span style="color: #FD4747">insert</span>(whiteUqFk);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteUqFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WhiteUqFk whiteUqFk) {
        doInsert(whiteUqFk, null);
    }

    protected void doInsert(WhiteUqFk whiteUqFk, InsertOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFk", whiteUqFk);
        prepareInsertOption(op);
        delegateInsert(whiteUqFk, op);
    }

    protected void prepareInsertOption(InsertOption<WhiteUqFkCB> op) {
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkBhv.<span style="color: #FD4747">update</span>(whiteUqFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final WhiteUqFk whiteUqFk) {
        doUpdate(whiteUqFk, null);
    }

    protected void doUpdate(WhiteUqFk whiteUqFk, final UpdateOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFk", whiteUqFk);
        prepareUpdateOption(op);
        helpUpdateInternally(whiteUqFk, new InternalUpdateCallback<WhiteUqFk>() {
            public int callbackDelegateUpdate(WhiteUqFk et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<WhiteUqFkCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected WhiteUqFkCB createCBForVaryingUpdate() {
        WhiteUqFkCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected WhiteUqFkCB createCBForSpecifiedUpdate() {
        WhiteUqFkCB cb = newMyConditionBean();
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
     * @param whiteUqFk The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WhiteUqFk whiteUqFk) {
        doInesrtOrUpdate(whiteUqFk, null, null);
    }

    protected void doInesrtOrUpdate(WhiteUqFk whiteUqFk, final InsertOption<WhiteUqFkCB> iop, final UpdateOption<WhiteUqFkCB> uop) {
        helpInsertOrUpdateInternally(whiteUqFk, new InternalInsertOrUpdateCallback<WhiteUqFk, WhiteUqFkCB>() {
            public void callbackInsert(WhiteUqFk et) { doInsert(et, iop); }
            public void callbackUpdate(WhiteUqFk et) { doUpdate(et, uop); }
            public WhiteUqFkCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(WhiteUqFkCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<WhiteUqFkCB>();
            uop = uop != null ? uop : new UpdateOption<WhiteUqFkCB>();
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     whiteUqFkBhv.<span style="color: #FD4747">delete</span>(whiteUqFk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WhiteUqFk whiteUqFk) {
        doDelete(whiteUqFk, null);
    }

    protected void doDelete(WhiteUqFk whiteUqFk, final DeleteOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFk", whiteUqFk);
        prepareDeleteOption(op);
        helpDeleteInternally(whiteUqFk, new InternalDeleteCallback<WhiteUqFk>() {
            public int callbackDelegateDelete(WhiteUqFk et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<WhiteUqFkCB> op) {
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
     *     WhiteUqFk whiteUqFk = new WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     if (...) {
     *         whiteUqFk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * whiteUqFkBhv.<span style="color: #FD4747">batchInsert</span>(whiteUqFkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WhiteUqFk> whiteUqFkList) {
        InsertOption<WhiteUqFkCB> op = createInsertUpdateOption();
        return doBatchInsert(whiteUqFkList, op);
    }

    protected int[] doBatchInsert(List<WhiteUqFk> whiteUqFkList, InsertOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFkList", whiteUqFkList);
        prepareBatchInsertOption(whiteUqFkList, op);
        return delegateBatchInsert(whiteUqFkList, op);
    }

    protected void prepareBatchInsertOption(List<WhiteUqFk> whiteUqFkList, InsertOption<WhiteUqFkCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(whiteUqFkList);
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
     *     WhiteUqFk whiteUqFk = new WhiteUqFk();
     *     whiteUqFk.setFooName("foo");
     *     if (...) {
     *         whiteUqFk.setFooPrice(123);
     *     } else {
     *         whiteUqFk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteUqFk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteUqFkList.add(whiteUqFk);
     * }
     * whiteUqFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkList);
     * </pre>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFk> whiteUqFkList) {
        UpdateOption<WhiteUqFkCB> op = createPlainUpdateOption();
        return doBatchUpdate(whiteUqFkList, op);
    }

    protected int[] doBatchUpdate(List<WhiteUqFk> whiteUqFkList, UpdateOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFkList", whiteUqFkList);
        prepareBatchUpdateOption(whiteUqFkList, op);
        return delegateBatchUpdate(whiteUqFkList, op);
    }

    protected void prepareBatchUpdateOption(List<WhiteUqFk> whiteUqFkList, UpdateOption<WhiteUqFkCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(whiteUqFkList);
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
     * whiteUqFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkList, new SpecifyQuery<WhiteUqFkCB>() {
     *     public void specify(WhiteUqFkCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #FD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #FD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * whiteUqFkBhv.<span style="color: #FD4747">batchUpdate</span>(whiteUqFkList, new SpecifyQuery<WhiteUqFkCB>() {
     *     public void specify(WhiteUqFkCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #FD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WhiteUqFk> whiteUqFkList, SpecifyQuery<WhiteUqFkCB> updateColumnSpec) {
        return doBatchUpdate(whiteUqFkList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WhiteUqFk> whiteUqFkList) {
        return doBatchDelete(whiteUqFkList, null);
    }

    protected int[] doBatchDelete(List<WhiteUqFk> whiteUqFkList, DeleteOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFkList", whiteUqFkList);
        prepareDeleteOption(op);
        return delegateBatchDelete(whiteUqFkList, op);
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
     * whiteUqFkBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;WhiteUqFk, WhiteUqFkCB&gt;() {
     *     public ConditionBean setup(whiteUqFk entity, WhiteUqFkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> sp, InsertOption<WhiteUqFkCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        WhiteUqFk e = new WhiteUqFk();
        WhiteUqFkCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected WhiteUqFkCB createCBForQueryInsert() {
        WhiteUqFkCB cb = newMyConditionBean();
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteUqFk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #FD4747">queryUpdate</span>(whiteUqFk, cb);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb) {
        return doQueryUpdate(whiteUqFk, cb, null);
    }

    protected int doQueryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb, UpdateOption<WhiteUqFkCB> op) {
        assertObjectNotNull("whiteUqFk", whiteUqFk); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(whiteUqFk, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (WhiteUqFkCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (WhiteUqFkCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * whiteUqFkBhv.<span style="color: #FD4747">queryDelete</span>(whiteUqFk, cb);
     * </pre>
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WhiteUqFkCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(WhiteUqFkCB cb, DeleteOption<WhiteUqFkCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((WhiteUqFkCB)cb); }
        else { return varyingQueryDelete((WhiteUqFkCB)cb, downcast(op)); }
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteUqFk.setFoo...(value);
     * whiteUqFk.setBar...(value);
     * InsertOption<WhiteUqFkCB> option = new InsertOption<WhiteUqFkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * whiteUqFkBhv.<span style="color: #FD4747">varyingInsert</span>(whiteUqFk, option);
     * ... = whiteUqFk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteUqFk The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WhiteUqFk whiteUqFk, InsertOption<WhiteUqFkCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(whiteUqFk, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * whiteUqFk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * whiteUqFk.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WhiteUqFkCB&gt; option = new UpdateOption&lt;WhiteUqFkCB&gt;();
     *     option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *         public void specify(WhiteUqFkCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     whiteUqFkBhv.<span style="color: #FD4747">varyingUpdate</span>(whiteUqFk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteUqFk The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WhiteUqFk whiteUqFk, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(whiteUqFk, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteUqFk The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WhiteUqFk whiteUqFk, InsertOption<WhiteUqFkCB> insertOption, UpdateOption<WhiteUqFkCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(whiteUqFk, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteUqFk The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WhiteUqFk whiteUqFk, DeleteOption<WhiteUqFkCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(whiteUqFk, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WhiteUqFk> whiteUqFkList, InsertOption<WhiteUqFkCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(whiteUqFkList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WhiteUqFk> whiteUqFkList, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(whiteUqFkList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteUqFkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WhiteUqFk> whiteUqFkList, DeleteOption<WhiteUqFkCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(whiteUqFkList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> setupper, InsertOption<WhiteUqFkCB> option) {
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
     * WhiteUqFk whiteUqFk = new WhiteUqFk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setPK...(value);</span>
     * whiteUqFk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteUqFk.setVersionNo(value);</span>
     * WhiteUqFkCB cb = new WhiteUqFkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WhiteUqFkCB&gt; option = new UpdateOption&lt;WhiteUqFkCB&gt;();
     * option.self(new SpecifyQuery&lt;WhiteUqFkCB&gt;() {
     *     public void specify(WhiteUqFkCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * whiteUqFkBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(whiteUqFk, cb, option);
     * </pre>
     * @param whiteUqFk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WhiteUqFk whiteUqFk, WhiteUqFkCB cb, UpdateOption<WhiteUqFkCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(whiteUqFk, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WhiteUqFk. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WhiteUqFkCB cb, DeleteOption<WhiteUqFkCB> option) {
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
    public OutsideSqlBasicExecutor<WhiteUqFkBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(WhiteUqFkCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(WhiteUqFkCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends WhiteUqFk> void delegateSelectCursor(WhiteUqFkCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends WhiteUqFk> List<ENTITY> delegateSelectList(WhiteUqFkCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(WhiteUqFk et, InsertOption<WhiteUqFkCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(WhiteUqFk et, UpdateOption<WhiteUqFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(WhiteUqFk et, UpdateOption<WhiteUqFkCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(WhiteUqFk et, DeleteOption<WhiteUqFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(WhiteUqFk et, DeleteOption<WhiteUqFkCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<WhiteUqFk> ls, InsertOption<WhiteUqFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<WhiteUqFk> ls, UpdateOption<WhiteUqFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<WhiteUqFk> ls, UpdateOption<WhiteUqFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<WhiteUqFk> ls, DeleteOption<WhiteUqFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<WhiteUqFk> ls, DeleteOption<WhiteUqFkCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(WhiteUqFk et, WhiteUqFkCB inCB, ConditionBean resCB, InsertOption<WhiteUqFkCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(WhiteUqFk et, WhiteUqFkCB cb, UpdateOption<WhiteUqFkCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(WhiteUqFkCB cb, DeleteOption<WhiteUqFkCB> op)
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
    protected WhiteUqFk downcast(Entity et) {
        return helpEntityDowncastInternally(et, WhiteUqFk.class);
    }

    protected WhiteUqFkCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, WhiteUqFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<WhiteUqFk> downcast(List<? extends Entity> ls) {
        return (List<WhiteUqFk>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<WhiteUqFkCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<WhiteUqFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<WhiteUqFkCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<WhiteUqFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<WhiteUqFkCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<WhiteUqFkCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<WhiteUqFk, WhiteUqFkCB>)sp;
    }
}
