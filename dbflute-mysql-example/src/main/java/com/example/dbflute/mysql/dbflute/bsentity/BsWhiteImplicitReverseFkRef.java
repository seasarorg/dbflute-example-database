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
 * The entity of WHITE_IMPLICIT_REVERSE_FK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 * 
 * [column]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID, WHITE_IMPLICIT_REVERSE_FK_ID, VALID_BEGIN_DATE, VALID_END_DATE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     WHITE_IMPLICIT_REVERSE_FK_REF_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_implicit_reverse_fk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteImplicitReverseFk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer whiteImplicitReverseFkRefId = entity.getWhiteImplicitReverseFkRefId();
 * Integer whiteImplicitReverseFkId = entity.getWhiteImplicitReverseFkId();
 * java.util.Date validBeginDate = entity.getValidBeginDate();
 * java.util.Date validEndDate = entity.getValidEndDate();
 * entity.setWhiteImplicitReverseFkRefId(whiteImplicitReverseFkRefId);
 * entity.setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteImplicitReverseFkRef extends AbstractEntity {

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
    /** WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _whiteImplicitReverseFkRefId;

    /** WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10), FK to white_implicit_reverse_fk} */
    protected Integer _whiteImplicitReverseFkId;

    /** VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} */
    protected java.util.Date _validBeginDate;

    /** VALID_END_DATE: {NotNull, DATE(10)} */
    protected java.util.Date _validEndDate;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_implicit_reverse_fk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteImplicitReverseFkRef";
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
        if (getWhiteImplicitReverseFkRefId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param whiteImplicitReverseFkId : UQ+, NotNull, INT(10), FK to white_implicit_reverse_fk. (NotNull)
     * @param validBeginDate : +UQ, NotNull, DATE(10). (NotNull)
     */
    public void uniqueBy(Integer whiteImplicitReverseFkId, java.util.Date validBeginDate) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("whiteImplicitReverseFkId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setWhiteImplicitReverseFkId(whiteImplicitReverseFkId);setValidBeginDate(validBeginDate);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. */
    protected WhiteImplicitReverseFk _whiteImplicitReverseFk;

    /**
     * [get] white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. <br />
     * Implicit Reverse FK to FK_WHITE_IMPLICIT_REVERSE_FK_REF_WITH
     * @return The entity of foreign property 'whiteImplicitReverseFk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteImplicitReverseFk getWhiteImplicitReverseFk() {
        return _whiteImplicitReverseFk;
    }

    /**
     * [set] white_implicit_reverse_fk by my WHITE_IMPLICIT_REVERSE_FK_ID, named 'whiteImplicitReverseFk'. <br />
     * Implicit Reverse FK to FK_WHITE_IMPLICIT_REVERSE_FK_REF_WITH
     * @param whiteImplicitReverseFk The entity of foreign property 'whiteImplicitReverseFk'. (NullAllowed)
     */
    public void setWhiteImplicitReverseFk(WhiteImplicitReverseFk whiteImplicitReverseFk) {
        _whiteImplicitReverseFk = whiteImplicitReverseFk;
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
        if (obj instanceof BsWhiteImplicitReverseFkRef) {
            BsWhiteImplicitReverseFkRef other = (BsWhiteImplicitReverseFkRef)obj;
            if (!xSV(_whiteImplicitReverseFkRefId, other._whiteImplicitReverseFkRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _whiteImplicitReverseFkRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitReverseFk != null)
        { sb.append(li).append(xbRDS(_whiteImplicitReverseFk, "whiteImplicitReverseFk")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_whiteImplicitReverseFkRefId));
        sb.append(dm).append(xfND(_whiteImplicitReverseFkId));
        sb.append(dm).append(xfUD(_validBeginDate));
        sb.append(dm).append(xfUD(_validEndDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteImplicitReverseFk != null)
        { sb.append(dm).append("whiteImplicitReverseFk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteImplicitReverseFkRef clone() {
        return (WhiteImplicitReverseFkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkRefId() {
        checkSpecifiedProperty("whiteImplicitReverseFkRefId");
        return _whiteImplicitReverseFkRefId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_REF_ID: {PK, ID, NotNull, INT(10)} <br />
     * @param whiteImplicitReverseFkRefId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkRefId(Integer whiteImplicitReverseFkRefId) {
        registerModifiedProperty("whiteImplicitReverseFkRefId");
        _whiteImplicitReverseFkRefId = whiteImplicitReverseFkRefId;
    }

    /**
     * [get] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10), FK to white_implicit_reverse_fk} <br />
     * @return The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getWhiteImplicitReverseFkId() {
        checkSpecifiedProperty("whiteImplicitReverseFkId");
        return _whiteImplicitReverseFkId;
    }

    /**
     * [set] WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10), FK to white_implicit_reverse_fk} <br />
     * @param whiteImplicitReverseFkId The value of the column 'WHITE_IMPLICIT_REVERSE_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWhiteImplicitReverseFkId(Integer whiteImplicitReverseFkId) {
        registerModifiedProperty("whiteImplicitReverseFkId");
        _whiteImplicitReverseFkId = whiteImplicitReverseFkId;
    }

    /**
     * [get] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidBeginDate() {
        checkSpecifiedProperty("validBeginDate");
        return _validBeginDate;
    }

    /**
     * [set] VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)} <br />
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidBeginDate(java.util.Date validBeginDate) {
        registerModifiedProperty("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] VALID_END_DATE: {NotNull, DATE(10)} <br />
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getValidEndDate() {
        checkSpecifiedProperty("validEndDate");
        return _validEndDate;
    }

    /**
     * [set] VALID_END_DATE: {NotNull, DATE(10)} <br />
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setValidEndDate(java.util.Date validEndDate) {
        registerModifiedProperty("validEndDate");
        _validEndDate = validEndDate;
    }
}
