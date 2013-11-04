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
 * The abstract condition-query of white_uq_reference_without_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqReferenceWithoutPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqReferenceWithoutPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_reference_without_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
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
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
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
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
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
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
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
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceCode_PrefixSearch(String uqReferenceCode) {
        setUqReferenceCode_LikeSearch(uqReferenceCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)} <br />
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
     * UQ_REFERENCE_CODE: {UQ, NotNull, CHAR(3)}
     * @param uqReferenceCode The value of uqReferenceCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqReferenceCode_NotLikeSearch(String uqReferenceCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqReferenceCode), getCValueUqReferenceCode(), "UQ_REFERENCE_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select UQ_REFERENCE_CODE from white_uq_reference_without_pk_ref where ...)} <br />
     * white_uq_reference_without_pk_ref by UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsWhiteUqReferenceWithoutPkRefList</span>(new SubQuery&lt;WhiteUqReferenceWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqReferenceWithoutPkCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WhiteUqReferenceWithoutPkRefList for 'exists'. (NotNull)
     */
    public void existsWhiteUqReferenceWithoutPkRefList(SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList");
    }
    public abstract String keepUqReferenceCode_ExistsReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select UQ_REFERENCE_CODE from white_uq_reference_without_pk_ref where ...)} <br />
     * white_uq_reference_without_pk_ref by UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsWhiteUqReferenceWithoutPkRefList</span>(new SubQuery&lt;WhiteUqReferenceWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqReferenceWithoutPkCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteUqReferenceWithoutPkRefList(SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList");
    }
    public abstract String keepUqReferenceCode_NotExistsReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select UQ_REFERENCE_CODE from white_uq_reference_without_pk_ref where ...)} <br />
     * white_uq_reference_without_pk_ref by UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPkRefAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceWithoutPkRefList for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqReferenceWithoutPkRefList(SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList");
    }
    public abstract String keepUqReferenceCode_InScopeRelation_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select UQ_REFERENCE_CODE from white_uq_reference_without_pk_ref where ...)} <br />
     * white_uq_reference_without_pk_ref by UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPkRefAsOne'.
     * @param subQuery The sub-query of WhiteUqReferenceWithoutPkRefList for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqReferenceWithoutPkRefList(SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList");
    }
    public abstract String keepUqReferenceCode_NotInScopeRelation_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);

    public void xsderiveWhiteUqReferenceWithoutPkRefList(String function, SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList", aliasName, option);
    }
    public abstract String keepUqReferenceCode_SpecifyDerivedReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from white_uq_reference_without_pk_ref where ...)} <br />
     * white_uq_reference_without_pk_ref by UQ_REFERENCE_CODE, named 'whiteUqReferenceWithoutPkRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derivedWhiteUqReferenceWithoutPkRefList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;WhiteUqReferenceWithoutPkRefCB&gt;() {
     *     public void query(WhiteUqReferenceWithoutPkRefCB subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteUqReferenceWithoutPkRefCB> derivedWhiteUqReferenceWithoutPkRefList() {
        return xcreateQDRFunctionWhiteUqReferenceWithoutPkRefList();
    }
    protected HpQDRFunction<WhiteUqReferenceWithoutPkRefCB> xcreateQDRFunctionWhiteUqReferenceWithoutPkRefList() {
        return new HpQDRFunction<WhiteUqReferenceWithoutPkRefCB>(new HpQDRSetupper<WhiteUqReferenceWithoutPkRefCB>() {
            public void setup(String function, SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveWhiteUqReferenceWithoutPkRefList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveWhiteUqReferenceWithoutPkRefList(String function, SubQuery<WhiteUqReferenceWithoutPkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqReferenceWithoutPkRefCB>", subQuery);
        WhiteUqReferenceWithoutPkRefCB cb = new WhiteUqReferenceWithoutPkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", subQueryPropertyName, "whiteUqReferenceWithoutPkRefList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefList(WhiteUqReferenceWithoutPkRefCQ subQuery);
    public abstract String keepUqReferenceCode_QueryDerivedReferrer_WhiteUqReferenceWithoutPkRefListParameter(Object parameterValue);

    protected void regUqReferenceCode(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceCode(), "UQ_REFERENCE_CODE"); }
    abstract protected ConditionValue getCValueUqReferenceCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceName The value of uqReferenceName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceName_Equal(String uqReferenceName) {
        doSetUqReferenceName_Equal(fRES(uqReferenceName));
    }

    protected void doSetUqReferenceName_Equal(String uqReferenceName) {
        regUqReferenceName(CK_EQ, uqReferenceName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceName The value of uqReferenceName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceName_NotEqual(String uqReferenceName) {
        doSetUqReferenceName_NotEqual(fRES(uqReferenceName));
    }

    protected void doSetUqReferenceName_NotEqual(String uqReferenceName) {
        regUqReferenceName(CK_NES, uqReferenceName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceNameList The collection of uqReferenceName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceName_InScope(Collection<String> uqReferenceNameList) {
        doSetUqReferenceName_InScope(uqReferenceNameList);
    }

    public void doSetUqReferenceName_InScope(Collection<String> uqReferenceNameList) {
        regINS(CK_INS, cTL(uqReferenceNameList), getCValueUqReferenceName(), "UQ_REFERENCE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceNameList The collection of uqReferenceName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceName_NotInScope(Collection<String> uqReferenceNameList) {
        doSetUqReferenceName_NotInScope(uqReferenceNameList);
    }

    public void doSetUqReferenceName_NotInScope(Collection<String> uqReferenceNameList) {
        regINS(CK_NINS, cTL(uqReferenceNameList), getCValueUqReferenceName(), "UQ_REFERENCE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceName The value of uqReferenceName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqReferenceName_PrefixSearch(String uqReferenceName) {
        setUqReferenceName_LikeSearch(uqReferenceName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)} <br />
     * <pre>e.g. setUqReferenceName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uqReferenceName The value of uqReferenceName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUqReferenceName_LikeSearch(String uqReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uqReferenceName), getCValueUqReferenceName(), "UQ_REFERENCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UQ_REFERENCE_NAME: {NotNull, VARCHAR(64)}
     * @param uqReferenceName The value of uqReferenceName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUqReferenceName_NotLikeSearch(String uqReferenceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uqReferenceName), getCValueUqReferenceName(), "UQ_REFERENCE_NAME", likeSearchOption);
    }

    protected void regUqReferenceName(ConditionKey k, Object v) { regQ(k, v, getCValueUqReferenceName(), "UQ_REFERENCE_NAME"); }
    abstract protected ConditionValue getCValueUqReferenceName();

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
    protected String xabCB() { return WhiteUqReferenceWithoutPkCB.class.getName(); }
    protected String xabCQ() { return WhiteUqReferenceWithoutPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
