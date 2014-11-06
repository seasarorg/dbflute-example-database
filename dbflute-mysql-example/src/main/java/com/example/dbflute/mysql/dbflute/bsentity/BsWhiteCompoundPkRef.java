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
 * The entity of WHITE_COMPOUND_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID
 * 
 * [column]
 *     MULTIPLE_FIRST_ID, MULTIPLE_SECOND_ID, REF_FIRST_ID, REF_SECOND_ID, REF_NAME
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
 *     white_compound_pk
 * 
 * [referrer table]
 *     white_compound_pk_ref_nest
 * 
 * [foreign property]
 *     whiteCompoundPk
 * 
 * [referrer property]
 *     whiteCompoundPkRefNestByQuxMultipleIdList, whiteCompoundPkRefNestByFooMultipleIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refFirstId = entity.getRefFirstId();
 * Integer refSecondId = entity.getRefSecondId();
 * String refName = entity.getRefName();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefFirstId(refFirstId);
 * entity.setRefSecondId(refSecondId);
 * entity.setRefName(refName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRef extends AbstractEntity {

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
    /** MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleFirstId;

    /** MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} */
    protected Integer _multipleSecondId;

    /** REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} */
    protected Integer _refFirstId;

    /** REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk} */
    protected Integer _refSecondId;

    /** REF_NAME: {NotNull, VARCHAR(50)} */
    protected String _refName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRef";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'. */
    protected WhiteCompoundPk _whiteCompoundPk;

    /**
     * [get] white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @return The entity of foreign property 'whiteCompoundPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPk() {
        return _whiteCompoundPk;
    }

    /**
     * [set] white_compound_pk by my REF_FIRST_ID, REF_SECOND_ID, named 'whiteCompoundPk'.
     * @param whiteCompoundPk The entity of foreign property 'whiteCompoundPk'. (NullAllowed)
     */
    public void setWhiteCompoundPk(WhiteCompoundPk whiteCompoundPk) {
        _whiteCompoundPk = whiteCompoundPk;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'. */
    protected List<WhiteCompoundPkRefNest> _whiteCompoundPkRefNestByQuxMultipleIdList;

    /**
     * [get] white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefNestByQuxMultipleIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefNest> getWhiteCompoundPkRefNestByQuxMultipleIdList() {
        if (_whiteCompoundPkRefNestByQuxMultipleIdList == null) { _whiteCompoundPkRefNestByQuxMultipleIdList = newReferrerList(); }
        return _whiteCompoundPkRefNestByQuxMultipleIdList;
    }

    /**
     * [set] white_compound_pk_ref_nest by BAR_MULTIPLE_ID, QUX_MULTIPLE_ID, named 'whiteCompoundPkRefNestByQuxMultipleIdList'.
     * @param whiteCompoundPkRefNestByQuxMultipleIdList The entity list of referrer property 'whiteCompoundPkRefNestByQuxMultipleIdList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefNestByQuxMultipleIdList(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestByQuxMultipleIdList) {
        _whiteCompoundPkRefNestByQuxMultipleIdList = whiteCompoundPkRefNestByQuxMultipleIdList;
    }

    /** white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'. */
    protected List<WhiteCompoundPkRefNest> _whiteCompoundPkRefNestByFooMultipleIdList;

    /**
     * [get] white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefNestByFooMultipleIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRefNest> getWhiteCompoundPkRefNestByFooMultipleIdList() {
        if (_whiteCompoundPkRefNestByFooMultipleIdList == null) { _whiteCompoundPkRefNestByFooMultipleIdList = newReferrerList(); }
        return _whiteCompoundPkRefNestByFooMultipleIdList;
    }

    /**
     * [set] white_compound_pk_ref_nest by FOO_MULTIPLE_ID, BAR_MULTIPLE_ID, named 'whiteCompoundPkRefNestByFooMultipleIdList'.
     * @param whiteCompoundPkRefNestByFooMultipleIdList The entity list of referrer property 'whiteCompoundPkRefNestByFooMultipleIdList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefNestByFooMultipleIdList(List<WhiteCompoundPkRefNest> whiteCompoundPkRefNestByFooMultipleIdList) {
        _whiteCompoundPkRefNestByFooMultipleIdList = whiteCompoundPkRefNestByFooMultipleIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundPkRef) {
            BsWhiteCompoundPkRef other = (BsWhiteCompoundPkRef)obj;
            if (!xSV(_multipleFirstId, other._multipleFirstId)) { return false; }
            if (!xSV(_multipleSecondId, other._multipleSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _multipleFirstId);
        hs = xCH(hs, _multipleSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPk, "whiteCompoundPk")); }
        if (_whiteCompoundPkRefNestByQuxMultipleIdList != null) { for (WhiteCompoundPkRefNest et : _whiteCompoundPkRefNestByQuxMultipleIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefNestByQuxMultipleIdList")); } } }
        if (_whiteCompoundPkRefNestByFooMultipleIdList != null) { for (WhiteCompoundPkRefNest et : _whiteCompoundPkRefNestByFooMultipleIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefNestByFooMultipleIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_multipleFirstId));
        sb.append(dm).append(xfND(_multipleSecondId));
        sb.append(dm).append(xfND(_refFirstId));
        sb.append(dm).append(xfND(_refSecondId));
        sb.append(dm).append(xfND(_refName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null)
        { sb.append(dm).append("whiteCompoundPk"); }
        if (_whiteCompoundPkRefNestByQuxMultipleIdList != null && !_whiteCompoundPkRefNestByQuxMultipleIdList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkRefNestByQuxMultipleIdList"); }
        if (_whiteCompoundPkRefNestByFooMultipleIdList != null && !_whiteCompoundPkRefNestByFooMultipleIdList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkRefNestByFooMultipleIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRef clone() {
        return (WhiteCompoundPkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        checkSpecifiedProperty("multipleFirstId");
        return _multipleFirstId;
    }

    /**
     * [set] MULTIPLE_FIRST_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleFirstId The value of the column 'MULTIPLE_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        registerModifiedProperty("multipleFirstId");
        _multipleFirstId = multipleFirstId;
    }

    /**
     * [get] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        checkSpecifiedProperty("multipleSecondId");
        return _multipleSecondId;
    }

    /**
     * [set] MULTIPLE_SECOND_ID: {PK, NotNull, INT(10)} <br />
     * @param multipleSecondId The value of the column 'MULTIPLE_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        registerModifiedProperty("multipleSecondId");
        _multipleSecondId = multipleSecondId;
    }

    /**
     * [get] REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} <br />
     * @return The value of the column 'REF_FIRST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefFirstId() {
        checkSpecifiedProperty("refFirstId");
        return _refFirstId;
    }

    /**
     * [set] REF_FIRST_ID: {IX+, NotNull, INT(10), FK to white_compound_pk} <br />
     * @param refFirstId The value of the column 'REF_FIRST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefFirstId(Integer refFirstId) {
        registerModifiedProperty("refFirstId");
        _refFirstId = refFirstId;
    }

    /**
     * [get] REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk} <br />
     * @return The value of the column 'REF_SECOND_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefSecondId() {
        checkSpecifiedProperty("refSecondId");
        return _refSecondId;
    }

    /**
     * [set] REF_SECOND_ID: {NotNull, INT(10), FK to white_compound_pk} <br />
     * @param refSecondId The value of the column 'REF_SECOND_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefSecondId(Integer refSecondId) {
        registerModifiedProperty("refSecondId");
        _refSecondId = refSecondId;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        checkSpecifiedProperty("refName");
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR(50)} <br />
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        registerModifiedProperty("refName");
        _refName = refName;
    }
}
