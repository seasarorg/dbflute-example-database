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
 * The entity of WHITE_ALL_IN_ONE_CLS_CATEGORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CLS_CATEGORY_CODE
 * 
 * [column]
 *     CLS_CATEGORY_CODE, CLS_CATEGORY_NAME, DESCRIPTION
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
 *     white_all_in_one_cls_element
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteAllInOneClsElementList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String clsCategoryCode = entity.getClsCategoryCode();
 * String clsCategoryName = entity.getClsCategoryName();
 * String description = entity.getDescription();
 * entity.setClsCategoryCode(clsCategoryCode);
 * entity.setClsCategoryName(clsCategoryName);
 * entity.setDescription(description);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsCategory extends AbstractEntity {

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
    /** CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} */
    protected String _clsCategoryCode;

    /** CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} */
    protected String _clsCategoryName;

    /** DESCRIPTION: {NotNull, VARCHAR(50)} */
    protected String _description;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_all_in_one_cls_category";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteAllInOneClsCategory";
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
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'. */
    protected List<WhiteAllInOneClsElement> _whiteAllInOneClsElementList;

    /**
     * [get] white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * @return The entity list of referrer property 'whiteAllInOneClsElementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteAllInOneClsElement> getWhiteAllInOneClsElementList() {
        if (_whiteAllInOneClsElementList == null) { _whiteAllInOneClsElementList = newReferrerList(); }
        return _whiteAllInOneClsElementList;
    }

    /**
     * [set] white_all_in_one_cls_element by CLS_CATEGORY_CODE, named 'whiteAllInOneClsElementList'.
     * @param whiteAllInOneClsElementList The entity list of referrer property 'whiteAllInOneClsElementList'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementList(List<WhiteAllInOneClsElement> whiteAllInOneClsElementList) {
        _whiteAllInOneClsElementList = whiteAllInOneClsElementList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteAllInOneClsCategory) {
            BsWhiteAllInOneClsCategory other = (BsWhiteAllInOneClsCategory)obj;
            if (!xSV(_clsCategoryCode, other._clsCategoryCode)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementList != null) { for (WhiteAllInOneClsElement et : _whiteAllInOneClsElementList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteAllInOneClsElementList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_clsCategoryCode));
        sb.append(dm).append(xfND(_clsCategoryName));
        sb.append(dm).append(xfND(_description));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementList != null && !_whiteAllInOneClsElementList.isEmpty())
        { sb.append(dm).append("whiteAllInOneClsElementList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteAllInOneClsCategory clone() {
        return (WhiteAllInOneClsCategory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'CLS_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getClsCategoryCode() {
        checkSpecifiedProperty("clsCategoryCode");
        return _clsCategoryCode;
    }

    /**
     * [set] CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param clsCategoryCode The value of the column 'CLS_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setClsCategoryCode(String clsCategoryCode) {
        registerModifiedProperty("clsCategoryCode");
        _clsCategoryCode = clsCategoryCode;
    }

    /**
     * [get] CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} <br />
     * @return The value of the column 'CLS_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getClsCategoryName() {
        checkSpecifiedProperty("clsCategoryName");
        return _clsCategoryName;
    }

    /**
     * [set] CLS_CATEGORY_NAME: {NotNull, VARCHAR(20)} <br />
     * @param clsCategoryName The value of the column 'CLS_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setClsCategoryName(String clsCategoryName) {
        registerModifiedProperty("clsCategoryName");
        _clsCategoryName = clsCategoryName;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR(50)} <br />
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }
}
