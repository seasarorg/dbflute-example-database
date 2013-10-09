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

    protected void regVendorCheckId(ConditionKey k, Object v) { regQ(k, v, getCValueVendorCheckId(), "vendor_check_id"); }
    abstract protected ConditionValue getCValueVendorCheckId();

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
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regTypeOfChar(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfChar(), "type_of_char"); }
    abstract protected ConditionValue getCValueTypeOfChar();

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
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regTypeOfVarchar(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfVarchar(), "type_of_varchar"); }
    abstract protected ConditionValue getCValueTypeOfVarchar();

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

    protected void regTypeOfVcArray(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfVcArray(), "type_of_vc_array"); }
    abstract protected ConditionValue getCValueTypeOfVcArray();

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
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regTypeOfText(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfText(), "type_of_text"); }
    abstract protected ConditionValue getCValueTypeOfText();
    
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

    protected void regTypeOfNumericInteger(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericInteger(), "type_of_numeric_integer"); }
    abstract protected ConditionValue getCValueTypeOfNumericInteger();
    
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

    protected void regTypeOfNumericBigint(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericBigint(), "type_of_numeric_bigint"); }
    abstract protected ConditionValue getCValueTypeOfNumericBigint();
    
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

    protected void regTypeOfNumericDecimal(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfNumericDecimal(), "type_of_numeric_decimal"); }
    abstract protected ConditionValue getCValueTypeOfNumericDecimal();
    
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

    protected void regTypeOfDecimal(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfDecimal(), "type_of_decimal"); }
    abstract protected ConditionValue getCValueTypeOfDecimal();
    
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

    protected void regTypeOfInt8(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfInt8(), "type_of_int8"); }
    abstract protected ConditionValue getCValueTypeOfInt8();

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

    protected void regTypeOfIntArray(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfIntArray(), "type_of_int_array"); }
    abstract protected ConditionValue getCValueTypeOfIntArray();
    
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

    protected void regTypeOfInt4(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfInt4(), "type_of_int4"); }
    abstract protected ConditionValue getCValueTypeOfInt4();
    
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

    protected void regTypeOfBigint(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBigint(), "type_of_bigint"); }
    abstract protected ConditionValue getCValueTypeOfBigint();
    
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

    protected void regTypeOfMoney(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfMoney(), "type_of_money"); }
    abstract protected ConditionValue getCValueTypeOfMoney();

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
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueTypeOfDate(), "type_of_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
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

    protected void regTypeOfDate(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfDate(), "type_of_date"); }
    abstract protected ConditionValue getCValueTypeOfDate();

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
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #FD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueTypeOfTimestamp(), "type_of_timestamp", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    public void setTypeOfTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
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

    protected void regTypeOfTimestamp(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfTimestamp(), "type_of_timestamp"); }
    abstract protected ConditionValue getCValueTypeOfTimestamp();

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

    protected void regTypeOfTime(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfTime(), "type_of_time"); }
    abstract protected ConditionValue getCValueTypeOfTime();

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

    protected void regTypeOfTimetz(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfTimetz(), "type_of_timetz"); }
    abstract protected ConditionValue getCValueTypeOfTimetz();

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
     * <pre>e.g. setTypeOfInterval_LikeSearch("xxx", new <span style="color: #FD4747">LikeSearchOption</span>().likeContain());</pre>
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

    protected void regTypeOfInterval(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfInterval(), "type_of_interval"); }
    abstract protected ConditionValue getCValueTypeOfInterval();

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

    protected void regTypeOfBool(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBool(), "type_of_bool"); }
    abstract protected ConditionValue getCValueTypeOfBool();

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

    protected void regTypeOfBit(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBit(), "type_of_bit"); }
    abstract protected ConditionValue getCValueTypeOfBit();

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

    protected void regTypeOfBytea(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBytea(), "type_of_bytea"); }
    abstract protected ConditionValue getCValueTypeOfBytea();

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

    protected void regTypeOfOid(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfOid(), "type_of_oid"); }
    abstract protected ConditionValue getCValueTypeOfOid();

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

    protected void regTypeOfUuid(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfUuid(), "type_of_uuid"); }
    abstract protected ConditionValue getCValueTypeOfUuid();

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

    protected void regTypeOfXml(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfXml(), "type_of_xml"); }
    abstract protected ConditionValue getCValueTypeOfXml();

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

    protected HpSSQFunction<VendorCheckCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorCheckCB>(new HpSSQSetupper<VendorCheckCB>() {
            public void setup(String function, SubQuery<VendorCheckCB> subQuery, HpSSQOption<VendorCheckCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorCheckCB> subQuery, String operand, HpSSQOption<VendorCheckCB> option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorCheckCQ subQuery);

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
    public void xsmyselfDerive(String function, SubQuery<VendorCheckCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "vendor_check_id", "vendor_check_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorCheckCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorCheckCB>(new HpQDRSetupper<VendorCheckCB>() {
            public void setup(String function, SubQuery<VendorCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "vendor_check_id", "vendor_check_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorCheckCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorCheckCQ subQuery);

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
    public void match(java.util.List<org.seasar.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
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
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorCheckCB.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
