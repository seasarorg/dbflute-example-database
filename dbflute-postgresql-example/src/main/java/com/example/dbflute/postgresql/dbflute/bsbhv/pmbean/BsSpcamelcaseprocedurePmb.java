package com.example.dbflute.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.postgresql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of Spcamelcaseprocedure. <br />
 * This is related to "<span style="color: #AD4747">spcamelcaseprocedure</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpcamelcaseprocedurePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String fooparam_PROCEDURE_PARAMETER = "in, 0";
    public static final String barparam_PROCEDURE_PARAMETER = "in, 1";
    public static final String vdonparam_PROCEDURE_PARAMETER = "out, 2";
    public static final String vheeparam_PROCEDURE_PARAMETER = "in, 3";
    public static final String pooParamname_PROCEDURE_PARAMETER = "out, 4";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of fooparam: {varchar as In}. */
    protected String _fooparam;

    /** The parameter of barparam: {varchar as In}. */
    protected String _barparam;

    /** The parameter of vdonparam: {varchar as Out}. */
    protected String _vdonparam;

    /** The parameter of vheeparam: {varchar as In}. */
    protected String _vheeparam;

    /** The parameter of pooParamname: {varchar as Out}. */
    protected String _pooParamname;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of Spcamelcaseprocedure. <br />
     * This is related to "<span style="color: #AD4747">spcamelcaseprocedure</span>".
     */
    public BsSpcamelcaseprocedurePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "spcamelcaseprocedure";
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
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) {
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) {
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
    private String xbuildColumnString() {
        final String c = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(c).append(_fooparam);
        sb.append(c).append(_barparam);
        sb.append(c).append(_vdonparam);
        sb.append(c).append(_vheeparam);
        sb.append(c).append(_pooParamname);
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fooparam: {varchar as In} <br />
     * @return The value of fooparam. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getFooparam() {
        return filterStringParameter(_fooparam);
    }

    /**
     * [set] fooparam: {varchar as In} <br />
     * @param fooparam The value of fooparam. (NullAllowed)
     */
    public void setFooparam(String fooparam) {
        _fooparam = fooparam;
    }

    /**
     * [get] barparam: {varchar as In} <br />
     * @return The value of barparam. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBarparam() {
        return filterStringParameter(_barparam);
    }

    /**
     * [set] barparam: {varchar as In} <br />
     * @param barparam The value of barparam. (NullAllowed)
     */
    public void setBarparam(String barparam) {
        _barparam = barparam;
    }

    /**
     * [get] vdonparam: {varchar as Out} <br />
     * @return The value of vdonparam. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVdonparam() {
        return filterStringParameter(_vdonparam);
    }

    /**
     * [set] vdonparam: {varchar as Out} <br />
     * @param vdonparam The value of vdonparam. (NullAllowed)
     */
    public void setVdonparam(String vdonparam) {
        _vdonparam = vdonparam;
    }

    /**
     * [get] vheeparam: {varchar as In} <br />
     * @return The value of vheeparam. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVheeparam() {
        return filterStringParameter(_vheeparam);
    }

    /**
     * [set] vheeparam: {varchar as In} <br />
     * @param vheeparam The value of vheeparam. (NullAllowed)
     */
    public void setVheeparam(String vheeparam) {
        _vheeparam = vheeparam;
    }

    /**
     * [get] pooParamname: {varchar as Out} <br />
     * @return The value of pooParamname. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPooParamname() {
        return filterStringParameter(_pooParamname);
    }

    /**
     * [set] pooParamname: {varchar as Out} <br />
     * @param pooParamname The value of pooParamname. (NullAllowed)
     */
    public void setPooParamname(String pooParamname) {
        _pooParamname = pooParamname;
    }

}
