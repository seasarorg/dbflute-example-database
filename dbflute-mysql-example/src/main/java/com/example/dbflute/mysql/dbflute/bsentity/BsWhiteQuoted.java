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
 * The entity of WHITE_QUOTED as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SELECT
 * 
 * [column]
 *     SELECT, FROM
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
 *     white_quoted_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteQuotedRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer select = entity.getSelect();
 * String from = entity.getFrom();
 * entity.setSelect(select);
 * entity.setFrom(from);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteQuoted extends AbstractEntity {

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
    /** SELECT: {PK, NotNull, INT(10)} */
    protected Integer _select;

    /** FROM: {VARCHAR(200)} */
    protected String _from;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_quoted";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteQuoted";
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
        if (getSelect() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_quoted_ref by ORDER, named 'whiteQuotedRefList'. */
    protected List<WhiteQuotedRef> _whiteQuotedRefList;

    /**
     * [get] white_quoted_ref by ORDER, named 'whiteQuotedRefList'.
     * @return The entity list of referrer property 'whiteQuotedRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteQuotedRef> getWhiteQuotedRefList() {
        if (_whiteQuotedRefList == null) { _whiteQuotedRefList = newReferrerList(); }
        return _whiteQuotedRefList;
    }

    /**
     * [set] white_quoted_ref by ORDER, named 'whiteQuotedRefList'.
     * @param whiteQuotedRefList The entity list of referrer property 'whiteQuotedRefList'. (NullAllowed)
     */
    public void setWhiteQuotedRefList(List<WhiteQuotedRef> whiteQuotedRefList) {
        _whiteQuotedRefList = whiteQuotedRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteQuoted) {
            BsWhiteQuoted other = (BsWhiteQuoted)obj;
            if (!xSV(_select, other._select)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _select);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuotedRefList != null) { for (WhiteQuotedRef et : _whiteQuotedRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteQuotedRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_select));
        sb.append(dm).append(xfND(_from));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteQuotedRefList != null && !_whiteQuotedRefList.isEmpty())
        { sb.append(dm).append("whiteQuotedRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteQuoted clone() {
        return (WhiteQuoted)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELECT: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'SELECT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSelect() {
        checkSpecifiedProperty("select");
        return _select;
    }

    /**
     * [set] SELECT: {PK, NotNull, INT(10)} <br />
     * @param select The value of the column 'SELECT'. (basically NotNull if update: for the constraint)
     */
    public void setSelect(Integer select) {
        __modifiedProperties.addPropertyName("select");
        _select = select;
    }

    /**
     * [get] FROM: {VARCHAR(200)} <br />
     * @return The value of the column 'FROM'. (NullAllowed even if selected: for no constraint)
     */
    public String getFrom() {
        checkSpecifiedProperty("from");
        return _from;
    }

    /**
     * [set] FROM: {VARCHAR(200)} <br />
     * @param from The value of the column 'FROM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFrom(String from) {
        __modifiedProperties.addPropertyName("from");
        _from = from;
    }
}
