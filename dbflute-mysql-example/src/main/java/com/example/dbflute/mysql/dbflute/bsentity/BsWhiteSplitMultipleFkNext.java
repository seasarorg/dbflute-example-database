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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_NEXT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     NEXT_ID
 * 
 * [column]
 *     NEXT_ID, SECOND_CODE
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
 *     white_split_multiple_fk_base
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteSplitMultipleFkBaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long nextId = entity.getNextId();
 * String secondCode = entity.getSecondCode();
 * entity.setNextId(nextId);
 * entity.setSecondCode(secondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkNext extends AbstractEntity implements DomainEntity {

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
    /** NEXT_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _nextId;

    /** SECOND_CODE: {NotNull, CHAR(3)} */
    protected String _secondCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_split_multiple_fk_next";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkNext";
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
        if (getNextId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'. */
    protected List<WhiteSplitMultipleFkBase> _whiteSplitMultipleFkBaseList;

    /**
     * [get] white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * @return The entity list of referrer property 'whiteSplitMultipleFkBaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSplitMultipleFkBase> getWhiteSplitMultipleFkBaseList() {
        if (_whiteSplitMultipleFkBaseList == null) { _whiteSplitMultipleFkBaseList = newReferrerList(); }
        return _whiteSplitMultipleFkBaseList;
    }

    /**
     * [set] white_split_multiple_fk_base by NEXT_ID, named 'whiteSplitMultipleFkBaseList'.
     * @param whiteSplitMultipleFkBaseList The entity list of referrer property 'whiteSplitMultipleFkBaseList'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkBaseList(List<WhiteSplitMultipleFkBase> whiteSplitMultipleFkBaseList) {
        _whiteSplitMultipleFkBaseList = whiteSplitMultipleFkBaseList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSplitMultipleFkNext) {
            BsWhiteSplitMultipleFkNext other = (BsWhiteSplitMultipleFkNext)obj;
            if (!xSV(_nextId, other._nextId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _nextId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBaseList != null) { for (WhiteSplitMultipleFkBase et : _whiteSplitMultipleFkBaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSplitMultipleFkBaseList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nextId));
        sb.append(dm).append(xfND(_secondCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBaseList != null && !_whiteSplitMultipleFkBaseList.isEmpty())
        { sb.append(dm).append("whiteSplitMultipleFkBaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSplitMultipleFkNext clone() {
        return (WhiteSplitMultipleFkNext)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NEXT_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'NEXT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextId() {
        checkSpecifiedProperty("nextId");
        return _nextId;
    }

    /**
     * [set] NEXT_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param nextId The value of the column 'NEXT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextId(Long nextId) {
        registerModifiedProperty("nextId");
        _nextId = nextId;
    }

    /**
     * [get] SECOND_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecondCode() {
        checkSpecifiedProperty("secondCode");
        return _secondCode;
    }

    /**
     * [set] SECOND_CODE: {NotNull, CHAR(3)} <br />
     * @param secondCode The value of the column 'SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecondCode(String secondCode) {
        registerModifiedProperty("secondCode");
        _secondCode = secondCode;
    }
}
