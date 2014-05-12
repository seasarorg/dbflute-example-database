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
 * The abstract condition-query of white_compound_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstId The value of pkFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_Equal(Integer pkFirstId) {
        doSetPkFirstId_Equal(pkFirstId);
    }

    protected void doSetPkFirstId_Equal(Integer pkFirstId) {
        regPkFirstId(CK_EQ, pkFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstId The value of pkFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_GreaterThan(Integer pkFirstId) {
        regPkFirstId(CK_GT, pkFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstId The value of pkFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_LessThan(Integer pkFirstId) {
        regPkFirstId(CK_LT, pkFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstId The value of pkFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_GreaterEqual(Integer pkFirstId) {
        regPkFirstId(CK_GE, pkFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstId The value of pkFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPkFirstId_LessEqual(Integer pkFirstId) {
        regPkFirstId(CK_LE, pkFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of pkFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of pkFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkFirstId(), "pk_first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstIdList The collection of pkFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_InScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_InScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_INS, cTL(pkFirstIdList), getCValuePkFirstId(), "pk_first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     * @param pkFirstIdList The collection of pkFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        doSetPkFirstId_NotInScope(pkFirstIdList);
    }

    protected void doSetPkFirstId_NotInScope(Collection<Integer> pkFirstIdList) {
        regINS(CK_NINS, cTL(pkFirstIdList), getCValuePkFirstId(), "pk_first_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     */
    public void setPkFirstId_IsNull() { regPkFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * pk_first_id: {PK, NotNull, int4(10)}
     */
    public void setPkFirstId_IsNotNull() { regPkFirstId(CK_ISNN, DOBJ); }

    protected void regPkFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePkFirstId(), "pk_first_id"); }
    protected abstract ConditionValue getCValuePkFirstId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondId The value of pkSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_Equal(Integer pkSecondId) {
        doSetPkSecondId_Equal(pkSecondId);
    }

    protected void doSetPkSecondId_Equal(Integer pkSecondId) {
        regPkSecondId(CK_EQ, pkSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondId The value of pkSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_GreaterThan(Integer pkSecondId) {
        regPkSecondId(CK_GT, pkSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondId The value of pkSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_LessThan(Integer pkSecondId) {
        regPkSecondId(CK_LT, pkSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondId The value of pkSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_GreaterEqual(Integer pkSecondId) {
        regPkSecondId(CK_GE, pkSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondId The value of pkSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPkSecondId_LessEqual(Integer pkSecondId) {
        regPkSecondId(CK_LE, pkSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of pkSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of pkSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkSecondId(), "pk_second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondIdList The collection of pkSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_InScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_InScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_INS, cTL(pkSecondIdList), getCValuePkSecondId(), "pk_second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     * @param pkSecondIdList The collection of pkSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        doSetPkSecondId_NotInScope(pkSecondIdList);
    }

    protected void doSetPkSecondId_NotInScope(Collection<Integer> pkSecondIdList) {
        regINS(CK_NINS, cTL(pkSecondIdList), getCValuePkSecondId(), "pk_second_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     */
    public void setPkSecondId_IsNull() { regPkSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * pk_second_id: {PK, NotNull, int4(10)}
     */
    public void setPkSecondId_IsNotNull() { regPkSecondId(CK_ISNN, DOBJ); }

    protected void regPkSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePkSecondId(), "pk_second_id"); }
    protected abstract ConditionValue getCValuePkSecondId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkName The value of pkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_Equal(String pkName) {
        doSetPkName_Equal(fRES(pkName));
    }

    protected void doSetPkName_Equal(String pkName) {
        regPkName(CK_EQ, pkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkName The value of pkName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_NotEqual(String pkName) {
        doSetPkName_NotEqual(fRES(pkName));
    }

    protected void doSetPkName_NotEqual(String pkName) {
        regPkName(CK_NES, pkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkNameList The collection of pkName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_InScope(Collection<String> pkNameList) {
        doSetPkName_InScope(pkNameList);
    }

    public void doSetPkName_InScope(Collection<String> pkNameList) {
        regINS(CK_INS, cTL(pkNameList), getCValuePkName(), "pk_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkNameList The collection of pkName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_NotInScope(Collection<String> pkNameList) {
        doSetPkName_NotInScope(pkNameList);
    }

    public void doSetPkName_NotInScope(Collection<String> pkNameList) {
        regINS(CK_NINS, cTL(pkNameList), getCValuePkName(), "pk_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkName The value of pkName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPkName_PrefixSearch(String pkName) {
        setPkName_LikeSearch(pkName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * pk_name: {NotNull, varchar(200)} <br />
     * <pre>e.g. setPkName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pkName The value of pkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkName_LikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pkName), getCValuePkName(), "pk_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * pk_name: {NotNull, varchar(200)}
     * @param pkName The value of pkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPkName_NotLikeSearch(String pkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pkName), getCValuePkName(), "pk_name", likeSearchOption);
    }

    protected void regPkName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValuePkName(), "pk_name"); }
    protected abstract ConditionValue getCValuePkName();

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
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteCompoundPkCB newMyCB() {
        return new WhiteCompoundPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return WhiteCompoundPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
