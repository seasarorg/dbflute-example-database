/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_line_sep_comment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteLineSepCommentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteLineSepCommentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "white_line_sep_comment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     * @param lineSepCommentCode The value of lineSepCommentCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_Equal(String lineSepCommentCode) {
        doSetLineSepCommentCode_Equal(fRES(lineSepCommentCode));
    }

    /**
     * Equal(=). As LineSepCommentCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLineSepCommentCode_Equal_AsLineSepCommentCls(CDef.LineSepCommentCls cdef) {
        doSetLineSepCommentCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As First (FOO). And OnlyOnceRegistered. <br />
     * First: foo first line            foo second line
     */
    public void setLineSepCommentCode_Equal_First() {
        setLineSepCommentCode_Equal_AsLineSepCommentCls(CDef.LineSepCommentCls.First);
    }

    /**
     * Equal(=). As Second (BAR). And OnlyOnceRegistered. <br />
     * Second: bar first line                        bar second line
     */
    public void setLineSepCommentCode_Equal_Second() {
        setLineSepCommentCode_Equal_AsLineSepCommentCls(CDef.LineSepCommentCls.Second);
    }

    protected void doSetLineSepCommentCode_Equal(String lineSepCommentCode) {
        regLineSepCommentCode(CK_EQ, lineSepCommentCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     * @param lineSepCommentCode The value of lineSepCommentCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_NotEqual(String lineSepCommentCode) {
        doSetLineSepCommentCode_NotEqual(fRES(lineSepCommentCode));
    }

    /**
     * NotEqual(&lt;&gt;). As LineSepCommentCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLineSepCommentCode_NotEqual_AsLineSepCommentCls(CDef.LineSepCommentCls cdef) {
        doSetLineSepCommentCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As First (FOO). And OnlyOnceRegistered. <br />
     * First: foo first line            foo second line
     */
    public void setLineSepCommentCode_NotEqual_First() {
        setLineSepCommentCode_NotEqual_AsLineSepCommentCls(CDef.LineSepCommentCls.First);
    }

    /**
     * NotEqual(&lt;&gt;). As Second (BAR). And OnlyOnceRegistered. <br />
     * Second: bar first line                        bar second line
     */
    public void setLineSepCommentCode_NotEqual_Second() {
        setLineSepCommentCode_NotEqual_AsLineSepCommentCls(CDef.LineSepCommentCls.Second);
    }

    protected void doSetLineSepCommentCode_NotEqual(String lineSepCommentCode) {
        regLineSepCommentCode(CK_NES, lineSepCommentCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     * @param lineSepCommentCodeList The collection of lineSepCommentCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_InScope(Collection<String> lineSepCommentCodeList) {
        doSetLineSepCommentCode_InScope(lineSepCommentCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As LineSepCommentCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_InScope_AsLineSepCommentCls(Collection<CDef.LineSepCommentCls> cdefList) {
        doSetLineSepCommentCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As LineSepCommentCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * top first line            top second line            top third line <br />
     * group first line                    group second line
     */
    public void setLineSepCommentCode_InScope_LineGroup() {
        setLineSepCommentCode_InScope_AsLineSepCommentCls(CDef.LineSepCommentCls.listOfLineGroup());
    }

    public void doSetLineSepCommentCode_InScope(Collection<String> lineSepCommentCodeList) {
        regINS(CK_INS, cTL(lineSepCommentCodeList), getCValueLineSepCommentCode(), "LINE_SEP_COMMENT_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     * @param lineSepCommentCodeList The collection of lineSepCommentCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_NotInScope(Collection<String> lineSepCommentCodeList) {
        doSetLineSepCommentCode_NotInScope(lineSepCommentCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LineSepCommentCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentCode_NotInScope_AsLineSepCommentCls(Collection<CDef.LineSepCommentCls> cdefList) {
        doSetLineSepCommentCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetLineSepCommentCode_NotInScope(Collection<String> lineSepCommentCodeList) {
        regINS(CK_NINS, cTL(lineSepCommentCodeList), getCValueLineSepCommentCode(), "LINE_SEP_COMMENT_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     */
    public void setLineSepCommentCode_IsNull() { regLineSepCommentCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls}
     */
    public void setLineSepCommentCode_IsNotNull() { regLineSepCommentCode(CK_ISNN, DOBJ); }

    protected void regLineSepCommentCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLineSepCommentCode(), "LINE_SEP_COMMENT_CODE"); }
    protected abstract ConditionValue getCValueLineSepCommentCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentName The value of lineSepCommentName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentName_Equal(String lineSepCommentName) {
        doSetLineSepCommentName_Equal(fRES(lineSepCommentName));
    }

    protected void doSetLineSepCommentName_Equal(String lineSepCommentName) {
        regLineSepCommentName(CK_EQ, lineSepCommentName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentName The value of lineSepCommentName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentName_NotEqual(String lineSepCommentName) {
        doSetLineSepCommentName_NotEqual(fRES(lineSepCommentName));
    }

    protected void doSetLineSepCommentName_NotEqual(String lineSepCommentName) {
        regLineSepCommentName(CK_NES, lineSepCommentName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentNameList The collection of lineSepCommentName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentName_InScope(Collection<String> lineSepCommentNameList) {
        doSetLineSepCommentName_InScope(lineSepCommentNameList);
    }

    public void doSetLineSepCommentName_InScope(Collection<String> lineSepCommentNameList) {
        regINS(CK_INS, cTL(lineSepCommentNameList), getCValueLineSepCommentName(), "LINE_SEP_COMMENT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentNameList The collection of lineSepCommentName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentName_NotInScope(Collection<String> lineSepCommentNameList) {
        doSetLineSepCommentName_NotInScope(lineSepCommentNameList);
    }

    public void doSetLineSepCommentName_NotInScope(Collection<String> lineSepCommentNameList) {
        regINS(CK_NINS, cTL(lineSepCommentNameList), getCValueLineSepCommentName(), "LINE_SEP_COMMENT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentName The value of lineSepCommentName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setLineSepCommentName_PrefixSearch(String lineSepCommentName) {
        setLineSepCommentName_LikeSearch(lineSepCommentName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)} <br />
     * <pre>e.g. setLineSepCommentName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineSepCommentName The value of lineSepCommentName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineSepCommentName_LikeSearch(String lineSepCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineSepCommentName), getCValueLineSepCommentName(), "LINE_SEP_COMMENT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     * @param lineSepCommentName The value of lineSepCommentName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineSepCommentName_NotLikeSearch(String lineSepCommentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineSepCommentName), getCValueLineSepCommentName(), "LINE_SEP_COMMENT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setLineSepCommentName_IsNull() { regLineSepCommentName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setLineSepCommentName_IsNullOrEmpty() { regLineSepCommentName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LINE_SEP_COMMENT_NAME: {VARCHAR(20)}
     */
    public void setLineSepCommentName_IsNotNull() { regLineSepCommentName(CK_ISNN, DOBJ); }

    protected void regLineSepCommentName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLineSepCommentName(), "LINE_SEP_COMMENT_NAME"); }
    protected abstract ConditionValue getCValueLineSepCommentName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteLineSepCommentCB&gt;() {
     *     public void query(WhiteLineSepCommentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteLineSepCommentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteLineSepCommentCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<WhiteLineSepCommentCB>(new HpSSQSetupper<WhiteLineSepCommentCB>() {
            public void setup(String fn, SubQuery<WhiteLineSepCommentCB> sq, HpSSQOption<WhiteLineSepCommentCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<WhiteLineSepCommentCB> sq, String rd, HpSSQOption<WhiteLineSepCommentCB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLineSepCommentCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteLineSepCommentCQ sq);

    protected WhiteLineSepCommentCB xcreateScalarConditionCB() {
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteLineSepCommentCB xcreateScalarConditionPartitionByCB() {
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteLineSepCommentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "LINE_SEP_COMMENT_CODE";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteLineSepCommentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteLineSepCommentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteLineSepCommentCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteLineSepCommentCB>(new HpQDRSetupper<WhiteLineSepCommentCB>() {
            public void setup(String fn, SubQuery<WhiteLineSepCommentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<WhiteLineSepCommentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "LINE_SEP_COMMENT_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteLineSepCommentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteLineSepCommentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteLineSepCommentCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteLineSepCommentCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteLineSepCommentCB cb = new WhiteLineSepCommentCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(WhiteLineSepCommentCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br />
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteLineSepCommentCB.class.getName(); }
    protected String xabCQ() { return WhiteLineSepCommentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
