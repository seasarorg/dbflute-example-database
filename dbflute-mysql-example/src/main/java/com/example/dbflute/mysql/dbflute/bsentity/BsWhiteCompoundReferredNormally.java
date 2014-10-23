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
 * The entity of WHITE_COMPOUND_REFERRED_NORMALLY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REFERRED_ID
 * 
 * [column]
 *     REFERRED_ID, REFERRED_NAME
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
 *     white_compound_pk
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteCompoundPkList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer referredId = entity.getReferredId();
 * String referredName = entity.getReferredName();
 * entity.setReferredId(referredId);
 * entity.setReferredName(referredName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundReferredNormally extends AbstractEntity {

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
    /** REFERRED_ID: {PK, NotNull, INT(10)} */
    protected Integer _referredId;

    /** REFERRED_NAME: {NotNull, VARCHAR(200)} */
    protected String _referredName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_referred_normally";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundReferredNormally";
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
        if (getReferredId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'. */
    protected List<WhiteCompoundPk> _whiteCompoundPkList;

    /**
     * [get] white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * @return The entity list of referrer property 'whiteCompoundPkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPk> getWhiteCompoundPkList() {
        if (_whiteCompoundPkList == null) { _whiteCompoundPkList = newReferrerList(); }
        return _whiteCompoundPkList;
    }

    /**
     * [set] white_compound_pk by REFERRED_ID, named 'whiteCompoundPkList'.
     * @param whiteCompoundPkList The entity list of referrer property 'whiteCompoundPkList'. (NullAllowed)
     */
    public void setWhiteCompoundPkList(List<WhiteCompoundPk> whiteCompoundPkList) {
        _whiteCompoundPkList = whiteCompoundPkList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundReferredNormally) {
            BsWhiteCompoundReferredNormally other = (BsWhiteCompoundReferredNormally)obj;
            if (!xSV(_referredId, other._referredId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _referredId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkList != null) { for (WhiteCompoundPk et : _whiteCompoundPkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_referredId));
        sb.append(dm).append(xfND(_referredName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkList != null && !_whiteCompoundPkList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundReferredNormally clone() {
        return (WhiteCompoundReferredNormally)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REFERRED_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'REFERRED_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReferredId() {
        checkSpecifiedProperty("referredId");
        return _referredId;
    }

    /**
     * [set] REFERRED_ID: {PK, NotNull, INT(10)} <br />
     * @param referredId The value of the column 'REFERRED_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReferredId(Integer referredId) {
        __modifiedProperties.addPropertyName("referredId");
        _referredId = referredId;
    }

    /**
     * [get] REFERRED_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REFERRED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReferredName() {
        checkSpecifiedProperty("referredName");
        return _referredName;
    }

    /**
     * [set] REFERRED_NAME: {NotNull, VARCHAR(200)} <br />
     * @param referredName The value of the column 'REFERRED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReferredName(String referredName) {
        __modifiedProperties.addPropertyName("referredName");
        _referredName = referredName;
    }
}
