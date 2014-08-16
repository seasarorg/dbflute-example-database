package com.example.dbflute.db2.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.db2.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVariousTypeParameter. <br />
 * This is related to "<span style="color: #AD4747">DFEXDB.SP_VARIOUS_TYPE_PARAMETER</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpVariousTypeParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutChar_PROCEDURE_PARAMETER = "out, 2";
    public static final String VInClob_PROCEDURE_PARAMETER = "in, 3";
    public static final String VOutClob_PROCEDURE_PARAMETER = "out, 4";
    public static final String vvInNumericInteger_PROCEDURE_PARAMETER = "in, 5";
    public static final String vvInNumericBigint_PROCEDURE_PARAMETER = "in, 6";
    public static final String vvInNumericDecimal_PROCEDURE_PARAMETER = "in, 7";
    public static final String vvInoutInteger_PROCEDURE_PARAMETER = "inout, 8";
    public static final String vvOutBigint_PROCEDURE_PARAMETER = "out, 9";
    public static final String vvvInDate_PROCEDURE_PARAMETER = "in, 10";
    public static final String vvvOutTimestamp_PROCEDURE_PARAMETER = "out, 11";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {VARCHAR(32) as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutVarchar: {VARCHAR(32) as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VOutChar: {CHAR(4) as Out}. */
    protected String _vOutChar;

    /** The parameter of VInClob: {CLOB(1048576) as In}. */
    protected String _vInClob;

    /** The parameter of VOutClob: {CLOB(1048576) as Out}. */
    protected String _vOutClob;

    /** The parameter of vvInNumericInteger: {DECIMAL(5) as In}. */
    protected Integer _vvInNumericInteger;

    /** The parameter of vvInNumericBigint: {DECIMAL(12) as In}. */
    protected Long _vvInNumericBigint;

    /** The parameter of vvInNumericDecimal: {DECIMAL(5, 3) as In}. */
    protected java.math.BigDecimal _vvInNumericDecimal;

    /** The parameter of vvInoutInteger: {INTEGER(10) as InOut}. */
    protected Integer _vvInoutInteger;

    /** The parameter of vvOutBigint: {BIGINT(19) as Out}. */
    protected Long _vvOutBigint;

    /** The parameter of vvvInDate: {DATE(10) as In}. */
    protected java.util.Date _vvvInDate;

    /** The parameter of vvvOutTimestamp: {TIMESTAMP(26, 6) as Out}. */
    protected java.sql.Timestamp _vvvOutTimestamp;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVariousTypeParameter. <br />
     * This is related to "<span style="color: #AD4747">DFEXDB.SP_VARIOUS_TYPE_PARAMETER</span>".
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
        return "DFEXDB.SP_VARIOUS_TYPE_PARAMETER";
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
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vOutChar);
        sb.append(dm).append(_vInClob);
        sb.append(dm).append(_vOutClob);
        sb.append(dm).append(_vvInNumericInteger);
        sb.append(dm).append(_vvInNumericBigint);
        sb.append(dm).append(_vvInNumericDecimal);
        sb.append(dm).append(_vvInoutInteger);
        sb.append(dm).append(_vvOutBigint);
        sb.append(dm).append(formatUtilDate(_vvvInDate));
        sb.append(dm).append(_vvvOutTimestamp);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {VARCHAR(32) as In} <br />
     * @return The value of VInVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {VARCHAR(32) as In} <br />
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutVarchar: {VARCHAR(32) as Out} <br />
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {VARCHAR(32) as Out} <br />
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VOutChar: {CHAR(4) as Out} <br />
     * @return The value of VOutChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutChar() {
        return filterStringParameter(_vOutChar);
    }

    /**
     * [set] VOutChar: {CHAR(4) as Out} <br />
     * @param vOutChar The value of VOutChar. (NullAllowed)
     */
    public void setVOutChar(String vOutChar) {
        _vOutChar = vOutChar;
    }

    /**
     * [get] VInClob: {CLOB(1048576) as In} <br />
     * @return The value of VInClob. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInClob() {
        return filterStringParameter(_vInClob);
    }

    /**
     * [set] VInClob: {CLOB(1048576) as In} <br />
     * @param vInClob The value of VInClob. (NullAllowed)
     */
    public void setVInClob(String vInClob) {
        _vInClob = vInClob;
    }

    /**
     * [get] VOutClob: {CLOB(1048576) as Out} <br />
     * @return The value of VOutClob. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutClob() {
        return filterStringParameter(_vOutClob);
    }

    /**
     * [set] VOutClob: {CLOB(1048576) as Out} <br />
     * @param vOutClob The value of VOutClob. (NullAllowed)
     */
    public void setVOutClob(String vOutClob) {
        _vOutClob = vOutClob;
    }

    /**
     * [get] vvInNumericInteger: {DECIMAL(5) as In} <br />
     * @return The value of vvInNumericInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInNumericInteger() {
        return _vvInNumericInteger;
    }

    /**
     * [set] vvInNumericInteger: {DECIMAL(5) as In} <br />
     * @param vvInNumericInteger The value of vvInNumericInteger. (NullAllowed)
     */
    public void setVvInNumericInteger(Integer vvInNumericInteger) {
        _vvInNumericInteger = vvInNumericInteger;
    }

    /**
     * [get] vvInNumericBigint: {DECIMAL(12) as In} <br />
     * @return The value of vvInNumericBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvInNumericBigint() {
        return _vvInNumericBigint;
    }

    /**
     * [set] vvInNumericBigint: {DECIMAL(12) as In} <br />
     * @param vvInNumericBigint The value of vvInNumericBigint. (NullAllowed)
     */
    public void setVvInNumericBigint(Long vvInNumericBigint) {
        _vvInNumericBigint = vvInNumericBigint;
    }

    /**
     * [get] vvInNumericDecimal: {DECIMAL(5, 3) as In} <br />
     * @return The value of vvInNumericDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericDecimal() {
        return _vvInNumericDecimal;
    }

    /**
     * [set] vvInNumericDecimal: {DECIMAL(5, 3) as In} <br />
     * @param vvInNumericDecimal The value of vvInNumericDecimal. (NullAllowed)
     */
    public void setVvInNumericDecimal(java.math.BigDecimal vvInNumericDecimal) {
        _vvInNumericDecimal = vvInNumericDecimal;
    }

    /**
     * [get] vvInoutInteger: {INTEGER(10) as InOut} <br />
     * @return The value of vvInoutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInoutInteger() {
        return _vvInoutInteger;
    }

    /**
     * [set] vvInoutInteger: {INTEGER(10) as InOut} <br />
     * @param vvInoutInteger The value of vvInoutInteger. (NullAllowed)
     */
    public void setVvInoutInteger(Integer vvInoutInteger) {
        _vvInoutInteger = vvInoutInteger;
    }

    /**
     * [get] vvOutBigint: {BIGINT(19) as Out} <br />
     * @return The value of vvOutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvOutBigint() {
        return _vvOutBigint;
    }

    /**
     * [set] vvOutBigint: {BIGINT(19) as Out} <br />
     * @param vvOutBigint The value of vvOutBigint. (NullAllowed)
     */
    public void setVvOutBigint(Long vvOutBigint) {
        _vvOutBigint = vvOutBigint;
    }

    /**
     * [get] vvvInDate: {DATE(10) as In} <br />
     * @return The value of vvvInDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.Date getVvvInDate() {
        return toUtilDate(_vvvInDate);
    }

    /**
     * [set] vvvInDate: {DATE(10) as In} <br />
     * @param vvvInDate The value of vvvInDate. (NullAllowed)
     */
    public void setVvvInDate(java.util.Date vvvInDate) {
        _vvvInDate = vvvInDate;
    }

    /**
     * [get] vvvOutTimestamp: {TIMESTAMP(26, 6) as Out} <br />
     * @return The value of vvvOutTimestamp. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getVvvOutTimestamp() {
        return _vvvOutTimestamp;
    }

    /**
     * [set] vvvOutTimestamp: {TIMESTAMP(26, 6) as Out} <br />
     * @param vvvOutTimestamp The value of vvvOutTimestamp. (NullAllowed)
     */
    public void setVvvOutTimestamp(java.sql.Timestamp vvvOutTimestamp) {
        _vvvOutTimestamp = vvvOutTimestamp;
    }
}
