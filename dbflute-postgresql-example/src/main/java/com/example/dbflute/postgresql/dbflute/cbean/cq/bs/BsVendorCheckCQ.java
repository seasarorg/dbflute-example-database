package com.example.dbflute.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.postgresql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.postgresql.dbflute.cbean.*;
import com.example.dbflute.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_check) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_check on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _vendorCheckId;
    public ConditionValue getVendorCheckId() {
        if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
        return _vendorCheckId;
    }
    protected ConditionValue getCValueVendorCheckId() { return getVendorCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("vendor_check_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("vendor_check_id"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue getTypeOfChar() {
        if (_typeOfChar == null) { _typeOfChar = nCV(); }
        return _typeOfChar;
    }
    protected ConditionValue getCValueTypeOfChar() { return getTypeOfChar(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_char: {bpchar(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("type_of_char"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_char: {bpchar(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("type_of_char"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue getTypeOfVarchar() {
        if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
        return _typeOfVarchar;
    }
    protected ConditionValue getCValueTypeOfVarchar() { return getTypeOfVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("type_of_varchar"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_varchar: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("type_of_varchar"); return this; }

    protected ConditionValue _typeOfVcArray;
    public ConditionValue getTypeOfVcArray() {
        if (_typeOfVcArray == null) { _typeOfVcArray = nCV(); }
        return _typeOfVcArray;
    }
    protected ConditionValue getCValueTypeOfVcArray() { return getTypeOfVcArray(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_vc_array: {_varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVcArray_Asc() { regOBA("type_of_vc_array"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_vc_array: {_varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVcArray_Desc() { regOBD("type_of_vc_array"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue getTypeOfText() {
        if (_typeOfText == null) { _typeOfText = nCV(); }
        return _typeOfText;
    }
    protected ConditionValue getCValueTypeOfText() { return getTypeOfText(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("type_of_text"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("type_of_text"); return this; }

    protected ConditionValue _typeOfNumericInteger;
    public ConditionValue getTypeOfNumericInteger() {
        if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
        return _typeOfNumericInteger;
    }
    protected ConditionValue getCValueTypeOfNumericInteger() { return getTypeOfNumericInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Asc() { regOBA("type_of_numeric_integer"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_numeric_integer: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Desc() { regOBD("type_of_numeric_integer"); return this; }

    protected ConditionValue _typeOfNumericBigint;
    public ConditionValue getTypeOfNumericBigint() {
        if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
        return _typeOfNumericBigint;
    }
    protected ConditionValue getCValueTypeOfNumericBigint() { return getTypeOfNumericBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Asc() { regOBA("type_of_numeric_bigint"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_numeric_bigint: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Desc() { regOBD("type_of_numeric_bigint"); return this; }

    protected ConditionValue _typeOfNumericDecimal;
    public ConditionValue getTypeOfNumericDecimal() {
        if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
        return _typeOfNumericDecimal;
    }
    protected ConditionValue getCValueTypeOfNumericDecimal() { return getTypeOfNumericDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Asc() { regOBA("type_of_numeric_decimal"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Desc() { regOBD("type_of_numeric_decimal"); return this; }

    protected ConditionValue _typeOfDecimal;
    public ConditionValue getTypeOfDecimal() {
        if (_typeOfDecimal == null) { _typeOfDecimal = nCV(); }
        return _typeOfDecimal;
    }
    protected ConditionValue getCValueTypeOfDecimal() { return getTypeOfDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_decimal: {numeric(131089)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimal_Asc() { regOBA("type_of_decimal"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_decimal: {numeric(131089)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimal_Desc() { regOBD("type_of_decimal"); return this; }

    protected ConditionValue _typeOfInt8;
    public ConditionValue getTypeOfInt8() {
        if (_typeOfInt8 == null) { _typeOfInt8 = nCV(); }
        return _typeOfInt8;
    }
    protected ConditionValue getCValueTypeOfInt8() { return getTypeOfInt8(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_int8: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8_Asc() { regOBA("type_of_int8"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_int8: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8_Desc() { regOBD("type_of_int8"); return this; }

    protected ConditionValue _typeOfIntArray;
    public ConditionValue getTypeOfIntArray() {
        if (_typeOfIntArray == null) { _typeOfIntArray = nCV(); }
        return _typeOfIntArray;
    }
    protected ConditionValue getCValueTypeOfIntArray() { return getTypeOfIntArray(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_int_array: {_int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntArray_Asc() { regOBA("type_of_int_array"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_int_array: {_int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntArray_Desc() { regOBD("type_of_int_array"); return this; }

    protected ConditionValue _typeOfInt4;
    public ConditionValue getTypeOfInt4() {
        if (_typeOfInt4 == null) { _typeOfInt4 = nCV(); }
        return _typeOfInt4;
    }
    protected ConditionValue getCValueTypeOfInt4() { return getTypeOfInt4(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_int4: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4_Asc() { regOBA("type_of_int4"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_int4: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4_Desc() { regOBD("type_of_int4"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue getTypeOfBigint() {
        if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
        return _typeOfBigint;
    }
    protected ConditionValue getCValueTypeOfBigint() { return getTypeOfBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_bigint: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("type_of_bigint"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_bigint: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("type_of_bigint"); return this; }

    protected ConditionValue _typeOfFloat;
    public ConditionValue getTypeOfFloat() {
        if (_typeOfFloat == null) { _typeOfFloat = nCV(); }
        return _typeOfFloat;
    }
    protected ConditionValue getCValueTypeOfFloat() { return getTypeOfFloat(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_float: {float8(17, 17)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("type_of_float"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_float: {float8(17, 17)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Desc() { regOBD("type_of_float"); return this; }

    protected ConditionValue _typeOfReal;
    public ConditionValue getTypeOfReal() {
        if (_typeOfReal == null) { _typeOfReal = nCV(); }
        return _typeOfReal;
    }
    protected ConditionValue getCValueTypeOfReal() { return getTypeOfReal(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_real: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Asc() { regOBA("type_of_real"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_real: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Desc() { regOBD("type_of_real"); return this; }

    protected ConditionValue _typeOfMoney;
    public ConditionValue getTypeOfMoney() {
        if (_typeOfMoney == null) { _typeOfMoney = nCV(); }
        return _typeOfMoney;
    }
    protected ConditionValue getCValueTypeOfMoney() { return getTypeOfMoney(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_money: {money(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Asc() { regOBA("type_of_money"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_money: {money(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Desc() { regOBD("type_of_money"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue getTypeOfDate() {
        if (_typeOfDate == null) { _typeOfDate = nCV(); }
        return _typeOfDate;
    }
    protected ConditionValue getCValueTypeOfDate() { return getTypeOfDate(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("type_of_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("type_of_date"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue getTypeOfTimestamp() {
        if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
        return _typeOfTimestamp;
    }
    protected ConditionValue getCValueTypeOfTimestamp() { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("type_of_timestamp"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_timestamp: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("type_of_timestamp"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue getTypeOfTime() {
        if (_typeOfTime == null) { _typeOfTime = nCV(); }
        return _typeOfTime;
    }
    protected ConditionValue getCValueTypeOfTime() { return getTypeOfTime(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("type_of_time"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("type_of_time"); return this; }

    protected ConditionValue _typeOfTimetz;
    public ConditionValue getTypeOfTimetz() {
        if (_typeOfTimetz == null) { _typeOfTimetz = nCV(); }
        return _typeOfTimetz;
    }
    protected ConditionValue getCValueTypeOfTimetz() { return getTypeOfTimetz(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimetz_Asc() { regOBA("type_of_timetz"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_timetz: {timetz(21, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimetz_Desc() { regOBD("type_of_timetz"); return this; }

    protected ConditionValue _typeOfInterval;
    public ConditionValue getTypeOfInterval() {
        if (_typeOfInterval == null) { _typeOfInterval = nCV(); }
        return _typeOfInterval;
    }
    protected ConditionValue getCValueTypeOfInterval() { return getTypeOfInterval(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_interval: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInterval_Asc() { regOBA("type_of_interval"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_interval: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInterval_Desc() { regOBD("type_of_interval"); return this; }

    protected ConditionValue _typeOfBool;
    public ConditionValue getTypeOfBool() {
        if (_typeOfBool == null) { _typeOfBool = nCV(); }
        return _typeOfBool;
    }
    protected ConditionValue getCValueTypeOfBool() { return getTypeOfBool(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBool_Asc() { regOBA("type_of_bool"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBool_Desc() { regOBD("type_of_bool"); return this; }

    protected ConditionValue _typeOfBit;
    public ConditionValue getTypeOfBit() {
        if (_typeOfBit == null) { _typeOfBit = nCV(); }
        return _typeOfBit;
    }
    protected ConditionValue getCValueTypeOfBit() { return getTypeOfBit(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_bit: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Asc() { regOBA("type_of_bit"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_bit: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Desc() { regOBD("type_of_bit"); return this; }

    protected ConditionValue _typeOfBytea;
    public ConditionValue getTypeOfBytea() {
        if (_typeOfBytea == null) { _typeOfBytea = nCV(); }
        return _typeOfBytea;
    }
    protected ConditionValue getCValueTypeOfBytea() { return getTypeOfBytea(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_bytea: {bytea(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBytea_Asc() { regOBA("type_of_bytea"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_bytea: {bytea(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBytea_Desc() { regOBD("type_of_bytea"); return this; }

    protected ConditionValue _typeOfOid;
    public ConditionValue getTypeOfOid() {
        if (_typeOfOid == null) { _typeOfOid = nCV(); }
        return _typeOfOid;
    }
    protected ConditionValue getCValueTypeOfOid() { return getTypeOfOid(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_oid: {oid(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfOid_Asc() { regOBA("type_of_oid"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_oid: {oid(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfOid_Desc() { regOBD("type_of_oid"); return this; }

    protected ConditionValue _typeOfUuid;
    public ConditionValue getTypeOfUuid() {
        if (_typeOfUuid == null) { _typeOfUuid = nCV(); }
        return _typeOfUuid;
    }
    protected ConditionValue getCValueTypeOfUuid() { return getTypeOfUuid(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_uuid: {uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUuid_Asc() { regOBA("type_of_uuid"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_uuid: {uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUuid_Desc() { regOBD("type_of_uuid"); return this; }

    protected ConditionValue _typeOfXml;
    public ConditionValue getTypeOfXml() {
        if (_typeOfXml == null) { _typeOfXml = nCV(); }
        return _typeOfXml;
    }
    protected ConditionValue getCValueTypeOfXml() { return getTypeOfXml(); }

    /** 
     * Add order-by as ascend. <br />
     * type_of_xml: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Asc() { regOBA("type_of_xml"); return this; }

    /**
     * Add order-by as descend. <br />
     * type_of_xml: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Desc() { regOBD("type_of_xml"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, VendorCheckCQ> _scalarConditionMap;
    public Map<String, VendorCheckCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorCheckCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorCheckCQ> _queryMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorCheckCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorCheckCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _myselfInScopeMap;
    public Map<String, VendorCheckCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorCheckCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
