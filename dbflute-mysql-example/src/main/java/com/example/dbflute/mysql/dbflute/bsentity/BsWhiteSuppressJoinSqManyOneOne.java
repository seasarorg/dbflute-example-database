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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MANY_ONE_ONE_ID
 * 
 * [column]
 *     MANY_ONE_ONE_ID, MANY_ONE_ONE_NAME
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
 *     white_suppress_join_sq_many_one
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteSuppressJoinSqManyOneList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer manyOneOneId = entity.getManyOneOneId();
 * String manyOneOneName = entity.getManyOneOneName();
 * entity.setManyOneOneId(manyOneOneId);
 * entity.setManyOneOneName(manyOneOneName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOneOne extends AbstractEntity {

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
    /** MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyOneOneId;

    /** MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyOneOneName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_suppress_join_sq_many_one_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqManyOneOne";
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
        if (getManyOneOneId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'. */
    protected List<WhiteSuppressJoinSqManyOne> _whiteSuppressJoinSqManyOneList;

    /**
     * [get] white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyOneList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqManyOne> getWhiteSuppressJoinSqManyOneList() {
        if (_whiteSuppressJoinSqManyOneList == null) { _whiteSuppressJoinSqManyOneList = newReferrerList(); }
        return _whiteSuppressJoinSqManyOneList;
    }

    /**
     * [set] white_suppress_join_sq_many_one by MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneList'.
     * @param whiteSuppressJoinSqManyOneList The entity list of referrer property 'whiteSuppressJoinSqManyOneList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOneList(List<WhiteSuppressJoinSqManyOne> whiteSuppressJoinSqManyOneList) {
        _whiteSuppressJoinSqManyOneList = whiteSuppressJoinSqManyOneList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqManyOneOne) {
            BsWhiteSuppressJoinSqManyOneOne other = (BsWhiteSuppressJoinSqManyOneOne)obj;
            if (!xSV(_manyOneOneId, other._manyOneOneId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _manyOneOneId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneList != null) { for (WhiteSuppressJoinSqManyOne et : _whiteSuppressJoinSqManyOneList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqManyOneList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyOneOneId));
        sb.append(dm).append(xfND(_manyOneOneName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneList != null && !_whiteSuppressJoinSqManyOneList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqManyOneList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqManyOneOne clone() {
        return (WhiteSuppressJoinSqManyOneOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneOneId() {
        checkSpecifiedProperty("manyOneOneId");
        return _manyOneOneId;
    }

    /**
     * [set] MANY_ONE_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @param manyOneOneId The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneId(Integer manyOneOneId) {
        registerModifiedProperty("manyOneOneId");
        _manyOneOneId = manyOneOneId;
    }

    /**
     * [get] MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MANY_ONE_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyOneOneName() {
        checkSpecifiedProperty("manyOneOneName");
        return _manyOneOneName;
    }

    /**
     * [set] MANY_ONE_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param manyOneOneName The value of the column 'MANY_ONE_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneName(String manyOneOneName) {
        registerModifiedProperty("manyOneOneName");
        _manyOneOneName = manyOneOneName;
    }
}
