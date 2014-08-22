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
 * The entity of WHITE_PERROTTA_OVER_PRODUCT_NESTED as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_NESTED_CODE
 * 
 * [column]
 *     PRODUCT_NESTED_CODE, PRODUCT_NESTED_NAME
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
 *     white_perrotta_over_product
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePerrottaOverProductList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productNestedCode = entity.getProductNestedCode();
 * String productNestedName = entity.getProductNestedName();
 * entity.setProductNestedCode(productNestedCode);
 * entity.setProductNestedName(productNestedName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverProductNested implements Entity, Serializable, Cloneable {

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
    /** PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productNestedCode;

    /** PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} */
    protected String _productNestedName;

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
        return "white_perrotta_over_product_nested";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverProductNested";
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
        if (getProductNestedCode() == null) { return false; }
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'. */
    protected List<WhitePerrottaOverProduct> _whitePerrottaOverProductList;

    /**
     * [get] white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * @return The entity list of referrer property 'whitePerrottaOverProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePerrottaOverProduct> getWhitePerrottaOverProductList() {
        if (_whitePerrottaOverProductList == null) { _whitePerrottaOverProductList = newReferrerList(); }
        return _whitePerrottaOverProductList;
    }

    /**
     * [set] white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * @param whitePerrottaOverProductList The entity list of referrer property 'whitePerrottaOverProductList'. (NullAllowed)
     */
    public void setWhitePerrottaOverProductList(List<WhitePerrottaOverProduct> whitePerrottaOverProductList) {
        _whitePerrottaOverProductList = whitePerrottaOverProductList;
    }

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
        if (obj == null || !(obj instanceof BsWhitePerrottaOverProductNested)) { return false; }
        BsWhitePerrottaOverProductNested other = (BsWhitePerrottaOverProductNested)obj;
        if (!xSV(getProductNestedCode(), other.getProductNestedCode())) { return false; }
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
        hs = xCH(hs, getProductNestedCode());
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
        if (_whitePerrottaOverProductList != null) { for (Entity et : _whitePerrottaOverProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePerrottaOverProductList")); } } }
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
        sb.append(dm).append(getProductNestedCode());
        sb.append(dm).append(getProductNestedName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whitePerrottaOverProductList != null && !_whitePerrottaOverProductList.isEmpty())
        { sb.append(cm).append("whitePerrottaOverProductList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhitePerrottaOverProductNested clone() {
        try {
            return (WhitePerrottaOverProductNested)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedCode() {
        return _productNestedCode;
    }

    /**
     * [set] PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productNestedCode The value of the column 'PRODUCT_NESTED_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedCode(String productNestedCode) {
        __modifiedProperties.addPropertyName("productNestedCode");
        _productNestedCode = productNestedCode;
    }

    /**
     * [get] PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'PRODUCT_NESTED_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductNestedName() {
        return _productNestedName;
    }

    /**
     * [set] PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)} <br />
     * @param productNestedName The value of the column 'PRODUCT_NESTED_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductNestedName(String productNestedName) {
        __modifiedProperties.addPropertyName("productNestedName");
        _productNestedName = productNestedName;
    }
}
