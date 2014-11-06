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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_BASE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BASE_ID
 * 
 * [column]
 *     BASE_ID, FIRST_ID, NEXT_ID, SPLIT_NAME
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
 *     white_split_multiple_fk_next, WHITE_SPLIT_MULTIPLE_FK_REF(AsSplitMultipleFkTest)
 * 
 * [referrer table]
 *     white_split_multiple_fk_child
 * 
 * [foreign property]
 *     whiteSplitMultipleFkNext, whiteSplitMultipleFkRefAsSplitMultipleFkTest
 * 
 * [referrer property]
 *     whiteSplitMultipleFkChildList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long baseId = entity.getBaseId();
 * Integer firstId = entity.getFirstId();
 * Long nextId = entity.getNextId();
 * String splitName = entity.getSplitName();
 * entity.setBaseId(baseId);
 * entity.setFirstId(firstId);
 * entity.setNextId(nextId);
 * entity.setSplitName(splitName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkBase extends AbstractEntity {

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
    /** BASE_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _baseId;

    /** FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} */
    protected Integer _firstId;

    /** NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} */
    protected Long _nextId;

    /** SPLIT_NAME: {NotNull, VARCHAR(200)} */
    protected String _splitName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_split_multiple_fk_base";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkBase";
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
        if (getBaseId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'. */
    protected WhiteSplitMultipleFkNext _whiteSplitMultipleFkNext;

    /**
     * [get] white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @return The entity of foreign property 'whiteSplitMultipleFkNext'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkNext getWhiteSplitMultipleFkNext() {
        return _whiteSplitMultipleFkNext;
    }

    /**
     * [set] white_split_multiple_fk_next by my NEXT_ID, named 'whiteSplitMultipleFkNext'.
     * @param whiteSplitMultipleFkNext The entity of foreign property 'whiteSplitMultipleFkNext'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkNext(WhiteSplitMultipleFkNext whiteSplitMultipleFkNext) {
        _whiteSplitMultipleFkNext = whiteSplitMultipleFkNext;
    }

    /** white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. */
    protected WhiteSplitMultipleFkRef _whiteSplitMultipleFkRefAsSplitMultipleFkTest;

    /**
     * [get] white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @return The entity of foreign property 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkRef getWhiteSplitMultipleFkRefAsSplitMultipleFkTest() {
        return _whiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }

    /**
     * [set] white_split_multiple_fk_ref by my FIRST_ID, named 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'.
     * @param whiteSplitMultipleFkRefAsSplitMultipleFkTest The entity of foreign property 'whiteSplitMultipleFkRefAsSplitMultipleFkTest'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkRefAsSplitMultipleFkTest(WhiteSplitMultipleFkRef whiteSplitMultipleFkRefAsSplitMultipleFkTest) {
        _whiteSplitMultipleFkRefAsSplitMultipleFkTest = whiteSplitMultipleFkRefAsSplitMultipleFkTest;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'. */
    protected List<WhiteSplitMultipleFkChild> _whiteSplitMultipleFkChildList;

    /**
     * [get] white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @return The entity list of referrer property 'whiteSplitMultipleFkChildList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSplitMultipleFkChild> getWhiteSplitMultipleFkChildList() {
        if (_whiteSplitMultipleFkChildList == null) { _whiteSplitMultipleFkChildList = newReferrerList(); }
        return _whiteSplitMultipleFkChildList;
    }

    /**
     * [set] white_split_multiple_fk_child by BASE_ID, named 'whiteSplitMultipleFkChildList'.
     * @param whiteSplitMultipleFkChildList The entity list of referrer property 'whiteSplitMultipleFkChildList'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkChildList(List<WhiteSplitMultipleFkChild> whiteSplitMultipleFkChildList) {
        _whiteSplitMultipleFkChildList = whiteSplitMultipleFkChildList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSplitMultipleFkBase) {
            BsWhiteSplitMultipleFkBase other = (BsWhiteSplitMultipleFkBase)obj;
            if (!xSV(_baseId, other._baseId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _baseId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkNext != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkNext, "whiteSplitMultipleFkNext")); }
        if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkRefAsSplitMultipleFkTest, "whiteSplitMultipleFkRefAsSplitMultipleFkTest")); }
        if (_whiteSplitMultipleFkChildList != null) { for (WhiteSplitMultipleFkChild et : _whiteSplitMultipleFkChildList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSplitMultipleFkChildList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_baseId));
        sb.append(dm).append(xfND(_firstId));
        sb.append(dm).append(xfND(_nextId));
        sb.append(dm).append(xfND(_splitName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkNext != null)
        { sb.append(dm).append("whiteSplitMultipleFkNext"); }
        if (_whiteSplitMultipleFkRefAsSplitMultipleFkTest != null)
        { sb.append(dm).append("whiteSplitMultipleFkRefAsSplitMultipleFkTest"); }
        if (_whiteSplitMultipleFkChildList != null && !_whiteSplitMultipleFkChildList.isEmpty())
        { sb.append(dm).append("whiteSplitMultipleFkChildList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSplitMultipleFkBase clone() {
        return (WhiteSplitMultipleFkBase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BASE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Long baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }

    /**
     * [get] FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} <br />
     * @return The value of the column 'FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        checkSpecifiedProperty("firstId");
        return _firstId;
    }

    /**
     * [set] FIRST_ID: {NotNull, INT(10), FK to WHITE_SPLIT_MULTIPLE_FK_REF} <br />
     * @param firstId The value of the column 'FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        registerModifiedProperty("firstId");
        _firstId = firstId;
    }

    /**
     * [get] NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} <br />
     * @return The value of the column 'NEXT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextId() {
        checkSpecifiedProperty("nextId");
        return _nextId;
    }

    /**
     * [set] NEXT_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_next} <br />
     * @param nextId The value of the column 'NEXT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNextId(Long nextId) {
        registerModifiedProperty("nextId");
        _nextId = nextId;
    }

    /**
     * [get] SPLIT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SPLIT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSplitName() {
        checkSpecifiedProperty("splitName");
        return _splitName;
    }

    /**
     * [set] SPLIT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param splitName The value of the column 'SPLIT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSplitName(String splitName) {
        registerModifiedProperty("splitName");
        _splitName = splitName;
    }
}
