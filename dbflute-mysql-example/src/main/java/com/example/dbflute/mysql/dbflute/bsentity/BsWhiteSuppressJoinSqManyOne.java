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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MANY_ONE_ID
 * 
 * [column]
 *     MANY_ONE_ID, MANY_ONE_NAME, MANY_ONE_ONE_ID
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
 *     white_suppress_join_sq_many_one_one
 * 
 * [referrer table]
 *     white_suppress_join_sq_many
 * 
 * [foreign property]
 *     whiteSuppressJoinSqManyOneOne
 * 
 * [referrer property]
 *     whiteSuppressJoinSqManyList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer manyOneId = entity.getManyOneId();
 * String manyOneName = entity.getManyOneName();
 * Integer manyOneOneId = entity.getManyOneOneId();
 * entity.setManyOneId(manyOneId);
 * entity.setManyOneName(manyOneName);
 * entity.setManyOneOneId(manyOneOneId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqManyOne extends AbstractEntity {

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
    /** MANY_ONE_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyOneId;

    /** MANY_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyOneName;

    /** MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} */
    protected Integer _manyOneOneId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_suppress_join_sq_many_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqManyOne";
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
        if (getManyOneId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'. */
    protected WhiteSuppressJoinSqManyOneOne _whiteSuppressJoinSqManyOneOne;

    /**
     * [get] white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSqManyOneOne getWhiteSuppressJoinSqManyOneOne() {
        return _whiteSuppressJoinSqManyOneOne;
    }

    /**
     * [set] white_suppress_join_sq_many_one_one by my MANY_ONE_ONE_ID, named 'whiteSuppressJoinSqManyOneOne'.
     * @param whiteSuppressJoinSqManyOneOne The entity of foreign property 'whiteSuppressJoinSqManyOneOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOneOne(WhiteSuppressJoinSqManyOneOne whiteSuppressJoinSqManyOneOne) {
        _whiteSuppressJoinSqManyOneOne = whiteSuppressJoinSqManyOneOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'. */
    protected List<WhiteSuppressJoinSqMany> _whiteSuppressJoinSqManyList;

    /**
     * [get] white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @return The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSuppressJoinSqMany> getWhiteSuppressJoinSqManyList() {
        if (_whiteSuppressJoinSqManyList == null) { _whiteSuppressJoinSqManyList = newReferrerList(); }
        return _whiteSuppressJoinSqManyList;
    }

    /**
     * [set] white_suppress_join_sq_many by MANY_ONE_ID, named 'whiteSuppressJoinSqManyList'.
     * @param whiteSuppressJoinSqManyList The entity list of referrer property 'whiteSuppressJoinSqManyList'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyList(List<WhiteSuppressJoinSqMany> whiteSuppressJoinSqManyList) {
        _whiteSuppressJoinSqManyList = whiteSuppressJoinSqManyList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSuppressJoinSqManyOne) {
            BsWhiteSuppressJoinSqManyOne other = (BsWhiteSuppressJoinSqManyOne)obj;
            if (!xSV(_manyOneId, other._manyOneId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _manyOneId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneOne != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOneOne, "whiteSuppressJoinSqManyOneOne")); }
        if (_whiteSuppressJoinSqManyList != null) { for (WhiteSuppressJoinSqMany et : _whiteSuppressJoinSqManyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSuppressJoinSqManyList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyOneId));
        sb.append(dm).append(xfND(_manyOneName));
        sb.append(dm).append(xfND(_manyOneOneId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOneOne != null) { sb.append(dm).append("whiteSuppressJoinSqManyOneOne"); }
        if (_whiteSuppressJoinSqManyList != null && !_whiteSuppressJoinSqManyList.isEmpty())
        { sb.append(dm).append("whiteSuppressJoinSqManyList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqManyOne clone() {
        return (WhiteSuppressJoinSqManyOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        checkSpecifiedProperty("manyOneId");
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {PK, NotNull, INT(10)} <br />
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        __modifiedProperties.addPropertyName("manyOneId");
        _manyOneId = manyOneId;
    }

    /**
     * [get] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MANY_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyOneName() {
        checkSpecifiedProperty("manyOneName");
        return _manyOneName;
    }

    /**
     * [set] MANY_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param manyOneName The value of the column 'MANY_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneName(String manyOneName) {
        __modifiedProperties.addPropertyName("manyOneName");
        _manyOneName = manyOneName;
    }

    /**
     * [get] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br />
     * @return The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneOneId() {
        checkSpecifiedProperty("manyOneOneId");
        return _manyOneOneId;
    }

    /**
     * [set] MANY_ONE_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one_one} <br />
     * @param manyOneOneId The value of the column 'MANY_ONE_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneOneId(Integer manyOneOneId) {
        __modifiedProperties.addPropertyName("manyOneOneId");
        _manyOneOneId = manyOneOneId;
    }
}
