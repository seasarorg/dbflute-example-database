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
 * The abstract condition-query of white_binary.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteBinaryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteBinaryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_binary";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as equal. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_Equal(Long binaryId) {
        doSetBinaryId_Equal(binaryId);
    }

    protected void doSetBinaryId_Equal(Long binaryId) {
        regBinaryId(CK_EQ, binaryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_GreaterThan(Long binaryId) {
        regBinaryId(CK_GT, binaryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_LessThan(Long binaryId) {
        regBinaryId(CK_LT, binaryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_GreaterEqual(Long binaryId) {
        regBinaryId(CK_GE, binaryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryId The value of binaryId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBinaryId_LessEqual(Long binaryId) {
        regBinaryId(CK_LE, binaryId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of binaryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of binaryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBinaryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBinaryId(), "BINARY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryIdList The collection of binaryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBinaryId_InScope(Collection<Long> binaryIdList) {
        doSetBinaryId_InScope(binaryIdList);
    }

    protected void doSetBinaryId_InScope(Collection<Long> binaryIdList) {
        regINS(CK_INS, cTL(binaryIdList), getCValueBinaryId(), "BINARY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param binaryIdList The collection of binaryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBinaryId_NotInScope(Collection<Long> binaryIdList) {
        doSetBinaryId_NotInScope(binaryIdList);
    }

    protected void doSetBinaryId_NotInScope(Collection<Long> binaryIdList) {
        regINS(CK_NINS, cTL(binaryIdList), getCValueBinaryId(), "BINARY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBinaryId_IsNull() { regBinaryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BINARY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBinaryId_IsNotNull() { regBinaryId(CK_ISNN, DOBJ); }

    protected void regBinaryId(ConditionKey k, Object v) { regQ(k, v, getCValueBinaryId(), "BINARY_ID"); }
    abstract protected ConditionValue getCValueBinaryId();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BINARY_DATA: {BINARY(1)}
     */
    public void setBinaryData_IsNull() { regBinaryData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BINARY_DATA: {BINARY(1)}
     */
    public void setBinaryData_IsNotNull() { regBinaryData(CK_ISNN, DOBJ); }

    protected void regBinaryData(ConditionKey k, Object v) { regQ(k, v, getCValueBinaryData(), "BINARY_DATA"); }
    abstract protected ConditionValue getCValueBinaryData();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BLOB_DATA: {BLOB(65535)}
     */
    public void setBlobData_IsNull() { regBlobData(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BLOB_DATA: {BLOB(65535)}
     */
    public void setBlobData_IsNotNull() { regBlobData(CK_ISNN, DOBJ); }

    protected void regBlobData(ConditionKey k, Object v) { regQ(k, v, getCValueBlobData(), "BLOB_DATA"); }
    abstract protected ConditionValue getCValueBlobData();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteBinaryCB&gt;() {
     *     public void query(WhiteBinaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteBinaryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteBinaryCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteBinaryCB>(new HpSSQSetupper<WhiteBinaryCB>() {
            public void setup(String function, SubQuery<WhiteBinaryCB> subQuery, HpSSQOption<WhiteBinaryCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteBinaryCB> subQuery, String operand, HpSSQOption<WhiteBinaryCB> option) {
        assertObjectNotNull("subQuery<WhiteBinaryCB>", subQuery);
        WhiteBinaryCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteBinaryCQ subQuery);

    protected WhiteBinaryCB xcreateScalarConditionCB() {
        WhiteBinaryCB cb = new WhiteBinaryCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteBinaryCB xcreateScalarConditionPartitionByCB() {
        WhiteBinaryCB cb = new WhiteBinaryCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteBinaryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteBinaryCB>", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BINARY_ID", "BINARY_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteBinaryCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteBinaryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteBinaryCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteBinaryCB>(new HpQDRSetupper<WhiteBinaryCB>() {
            public void setup(String function, SubQuery<WhiteBinaryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteBinaryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteBinaryCB>", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BINARY_ID", "BINARY_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteBinaryCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteBinaryCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteBinaryCB>", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteBinaryCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteBinaryCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteBinaryCB>", subQuery);
        WhiteBinaryCB cb = new WhiteBinaryCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteBinaryCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.seasar.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteBinaryCB.class.getName(); }
    protected String xabCQ() { return WhiteBinaryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
