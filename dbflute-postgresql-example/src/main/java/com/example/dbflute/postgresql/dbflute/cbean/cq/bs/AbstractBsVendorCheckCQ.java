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
 * The abstract condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
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
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "vendor_check_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "vendor_check_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "vendor_check_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueVendorCheckId(), "vendor_check_id"); }
    protected abstract ConditionValue getCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    public void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), getCValueTypeOfChar(), "type_of_char");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    public void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), getCValueTypeOfChar(), "type_of_char");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_char: {bpchar(3)} <br />
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), getCValueTypeOfChar(), "type_of_char", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), getCValueTypeOfChar(), "type_of_char", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfChar(), "type_of_char"); }
    protected abstract ConditionValue getCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "type_of_varchar");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    public void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "type_of_varchar");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_varchar: {varchar(2147483647)} <br />
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "type_of_varchar", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "type_of_varchar", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfVarchar(), "type_of_varchar"); }
    protected abstract ConditionValue getCValueTypeOfVarchar();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_vc_array: {_varchar(2147483647)}
     */
    public void setTypeOfVcArray_IsNull() { regTypeOfVcArray(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_vc_array: {_varchar(2147483647)}
     */
    public void setTypeOfVcArray_IsNotNull() { regTypeOfVcArray(CK_ISNN, DOBJ); }

    protected void regTypeOfVcArray(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfVcArray(), "type_of_vc_array"); }
    protected abstract ConditionValue getCValueTypeOfVcArray();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    public void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), getCValueTypeOfText(), "type_of_text");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    public void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), getCValueTypeOfText(), "type_of_text");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfText_PrefixSearch(String typeOfText) {
        setTypeOfText_LikeSearch(typeOfText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_text: {text(2147483647)} <br />
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), getCValueTypeOfText(), "type_of_text", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), getCValueTypeOfText(), "type_of_text", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfText(), "type_of_text"); }
    protected abstract ConditionValue getCValueTypeOfText();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericInteger_GreaterThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericInteger_LessThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericInteger_GreaterEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericInteger_LessEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param minNumber The min number of typeOfNumericInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericInteger(), "type_of_numeric_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "type_of_numeric_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "type_of_numeric_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNull() { regTypeOfNumericInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_integer: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNotNull() { regTypeOfNumericInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericInteger(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumericInteger(), "type_of_numeric_integer"); }
    protected abstract ConditionValue getCValueTypeOfNumericInteger();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericBigint_GreaterThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericBigint_LessThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericBigint_GreaterEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericBigint_LessEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param minNumber The min number of typeOfNumericBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigint(), "type_of_numeric_bigint", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_INS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "type_of_numeric_bigint");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "type_of_numeric_bigint");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNull() { regTypeOfNumericBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_bigint: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNotNull() { regTypeOfNumericBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumericBigint(), "type_of_numeric_bigint"); }
    protected abstract ConditionValue getCValueTypeOfNumericBigint();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericDecimal_GreaterThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericDecimal_LessThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericDecimal_GreaterEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfNumericDecimal_LessEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericDecimal(), "type_of_numeric_decimal", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "type_of_numeric_decimal");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "type_of_numeric_decimal");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNull() { regTypeOfNumericDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNotNull() { regTypeOfNumericDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfNumericDecimal(), "type_of_numeric_decimal"); }
    protected abstract ConditionValue getCValueTypeOfNumericDecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimal_Equal(java.math.BigDecimal typeOfDecimal) {
        doSetTypeOfDecimal_Equal(typeOfDecimal);
    }

    protected void doSetTypeOfDecimal_Equal(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_EQ, typeOfDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimal_GreaterThan(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_GT, typeOfDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimal_LessThan(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_LT, typeOfDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimal_GreaterEqual(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_GE, typeOfDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDecimal_LessEqual(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_LE, typeOfDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param minNumber The min number of typeOfDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfDecimal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfDecimal(), "type_of_decimal", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimalList The collection of typeOfDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        doSetTypeOfDecimal_InScope(typeOfDecimalList);
    }

    protected void doSetTypeOfDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        regINS(CK_INS, cTL(typeOfDecimalList), getCValueTypeOfDecimal(), "type_of_decimal");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimalList The collection of typeOfDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        doSetTypeOfDecimal_NotInScope(typeOfDecimalList);
    }

    protected void doSetTypeOfDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        regINS(CK_NINS, cTL(typeOfDecimalList), getCValueTypeOfDecimal(), "type_of_decimal");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     */
    public void setTypeOfDecimal_IsNull() { regTypeOfDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_decimal: {numeric(131089)}
     */
    public void setTypeOfDecimal_IsNotNull() { regTypeOfDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDecimal(), "type_of_decimal"); }
    protected abstract ConditionValue getCValueTypeOfDecimal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt8_Equal(Long typeOfInt8) {
        doSetTypeOfInt8_Equal(typeOfInt8);
    }

    protected void doSetTypeOfInt8_Equal(Long typeOfInt8) {
        regTypeOfInt8(CK_EQ, typeOfInt8);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt8_GreaterThan(Long typeOfInt8) {
        regTypeOfInt8(CK_GT, typeOfInt8);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt8_LessThan(Long typeOfInt8) {
        regTypeOfInt8(CK_LT, typeOfInt8);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt8_GreaterEqual(Long typeOfInt8) {
        regTypeOfInt8(CK_GE, typeOfInt8);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt8_LessEqual(Long typeOfInt8) {
        regTypeOfInt8(CK_LE, typeOfInt8);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param minNumber The min number of typeOfInt8. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInt8. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInt8_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfInt8(), "type_of_int8", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8List The collection of typeOfInt8 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInt8_InScope(Collection<Long> typeOfInt8List) {
        doSetTypeOfInt8_InScope(typeOfInt8List);
    }

    protected void doSetTypeOfInt8_InScope(Collection<Long> typeOfInt8List) {
        regINS(CK_INS, cTL(typeOfInt8List), getCValueTypeOfInt8(), "type_of_int8");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_int8: {int8(19)}
     * @param typeOfInt8List The collection of typeOfInt8 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInt8_NotInScope(Collection<Long> typeOfInt8List) {
        doSetTypeOfInt8_NotInScope(typeOfInt8List);
    }

    protected void doSetTypeOfInt8_NotInScope(Collection<Long> typeOfInt8List) {
        regINS(CK_NINS, cTL(typeOfInt8List), getCValueTypeOfInt8(), "type_of_int8");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     */
    public void setTypeOfInt8_IsNull() { regTypeOfInt8(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_int8: {int8(19)}
     */
    public void setTypeOfInt8_IsNotNull() { regTypeOfInt8(CK_ISNN, DOBJ); }

    protected void regTypeOfInt8(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfInt8(), "type_of_int8"); }
    protected abstract ConditionValue getCValueTypeOfInt8();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_int_array: {_int8(19)}
     */
    public void setTypeOfIntArray_IsNull() { regTypeOfIntArray(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_int_array: {_int8(19)}
     */
    public void setTypeOfIntArray_IsNotNull() { regTypeOfIntArray(CK_ISNN, DOBJ); }

    protected void regTypeOfIntArray(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfIntArray(), "type_of_int_array"); }
    protected abstract ConditionValue getCValueTypeOfIntArray();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt4_Equal(Integer typeOfInt4) {
        doSetTypeOfInt4_Equal(typeOfInt4);
    }

    protected void doSetTypeOfInt4_Equal(Integer typeOfInt4) {
        regTypeOfInt4(CK_EQ, typeOfInt4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt4_GreaterThan(Integer typeOfInt4) {
        regTypeOfInt4(CK_GT, typeOfInt4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt4_LessThan(Integer typeOfInt4) {
        regTypeOfInt4(CK_LT, typeOfInt4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt4_GreaterEqual(Integer typeOfInt4) {
        regTypeOfInt4(CK_GE, typeOfInt4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfInt4_LessEqual(Integer typeOfInt4) {
        regTypeOfInt4(CK_LE, typeOfInt4);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param minNumber The min number of typeOfInt4. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInt4. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfInt4_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfInt4(), "type_of_int4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4List The collection of typeOfInt4 as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInt4_InScope(Collection<Integer> typeOfInt4List) {
        doSetTypeOfInt4_InScope(typeOfInt4List);
    }

    protected void doSetTypeOfInt4_InScope(Collection<Integer> typeOfInt4List) {
        regINS(CK_INS, cTL(typeOfInt4List), getCValueTypeOfInt4(), "type_of_int4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_int4: {int4(10)}
     * @param typeOfInt4List The collection of typeOfInt4 as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInt4_NotInScope(Collection<Integer> typeOfInt4List) {
        doSetTypeOfInt4_NotInScope(typeOfInt4List);
    }

    protected void doSetTypeOfInt4_NotInScope(Collection<Integer> typeOfInt4List) {
        regINS(CK_NINS, cTL(typeOfInt4List), getCValueTypeOfInt4(), "type_of_int4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     */
    public void setTypeOfInt4_IsNull() { regTypeOfInt4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_int4: {int4(10)}
     */
    public void setTypeOfInt4_IsNotNull() { regTypeOfInt4(CK_ISNN, DOBJ); }

    protected void regTypeOfInt4(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfInt4(), "type_of_int4"); }
    protected abstract ConditionValue getCValueTypeOfInt4();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param minNumber The min number of typeOfBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfBigint(), "type_of_bigint", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "type_of_bigint");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_bigint: {int8(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "type_of_bigint");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_bigint: {int8(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBigint(), "type_of_bigint"); }
    protected abstract ConditionValue getCValueTypeOfBigint();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        doSetTypeOfReal_Equal(typeOfReal);
    }

    protected void doSetTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_EQ, typeOfReal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfReal_GreaterThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GT, typeOfReal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfReal_LessThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LT, typeOfReal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfReal_GreaterEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GE, typeOfReal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfReal_LessEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LE, typeOfReal);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param minNumber The min number of typeOfReal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfReal. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfReal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfReal(), "type_of_real", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfRealList The collection of typeOfReal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_InScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_INS, cTL(typeOfRealList), getCValueTypeOfReal(), "type_of_real");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_real: {float4(8, 8)}
     * @param typeOfRealList The collection of typeOfReal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_NotInScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_NINS, cTL(typeOfRealList), getCValueTypeOfReal(), "type_of_real");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     */
    public void setTypeOfReal_IsNull() { regTypeOfReal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_real: {float4(8, 8)}
     */
    public void setTypeOfReal_IsNotNull() { regTypeOfReal(CK_ISNN, DOBJ); }

    protected void regTypeOfReal(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfReal(), "type_of_real"); }
    protected abstract ConditionValue getCValueTypeOfReal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        doSetTypeOfFloat_Equal(typeOfFloat);
    }

    protected void doSetTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_EQ, typeOfFloat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfFloat_GreaterThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GT, typeOfFloat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfFloat_LessThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LT, typeOfFloat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfFloat_GreaterEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GE, typeOfFloat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfFloat_LessEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LE, typeOfFloat);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param minNumber The min number of typeOfFloat. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfFloat. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfFloat(), "type_of_float", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloatList The collection of typeOfFloat as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_InScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_INS, cTL(typeOfFloatList), getCValueTypeOfFloat(), "type_of_float");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloatList The collection of typeOfFloat as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_NotInScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_NINS, cTL(typeOfFloatList), getCValueTypeOfFloat(), "type_of_float");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     */
    public void setTypeOfFloat_IsNull() { regTypeOfFloat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_float: {float8(17, 17)}
     */
    public void setTypeOfFloat_IsNotNull() { regTypeOfFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfFloat(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfFloat(), "type_of_float"); }
    protected abstract ConditionValue getCValueTypeOfFloat();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        doSetTypeOfMoney_Equal(typeOfMoney);
    }

    protected void doSetTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_EQ, typeOfMoney);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfMoney_GreaterThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GT, typeOfMoney);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfMoney_LessThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LT, typeOfMoney);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfMoney_GreaterEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GE, typeOfMoney);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfMoney_LessEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LE, typeOfMoney);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param minNumber The min number of typeOfMoney. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfMoney. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeOfMoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTypeOfMoney(), "type_of_money", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoneyList The collection of typeOfMoney as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_InScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_INS, cTL(typeOfMoneyList), getCValueTypeOfMoney(), "type_of_money");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * type_of_money: {money(2147483647)}
     * @param typeOfMoneyList The collection of typeOfMoney as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_NotInScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_NINS, cTL(typeOfMoneyList), getCValueTypeOfMoney(), "type_of_money");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     */
    public void setTypeOfMoney_IsNull() { regTypeOfMoney(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_money: {money(2147483647)}
     */
    public void setTypeOfMoney_IsNotNull() { regTypeOfMoney(CK_ISNN, DOBJ); }

    protected void regTypeOfMoney(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfMoney(), "type_of_money"); }
    protected abstract ConditionValue getCValueTypeOfMoney();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_Equal(java.util.Date typeOfDate) {
        regTypeOfDate(CK_EQ,  fCTPD(typeOfDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GT,  fCTPD(typeOfDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessThan(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LT,  fCTPD(typeOfDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_GreaterEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_GE,  fCTPD(typeOfDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfDate_LessEqual(java.util.Date typeOfDate) {
        regTypeOfDate(CK_LE, fCTPD(typeOfDate));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueTypeOfDate(), "type_of_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfDate_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfDate(), "type_of_date"); }
    protected abstract ConditionValue getCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_Equal(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessThan(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimestamp_LessEqual(java.sql.Timestamp typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTypeOfTimestamp(), "type_of_timestamp", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfTimestamp_DateFromTo(Date fromDate, Date toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTimestamp(), "type_of_timestamp"); }
    protected abstract ConditionValue getCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_Equal(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_GreaterThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_LessThan(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_GreaterEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTime_LessEqual(java.sql.Time typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_time: {time(15, 6)}
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTime(), "type_of_time"); }
    protected abstract ConditionValue getCValueTypeOfTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimetz_Equal(java.sql.Time typeOfTimetz) {
        regTypeOfTimetz(CK_EQ,  typeOfTimetz);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimetz_GreaterThan(java.sql.Time typeOfTimetz) {
        regTypeOfTimetz(CK_GT,  typeOfTimetz);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimetz_LessThan(java.sql.Time typeOfTimetz) {
        regTypeOfTimetz(CK_LT,  typeOfTimetz);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimetz_GreaterEqual(java.sql.Time typeOfTimetz) {
        regTypeOfTimetz(CK_GE,  typeOfTimetz);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTypeOfTimetz_LessEqual(java.sql.Time typeOfTimetz) {
        regTypeOfTimetz(CK_LE, typeOfTimetz);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     */
    public void setTypeOfTimetz_IsNull() { regTypeOfTimetz(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_timetz: {timetz(21, 6)}
     */
    public void setTypeOfTimetz_IsNotNull() { regTypeOfTimetz(CK_ISNN, DOBJ); }

    protected void regTypeOfTimetz(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfTimetz(), "type_of_timetz"); }
    protected abstract ConditionValue getCValueTypeOfTimetz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInterval_Equal(String typeOfInterval) {
        doSetTypeOfInterval_Equal(fRES(typeOfInterval));
    }

    protected void doSetTypeOfInterval_Equal(String typeOfInterval) {
        regTypeOfInterval(CK_EQ, typeOfInterval);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInterval_NotEqual(String typeOfInterval) {
        doSetTypeOfInterval_NotEqual(fRES(typeOfInterval));
    }

    protected void doSetTypeOfInterval_NotEqual(String typeOfInterval) {
        regTypeOfInterval(CK_NES, typeOfInterval);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfIntervalList The collection of typeOfInterval as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInterval_InScope(Collection<String> typeOfIntervalList) {
        doSetTypeOfInterval_InScope(typeOfIntervalList);
    }

    public void doSetTypeOfInterval_InScope(Collection<String> typeOfIntervalList) {
        regINS(CK_INS, cTL(typeOfIntervalList), getCValueTypeOfInterval(), "type_of_interval");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfIntervalList The collection of typeOfInterval as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInterval_NotInScope(Collection<String> typeOfIntervalList) {
        doSetTypeOfInterval_NotInScope(typeOfIntervalList);
    }

    public void doSetTypeOfInterval_NotInScope(Collection<String> typeOfIntervalList) {
        regINS(CK_NINS, cTL(typeOfIntervalList), getCValueTypeOfInterval(), "type_of_interval");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfInterval_PrefixSearch(String typeOfInterval) {
        setTypeOfInterval_LikeSearch(typeOfInterval, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_interval: {interval(49, 6)} <br />
     * <pre>e.g. setTypeOfInterval_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfInterval The value of typeOfInterval as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfInterval_LikeSearch(String typeOfInterval, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfInterval), getCValueTypeOfInterval(), "type_of_interval", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfInterval_NotLikeSearch(String typeOfInterval, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfInterval), getCValueTypeOfInterval(), "type_of_interval", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNull() { regTypeOfInterval(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNullOrEmpty() { regTypeOfInterval(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNotNull() { regTypeOfInterval(CK_ISNN, DOBJ); }

    protected void regTypeOfInterval(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfInterval(), "type_of_interval"); }
    protected abstract ConditionValue getCValueTypeOfInterval();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @param typeOfBool The value of typeOfBool as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBool_Equal(Boolean typeOfBool) {
        regTypeOfBool(CK_EQ, typeOfBool);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    public void setTypeOfBool_Equal_True() {
        regTypeOfBool(CK_EQ, Boolean.valueOf(CDef.TrueFalse.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br />
     * No: means invalid
     */
    public void setTypeOfBool_Equal_False() {
        regTypeOfBool(CK_EQ, Boolean.valueOf(CDef.TrueFalse.False.code()));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_bool: {bool(1), classification=TrueFalse}
     */
    public void setTypeOfBool_IsNull() { regTypeOfBool(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_bool: {bool(1), classification=TrueFalse}
     */
    public void setTypeOfBool_IsNotNull() { regTypeOfBool(CK_ISNN, DOBJ); }

    protected void regTypeOfBool(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBool(), "type_of_bool"); }
    protected abstract ConditionValue getCValueTypeOfBool();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_bit: {bit(1)}
     * @param typeOfBit The value of typeOfBit as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfBit_Equal(Boolean typeOfBit) {
        regTypeOfBit(CK_EQ, typeOfBit);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_bit: {bit(1)}
     */
    public void setTypeOfBit_IsNull() { regTypeOfBit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_bit: {bit(1)}
     */
    public void setTypeOfBit_IsNotNull() { regTypeOfBit(CK_ISNN, DOBJ); }

    protected void regTypeOfBit(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBit(), "type_of_bit"); }
    protected abstract ConditionValue getCValueTypeOfBit();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_bytea: {bytea(2147483647)}
     */
    public void setTypeOfBytea_IsNull() { regTypeOfBytea(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_bytea: {bytea(2147483647)}
     */
    public void setTypeOfBytea_IsNotNull() { regTypeOfBytea(CK_ISNN, DOBJ); }

    protected void regTypeOfBytea(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfBytea(), "type_of_bytea"); }
    protected abstract ConditionValue getCValueTypeOfBytea();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_oid: {oid(10)}
     */
    public void setTypeOfOid_IsNull() { regTypeOfOid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_oid: {oid(10)}
     */
    public void setTypeOfOid_IsNotNull() { regTypeOfOid(CK_ISNN, DOBJ); }

    protected void regTypeOfOid(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfOid(), "type_of_oid"); }
    protected abstract ConditionValue getCValueTypeOfOid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_uuid: {uuid(2147483647)}
     * @param typeOfUuid The value of typeOfUuid as equal. (NullAllowed: if null, no condition)
     */
    public void setTypeOfUuid_Equal(java.util.UUID typeOfUuid) {
        regTypeOfUuid(CK_EQ, typeOfUuid);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type_of_uuid: {uuid(2147483647)}
     * @param typeOfUuidList The collection of typeOfUuid as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTypeOfUuid_InScope(Collection<java.util.UUID> typeOfUuidList) {
        regINS(CK_INS, cTL(typeOfUuidList), getCValueTypeOfUuid(), "type_of_uuid");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_uuid: {uuid(2147483647)}
     */
    public void setTypeOfUuid_IsNull() { regTypeOfUuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_uuid: {uuid(2147483647)}
     */
    public void setTypeOfUuid_IsNotNull() { regTypeOfUuid(CK_ISNN, DOBJ); }

    protected void regTypeOfUuid(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfUuid(), "type_of_uuid"); }
    protected abstract ConditionValue getCValueTypeOfUuid();

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type_of_xml: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNull() { regTypeOfXml(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type_of_xml: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNotNull() { regTypeOfXml(CK_ISNN, DOBJ); }

    protected void regTypeOfXml(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueTypeOfXml(), "type_of_xml"); }
    protected abstract ConditionValue getCValueTypeOfXml();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "vendor_check_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "vendor_check_id";
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
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
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
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
