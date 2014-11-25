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
 * The entity of WHITE_UQ_FK_WITHOUT_PK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UQ_FK_CODE, UQ_FK_NAME
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
 *     white_uq_fk_without_pk_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqFkWithoutPkRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String uqFkCode = entity.getUqFkCode();
 * String uqFkName = entity.getUqFkName();
 * entity.setUqFkCode(uqFkCode);
 * entity.setUqFkName(uqFkName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkWithoutPk extends AbstractEntity implements DomainEntity {

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
    /** UQ_FK_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqFkCode;

    /** UQ_FK_NAME: {NotNull, VARCHAR(64)} */
    protected String _uqFkName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_uq_fk_without_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkWithoutPk";
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
        return false;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uqFkCode : UQ, NotNull, CHAR(3). (NotNull)
     */
    public void uniqueBy(String uqFkCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqFkCode");
        setUqFkCode(uqFkCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_uq_fk_without_pk_ref by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'. */
    protected List<WhiteUqFkWithoutPkRef> _whiteUqFkWithoutPkRefList;

    /**
     * [get] white_uq_fk_without_pk_ref by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'.
     * @return The entity list of referrer property 'whiteUqFkWithoutPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkWithoutPkRef> getWhiteUqFkWithoutPkRefList() {
        if (_whiteUqFkWithoutPkRefList == null) { _whiteUqFkWithoutPkRefList = newReferrerList(); }
        return _whiteUqFkWithoutPkRefList;
    }

    /**
     * [set] white_uq_fk_without_pk_ref by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'.
     * @param whiteUqFkWithoutPkRefList The entity list of referrer property 'whiteUqFkWithoutPkRefList'. (NullAllowed)
     */
    public void setWhiteUqFkWithoutPkRefList(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList) {
        _whiteUqFkWithoutPkRefList = whiteUqFkWithoutPkRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteUqFkWithoutPk) {
            BsWhiteUqFkWithoutPk other = (BsWhiteUqFkWithoutPk)obj;
            if (!xSV(_uqFkCode, other._uqFkCode)) { return false; }
            if (!xSV(_uqFkName, other._uqFkName)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkCode);
        hs = xCH(hs, _uqFkName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkWithoutPkRefList != null) { for (WhiteUqFkWithoutPkRef et : _whiteUqFkWithoutPkRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkWithoutPkRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkCode));
        sb.append(dm).append(xfND(_uqFkName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkWithoutPkRefList != null && !_whiteUqFkWithoutPkRefList.isEmpty())
        { sb.append(dm).append("whiteUqFkWithoutPkRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkWithoutPk clone() {
        return (WhiteUqFkWithoutPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'UQ_FK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkCode() {
        checkSpecifiedProperty("uqFkCode");
        return _uqFkCode;
    }

    /**
     * [set] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param uqFkCode The value of the column 'UQ_FK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkCode(String uqFkCode) {
        registerModifiedProperty("uqFkCode");
        _uqFkCode = uqFkCode;
    }

    /**
     * [get] UQ_FK_NAME: {NotNull, VARCHAR(64)} <br />
     * @return The value of the column 'UQ_FK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkName() {
        checkSpecifiedProperty("uqFkName");
        return _uqFkName;
    }

    /**
     * [set] UQ_FK_NAME: {NotNull, VARCHAR(64)} <br />
     * @param uqFkName The value of the column 'UQ_FK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkName(String uqFkName) {
        registerModifiedProperty("uqFkName");
        _uqFkName = uqFkName;
    }
}
