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

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
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
public abstract class BsWhiteAllInOneClsElement implements Entity, Serializable, Cloneable {

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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

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

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
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
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteAllInOneClsElement)) { return false; }
        BsWhiteAllInOneClsElement other = (BsWhiteAllInOneClsElement)obj;
        if (!xSV(getClsCategoryCode(), other.getClsCategoryCode())) { return false; }
        if (!xSV(getClsElementCode(), other.getClsElementCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getClsCategoryCode());
        hs = xCH(hs, getClsElementCode());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String li = "\n  ";
        if (_whiteAllInOneClsCategory != null)
        { sb.append(li).append(xbRDS(_whiteAllInOneClsCategory, "whiteAllInOneClsCategory")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getClsCategoryCode());
        sb.append(dm).append(getClsElementCode());
        sb.append(dm).append(getClsElementName());
        sb.append(dm).append(getAttributeExp());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteAllInOneClsCategory != null) { sb.append(cm).append("whiteAllInOneClsCategory"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteAllInOneClsElement clone() {
        try {
            return (WhiteAllInOneClsElement)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category} <br />
     * @return The value of the column 'CLS_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getClsCategoryCode() {
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
