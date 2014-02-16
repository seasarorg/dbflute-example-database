package com.example.dbflute.oracle.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.oracle.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.oracle.dbflute.cbean.*;
import com.example.dbflute.oracle.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_CHECK.
 * @author oracleman
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
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
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
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
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
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue getTypeOfChar() {
        if (_typeOfChar == null) { _typeOfChar = nCV(); }
        return _typeOfChar;
    }
    protected ConditionValue getCValueTypeOfChar() { return getTypeOfChar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("TYPE_OF_CHAR"); return this; }

    protected ConditionValue _typeOfNchar;
    public ConditionValue getTypeOfNchar() {
        if (_typeOfNchar == null) { _typeOfNchar = nCV(); }
        return _typeOfNchar;
    }
    protected ConditionValue getCValueTypeOfNchar() { return getTypeOfNchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNchar_Asc() { regOBA("TYPE_OF_NCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNchar_Desc() { regOBD("TYPE_OF_NCHAR"); return this; }

    protected ConditionValue _typeOfVarchar2;
    public ConditionValue getTypeOfVarchar2() {
        if (_typeOfVarchar2 == null) { _typeOfVarchar2 = nCV(); }
        return _typeOfVarchar2;
    }
    protected ConditionValue getCValueTypeOfVarchar2() { return getTypeOfVarchar2(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2_Asc() { regOBA("TYPE_OF_VARCHAR2"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2_Desc() { regOBD("TYPE_OF_VARCHAR2"); return this; }

    protected ConditionValue _typeOfVarchar2Max;
    public ConditionValue getTypeOfVarchar2Max() {
        if (_typeOfVarchar2Max == null) { _typeOfVarchar2Max = nCV(); }
        return _typeOfVarchar2Max;
    }
    protected ConditionValue getCValueTypeOfVarchar2Max() { return getTypeOfVarchar2Max(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2Max_Asc() { regOBA("TYPE_OF_VARCHAR2_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar2Max_Desc() { regOBD("TYPE_OF_VARCHAR2_MAX"); return this; }

    protected ConditionValue _typeOfNvarchar2;
    public ConditionValue getTypeOfNvarchar2() {
        if (_typeOfNvarchar2 == null) { _typeOfNvarchar2 = nCV(); }
        return _typeOfNvarchar2;
    }
    protected ConditionValue getCValueTypeOfNvarchar2() { return getTypeOfNvarchar2(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar2_Asc() { regOBA("TYPE_OF_NVARCHAR2"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNvarchar2_Desc() { regOBD("TYPE_OF_NVARCHAR2"); return this; }

    protected ConditionValue _typeOfClob;
    public ConditionValue getTypeOfClob() {
        if (_typeOfClob == null) { _typeOfClob = nCV(); }
        return _typeOfClob;
    }
    protected ConditionValue getCValueTypeOfClob() { return getTypeOfClob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Asc() { regOBA("TYPE_OF_CLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Desc() { regOBD("TYPE_OF_CLOB"); return this; }

    protected ConditionValue _typeOfNclob;
    public ConditionValue getTypeOfNclob() {
        if (_typeOfNclob == null) { _typeOfNclob = nCV(); }
        return _typeOfNclob;
    }
    protected ConditionValue getCValueTypeOfNclob() { return getTypeOfNclob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNclob_Asc() { regOBA("TYPE_OF_NCLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNclob_Desc() { regOBD("TYPE_OF_NCLOB"); return this; }

    protected ConditionValue _typeOfLong;
    public ConditionValue getTypeOfLong() {
        if (_typeOfLong == null) { _typeOfLong = nCV(); }
        return _typeOfLong;
    }
    protected ConditionValue getCValueTypeOfLong() { return getTypeOfLong(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_LONG: {LONG}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLong_Asc() { regOBA("TYPE_OF_LONG"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_LONG: {LONG}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLong_Desc() { regOBD("TYPE_OF_LONG"); return this; }

    protected ConditionValue _typeOfXmltype;
    public ConditionValue getTypeOfXmltype() {
        if (_typeOfXmltype == null) { _typeOfXmltype = nCV(); }
        return _typeOfXmltype;
    }
    protected ConditionValue getCValueTypeOfXmltype() { return getTypeOfXmltype(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXmltype_Asc() { regOBA("TYPE_OF_XMLTYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXmltype_Desc() { regOBD("TYPE_OF_XMLTYPE"); return this; }

    protected ConditionValue _typeOfNumberInteger;
    public ConditionValue getTypeOfNumberInteger() {
        if (_typeOfNumberInteger == null) { _typeOfNumberInteger = nCV(); }
        return _typeOfNumberInteger;
    }
    protected ConditionValue getCValueTypeOfNumberInteger() { return getTypeOfNumberInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberInteger_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberInteger_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER"); return this; }

    protected ConditionValue _typeOfNumberBigint;
    public ConditionValue getTypeOfNumberBigint() {
        if (_typeOfNumberBigint == null) { _typeOfNumberBigint = nCV(); }
        return _typeOfNumberBigint;
    }
    protected ConditionValue getCValueTypeOfNumberBigint() { return getTypeOfNumberBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigint_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigint_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT"); return this; }

    protected ConditionValue _typeOfNumberDecimal;
    public ConditionValue getTypeOfNumberDecimal() {
        if (_typeOfNumberDecimal == null) { _typeOfNumberDecimal = nCV(); }
        return _typeOfNumberDecimal;
    }
    protected ConditionValue getCValueTypeOfNumberDecimal() { return getTypeOfNumberDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberDecimal_Asc() { regOBA("TYPE_OF_NUMBER_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberDecimal_Desc() { regOBD("TYPE_OF_NUMBER_DECIMAL"); return this; }

    protected ConditionValue _typeOfNumberIntegerMin;
    public ConditionValue getTypeOfNumberIntegerMin() {
        if (_typeOfNumberIntegerMin == null) { _typeOfNumberIntegerMin = nCV(); }
        return _typeOfNumberIntegerMin;
    }
    protected ConditionValue getCValueTypeOfNumberIntegerMin() { return getTypeOfNumberIntegerMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMin_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMin_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER_MIN"); return this; }

    protected ConditionValue _typeOfNumberIntegerMax;
    public ConditionValue getTypeOfNumberIntegerMax() {
        if (_typeOfNumberIntegerMax == null) { _typeOfNumberIntegerMax = nCV(); }
        return _typeOfNumberIntegerMax;
    }
    protected ConditionValue getCValueTypeOfNumberIntegerMax() { return getTypeOfNumberIntegerMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMax_Asc() { regOBA("TYPE_OF_NUMBER_INTEGER_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberIntegerMax_Desc() { regOBD("TYPE_OF_NUMBER_INTEGER_MAX"); return this; }

    protected ConditionValue _typeOfNumberBigintMin;
    public ConditionValue getTypeOfNumberBigintMin() {
        if (_typeOfNumberBigintMin == null) { _typeOfNumberBigintMin = nCV(); }
        return _typeOfNumberBigintMin;
    }
    protected ConditionValue getCValueTypeOfNumberBigintMin() { return getTypeOfNumberBigintMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMin_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMin_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT_MIN"); return this; }

    protected ConditionValue _typeOfNumberBigintMax;
    public ConditionValue getTypeOfNumberBigintMax() {
        if (_typeOfNumberBigintMax == null) { _typeOfNumberBigintMax = nCV(); }
        return _typeOfNumberBigintMax;
    }
    protected ConditionValue getCValueTypeOfNumberBigintMax() { return getTypeOfNumberBigintMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMax_Asc() { regOBA("TYPE_OF_NUMBER_BIGINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberBigintMax_Desc() { regOBD("TYPE_OF_NUMBER_BIGINT_MAX"); return this; }

    protected ConditionValue _typeOfNumberSuperintMin;
    public ConditionValue getTypeOfNumberSuperintMin() {
        if (_typeOfNumberSuperintMin == null) { _typeOfNumberSuperintMin = nCV(); }
        return _typeOfNumberSuperintMin;
    }
    protected ConditionValue getCValueTypeOfNumberSuperintMin() { return getTypeOfNumberSuperintMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMin_Asc() { regOBA("TYPE_OF_NUMBER_SUPERINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMin_Desc() { regOBD("TYPE_OF_NUMBER_SUPERINT_MIN"); return this; }

    protected ConditionValue _typeOfNumberSuperintMax;
    public ConditionValue getTypeOfNumberSuperintMax() {
        if (_typeOfNumberSuperintMax == null) { _typeOfNumberSuperintMax = nCV(); }
        return _typeOfNumberSuperintMax;
    }
    protected ConditionValue getCValueTypeOfNumberSuperintMax() { return getTypeOfNumberSuperintMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMax_Asc() { regOBA("TYPE_OF_NUMBER_SUPERINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberSuperintMax_Desc() { regOBD("TYPE_OF_NUMBER_SUPERINT_MAX"); return this; }

    protected ConditionValue _typeOfNumberMaxdecimal;
    public ConditionValue getTypeOfNumberMaxdecimal() {
        if (_typeOfNumberMaxdecimal == null) { _typeOfNumberMaxdecimal = nCV(); }
        return _typeOfNumberMaxdecimal;
    }
    protected ConditionValue getCValueTypeOfNumberMaxdecimal() { return getTypeOfNumberMaxdecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberMaxdecimal_Asc() { regOBA("TYPE_OF_NUMBER_MAXDECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumberMaxdecimal_Desc() { regOBD("TYPE_OF_NUMBER_MAXDECIMAL"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue getTypeOfInteger() {
        if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
        return _typeOfInteger;
    }
    protected ConditionValue getCValueTypeOfInteger() { return getTypeOfInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBinaryFloat;
    public ConditionValue getTypeOfBinaryFloat() {
        if (_typeOfBinaryFloat == null) { _typeOfBinaryFloat = nCV(); }
        return _typeOfBinaryFloat;
    }
    protected ConditionValue getCValueTypeOfBinaryFloat() { return getTypeOfBinaryFloat(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryFloat_Asc() { regOBA("TYPE_OF_BINARY_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryFloat_Desc() { regOBD("TYPE_OF_BINARY_FLOAT"); return this; }

    protected ConditionValue _typeOfBinaryDouble;
    public ConditionValue getTypeOfBinaryDouble() {
        if (_typeOfBinaryDouble == null) { _typeOfBinaryDouble = nCV(); }
        return _typeOfBinaryDouble;
    }
    protected ConditionValue getCValueTypeOfBinaryDouble() { return getTypeOfBinaryDouble(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryDouble_Asc() { regOBA("TYPE_OF_BINARY_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinaryDouble_Desc() { regOBD("TYPE_OF_BINARY_DOUBLE"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue getTypeOfDate() {
        if (_typeOfDate == null) { _typeOfDate = nCV(); }
        return _typeOfDate;
    }
    protected ConditionValue getCValueTypeOfDate() { return getTypeOfDate(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DATE: {DATE(7)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue getTypeOfTimestamp() {
        if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
        return _typeOfTimestamp;
    }
    protected ConditionValue getCValueTypeOfTimestamp() { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfIntervalYearToMonth;
    public ConditionValue getTypeOfIntervalYearToMonth() {
        if (_typeOfIntervalYearToMonth == null) { _typeOfIntervalYearToMonth = nCV(); }
        return _typeOfIntervalYearToMonth;
    }
    protected ConditionValue getCValueTypeOfIntervalYearToMonth() { return getTypeOfIntervalYearToMonth(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalYearToMonth_Asc() { regOBA("TYPE_OF_INTERVAL_YEAR_TO_MONTH"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalYearToMonth_Desc() { regOBD("TYPE_OF_INTERVAL_YEAR_TO_MONTH"); return this; }

    protected ConditionValue _typeOfIntervalDayToSecond;
    public ConditionValue getTypeOfIntervalDayToSecond() {
        if (_typeOfIntervalDayToSecond == null) { _typeOfIntervalDayToSecond = nCV(); }
        return _typeOfIntervalDayToSecond;
    }
    protected ConditionValue getCValueTypeOfIntervalDayToSecond() { return getTypeOfIntervalDayToSecond(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalDayToSecond_Asc() { regOBA("TYPE_OF_INTERVAL_DAY_TO_SECOND"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntervalDayToSecond_Desc() { regOBD("TYPE_OF_INTERVAL_DAY_TO_SECOND"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue getTypeOfBlob() {
        if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
        return _typeOfBlob;
    }
    protected ConditionValue getCValueTypeOfBlob() { return getTypeOfBlob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfRaw;
    public ConditionValue getTypeOfRaw() {
        if (_typeOfRaw == null) { _typeOfRaw = nCV(); }
        return _typeOfRaw;
    }
    protected ConditionValue getCValueTypeOfRaw() { return getTypeOfRaw(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_RAW: {RAW(512)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRaw_Asc() { regOBA("TYPE_OF_RAW"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_RAW: {RAW(512)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRaw_Desc() { regOBD("TYPE_OF_RAW"); return this; }

    protected ConditionValue _typeOfBfile;
    public ConditionValue getTypeOfBfile() {
        if (_typeOfBfile == null) { _typeOfBfile = nCV(); }
        return _typeOfBfile;
    }
    protected ConditionValue getCValueTypeOfBfile() { return getTypeOfBfile(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBfile_Asc() { regOBA("TYPE_OF_BFILE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBfile_Desc() { regOBD("TYPE_OF_BFILE"); return this; }

    protected ConditionValue _typeOfRowid;
    public ConditionValue getTypeOfRowid() {
        if (_typeOfRowid == null) { _typeOfRowid = nCV(); }
        return _typeOfRowid;
    }
    protected ConditionValue getCValueTypeOfRowid() { return getTypeOfRowid(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRowid_Asc() { regOBA("TYPE_OF_ROWID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_ROWID: {ROWID(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfRowid_Desc() { regOBD("TYPE_OF_ROWID"); return this; }

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
    protected void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
    public String keepScalarCondition(VendorCheckCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, VendorCheckCQ> _queryMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorCheckCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _myselfInScopeMap;
    public Map<String, VendorCheckCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorCheckCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
