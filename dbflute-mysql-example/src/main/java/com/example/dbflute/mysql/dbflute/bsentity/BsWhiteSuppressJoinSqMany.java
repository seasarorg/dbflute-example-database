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
 * The entity of WHITE_SUPPRESS_JOIN_SQ_MANY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MANY_ID
 * 
 * [column]
 *     MANY_ID, MANY_NAME, SUPPRESS_JOIN_SQ_ID, MANY_ONE_ID
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
 *     white_suppress_join_sq_many_one, white_suppress_join_sq
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSuppressJoinSqManyOne, whiteSuppressJoinSq
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer manyId = entity.getManyId();
 * String manyName = entity.getManyName();
 * Integer suppressJoinSqId = entity.getSuppressJoinSqId();
 * Integer manyOneId = entity.getManyOneId();
 * entity.setManyId(manyId);
 * entity.setManyName(manyName);
 * entity.setSuppressJoinSqId(suppressJoinSqId);
 * entity.setManyOneId(manyOneId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSuppressJoinSqMany extends AbstractEntity implements DomainEntity {

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
    /** MANY_ID: {PK, NotNull, INT(10)} */
    protected Integer _manyId;

    /** MANY_NAME: {NotNull, VARCHAR(200)} */
    protected String _manyName;

    /** SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} */
    protected Integer _suppressJoinSqId;

    /** MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} */
    protected Integer _manyOneId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_suppress_join_sq_many";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSuppressJoinSqMany";
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
        if (getManyId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'. */
    protected WhiteSuppressJoinSqManyOne _whiteSuppressJoinSqManyOne;

    /**
     * [get] white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @return The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSqManyOne getWhiteSuppressJoinSqManyOne() {
        return _whiteSuppressJoinSqManyOne;
    }

    /**
     * [set] white_suppress_join_sq_many_one by my MANY_ONE_ID, named 'whiteSuppressJoinSqManyOne'.
     * @param whiteSuppressJoinSqManyOne The entity of foreign property 'whiteSuppressJoinSqManyOne'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSqManyOne(WhiteSuppressJoinSqManyOne whiteSuppressJoinSqManyOne) {
        _whiteSuppressJoinSqManyOne = whiteSuppressJoinSqManyOne;
    }

    /** white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'. */
    protected WhiteSuppressJoinSq _whiteSuppressJoinSq;

    /**
     * [get] white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @return The entity of foreign property 'whiteSuppressJoinSq'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSuppressJoinSq getWhiteSuppressJoinSq() {
        return _whiteSuppressJoinSq;
    }

    /**
     * [set] white_suppress_join_sq by my SUPPRESS_JOIN_SQ_ID, named 'whiteSuppressJoinSq'.
     * @param whiteSuppressJoinSq The entity of foreign property 'whiteSuppressJoinSq'. (NullAllowed)
     */
    public void setWhiteSuppressJoinSq(WhiteSuppressJoinSq whiteSuppressJoinSq) {
        _whiteSuppressJoinSq = whiteSuppressJoinSq;
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
        if (obj instanceof BsWhiteSuppressJoinSqMany) {
            BsWhiteSuppressJoinSqMany other = (BsWhiteSuppressJoinSqMany)obj;
            if (!xSV(_manyId, other._manyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _manyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOne != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSqManyOne, "whiteSuppressJoinSqManyOne")); }
        if (_whiteSuppressJoinSq != null)
        { sb.append(li).append(xbRDS(_whiteSuppressJoinSq, "whiteSuppressJoinSq")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_manyId));
        sb.append(dm).append(xfND(_manyName));
        sb.append(dm).append(xfND(_suppressJoinSqId));
        sb.append(dm).append(xfND(_manyOneId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSuppressJoinSqManyOne != null)
        { sb.append(dm).append("whiteSuppressJoinSqManyOne"); }
        if (_whiteSuppressJoinSq != null)
        { sb.append(dm).append("whiteSuppressJoinSq"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSuppressJoinSqMany clone() {
        return (WhiteSuppressJoinSqMany)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MANY_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MANY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyId() {
        checkSpecifiedProperty("manyId");
        return _manyId;
    }

    /**
     * [set] MANY_ID: {PK, NotNull, INT(10)} <br />
     * @param manyId The value of the column 'MANY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyId(Integer manyId) {
        registerModifiedProperty("manyId");
        _manyId = manyId;
    }

    /**
     * [get] MANY_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MANY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getManyName() {
        checkSpecifiedProperty("manyName");
        return _manyName;
    }

    /**
     * [set] MANY_NAME: {NotNull, VARCHAR(200)} <br />
     * @param manyName The value of the column 'MANY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setManyName(String manyName) {
        registerModifiedProperty("manyName");
        _manyName = manyName;
    }

    /**
     * [get] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @return The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSuppressJoinSqId() {
        checkSpecifiedProperty("suppressJoinSqId");
        return _suppressJoinSqId;
    }

    /**
     * [set] SUPPRESS_JOIN_SQ_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq} <br />
     * @param suppressJoinSqId The value of the column 'SUPPRESS_JOIN_SQ_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSuppressJoinSqId(Integer suppressJoinSqId) {
        registerModifiedProperty("suppressJoinSqId");
        _suppressJoinSqId = suppressJoinSqId;
    }

    /**
     * [get] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br />
     * @return The value of the column 'MANY_ONE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getManyOneId() {
        checkSpecifiedProperty("manyOneId");
        return _manyOneId;
    }

    /**
     * [set] MANY_ONE_ID: {IX, NotNull, INT(10), FK to white_suppress_join_sq_many_one} <br />
     * @param manyOneId The value of the column 'MANY_ONE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setManyOneId(Integer manyOneId) {
        registerModifiedProperty("manyOneId");
        _manyOneId = manyOneId;
    }
}
