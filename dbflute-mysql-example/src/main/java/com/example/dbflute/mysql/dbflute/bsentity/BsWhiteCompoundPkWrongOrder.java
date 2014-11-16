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
 * The entity of WHITE_COMPOUND_PK_WRONG_ORDER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SECOND_ID, THIRD_ID, FIRST_ID
 * 
 * [column]
 *     FIRST_ID, SECOND_ID, THIRD_ID, WRONG_NAME
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
 * Integer firstId = entity.getFirstId();
 * Integer secondId = entity.getSecondId();
 * Integer thirdId = entity.getThirdId();
 * String wrongName = entity.getWrongName();
 * entity.setFirstId(firstId);
 * entity.setSecondId(secondId);
 * entity.setThirdId(thirdId);
 * entity.setWrongName(wrongName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkWrongOrder extends AbstractEntity {

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
    /** FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _firstId;

    /** SECOND_ID: {PK, NotNull, INT(10)} */
    protected Integer _secondId;

    /** THIRD_ID: {PK, NotNull, INT(10)} */
    protected Integer _thirdId;

    /** WRONG_NAME: {NotNull, VARCHAR(200)} */
    protected String _wrongName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk_wrong_order";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkWrongOrder";
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
        if (getSecondId() == null) { return false; }
        if (getThirdId() == null) { return false; }
        if (getFirstId() == null) { return false; }
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
        if (obj instanceof BsWhiteCompoundPkWrongOrder) {
            BsWhiteCompoundPkWrongOrder other = (BsWhiteCompoundPkWrongOrder)obj;
            if (!xSV(_secondId, other._secondId)) { return false; }
            if (!xSV(_thirdId, other._thirdId)) { return false; }
            if (!xSV(_firstId, other._firstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _secondId);
        hs = xCH(hs, _thirdId);
        hs = xCH(hs, _firstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_firstId));
        sb.append(dm).append(xfND(_secondId));
        sb.append(dm).append(xfND(_thirdId));
        sb.append(dm).append(xfND(_wrongName));
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
    public WhiteCompoundPkWrongOrder clone() {
        return (WhiteCompoundPkWrongOrder)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        checkSpecifiedProperty("firstId");
        return _firstId;
    }

    /**
     * [set] FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param firstId The value of the column 'FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        registerModifiedProperty("firstId");
        _firstId = firstId;
    }

    /**
     * [get] SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSecondId() {
        checkSpecifiedProperty("secondId");
        return _secondId;
    }

    /**
     * [set] SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @param secondId The value of the column 'SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSecondId(Integer secondId) {
        registerModifiedProperty("secondId");
        _secondId = secondId;
    }

    /**
     * [get] THIRD_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'THIRD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getThirdId() {
        checkSpecifiedProperty("thirdId");
        return _thirdId;
    }

    /**
     * [set] THIRD_ID: {PK, NotNull, INT(10)} <br />
     * @param thirdId The value of the column 'THIRD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setThirdId(Integer thirdId) {
        registerModifiedProperty("thirdId");
        _thirdId = thirdId;
    }

    /**
     * [get] WRONG_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'WRONG_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getWrongName() {
        checkSpecifiedProperty("wrongName");
        return _wrongName;
    }

    /**
     * [set] WRONG_NAME: {NotNull, VARCHAR(200)} <br />
     * @param wrongName The value of the column 'WRONG_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setWrongName(String wrongName) {
        registerModifiedProperty("wrongName");
        _wrongName = wrongName;
    }
}
