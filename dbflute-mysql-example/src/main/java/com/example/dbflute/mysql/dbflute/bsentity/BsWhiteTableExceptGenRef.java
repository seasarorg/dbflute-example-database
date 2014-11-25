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
 * The entity of WHITE_TABLE_EXCEPT_GEN_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GEN_REF_ID
 * 
 * [column]
 *     GEN_REF_ID, GEN_REF_NAME, GEN_ONLY_ID
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
 * Long genRefId = entity.getGenRefId();
 * String genRefName = entity.getGenRefName();
 * Long genOnlyId = entity.getGenOnlyId();
 * entity.setGenRefId(genRefId);
 * entity.setGenRefName(genRefName);
 * entity.setGenOnlyId(genOnlyId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTableExceptGenRef extends AbstractEntity implements DomainEntity {

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
    /** GEN_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _genRefId;

    /** GEN_REF_NAME: {NotNull, VARCHAR(200)} */
    protected String _genRefName;

    /** GEN_ONLY_ID: {IX, DECIMAL(16)} */
    protected Long _genOnlyId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_table_except_gen_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteTableExceptGenRef";
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
        if (getGenRefId() == null) { return false; }
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
        if (obj instanceof BsWhiteTableExceptGenRef) {
            BsWhiteTableExceptGenRef other = (BsWhiteTableExceptGenRef)obj;
            if (!xSV(_genRefId, other._genRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _genRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genRefId));
        sb.append(dm).append(xfND(_genRefName));
        sb.append(dm).append(xfND(_genOnlyId));
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
    public WhiteTableExceptGenRef clone() {
        return (WhiteTableExceptGenRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GEN_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'GEN_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGenRefId() {
        checkSpecifiedProperty("genRefId");
        return _genRefId;
    }

    /**
     * [set] GEN_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param genRefId The value of the column 'GEN_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGenRefId(Long genRefId) {
        registerModifiedProperty("genRefId");
        _genRefId = genRefId;
    }

    /**
     * [get] GEN_REF_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'GEN_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getGenRefName() {
        checkSpecifiedProperty("genRefName");
        return _genRefName;
    }

    /**
     * [set] GEN_REF_NAME: {NotNull, VARCHAR(200)} <br />
     * @param genRefName The value of the column 'GEN_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setGenRefName(String genRefName) {
        registerModifiedProperty("genRefName");
        _genRefName = genRefName;
    }

    /**
     * [get] GEN_ONLY_ID: {IX, DECIMAL(16)} <br />
     * @return The value of the column 'GEN_ONLY_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getGenOnlyId() {
        checkSpecifiedProperty("genOnlyId");
        return _genOnlyId;
    }

    /**
     * [set] GEN_ONLY_ID: {IX, DECIMAL(16)} <br />
     * @param genOnlyId The value of the column 'GEN_ONLY_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenOnlyId(Long genOnlyId) {
        registerModifiedProperty("genOnlyId");
        _genOnlyId = genOnlyId;
    }
}
