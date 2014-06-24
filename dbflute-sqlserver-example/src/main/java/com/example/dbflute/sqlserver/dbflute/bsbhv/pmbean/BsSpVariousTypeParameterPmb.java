package com.example.dbflute.sqlserver.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.sqlserver.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVariousTypeParameter. <br />
 * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpVariousTypeParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String returnValue_PROCEDURE_PARAMETER = "return, -1";
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutNvarchar_PROCEDURE_PARAMETER = "inout, 1";
    public static final String VOutChar_PROCEDURE_PARAMETER = "inout, 2";
    public static final String VInText_PROCEDURE_PARAMETER = "in, 3";
    public static final String VOutText_PROCEDURE_PARAMETER = "inout, 4";
    public static final String vvInNumericInteger_PROCEDURE_PARAMETER = "in, 5";
    public static final String vvInNumericBigint_PROCEDURE_PARAMETER = "in, 6";
    public static final String vvInNumericDecimal_PROCEDURE_PARAMETER = "in, 7";
    public static final String vvInoutInteger_PROCEDURE_PARAMETER = "inout, 8";
    public static final String vvOutBigint_PROCEDURE_PARAMETER = "inout, 9";
    public static final String vvvInDatetime_PROCEDURE_PARAMETER = "in, 10";
    public static final String vvvOutDatetime_PROCEDURE_PARAMETER = "inout, 11";
    public static final String vvvvInUniqueidentifier_PROCEDURE_PARAMETER = "in, 12";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of returnValue: {int(10) as Return}. */
    protected Integer _returnValue;

    /** The parameter of VInVarchar: {varchar(10) as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutNvarchar: {nvarchar(10) as InOut}. */
    protected String _vOutNvarchar;

    /** The parameter of VOutChar: {char(3) as InOut}. */
    protected String _vOutChar;

    /** The parameter of VInText: {text(2147483647) as In}. */
    protected String _vInText;

    /** The parameter of VOutText: {text(2147483647) as InOut}. */
    protected String _vOutText;

    /** The parameter of vvInNumericInteger: {numeric(5) as In}. */
    protected Integer _vvInNumericInteger;

    /** The parameter of vvInNumericBigint: {numeric(12) as In}. */
    protected Long _vvInNumericBigint;

    /** The parameter of vvInNumericDecimal: {numeric(5, 3) as In}. */
    protected java.math.BigDecimal _vvInNumericDecimal;

    /** The parameter of vvInoutInteger: {int(10) as InOut}. */
    protected Integer _vvInoutInteger;

    /** The parameter of vvOutBigint: {bigint(19) as InOut}. */
    protected Long _vvOutBigint;

    /** The parameter of vvvInDatetime: {datetime(23, 3) as In}. */
    protected java.sql.Timestamp _vvvInDatetime;

    /** The parameter of vvvOutDatetime: {datetime(23, 3) as InOut}. */
    protected java.sql.Timestamp _vvvOutDatetime;

    /** The parameter of vvvvInUniqueidentifier: {uniqueidentifier(36) as In}. */
    protected java.util.UUID _vvvvInUniqueidentifier;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVariousTypeParameter. <br />
     * This is related to "<span style="color: #AD4747">SP_VARIOUS_TYPE_PARAMETER</span>".
     */
    public BsSpVariousTypeParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_VARIOUS_TYPE_PARAMETER";
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
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutNvarchar);
        sb.append(dm).append(_vOutChar);
        sb.append(dm).append(_vInText);
        sb.append(dm).append(_vOutText);
        sb.append(dm).append(_vvInNumericInteger);
        sb.append(dm).append(_vvInNumericBigint);
        sb.append(dm).append(_vvInNumericDecimal);
        sb.append(dm).append(_vvInoutInteger);
        sb.append(dm).append(_vvOutBigint);
        sb.append(dm).append(_vvvInDatetime);
        sb.append(dm).append(_vvvOutDatetime);
        sb.append(dm).append(_vvvvInUniqueidentifier);
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
     * [get] VInVarchar: {varchar(10) as In} <br />
     * @return The value of VInVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {varchar(10) as In} <br />
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutNvarchar: {nvarchar(10) as InOut} <br />
     * @return The value of VOutNvarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutNvarchar() {
        return filterStringParameter(_vOutNvarchar);
    }

    /**
     * [set] VOutNvarchar: {nvarchar(10) as InOut} <br />
     * @param vOutNvarchar The value of VOutNvarchar. (NullAllowed)
     */
    public void setVOutNvarchar(String vOutNvarchar) {
        _vOutNvarchar = vOutNvarchar;
    }

    /**
     * [get] VOutChar: {char(3) as InOut} <br />
     * @return The value of VOutChar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutChar() {
        return filterStringParameter(_vOutChar);
    }

    /**
     * [set] VOutChar: {char(3) as InOut} <br />
     * @param vOutChar The value of VOutChar. (NullAllowed)
     */
    public void setVOutChar(String vOutChar) {
        _vOutChar = vOutChar;
    }

    /**
     * [get] VInText: {text(2147483647) as In} <br />
     * @return The value of VInText. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInText() {
        return filterStringParameter(_vInText);
    }

    /**
     * [set] VInText: {text(2147483647) as In} <br />
     * @param vInText The value of VInText. (NullAllowed)
     */
    public void setVInText(String vInText) {
        _vInText = vInText;
    }

    /**
     * [get] VOutText: {text(2147483647) as InOut} <br />
     * @return The value of VOutText. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutText() {
        return filterStringParameter(_vOutText);
    }

    /**
     * [set] VOutText: {text(2147483647) as InOut} <br />
     * @param vOutText The value of VOutText. (NullAllowed)
     */
    public void setVOutText(String vOutText) {
        _vOutText = vOutText;
    }

    /**
     * [get] vvInNumericInteger: {numeric(5) as In} <br />
     * @return The value of vvInNumericInteger. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInNumericInteger() {
        return _vvInNumericInteger;
    }

    /**
     * [set] vvInNumericInteger: {numeric(5) as In} <br />
     * @param vvInNumericInteger The value of vvInNumericInteger. (NullAllowed)
     */
    public void setVvInNumericInteger(Integer vvInNumericInteger) {
        _vvInNumericInteger = vvInNumericInteger;
    }

    /**
     * [get] vvInNumericBigint: {numeric(12) as In} <br />
     * @return The value of vvInNumericBigint. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvInNumericBigint() {
        return _vvInNumericBigint;
    }

    /**
     * [set] vvInNumericBigint: {numeric(12) as In} <br />
     * @param vvInNumericBigint The value of vvInNumericBigint. (NullAllowed)
     */
    public void setVvInNumericBigint(Long vvInNumericBigint) {
        _vvInNumericBigint = vvInNumericBigint;
    }

    /**
     * [get] vvInNumericDecimal: {numeric(5, 3) as In} <br />
     * @return The value of vvInNumericDecimal. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericDecimal() {
        return _vvInNumericDecimal;
    }

    /**
     * [set] vvInNumericDecimal: {numeric(5, 3) as In} <br />
     * @param vvInNumericDecimal The value of vvInNumericDecimal. (NullAllowed)
     */
    public void setVvInNumericDecimal(java.math.BigDecimal vvInNumericDecimal) {
        _vvInNumericDecimal = vvInNumericDecimal;
    }

    /**
     * [get] vvInoutInteger: {int(10) as InOut} <br />
     * @return The value of vvInoutInteger. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInoutInteger() {
        return _vvInoutInteger;
    }

    /**
     * [set] vvInoutInteger: {int(10) as InOut} <br />
     * @param vvInoutInteger The value of vvInoutInteger. (NullAllowed)
     */
    public void setVvInoutInteger(Integer vvInoutInteger) {
        _vvInoutInteger = vvInoutInteger;
    }

    /**
     * [get] vvOutBigint: {bigint(19) as InOut} <br />
     * @return The value of vvOutBigint. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvOutBigint() {
        return _vvOutBigint;
    }

    /**
     * [set] vvOutBigint: {bigint(19) as InOut} <br />
     * @param vvOutBigint The value of vvOutBigint. (NullAllowed)
     */
    public void setVvOutBigint(Long vvOutBigint) {
        _vvOutBigint = vvOutBigint;
    }

    /**
     * [get] vvvInDatetime: {datetime(23, 3) as In} <br />
     * @return The value of vvvInDatetime. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getVvvInDatetime() {
        return _vvvInDatetime;
    }

    /**
     * [set] vvvInDatetime: {datetime(23, 3) as In} <br />
     * @param vvvInDatetime The value of vvvInDatetime. (NullAllowed)
     */
    public void setVvvInDatetime(java.sql.Timestamp vvvInDatetime) {
        _vvvInDatetime = vvvInDatetime;
    }

    /**
     * [get] vvvOutDatetime: {datetime(23, 3) as InOut} <br />
     * @return The value of vvvOutDatetime. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getVvvOutDatetime() {
        return _vvvOutDatetime;
    }

    /**
     * [set] vvvOutDatetime: {datetime(23, 3) as InOut} <br />
     * @param vvvOutDatetime The value of vvvOutDatetime. (NullAllowed)
     */
    public void setVvvOutDatetime(java.sql.Timestamp vvvOutDatetime) {
        _vvvOutDatetime = vvvOutDatetime;
    }

    /**
     * [get] vvvvInUniqueidentifier: {uniqueidentifier(36) as In} <br />
     * @return The value of vvvvInUniqueidentifier. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.UUID getVvvvInUniqueidentifier() {
        return _vvvvInUniqueidentifier;
    }

    /**
     * [set] vvvvInUniqueidentifier: {uniqueidentifier(36) as In} <br />
     * @param vvvvInUniqueidentifier The value of vvvvInUniqueidentifier. (NullAllowed)
     */
    public void setVvvvInUniqueidentifier(java.util.UUID vvvvInUniqueidentifier) {
        _vvvvInUniqueidentifier = vvvvInUniqueidentifier;
    }
}
