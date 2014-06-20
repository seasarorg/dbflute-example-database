/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.ProcedurePmb;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

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
    public static final String VInChar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "inout, 2";
    public static final String notParamResult1_PROCEDURE_PARAMETER = "notParamResult, 1000";
    public static final String notParamResult2_PROCEDURE_PARAMETER = "notParamResult, 1001";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInChar: {CHAR(3) as In}. */
    protected String _vInChar;

    /** The parameter of VOutVarchar: {VARCHAR(32) as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {VARCHAR(32) as InOut}. */
    protected String _vInoutVarchar;

    /** The parameter of notParamResult1. */
    protected List<SpReturnResultSetWithNotParamResult1> _notParamResult1;

    /** The parameter of notParamResult2. */
    protected List<SpReturnResultSetWithNotParamResult2> _notParamResult2;

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
        sb.append(dm).append(_vInChar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vInoutVarchar);
        sb.append(dm).append(_notParamResult1);
        sb.append(dm).append(_notParamResult2);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInChar: {CHAR(3) as In} <br />
     * @return The value of VInChar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInChar() {
        return filterStringParameter(_vInChar);
    }

    /**
     * [set] VInChar: {CHAR(3) as In} <br />
     * @param vInChar The value of VInChar. (NullAllowed)
     */
    public void setVInChar(String vInChar) {
        _vInChar = vInChar;
    }

    /**
     * [get] VOutVarchar: {VARCHAR(32) as Out} <br />
     * @return The value of VOutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
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
     * [get] VInoutVarchar: {VARCHAR(32) as InOut} <br />
     * @return The value of VInoutVarchar. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {VARCHAR(32) as InOut} <br />
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
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

    /**
     * [get] notParamResult2 <br />
     * @return The value of notParamResult2. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpReturnResultSetWithNotParamResult2> getNotParamResult2() {
        return _notParamResult2;
    }

    /**
     * [set] notParamResult2 <br />
     * @param notParamResult2 The value of notParamResult2. (NullAllowed)
     */
    public void setNotParamResult2(List<SpReturnResultSetWithNotParamResult2> notParamResult2) {
        _notParamResult2 = notParamResult2;
    }
}
