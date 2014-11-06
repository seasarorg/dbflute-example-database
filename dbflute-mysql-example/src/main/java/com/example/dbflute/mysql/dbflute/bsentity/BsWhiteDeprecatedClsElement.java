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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_DEPRECATED_CLS_ELEMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DEPRECATED_CLS_ELEMENT_CODE
 * 
 * [column]
 *     DEPRECATED_CLS_ELEMENT_CODE, DEPRECATED_CLS_ELEMENT_NAME
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
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String deprecatedClsElementCode = entity.getDeprecatedClsElementCode();
 * String deprecatedClsElementName = entity.getDeprecatedClsElementName();
 * entity.setDeprecatedClsElementCode(deprecatedClsElementCode);
 * entity.setDeprecatedClsElementName(deprecatedClsElementName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDeprecatedClsElement extends AbstractEntity {

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
    /** DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} */
    protected String _deprecatedClsElementCode;

    /** DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} */
    protected String _deprecatedClsElementName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_deprecated_cls_element";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteDeprecatedClsElement";
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
        if (getDeprecatedClsElementCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of deprecatedClsElementCode as the classification of DeprecatedMapCollaborationType. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DeprecatedMapCollaborationType getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType() {
        return CDef.DeprecatedMapCollaborationType.codeOf(getDeprecatedClsElementCode());
    }

    /**
     * Set the value of deprecatedClsElementCode as the classification of DeprecatedMapCollaborationType. <br />
     * DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * has deprecated element
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType cdef) {
        setDeprecatedClsElementCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of deprecatedClsElementCode as FooName (FOO). <br />
     * FooName
     */
    public void setDeprecatedClsElementCode_FooName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.FooName);
    }

    /**
     * Set the value of deprecatedClsElementCode as BarName (BAR). <br />
     * BarBar: here (deprecated: test of deprecated)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_BarName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.BarName);
    }

    /**
     * Set the value of deprecatedClsElementCode as QuxName (QUX). <br />
     * QuxQux: (deprecated: no original comment)
     */
    @Deprecated
    public void setDeprecatedClsElementCode_QuxName() {
        setDeprecatedClsElementCodeAsDeprecatedMapCollaborationType(CDef.DeprecatedMapCollaborationType.QuxName);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of deprecatedClsElementCode FooName? <br />
     * FooName
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDeprecatedClsElementCodeFooName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.FooName) : false;
    }

    /**
     * Is the value of deprecatedClsElementCode BarName? <br />
     * BarBar: here (deprecated: test of deprecated)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    @Deprecated
    public boolean isDeprecatedClsElementCodeBarName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.BarName) : false;
    }

    /**
     * Is the value of deprecatedClsElementCode QuxName? <br />
     * QuxQux: (deprecated: no original comment)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    @Deprecated
    public boolean isDeprecatedClsElementCodeQuxName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.equals(CDef.DeprecatedMapCollaborationType.QuxName) : false;
    }

    /**
     * contains deprecated element here <br />
     * The group elements:[FooName, BarName]
     * @return The determination, true or false.
     */
    public boolean isDeprecatedClsElementCode_ContainsDeprecated() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null && cdef.isContainsDeprecated();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'deprecatedClsElementCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDeprecatedClsElementCodeName() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'deprecatedClsElementCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDeprecatedClsElementCodeAlias() {
        CDef.DeprecatedMapCollaborationType cdef = getDeprecatedClsElementCodeAsDeprecatedMapCollaborationType();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteDeprecatedClsElement) {
            BsWhiteDeprecatedClsElement other = (BsWhiteDeprecatedClsElement)obj;
            if (!xSV(_deprecatedClsElementCode, other._deprecatedClsElementCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _deprecatedClsElementCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_deprecatedClsElementCode));
        sb.append(dm).append(xfND(_deprecatedClsElementName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteDeprecatedClsElement clone() {
        return (WhiteDeprecatedClsElement)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * @return The value of the column 'DEPRECATED_CLS_ELEMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getDeprecatedClsElementCode() {
        checkSpecifiedProperty("deprecatedClsElementCode");
        return _deprecatedClsElementCode;
    }

    /**
     * [set] DEPRECATED_CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3), classification=DeprecatedMapCollaborationType} <br />
     * @param deprecatedClsElementCode The value of the column 'DEPRECATED_CLS_ELEMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setDeprecatedClsElementCode(String deprecatedClsElementCode) {
        checkClassificationCode("DEPRECATED_CLS_ELEMENT_CODE", CDef.DefMeta.DeprecatedMapCollaborationType, deprecatedClsElementCode);
        registerModifiedProperty("deprecatedClsElementCode");
        _deprecatedClsElementCode = deprecatedClsElementCode;
    }

    /**
     * [get] DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'DEPRECATED_CLS_ELEMENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeprecatedClsElementName() {
        checkSpecifiedProperty("deprecatedClsElementName");
        return _deprecatedClsElementName;
    }

    /**
     * [set] DEPRECATED_CLS_ELEMENT_NAME: {VARCHAR(20)} <br />
     * @param deprecatedClsElementName The value of the column 'DEPRECATED_CLS_ELEMENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeprecatedClsElementName(String deprecatedClsElementName) {
        registerModifiedProperty("deprecatedClsElementName");
        _deprecatedClsElementName = deprecatedClsElementName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param deprecatedClsElementCode The value of the column 'DEPRECATED_CLS_ELEMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDeprecatedClsElementCode(String deprecatedClsElementCode) {
        setDeprecatedClsElementCode(deprecatedClsElementCode);
    }
}
