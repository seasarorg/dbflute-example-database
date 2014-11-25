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
 * The entity of WHITE_SPLIT_MULTIPLE_FK_CHILD as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CHILD_ID
 * 
 * [column]
 *     CHILD_ID, BASE_ID, CHILD_NAME
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
 *     white_split_multiple_fk_base
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSplitMultipleFkBase
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long childId = entity.getChildId();
 * Long baseId = entity.getBaseId();
 * String childName = entity.getChildName();
 * entity.setChildId(childId);
 * entity.setBaseId(baseId);
 * entity.setChildName(childName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSplitMultipleFkChild extends AbstractEntity implements DomainEntity {

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
    /** CHILD_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _childId;

    /** BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} */
    protected Long _baseId;

    /** CHILD_NAME: {NotNull, VARCHAR(200)} */
    protected String _childName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_split_multiple_fk_child";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSplitMultipleFkChild";
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
        if (getChildId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'. */
    protected WhiteSplitMultipleFkBase _whiteSplitMultipleFkBase;

    /**
     * [get] white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @return The entity of foreign property 'whiteSplitMultipleFkBase'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSplitMultipleFkBase getWhiteSplitMultipleFkBase() {
        return _whiteSplitMultipleFkBase;
    }

    /**
     * [set] white_split_multiple_fk_base by my BASE_ID, named 'whiteSplitMultipleFkBase'.
     * @param whiteSplitMultipleFkBase The entity of foreign property 'whiteSplitMultipleFkBase'. (NullAllowed)
     */
    public void setWhiteSplitMultipleFkBase(WhiteSplitMultipleFkBase whiteSplitMultipleFkBase) {
        _whiteSplitMultipleFkBase = whiteSplitMultipleFkBase;
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
        if (obj instanceof BsWhiteSplitMultipleFkChild) {
            BsWhiteSplitMultipleFkChild other = (BsWhiteSplitMultipleFkChild)obj;
            if (!xSV(_childId, other._childId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _childId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBase != null)
        { sb.append(li).append(xbRDS(_whiteSplitMultipleFkBase, "whiteSplitMultipleFkBase")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_childId));
        sb.append(dm).append(xfND(_baseId));
        sb.append(dm).append(xfND(_childName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSplitMultipleFkBase != null)
        { sb.append(dm).append("whiteSplitMultipleFkBase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSplitMultipleFkChild clone() {
        return (WhiteSplitMultipleFkChild)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CHILD_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'CHILD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getChildId() {
        checkSpecifiedProperty("childId");
        return _childId;
    }

    /**
     * [set] CHILD_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param childId The value of the column 'CHILD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setChildId(Long childId) {
        registerModifiedProperty("childId");
        _childId = childId;
    }

    /**
     * [get] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br />
     * @return The value of the column 'BASE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getBaseId() {
        checkSpecifiedProperty("baseId");
        return _baseId;
    }

    /**
     * [set] BASE_ID: {IX, NotNull, BIGINT(19), FK to white_split_multiple_fk_base} <br />
     * @param baseId The value of the column 'BASE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBaseId(Long baseId) {
        registerModifiedProperty("baseId");
        _baseId = baseId;
    }

    /**
     * [get] CHILD_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'CHILD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getChildName() {
        checkSpecifiedProperty("childName");
        return _childName;
    }

    /**
     * [set] CHILD_NAME: {NotNull, VARCHAR(200)} <br />
     * @param childName The value of the column 'CHILD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setChildName(String childName) {
        registerModifiedProperty("childName");
        _childName = childName;
    }
}
