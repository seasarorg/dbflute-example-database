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
 * The abstract condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_Equal(Integer multipleFirstId) {
        doSetMultipleFirstId_Equal(multipleFirstId);
    }

    protected void doSetMultipleFirstId_Equal(Integer multipleFirstId) {
        regMultipleFirstId(CK_EQ, multipleFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_GT, multipleFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_LT, multipleFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_GE, multipleFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstId The value of multipleFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_LE, multipleFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_InScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_INS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_NotInScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_NINS, cTL(multipleFirstIdList), getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNull() { regMultipleFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleFirstId_IsNotNull() { regMultipleFirstId(CK_ISNN, DOBJ); }

    protected void regMultipleFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleFirstId(), "MULTIPLE_FIRST_ID"); }
    protected abstract ConditionValue getCValueMultipleFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_Equal(Integer multipleSecondId) {
        doSetMultipleSecondId_Equal(multipleSecondId);
    }

    protected void doSetMultipleSecondId_Equal(Integer multipleSecondId) {
        regMultipleSecondId(CK_EQ, multipleSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_GT, multipleSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_LT, multipleSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_GE, multipleSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondId The value of multipleSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_LE, multipleSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param minNumber The min number of multipleSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_InScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_INS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_NotInScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_NINS, cTL(multipleSecondIdList), getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNull() { regMultipleSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)}
     */
    public void setMultipleSecondId_IsNotNull() { regMultipleSecondId(CK_ISNN, DOBJ); }

    protected void regMultipleSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMultipleSecondId(), "MULTIPLE_SECOND_ID"); }
    protected abstract ConditionValue getCValueMultipleSecondId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_Equal(Integer refFirstId) {
        doSetRefFirstId_Equal(refFirstId);
    }

    protected void doSetRefFirstId_Equal(Integer refFirstId) {
        regRefFirstId(CK_EQ, refFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterThan(Integer refFirstId) {
        regRefFirstId(CK_GT, refFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessThan(Integer refFirstId) {
        regRefFirstId(CK_LT, refFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterEqual(Integer refFirstId) {
        regRefFirstId(CK_GE, refFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessEqual(Integer refFirstId) {
        regRefFirstId(CK_LE, refFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefFirstId(), "REF_FIRST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_InScope(refFirstIdList);
    }

    protected void doSetRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        regINS(CK_INS, cTL(refFirstIdList), getCValueRefFirstId(), "REF_FIRST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_FIRST_ID: {IX, NotNull, INT(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_NotInScope(refFirstIdList);
    }

    protected void doSetRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        regINS(CK_NINS, cTL(refFirstIdList), getCValueRefFirstId(), "REF_FIRST_ID");
    }

    protected void regRefFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefFirstId(), "REF_FIRST_ID"); }
    protected abstract ConditionValue getCValueRefFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_Equal(Integer refSecondId) {
        doSetRefSecondId_Equal(refSecondId);
    }

    protected void doSetRefSecondId_Equal(Integer refSecondId) {
        regRefSecondId(CK_EQ, refSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterThan(Integer refSecondId) {
        regRefSecondId(CK_GT, refSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessThan(Integer refSecondId) {
        regRefSecondId(CK_LT, refSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterEqual(Integer refSecondId) {
        regRefSecondId(CK_GE, refSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessEqual(Integer refSecondId) {
        regRefSecondId(CK_LE, refSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRefSecondId(), "REF_SECOND_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_InScope(refSecondIdList);
    }

    protected void doSetRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        regINS(CK_INS, cTL(refSecondIdList), getCValueRefSecondId(), "REF_SECOND_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REF_SECOND_ID: {IX+, NotNull, INT(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_NotInScope(refSecondIdList);
    }

    protected void doSetRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        regINS(CK_NINS, cTL(refSecondIdList), getCValueRefSecondId(), "REF_SECOND_ID");
    }

    protected void regRefSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRefSecondId(), "REF_SECOND_ID"); }
    protected abstract ConditionValue getCValueRefSecondId();

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
    protected WhiteCompoundPkRefCB newMyCB() {
        return new WhiteCompoundPkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
