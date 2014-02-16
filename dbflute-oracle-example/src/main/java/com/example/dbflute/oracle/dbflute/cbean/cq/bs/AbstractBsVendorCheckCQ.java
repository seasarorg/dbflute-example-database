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
 * The abstract condition-query of VENDOR_CHECK.
 * @author oracleman
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected abstract ConditionValue getCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, hSC("TYPE_OF_CHAR", typeOfChar, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, hSC("TYPE_OF_CHAR", typeOfChar, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    public void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    public void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)} <br />
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected abstract ConditionValue getCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_Equal(String typeOfNchar) {
        doSetTypeOfNchar_Equal(fRES(typeOfNchar));
    }

    protected void doSetTypeOfNchar_Equal(String typeOfNchar) {
        regTypeOfNchar(CK_EQ, hSC("TYPE_OF_NCHAR", typeOfNchar, 3, "R"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_NotEqual(String typeOfNchar) {
        doSetTypeOfNchar_NotEqual(fRES(typeOfNchar));
    }

    protected void doSetTypeOfNchar_NotEqual(String typeOfNchar) {
        regTypeOfNchar(CK_NES, hSC("TYPE_OF_NCHAR", typeOfNchar, 3, "R"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNcharList The collection of typeOfNchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_InScope(Collection<String> typeOfNcharList) {
        doSetTypeOfNchar_InScope(typeOfNcharList);
    }

    public void doSetTypeOfNchar_InScope(Collection<String> typeOfNcharList) {
        regINS(CK_INS, cTL(typeOfNcharList), getCValueTypeOfNchar(), "TYPE_OF_NCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNcharList The collection of typeOfNchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_NotInScope(Collection<String> typeOfNcharList) {
        doSetTypeOfNchar_NotInScope(typeOfNcharList);
    }

    public void doSetTypeOfNchar_NotInScope(Collection<String> typeOfNcharList) {
        regINS(CK_NINS, cTL(typeOfNcharList), getCValueTypeOfNchar(), "TYPE_OF_NCHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNchar_PrefixSearch(String typeOfNchar) {
        setTypeOfNchar_LikeSearch(typeOfNchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)} <br />
     * <pre>e.g. setTypeOfNchar_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNchar The value of typeOfNchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNchar_LikeSearch(String typeOfNchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNchar), getCValueTypeOfNchar(), "TYPE_OF_NCHAR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @param typeOfNchar The value of typeOfNchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNchar_NotLikeSearch(String typeOfNchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNchar), getCValueTypeOfNchar(), "TYPE_OF_NCHAR", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNull() { regTypeOfNchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNullOrEmpty() { regTypeOfNchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     */
    public void setTypeOfNchar_IsNotNull() { regTypeOfNchar(CK_ISNN, DOBJ); }

    protected void regTypeOfNchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNchar(), "TYPE_OF_NCHAR"); }
    protected abstract ConditionValue getCValueTypeOfNchar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_Equal(String typeOfVarchar2) {
        doSetTypeOfVarchar2_Equal(fRES(typeOfVarchar2));
    }

    protected void doSetTypeOfVarchar2_Equal(String typeOfVarchar2) {
        regTypeOfVarchar2(CK_EQ, typeOfVarchar2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_NotEqual(String typeOfVarchar2) {
        doSetTypeOfVarchar2_NotEqual(fRES(typeOfVarchar2));
    }

    protected void doSetTypeOfVarchar2_NotEqual(String typeOfVarchar2) {
        regTypeOfVarchar2(CK_NES, typeOfVarchar2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2List The collection of typeOfVarchar2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_InScope(Collection<String> typeOfVarchar2List) {
        doSetTypeOfVarchar2_InScope(typeOfVarchar2List);
    }

    public void doSetTypeOfVarchar2_InScope(Collection<String> typeOfVarchar2List) {
        regINS(CK_INS, cTL(typeOfVarchar2List), getCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2List The collection of typeOfVarchar2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_NotInScope(Collection<String> typeOfVarchar2List) {
        doSetTypeOfVarchar2_NotInScope(typeOfVarchar2List);
    }

    public void doSetTypeOfVarchar2_NotInScope(Collection<String> typeOfVarchar2List) {
        regINS(CK_NINS, cTL(typeOfVarchar2List), getCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2_PrefixSearch(String typeOfVarchar2) {
        setTypeOfVarchar2_LikeSearch(typeOfVarchar2, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)} <br />
     * <pre>e.g. setTypeOfVarchar2_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar2 The value of typeOfVarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2_LikeSearch(String typeOfVarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar2), getCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @param typeOfVarchar2 The value of typeOfVarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar2_NotLikeSearch(String typeOfVarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar2), getCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNull() { regTypeOfVarchar2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNullOrEmpty() { regTypeOfVarchar2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     */
    public void setTypeOfVarchar2_IsNotNull() { regTypeOfVarchar2(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar2(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfVarchar2(), "TYPE_OF_VARCHAR2"); }
    protected abstract ConditionValue getCValueTypeOfVarchar2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_Equal(String typeOfVarchar2Max) {
        doSetTypeOfVarchar2Max_Equal(fRES(typeOfVarchar2Max));
    }

    protected void doSetTypeOfVarchar2Max_Equal(String typeOfVarchar2Max) {
        regTypeOfVarchar2Max(CK_EQ, typeOfVarchar2Max);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_NotEqual(String typeOfVarchar2Max) {
        doSetTypeOfVarchar2Max_NotEqual(fRES(typeOfVarchar2Max));
    }

    protected void doSetTypeOfVarchar2Max_NotEqual(String typeOfVarchar2Max) {
        regTypeOfVarchar2Max(CK_NES, typeOfVarchar2Max);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2MaxList The collection of typeOfVarchar2Max as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_InScope(Collection<String> typeOfVarchar2MaxList) {
        doSetTypeOfVarchar2Max_InScope(typeOfVarchar2MaxList);
    }

    public void doSetTypeOfVarchar2Max_InScope(Collection<String> typeOfVarchar2MaxList) {
        regINS(CK_INS, cTL(typeOfVarchar2MaxList), getCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2MaxList The collection of typeOfVarchar2Max as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_NotInScope(Collection<String> typeOfVarchar2MaxList) {
        doSetTypeOfVarchar2Max_NotInScope(typeOfVarchar2MaxList);
    }

    public void doSetTypeOfVarchar2Max_NotInScope(Collection<String> typeOfVarchar2MaxList) {
        regINS(CK_NINS, cTL(typeOfVarchar2MaxList), getCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar2Max_PrefixSearch(String typeOfVarchar2Max) {
        setTypeOfVarchar2Max_LikeSearch(typeOfVarchar2Max, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)} <br />
     * <pre>e.g. setTypeOfVarchar2Max_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_LikeSearch(String typeOfVarchar2Max, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar2Max), getCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @param typeOfVarchar2Max The value of typeOfVarchar2Max as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar2Max_NotLikeSearch(String typeOfVarchar2Max, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar2Max), getCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNull() { regTypeOfVarchar2Max(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNullOrEmpty() { regTypeOfVarchar2Max(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     */
    public void setTypeOfVarchar2Max_IsNotNull() { regTypeOfVarchar2Max(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar2Max(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfVarchar2Max(), "TYPE_OF_VARCHAR2_MAX"); }
    protected abstract ConditionValue getCValueTypeOfVarchar2Max();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_Equal(String typeOfNvarchar2) {
        doSetTypeOfNvarchar2_Equal(fRES(typeOfNvarchar2));
    }

    protected void doSetTypeOfNvarchar2_Equal(String typeOfNvarchar2) {
        regTypeOfNvarchar2(CK_EQ, typeOfNvarchar2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_NotEqual(String typeOfNvarchar2) {
        doSetTypeOfNvarchar2_NotEqual(fRES(typeOfNvarchar2));
    }

    protected void doSetTypeOfNvarchar2_NotEqual(String typeOfNvarchar2) {
        regTypeOfNvarchar2(CK_NES, typeOfNvarchar2);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2List The collection of typeOfNvarchar2 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_InScope(Collection<String> typeOfNvarchar2List) {
        doSetTypeOfNvarchar2_InScope(typeOfNvarchar2List);
    }

    public void doSetTypeOfNvarchar2_InScope(Collection<String> typeOfNvarchar2List) {
        regINS(CK_INS, cTL(typeOfNvarchar2List), getCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2List The collection of typeOfNvarchar2 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_NotInScope(Collection<String> typeOfNvarchar2List) {
        doSetTypeOfNvarchar2_NotInScope(typeOfNvarchar2List);
    }

    public void doSetTypeOfNvarchar2_NotInScope(Collection<String> typeOfNvarchar2List) {
        regINS(CK_NINS, cTL(typeOfNvarchar2List), getCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNvarchar2_PrefixSearch(String typeOfNvarchar2) {
        setTypeOfNvarchar2_LikeSearch(typeOfNvarchar2, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)} <br />
     * <pre>e.g. setTypeOfNvarchar2_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_LikeSearch(String typeOfNvarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNvarchar2), getCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @param typeOfNvarchar2 The value of typeOfNvarchar2 as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNvarchar2_NotLikeSearch(String typeOfNvarchar2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNvarchar2), getCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNull() { regTypeOfNvarchar2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNullOrEmpty() { regTypeOfNvarchar2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     */
    public void setTypeOfNvarchar2_IsNotNull() { regTypeOfNvarchar2(CK_ISNN, DOBJ); }

    protected void regTypeOfNvarchar2(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNvarchar2(), "TYPE_OF_NVARCHAR2"); }
    protected abstract ConditionValue getCValueTypeOfNvarchar2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_Equal(String typeOfClob) {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_Equal(String typeOfClob) {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotEqual(String typeOfClob) {
        doSetTypeOfClob_NotEqual(fRES(typeOfClob));
    }

    protected void doSetTypeOfClob_NotEqual(String typeOfClob) {
        regTypeOfClob(CK_NES, typeOfClob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClobList The collection of typeOfClob as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_InScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_InScope(typeOfClobList);
    }

    public void doSetTypeOfClob_InScope(Collection<String> typeOfClobList) {
        regINS(CK_INS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClobList The collection of typeOfClob as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        doSetTypeOfClob_NotInScope(typeOfClobList);
    }

    public void doSetTypeOfClob_NotInScope(Collection<String> typeOfClobList) {
        regINS(CK_NINS, cTL(typeOfClobList), getCValueTypeOfClob(), "TYPE_OF_CLOB");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfClob_PrefixSearch(String typeOfClob) {
        setTypeOfClob_LikeSearch(typeOfClob, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)} <br />
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfClob_LikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfClob_NotLikeSearch(String typeOfClob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     */
    public void setTypeOfClob_IsNull() { regTypeOfClob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     */
    public void setTypeOfClob_IsNotNull() { regTypeOfClob(CK_ISNN, DOBJ); }

    protected void regTypeOfClob(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    protected abstract ConditionValue getCValueTypeOfClob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_Equal(String typeOfNclob) {
        doSetTypeOfNclob_Equal(fRES(typeOfNclob));
    }

    protected void doSetTypeOfNclob_Equal(String typeOfNclob) {
        regTypeOfNclob(CK_EQ, typeOfNclob);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_NotEqual(String typeOfNclob) {
        doSetTypeOfNclob_NotEqual(fRES(typeOfNclob));
    }

    protected void doSetTypeOfNclob_NotEqual(String typeOfNclob) {
        regTypeOfNclob(CK_NES, typeOfNclob);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclobList The collection of typeOfNclob as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_InScope(Collection<String> typeOfNclobList) {
        doSetTypeOfNclob_InScope(typeOfNclobList);
    }

    public void doSetTypeOfNclob_InScope(Collection<String> typeOfNclobList) {
        regINS(CK_INS, cTL(typeOfNclobList), getCValueTypeOfNclob(), "TYPE_OF_NCLOB");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclobList The collection of typeOfNclob as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_NotInScope(Collection<String> typeOfNclobList) {
        doSetTypeOfNclob_NotInScope(typeOfNclobList);
    }

    public void doSetTypeOfNclob_NotInScope(Collection<String> typeOfNclobList) {
        regINS(CK_NINS, cTL(typeOfNclobList), getCValueTypeOfNclob(), "TYPE_OF_NCLOB");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNclob_PrefixSearch(String typeOfNclob) {
        setTypeOfNclob_LikeSearch(typeOfNclob, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)} <br />
     * <pre>e.g. setTypeOfNclob_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfNclob The value of typeOfNclob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfNclob_LikeSearch(String typeOfNclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfNclob), getCValueTypeOfNclob(), "TYPE_OF_NCLOB", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @param typeOfNclob The value of typeOfNclob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfNclob_NotLikeSearch(String typeOfNclob, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfNclob), getCValueTypeOfNclob(), "TYPE_OF_NCLOB", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     */
    public void setTypeOfNclob_IsNull() { regTypeOfNclob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     */
    public void setTypeOfNclob_IsNotNull() { regTypeOfNclob(CK_ISNN, DOBJ); }

    protected void regTypeOfNclob(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNclob(), "TYPE_OF_NCLOB"); }
    protected abstract ConditionValue getCValueTypeOfNclob();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_Equal(String typeOfLong) {
        doSetTypeOfLong_Equal(fRES(typeOfLong));
    }

    protected void doSetTypeOfLong_Equal(String typeOfLong) {
        regTypeOfLong(CK_EQ, typeOfLong);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_NotEqual(String typeOfLong) {
        doSetTypeOfLong_NotEqual(fRES(typeOfLong));
    }

    protected void doSetTypeOfLong_NotEqual(String typeOfLong) {
        regTypeOfLong(CK_NES, typeOfLong);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLongList The collection of typeOfLong as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_InScope(Collection<String> typeOfLongList) {
        doSetTypeOfLong_InScope(typeOfLongList);
    }

    public void doSetTypeOfLong_InScope(Collection<String> typeOfLongList) {
        regINS(CK_INS, cTL(typeOfLongList), getCValueTypeOfLong(), "TYPE_OF_LONG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLongList The collection of typeOfLong as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_NotInScope(Collection<String> typeOfLongList) {
        doSetTypeOfLong_NotInScope(typeOfLongList);
    }

    public void doSetTypeOfLong_NotInScope(Collection<String> typeOfLongList) {
        regINS(CK_NINS, cTL(typeOfLongList), getCValueTypeOfLong(), "TYPE_OF_LONG");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfLong_PrefixSearch(String typeOfLong) {
        setTypeOfLong_LikeSearch(typeOfLong, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG: {LONG} <br />
     * <pre>e.g. setTypeOfLong_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfLong The value of typeOfLong as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfLong_LikeSearch(String typeOfLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfLong), getCValueTypeOfLong(), "TYPE_OF_LONG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     * @param typeOfLong The value of typeOfLong as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfLong_NotLikeSearch(String typeOfLong, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfLong), getCValueTypeOfLong(), "TYPE_OF_LONG", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNull() { regTypeOfLong(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNullOrEmpty() { regTypeOfLong(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_LONG: {LONG}
     */
    public void setTypeOfLong_IsNotNull() { regTypeOfLong(CK_ISNN, DOBJ); }

    protected void regTypeOfLong(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfLong(), "TYPE_OF_LONG"); }
    protected abstract ConditionValue getCValueTypeOfLong();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_Equal(String typeOfXmltype) {
        doSetTypeOfXmltype_Equal(fRES(typeOfXmltype));
    }

    protected void doSetTypeOfXmltype_Equal(String typeOfXmltype) {
        regTypeOfXmltype(CK_EQ, typeOfXmltype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_NotEqual(String typeOfXmltype) {
        doSetTypeOfXmltype_NotEqual(fRES(typeOfXmltype));
    }

    protected void doSetTypeOfXmltype_NotEqual(String typeOfXmltype) {
        regTypeOfXmltype(CK_NES, typeOfXmltype);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltypeList The collection of typeOfXmltype as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_InScope(Collection<String> typeOfXmltypeList) {
        doSetTypeOfXmltype_InScope(typeOfXmltypeList);
    }

    public void doSetTypeOfXmltype_InScope(Collection<String> typeOfXmltypeList) {
        regINS(CK_INS, cTL(typeOfXmltypeList), getCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltypeList The collection of typeOfXmltype as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_NotInScope(Collection<String> typeOfXmltypeList) {
        doSetTypeOfXmltype_NotInScope(typeOfXmltypeList);
    }

    public void doSetTypeOfXmltype_NotInScope(Collection<String> typeOfXmltypeList) {
        regINS(CK_NINS, cTL(typeOfXmltypeList), getCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfXmltype_PrefixSearch(String typeOfXmltype) {
        setTypeOfXmltype_LikeSearch(typeOfXmltype, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)} <br />
     * <pre>e.g. setTypeOfXmltype_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfXmltype The value of typeOfXmltype as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfXmltype_LikeSearch(String typeOfXmltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfXmltype), getCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @param typeOfXmltype The value of typeOfXmltype as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfXmltype_NotLikeSearch(String typeOfXmltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfXmltype), getCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNull() { regTypeOfXmltype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNullOrEmpty() { regTypeOfXmltype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     */
    public void setTypeOfXmltype_IsNotNull() { regTypeOfXmltype(CK_ISNN, DOBJ); }

    protected void regTypeOfXmltype(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfXmltype(), "TYPE_OF_XMLTYPE"); }
    protected abstract ConditionValue getCValueTypeOfXmltype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberInteger_Equal(Integer typeOfNumberInteger) {
        doSetTypeOfNumberInteger_Equal(typeOfNumberInteger);
    }

    protected void doSetTypeOfNumberInteger_Equal(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_EQ, typeOfNumberInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberInteger_GreaterThan(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_GT, typeOfNumberInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberInteger_LessThan(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_LT, typeOfNumberInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberInteger_GreaterEqual(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_GE, typeOfNumberInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberInteger The value of typeOfNumberInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberInteger_LessEqual(Integer typeOfNumberInteger) {
        regTypeOfNumberInteger(CK_LE, typeOfNumberInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param minNumber The min number of typeOfNumberInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberIntegerList The collection of typeOfNumberInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberInteger_InScope(Collection<Integer> typeOfNumberIntegerList) {
        doSetTypeOfNumberInteger_InScope(typeOfNumberIntegerList);
    }

    protected void doSetTypeOfNumberInteger_InScope(Collection<Integer> typeOfNumberIntegerList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerList), getCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @param typeOfNumberIntegerList The collection of typeOfNumberInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberInteger_NotInScope(Collection<Integer> typeOfNumberIntegerList) {
        doSetTypeOfNumberInteger_NotInScope(typeOfNumberIntegerList);
    }

    protected void doSetTypeOfNumberInteger_NotInScope(Collection<Integer> typeOfNumberIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerList), getCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     */
    public void setTypeOfNumberInteger_IsNull() { regTypeOfNumberInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     */
    public void setTypeOfNumberInteger_IsNotNull() { regTypeOfNumberInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberInteger(), "TYPE_OF_NUMBER_INTEGER"); }
    protected abstract ConditionValue getCValueTypeOfNumberInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigint_Equal(Long typeOfNumberBigint) {
        doSetTypeOfNumberBigint_Equal(typeOfNumberBigint);
    }

    protected void doSetTypeOfNumberBigint_Equal(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_EQ, typeOfNumberBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigint_GreaterThan(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_GT, typeOfNumberBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigint_LessThan(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_LT, typeOfNumberBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigint_GreaterEqual(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_GE, typeOfNumberBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigint The value of typeOfNumberBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigint_LessEqual(Long typeOfNumberBigint) {
        regTypeOfNumberBigint(CK_LE, typeOfNumberBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param minNumber The min number of typeOfNumberBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigintList The collection of typeOfNumberBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigint_InScope(Collection<Long> typeOfNumberBigintList) {
        doSetTypeOfNumberBigint_InScope(typeOfNumberBigintList);
    }

    protected void doSetTypeOfNumberBigint_InScope(Collection<Long> typeOfNumberBigintList) {
        regINS(CK_INS, cTL(typeOfNumberBigintList), getCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @param typeOfNumberBigintList The collection of typeOfNumberBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigint_NotInScope(Collection<Long> typeOfNumberBigintList) {
        doSetTypeOfNumberBigint_NotInScope(typeOfNumberBigintList);
    }

    protected void doSetTypeOfNumberBigint_NotInScope(Collection<Long> typeOfNumberBigintList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintList), getCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     */
    public void setTypeOfNumberBigint_IsNull() { regTypeOfNumberBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     */
    public void setTypeOfNumberBigint_IsNotNull() { regTypeOfNumberBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberBigint(), "TYPE_OF_NUMBER_BIGINT"); }
    protected abstract ConditionValue getCValueTypeOfNumberBigint();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberDecimal_Equal(java.math.BigDecimal typeOfNumberDecimal) {
        doSetTypeOfNumberDecimal_Equal(typeOfNumberDecimal);
    }

    protected void doSetTypeOfNumberDecimal_Equal(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_EQ, typeOfNumberDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberDecimal_GreaterThan(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_GT, typeOfNumberDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberDecimal_LessThan(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_LT, typeOfNumberDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberDecimal_GreaterEqual(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_GE, typeOfNumberDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimal The value of typeOfNumberDecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberDecimal_LessEqual(java.math.BigDecimal typeOfNumberDecimal) {
        regTypeOfNumberDecimal(CK_LE, typeOfNumberDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param minNumber The min number of typeOfNumberDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimalList The collection of typeOfNumberDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        doSetTypeOfNumberDecimal_InScope(typeOfNumberDecimalList);
    }

    protected void doSetTypeOfNumberDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        regINS(CK_INS, cTL(typeOfNumberDecimalList), getCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @param typeOfNumberDecimalList The collection of typeOfNumberDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        doSetTypeOfNumberDecimal_NotInScope(typeOfNumberDecimalList);
    }

    protected void doSetTypeOfNumberDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumberDecimalList), getCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     */
    public void setTypeOfNumberDecimal_IsNull() { regTypeOfNumberDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     */
    public void setTypeOfNumberDecimal_IsNotNull() { regTypeOfNumberDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberDecimal(), "TYPE_OF_NUMBER_DECIMAL"); }
    protected abstract ConditionValue getCValueTypeOfNumberDecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMin_Equal(Integer typeOfNumberIntegerMin) {
        doSetTypeOfNumberIntegerMin_Equal(typeOfNumberIntegerMin);
    }

    protected void doSetTypeOfNumberIntegerMin_Equal(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_EQ, typeOfNumberIntegerMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMin_GreaterThan(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_GT, typeOfNumberIntegerMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMin_LessThan(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_LT, typeOfNumberIntegerMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMin_GreaterEqual(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_GE, typeOfNumberIntegerMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMin The value of typeOfNumberIntegerMin as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMin_LessEqual(Integer typeOfNumberIntegerMin) {
        regTypeOfNumberIntegerMin(CK_LE, typeOfNumberIntegerMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param minNumber The min number of typeOfNumberIntegerMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMin_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMinList The collection of typeOfNumberIntegerMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMin_InScope(Collection<Integer> typeOfNumberIntegerMinList) {
        doSetTypeOfNumberIntegerMin_InScope(typeOfNumberIntegerMinList);
    }

    protected void doSetTypeOfNumberIntegerMin_InScope(Collection<Integer> typeOfNumberIntegerMinList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerMinList), getCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @param typeOfNumberIntegerMinList The collection of typeOfNumberIntegerMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMin_NotInScope(Collection<Integer> typeOfNumberIntegerMinList) {
        doSetTypeOfNumberIntegerMin_NotInScope(typeOfNumberIntegerMinList);
    }

    protected void doSetTypeOfNumberIntegerMin_NotInScope(Collection<Integer> typeOfNumberIntegerMinList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerMinList), getCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     */
    public void setTypeOfNumberIntegerMin_IsNull() { regTypeOfNumberIntegerMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     */
    public void setTypeOfNumberIntegerMin_IsNotNull() { regTypeOfNumberIntegerMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberIntegerMin(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberIntegerMin(), "TYPE_OF_NUMBER_INTEGER_MIN"); }
    protected abstract ConditionValue getCValueTypeOfNumberIntegerMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMax_Equal(Integer typeOfNumberIntegerMax) {
        doSetTypeOfNumberIntegerMax_Equal(typeOfNumberIntegerMax);
    }

    protected void doSetTypeOfNumberIntegerMax_Equal(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_EQ, typeOfNumberIntegerMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMax_GreaterThan(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_GT, typeOfNumberIntegerMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMax_LessThan(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_LT, typeOfNumberIntegerMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMax_GreaterEqual(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_GE, typeOfNumberIntegerMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMax The value of typeOfNumberIntegerMax as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberIntegerMax_LessEqual(Integer typeOfNumberIntegerMax) {
        regTypeOfNumberIntegerMax(CK_LE, typeOfNumberIntegerMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param minNumber The min number of typeOfNumberIntegerMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberIntegerMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberIntegerMax_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMaxList The collection of typeOfNumberIntegerMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMax_InScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        doSetTypeOfNumberIntegerMax_InScope(typeOfNumberIntegerMaxList);
    }

    protected void doSetTypeOfNumberIntegerMax_InScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        regINS(CK_INS, cTL(typeOfNumberIntegerMaxList), getCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @param typeOfNumberIntegerMaxList The collection of typeOfNumberIntegerMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberIntegerMax_NotInScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        doSetTypeOfNumberIntegerMax_NotInScope(typeOfNumberIntegerMaxList);
    }

    protected void doSetTypeOfNumberIntegerMax_NotInScope(Collection<Integer> typeOfNumberIntegerMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberIntegerMaxList), getCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     */
    public void setTypeOfNumberIntegerMax_IsNull() { regTypeOfNumberIntegerMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     */
    public void setTypeOfNumberIntegerMax_IsNotNull() { regTypeOfNumberIntegerMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberIntegerMax(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberIntegerMax(), "TYPE_OF_NUMBER_INTEGER_MAX"); }
    protected abstract ConditionValue getCValueTypeOfNumberIntegerMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMin_Equal(Long typeOfNumberBigintMin) {
        doSetTypeOfNumberBigintMin_Equal(typeOfNumberBigintMin);
    }

    protected void doSetTypeOfNumberBigintMin_Equal(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_EQ, typeOfNumberBigintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMin_GreaterThan(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_GT, typeOfNumberBigintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMin_LessThan(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_LT, typeOfNumberBigintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMin_GreaterEqual(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_GE, typeOfNumberBigintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMin The value of typeOfNumberBigintMin as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMin_LessEqual(Long typeOfNumberBigintMin) {
        regTypeOfNumberBigintMin(CK_LE, typeOfNumberBigintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param minNumber The min number of typeOfNumberBigintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMin_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMinList The collection of typeOfNumberBigintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMin_InScope(Collection<Long> typeOfNumberBigintMinList) {
        doSetTypeOfNumberBigintMin_InScope(typeOfNumberBigintMinList);
    }

    protected void doSetTypeOfNumberBigintMin_InScope(Collection<Long> typeOfNumberBigintMinList) {
        regINS(CK_INS, cTL(typeOfNumberBigintMinList), getCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @param typeOfNumberBigintMinList The collection of typeOfNumberBigintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMin_NotInScope(Collection<Long> typeOfNumberBigintMinList) {
        doSetTypeOfNumberBigintMin_NotInScope(typeOfNumberBigintMinList);
    }

    protected void doSetTypeOfNumberBigintMin_NotInScope(Collection<Long> typeOfNumberBigintMinList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintMinList), getCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     */
    public void setTypeOfNumberBigintMin_IsNull() { regTypeOfNumberBigintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     */
    public void setTypeOfNumberBigintMin_IsNotNull() { regTypeOfNumberBigintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigintMin(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberBigintMin(), "TYPE_OF_NUMBER_BIGINT_MIN"); }
    protected abstract ConditionValue getCValueTypeOfNumberBigintMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMax_Equal(Long typeOfNumberBigintMax) {
        doSetTypeOfNumberBigintMax_Equal(typeOfNumberBigintMax);
    }

    protected void doSetTypeOfNumberBigintMax_Equal(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_EQ, typeOfNumberBigintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMax_GreaterThan(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_GT, typeOfNumberBigintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMax_LessThan(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_LT, typeOfNumberBigintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMax_GreaterEqual(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_GE, typeOfNumberBigintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMax The value of typeOfNumberBigintMax as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberBigintMax_LessEqual(Long typeOfNumberBigintMax) {
        regTypeOfNumberBigintMax(CK_LE, typeOfNumberBigintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param minNumber The min number of typeOfNumberBigintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberBigintMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberBigintMax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMaxList The collection of typeOfNumberBigintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMax_InScope(Collection<Long> typeOfNumberBigintMaxList) {
        doSetTypeOfNumberBigintMax_InScope(typeOfNumberBigintMaxList);
    }

    protected void doSetTypeOfNumberBigintMax_InScope(Collection<Long> typeOfNumberBigintMaxList) {
        regINS(CK_INS, cTL(typeOfNumberBigintMaxList), getCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @param typeOfNumberBigintMaxList The collection of typeOfNumberBigintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberBigintMax_NotInScope(Collection<Long> typeOfNumberBigintMaxList) {
        doSetTypeOfNumberBigintMax_NotInScope(typeOfNumberBigintMaxList);
    }

    protected void doSetTypeOfNumberBigintMax_NotInScope(Collection<Long> typeOfNumberBigintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberBigintMaxList), getCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     */
    public void setTypeOfNumberBigintMax_IsNull() { regTypeOfNumberBigintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     */
    public void setTypeOfNumberBigintMax_IsNotNull() { regTypeOfNumberBigintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberBigintMax(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberBigintMax(), "TYPE_OF_NUMBER_BIGINT_MAX"); }
    protected abstract ConditionValue getCValueTypeOfNumberBigintMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMin_Equal(java.math.BigDecimal typeOfNumberSuperintMin) {
        doSetTypeOfNumberSuperintMin_Equal(typeOfNumberSuperintMin);
    }

    protected void doSetTypeOfNumberSuperintMin_Equal(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_EQ, typeOfNumberSuperintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMin_GreaterThan(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_GT, typeOfNumberSuperintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMin_LessThan(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_LT, typeOfNumberSuperintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMin_GreaterEqual(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_GE, typeOfNumberSuperintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMin The value of typeOfNumberSuperintMin as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMin_LessEqual(java.math.BigDecimal typeOfNumberSuperintMin) {
        regTypeOfNumberSuperintMin(CK_LE, typeOfNumberSuperintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param minNumber The min number of typeOfNumberSuperintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMin. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMin_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMinList The collection of typeOfNumberSuperintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        doSetTypeOfNumberSuperintMin_InScope(typeOfNumberSuperintMinList);
    }

    protected void doSetTypeOfNumberSuperintMin_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        regINS(CK_INS, cTL(typeOfNumberSuperintMinList), getCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @param typeOfNumberSuperintMinList The collection of typeOfNumberSuperintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        doSetTypeOfNumberSuperintMin_NotInScope(typeOfNumberSuperintMinList);
    }

    protected void doSetTypeOfNumberSuperintMin_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMinList) {
        regINS(CK_NINS, cTL(typeOfNumberSuperintMinList), getCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     */
    public void setTypeOfNumberSuperintMin_IsNull() { regTypeOfNumberSuperintMin(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     */
    public void setTypeOfNumberSuperintMin_IsNotNull() { regTypeOfNumberSuperintMin(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberSuperintMin(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberSuperintMin(), "TYPE_OF_NUMBER_SUPERINT_MIN"); }
    protected abstract ConditionValue getCValueTypeOfNumberSuperintMin();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMax_Equal(java.math.BigDecimal typeOfNumberSuperintMax) {
        doSetTypeOfNumberSuperintMax_Equal(typeOfNumberSuperintMax);
    }

    protected void doSetTypeOfNumberSuperintMax_Equal(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_EQ, typeOfNumberSuperintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMax_GreaterThan(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_GT, typeOfNumberSuperintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMax_LessThan(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_LT, typeOfNumberSuperintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMax_GreaterEqual(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_GE, typeOfNumberSuperintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMax The value of typeOfNumberSuperintMax as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberSuperintMax_LessEqual(java.math.BigDecimal typeOfNumberSuperintMax) {
        regTypeOfNumberSuperintMax(CK_LE, typeOfNumberSuperintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param minNumber The min number of typeOfNumberSuperintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberSuperintMax. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberSuperintMax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMaxList The collection of typeOfNumberSuperintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        doSetTypeOfNumberSuperintMax_InScope(typeOfNumberSuperintMaxList);
    }

    protected void doSetTypeOfNumberSuperintMax_InScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        regINS(CK_INS, cTL(typeOfNumberSuperintMaxList), getCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @param typeOfNumberSuperintMaxList The collection of typeOfNumberSuperintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        doSetTypeOfNumberSuperintMax_NotInScope(typeOfNumberSuperintMaxList);
    }

    protected void doSetTypeOfNumberSuperintMax_NotInScope(Collection<java.math.BigDecimal> typeOfNumberSuperintMaxList) {
        regINS(CK_NINS, cTL(typeOfNumberSuperintMaxList), getCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     */
    public void setTypeOfNumberSuperintMax_IsNull() { regTypeOfNumberSuperintMax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     */
    public void setTypeOfNumberSuperintMax_IsNotNull() { regTypeOfNumberSuperintMax(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberSuperintMax(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberSuperintMax(), "TYPE_OF_NUMBER_SUPERINT_MAX"); }
    protected abstract ConditionValue getCValueTypeOfNumberSuperintMax();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberMaxdecimal_Equal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        doSetTypeOfNumberMaxdecimal_Equal(typeOfNumberMaxdecimal);
    }

    protected void doSetTypeOfNumberMaxdecimal_Equal(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_EQ, typeOfNumberMaxdecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberMaxdecimal_GreaterThan(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_GT, typeOfNumberMaxdecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberMaxdecimal_LessThan(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_LT, typeOfNumberMaxdecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberMaxdecimal_GreaterEqual(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_GE, typeOfNumberMaxdecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimal The value of typeOfNumberMaxdecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumberMaxdecimal_LessEqual(java.math.BigDecimal typeOfNumberMaxdecimal) {
        regTypeOfNumberMaxdecimal(CK_LE, typeOfNumberMaxdecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param minNumber The min number of typeOfNumberMaxdecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumberMaxdecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumberMaxdecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimalList The collection of typeOfNumberMaxdecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        doSetTypeOfNumberMaxdecimal_InScope(typeOfNumberMaxdecimalList);
    }

    protected void doSetTypeOfNumberMaxdecimal_InScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        regINS(CK_INS, cTL(typeOfNumberMaxdecimalList), getCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @param typeOfNumberMaxdecimalList The collection of typeOfNumberMaxdecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumberMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        doSetTypeOfNumberMaxdecimal_NotInScope(typeOfNumberMaxdecimalList);
    }

    protected void doSetTypeOfNumberMaxdecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumberMaxdecimalList) {
        regINS(CK_NINS, cTL(typeOfNumberMaxdecimalList), getCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     */
    public void setTypeOfNumberMaxdecimal_IsNull() { regTypeOfNumberMaxdecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     */
    public void setTypeOfNumberMaxdecimal_IsNotNull() { regTypeOfNumberMaxdecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumberMaxdecimal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumberMaxdecimal(), "TYPE_OF_NUMBER_MAXDECIMAL"); }
    protected abstract ConditionValue getCValueTypeOfNumberMaxdecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_Equal(java.math.BigDecimal typeOfInteger) {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected void doSetTypeOfInteger_Equal(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_GreaterThan(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_LessThan(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_GreaterEqual(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInteger_LessEqual(java.math.BigDecimal typeOfInteger) {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInteger_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfInteger(), "TYPE_OF_INTEGER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_InScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        doSetTypeOfInteger_InScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_InScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        regINS(CK_INS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInteger_NotInScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        doSetTypeOfInteger_NotInScope(typeOfIntegerList);
    }

    protected void doSetTypeOfInteger_NotInScope(Collection<java.math.BigDecimal> typeOfIntegerList) {
        regINS(CK_NINS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     */
    public void setTypeOfInteger_IsNull() { regTypeOfInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     */
    public void setTypeOfInteger_IsNotNull() { regTypeOfInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected abstract ConditionValue getCValueTypeOfInteger();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_Equal(String typeOfBinaryFloat) {
        doSetTypeOfBinaryFloat_Equal(fRES(typeOfBinaryFloat));
    }

    protected void doSetTypeOfBinaryFloat_Equal(String typeOfBinaryFloat) {
        regTypeOfBinaryFloat(CK_EQ, typeOfBinaryFloat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_NotEqual(String typeOfBinaryFloat) {
        doSetTypeOfBinaryFloat_NotEqual(fRES(typeOfBinaryFloat));
    }

    protected void doSetTypeOfBinaryFloat_NotEqual(String typeOfBinaryFloat) {
        regTypeOfBinaryFloat(CK_NES, typeOfBinaryFloat);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloatList The collection of typeOfBinaryFloat as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_InScope(Collection<String> typeOfBinaryFloatList) {
        doSetTypeOfBinaryFloat_InScope(typeOfBinaryFloatList);
    }

    public void doSetTypeOfBinaryFloat_InScope(Collection<String> typeOfBinaryFloatList) {
        regINS(CK_INS, cTL(typeOfBinaryFloatList), getCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloatList The collection of typeOfBinaryFloat as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_NotInScope(Collection<String> typeOfBinaryFloatList) {
        doSetTypeOfBinaryFloat_NotInScope(typeOfBinaryFloatList);
    }

    public void doSetTypeOfBinaryFloat_NotInScope(Collection<String> typeOfBinaryFloatList) {
        regINS(CK_NINS, cTL(typeOfBinaryFloatList), getCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryFloat_PrefixSearch(String typeOfBinaryFloat) {
        setTypeOfBinaryFloat_LikeSearch(typeOfBinaryFloat, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)} <br />
     * <pre>e.g. setTypeOfBinaryFloat_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_LikeSearch(String typeOfBinaryFloat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBinaryFloat), getCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @param typeOfBinaryFloat The value of typeOfBinaryFloat as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBinaryFloat_NotLikeSearch(String typeOfBinaryFloat, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBinaryFloat), getCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNull() { regTypeOfBinaryFloat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNullOrEmpty() { regTypeOfBinaryFloat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     */
    public void setTypeOfBinaryFloat_IsNotNull() { regTypeOfBinaryFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfBinaryFloat(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBinaryFloat(), "TYPE_OF_BINARY_FLOAT"); }
    protected abstract ConditionValue getCValueTypeOfBinaryFloat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_Equal(String typeOfBinaryDouble) {
        doSetTypeOfBinaryDouble_Equal(fRES(typeOfBinaryDouble));
    }

    protected void doSetTypeOfBinaryDouble_Equal(String typeOfBinaryDouble) {
        regTypeOfBinaryDouble(CK_EQ, typeOfBinaryDouble);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_NotEqual(String typeOfBinaryDouble) {
        doSetTypeOfBinaryDouble_NotEqual(fRES(typeOfBinaryDouble));
    }

    protected void doSetTypeOfBinaryDouble_NotEqual(String typeOfBinaryDouble) {
        regTypeOfBinaryDouble(CK_NES, typeOfBinaryDouble);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDoubleList The collection of typeOfBinaryDouble as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_InScope(Collection<String> typeOfBinaryDoubleList) {
        doSetTypeOfBinaryDouble_InScope(typeOfBinaryDoubleList);
    }

    public void doSetTypeOfBinaryDouble_InScope(Collection<String> typeOfBinaryDoubleList) {
        regINS(CK_INS, cTL(typeOfBinaryDoubleList), getCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDoubleList The collection of typeOfBinaryDouble as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_NotInScope(Collection<String> typeOfBinaryDoubleList) {
        doSetTypeOfBinaryDouble_NotInScope(typeOfBinaryDoubleList);
    }

    public void doSetTypeOfBinaryDouble_NotInScope(Collection<String> typeOfBinaryDoubleList) {
        regINS(CK_NINS, cTL(typeOfBinaryDoubleList), getCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBinaryDouble_PrefixSearch(String typeOfBinaryDouble) {
        setTypeOfBinaryDouble_LikeSearch(typeOfBinaryDouble, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)} <br />
     * <pre>e.g. setTypeOfBinaryDouble_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_LikeSearch(String typeOfBinaryDouble, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBinaryDouble), getCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @param typeOfBinaryDouble The value of typeOfBinaryDouble as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBinaryDouble_NotLikeSearch(String typeOfBinaryDouble, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBinaryDouble), getCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNull() { regTypeOfBinaryDouble(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNullOrEmpty() { regTypeOfBinaryDouble(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     */
    public void setTypeOfBinaryDouble_IsNotNull() { regTypeOfBinaryDouble(CK_ISNN, DOBJ); }

    protected void regTypeOfBinaryDouble(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBinaryDouble(), "TYPE_OF_BINARY_DOUBLE"); }
    protected abstract ConditionValue getCValueTypeOfBinaryDouble();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_Equal(java.util.Date typeOfDate) {
        regTypeOfDate(CK_EQ,  fCTPD(typeOfDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GT,  fCTPD(typeOfDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LT,  fCTPD(typeOfDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GE,  fCTPD(typeOfDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LE, fCTPD(typeOfDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueTypeOfDate(), "TYPE_OF_DATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfDate_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(7)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected abstract ConditionValue getCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_Equal(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected abstract ConditionValue getCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_Equal(String typeOfIntervalYearToMonth) {
        doSetTypeOfIntervalYearToMonth_Equal(fRES(typeOfIntervalYearToMonth));
    }

    protected void doSetTypeOfIntervalYearToMonth_Equal(String typeOfIntervalYearToMonth) {
        regTypeOfIntervalYearToMonth(CK_EQ, typeOfIntervalYearToMonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_NotEqual(String typeOfIntervalYearToMonth) {
        doSetTypeOfIntervalYearToMonth_NotEqual(fRES(typeOfIntervalYearToMonth));
    }

    protected void doSetTypeOfIntervalYearToMonth_NotEqual(String typeOfIntervalYearToMonth) {
        regTypeOfIntervalYearToMonth(CK_NES, typeOfIntervalYearToMonth);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonthList The collection of typeOfIntervalYearToMonth as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_InScope(Collection<String> typeOfIntervalYearToMonthList) {
        doSetTypeOfIntervalYearToMonth_InScope(typeOfIntervalYearToMonthList);
    }

    public void doSetTypeOfIntervalYearToMonth_InScope(Collection<String> typeOfIntervalYearToMonthList) {
        regINS(CK_INS, cTL(typeOfIntervalYearToMonthList), getCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonthList The collection of typeOfIntervalYearToMonth as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_NotInScope(Collection<String> typeOfIntervalYearToMonthList) {
        doSetTypeOfIntervalYearToMonth_NotInScope(typeOfIntervalYearToMonthList);
    }

    public void doSetTypeOfIntervalYearToMonth_NotInScope(Collection<String> typeOfIntervalYearToMonthList) {
        regINS(CK_NINS, cTL(typeOfIntervalYearToMonthList), getCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalYearToMonth_PrefixSearch(String typeOfIntervalYearToMonth) {
        setTypeOfIntervalYearToMonth_LikeSearch(typeOfIntervalYearToMonth, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)} <br />
     * <pre>e.g. setTypeOfIntervalYearToMonth_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_LikeSearch(String typeOfIntervalYearToMonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfIntervalYearToMonth), getCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @param typeOfIntervalYearToMonth The value of typeOfIntervalYearToMonth as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfIntervalYearToMonth_NotLikeSearch(String typeOfIntervalYearToMonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfIntervalYearToMonth), getCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNull() { regTypeOfIntervalYearToMonth(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNullOrEmpty() { regTypeOfIntervalYearToMonth(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     */
    public void setTypeOfIntervalYearToMonth_IsNotNull() { regTypeOfIntervalYearToMonth(CK_ISNN, DOBJ); }

    protected void regTypeOfIntervalYearToMonth(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfIntervalYearToMonth(), "TYPE_OF_INTERVAL_YEAR_TO_MONTH"); }
    protected abstract ConditionValue getCValueTypeOfIntervalYearToMonth();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_Equal(String typeOfIntervalDayToSecond) {
        doSetTypeOfIntervalDayToSecond_Equal(fRES(typeOfIntervalDayToSecond));
    }

    protected void doSetTypeOfIntervalDayToSecond_Equal(String typeOfIntervalDayToSecond) {
        regTypeOfIntervalDayToSecond(CK_EQ, typeOfIntervalDayToSecond);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_NotEqual(String typeOfIntervalDayToSecond) {
        doSetTypeOfIntervalDayToSecond_NotEqual(fRES(typeOfIntervalDayToSecond));
    }

    protected void doSetTypeOfIntervalDayToSecond_NotEqual(String typeOfIntervalDayToSecond) {
        regTypeOfIntervalDayToSecond(CK_NES, typeOfIntervalDayToSecond);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecondList The collection of typeOfIntervalDayToSecond as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_InScope(Collection<String> typeOfIntervalDayToSecondList) {
        doSetTypeOfIntervalDayToSecond_InScope(typeOfIntervalDayToSecondList);
    }

    public void doSetTypeOfIntervalDayToSecond_InScope(Collection<String> typeOfIntervalDayToSecondList) {
        regINS(CK_INS, cTL(typeOfIntervalDayToSecondList), getCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecondList The collection of typeOfIntervalDayToSecond as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_NotInScope(Collection<String> typeOfIntervalDayToSecondList) {
        doSetTypeOfIntervalDayToSecond_NotInScope(typeOfIntervalDayToSecondList);
    }

    public void doSetTypeOfIntervalDayToSecond_NotInScope(Collection<String> typeOfIntervalDayToSecondList) {
        regINS(CK_NINS, cTL(typeOfIntervalDayToSecondList), getCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfIntervalDayToSecond_PrefixSearch(String typeOfIntervalDayToSecond) {
        setTypeOfIntervalDayToSecond_LikeSearch(typeOfIntervalDayToSecond, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)} <br />
     * <pre>e.g. setTypeOfIntervalDayToSecond_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_LikeSearch(String typeOfIntervalDayToSecond, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfIntervalDayToSecond), getCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @param typeOfIntervalDayToSecond The value of typeOfIntervalDayToSecond as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfIntervalDayToSecond_NotLikeSearch(String typeOfIntervalDayToSecond, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfIntervalDayToSecond), getCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNull() { regTypeOfIntervalDayToSecond(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNullOrEmpty() { regTypeOfIntervalDayToSecond(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     */
    public void setTypeOfIntervalDayToSecond_IsNotNull() { regTypeOfIntervalDayToSecond(CK_ISNN, DOBJ); }

    protected void regTypeOfIntervalDayToSecond(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfIntervalDayToSecond(), "TYPE_OF_INTERVAL_DAY_TO_SECOND"); }
    protected abstract ConditionValue getCValueTypeOfIntervalDayToSecond();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BLOB: {BLOB(4000)}
     */
    public void setTypeOfBlob_IsNull() { regTypeOfBlob(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BLOB: {BLOB(4000)}
     */
    public void setTypeOfBlob_IsNotNull() { regTypeOfBlob(CK_ISNN, DOBJ); }

    protected void regTypeOfBlob(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    protected abstract ConditionValue getCValueTypeOfBlob();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_RAW: {RAW(512)}
     */
    public void setTypeOfRaw_IsNull() { regTypeOfRaw(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_RAW: {RAW(512)}
     */
    public void setTypeOfRaw_IsNotNull() { regTypeOfRaw(CK_ISNN, DOBJ); }

    protected void regTypeOfRaw(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfRaw(), "TYPE_OF_RAW"); }
    protected abstract ConditionValue getCValueTypeOfRaw();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_Equal(String typeOfBfile) {
        doSetTypeOfBfile_Equal(fRES(typeOfBfile));
    }

    protected void doSetTypeOfBfile_Equal(String typeOfBfile) {
        regTypeOfBfile(CK_EQ, typeOfBfile);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_NotEqual(String typeOfBfile) {
        doSetTypeOfBfile_NotEqual(fRES(typeOfBfile));
    }

    protected void doSetTypeOfBfile_NotEqual(String typeOfBfile) {
        regTypeOfBfile(CK_NES, typeOfBfile);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfileList The collection of typeOfBfile as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_InScope(Collection<String> typeOfBfileList) {
        doSetTypeOfBfile_InScope(typeOfBfileList);
    }

    public void doSetTypeOfBfile_InScope(Collection<String> typeOfBfileList) {
        regINS(CK_INS, cTL(typeOfBfileList), getCValueTypeOfBfile(), "TYPE_OF_BFILE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfileList The collection of typeOfBfile as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_NotInScope(Collection<String> typeOfBfileList) {
        doSetTypeOfBfile_NotInScope(typeOfBfileList);
    }

    public void doSetTypeOfBfile_NotInScope(Collection<String> typeOfBfileList) {
        regINS(CK_NINS, cTL(typeOfBfileList), getCValueTypeOfBfile(), "TYPE_OF_BFILE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBfile_PrefixSearch(String typeOfBfile) {
        setTypeOfBfile_LikeSearch(typeOfBfile, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)} <br />
     * <pre>e.g. setTypeOfBfile_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfBfile The value of typeOfBfile as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfBfile_LikeSearch(String typeOfBfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfBfile), getCValueTypeOfBfile(), "TYPE_OF_BFILE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @param typeOfBfile The value of typeOfBfile as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfBfile_NotLikeSearch(String typeOfBfile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfBfile), getCValueTypeOfBfile(), "TYPE_OF_BFILE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNull() { regTypeOfBfile(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNullOrEmpty() { regTypeOfBfile(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     */
    public void setTypeOfBfile_IsNotNull() { regTypeOfBfile(CK_ISNN, DOBJ); }

    protected void regTypeOfBfile(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBfile(), "TYPE_OF_BFILE"); }
    protected abstract ConditionValue getCValueTypeOfBfile();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_Equal(String typeOfRowid) {
        doSetTypeOfRowid_Equal(fRES(typeOfRowid));
    }

    protected void doSetTypeOfRowid_Equal(String typeOfRowid) {
        regTypeOfRowid(CK_EQ, typeOfRowid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_NotEqual(String typeOfRowid) {
        doSetTypeOfRowid_NotEqual(fRES(typeOfRowid));
    }

    protected void doSetTypeOfRowid_NotEqual(String typeOfRowid) {
        regTypeOfRowid(CK_NES, typeOfRowid);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowidList The collection of typeOfRowid as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_InScope(Collection<String> typeOfRowidList) {
        doSetTypeOfRowid_InScope(typeOfRowidList);
    }

    public void doSetTypeOfRowid_InScope(Collection<String> typeOfRowidList) {
        regINS(CK_INS, cTL(typeOfRowidList), getCValueTypeOfRowid(), "TYPE_OF_ROWID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowidList The collection of typeOfRowid as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_NotInScope(Collection<String> typeOfRowidList) {
        doSetTypeOfRowid_NotInScope(typeOfRowidList);
    }

    public void doSetTypeOfRowid_NotInScope(Collection<String> typeOfRowidList) {
        regINS(CK_NINS, cTL(typeOfRowidList), getCValueTypeOfRowid(), "TYPE_OF_ROWID");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfRowid_PrefixSearch(String typeOfRowid) {
        setTypeOfRowid_LikeSearch(typeOfRowid, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)} <br />
     * <pre>e.g. setTypeOfRowid_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfRowid The value of typeOfRowid as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfRowid_LikeSearch(String typeOfRowid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfRowid), getCValueTypeOfRowid(), "TYPE_OF_ROWID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @param typeOfRowid The value of typeOfRowid as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfRowid_NotLikeSearch(String typeOfRowid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfRowid), getCValueTypeOfRowid(), "TYPE_OF_ROWID", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNull() { regTypeOfRowid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNullOrEmpty() { regTypeOfRowid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     */
    public void setTypeOfRowid_IsNotNull() { regTypeOfRowid(CK_ISNN, DOBJ); }

    protected void regTypeOfRowid(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfRowid(), "TYPE_OF_ROWID"); }
    protected abstract ConditionValue getCValueTypeOfRowid();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorCheckCB> xcreateSSQFunction(final String rd) {
        return new HpSSQFunction<VendorCheckCB>(new HpSSQSetupper<VendorCheckCB>() {
            public void setup(String fn, SubQuery<VendorCheckCB> sq, HpSSQOption<VendorCheckCB> op) {
                xscalarCondition(fn, sq, rd, op);
            }
        });
    }

    protected void xscalarCondition(String fn, SubQuery<VendorCheckCB> sq, String rd, HpSSQOption<VendorCheckCB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query(cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "VENDOR_CHECK_ID";
        String pp = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorCheckCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorCheckCB>(new HpQDRSetupper<VendorCheckCB>() {
            public void setup(String fn, SubQuery<VendorCheckCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMyselfDerived(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMyselfDerived(String fn, SubQuery<VendorCheckCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb);
        String pk = "VENDOR_CHECK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String pp = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String pp = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(VendorCheckCQ sq);

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
    protected String xabCB() { return VendorCheckCB.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
