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

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     FOO_CODE, BAR_CODE, QUX_CODE
 * 
 * [column]
 *     FOO_CODE, BAR_CODE, QUX_CODE
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
 * String fooCode = entity.getFooCode();
 * String barCode = entity.getBarCode();
 * String quxCode = entity.getQuxCode();
 * entity.setFooCode(fooCode);
 * entity.setBarCode(barCode);
 * entity.setQuxCode(quxCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsCompoundPkRef implements Entity, Serializable, Cloneable {

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
    /** FOO_CODE: {PK, UQ, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _fooCode;

    /** BAR_CODE: {PK, UQ+, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _barCode;

    /** QUX_CODE: {PK, UQ+, NotNull, CHAR(3)} */
    protected String _quxCode;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
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
        return "white_all_in_one_cls_compound_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteAllInOneClsCompoundPkRef";
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
     * white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @return The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteAllInOneClsElement getWhiteAllInOneClsElementAsFoo() {
        return _whiteAllInOneClsElementAsFoo;
    }

    /**
     * white_all_in_one_cls_element by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @param whiteAllInOneClsElementAsFoo The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementAsFoo(WhiteAllInOneClsElement whiteAllInOneClsElementAsFoo) {
        _whiteAllInOneClsElementAsFoo = whiteAllInOneClsElementAsFoo;
    }

    /** white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'. */
    protected WhiteAllInOneClsElement _whiteAllInOneClsElementAsBar;

    /**
     * white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @return The entity of foreign property 'whiteAllInOneClsElementAsBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteAllInOneClsElement getWhiteAllInOneClsElementAsBar() {
        return _whiteAllInOneClsElementAsBar;
    }

    /**
     * white_all_in_one_cls_element by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteAllInOneClsCompoundPkRef)) { return false; }
        BsWhiteAllInOneClsCompoundPkRef otherEntity = (BsWhiteAllInOneClsCompoundPkRef)other;
        if (!xSV(getFooCode(), otherEntity.getFooCode())) { return false; }
        if (!xSV(getBarCode(), otherEntity.getBarCode())) { return false; }
        if (!xSV(getQuxCode(), otherEntity.getQuxCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getFooCode());
        result = xCH(result, getBarCode());
        result = xCH(result, getQuxCode());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_whiteAllInOneClsElementAsFoo != null)
        { sb.append(l).append(xbRDS(_whiteAllInOneClsElementAsFoo, "whiteAllInOneClsElementAsFoo")); }
        if (_whiteAllInOneClsElementAsBar != null)
        { sb.append(l).append(xbRDS(_whiteAllInOneClsElementAsBar, "whiteAllInOneClsElementAsBar")); }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getFooCode());
        sb.append(delimiter).append(getBarCode());
        sb.append(delimiter).append(getQuxCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteAllInOneClsElementAsFoo != null) { sb.append(c).append("whiteAllInOneClsElementAsFoo"); }
        if (_whiteAllInOneClsElementAsBar != null) { sb.append(c).append("whiteAllInOneClsElementAsBar"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteAllInOneClsCompoundPkRef clone() {
        try {
            return (WhiteAllInOneClsCompoundPkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOO_CODE: {PK, UQ, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @return The value of the column 'FOO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFooCode() {
        return _fooCode;
    }

    /**
     * [set] FOO_CODE: {PK, UQ, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @param fooCode The value of the column 'FOO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFooCode(String fooCode) {
        __modifiedProperties.addPropertyName("fooCode");
        this._fooCode = fooCode;
    }

    /**
     * [get] BAR_CODE: {PK, UQ+, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @return The value of the column 'BAR_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBarCode() {
        return _barCode;
    }

    /**
     * [set] BAR_CODE: {PK, UQ+, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br />
     * @param barCode The value of the column 'BAR_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBarCode(String barCode) {
        __modifiedProperties.addPropertyName("barCode");
        this._barCode = barCode;
    }

    /**
     * [get] QUX_CODE: {PK, UQ+, NotNull, CHAR(3)} <br />
     * @return The value of the column 'QUX_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getQuxCode() {
        return _quxCode;
    }

    /**
     * [set] QUX_CODE: {PK, UQ+, NotNull, CHAR(3)} <br />
     * @param quxCode The value of the column 'QUX_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setQuxCode(String quxCode) {
        __modifiedProperties.addPropertyName("quxCode");
        this._quxCode = quxCode;
    }
}
