package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpResultSetParameterWith. <br />
 * This is related to "<span style="color: #AD4747">SP_RESULT_SET_PARAMETER_WITH</span>".
 * @author oracleman
 */
public class BsSpResultSetParameterWithPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String curMember_PROCEDURE_PARAMETER = "out, 0";
    public static final String curMemberStatus_PROCEDURE_PARAMETER = "out, 1";
    public static final String VInChar_PROCEDURE_PARAMETER = "in, 2";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 3";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "inout, 4";
    public static final String VInNumber_PROCEDURE_PARAMETER = "in, 5";
    public static final String VInDate_PROCEDURE_PARAMETER = "in, 6";
    public static final String VInTimestamp_PROCEDURE_PARAMETER = "in, 7";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of curMember: {REF CURSOR as Out}. */
    protected List<SpResultSetParameterWithCurMember> _curMember;

    /** The parameter of curMemberStatus: {REF CURSOR as Out}. */
    protected List<SpResultSetParameterWithCurMemberStatus> _curMemberStatus;

    /** The parameter of VInChar: {CHAR as In}. */
    protected String _vInChar;

    /** The parameter of VOutVarchar: {VARCHAR2 as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {VARCHAR2 as InOut}. */
    protected String _vInoutVarchar;

    /** The parameter of VInNumber: {NUMBER(22) as In}. */
    protected java.math.BigDecimal _vInNumber;

    /** The parameter of VInDate: {DATE as In}. */
    protected java.util.Date _vInDate;

    /** The parameter of VInTimestamp: {TIMESTAMP(6) as In}. */
    protected java.sql.Timestamp _vInTimestamp;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpResultSetParameterWith. <br />
     * This is related to "<span style="color: #AD4747">SP_RESULT_SET_PARAMETER_WITH</span>".
     */
    public BsSpResultSetParameterWithPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_RESULT_SET_PARAMETER_WITH";
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
        sb.append(dm).append(_curMember);
        sb.append(dm).append(_curMemberStatus);
        sb.append(dm).append(_vInChar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vInoutVarchar);
        sb.append(dm).append(_vInNumber);
        sb.append(dm).append(formatUtilDate(_vInDate));
        sb.append(dm).append(_vInTimestamp);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] curMember: {REF CURSOR as Out} <br />
     * @return The value of curMember. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterWithCurMember> getCurMember() {
        return _curMember;
    }

    /**
     * [set] curMember: {REF CURSOR as Out} <br />
     * @param curMember The value of curMember. (NullAllowed)
     */
    public void setCurMember(List<SpResultSetParameterWithCurMember> curMember) {
        _curMember = curMember;
    }

    /**
     * [get] curMemberStatus: {REF CURSOR as Out} <br />
     * @return The value of curMemberStatus. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterWithCurMemberStatus> getCurMemberStatus() {
        return _curMemberStatus;
    }

    /**
     * [set] curMemberStatus: {REF CURSOR as Out} <br />
     * @param curMemberStatus The value of curMemberStatus. (NullAllowed)
     */
    public void setCurMemberStatus(List<SpResultSetParameterWithCurMemberStatus> curMemberStatus) {
        _curMemberStatus = curMemberStatus;
    }

    /**
     * [get] VInChar: {CHAR as In} <br />
     * @return The value of VInChar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInChar() {
        return filterStringParameter(_vInChar);
    }

    /**
     * [set] VInChar: {CHAR as In} <br />
     * @param vInChar The value of VInChar. (NullAllowed)
     */
    public void setVInChar(String vInChar) {
        _vInChar = vInChar;
    }

    /**
     * [get] VOutVarchar: {VARCHAR2 as Out} <br />
     * @return The value of VOutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
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
     * [get] VInoutVarchar: {VARCHAR2 as InOut} <br />
     * @return The value of VInoutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {VARCHAR2 as InOut} <br />
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
    }

    /**
     * [get] VInNumber: {NUMBER(22) as In} <br />
     * @return The value of VInNumber. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVInNumber() {
        return _vInNumber;
    }

    /**
     * [set] VInNumber: {NUMBER(22) as In} <br />
     * @param vInNumber The value of VInNumber. (NullAllowed)
     */
    public void setVInNumber(java.math.BigDecimal vInNumber) {
        _vInNumber = vInNumber;
    }

    /**
     * [get] VInDate: {DATE as In} <br />
     * @return The value of VInDate. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.Date getVInDate() {
        return toUtilDate(_vInDate);
    }

    /**
     * [set] VInDate: {DATE as In} <br />
     * @param vInDate The value of VInDate. (NullAllowed)
     */
    public void setVInDate(java.util.Date vInDate) {
        _vInDate = vInDate;
    }

    /**
     * [get] VInTimestamp: {TIMESTAMP(6) as In} <br />
     * @return The value of VInTimestamp. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getVInTimestamp() {
        return _vInTimestamp;
    }

    /**
     * [set] VInTimestamp: {TIMESTAMP(6) as In} <br />
     * @param vInTimestamp The value of VInTimestamp. (NullAllowed)
     */
    public void setVInTimestamp(java.sql.Timestamp vInTimestamp) {
        _vInTimestamp = vInTimestamp;
    }
}
