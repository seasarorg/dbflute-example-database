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
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_COMPOUND_PK_REF_MANY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 * 
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, REF_MANY_CODE, REF_MANY_NAME, REF_MANY_DATETIME
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
 *     WHITE_COMPOUND_PK(ToPK)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPkToPK
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refManyFirstId = entity.getRefManyFirstId();
 * Integer refManySecondId = entity.getRefManySecondId();
 * String refManyCode = entity.getRefManyCode();
 * String refManyName = entity.getRefManyName();
 * java.sql.Timestamp refManyDatetime = entity.getRefManyDatetime();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefManyFirstId(refManyFirstId);
 * entity.setRefManySecondId(refManySecondId);
 * entity.setRefManyCode(refManyCode);
 * entity.setRefManyName(refManyName);
 * entity.setRefManyDatetime(refManyDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefMany extends AbstractEntity implements DomainEntity {

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
    /** MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleFirstId;

    /** MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleSecondId;

    /** REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} */
    protected Integer _refManyFirstId;

    /** REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} */
    protected Integer _refManySecondId;

    /** REF_MANY_CODE: {NotNull, CHAR(3)} */
    protected String _refManyCode;

    /** REF_MANY_NAME: {NotNull, VARCHAR(50)} */
    protected String _refManyName;

    /** REF_MANY_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _refManyDatetime;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk_ref_many";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRefMany";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'. */
    protected WhiteCompoundPk _whiteCompoundPkToPK;

    /**
     * [get] white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @return The entity of foreign property 'whiteCompoundPkToPK'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPkToPK() {
        return _whiteCompoundPkToPK;
    }

    /**
     * [set] white_compound_pk by my REF_MANY_FIRST_ID, REF_MANY_SECOND_ID, named 'whiteCompoundPkToPK'.
     * @param whiteCompoundPkToPK The entity of foreign property 'whiteCompoundPkToPK'. (NullAllowed)
     */
    public void setWhiteCompoundPkToPK(WhiteCompoundPk whiteCompoundPkToPK) {
        _whiteCompoundPkToPK = whiteCompoundPkToPK;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundPkRefMany) {
            BsWhiteCompoundPkRefMany other = (BsWhiteCompoundPkRefMany)obj;
            if (!xSV(_multipleFirstId, other._multipleFirstId)) { return false; }
            if (!xSV(_multipleSecondId, other._multipleSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _multipleFirstId);
        hs = xCH(hs, _multipleSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkToPK != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPkToPK, "whiteCompoundPkToPK")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_multipleFirstId));
        sb.append(dm).append(xfND(_multipleSecondId));
        sb.append(dm).append(xfND(_refManyFirstId));
        sb.append(dm).append(xfND(_refManySecondId));
        sb.append(dm).append(xfND(_refManyCode));
        sb.append(dm).append(xfND(_refManyName));
        sb.append(dm).append(xfND(_refManyDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkToPK != null)
        { sb.append(dm).append("whiteCompoundPkToPK"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRefMany clone() {
        return (WhiteCompoundPkRefMany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        checkSpecifiedProperty("multipleFirstId");
        return _multipleFirstId;
    }

    /**
     * [set] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleFirstId The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        registerModifiedProperty("multipleFirstId");
        _multipleFirstId = multipleFirstId;
    }

    /**
     * [get] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        checkSpecifiedProperty("multipleSecondId");
        return _multipleSecondId;
    }

    /**
     * [set] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleSecondId The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        registerModifiedProperty("multipleSecondId");
        _multipleSecondId = multipleSecondId;
    }

    /**
     * [get] REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @return The value of the column 'REF_MANY_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefManyFirstId() {
        checkSpecifiedProperty("refManyFirstId");
        return _refManyFirstId;
    }

    /**
     * [set] REF_MANY_FIRST_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @param refManyFirstId The value of the column 'REF_MANY_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyFirstId(Integer refManyFirstId) {
        registerModifiedProperty("refManyFirstId");
        _refManyFirstId = refManyFirstId;
    }

    /**
     * [get] REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @return The value of the column 'REF_MANY_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefManySecondId() {
        checkSpecifiedProperty("refManySecondId");
        return _refManySecondId;
    }

    /**
     * [set] REF_MANY_SECOND_ID: {NotNull, INT(10), FK to WHITE_COMPOUND_PK} <br />
     * @param refManySecondId The value of the column 'REF_MANY_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefManySecondId(Integer refManySecondId) {
        registerModifiedProperty("refManySecondId");
        _refManySecondId = refManySecondId;
    }

    /**
     * [get] REF_MANY_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'REF_MANY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getRefManyCode() {
        checkSpecifiedProperty("refManyCode");
        return _refManyCode;
    }

    /**
     * [set] REF_MANY_CODE: {NotNull, CHAR(3)} <br />
     * @param refManyCode The value of the column 'REF_MANY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyCode(String refManyCode) {
        registerModifiedProperty("refManyCode");
        _refManyCode = refManyCode;
    }

    /**
     * [get] REF_MANY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REF_MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefManyName() {
        checkSpecifiedProperty("refManyName");
        return _refManyName;
    }

    /**
     * [set] REF_MANY_NAME: {NotNull, VARCHAR(50)} <br />
     * @param refManyName The value of the column 'REF_MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyName(String refManyName) {
        registerModifiedProperty("refManyName");
        _refManyName = refManyName;
    }

    /**
     * [get] REF_MANY_DATETIME: {NotNull, DATETIME(19)} <br />
     * @return The value of the column 'REF_MANY_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRefManyDatetime() {
        checkSpecifiedProperty("refManyDatetime");
        return _refManyDatetime;
    }

    /**
     * [set] REF_MANY_DATETIME: {NotNull, DATETIME(19)} <br />
     * @param refManyDatetime The value of the column 'REF_MANY_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRefManyDatetime(java.sql.Timestamp refManyDatetime) {
        registerModifiedProperty("refManyDatetime");
        _refManyDatetime = refManyDatetime;
    }
}
