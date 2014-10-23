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
 * The entity of WHITE_ALL_IN_ONE_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE
 * 
 * [column]
 *     CLS_CATEGORY_CODE, CLS_ELEMENT_CODE, CLS_ELEMENT_NAME, ATTRIBUTE_EXP
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
 *     white_all_in_one_cls_category
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteAllInOneClsCategory
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String clsCategoryCode = entity.getClsCategoryCode();
 * String clsElementCode = entity.getClsElementCode();
 * String clsElementName = entity.getClsElementName();
 * String attributeExp = entity.getAttributeExp();
 * entity.setClsCategoryCode(clsCategoryCode);
 * entity.setClsElementCode(clsElementCode);
 * entity.setClsElementName(clsElementName);
 * entity.setAttributeExp(attributeExp);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsElement extends AbstractEntity {

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
    /** CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} */
    protected String _clsCategoryCode;

    /** CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} */
    protected String _clsElementCode;

    /** CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} */
    protected String _clsElementName;

    /** ATTRIBUTE_EXP: {NotNull, TEXT(65535)} */
    protected String _attributeExp;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_all_in_one_cls_element";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteAllInOneClsElement";
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
        if (getClsCategoryCode() == null) { return false; }
        if (getClsElementCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'. */
    protected WhiteAllInOneClsCategory _whiteAllInOneClsCategory;

    /**
     * [get] white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @return The entity of foreign property 'whiteAllInOneClsCategory'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteAllInOneClsCategory getWhiteAllInOneClsCategory() {
        return _whiteAllInOneClsCategory;
    }

    /**
     * [set] white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @param whiteAllInOneClsCategory The entity of foreign property 'whiteAllInOneClsCategory'. (NullAllowed)
     */
    public void setWhiteAllInOneClsCategory(WhiteAllInOneClsCategory whiteAllInOneClsCategory) {
        _whiteAllInOneClsCategory = whiteAllInOneClsCategory;
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
        if (obj instanceof BsWhiteAllInOneClsElement) {
            BsWhiteAllInOneClsElement other = (BsWhiteAllInOneClsElement)obj;
            if (!xSV(_clsCategoryCode, other._clsCategoryCode)) { return false; }
            if (!xSV(_clsElementCode, other._clsElementCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _clsCategoryCode);
        hs = xCH(hs, _clsElementCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsCategory != null)
        { sb.append(li).append(xbRDS(_whiteAllInOneClsCategory, "whiteAllInOneClsCategory")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clsCategoryCode));
        sb.append(dm).append(xfND(_clsElementCode));
        sb.append(dm).append(xfND(_clsElementName));
        sb.append(dm).append(xfND(_attributeExp));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsCategory != null) { sb.append(dm).append("whiteAllInOneClsCategory"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteAllInOneClsElement clone() {
        return (WhiteAllInOneClsElement)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br />
     * @return The value of the column 'CLS_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getClsCategoryCode() {
        checkSpecifiedProperty("clsCategoryCode");
        return _clsCategoryCode;
    }

    /**
     * [set] CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br />
     * @param clsCategoryCode The value of the column 'CLS_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setClsCategoryCode(String clsCategoryCode) {
        __modifiedProperties.addPropertyName("clsCategoryCode");
        _clsCategoryCode = clsCategoryCode;
    }

    /**
     * [get] CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'CLS_ELEMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getClsElementCode() {
        checkSpecifiedProperty("clsElementCode");
        return _clsElementCode;
    }

    /**
     * [set] CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param clsElementCode The value of the column 'CLS_ELEMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setClsElementCode(String clsElementCode) {
        __modifiedProperties.addPropertyName("clsElementCode");
        _clsElementCode = clsElementCode;
    }

    /**
     * [get] CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} <br />
     * @return The value of the column 'CLS_ELEMENT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getClsElementName() {
        checkSpecifiedProperty("clsElementName");
        return _clsElementName;
    }

    /**
     * [set] CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)} <br />
     * @param clsElementName The value of the column 'CLS_ELEMENT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setClsElementName(String clsElementName) {
        __modifiedProperties.addPropertyName("clsElementName");
        _clsElementName = clsElementName;
    }

    /**
     * [get] ATTRIBUTE_EXP: {NotNull, TEXT(65535)} <br />
     * @return The value of the column 'ATTRIBUTE_EXP'. (basically NotNull if selected: for the constraint)
     */
    public String getAttributeExp() {
        checkSpecifiedProperty("attributeExp");
        return _attributeExp;
    }

    /**
     * [set] ATTRIBUTE_EXP: {NotNull, TEXT(65535)} <br />
     * @param attributeExp The value of the column 'ATTRIBUTE_EXP'. (basically NotNull if update: for the constraint)
     */
    public void setAttributeExp(String attributeExp) {
        __modifiedProperties.addPropertyName("attributeExp");
        _attributeExp = attributeExp;
    }
}
