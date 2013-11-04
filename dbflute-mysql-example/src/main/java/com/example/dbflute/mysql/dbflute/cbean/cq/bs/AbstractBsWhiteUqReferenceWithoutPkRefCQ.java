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
 * The abstract condition-query of white_uq_reference_without_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqReferenceWithoutPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqReferenceWithoutPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_reference_without_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefId The value of uqReferenceRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefId_Equal(Long uqReferenceRefId) {
        doSetUqReferenceRefId_Equal(uqReferenceRefId);
    }

    protected void doSetUqReferenceRefId_Equal(Long uqReferenceRefId) {
        regUqReferenceRefId(CK_EQ, uqReferenceRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefId The value of uqReferenceRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefId_GreaterThan(Long uqReferenceRefId) {
        regUqReferenceRefId(CK_GT, uqReferenceRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefId The value of uqReferenceRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefId_LessThan(Long uqReferenceRefId) {
        regUqReferenceRefId(CK_LT, uqReferenceRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefId The value of uqReferenceRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefId_GreaterEqual(Long uqReferenceRefId) {
        regUqReferenceRefId(CK_GE, uqReferenceRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefId The value of uqReferenceRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqReferenceRefId_LessEqual(Long uqReferenceRefId) {
        regUqReferenceRefId(CK_LE, uqReferenceRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqReferenceRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqReferenceRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqReferenceRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqReferenceRefId(), "UQ_REFERENCE_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefIdList The collection of uqReferenceRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceRefId_InScope(Collection<Long> uqReferenceRefIdList) {
        doSetUqReferenceRefId_InScope(uqReferenceRefIdList);
    }

    protected void doSetUqReferenceRefId_InScope(Collection<Long> uqReferenceRefIdList) {
        regINS(CK_INS, cTL(uqReferenceRefIdList), getCValueUqReferenceRefId(), "UQ_REFERENCE_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_REF_ID: {NotNull, DECIMAL(16)}
     * @param uqReferenceRefIdList The collection of uqReferenceRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceRefId_NotInScope(Collection<Long> uqReferenceRefIdList) {
        doSetUqReferenceRefId_NotInScope(uqReferenceRefIdList);
    }

    protected void doSetUqReferenceRefId_NotInScope(Collection<Long> uqReferenceRefIdList) {
        regINS(CK_NINS, cTL(uqReferenceRefIdList), getCValueUqReferenceRefId(), "UQ_REFERENCE_REF_ID");
    }

    protected void regUqReferenceRefId(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceRefId(), "UQ_REFERENCE_REF_ID"); }
    abstract protected ConditionValue getCValueUqReferenceRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCode The value of uqReferenceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_Equal(String uqReferenceCode) {
        doSetUqReferenceCode_Equal(fRES(uqReferenceCode));
    }

    protected void doSetUqReferenceCode_Equal(String uqReferenceCode) {
        regUqReferenceCode(CK_EQ, uqReferenceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCode The value of uqReferenceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_NotEqual(String uqReferenceCode) {
        doSetUqReferenceCode_NotEqual(fRES(uqReferenceCode));
    }

    protected void doSetUqReferenceCode_NotEqual(String uqReferenceCode) {
        regUqReferenceCode(CK_NES, uqReferenceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCodeList The collection of uqReferenceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_InScope(Collection<String> uqReferenceCodeList) {
        doSetUqReferenceCode_InScope(uqReferenceCodeList);
    }

    public void doSetUqReferenceCode_InScope(Collection<String> uqReferenceCodeList) {
        regINS(CK_INS, cTL(uqReferenceCodeList), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCodeList The collection of uqReferenceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_NotInScope(Collection<String> uqReferenceCodeList) {
        doSetUqReferenceCode_NotInScope(uqReferenceCodeList);
    }

    public void doSetUqReferenceCode_NotInScope(Collection<String> uqReferenceCodeList) {
        regINS(CK_NINS, cTL(uqReferenceCodeList), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCode The value of uqReferenceCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_PrefixSearch(String uqReferenceCode) {
        setUqReferenceCode_LikeSearch(uqReferenceCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk} <br />
     * <pre>e.g. setUqReferenceCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqReferenceCode The value of uqReferenceCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqReferenceCode_LikeSearch(String uqReferenceCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqReferenceCode), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {IX, NotNull, CHAR(3), FK to white_uq_reference_without_pk}
     * @param uqReferenceCode The value of uqReferenceCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqReferenceCode_NotLikeSearch(String uqReferenceCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqReferenceCode), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select UQ_REFERENCE_CODE from white_uq_reference_without_pk where ...)} <br />
     * white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'.
     * @param subQuery The sub-query of WhiteUqReferenceWithoutPk for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqReferenceWithoutPk(SubQuery<WhiteUqReferenceWithoutPkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkCB>", subQuery);
        WhiteUqReferenceWithoutPkCB cb = new WhiteUqReferenceWithoutPkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPk(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPk");
    }
    public abstract String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPk(WhiteUqReferenceWithoutPkCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select UQ_REFERENCE_CODE from white_uq_reference_without_pk where ...)} <br />
     * white_uq_reference_without_pk by my UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPk'.
     * @param subQuery The sub-query of WhiteUqReferenceWithoutPk for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqReferenceWithoutPk(SubQuery<WhiteUqReferenceWithoutPkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkCB>", subQuery);
        WhiteUqReferenceWithoutPkCB cb = new WhiteUqReferenceWithoutPkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPk(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPk");
    }
    public abstract String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPk(WhiteUqReferenceWithoutPkCQ subQuery);

    protected void regUqReferenceCode(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceCode(), "UQ_REFERENCE_CODE"); }
    abstract protected ConditionValue getCValueUqReferenceCode();

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
    protected String xabCB() { return WhiteUqReferenceWithoutPkRefCB.class.getName(); }
    protected String xabCQ() { return WhiteUqReferenceWithoutPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
