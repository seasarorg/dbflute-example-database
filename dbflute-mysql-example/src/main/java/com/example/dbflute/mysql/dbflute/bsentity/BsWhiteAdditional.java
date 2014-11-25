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
 * The entity of (WXADD)WHITE_ADDITIONAL as TABLE. <br />
 * test table for additionalTable
 * <pre>
 * [primary-key]
 *     foo_id
 * 
 * [column]
 *     foo_id, foo_name, foo_date, register_datetime
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     foo_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.util.Date fooDate = entity.getFooDate();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDate(fooDate);
 * entity.setRegisterDatetime(registerDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAdditional extends AbstractEntity implements DomainEntity {

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
    /** foo_id: {PK, ID, NotNull, INTEGER} */
    protected Integer _fooId;

    /** (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} */
    protected String _fooName;

    /** foo_date: {UnknownType} */
    protected java.util.Date _fooDate;

    /** register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _registerDatetime;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_additional";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteAdditional";
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
        if (getFooId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteAdditional) {
            BsWhiteAdditional other = (BsWhiteAdditional)obj;
            if (!xSV(_fooId, other._fooId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _fooId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooId));
        sb.append(dm).append(xfND(_fooName));
        sb.append(dm).append(xfUD(_fooDate));
        sb.append(dm).append(xfND(_registerDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteAdditional clone() {
        return (WhiteAdditional)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] foo_id: {PK, ID, NotNull, INTEGER} <br />
     * @return The value of the column 'foo_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFooId() {
        checkSpecifiedProperty("fooId");
        return _fooId;
    }

    /**
     * [set] foo_id: {PK, ID, NotNull, INTEGER} <br />
     * @param fooId The value of the column 'foo_id'. (basically NotNull if update: for the constraint)
     */
    public void setFooId(Integer fooId) {
        registerModifiedProperty("fooId");
        _fooId = fooId;
    }

    /**
     * [get] (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} <br />
     * It's joke!
     * @return The value of the column 'foo_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFooName() {
        checkSpecifiedProperty("fooName");
        return _fooName;
    }

    /**
     * [set] (Mr.FOO's name)foo_name: {NotNull, UnknownType(123)} <br />
     * It's joke!
     * @param fooName The value of the column 'foo_name'. (basically NotNull if update: for the constraint)
     */
    public void setFooName(String fooName) {
        registerModifiedProperty("fooName");
        _fooName = fooName;
    }

    /**
     * [get] foo_date: {UnknownType} <br />
     * @return The value of the column 'foo_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getFooDate() {
        checkSpecifiedProperty("fooDate");
        return _fooDate;
    }

    /**
     * [set] foo_date: {UnknownType} <br />
     * @param fooDate The value of the column 'foo_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDate(java.util.Date fooDate) {
        registerModifiedProperty("fooDate");
        _fooDate = fooDate;
    }

    /**
     * [get] register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'register_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {DATETIME, default=[CURRENT_TIMESTAMP]} <br />
     * @param registerDatetime The value of the column 'register_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }
}
