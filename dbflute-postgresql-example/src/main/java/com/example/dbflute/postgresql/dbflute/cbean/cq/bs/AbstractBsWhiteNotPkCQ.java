package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_not_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNotPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNotPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_not_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as equal. (NullAllowed: if null, no condition)
     */
    public void setNotPkId_Equal(Long notPkId) {
        doSetNotPkId_Equal(notPkId);
    }

    protected void doSetNotPkId_Equal(Long notPkId) {
        regNotPkId(CK_EQ, notPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNotPkId_GreaterThan(Long notPkId) {
        regNotPkId(CK_GT, notPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNotPkId_LessThan(Long notPkId) {
        regNotPkId(CK_LT, notPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNotPkId_GreaterEqual(Long notPkId) {
        regNotPkId(CK_GE, notPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNotPkId_LessEqual(Long notPkId) {
        regNotPkId(CK_LE, notPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param minNumber The min number of notPkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of notPkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNotPkId(), "not_pk_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkIdList The collection of notPkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkId_InScope(Collection<Long> notPkIdList) {
        doSetNotPkId_InScope(notPkIdList);
    }

    protected void doSetNotPkId_InScope(Collection<Long> notPkIdList) {
        regINS(CK_INS, cTL(notPkIdList), getCValueNotPkId(), "not_pk_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkIdList The collection of notPkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkId_NotInScope(Collection<Long> notPkIdList) {
        doSetNotPkId_NotInScope(notPkIdList);
    }

    protected void doSetNotPkId_NotInScope(Collection<Long> notPkIdList) {
        regINS(CK_NINS, cTL(notPkIdList), getCValueNotPkId(), "not_pk_id");
    }

    protected void regNotPkId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNotPkId(), "not_pk_id"); }
    protected abstract ConditionValue getCValueNotPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkName_Equal(String notPkName) {
        doSetNotPkName_Equal(fRES(notPkName));
    }

    protected void doSetNotPkName_Equal(String notPkName) {
        regNotPkName(CK_EQ, notPkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkName_NotEqual(String notPkName) {
        doSetNotPkName_NotEqual(fRES(notPkName));
    }

    protected void doSetNotPkName_NotEqual(String notPkName) {
        regNotPkName(CK_NES, notPkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkNameList The collection of notPkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkName_InScope(Collection<String> notPkNameList) {
        doSetNotPkName_InScope(notPkNameList);
    }

    public void doSetNotPkName_InScope(Collection<String> notPkNameList) {
        regINS(CK_INS, cTL(notPkNameList), getCValueNotPkName(), "not_pk_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkNameList The collection of notPkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkName_NotInScope(Collection<String> notPkNameList) {
        doSetNotPkName_NotInScope(notPkNameList);
    }

    public void doSetNotPkName_NotInScope(Collection<String> notPkNameList) {
        regINS(CK_NINS, cTL(notPkNameList), getCValueNotPkName(), "not_pk_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkName_PrefixSearch(String notPkName) {
        setNotPkName_LikeSearch(notPkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * not_pk_name: {varchar(2147483647)} <br />
     * <pre>e.g. setNotPkName_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notPkName The value of notPkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotPkName_LikeSearch(String notPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notPkName), getCValueNotPkName(), "not_pk_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotPkName_NotLikeSearch(String notPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notPkName), getCValueNotPkName(), "not_pk_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNull() { regNotPkName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNullOrEmpty() { regNotPkName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNotNull() { regNotPkName(CK_ISNN, DOBJ); }

    protected void regNotPkName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNotPkName(), "not_pk_name"); }
    protected abstract ConditionValue getCValueNotPkName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setNotPkInteger_Equal(Integer notPkInteger) {
        doSetNotPkInteger_Equal(notPkInteger);
    }

    protected void doSetNotPkInteger_Equal(Integer notPkInteger) {
        regNotPkInteger(CK_EQ, notPkInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNotPkInteger_GreaterThan(Integer notPkInteger) {
        regNotPkInteger(CK_GT, notPkInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNotPkInteger_LessThan(Integer notPkInteger) {
        regNotPkInteger(CK_LT, notPkInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNotPkInteger_GreaterEqual(Integer notPkInteger) {
        regNotPkInteger(CK_GE, notPkInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNotPkInteger_LessEqual(Integer notPkInteger) {
        regNotPkInteger(CK_LE, notPkInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param minNumber The min number of notPkInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of notPkInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotPkInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNotPkInteger(), "not_pk_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkIntegerList The collection of notPkInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkInteger_InScope(Collection<Integer> notPkIntegerList) {
        doSetNotPkInteger_InScope(notPkIntegerList);
    }

    protected void doSetNotPkInteger_InScope(Collection<Integer> notPkIntegerList) {
        regINS(CK_INS, cTL(notPkIntegerList), getCValueNotPkInteger(), "not_pk_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * not_pk_integer: {int4(10)}
     * @param notPkIntegerList The collection of notPkInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNotPkInteger_NotInScope(Collection<Integer> notPkIntegerList) {
        doSetNotPkInteger_NotInScope(notPkIntegerList);
    }

    protected void doSetNotPkInteger_NotInScope(Collection<Integer> notPkIntegerList) {
        regINS(CK_NINS, cTL(notPkIntegerList), getCValueNotPkInteger(), "not_pk_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     */
    public void setNotPkInteger_IsNull() { regNotPkInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * not_pk_integer: {int4(10)}
     */
    public void setNotPkInteger_IsNotNull() { regNotPkInteger(CK_ISNN, DOBJ); }

    protected void regNotPkInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueNotPkInteger(), "not_pk_integer"); }
    protected abstract ConditionValue getCValueNotPkInteger();

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
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.seasar.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteNotPkCB newMyCB() {
        return new WhiteNotPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteNotPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
