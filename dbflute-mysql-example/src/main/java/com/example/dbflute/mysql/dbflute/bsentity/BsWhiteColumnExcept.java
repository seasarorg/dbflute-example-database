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
 * The entity of WHITE_COLUMN_EXCEPT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     EXCEPT_COLUMN_ID
 * 
 * [column]
 *     EXCEPT_COLUMN_ID, COLUMN_EXCEPT_TEST
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
 * Long exceptColumnId = entity.getExceptColumnId();
 * Integer columnExceptTest = entity.getColumnExceptTest();
 * entity.setExceptColumnId(exceptColumnId);
 * entity.setColumnExceptTest(columnExceptTest);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteColumnExcept extends AbstractEntity {

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
    /** EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _exceptColumnId;

    /** COLUMN_EXCEPT_TEST: {INT(10)} */
    protected Integer _columnExceptTest;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_column_except";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteColumnExcept";
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
        if (getExceptColumnId() == null) { return false; }
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
        if (obj instanceof BsWhiteColumnExcept) {
            BsWhiteColumnExcept other = (BsWhiteColumnExcept)obj;
            if (!xSV(_exceptColumnId, other._exceptColumnId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _exceptColumnId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_exceptColumnId));
        sb.append(dm).append(xfND(_columnExceptTest));
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
    public WhiteColumnExcept clone() {
        return (WhiteColumnExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'EXCEPT_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptColumnId() {
        checkSpecifiedProperty("exceptColumnId");
        return _exceptColumnId;
    }

    /**
     * [set] EXCEPT_COLUMN_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param exceptColumnId The value of the column 'EXCEPT_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptColumnId(Long exceptColumnId) {
        __modifiedProperties.addPropertyName("exceptColumnId");
        _exceptColumnId = exceptColumnId;
    }

    /**
     * [get] COLUMN_EXCEPT_TEST: {INT(10)} <br />
     * @return The value of the column 'COLUMN_EXCEPT_TEST'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getColumnExceptTest() {
        checkSpecifiedProperty("columnExceptTest");
        return _columnExceptTest;
    }

    /**
     * [set] COLUMN_EXCEPT_TEST: {INT(10)} <br />
     * @param columnExceptTest The value of the column 'COLUMN_EXCEPT_TEST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColumnExceptTest(Integer columnExceptTest) {
        __modifiedProperties.addPropertyName("columnExceptTest");
        _columnExceptTest = columnExceptTest;
    }
}
