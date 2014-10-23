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
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_IMPLICIT_CONV_INTEGER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     IMPLICIT_CONV_INTEGER_ID
 * 
 * [column]
 *     IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     WHITE_IMPLICIT_CONV_NUMERIC, WHITE_IMPLICIT_CONV_STRING
 * 
 * [referrer table]
 *     white_implicit_conv_numeric, white_implicit_conv_string
 * 
 * [foreign property]
 *     whiteImplicitConvNumeric, whiteImplicitConvString
 * 
 * [referrer property]
 *     whiteImplicitConvNumericList, whiteImplicitConvStringList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer implicitConvIntegerId = entity.getImplicitConvIntegerId();
 * Integer implicitConvNumericId = entity.getImplicitConvNumericId();
 * Integer implicitConvStringId = entity.getImplicitConvStringId();
 * String implicitConvName = entity.getImplicitConvName();
 * entity.setImplicitConvIntegerId(implicitConvIntegerId);
 * entity.setImplicitConvNumericId(implicitConvNumericId);
 * entity.setImplicitConvStringId(implicitConvStringId);
 * entity.setImplicitConvName(implicitConvName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvInteger extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)} */
    protected Integer _implicitConvIntegerId;

    /** IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} */
    protected Integer _implicitConvNumericId;

    /** IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING} */
    protected Integer _implicitConvStringId;

    /** IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} */
    protected String _implicitConvName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_implicit_conv_integer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitConvInteger";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getImplicitConvIntegerId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'. */
    protected WhiteImplicitConvNumeric _whiteImplicitConvNumeric;

    /**
     * [get] white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The entity of foreign property 'whiteImplicitConvNumeric'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvNumeric getWhiteImplicitConvNumeric() {
        return _whiteImplicitConvNumeric;
    }

    /**
     * [set] white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @param whiteImplicitConvNumeric The entity of foreign property 'whiteImplicitConvNumeric'. (NullAllowed)
     */
    public void setWhiteImplicitConvNumeric(WhiteImplicitConvNumeric whiteImplicitConvNumeric) {
        _whiteImplicitConvNumeric = whiteImplicitConvNumeric;
    }

    /** white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'. */
    protected WhiteImplicitConvString _whiteImplicitConvString;

    /**
     * [get] white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @return The entity of foreign property 'whiteImplicitConvString'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvString getWhiteImplicitConvString() {
        return _whiteImplicitConvString;
    }

    /**
     * [set] white_implicit_conv_string by my IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvString'.
     * @param whiteImplicitConvString The entity of foreign property 'whiteImplicitConvString'. (NullAllowed)
     */
    public void setWhiteImplicitConvString(WhiteImplicitConvString whiteImplicitConvString) {
        _whiteImplicitConvString = whiteImplicitConvString;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'. */
    protected List<WhiteImplicitConvNumeric> _whiteImplicitConvNumericList;

    /**
     * [get] white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * @return The entity list of referrer property 'whiteImplicitConvNumericList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvNumeric> getWhiteImplicitConvNumericList() {
        if (_whiteImplicitConvNumericList == null) { _whiteImplicitConvNumericList = newReferrerList(); }
        return _whiteImplicitConvNumericList;
    }

    /**
     * [set] white_implicit_conv_numeric by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvNumericList'.
     * @param whiteImplicitConvNumericList The entity list of referrer property 'whiteImplicitConvNumericList'. (NullAllowed)
     */
    public void setWhiteImplicitConvNumericList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        _whiteImplicitConvNumericList = whiteImplicitConvNumericList;
    }

    /** white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'. */
    protected List<WhiteImplicitConvString> _whiteImplicitConvStringList;

    /**
     * [get] white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * @return The entity list of referrer property 'whiteImplicitConvStringList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvString> getWhiteImplicitConvStringList() {
        if (_whiteImplicitConvStringList == null) { _whiteImplicitConvStringList = newReferrerList(); }
        return _whiteImplicitConvStringList;
    }

    /**
     * [set] white_implicit_conv_string by IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvStringList'.
     * @param whiteImplicitConvStringList The entity list of referrer property 'whiteImplicitConvStringList'. (NullAllowed)
     */
    public void setWhiteImplicitConvStringList(List<WhiteImplicitConvString> whiteImplicitConvStringList) {
        _whiteImplicitConvStringList = whiteImplicitConvStringList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteImplicitConvInteger) {
            BsWhiteImplicitConvInteger other = (BsWhiteImplicitConvInteger)obj;
            if (!xSV(_implicitConvIntegerId, other._implicitConvIntegerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _implicitConvIntegerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitConvNumeric != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvNumeric, "whiteImplicitConvNumeric")); }
        if (_whiteImplicitConvString != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvString, "whiteImplicitConvString")); }
        if (_whiteImplicitConvNumericList != null) { for (WhiteImplicitConvNumeric et : _whiteImplicitConvNumericList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvNumericList")); } } }
        if (_whiteImplicitConvStringList != null) { for (WhiteImplicitConvString et : _whiteImplicitConvStringList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvStringList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_implicitConvIntegerId));
        sb.append(dm).append(xfND(_implicitConvNumericId));
        sb.append(dm).append(xfND(_implicitConvStringId));
        sb.append(dm).append(xfND(_implicitConvName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitConvNumeric != null) { sb.append(dm).append("whiteImplicitConvNumeric"); }
        if (_whiteImplicitConvString != null) { sb.append(dm).append("whiteImplicitConvString"); }
        if (_whiteImplicitConvNumericList != null && !_whiteImplicitConvNumericList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvNumericList"); }
        if (_whiteImplicitConvStringList != null && !_whiteImplicitConvStringList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvStringList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteImplicitConvInteger clone() {
        return (WhiteImplicitConvInteger)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getImplicitConvIntegerId() {
        checkSpecifiedProperty("implicitConvIntegerId");
        return _implicitConvIntegerId;
    }

    /**
     * [set] IMPLICIT_CONV_INTEGER_ID: {PK, NotNull, INT(10)} <br />
     * @param implicitConvIntegerId The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvIntegerId(Integer implicitConvIntegerId) {
        __modifiedProperties.addPropertyName("implicitConvIntegerId");
        _implicitConvIntegerId = implicitConvIntegerId;
    }

    /**
     * [get] IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @return The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getImplicitConvNumericId() {
        checkSpecifiedProperty("implicitConvNumericId");
        return _implicitConvNumericId;
    }

    /**
     * [set] IMPLICIT_CONV_NUMERIC_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @param implicitConvNumericId The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvNumericId(Integer implicitConvNumericId) {
        __modifiedProperties.addPropertyName("implicitConvNumericId");
        _implicitConvNumericId = implicitConvNumericId;
    }

    /**
     * [get] IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING} <br />
     * @return The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getImplicitConvStringId() {
        checkSpecifiedProperty("implicitConvStringId");
        return _implicitConvStringId;
    }

    /**
     * [set] IMPLICIT_CONV_STRING_ID: {NotNull, INT(10), FK to WHITE_IMPLICIT_CONV_STRING} <br />
     * @param implicitConvStringId The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvStringId(Integer implicitConvStringId) {
        __modifiedProperties.addPropertyName("implicitConvStringId");
        _implicitConvStringId = implicitConvStringId;
    }

    /**
     * [get] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvName() {
        checkSpecifiedProperty("implicitConvName");
        return _implicitConvName;
    }

    /**
     * [set] IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} <br />
     * @param implicitConvName The value of the column 'IMPLICIT_CONV_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvName(String implicitConvName) {
        __modifiedProperties.addPropertyName("implicitConvName");
        _implicitConvName = implicitConvName;
    }
}
