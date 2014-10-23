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
 * The entity of WHITE_ONLY_ONE_TO_ONE_FROM as TABLE. <br />
 * <pre>
 * [primary-key]
 *     FROM_ID
 * 
 * [column]
 *     FROM_ID, FROM_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     FROM_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     white_only_one_to_one_to(AsOne)
 * 
 * [referrer table]
 *     white_only_one_to_one_to
 * 
 * [foreign property]
 *     whiteOnlyOneToOneToAsOne
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long fromId = entity.getFromId();
 * String fromName = entity.getFromName();
 * entity.setFromId(fromId);
 * entity.setFromName(fromName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteOnlyOneToOneFrom extends AbstractEntity {

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
    /** FROM_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _fromId;

    /** FROM_NAME: {NotNull, VARCHAR(200)} */
    protected String _fromName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_only_one_to_one_from";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteOnlyOneToOneFrom";
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
        if (getFromId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'. */
    protected WhiteOnlyOneToOneTo _whiteOnlyOneToOneToAsOne;

    /**
     * [get] white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whiteOnlyOneToOneToAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhiteOnlyOneToOneTo getWhiteOnlyOneToOneToAsOne() {
        return _whiteOnlyOneToOneToAsOne;
    }

    /**
     * [set] white_only_one_to_one_to by FROM_ID, named 'whiteOnlyOneToOneToAsOne'.
     * @param whiteOnlyOneToOneToAsOne The entity of foreign property(referrer-as-one) 'whiteOnlyOneToOneToAsOne'. (NullAllowed)
     */
    public void setWhiteOnlyOneToOneToAsOne(WhiteOnlyOneToOneTo whiteOnlyOneToOneToAsOne) {
        _whiteOnlyOneToOneToAsOne = whiteOnlyOneToOneToAsOne;
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
        if (obj instanceof BsWhiteOnlyOneToOneFrom) {
            BsWhiteOnlyOneToOneFrom other = (BsWhiteOnlyOneToOneFrom)obj;
            if (!xSV(_fromId, other._fromId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _fromId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnlyOneToOneToAsOne != null)
        { sb.append(li).append(xbRDS(_whiteOnlyOneToOneToAsOne, "whiteOnlyOneToOneToAsOne")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fromId));
        sb.append(dm).append(xfND(_fromName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteOnlyOneToOneToAsOne != null) { sb.append(dm).append("whiteOnlyOneToOneToAsOne"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteOnlyOneToOneFrom clone() {
        return (WhiteOnlyOneToOneFrom)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'FROM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFromId() {
        checkSpecifiedProperty("fromId");
        return _fromId;
    }

    /**
     * [set] FROM_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param fromId The value of the column 'FROM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFromId(Long fromId) {
        __modifiedProperties.addPropertyName("fromId");
        _fromId = fromId;
    }

    /**
     * [get] FROM_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'FROM_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFromName() {
        checkSpecifiedProperty("fromName");
        return _fromName;
    }

    /**
     * [set] FROM_NAME: {NotNull, VARCHAR(200)} <br />
     * @param fromName The value of the column 'FROM_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFromName(String fromName) {
        __modifiedProperties.addPropertyName("fromName");
        _fromName = fromName;
    }
}
