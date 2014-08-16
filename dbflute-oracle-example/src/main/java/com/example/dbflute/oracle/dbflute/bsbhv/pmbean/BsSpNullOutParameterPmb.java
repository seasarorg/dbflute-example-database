package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpNullOutParameter. <br />
 * This is related to "<span style="color: #AD4747">SP_NULL_OUT_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpNullOutParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 0";
    public static final String VOutInteger_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutNumber_PROCEDURE_PARAMETER = "out, 2";
    public static final String VOutDate_PROCEDURE_PARAMETER = "out, 3";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VOutVarchar: {VARCHAR2 as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VOutInteger: {NUMBER(38) as Out}. */
    protected java.math.BigDecimal _vOutInteger;

    /** The parameter of VOutNumber: {NUMBER(22) as Out}. */
    protected java.math.BigDecimal _vOutNumber;

    /** The parameter of VOutDate: {DATE as Out}. */
    protected java.util.Date _vOutDate;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpNullOutParameter. <br />
     * This is related to "<span style="color: #AD4747">SP_NULL_OUT_PARAMETER</span>".
     */
    public BsSpNullOutParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_NULL_OUT_PARAMETER";
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
        return ShortCharHandlingMode.RFILL;
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
        String pattern = "yyyy-MM-dd HH:mm:ss"; // for Oracle
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
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vOutInteger);
        sb.append(dm).append(_vOutNumber);
        sb.append(dm).append(formatUtilDate(_vOutDate));
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VOutVarchar: {VARCHAR2 as Out} <br />
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {VARCHAR2 as Out} <br />
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VOutInteger: {NUMBER(38) as Out} <br />
     * @return The value of VOutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVOutInteger() {
        return _vOutInteger;
    }

    /**
     * [set] VOutInteger: {NUMBER(38) as Out} <br />
     * @param vOutInteger The value of VOutInteger. (NullAllowed)
     */
    public void setVOutInteger(java.math.BigDecimal vOutInteger) {
        _vOutInteger = vOutInteger;
    }

    /**
     * [get] VOutNumber: {NUMBER(22) as Out} <br />
     * @return The value of VOutNumber. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVOutNumber() {
        return _vOutNumber;
    }

    /**
     * [set] VOutNumber: {NUMBER(22) as Out} <br />
     * @param vOutNumber The value of VOutNumber. (NullAllowed)
     */
    public void setVOutNumber(java.math.BigDecimal vOutNumber) {
        _vOutNumber = vOutNumber;
    }

    /**
     * [get] VOutDate: {DATE as Out} <br />
     * @return The value of VOutDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.Date getVOutDate() {
        return toUtilDate(_vOutDate);
    }

    /**
     * [set] VOutDate: {DATE as Out} <br />
     * @param vOutDate The value of VOutDate. (NullAllowed)
     */
    public void setVOutDate(java.util.Date vOutDate) {
        _vOutDate = vOutDate;
    }
}
