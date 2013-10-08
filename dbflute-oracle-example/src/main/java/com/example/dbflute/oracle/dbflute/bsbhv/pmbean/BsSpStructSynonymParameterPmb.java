package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpStructSynonymParameter. <br />
 * This is related to "<span style="color: #AD4747">SP_STRUCT_SYNONYM_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpStructSynonymParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInFooBean_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutFooBean_PROCEDURE_PARAMETER = "out, 1";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as In}. */
    protected Object _vInFooBean;

    /** The parameter of VOutFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as Out}. */
    protected Object _vOutFooBean;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpStructSynonymParameter. <br />
     * This is related to "<span style="color: #AD4747">SP_STRUCT_SYNONYM_PARAMETER</span>".
     */
    public BsSpStructSynonymParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_STRUCT_SYNONYM_PARAMETER";
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
    private String xbuildColumnString() {
        final String c = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(c).append(_vInFooBean);
        sb.append(c).append(_vOutFooBean);
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as In} <br />
     * @return The value of VInFooBean. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Object getVInFooBean() {
        return _vInFooBean;
    }

    /**
     * [set] VInFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as In} <br />
     * @param vInFooBean The value of VInFooBean. (NullAllowed)
     */
    public void setVInFooBean(Object vInFooBean) {
        _vInFooBean = vInFooBean;
    }

    /**
     * [get] VOutFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as Out} <br />
     * @return The value of VOutFooBean. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Object getVOutFooBean() {
        return _vOutFooBean;
    }

    /**
     * [set] VOutFooBean: {EXAMPLEDB.SYNONYM_FOO_BEAN as Out} <br />
     * @param vOutFooBean The value of VOutFooBean. (NullAllowed)
     */
    public void setVOutFooBean(Object vOutFooBean) {
        _vOutFooBean = vOutFooBean;
    }

}
