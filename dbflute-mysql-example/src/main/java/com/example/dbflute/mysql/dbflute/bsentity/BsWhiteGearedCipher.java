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
 * The entity of WHITE_GEARED_CIPHER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CIPHER_ID
 * 
 * [column]
 *     CIPHER_ID, CIPHER_INTEGER, CIPHER_VARCHAR, CIPHER_DATE, CIPHER_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     CIPHER_ID
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
 * Long cipherId = entity.getCipherId();
 * Integer cipherInteger = entity.getCipherInteger();
 * String cipherVarchar = entity.getCipherVarchar();
 * java.util.Date cipherDate = entity.getCipherDate();
 * java.sql.Timestamp cipherDatetime = entity.getCipherDatetime();
 * entity.setCipherId(cipherId);
 * entity.setCipherInteger(cipherInteger);
 * entity.setCipherVarchar(cipherVarchar);
 * entity.setCipherDate(cipherDate);
 * entity.setCipherDatetime(cipherDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGearedCipher extends AbstractEntity {

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
    /** CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _cipherId;

    /** CIPHER_INTEGER: {VARCHAR(100)} */
    protected Integer _cipherInteger;

    /** CIPHER_VARCHAR: {VARCHAR(100)} */
    protected String _cipherVarchar;

    /** CIPHER_DATE: {VARCHAR(100)} */
    protected java.util.Date _cipherDate;

    /** CIPHER_DATETIME: {VARCHAR(100)} */
    protected java.sql.Timestamp _cipherDatetime;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_geared_cipher";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteGearedCipher";
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
        if (getCipherId() == null) { return false; }
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
        if (obj instanceof BsWhiteGearedCipher) {
            BsWhiteGearedCipher other = (BsWhiteGearedCipher)obj;
            if (!xSV(_cipherId, other._cipherId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _cipherId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_cipherId));
        sb.append(dm).append(xfND(_cipherInteger));
        sb.append(dm).append(xfND(_cipherVarchar));
        sb.append(dm).append(xfUD(_cipherDate));
        sb.append(dm).append(xfND(_cipherDatetime));
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
    public WhiteGearedCipher clone() {
        return (WhiteGearedCipher)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'CIPHER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCipherId() {
        checkSpecifiedProperty("cipherId");
        return _cipherId;
    }

    /**
     * [set] CIPHER_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param cipherId The value of the column 'CIPHER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCipherId(Long cipherId) {
        registerModifiedProperty("cipherId");
        _cipherId = cipherId;
    }

    /**
     * [get] CIPHER_INTEGER: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCipherInteger() {
        checkSpecifiedProperty("cipherInteger");
        return _cipherInteger;
    }

    /**
     * [set] CIPHER_INTEGER: {VARCHAR(100)} <br />
     * @param cipherInteger The value of the column 'CIPHER_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherInteger(Integer cipherInteger) {
        registerModifiedProperty("cipherInteger");
        _cipherInteger = cipherInteger;
    }

    /**
     * [get] CIPHER_VARCHAR: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCipherVarchar() {
        checkSpecifiedProperty("cipherVarchar");
        return _cipherVarchar;
    }

    /**
     * [set] CIPHER_VARCHAR: {VARCHAR(100)} <br />
     * @param cipherVarchar The value of the column 'CIPHER_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherVarchar(String cipherVarchar) {
        registerModifiedProperty("cipherVarchar");
        _cipherVarchar = cipherVarchar;
    }

    /**
     * [get] CIPHER_DATE: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getCipherDate() {
        checkSpecifiedProperty("cipherDate");
        return _cipherDate;
    }

    /**
     * [set] CIPHER_DATE: {VARCHAR(100)} <br />
     * @param cipherDate The value of the column 'CIPHER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherDate(java.util.Date cipherDate) {
        registerModifiedProperty("cipherDate");
        _cipherDate = cipherDate;
    }

    /**
     * [get] CIPHER_DATETIME: {VARCHAR(100)} <br />
     * @return The value of the column 'CIPHER_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCipherDatetime() {
        checkSpecifiedProperty("cipherDatetime");
        return _cipherDatetime;
    }

    /**
     * [set] CIPHER_DATETIME: {VARCHAR(100)} <br />
     * @param cipherDatetime The value of the column 'CIPHER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCipherDatetime(java.sql.Timestamp cipherDatetime) {
        registerModifiedProperty("cipherDatetime");
        _cipherDatetime = cipherDatetime;
    }
}
