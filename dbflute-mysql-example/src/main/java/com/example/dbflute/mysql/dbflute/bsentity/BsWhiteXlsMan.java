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
 * The entity of WHITE_XLS_MAN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     XLS_MAN_ID
 * 
 * [column]
 *     XLS_MAN_ID, STRING_CONVERTED, TIMESTAMP_CONVERTED
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     XLS_MAN_ID
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
 * Long xlsManId = entity.getXlsManId();
 * String stringConverted = entity.getStringConverted();
 * java.sql.Timestamp timestampConverted = entity.getTimestampConverted();
 * entity.setXlsManId(xlsManId);
 * entity.setStringConverted(stringConverted);
 * entity.setTimestampConverted(timestampConverted);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsMan extends AbstractEntity {

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
    /** XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _xlsManId;

    /** STRING_CONVERTED: {VARCHAR(200)} */
    protected String _stringConverted;

    /** TIMESTAMP_CONVERTED: {DATETIME(19)} */
    protected java.sql.Timestamp _timestampConverted;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_xls_man";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteXlsMan";
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
        if (getXlsManId() == null) { return false; }
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
        if (obj instanceof BsWhiteXlsMan) {
            BsWhiteXlsMan other = (BsWhiteXlsMan)obj;
            if (!xSV(_xlsManId, other._xlsManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _xlsManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_xlsManId));
        sb.append(dm).append(xfND(_stringConverted));
        sb.append(dm).append(xfND(_timestampConverted));
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
    public WhiteXlsMan clone() {
        return (WhiteXlsMan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'XLS_MAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getXlsManId() {
        checkSpecifiedProperty("xlsManId");
        return _xlsManId;
    }

    /**
     * [set] XLS_MAN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param xlsManId The value of the column 'XLS_MAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setXlsManId(Long xlsManId) {
        __modifiedProperties.addPropertyName("xlsManId");
        _xlsManId = xlsManId;
    }

    /**
     * [get] STRING_CONVERTED: {VARCHAR(200)} <br />
     * @return The value of the column 'STRING_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        checkSpecifiedProperty("stringConverted");
        return _stringConverted;
    }

    /**
     * [set] STRING_CONVERTED: {VARCHAR(200)} <br />
     * @param stringConverted The value of the column 'STRING_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        __modifiedProperties.addPropertyName("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] TIMESTAMP_CONVERTED: {DATETIME(19)} <br />
     * @return The value of the column 'TIMESTAMP_CONVERTED'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampConverted() {
        checkSpecifiedProperty("timestampConverted");
        return _timestampConverted;
    }

    /**
     * [set] TIMESTAMP_CONVERTED: {DATETIME(19)} <br />
     * @param timestampConverted The value of the column 'TIMESTAMP_CONVERTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampConverted(java.sql.Timestamp timestampConverted) {
        __modifiedProperties.addPropertyName("timestampConverted");
        _timestampConverted = timestampConverted;
    }
}
