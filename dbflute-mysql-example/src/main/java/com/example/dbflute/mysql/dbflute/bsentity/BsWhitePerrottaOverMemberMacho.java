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
 * The entity of WHITE_PERROTTA_OVER_MEMBER_MACHO as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MACHO_CODE
 * 
 * [column]
 *     MACHO_CODE, MACHO_NAME
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
 *     white_perrotta_over_member
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePerrottaOverMemberList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String machoCode = entity.getMachoCode();
 * String machoName = entity.getMachoName();
 * entity.setMachoCode(machoCode);
 * entity.setMachoName(machoName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMemberMacho extends AbstractEntity implements DomainEntity {

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
    /** MACHO_CODE: {PK, NotNull, CHAR(3)} */
    protected String _machoCode;

    /** MACHO_NAME: {NotNull, VARCHAR(200)} */
    protected String _machoName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_perrotta_over_member_macho";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverMemberMacho";
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
        if (getMachoCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'. */
    protected List<WhitePerrottaOverMember> _whitePerrottaOverMemberList;

    /**
     * [get] white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * @return The entity list of referrer property 'whitePerrottaOverMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverMember> getWhitePerrottaOverMemberList() {
        if (_whitePerrottaOverMemberList == null) { _whitePerrottaOverMemberList = newReferrerList(); }
        return _whitePerrottaOverMemberList;
    }

    /**
     * [set] white_perrotta_over_member by MACHO_CODE, named 'whitePerrottaOverMemberList'.
     * @param whitePerrottaOverMemberList The entity list of referrer property 'whitePerrottaOverMemberList'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberList(List<WhitePerrottaOverMember> whitePerrottaOverMemberList) {
        _whitePerrottaOverMemberList = whitePerrottaOverMemberList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePerrottaOverMemberMacho) {
            BsWhitePerrottaOverMemberMacho other = (BsWhitePerrottaOverMemberMacho)obj;
            if (!xSV(_machoCode, other._machoCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _machoCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberList != null) { for (WhitePerrottaOverMember et : _whitePerrottaOverMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverMemberList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_machoCode));
        sb.append(dm).append(xfND(_machoName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberList != null && !_whitePerrottaOverMemberList.isEmpty())
        { sb.append(dm).append("whitePerrottaOverMemberList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverMemberMacho clone() {
        return (WhitePerrottaOverMemberMacho)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MACHO_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'MACHO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoCode() {
        checkSpecifiedProperty("machoCode");
        return _machoCode;
    }

    /**
     * [set] MACHO_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param machoCode The value of the column 'MACHO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMachoCode(String machoCode) {
        registerModifiedProperty("machoCode");
        _machoCode = machoCode;
    }

    /**
     * [get] MACHO_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MACHO_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoName() {
        checkSpecifiedProperty("machoName");
        return _machoName;
    }

    /**
     * [set] MACHO_NAME: {NotNull, VARCHAR(200)} <br />
     * @param machoName The value of the column 'MACHO_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMachoName(String machoName) {
        registerModifiedProperty("machoName");
        _machoName = machoName;
    }
}
