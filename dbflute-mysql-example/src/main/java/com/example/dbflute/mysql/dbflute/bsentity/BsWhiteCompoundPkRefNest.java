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
 * The entity of WHITE_COMPOUND_PK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary-key]
 *     COMPOUND_PK_REF_NEST_ID
 * 
 * [column]
 *     COMPOUND_PK_REF_NEST_ID, FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, NEST_NAME
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
 *     white_compound_pk_ref
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPkRefByQuxMultipleId, whiteCompoundPkRefByFooMultipleId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer compoundPkRefNestId = entity.getCompoundPkRefNestId();
 * Integer fooMultipleId = entity.getFooMultipleId();
 * Integer barMultipleId = entity.getBarMultipleId();
 * Integer quxMultipleId = entity.getQuxMultipleId();
 * String nestName = entity.getNestName();
 * entity.setCompoundPkRefNestId(compoundPkRefNestId);
 * entity.setFooMultipleId(fooMultipleId);
 * entity.setBarMultipleId(barMultipleId);
 * entity.setQuxMultipleId(quxMultipleId);
 * entity.setNestName(nestName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRefNest extends AbstractEntity {

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
    /** COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} */
    protected Integer _compoundPkRefNestId;

    /** FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _fooMultipleId;

    /** BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _barMultipleId;

    /** QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} */
    protected Integer _quxMultipleId;

    /** NEST_NAME: {NotNull, VARCHAR(50)} */
    protected String _nestName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk_ref_nest";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRefNest";
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
        if (getCompoundPkRefNestId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'. */
    protected WhiteCompoundPkRef _whiteCompoundPkRefByQuxMultipleId;

    /**
     * [get] white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @return The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRef getWhiteCompoundPkRefByQuxMultipleId() {
        return _whiteCompoundPkRefByQuxMultipleId;
    }

    /**
     * [set] white_compound_pk_ref by my BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefByQuxMultipleId'.
     * @param whiteCompoundPkRefByQuxMultipleId The entity of foreign property 'whiteCompoundPkRefByQuxMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByQuxMultipleId(WhiteCompoundPkRef whiteCompoundPkRefByQuxMultipleId) {
        _whiteCompoundPkRefByQuxMultipleId = whiteCompoundPkRefByQuxMultipleId;
    }

    /** white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'. */
    protected WhiteCompoundPkRef _whiteCompoundPkRefByFooMultipleId;

    /**
     * [get] white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @return The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPkRef getWhiteCompoundPkRefByFooMultipleId() {
        return _whiteCompoundPkRefByFooMultipleId;
    }

    /**
     * [set] white_compound_pk_ref by my FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefByFooMultipleId'.
     * @param whiteCompoundPkRefByFooMultipleId The entity of foreign property 'whiteCompoundPkRefByFooMultipleId'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefByFooMultipleId(WhiteCompoundPkRef whiteCompoundPkRefByFooMultipleId) {
        _whiteCompoundPkRefByFooMultipleId = whiteCompoundPkRefByFooMultipleId;
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
        if (obj instanceof BsWhiteCompoundPkRefNest) {
            BsWhiteCompoundPkRefNest other = (BsWhiteCompoundPkRefNest)obj;
            if (!xSV(_compoundPkRefNestId, other._compoundPkRefNestId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _compoundPkRefNestId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefByQuxMultipleId != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefByQuxMultipleId, "whiteCompoundPkRefByQuxMultipleId")); }
        if (_whiteCompoundPkRefByFooMultipleId != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPkRefByFooMultipleId, "whiteCompoundPkRefByFooMultipleId")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_compoundPkRefNestId));
        sb.append(dm).append(xfND(_fooMultipleId));
        sb.append(dm).append(xfND(_barMultipleId));
        sb.append(dm).append(xfND(_quxMultipleId));
        sb.append(dm).append(xfND(_nestName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefByQuxMultipleId != null) { sb.append(dm).append("whiteCompoundPkRefByQuxMultipleId"); }
        if (_whiteCompoundPkRefByFooMultipleId != null) { sb.append(dm).append("whiteCompoundPkRefByFooMultipleId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRefNest clone() {
        return (WhiteCompoundPkRefNest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCompoundPkRefNestId() {
        checkSpecifiedProperty("compoundPkRefNestId");
        return _compoundPkRefNestId;
    }

    /**
     * [set] COMPOUND_PK_REF_NEST_ID: {PK, NotNull, INT(10)} <br />
     * @param compoundPkRefNestId The value of the column 'COMPOUND_PK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundPkRefNestId(Integer compoundPkRefNestId) {
        __modifiedProperties.addPropertyName("compoundPkRefNestId");
        _compoundPkRefNestId = compoundPkRefNestId;
    }

    /**
     * [get] FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFooMultipleId() {
        checkSpecifiedProperty("fooMultipleId");
        return _fooMultipleId;
    }

    /**
     * [set] FOO_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param fooMultipleId The value of the column 'FOO_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFooMultipleId(Integer fooMultipleId) {
        __modifiedProperties.addPropertyName("fooMultipleId");
        _fooMultipleId = fooMultipleId;
    }

    /**
     * [get] BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBarMultipleId() {
        checkSpecifiedProperty("barMultipleId");
        return _barMultipleId;
    }

    /**
     * [set] BAR_MULTIPLE_ID: {IX+, NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param barMultipleId The value of the column 'BAR_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setBarMultipleId(Integer barMultipleId) {
        __modifiedProperties.addPropertyName("barMultipleId");
        _barMultipleId = barMultipleId;
    }

    /**
     * [get] QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @return The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuxMultipleId() {
        checkSpecifiedProperty("quxMultipleId");
        return _quxMultipleId;
    }

    /**
     * [set] QUX_MULTIPLE_ID: {NotNull, INT(10), FK to white_compound_pk_ref} <br />
     * @param quxMultipleId The value of the column 'QUX_MULTIPLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setQuxMultipleId(Integer quxMultipleId) {
        __modifiedProperties.addPropertyName("quxMultipleId");
        _quxMultipleId = quxMultipleId;
    }

    /**
     * [get] NEST_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'NEST_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getNestName() {
        checkSpecifiedProperty("nestName");
        return _nestName;
    }

    /**
     * [set] NEST_NAME: {NotNull, VARCHAR(50)} <br />
     * @param nestName The value of the column 'NEST_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setNestName(String nestName) {
        __modifiedProperties.addPropertyName("nestName");
        _nestName = nestName;
    }
}
