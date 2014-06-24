package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVarrayManualParameter. <br />
 * This is related to "<span style="color: #AD4747">SP_VARRAY_MANUAL_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpVarrayManualParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInNumberArray_PROCEDURE_PARAMETER = "in, 0";
    public static final ValueType VInNumberArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("NUMBER_VARRAY", java.math.BigDecimal.class);
    public static final String VOutNumberArray_PROCEDURE_PARAMETER = "out, 1";
    public static final ValueType VOutNumberArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("NUMBER_VARRAY", java.math.BigDecimal.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInNumberArray: {VARRAY as In}. */
    protected List<java.math.BigDecimal> _vInNumberArray;

    /** The parameter of VOutNumberArray: {VARRAY as Out}. */
    protected List<java.math.BigDecimal> _vOutNumberArray;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVarrayManualParameter. <br />
     * This is related to "<span style="color: #AD4747">SP_VARRAY_MANUAL_PARAMETER</span>".
     */
    public BsSpVarrayManualParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_VARRAY_MANUAL_PARAMETER";
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
        sb.append(dm).append(_vInNumberArray);
        sb.append(dm).append(_vOutNumberArray);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInNumberArray: {VARRAY as In} <br />
     * @return The value of VInNumberArray. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<java.math.BigDecimal> getVInNumberArray() {
        return _vInNumberArray;
    }

    /**
     * [set] VInNumberArray: {VARRAY as In} <br />
     * @param vInNumberArray The value of VInNumberArray. (NullAllowed)
     */
    public void setVInNumberArray(List<java.math.BigDecimal> vInNumberArray) {
        _vInNumberArray = vInNumberArray;
    }

    /**
     * [get] VOutNumberArray: {VARRAY as Out} <br />
     * @return The value of VOutNumberArray. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<java.math.BigDecimal> getVOutNumberArray() {
        return _vOutNumberArray;
    }

    /**
     * [set] VOutNumberArray: {VARRAY as Out} <br />
     * @param vOutNumberArray The value of VOutNumberArray. (NullAllowed)
     */
    public void setVOutNumberArray(List<java.math.BigDecimal> vOutNumberArray) {
        _vOutNumberArray = vOutNumberArray;
    }
}
