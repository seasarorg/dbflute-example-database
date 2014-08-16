package com.example.dbflute.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpResultSetParameterMore. <br />
 * This is related to "<span style="color: #AD4747">sp_result_set_parameter_more</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpResultSetParameterMorePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String curMember_PROCEDURE_PARAMETER = "out, 0";
    public static final String curMemberStatus_PROCEDURE_PARAMETER = "out, 1";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of curMember: {refcursor as Out}. */
    protected List<SpResultSetParameterMoreCurMember> _curMember;

    /** The parameter of curMemberStatus: {refcursor as Out}. */
    protected List<SpResultSetParameterMoreCurMemberStatus> _curMemberStatus;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpResultSetParameterMore. <br />
     * This is related to "<span style="color: #AD4747">sp_result_set_parameter_more</span>".
     */
    public BsSpResultSetParameterMorePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "sp_result_set_parameter_more";
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
        sb.append(dm).append(_curMember);
        sb.append(dm).append(_curMemberStatus);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] curMember: {refcursor as Out} <br />
     * @return The value of curMember. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterMoreCurMember> getCurMember() {
        return _curMember;
    }

    /**
     * [set] curMember: {refcursor as Out} <br />
     * @param curMember The value of curMember. (NullAllowed)
     */
    public void setCurMember(List<SpResultSetParameterMoreCurMember> curMember) {
        _curMember = curMember;
    }

    /**
     * [get] curMemberStatus: {refcursor as Out} <br />
     * @return The value of curMemberStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterMoreCurMemberStatus> getCurMemberStatus() {
        return _curMemberStatus;
    }

    /**
     * [set] curMemberStatus: {refcursor as Out} <br />
     * @param curMemberStatus The value of curMemberStatus. (NullAllowed)
     */
    public void setCurMemberStatus(List<SpResultSetParameterMoreCurMemberStatus> curMemberStatus) {
        _curMemberStatus = curMemberStatus;
    }
}
