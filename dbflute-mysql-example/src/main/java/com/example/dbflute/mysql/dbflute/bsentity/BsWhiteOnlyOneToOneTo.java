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
 * The entity of WHITE_ONLY_ONE_TO_ONE_TO as TABLE. <br />
 * <pre>
 * [primary-key]
 *     TO_ID
 * 
 * [column]
 *     TO_ID, TO_NAME, FROM_ID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TO_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_only_one_to_one_from
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteOnlyOneToOneFrom
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long toId = entity.getToId();
 * String toName = entity.getToName();
 * Long fromId = entity.getFromId();
 * entity.setToId(toId);
 * entity.setToName(toName);
 * entity.setFromId(fromId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneTo extends AbstractEntity {

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
    /** TO_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _toId;

    /** TO_NAME: {NotNull, VARCHAR(200)} */
    protected String _toName;

    /** FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} */
    protected Long _fromId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_only_one_to_one_to";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteOnlyOneToOneTo";
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
        if (getToId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param fromId : UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from. (NotNull)
     */
    public void uniqueBy(Long fromId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("fromId");
        setFromId(fromId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'. */
    protected WhiteOnlyOneToOneFrom _whiteOnlyOneToOneFrom;

    /**
     * [get] white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @return The entity of foreign property 'whiteOnlyOneToOneFrom'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteOnlyOneToOneFrom getWhiteOnlyOneToOneFrom() {
        return _whiteOnlyOneToOneFrom;
    }

    /**
     * [set] white_only_one_to_one_from by my FROM_ID, named 'whiteOnlyOneToOneFrom'.
     * @param whiteOnlyOneToOneFrom The entity of foreign property 'whiteOnlyOneToOneFrom'. (NullAllowed)
     */
    public void setWhiteOnlyOneToOneFrom(WhiteOnlyOneToOneFrom whiteOnlyOneToOneFrom) {
        _whiteOnlyOneToOneFrom = whiteOnlyOneToOneFrom;
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
        if (obj instanceof BsWhiteOnlyOneToOneTo) {
            BsWhiteOnlyOneToOneTo other = (BsWhiteOnlyOneToOneTo)obj;
            if (!xSV(_toId, other._toId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _toId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnlyOneToOneFrom != null)
        { sb.append(li).append(xbRDS(_whiteOnlyOneToOneFrom, "whiteOnlyOneToOneFrom")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_toId));
        sb.append(dm).append(xfND(_toName));
        sb.append(dm).append(xfND(_fromId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnlyOneToOneFrom != null)
        { sb.append(dm).append("whiteOnlyOneToOneFrom"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteOnlyOneToOneTo clone() {
        return (WhiteOnlyOneToOneTo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'TO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getToId() {
        checkSpecifiedProperty("toId");
        return _toId;
    }

    /**
     * [set] TO_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param toId The value of the column 'TO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setToId(Long toId) {
        registerModifiedProperty("toId");
        _toId = toId;
    }

    /**
     * [get] TO_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'TO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getToName() {
        checkSpecifiedProperty("toName");
        return _toName;
    }

    /**
     * [set] TO_NAME: {NotNull, VARCHAR(200)} <br />
     * @param toName The value of the column 'TO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setToName(String toName) {
        registerModifiedProperty("toName");
        _toName = toName;
    }

    /**
     * [get] FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} <br />
     * @return The value of the column 'FROM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromId() {
        checkSpecifiedProperty("fromId");
        return _fromId;
    }

    /**
     * [set] FROM_ID: {UQ, NotNull, BIGINT(19), FK to white_only_one_to_one_from} <br />
     * @param fromId The value of the column 'FROM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFromId(Long fromId) {
        registerModifiedProperty("fromId");
        _fromId = fromId;
    }
}
