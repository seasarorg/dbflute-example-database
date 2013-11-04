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
 * The abstract condition-query of white_uq_fk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteUqFkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_uq_fk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_Equal(Long uqFkRefId) {
        doSetUqFkRefId_Equal(uqFkRefId);
    }

    protected void doSetUqFkRefId_Equal(Long uqFkRefId) {
        regUqFkRefId(CK_EQ, uqFkRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_GreaterThan(Long uqFkRefId) {
        regUqFkRefId(CK_GT, uqFkRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_LessThan(Long uqFkRefId) {
        regUqFkRefId(CK_LT, uqFkRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_GreaterEqual(Long uqFkRefId) {
        regUqFkRefId(CK_GE, uqFkRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefId The value of uqFkRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_LessEqual(Long uqFkRefId) {
        regUqFkRefId(CK_LE, uqFkRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of uqFkRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqFkRefId(), "UQ_FK_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefIdList The collection of uqFkRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkRefId_InScope(Collection<Long> uqFkRefIdList) {
        doSetUqFkRefId_InScope(uqFkRefIdList);
    }

    protected void doSetUqFkRefId_InScope(Collection<Long> uqFkRefIdList) {
        regINS(CK_INS, cTL(uqFkRefIdList), getCValueUqFkRefId(), "UQ_FK_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     * @param uqFkRefIdList The collection of uqFkRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        doSetUqFkRefId_NotInScope(uqFkRefIdList);
    }

    protected void doSetUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        regINS(CK_NINS, cTL(uqFkRefIdList), getCValueUqFkRefId(), "UQ_FK_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefId_IsNull() { regUqFkRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setUqFkRefId_IsNotNull() { regUqFkRefId(CK_ISNN, DOBJ); }

    protected void regUqFkRefId(ConditionKey k, Object v) { regQ(k, v, getCValueUqFkRefId(), "UQ_FK_REF_ID"); }
    abstract protected ConditionValue getCValueUqFkRefId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as equal. (NullAllowed: if null, no condition)
     */
    public void setFkToPkId_Equal(Long fkToPkId) {
        doSetFkToPkId_Equal(fkToPkId);
    }

    protected void doSetFkToPkId_Equal(Long fkToPkId) {
        regFkToPkId(CK_EQ, fkToPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFkToPkId_GreaterThan(Long fkToPkId) {
        regFkToPkId(CK_GT, fkToPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFkToPkId_LessThan(Long fkToPkId) {
        regFkToPkId(CK_LT, fkToPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFkToPkId_GreaterEqual(Long fkToPkId) {
        regFkToPkId(CK_GE, fkToPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkId The value of fkToPkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFkToPkId_LessEqual(Long fkToPkId) {
        regFkToPkId(CK_LE, fkToPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param minNumber The min number of fkToPkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of fkToPkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFkToPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFkToPkId(), "FK_TO_PK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkIdList The collection of fkToPkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToPkId_InScope(Collection<Long> fkToPkIdList) {
        doSetFkToPkId_InScope(fkToPkIdList);
    }

    protected void doSetFkToPkId_InScope(Collection<Long> fkToPkIdList) {
        regINS(CK_INS, cTL(fkToPkIdList), getCValueFkToPkId(), "FK_TO_PK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk}
     * @param fkToPkIdList The collection of fkToPkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToPkId_NotInScope(Collection<Long> fkToPkIdList) {
        doSetFkToPkId_NotInScope(fkToPkIdList);
    }

    protected void doSetFkToPkId_NotInScope(Collection<Long> fkToPkIdList) {
        regINS(CK_NINS, cTL(fkToPkIdList), getCValueFkToPkId(), "FK_TO_PK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_PK_ID from white_uq_fk where ...)} <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @param subQuery The sub-query of WhiteUqFkByFkToPkId for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkByFkToPkId(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkCB>", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "FK_TO_PK_ID", "UQ_FK_ID", subQueryPropertyName, "whiteUqFkByFkToPkId");
    }
    public abstract String keepFkToPkId_InScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_PK_ID from white_uq_fk where ...)} <br />
     * white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @param subQuery The sub-query of WhiteUqFkByFkToPkId for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkByFkToPkId(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkCB>", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "FK_TO_PK_ID", "UQ_FK_ID", subQueryPropertyName, "whiteUqFkByFkToPkId");
    }
    public abstract String keepFkToPkId_NotInScopeRelation_WhiteUqFkByFkToPkId(WhiteUqFkCQ subQuery);

    protected void regFkToPkId(ConditionKey k, Object v) { regQ(k, v, getCValueFkToPkId(), "FK_TO_PK_ID"); }
    abstract protected ConditionValue getCValueFkToPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_Equal(String fkToUqCode) {
        doSetFkToUqCode_Equal(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_Equal(String fkToUqCode) {
        regFkToUqCode(CK_EQ, fkToUqCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_NotEqual(String fkToUqCode) {
        doSetFkToUqCode_NotEqual(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_NotEqual(String fkToUqCode) {
        regFkToUqCode(CK_NES, fkToUqCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCodeList The collection of fkToUqCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_InScope(Collection<String> fkToUqCodeList) {
        doSetFkToUqCode_InScope(fkToUqCodeList);
    }

    public void doSetFkToUqCode_InScope(Collection<String> fkToUqCodeList) {
        regINS(CK_INS, cTL(fkToUqCodeList), getCValueFkToUqCode(), "FK_TO_UQ_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCodeList The collection of fkToUqCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_NotInScope(Collection<String> fkToUqCodeList) {
        doSetFkToUqCode_NotInScope(fkToUqCodeList);
    }

    public void doSetFkToUqCode_NotInScope(Collection<String> fkToUqCodeList) {
        regINS(CK_NINS, cTL(fkToUqCodeList), getCValueFkToUqCode(), "FK_TO_UQ_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_PrefixSearch(String fkToUqCode) {
        setFkToUqCode_LikeSearch(fkToUqCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} <br />
     * <pre>e.g. setFkToUqCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fkToUqCode The value of fkToUqCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFkToUqCode_LikeSearch(String fkToUqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fkToUqCode), getCValueFkToUqCode(), "FK_TO_UQ_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk}
     * @param fkToUqCode The value of fkToUqCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFkToUqCode_NotLikeSearch(String fkToUqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fkToUqCode), getCValueFkToUqCode(), "FK_TO_UQ_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_UQ_CODE from white_uq_fk where ...)} <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @param subQuery The sub-query of WhiteUqFkByFkToUqCode for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkByFkToUqCode(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkCB>", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "FK_TO_UQ_CODE", "UQ_FK_CODE", subQueryPropertyName, "whiteUqFkByFkToUqCode");
    }
    public abstract String keepFkToUqCode_InScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_UQ_CODE from white_uq_fk where ...)} <br />
     * white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @param subQuery The sub-query of WhiteUqFkByFkToUqCode for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkByFkToUqCode(SubQuery<WhiteUqFkCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkCB>", subQuery);
        WhiteUqFkCB cb = new WhiteUqFkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "FK_TO_UQ_CODE", "UQ_FK_CODE", subQueryPropertyName, "whiteUqFkByFkToUqCode");
    }
    public abstract String keepFkToUqCode_NotInScopeRelation_WhiteUqFkByFkToUqCode(WhiteUqFkCQ subQuery);

    protected void regFkToUqCode(ConditionKey k, Object v) { regQ(k, v, getCValueFkToUqCode(), "FK_TO_UQ_CODE"); }
    abstract protected ConditionValue getCValueFkToUqCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_Equal(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_Equal(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_EQ, compoundUqFirstCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        doSetCompoundUqFirstCode_NotEqual(fRES(compoundUqFirstCode));
    }

    protected void doSetCompoundUqFirstCode_NotEqual(String compoundUqFirstCode) {
        regCompoundUqFirstCode(CK_NES, compoundUqFirstCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_InScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_InScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_INS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCodeList The collection of compoundUqFirstCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        doSetCompoundUqFirstCode_NotInScope(compoundUqFirstCodeList);
    }

    public void doSetCompoundUqFirstCode_NotInScope(Collection<String> compoundUqFirstCodeList) {
        regINS(CK_NINS, cTL(compoundUqFirstCodeList), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqFirstCode_PrefixSearch(String compoundUqFirstCode) {
        setCompoundUqFirstCode_LikeSearch(compoundUqFirstCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)} <br />
     * <pre>e.g. setCompoundUqFirstCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqFirstCode The value of compoundUqFirstCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_LikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_FIRST_CODE: {UQ, NotNull, CHAR(3)}
     * @param compoundUqFirstCode The value of compoundUqFirstCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqFirstCode_NotLikeSearch(String compoundUqFirstCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqFirstCode), getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE", likeSearchOption);
    }

    protected void regCompoundUqFirstCode(ConditionKey k, Object v) { regQ(k, v, getCValueCompoundUqFirstCode(), "COMPOUND_UQ_FIRST_CODE"); }
    abstract protected ConditionValue getCValueCompoundUqFirstCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_Equal(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_Equal(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_EQ, compoundUqSecondCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        doSetCompoundUqSecondCode_NotEqual(fRES(compoundUqSecondCode));
    }

    protected void doSetCompoundUqSecondCode_NotEqual(String compoundUqSecondCode) {
        regCompoundUqSecondCode(CK_NES, compoundUqSecondCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_InScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_InScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_INS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCodeList The collection of compoundUqSecondCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        doSetCompoundUqSecondCode_NotInScope(compoundUqSecondCodeList);
    }

    public void doSetCompoundUqSecondCode_NotInScope(Collection<String> compoundUqSecondCodeList) {
        regINS(CK_NINS, cTL(compoundUqSecondCodeList), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setCompoundUqSecondCode_PrefixSearch(String compoundUqSecondCode) {
        setCompoundUqSecondCode_LikeSearch(compoundUqSecondCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * <pre>e.g. setCompoundUqSecondCode_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param compoundUqSecondCode The value of compoundUqSecondCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_LikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * COMPOUND_UQ_SECOND_CODE: {UQ+, NotNull, CHAR(3)}
     * @param compoundUqSecondCode The value of compoundUqSecondCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompoundUqSecondCode_NotLikeSearch(String compoundUqSecondCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(compoundUqSecondCode), getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE", likeSearchOption);
    }

    protected void regCompoundUqSecondCode(ConditionKey k, Object v) { regQ(k, v, getCValueCompoundUqSecondCode(), "COMPOUND_UQ_SECOND_CODE"); }
    abstract protected ConditionValue getCValueCompoundUqSecondCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteUqFkRefCB&gt;() {
     *     public void query(WhiteUqFkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteUqFkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WhiteUqFkRefCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WhiteUqFkRefCB>(new HpSSQSetupper<WhiteUqFkRefCB>() {
            public void setup(String function, SubQuery<WhiteUqFkRefCB> subQuery, HpSSQOption<WhiteUqFkRefCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WhiteUqFkRefCB> subQuery, String operand, HpSSQOption<WhiteUqFkRefCB> option) {
        assertObjectNotNull("subQuery<WhiteUqFkRefCB>", subQuery);
        WhiteUqFkRefCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WhiteUqFkRefCQ subQuery);

    protected WhiteUqFkRefCB xcreateScalarConditionCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WhiteUqFkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WhiteUqFkRefCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqFkRefCB>", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "UQ_FK_REF_ID", "UQ_FK_REF_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteUqFkRefCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteUqFkRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WhiteUqFkRefCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WhiteUqFkRefCB>(new HpQDRSetupper<WhiteUqFkRefCB>() {
            public void setup(String function, SubQuery<WhiteUqFkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WhiteUqFkRefCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WhiteUqFkRefCB>", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "UQ_FK_REF_ID", "UQ_FK_REF_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WhiteUqFkRefCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefCB>", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WhiteUqFkRefCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WhiteUqFkRefCB> subQuery) {
        assertObjectNotNull("subQuery<WhiteUqFkRefCB>", subQuery);
        WhiteUqFkRefCB cb = new WhiteUqFkRefCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WhiteUqFkRefCQ subQuery);

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
    protected String xabCB() { return WhiteUqFkRefCB.class.getName(); }
    protected String xabCQ() { return WhiteUqFkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
