package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of WHITE_UQ_FK_WITHOUT_PK_REF.
 * @author oracleman
 */
public abstract class AbstractBsWhiteUqFkWithoutPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteUqFkWithoutPkRefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_UQ_FK_WITHOUT_PK_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
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
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_GreaterThan(Long uqFkRefId) {
        regUqFkRefId(CK_GT, uqFkRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param uqFkRefId The value of uqFkRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_LessThan(Long uqFkRefId) {
        regUqFkRefId(CK_LT, uqFkRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param uqFkRefId The value of uqFkRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_GreaterEqual(Long uqFkRefId) {
        regUqFkRefId(CK_GE, uqFkRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param uqFkRefId The value of uqFkRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUqFkRefId_LessEqual(Long uqFkRefId) {
        regUqFkRefId(CK_LE, uqFkRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param minNumber The min number of uqFkRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of uqFkRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUqFkRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUqFkRefId(), "UQ_FK_REF_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
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
     * UQ_FK_REF_ID: {NotNull, NUMBER(16)}
     * @param uqFkRefIdList The collection of uqFkRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        doSetUqFkRefId_NotInScope(uqFkRefIdList);
    }

    protected void doSetUqFkRefId_NotInScope(Collection<Long> uqFkRefIdList) {
        regINS(CK_NINS, cTL(uqFkRefIdList), getCValueUqFkRefId(), "UQ_FK_REF_ID");
    }

    protected void regUqFkRefId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUqFkRefId(), "UQ_FK_REF_ID"); }
    protected abstract ConditionValue getCValueUqFkRefId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @param fkToUqCode The value of fkToUqCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_Equal(String fkToUqCode) {
        doSetFkToUqCode_Equal(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_Equal(String fkToUqCode) {
        regFkToUqCode(CK_EQ, hSC("FK_TO_UQ_CODE", fkToUqCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @param fkToUqCode The value of fkToUqCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_NotEqual(String fkToUqCode) {
        doSetFkToUqCode_NotEqual(fRES(fkToUqCode));
    }

    protected void doSetFkToUqCode_NotEqual(String fkToUqCode) {
        regFkToUqCode(CK_NES, hSC("FK_TO_UQ_CODE", fkToUqCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
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
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
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
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @param fkToUqCode The value of fkToUqCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setFkToUqCode_PrefixSearch(String fkToUqCode) {
        setFkToUqCode_LikeSearch(fkToUqCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} <br />
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
     * FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK}
     * @param fkToUqCode The value of fkToUqCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFkToUqCode_NotLikeSearch(String fkToUqCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fkToUqCode), getCValueFkToUqCode(), "FK_TO_UQ_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @param subQuery The sub-query of WhiteUqFkWithoutPk for 'in-scope'. (NotNull)
     */
    public void inScopeWhiteUqFkWithoutPk(SubQuery<WhiteUqFkWithoutPkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "FK_TO_UQ_CODE", "UQ_FK_CODE", pp, "whiteUqFkWithoutPk");
    }
    public abstract String keepFkToUqCode_InScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FK_TO_UQ_CODE from WHITE_UQ_FK_WITHOUT_PK where ...)} <br />
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @param subQuery The sub-query of WhiteUqFkWithoutPk for 'not in-scope'. (NotNull)
     */
    public void notInScopeWhiteUqFkWithoutPk(SubQuery<WhiteUqFkWithoutPkCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        WhiteUqFkWithoutPkCB cb = new WhiteUqFkWithoutPkCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String pp = keepFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "FK_TO_UQ_CODE", "UQ_FK_CODE", pp, "whiteUqFkWithoutPk");
    }
    public abstract String keepFkToUqCode_NotInScopeRelation_WhiteUqFkWithoutPk(WhiteUqFkWithoutPkCQ sq);

    protected void regFkToUqCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueFkToUqCode(), "FK_TO_UQ_CODE"); }
    protected abstract ConditionValue getCValueFkToUqCode();

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br />
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.seasar.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br />
     * The specified condition value is escaped in this method automatically.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return xescapeOracleFullTextSearchValue(conditionValue);
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new OracleMatchLikeSearch();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WhiteUqFkWithoutPkRefCB.class.getName(); }
    protected String xabCQ() { return WhiteUqFkWithoutPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
