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

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.mysql.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.mysql.dbflute.cbean.*;
import com.example.dbflute.mysql.dbflute.cbean.cq.*;

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
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_check) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
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
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
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
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
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

    protected ConditionValue _typeOfVarchar;
    public ConditionValue getTypeOfVarchar() {
        if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
        return _typeOfVarchar;
    }
    protected ConditionValue getCValueTypeOfVarchar() { return getTypeOfVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue getTypeOfText() {
        if (_typeOfText == null) { _typeOfText = nCV(); }
        return _typeOfText;
    }
    protected ConditionValue getCValueTypeOfText() { return getTypeOfText(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("TYPE_OF_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TEXT: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("TYPE_OF_TEXT"); return this; }

    protected ConditionValue _typeOfTinytext;
    public ConditionValue getTypeOfTinytext() {
        if (_typeOfTinytext == null) { _typeOfTinytext = nCV(); }
        return _typeOfTinytext;
    }
    protected ConditionValue getCValueTypeOfTinytext() { return getTypeOfTinytext(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinytext_Asc() { regOBA("TYPE_OF_TINYTEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TINYTEXT: {TINYTEXT(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinytext_Desc() { regOBD("TYPE_OF_TINYTEXT"); return this; }

    protected ConditionValue _typeOfMediumtext;
    public ConditionValue getTypeOfMediumtext() {
        if (_typeOfMediumtext == null) { _typeOfMediumtext = nCV(); }
        return _typeOfMediumtext;
    }
    protected ConditionValue getCValueTypeOfMediumtext() { return getTypeOfMediumtext(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumtext_Asc() { regOBA("TYPE_OF_MEDIUMTEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_MEDIUMTEXT: {MEDIUMTEXT(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumtext_Desc() { regOBD("TYPE_OF_MEDIUMTEXT"); return this; }

    protected ConditionValue _typeOfLongtext;
    public ConditionValue getTypeOfLongtext() {
        if (_typeOfLongtext == null) { _typeOfLongtext = nCV(); }
        return _typeOfLongtext;
    }
    protected ConditionValue getCValueTypeOfLongtext() { return getTypeOfLongtext(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongtext_Asc() { regOBA("TYPE_OF_LONGTEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_LONGTEXT: {LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongtext_Desc() { regOBD("TYPE_OF_LONGTEXT"); return this; }

    protected ConditionValue _typeOfNumericDecimal;
    public ConditionValue getTypeOfNumericDecimal() {
        if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
        return _typeOfNumericDecimal;
    }
    protected ConditionValue getCValueTypeOfNumericDecimal() { return getTypeOfNumericDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Asc() { regOBA("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Desc() { regOBD("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    protected ConditionValue _typeOfNumericInteger;
    public ConditionValue getTypeOfNumericInteger() {
        if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
        return _typeOfNumericInteger;
    }
    protected ConditionValue getCValueTypeOfNumericInteger() { return getTypeOfNumericInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Asc() { regOBA("TYPE_OF_NUMERIC_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Desc() { regOBD("TYPE_OF_NUMERIC_INTEGER"); return this; }

    protected ConditionValue _typeOfNumericBigint;
    public ConditionValue getTypeOfNumericBigint() {
        if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
        return _typeOfNumericBigint;
    }
    protected ConditionValue getCValueTypeOfNumericBigint() { return getTypeOfNumericBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Asc() { regOBA("TYPE_OF_NUMERIC_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Desc() { regOBD("TYPE_OF_NUMERIC_BIGINT"); return this; }

    protected ConditionValue _typeOfDecimalDecimal;
    public ConditionValue getTypeOfDecimalDecimal() {
        if (_typeOfDecimalDecimal == null) { _typeOfDecimalDecimal = nCV(); }
        return _typeOfDecimalDecimal;
    }
    protected ConditionValue getCValueTypeOfDecimalDecimal() { return getTypeOfDecimalDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Asc() { regOBA("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalDecimal_Desc() { regOBD("TYPE_OF_DECIMAL_DECIMAL"); return this; }

    protected ConditionValue _typeOfDecimalInteger;
    public ConditionValue getTypeOfDecimalInteger() {
        if (_typeOfDecimalInteger == null) { _typeOfDecimalInteger = nCV(); }
        return _typeOfDecimalInteger;
    }
    protected ConditionValue getCValueTypeOfDecimalInteger() { return getTypeOfDecimalInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Asc() { regOBA("TYPE_OF_DECIMAL_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalInteger_Desc() { regOBD("TYPE_OF_DECIMAL_INTEGER"); return this; }

    protected ConditionValue _typeOfDecimalBigint;
    public ConditionValue getTypeOfDecimalBigint() {
        if (_typeOfDecimalBigint == null) { _typeOfDecimalBigint = nCV(); }
        return _typeOfDecimalBigint;
    }
    protected ConditionValue getCValueTypeOfDecimalBigint() { return getTypeOfDecimalBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Asc() { regOBA("TYPE_OF_DECIMAL_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DECIMAL_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimalBigint_Desc() { regOBD("TYPE_OF_DECIMAL_BIGINT"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue getTypeOfInteger() {
        if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
        return _typeOfInteger;
    }
    protected ConditionValue getCValueTypeOfInteger() { return getTypeOfInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTEGER: {INT(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Desc() { regOBD("TYPE_OF_INTEGER"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue getTypeOfBigint() {
        if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
        return _typeOfBigint;
    }
    protected ConditionValue getCValueTypeOfBigint() { return getTypeOfBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("TYPE_OF_BIGINT"); return this; }

    protected ConditionValue _typeOfFloat;
    public ConditionValue getTypeOfFloat() {
        if (_typeOfFloat == null) { _typeOfFloat = nCV(); }
        return _typeOfFloat;
    }
    protected ConditionValue getCValueTypeOfFloat() { return getTypeOfFloat(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("TYPE_OF_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_FLOAT: {FLOAT(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Desc() { regOBD("TYPE_OF_FLOAT"); return this; }

    protected ConditionValue _typeOfDouble;
    public ConditionValue getTypeOfDouble() {
        if (_typeOfDouble == null) { _typeOfDouble = nCV(); }
        return _typeOfDouble;
    }
    protected ConditionValue getCValueTypeOfDouble() { return getTypeOfDouble(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Asc() { regOBA("TYPE_OF_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DOUBLE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Desc() { regOBD("TYPE_OF_DOUBLE"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue getTypeOfDate() {
        if (_typeOfDate == null) { _typeOfDate = nCV(); }
        return _typeOfDate;
    }
    protected ConditionValue getCValueTypeOfDate() { return getTypeOfDate(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("TYPE_OF_DATE"); return this; }

    protected ConditionValue _typeOfDatetime;
    public ConditionValue getTypeOfDatetime() {
        if (_typeOfDatetime == null) { _typeOfDatetime = nCV(); }
        return _typeOfDatetime;
    }
    protected ConditionValue getCValueTypeOfDatetime() { return getTypeOfDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Asc() { regOBA("TYPE_OF_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDatetime_Desc() { regOBD("TYPE_OF_DATETIME"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue getTypeOfTimestamp() {
        if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
        return _typeOfTimestamp;
    }
    protected ConditionValue getCValueTypeOfTimestamp() { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIMESTAMP: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue getTypeOfTime() {
        if (_typeOfTime == null) { _typeOfTime = nCV(); }
        return _typeOfTime;
    }
    protected ConditionValue getCValueTypeOfTime() { return getTypeOfTime(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("TYPE_OF_TIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIME: {TIME(8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("TYPE_OF_TIME"); return this; }

    protected ConditionValue _typeOfYear;
    public ConditionValue getTypeOfYear() {
        if (_typeOfYear == null) { _typeOfYear = nCV(); }
        return _typeOfYear;
    }
    protected ConditionValue getCValueTypeOfYear() { return getTypeOfYear(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_YEAR: {YEAR}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfYear_Asc() { regOBA("TYPE_OF_YEAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_YEAR: {YEAR}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfYear_Desc() { regOBD("TYPE_OF_YEAR"); return this; }

    protected ConditionValue _typeOfBoolean;
    public ConditionValue getTypeOfBoolean() {
        if (_typeOfBoolean == null) { _typeOfBoolean = nCV(); }
        return _typeOfBoolean;
    }
    protected ConditionValue getCValueTypeOfBoolean() { return getTypeOfBoolean(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Asc() { regOBA("TYPE_OF_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BOOLEAN: {BIT, classification=BooleanFlg}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Desc() { regOBD("TYPE_OF_BOOLEAN"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue getTypeOfBlob() {
        if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
        return _typeOfBlob;
    }
    protected ConditionValue getCValueTypeOfBlob() { return getTypeOfBlob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BLOB: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BLOB: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfTinyblob;
    public ConditionValue getTypeOfTinyblob() {
        if (_typeOfTinyblob == null) { _typeOfTinyblob = nCV(); }
        return _typeOfTinyblob;
    }
    protected ConditionValue getCValueTypeOfTinyblob() { return getTypeOfTinyblob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinyblob_Asc() { regOBA("TYPE_OF_TINYBLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TINYBLOB: {TINYBLOB(255)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTinyblob_Desc() { regOBD("TYPE_OF_TINYBLOB"); return this; }

    protected ConditionValue _typeOfMediumblob;
    public ConditionValue getTypeOfMediumblob() {
        if (_typeOfMediumblob == null) { _typeOfMediumblob = nCV(); }
        return _typeOfMediumblob;
    }
    protected ConditionValue getCValueTypeOfMediumblob() { return getTypeOfMediumblob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumblob_Asc() { regOBA("TYPE_OF_MEDIUMBLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_MEDIUMBLOB: {MEDIUMBLOB(16777215)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMediumblob_Desc() { regOBD("TYPE_OF_MEDIUMBLOB"); return this; }

    protected ConditionValue _typeOfLongblob;
    public ConditionValue getTypeOfLongblob() {
        if (_typeOfLongblob == null) { _typeOfLongblob = nCV(); }
        return _typeOfLongblob;
    }
    protected ConditionValue getCValueTypeOfLongblob() { return getTypeOfLongblob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongblob_Asc() { regOBA("TYPE_OF_LONGBLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_LONGBLOB: {LONGBLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongblob_Desc() { regOBD("TYPE_OF_LONGBLOB"); return this; }

    protected ConditionValue _typeOfBinary;
    public ConditionValue getTypeOfBinary() {
        if (_typeOfBinary == null) { _typeOfBinary = nCV(); }
        return _typeOfBinary;
    }
    protected ConditionValue getCValueTypeOfBinary() { return getTypeOfBinary(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BINARY: {BINARY(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Asc() { regOBA("TYPE_OF_BINARY"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BINARY: {BINARY(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBinary_Desc() { regOBD("TYPE_OF_BINARY"); return this; }

    protected ConditionValue _typeOfVarbinary;
    public ConditionValue getTypeOfVarbinary() {
        if (_typeOfVarbinary == null) { _typeOfVarbinary = nCV(); }
        return _typeOfVarbinary;
    }
    protected ConditionValue getCValueTypeOfVarbinary() { return getTypeOfVarbinary(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Asc() { regOBA("TYPE_OF_VARBINARY"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARBINARY: {VARBINARY(1000)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarbinary_Desc() { regOBD("TYPE_OF_VARBINARY"); return this; }

    protected ConditionValue _typeOfEnum;
    public ConditionValue getTypeOfEnum() {
        if (_typeOfEnum == null) { _typeOfEnum = nCV(); }
        return _typeOfEnum;
    }
    protected ConditionValue getCValueTypeOfEnum() { return getTypeOfEnum(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_ENUM: {ENUM(6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfEnum_Asc() { regOBA("TYPE_OF_ENUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_ENUM: {ENUM(6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfEnum_Desc() { regOBD("TYPE_OF_ENUM"); return this; }

    protected ConditionValue _typeOfSet;
    public ConditionValue getTypeOfSet() {
        if (_typeOfSet == null) { _typeOfSet = nCV(); }
        return _typeOfSet;
    }
    protected ConditionValue getCValueTypeOfSet() { return getTypeOfSet(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_SET: {SET(15)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSet_Asc() { regOBA("TYPE_OF_SET"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_SET: {SET(15)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSet_Desc() { regOBD("TYPE_OF_SET"); return this; }

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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
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
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
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
