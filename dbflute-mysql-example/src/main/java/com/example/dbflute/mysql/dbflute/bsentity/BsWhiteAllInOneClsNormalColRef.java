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
 * The entity of WHITE_ALL_IN_ONE_CLS_NORMAL_COL_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     FOO_CODE, BAR_CODE, QUX_CODE
 * 
 * [column]
 *     CLS_REF_ID, FOO_CODE, BAR_CODE, QUX_CODE
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
 *     WHITE_ALL_IN_ONE_CLS_ELEMENT(AsFoo)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteAllInOneClsElementAsFoo, whiteAllInOneClsElementAsBar
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer clsRefId = entity.getClsRefId();
 * String fooCode = entity.getFooCode();
 * String barCode = entity.getBarCode();
 * String quxCode = entity.getQuxCode();
 * entity.setClsRefId(clsRefId);
 * entity.setFooCode(fooCode);
 * entity.setBarCode(barCode);
 * entity.setQuxCode(quxCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsNormalColRef extends AbstractEntity {

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
    /** CLS_REF_ID: {NotNull, INT(10)} */
    protected Integer _clsRefId;

    /** FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _fooCode;

    /** BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _barCode;

    /** QUX_CODE: {PK, NotNull, CHAR(3)} */
    protected String _quxCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_all_in_one_cls_normal_col_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteAllInOneClsNormalColRef";
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
        if (getFooCode() == null) { return false; }
        if (getBarCode() == null) { return false; }
        if (getQuxCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'. */
    protected WhiteAllInOneClsElement _whiteAllInOneClsElementAsFoo;

    /**
     * [get] white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @return The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteAllInOneClsElement getWhiteAllInOneClsElementAsFoo() {
        return _whiteAllInOneClsElementAsFoo;
    }

    /**
     * [set] white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @param whiteAllInOneClsElementAsFoo The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementAsFoo(WhiteAllInOneClsElement whiteAllInOneClsElementAsFoo) {
        _whiteAllInOneClsElementAsFoo = whiteAllInOneClsElementAsFoo;
    }

    /** white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'. */
    protected WhiteAllInOneClsElement _whiteAllInOneClsElementAsBar;

    /**
     * [get] white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @return The entity of foreign property 'whiteAllInOneClsElementAsBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteAllInOneClsElement getWhiteAllInOneClsElementAsBar() {
        return _whiteAllInOneClsElementAsBar;
    }

    /**
     * [set] white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @param whiteAllInOneClsElementAsBar The entity of foreign property 'whiteAllInOneClsElementAsBar'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementAsBar(WhiteAllInOneClsElement whiteAllInOneClsElementAsBar) {
        _whiteAllInOneClsElementAsBar = whiteAllInOneClsElementAsBar;
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
        if (obj instanceof BsWhiteAllInOneClsNormalColRef) {
            BsWhiteAllInOneClsNormalColRef other = (BsWhiteAllInOneClsNormalColRef)obj;
            if (!xSV(_fooCode, other._fooCode)) { return false; }
            if (!xSV(_barCode, other._barCode)) { return false; }
            if (!xSV(_quxCode, other._quxCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _fooCode);
        hs = xCH(hs, _barCode);
        hs = xCH(hs, _quxCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementAsFoo != null)
        { sb.append(li).append(xbRDS(_whiteAllInOneClsElementAsFoo, "whiteAllInOneClsElementAsFoo")); }
        if (_whiteAllInOneClsElementAsBar != null)
        { sb.append(li).append(xbRDS(_whiteAllInOneClsElementAsBar, "whiteAllInOneClsElementAsBar")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clsRefId));
        sb.append(dm).append(xfND(_fooCode));
        sb.append(dm).append(xfND(_barCode));
        sb.append(dm).append(xfND(_quxCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementAsFoo != null)
        { sb.append(dm).append("whiteAllInOneClsElementAsFoo"); }
        if (_whiteAllInOneClsElementAsBar != null)
        { sb.append(dm).append("whiteAllInOneClsElementAsBar"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteAllInOneClsNormalColRef clone() {
        return (WhiteAllInOneClsNormalColRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLS_REF_ID: {NotNull, INT(10)} <br />
     * @return The value of the column 'CLS_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getClsRefId() {
        checkSpecifiedProperty("clsRefId");
        return _clsRefId;
    }

    /**
     * [set] CLS_REF_ID: {NotNull, INT(10)} <br />
     * @param clsRefId The value of the column 'CLS_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClsRefId(Integer clsRefId) {
        registerModifiedProperty("clsRefId");
        _clsRefId = clsRefId;
    }

    /**
     * [get] FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @return The value of the column 'FOO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFooCode() {
        checkSpecifiedProperty("fooCode");
        return _fooCode;
    }

    /**
     * [set] FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @param fooCode The value of the column 'FOO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFooCode(String fooCode) {
        registerModifiedProperty("fooCode");
        _fooCode = fooCode;
    }

    /**
     * [get] BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @return The value of the column 'BAR_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBarCode() {
        checkSpecifiedProperty("barCode");
        return _barCode;
    }

    /**
     * [set] BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @param barCode The value of the column 'BAR_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBarCode(String barCode) {
        registerModifiedProperty("barCode");
        _barCode = barCode;
    }

    /**
     * [get] QUX_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'QUX_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getQuxCode() {
        checkSpecifiedProperty("quxCode");
        return _quxCode;
    }

    /**
     * [set] QUX_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param quxCode The value of the column 'QUX_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setQuxCode(String quxCode) {
        registerModifiedProperty("quxCode");
        _quxCode = quxCode;
    }
}
