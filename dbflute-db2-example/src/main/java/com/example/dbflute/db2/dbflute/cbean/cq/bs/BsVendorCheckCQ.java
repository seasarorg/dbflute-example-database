package com.example.dbflute.db2.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.db2.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.db2.dbflute.cbean.*;
import com.example.dbflute.db2.dbflute.cbean.cq.*;

/**
 * The base condition-query of VENDOR_CHECK.
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

    protected ConditionValue _typeOfCharForBitData;
    public ConditionValue getTypeOfCharForBitData() {
        if (_typeOfCharForBitData == null) { _typeOfCharForBitData = nCV(); }
        return _typeOfCharForBitData;
    }
    protected ConditionValue getCValueTypeOfCharForBitData() { return getTypeOfCharForBitData(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfCharForBitData_Asc() { regOBA("TYPE_OF_CHAR_FOR_BIT_DATA"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CHAR_FOR_BIT_DATA: {CHAR () FOR BIT DATA(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfCharForBitData_Desc() { regOBD("TYPE_OF_CHAR_FOR_BIT_DATA"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue getTypeOfVarchar() {
        if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
        return _typeOfVarchar;
    }
    protected ConditionValue getCValueTypeOfVarchar() { return getTypeOfVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected ConditionValue _typeOfVarcharForBitData;
    public ConditionValue getTypeOfVarcharForBitData() {
        if (_typeOfVarcharForBitData == null) { _typeOfVarcharForBitData = nCV(); }
        return _typeOfVarcharForBitData;
    }
    protected ConditionValue getCValueTypeOfVarcharForBitData() { return getTypeOfVarcharForBitData(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarcharForBitData_Asc() { regOBA("TYPE_OF_VARCHAR_FOR_BIT_DATA"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR_FOR_BIT_DATA: {VARCHAR () FOR BIT DATA(32)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarcharForBitData_Desc() { regOBD("TYPE_OF_VARCHAR_FOR_BIT_DATA"); return this; }

    protected ConditionValue _typeOfClob;
    public ConditionValue getTypeOfClob() {
        if (_typeOfClob == null) { _typeOfClob = nCV(); }
        return _typeOfClob;
    }
    protected ConditionValue getCValueTypeOfClob() { return getTypeOfClob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Asc() { regOBA("TYPE_OF_CLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CLOB: {CLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfClob_Desc() { regOBD("TYPE_OF_CLOB"); return this; }

    protected ConditionValue _typeOfDbclob;
    public ConditionValue getTypeOfDbclob() {
        if (_typeOfDbclob == null) { _typeOfDbclob = nCV(); }
        return _typeOfDbclob;
    }
    protected ConditionValue getCValueTypeOfDbclob() { return getTypeOfDbclob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDbclob_Asc() { regOBA("TYPE_OF_DBCLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DBCLOB: {DBCLOB(2097152)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDbclob_Desc() { regOBD("TYPE_OF_DBCLOB"); return this; }

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

    protected ConditionValue _typeOfSmallint;
    public ConditionValue getTypeOfSmallint() {
        if (_typeOfSmallint == null) { _typeOfSmallint = nCV(); }
        return _typeOfSmallint;
    }
    protected ConditionValue getCValueTypeOfSmallint() { return getTypeOfSmallint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallint_Asc() { regOBA("TYPE_OF_SMALLINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_SMALLINT: {SMALLINT(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfSmallint_Desc() { regOBD("TYPE_OF_SMALLINT"); return this; }

    protected ConditionValue _typeOfInteger;
    public ConditionValue getTypeOfInteger() {
        if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
        return _typeOfInteger;
    }
    protected ConditionValue getCValueTypeOfInteger() { return getTypeOfInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInteger_Asc() { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
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
     * TYPE_OF_FLOAT: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("TYPE_OF_FLOAT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_FLOAT: {DOUBLE(53)}
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
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Asc() { regOBA("TYPE_OF_DOUBLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DOUBLE: {DOUBLE(53)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDouble_Desc() { regOBD("TYPE_OF_DOUBLE"); return this; }

    protected ConditionValue _typeOfReal;
    public ConditionValue getTypeOfReal() {
        if (_typeOfReal == null) { _typeOfReal = nCV(); }
        return _typeOfReal;
    }
    protected ConditionValue getCValueTypeOfReal() { return getTypeOfReal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_REAL: {REAL(24)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Asc() { regOBA("TYPE_OF_REAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_REAL: {REAL(24)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Desc() { regOBD("TYPE_OF_REAL"); return this; }

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

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue getTypeOfTimestamp() {
        if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
        return _typeOfTimestamp;
    }
    protected ConditionValue getCValueTypeOfTimestamp() { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(26, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected ConditionValue _typeOfBlob;
    public ConditionValue getTypeOfBlob() {
        if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
        return _typeOfBlob;
    }
    protected ConditionValue getCValueTypeOfBlob() { return getTypeOfBlob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BLOB: {BLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Asc() { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BLOB: {BLOB(1048576)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBlob_Desc() { regOBD("TYPE_OF_BLOB"); return this; }

    protected ConditionValue _typeOfGraphic;
    public ConditionValue getTypeOfGraphic() {
        if (_typeOfGraphic == null) { _typeOfGraphic = nCV(); }
        return _typeOfGraphic;
    }
    protected ConditionValue getCValueTypeOfGraphic() { return getTypeOfGraphic(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfGraphic_Asc() { regOBA("TYPE_OF_GRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_GRAPHIC: {GRAPHIC(2)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfGraphic_Desc() { regOBD("TYPE_OF_GRAPHIC"); return this; }

    protected ConditionValue _typeOfVargraphic;
    public ConditionValue getTypeOfVargraphic() {
        if (_typeOfVargraphic == null) { _typeOfVargraphic = nCV(); }
        return _typeOfVargraphic;
    }
    protected ConditionValue getCValueTypeOfVargraphic() { return getTypeOfVargraphic(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVargraphic_Asc() { regOBA("TYPE_OF_VARGRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARGRAPHIC: {VARGRAPHIC(64)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVargraphic_Desc() { regOBD("TYPE_OF_VARGRAPHIC"); return this; }

    protected ConditionValue _typeOfLongVargraphic;
    public ConditionValue getTypeOfLongVargraphic() {
        if (_typeOfLongVargraphic == null) { _typeOfLongVargraphic = nCV(); }
        return _typeOfLongVargraphic;
    }
    protected ConditionValue getCValueTypeOfLongVargraphic() { return getTypeOfLongVargraphic(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongVargraphic_Asc() { regOBA("TYPE_OF_LONG_VARGRAPHIC"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_LONG_VARGRAPHIC: {LONG VARGRAPHIC(32700)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfLongVargraphic_Desc() { regOBD("TYPE_OF_LONG_VARGRAPHIC"); return this; }

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
