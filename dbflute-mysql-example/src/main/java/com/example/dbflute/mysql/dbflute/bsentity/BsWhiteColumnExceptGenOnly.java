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
 * The entity of WHITE_COLUMN_EXCEPT_GEN_ONLY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GEN_ONLY_ID
 * 
 * [column]
 *     GEN_ONLY_ID, GEN_ONLY_NAME
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
 * Long genOnlyId = entity.getGenOnlyId();
 * String genOnlyName = entity.getGenOnlyName();
 * entity.setGenOnlyId(genOnlyId);
 * entity.setGenOnlyName(genOnlyName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteColumnExceptGenOnly extends AbstractEntity {

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
    /** GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _genOnlyId;

    /** GEN_ONLY_NAME: {NotNull, VARCHAR(200)} */
    protected String _genOnlyName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_column_except_gen_only";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteColumnExceptGenOnly";
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
        if (getGenOnlyId() == null) { return false; }
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
        if (obj instanceof BsWhiteColumnExceptGenOnly) {
            BsWhiteColumnExceptGenOnly other = (BsWhiteColumnExceptGenOnly)obj;
            if (!xSV(_genOnlyId, other._genOnlyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _genOnlyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genOnlyId));
        sb.append(dm).append(xfND(_genOnlyName));
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
    public WhiteColumnExceptGenOnly clone() {
        return (WhiteColumnExceptGenOnly)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'GEN_ONLY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGenOnlyId() {
        checkSpecifiedProperty("genOnlyId");
        return _genOnlyId;
    }

    /**
     * [set] GEN_ONLY_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param genOnlyId The value of the column 'GEN_ONLY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGenOnlyId(Long genOnlyId) {
        registerModifiedProperty("genOnlyId");
        _genOnlyId = genOnlyId;
    }

    /**
     * [get] GEN_ONLY_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'GEN_ONLY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenOnlyName() {
        checkSpecifiedProperty("genOnlyName");
        return _genOnlyName;
    }

    /**
     * [set] GEN_ONLY_NAME: {NotNull, VARCHAR(200)} <br />
     * @param genOnlyName The value of the column 'GEN_ONLY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenOnlyName(String genOnlyName) {
        registerModifiedProperty("genOnlyName");
        _genOnlyName = genOnlyName;
    }
}
