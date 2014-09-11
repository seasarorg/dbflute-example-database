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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_ESCAPED_NUMBER_INITIAL as TABLE. <br />
 * <pre>
 * [primary-key]
 *     NUMBER_INITIAL_CODE
 * 
 * [column]
 *     NUMBER_INITIAL_CODE, NUMBER_INITIAL_NAME
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
 * String numberInitialCode = entity.getNumberInitialCode();
 * String numberInitialName = entity.getNumberInitialName();
 * entity.setNumberInitialCode(numberInitialCode);
 * entity.setNumberInitialName(numberInitialName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedNumberInitial implements Entity, Serializable, Cloneable {

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
    /** NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} */
    protected String _numberInitialCode;

    /** NUMBER_INITIAL_NAME: {VARCHAR(20)} */
    protected String _numberInitialName;

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
        return "white_escaped_number_initial";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteEscapedNumberInitial";
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
        if (getNumberInitialCode() == null) { return false; }
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of numberInitialCode as the classification of EscapedNumberInitialCls. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedNumberInitialCls getNumberInitialCodeAsEscapedNumberInitialCls() {
        return CDef.EscapedNumberInitialCls.codeOf(getNumberInitialCode());
    }

    /**
     * Set the value of numberInitialCode as the classification of EscapedNumberInitialCls. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls cdef) {
        setNumberInitialCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of numberInitialCode as N1Foo (1FO). <br />
     * 1Foo
     */
    public void setNumberInitialCode_N1Foo() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N1Foo);
    }

    /**
     * Set the value of numberInitialCode as N3Bar (3BA). <br />
     * 3Bar
     */
    public void setNumberInitialCode_N3Bar() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N3Bar);
    }

    /**
     * Set the value of numberInitialCode as N7Qux (7QU). <br />
     * 7Qux
     */
    public void setNumberInitialCode_N7Qux() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N7Qux);
    }

    /**
     * Set the value of numberInitialCode as Corge9 (CO9). <br />
     * Corge9
     */
    public void setNumberInitialCode_Corge9() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.Corge9);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of numberInitialCode N1Foo? <br />
     * 1Foo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN1Foo() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N1Foo) : false;
    }

    /**
     * Is the value of numberInitialCode N3Bar? <br />
     * 3Bar
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN3Bar() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N3Bar) : false;
    }

    /**
     * Is the value of numberInitialCode N7Qux? <br />
     * 7Qux
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN7Qux() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N7Qux) : false;
    }

    /**
     * Is the value of numberInitialCode Corge9? <br />
     * Corge9
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeCorge9() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.Corge9) : false;
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
        if (obj == null || !(obj instanceof BsWhiteEscapedNumberInitial)) { return false; }
        BsWhiteEscapedNumberInitial other = (BsWhiteEscapedNumberInitial)obj;
        if (!xSV(getNumberInitialCode(), other.getNumberInitialCode())) { return false; }
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
        hs = xCH(hs, getNumberInitialCode());
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
        return sb.toString();
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
        sb.append(dm).append(getNumberInitialCode());
        sb.append(dm).append(getNumberInitialName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteEscapedNumberInitial clone() {
        try {
            return (WhiteEscapedNumberInitial)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * @return The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNumberInitialCode() {
        return _numberInitialCode;
    }

    /**
     * [set] NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * @param numberInitialCode The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setNumberInitialCode(String numberInitialCode) {
        __modifiedProperties.addPropertyName("numberInitialCode");
        _numberInitialCode = numberInitialCode;
    }

    /**
     * [get] NUMBER_INITIAL_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'NUMBER_INITIAL_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberInitialName() {
        return _numberInitialName;
    }

    /**
     * [set] NUMBER_INITIAL_NAME: {VARCHAR(20)} <br />
     * @param numberInitialName The value of the column 'NUMBER_INITIAL_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberInitialName(String numberInitialName) {
        __modifiedProperties.addPropertyName("numberInitialName");
        _numberInitialName = numberInitialName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param numberInitialCode The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingNumberInitialCode(String numberInitialCode) {
        setNumberInitialCode(numberInitialCode);
    }
}
