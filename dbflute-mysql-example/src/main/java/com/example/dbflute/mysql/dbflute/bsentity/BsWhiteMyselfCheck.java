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
 * The entity of WHITE_MYSELF_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MYSELF_CHECK_ID
 * 
 * [column]
 *     MYSELF_CHECK_ID, MYSELF_CHECK_NAME, MYSELF_ID
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
 *     white_myself
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteMyself
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer myselfCheckId = entity.getMyselfCheckId();
 * String myselfCheckName = entity.getMyselfCheckName();
 * Integer myselfId = entity.getMyselfId();
 * entity.setMyselfCheckId(myselfCheckId);
 * entity.setMyselfCheckName(myselfCheckName);
 * entity.setMyselfId(myselfId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteMyselfCheck extends AbstractEntity {

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
    /** MYSELF_CHECK_ID: {PK, NotNull, INT(10)} */
    protected Integer _myselfCheckId;

    /** MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} */
    protected String _myselfCheckName;

    /** MYSELF_ID: {IX, INT(10), FK to white_myself} */
    protected Integer _myselfId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_myself_check";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteMyselfCheck";
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
        if (getMyselfCheckId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_myself by my MYSELF_ID, named 'whiteMyself'. */
    protected WhiteMyself _whiteMyself;

    /**
     * [get] white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @return The entity of foreign property 'whiteMyself'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteMyself getWhiteMyself() {
        return _whiteMyself;
    }

    /**
     * [set] white_myself by my MYSELF_ID, named 'whiteMyself'.
     * @param whiteMyself The entity of foreign property 'whiteMyself'. (NullAllowed)
     */
    public void setWhiteMyself(WhiteMyself whiteMyself) {
        _whiteMyself = whiteMyself;
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
        if (obj instanceof BsWhiteMyselfCheck) {
            BsWhiteMyselfCheck other = (BsWhiteMyselfCheck)obj;
            if (!xSV(_myselfCheckId, other._myselfCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _myselfCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyself != null)
        { sb.append(li).append(xbRDS(_whiteMyself, "whiteMyself")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_myselfCheckId));
        sb.append(dm).append(xfND(_myselfCheckName));
        sb.append(dm).append(xfND(_myselfId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteMyself != null)
        { sb.append(dm).append("whiteMyself"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteMyselfCheck clone() {
        return (WhiteMyselfCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyselfCheckId() {
        checkSpecifiedProperty("myselfCheckId");
        return _myselfCheckId;
    }

    /**
     * [set] MYSELF_CHECK_ID: {PK, NotNull, INT(10)} <br />
     * @param myselfCheckId The value of the column 'MYSELF_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckId(Integer myselfCheckId) {
        registerModifiedProperty("myselfCheckId");
        _myselfCheckId = myselfCheckId;
    }

    /**
     * [get] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @return The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMyselfCheckName() {
        checkSpecifiedProperty("myselfCheckName");
        return _myselfCheckName;
    }

    /**
     * [set] MYSELF_CHECK_NAME: {NotNull, VARCHAR(80)} <br />
     * @param myselfCheckName The value of the column 'MYSELF_CHECK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMyselfCheckName(String myselfCheckName) {
        registerModifiedProperty("myselfCheckName");
        _myselfCheckName = myselfCheckName;
    }

    /**
     * [get] MYSELF_ID: {IX, INT(10), FK to white_myself} <br />
     * @return The value of the column 'MYSELF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMyselfId() {
        checkSpecifiedProperty("myselfId");
        return _myselfId;
    }

    /**
     * [set] MYSELF_ID: {IX, INT(10), FK to white_myself} <br />
     * @param myselfId The value of the column 'MYSELF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMyselfId(Integer myselfId) {
        registerModifiedProperty("myselfId");
        _myselfId = myselfId;
    }
}
