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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_CLASSIFICATION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_CLS_ID
 * 
 * [column]
 *     UQ_CLS_ID, UQ_CLS_CODE
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
 * Long uqClsId = entity.getUqClsId();
 * String uqClsCode = entity.getUqClsCode();
 * entity.setUqClsId(uqClsId);
 * entity.setUqClsCode(uqClsCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteUqClassification extends AbstractEntity implements DomainEntity {

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
    /** UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _uqClsId;

    /** UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} */
    protected String _uqClsCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_uq_classification";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqClassification";
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
        if (getUqClsId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uqClsCode : UQ, NotNull, CHAR(3), classification=UQClassificationType. (NotNull)
     */
    public void uniqueBy(CDef.UQClassificationType uqClsCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqClsCode");
        setUqClsCodeAsUQClassificationType(uqClsCode);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of uqClsCode as the classification of UQClassificationType. <br />
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br />
     * unique key as classification
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.UQClassificationType getUqClsCodeAsUQClassificationType() {
        return CDef.UQClassificationType.codeOf(getUqClsCode());
    }

    /**
     * Set the value of uqClsCode as the classification of UQClassificationType. <br />
     * UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br />
     * unique key as classification
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setUqClsCodeAsUQClassificationType(CDef.UQClassificationType cdef) {
        setUqClsCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
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
        if (obj instanceof BsWhiteUqClassification) {
            BsWhiteUqClassification other = (BsWhiteUqClassification)obj;
            if (!xSV(_uqClsId, other._uqClsId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqClsId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqClsId));
        sb.append(dm).append(xfND(_uqClsCode));
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
    public WhiteUqClassification clone() {
        return (WhiteUqClassification)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'UQ_CLS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqClsId() {
        checkSpecifiedProperty("uqClsId");
        return _uqClsId;
    }

    /**
     * [set] UQ_CLS_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param uqClsId The value of the column 'UQ_CLS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqClsId(Long uqClsId) {
        registerModifiedProperty("uqClsId");
        _uqClsId = uqClsId;
    }

    /**
     * [get] UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br />
     * @return The value of the column 'UQ_CLS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqClsCode() {
        checkSpecifiedProperty("uqClsCode");
        return _uqClsCode;
    }

    /**
     * [set] UQ_CLS_CODE: {UQ, NotNull, CHAR(3), classification=UQClassificationType} <br />
     * @param uqClsCode The value of the column 'UQ_CLS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setUqClsCode(String uqClsCode) {
        registerModifiedProperty("uqClsCode");
        _uqClsCode = uqClsCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param uqClsCode The value of the column 'UQ_CLS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingUqClsCode(String uqClsCode) {
        setUqClsCode(uqClsCode);
    }
}
