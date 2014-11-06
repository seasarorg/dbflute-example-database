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
 * The entity of WHITE_LOAD_DATA as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LOAD_DATA_ID
 * 
 * [column]
 *     LOAD_DATA_ID, LOAD_DATA_NAME
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
 * Long loadDataId = entity.getLoadDataId();
 * String loadDataName = entity.getLoadDataName();
 * entity.setLoadDataId(loadDataId);
 * entity.setLoadDataName(loadDataName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLoadData extends AbstractEntity {

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
    /** LOAD_DATA_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _loadDataId;

    /** LOAD_DATA_NAME: {NotNull, VARCHAR(200)} */
    protected String _loadDataName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_load_data";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteLoadData";
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
        if (getLoadDataId() == null) { return false; }
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
        if (obj instanceof BsWhiteLoadData) {
            BsWhiteLoadData other = (BsWhiteLoadData)obj;
            if (!xSV(_loadDataId, other._loadDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _loadDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_loadDataId));
        sb.append(dm).append(xfND(_loadDataName));
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
    public WhiteLoadData clone() {
        return (WhiteLoadData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOAD_DATA_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'LOAD_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLoadDataId() {
        checkSpecifiedProperty("loadDataId");
        return _loadDataId;
    }

    /**
     * [set] LOAD_DATA_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param loadDataId The value of the column 'LOAD_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLoadDataId(Long loadDataId) {
        registerModifiedProperty("loadDataId");
        _loadDataId = loadDataId;
    }

    /**
     * [get] LOAD_DATA_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'LOAD_DATA_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLoadDataName() {
        checkSpecifiedProperty("loadDataName");
        return _loadDataName;
    }

    /**
     * [set] LOAD_DATA_NAME: {NotNull, VARCHAR(200)} <br />
     * @param loadDataName The value of the column 'LOAD_DATA_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLoadDataName(String loadDataName) {
        registerModifiedProperty("loadDataName");
        _loadDataName = loadDataName;
    }
}
