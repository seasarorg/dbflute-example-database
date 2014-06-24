package com.example.dbflute.oracle.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.oracle.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpTableVariousParameter. <br />
 * This is related to "<span style="color: #AD4747">SP_TABLE_VARIOUS_PARAMETER</span>".
 * @author oracleman
 */
public class BsSpTableVariousParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInClobArray_PROCEDURE_PARAMETER = "in, 0";
    public static final ValueType VInClobArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("CLOB_TABLE", String.class);
    public static final String VOutClobArray_PROCEDURE_PARAMETER = "out, 1";
    public static final ValueType VOutClobArray_VALUE_TYPE
            = new DBFluteConfig.ImplementedOracleArrayType
                  ("CLOB_TABLE", String.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInClobArray: {TABLE as In}. */
    protected List<String> _vInClobArray;

    /** The parameter of VOutClobArray: {TABLE as Out}. */
    protected List<String> _vOutClobArray;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpTableVariousParameter. <br />
     * This is related to "<span style="color: #AD4747">SP_TABLE_VARIOUS_PARAMETER</span>".
     */
    public BsSpTableVariousParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() {
        return "SP_TABLE_VARIOUS_PARAMETER";
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
        sb.append(dm).append(_vInClobArray);
        sb.append(dm).append(_vOutClobArray);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInClobArray: {TABLE as In} <br />
     * @return The value of VInClobArray. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getVInClobArray() {
        return _vInClobArray;
    }

    /**
     * [set] VInClobArray: {TABLE as In} <br />
     * @param vInClobArray The value of VInClobArray. (NullAllowed)
     */
    public void setVInClobArray(List<String> vInClobArray) {
        _vInClobArray = vInClobArray;
    }

    /**
     * [get] VOutClobArray: {TABLE as Out} <br />
     * @return The value of VOutClobArray. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getVOutClobArray() {
        return _vOutClobArray;
    }

    /**
     * [set] VOutClobArray: {TABLE as Out} <br />
     * @param vOutClobArray The value of VOutClobArray. (NullAllowed)
     */
    public void setVOutClobArray(List<String> vOutClobArray) {
        _vOutClobArray = vOutClobArray;
    }
}
