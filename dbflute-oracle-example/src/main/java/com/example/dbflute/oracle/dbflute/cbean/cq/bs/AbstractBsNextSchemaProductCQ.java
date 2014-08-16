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
 * The abstract condition-query of NEXT_SCHEMA_PRODUCT.
 * @author oracleman
 */
public abstract class AbstractBsNextSchemaProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextSchemaProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
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
        return "NEXT_SCHEMA_PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (隣の商品ID)PRODUCT_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productName The value of productName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_Equal(String productName) {
        doSetProductName_Equal(fRES(productName));
    }

    protected void doSetProductName_Equal(String productName) {
        regProductName(CK_EQ, productName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productName The value of productName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotEqual(String productName) {
        doSetProductName_NotEqual(fRES(productName));
    }

    protected void doSetProductName_NotEqual(String productName) {
        regProductName(CK_NES, productName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productNameList The collection of productName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        doSetProductName_InScope(productNameList);
    }

    public void doSetProductName_InScope(Collection<String> productNameList) {
        regINS(CK_INS, cTL(productNameList), getCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productNameList The collection of productName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        doSetProductName_NotInScope(productNameList);
    }

    public void doSetProductName_NotInScope(Collection<String> productNameList) {
        regINS(CK_NINS, cTL(productNameList), getCValueProductName(), "PRODUCT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productName The value of productName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductName_PrefixSearch(String productName) {
        setProductName_LikeSearch(productName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)} <br />
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (隣の商品名称)PRODUCT_NAME: {NotNull, VARCHAR2(50)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", likeSearchOption);
    }

    protected void regProductName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductName(), "PRODUCT_NAME"); }
    protected abstract ConditionValue getCValueProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCode The value of productHandleCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_Equal(String productHandleCode) {
        doSetProductHandleCode_Equal(fRES(productHandleCode));
    }

    protected void doSetProductHandleCode_Equal(String productHandleCode) {
        regProductHandleCode(CK_EQ, productHandleCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCode The value of productHandleCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_NotEqual(String productHandleCode) {
        doSetProductHandleCode_NotEqual(fRES(productHandleCode));
    }

    protected void doSetProductHandleCode_NotEqual(String productHandleCode) {
        regProductHandleCode(CK_NES, productHandleCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCodeList The collection of productHandleCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_InScope(Collection<String> productHandleCodeList) {
        doSetProductHandleCode_InScope(productHandleCodeList);
    }

    public void doSetProductHandleCode_InScope(Collection<String> productHandleCodeList) {
        regINS(CK_INS, cTL(productHandleCodeList), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCodeList The collection of productHandleCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_NotInScope(Collection<String> productHandleCodeList) {
        doSetProductHandleCode_NotInScope(productHandleCodeList);
    }

    public void doSetProductHandleCode_NotInScope(Collection<String> productHandleCodeList) {
        regINS(CK_NINS, cTL(productHandleCodeList), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCode The value of productHandleCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductHandleCode_PrefixSearch(String productHandleCode) {
        setProductHandleCode_LikeSearch(productHandleCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)} <br />
     * <pre>e.g. setProductHandleCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productHandleCode The value of productHandleCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductHandleCode_LikeSearch(String productHandleCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productHandleCode), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {NotNull, VARCHAR2(100)}
     * @param productHandleCode The value of productHandleCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductHandleCode_NotLikeSearch(String productHandleCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productHandleCode), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE", likeSearchOption);
    }

    protected void regProductHandleCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE"); }
    protected abstract ConditionValue getCValueProductHandleCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected void doSetProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_InScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        doSetProductStatusCode_NotInScope(productStatusCodeList);
    }

    public void doSetProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regINS(CK_NINS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        setProductStatusCode_LikeSearch(productStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT_STATUS where ...)} <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'nextSchemaProductStatus'.
     * @param subQuery The sub-query of NextSchemaProductStatus for 'in-scope'. (NotNull)
     */
    public void inScopeNextSchemaProductStatus(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductStatusCode_InScopeRelation_NextSchemaProductStatus(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductStatus");
    }
    public abstract String keepProductStatusCode_InScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_STATUS_CODE from NEXT_SCHEMA_PRODUCT_STATUS where ...)} <br />
     * (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'nextSchemaProductStatus'.
     * @param subQuery The sub-query of NextSchemaProductStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeNextSchemaProductStatus(SubQuery<NextSchemaProductStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductStatusCB cb = new NextSchemaProductStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepProductStatusCode_NotInScopeRelation_NextSchemaProductStatus(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", pp, "nextSchemaProductStatus");
    }
    public abstract String keepProductStatusCode_NotInScopeRelation_NextSchemaProductStatus(NextSchemaProductStatusCQ sq);

    protected void regProductStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    protected abstract ConditionValue getCValueProductStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_EQ,  fCTPD(registerDatetime));
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR2(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueRegisterProcess(), "REGISTER_PROCESS"); }
    protected abstract ConditionValue getCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_EQ,  fCTPD(updateDatetime));
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue getCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR2(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueUpdateProcess(), "UPDATE_PROCESS"); }
    protected abstract ConditionValue getCValueUpdateProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(java.math.BigDecimal versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(java.math.BigDecimal versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(38)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, NextSchemaProductCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, NextSchemaProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, NextSchemaProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, NextSchemaProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, NextSchemaProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextSchemaProductCB&gt;() {
     *     public void query(NextSchemaProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<NextSchemaProductCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, NextSchemaProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(NextSchemaProductCQ sq);

    protected NextSchemaProductCB xcreateScalarConditionCB() {
        NextSchemaProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NextSchemaProductCB xcreateScalarConditionPartitionByCB() {
        NextSchemaProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NextSchemaProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NextSchemaProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextSchemaProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NextSchemaProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NextSchemaProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NextSchemaProductCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<NextSchemaProductCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        NextSchemaProductCB cb = new NextSchemaProductCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(NextSchemaProductCQ sq);

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
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderBean mob) { // is user public!
        xdoWithManualOrder(mob);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
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

    @Override
    protected void filterFromToOption(FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected NextSchemaProductCB newMyCB() {
        return new NextSchemaProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return NextSchemaProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
