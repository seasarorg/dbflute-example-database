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
 * The entity of WHITE_IMPLICIT_CONV_STRING as TABLE. <br />
 * <pre>
 * [primary-key]
 *     IMPLICIT_CONV_STRING_ID
 * 
 * [column]
 *     IMPLICIT_CONV_STRING_ID, IMPLICIT_CONV_INTEGER_ID, IMPLICIT_CONV_NUMERIC_ID, IMPLICIT_CONV_NAME
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
 *     WHITE_IMPLICIT_CONV_INTEGER, WHITE_IMPLICIT_CONV_NUMERIC
 * 
 * [referrer table]
 *     white_implicit_conv_integer, white_implicit_conv_numeric
 * 
 * [foreign property]
 *     whiteImplicitConvInteger, whiteImplicitConvNumeric
 * 
 * [referrer property]
 *     whiteImplicitConvIntegerList, whiteImplicitConvNumericList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String implicitConvStringId = entity.getImplicitConvStringId();
 * String implicitConvIntegerId = entity.getImplicitConvIntegerId();
 * String implicitConvNumericId = entity.getImplicitConvNumericId();
 * String implicitConvName = entity.getImplicitConvName();
 * entity.setImplicitConvStringId(implicitConvStringId);
 * entity.setImplicitConvIntegerId(implicitConvIntegerId);
 * entity.setImplicitConvNumericId(implicitConvNumericId);
 * entity.setImplicitConvName(implicitConvName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitConvString extends AbstractEntity {

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
    /** IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} */
    protected String _implicitConvStringId;

    /** IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} */
    protected String _implicitConvIntegerId;

    /** IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} */
    protected String _implicitConvNumericId;

    /** IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)} */
    protected String _implicitConvName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_implicit_conv_string";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitConvString";
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
        if (getImplicitConvStringId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'. */
    protected WhiteImplicitConvInteger _whiteImplicitConvInteger;

    /**
     * [get] white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitConvInteger getWhiteImplicitConvInteger() {
        return _whiteImplicitConvInteger;
    }

    /**
     * [set] white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @param whiteImplicitConvInteger The entity of foreign property 'whiteImplicitConvInteger'. (NullAllowed)
     */
    public void setWhiteImplicitConvInteger(WhiteImplicitConvInteger whiteImplicitConvInteger) {
        _whiteImplicitConvInteger = whiteImplicitConvInteger;
    }

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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'. */
    protected List<WhiteImplicitConvInteger> _whiteImplicitConvIntegerList;

    /**
     * [get] white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * @return The entity list of referrer property 'whiteImplicitConvIntegerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvInteger> getWhiteImplicitConvIntegerList() {
        if (_whiteImplicitConvIntegerList == null) { _whiteImplicitConvIntegerList = newReferrerList(); }
        return _whiteImplicitConvIntegerList;
    }

    /**
     * [set] white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * @param whiteImplicitConvIntegerList The entity list of referrer property 'whiteImplicitConvIntegerList'. (NullAllowed)
     */
    public void setWhiteImplicitConvIntegerList(List<WhiteImplicitConvInteger> whiteImplicitConvIntegerList) {
        _whiteImplicitConvIntegerList = whiteImplicitConvIntegerList;
    }

    /** white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'. */
    protected List<WhiteImplicitConvNumeric> _whiteImplicitConvNumericList;

    /**
     * [get] white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * @return The entity list of referrer property 'whiteImplicitConvNumericList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteImplicitConvNumeric> getWhiteImplicitConvNumericList() {
        if (_whiteImplicitConvNumericList == null) { _whiteImplicitConvNumericList = newReferrerList(); }
        return _whiteImplicitConvNumericList;
    }

    /**
     * [set] white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * @param whiteImplicitConvNumericList The entity list of referrer property 'whiteImplicitConvNumericList'. (NullAllowed)
     */
    public void setWhiteImplicitConvNumericList(List<WhiteImplicitConvNumeric> whiteImplicitConvNumericList) {
        _whiteImplicitConvNumericList = whiteImplicitConvNumericList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteImplicitConvString) {
            BsWhiteImplicitConvString other = (BsWhiteImplicitConvString)obj;
            if (!xSV(_implicitConvStringId, other._implicitConvStringId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _implicitConvStringId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitConvInteger != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvInteger, "whiteImplicitConvInteger")); }
        if (_whiteImplicitConvNumeric != null)
        { sb.append(li).append(xbRDS(_whiteImplicitConvNumeric, "whiteImplicitConvNumeric")); }
        if (_whiteImplicitConvIntegerList != null) { for (WhiteImplicitConvInteger et : _whiteImplicitConvIntegerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvIntegerList")); } } }
        if (_whiteImplicitConvNumericList != null) { for (WhiteImplicitConvNumeric et : _whiteImplicitConvNumericList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteImplicitConvNumericList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_implicitConvStringId));
        sb.append(dm).append(xfND(_implicitConvIntegerId));
        sb.append(dm).append(xfND(_implicitConvNumericId));
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
        if (_whiteImplicitConvInteger != null)
        { sb.append(dm).append("whiteImplicitConvInteger"); }
        if (_whiteImplicitConvNumeric != null)
        { sb.append(dm).append("whiteImplicitConvNumeric"); }
        if (_whiteImplicitConvIntegerList != null && !_whiteImplicitConvIntegerList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvIntegerList"); }
        if (_whiteImplicitConvNumericList != null && !_whiteImplicitConvNumericList.isEmpty())
        { sb.append(dm).append("whiteImplicitConvNumericList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteImplicitConvString clone() {
        return (WhiteImplicitConvString)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br />
     * @return The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvStringId() {
        checkSpecifiedProperty("implicitConvStringId");
        return _implicitConvStringId;
    }

    /**
     * [set] IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)} <br />
     * @param implicitConvStringId The value of the column 'IMPLICIT_CONV_STRING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvStringId(String implicitConvStringId) {
        registerModifiedProperty("implicitConvStringId");
        _implicitConvStringId = implicitConvStringId;
    }

    /**
     * [get] IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @return The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvIntegerId() {
        checkSpecifiedProperty("implicitConvIntegerId");
        return _implicitConvIntegerId;
    }

    /**
     * [set] IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER} <br />
     * @param implicitConvIntegerId The value of the column 'IMPLICIT_CONV_INTEGER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvIntegerId(String implicitConvIntegerId) {
        registerModifiedProperty("implicitConvIntegerId");
        _implicitConvIntegerId = implicitConvIntegerId;
    }

    /**
     * [get] IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @return The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getImplicitConvNumericId() {
        checkSpecifiedProperty("implicitConvNumericId");
        return _implicitConvNumericId;
    }

    /**
     * [set] IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC} <br />
     * @param implicitConvNumericId The value of the column 'IMPLICIT_CONV_NUMERIC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImplicitConvNumericId(String implicitConvNumericId) {
        registerModifiedProperty("implicitConvNumericId");
        _implicitConvNumericId = implicitConvNumericId;
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
        registerModifiedProperty("implicitConvName");
        _implicitConvName = implicitConvName;
    }
}
