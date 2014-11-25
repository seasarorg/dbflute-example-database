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
 * The entity of WHITE_UQ_FK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_REF_ID
 * 
 * [column]
 *     UQ_FK_REF_ID, FK_TO_PK_ID, FK_TO_UQ_CODE, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     white_uq_fk
 * 
 * [referrer table]
 *     white_uq_fk_ref_nest
 * 
 * [foreign property]
 *     whiteUqFkByFkToPkId, whiteUqFkByFkToUqCode
 * 
 * [referrer property]
 *     whiteUqFkRefNestList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefId = entity.getUqFkRefId();
 * Long fkToPkId = entity.getFkToPkId();
 * String fkToUqCode = entity.getFkToUqCode();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqFkRefId(uqFkRefId);
 * entity.setFkToPkId(fkToPkId);
 * entity.setFkToUqCode(fkToUqCode);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqFkRef extends AbstractEntity implements DomainEntity {

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
    /** UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqFkRefId;

    /** FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk} */
    protected Long _fkToPkId;

    /** FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} */
    protected String _fkToUqCode;

    /** COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)} */
    protected String _compoundUqSecondCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_uq_fk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkRef";
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
        if (getUqFkRefId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param compoundUqFirstCode : UQ+, NotNull, CHAR(3). (NotNull)
     * @param compoundUqSecondCode : +UQ, NotNull, CHAR(3). (NotNull)
     */
    public void uniqueBy(String compoundUqFirstCode, String compoundUqSecondCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("compoundUqFirstCode");
        __uniqueDrivenProperties.addPropertyName("compoundUqSecondCode");
        setCompoundUqFirstCode(compoundUqFirstCode);setCompoundUqSecondCode(compoundUqSecondCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'. */
    protected WhiteUqFk _whiteUqFkByFkToPkId;

    /**
     * [get] white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @return The entity of foreign property 'whiteUqFkByFkToPkId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFk getWhiteUqFkByFkToPkId() {
        return _whiteUqFkByFkToPkId;
    }

    /**
     * [set] white_uq_fk by my FK_TO_PK_ID, named 'whiteUqFkByFkToPkId'.
     * @param whiteUqFkByFkToPkId The entity of foreign property 'whiteUqFkByFkToPkId'. (NullAllowed)
     */
    public void setWhiteUqFkByFkToPkId(WhiteUqFk whiteUqFkByFkToPkId) {
        _whiteUqFkByFkToPkId = whiteUqFkByFkToPkId;
    }

    /** white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'. */
    protected WhiteUqFk _whiteUqFkByFkToUqCode;

    /**
     * [get] white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @return The entity of foreign property 'whiteUqFkByFkToUqCode'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFk getWhiteUqFkByFkToUqCode() {
        return _whiteUqFkByFkToUqCode;
    }

    /**
     * [set] white_uq_fk by my FK_TO_UQ_CODE, named 'whiteUqFkByFkToUqCode'.
     * @param whiteUqFkByFkToUqCode The entity of foreign property 'whiteUqFkByFkToUqCode'. (NullAllowed)
     */
    public void setWhiteUqFkByFkToUqCode(WhiteUqFk whiteUqFkByFkToUqCode) {
        _whiteUqFkByFkToUqCode = whiteUqFkByFkToUqCode;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'. */
    protected List<WhiteUqFkRefNest> _whiteUqFkRefNestList;

    /**
     * [get] white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @return The entity list of referrer property 'whiteUqFkRefNestList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRefNest> getWhiteUqFkRefNestList() {
        if (_whiteUqFkRefNestList == null) { _whiteUqFkRefNestList = newReferrerList(); }
        return _whiteUqFkRefNestList;
    }

    /**
     * [set] white_uq_fk_ref_nest by COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRefNestList'.
     * @param whiteUqFkRefNestList The entity list of referrer property 'whiteUqFkRefNestList'. (NullAllowed)
     */
    public void setWhiteUqFkRefNestList(List<WhiteUqFkRefNest> whiteUqFkRefNestList) {
        _whiteUqFkRefNestList = whiteUqFkRefNestList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteUqFkRef) {
            BsWhiteUqFkRef other = (BsWhiteUqFkRef)obj;
            if (!xSV(_uqFkRefId, other._uqFkRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkByFkToPkId != null)
        { sb.append(li).append(xbRDS(_whiteUqFkByFkToPkId, "whiteUqFkByFkToPkId")); }
        if (_whiteUqFkByFkToUqCode != null)
        { sb.append(li).append(xbRDS(_whiteUqFkByFkToUqCode, "whiteUqFkByFkToUqCode")); }
        if (_whiteUqFkRefNestList != null) { for (WhiteUqFkRefNest et : _whiteUqFkRefNestList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkRefNestList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkRefId));
        sb.append(dm).append(xfND(_fkToPkId));
        sb.append(dm).append(xfND(_fkToUqCode));
        sb.append(dm).append(xfND(_compoundUqFirstCode));
        sb.append(dm).append(xfND(_compoundUqSecondCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkByFkToPkId != null)
        { sb.append(dm).append("whiteUqFkByFkToPkId"); }
        if (_whiteUqFkByFkToUqCode != null)
        { sb.append(dm).append("whiteUqFkByFkToUqCode"); }
        if (_whiteUqFkRefNestList != null && !_whiteUqFkRefNestList.isEmpty())
        { sb.append(dm).append("whiteUqFkRefNestList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkRef clone() {
        return (WhiteUqFkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_FK_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefId() {
        checkSpecifiedProperty("uqFkRefId");
        return _uqFkRefId;
    }

    /**
     * [set] UQ_FK_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqFkRefId The value of the column 'UQ_FK_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefId(Long uqFkRefId) {
        registerModifiedProperty("uqFkRefId");
        _uqFkRefId = uqFkRefId;
    }

    /**
     * [get] FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk} <br />
     * @return The value of the column 'FK_TO_PK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFkToPkId() {
        checkSpecifiedProperty("fkToPkId");
        return _fkToPkId;
    }

    /**
     * [set] FK_TO_PK_ID: {IX, NotNull, DECIMAL(16), FK to white_uq_fk} <br />
     * @param fkToPkId The value of the column 'FK_TO_PK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFkToPkId(Long fkToPkId) {
        registerModifiedProperty("fkToPkId");
        _fkToPkId = fkToPkId;
    }

    /**
     * [get] FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} <br />
     * @return The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFkToUqCode() {
        checkSpecifiedProperty("fkToUqCode");
        return _fkToUqCode;
    }

    /**
     * [set] FK_TO_UQ_CODE: {IX, NotNull, CHAR(3), FK to white_uq_fk} <br />
     * @param fkToUqCode The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFkToUqCode(String fkToUqCode) {
        registerModifiedProperty("fkToUqCode");
        _fkToUqCode = fkToUqCode;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        checkSpecifiedProperty("compoundUqFirstCode");
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {UQ+, NotNull, CHAR(3)} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        registerModifiedProperty("compoundUqFirstCode");
        _compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        checkSpecifiedProperty("compoundUqSecondCode");
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {+UQ, NotNull, CHAR(3)} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        registerModifiedProperty("compoundUqSecondCode");
        _compoundUqSecondCode = compoundUqSecondCode;
    }
}
