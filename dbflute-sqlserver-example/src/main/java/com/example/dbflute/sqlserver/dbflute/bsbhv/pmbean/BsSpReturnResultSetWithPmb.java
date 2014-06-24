package com.example.dbflute.sqlserver.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpReturnResultSetWith. <br />
 * This is related to "<span style="color: #AD4747">SP_RETURN_RESULT_SET_WITH</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpReturnResultSetWithPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String returnValue_PROCEDURE_PARAMETER = "return, -1";
    public static final String VInChar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "inout, 1";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "inout, 2";
    public static final String VInInteger_PROCEDURE_PARAMETER = "in, 3";
    public static final String VInBigint_PROCEDURE_PARAMETER = "in, 4";
    public static final String VInNumericDecimal_PROCEDURE_PARAMETER = "in, 5";
    public static final String VInNumericInteger_PROCEDURE_PARAMETER = "in, 6";
    public static final String VInNumericBigint_PROCEDURE_PARAMETER = "in, 7";
    public static final String VInDatetime_PROCEDURE_PARAMETER = "in, 8";
    public static final String VInUuid_PROCEDURE_PARAMETER = "in, 9";
    public static final String notParamResult1_PROCEDURE_PARAMETER = "notParamResult, 1000";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of returnValue: {int(10) as Return}. */
    protected Integer _returnValue;

    /** The parameter of VInChar: {char(3) as In}. */
    protected String _vInChar;

    /** The parameter of VOutVarchar: {varchar(10) as InOut}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {varchar(10) as InOut}. */
    protected String _vInoutVarchar;

    /** The parameter of VInInteger: {int(10) as In}. */
    protected Integer _vInInteger;

    /** The parameter of VInBigint: {bigint(19) as In}. */
    protected Long _vInBigint;

    /** The parameter of VInNumericDecimal: {numeric(5, 3) as In}. */
    protected java.math.BigDecimal _vInNumericDecimal;

    /** The parameter of VInNumericInteger: {numeric(5) as In}. */
    protected Integer _vInNumericInteger;

    /** The parameter of VInNumericBigint: {numeric(12) as In}. */
    protected Long _vInNumericBigint;

    /** The parameter of VInDatetime: {datetime(23, 3) as In}. */
    protected java.sql.Timestamp _vInDatetime;

    /** The parameter of VInUuid: {uniqueidentifier(36) as In}. */
    protected java.util.UUID _vInUuid;

    /** The parameter of notParamResult1. */
    protected List<SpReturnResultSetWithNotParamResult1> _notParamResult1;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpReturnResultSetWith. <br />
     * This is related to "<span style="color: #AD4747">SP_RETURN_RESULT_SET_WITH</span>".
     */
    public BsSpReturnResultSetWithPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_RETURN_RESULT_SET_WITH";
    }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() {
         return true; // as default
     }

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() {
         return false; // resolved by generator
     }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String filterStringParameter(String value) {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
        return convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = getShortCharHandlingMode(propertyName, value, size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode getShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.NONE;
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { // might be called by option handling
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { // might be called by option handling
        return (NUMBER)DfTypeUtil.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return DfTypeUtil.toBoolean(obj);
    }

    protected Date toUtilDate(Date date) {
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected String formatByteArray(byte[] bytes) {
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_returnValue);
        sb.append(dm).append(_vInChar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vInoutVarchar);
        sb.append(dm).append(_vInInteger);
        sb.append(dm).append(_vInBigint);
        sb.append(dm).append(_vInNumericDecimal);
        sb.append(dm).append(_vInNumericInteger);
        sb.append(dm).append(_vInNumericBigint);
        sb.append(dm).append(_vInDatetime);
        sb.append(dm).append(_vInUuid);
        sb.append(dm).append(_notParamResult1);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] returnValue: {int(10) as Return} <br />
     * @return The value of returnValue. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getReturnValue() {
        return _returnValue;
    }

    /**
     * [set] returnValue: {int(10) as Return} <br />
     * @param returnValue The value of returnValue. (NullAllowed)
     */
    public void setReturnValue(Integer returnValue) {
        _returnValue = returnValue;
    }

    /**
     * [get] VInChar: {char(3) as In} <br />
     * @return The value of VInChar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInChar() {
        return filterStringParameter(_vInChar);
    }

    /**
     * [set] VInChar: {char(3) as In} <br />
     * @param vInChar The value of VInChar. (NullAllowed)
     */
    public void setVInChar(String vInChar) {
        _vInChar = vInChar;
    }

    /**
     * [get] VOutVarchar: {varchar(10) as InOut} <br />
     * @return The value of VOutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {varchar(10) as InOut} <br />
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VInoutVarchar: {varchar(10) as InOut} <br />
     * @return The value of VInoutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {varchar(10) as InOut} <br />
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
    }

    /**
     * [get] VInInteger: {int(10) as In} <br />
     * @return The value of VInInteger. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVInInteger() {
        return _vInInteger;
    }

    /**
     * [set] VInInteger: {int(10) as In} <br />
     * @param vInInteger The value of VInInteger. (NullAllowed)
     */
    public void setVInInteger(Integer vInInteger) {
        _vInInteger = vInInteger;
    }

    /**
     * [get] VInBigint: {bigint(19) as In} <br />
     * @return The value of VInBigint. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVInBigint() {
        return _vInBigint;
    }

    /**
     * [set] VInBigint: {bigint(19) as In} <br />
     * @param vInBigint The value of VInBigint. (NullAllowed)
     */
    public void setVInBigint(Long vInBigint) {
        _vInBigint = vInBigint;
    }

    /**
     * [get] VInNumericDecimal: {numeric(5, 3) as In} <br />
     * @return The value of VInNumericDecimal. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVInNumericDecimal() {
        return _vInNumericDecimal;
    }

    /**
     * [set] VInNumericDecimal: {numeric(5, 3) as In} <br />
     * @param vInNumericDecimal The value of VInNumericDecimal. (NullAllowed)
     */
    public void setVInNumericDecimal(java.math.BigDecimal vInNumericDecimal) {
        _vInNumericDecimal = vInNumericDecimal;
    }

    /**
     * [get] VInNumericInteger: {numeric(5) as In} <br />
     * @return The value of VInNumericInteger. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVInNumericInteger() {
        return _vInNumericInteger;
    }

    /**
     * [set] VInNumericInteger: {numeric(5) as In} <br />
     * @param vInNumericInteger The value of VInNumericInteger. (NullAllowed)
     */
    public void setVInNumericInteger(Integer vInNumericInteger) {
        _vInNumericInteger = vInNumericInteger;
    }

    /**
     * [get] VInNumericBigint: {numeric(12) as In} <br />
     * @return The value of VInNumericBigint. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVInNumericBigint() {
        return _vInNumericBigint;
    }

    /**
     * [set] VInNumericBigint: {numeric(12) as In} <br />
     * @param vInNumericBigint The value of VInNumericBigint. (NullAllowed)
     */
    public void setVInNumericBigint(Long vInNumericBigint) {
        _vInNumericBigint = vInNumericBigint;
    }

    /**
     * [get] VInDatetime: {datetime(23, 3) as In} <br />
     * @return The value of VInDatetime. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getVInDatetime() {
        return _vInDatetime;
    }

    /**
     * [set] VInDatetime: {datetime(23, 3) as In} <br />
     * @param vInDatetime The value of VInDatetime. (NullAllowed)
     */
    public void setVInDatetime(java.sql.Timestamp vInDatetime) {
        _vInDatetime = vInDatetime;
    }

    /**
     * [get] VInUuid: {uniqueidentifier(36) as In} <br />
     * @return The value of VInUuid. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.UUID getVInUuid() {
        return _vInUuid;
    }

    /**
     * [set] VInUuid: {uniqueidentifier(36) as In} <br />
     * @param vInUuid The value of VInUuid. (NullAllowed)
     */
    public void setVInUuid(java.util.UUID vInUuid) {
        _vInUuid = vInUuid;
    }

    /**
     * [get] notParamResult1 <br />
     * @return The value of notParamResult1. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetWithNotParamResult1> getNotParamResult1() {
        return _notParamResult1;
    }

    /**
     * [set] notParamResult1 <br />
     * @param notParamResult1 The value of notParamResult1. (NullAllowed)
     */
    public void setNotParamResult1(List<SpReturnResultSetWithNotParamResult1> notParamResult1) {
        _notParamResult1 = notParamResult1;
    }
}
