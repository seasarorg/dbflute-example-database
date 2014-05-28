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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_ESCAPED_JAVA_DOC as TABLE. <br />
 * <pre>
 * [primary-key]
 *     ESCAPED_JAVA_DOC_CODE
 * 
 * [column]
 *     ESCAPED_JAVA_DOC_CODE, ESCAPED_JAVA_DOC_NAME
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
 * String escapedJavaDocCode = entity.getEscapedJavaDocCode();
 * String escapedJavaDocName = entity.getEscapedJavaDocName();
 * entity.setEscapedJavaDocCode(escapedJavaDocCode);
 * entity.setEscapedJavaDocName(escapedJavaDocName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedJavaDoc implements Entity, Serializable, Cloneable {

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
    /** ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} */
    protected String _escapedJavaDocCode;

    /** ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} */
    protected String _escapedJavaDocName;

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
        return "white_escaped_java_doc";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteEscapedJavaDoc";
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
        if (getEscapedJavaDocCode() == null) { return false; }
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
     * Get the value of escapedJavaDocCode as the classification of EscapedJavaDocCls. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedJavaDocCls getEscapedJavaDocCodeAsEscapedJavaDocCls() {
        return CDef.EscapedJavaDocCls.codeOf(getEscapedJavaDocCode());
    }

    /**
     * Set the value of escapedJavaDocCode as the classification of EscapedJavaDocCls. <br />
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * /*IF pmb.yourTop&#42;/&gt;&lt;&
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls cdef) {
        setEscapedJavaDocCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of escapedJavaDocCode as First (FOO). <br />
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_First() {
        setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls.First);
    }

    /**
     * Set the value of escapedJavaDocCode as Second (BAR). <br />
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&
     */
    public void setEscapedJavaDocCode_Second() {
        setEscapedJavaDocCodeAsEscapedJavaDocCls(CDef.EscapedJavaDocCls.Second);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of escapedJavaDocCode First? <br />
     * First: /*IF pmb.yourFooComment&#42;/&gt;&lt;&
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCodeFirst() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.equals(CDef.EscapedJavaDocCls.First) : false;
    }

    /**
     * Is the value of escapedJavaDocCode Second? <br />
     * Second: /*IF pmb.yourBarComment&#42;/&gt;&lt;&
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCodeSecond() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.equals(CDef.EscapedJavaDocCls.Second) : false;
    }

    /**
     * /*IF pmb.yourGroup&#42;/&gt;&lt;& <br />
     * The group elements:[First, Second]
     * @return The determination, true or false.
     */
    public boolean isEscapedJavaDocCode_LineGroup() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null && cdef.isLineGroup();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'escapedJavaDocCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEscapedJavaDocCodeName() {
        CDef.EscapedJavaDocCls cdef = getEscapedJavaDocCodeAsEscapedJavaDocCls();
        return cdef != null ? cdef.name() : null;
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
        if (obj == null || !(obj instanceof BsWhiteEscapedJavaDoc)) { return false; }
        BsWhiteEscapedJavaDoc other = (BsWhiteEscapedJavaDoc)obj;
        if (!xSV(getEscapedJavaDocCode(), other.getEscapedJavaDocCode())) { return false; }
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
        hs = xCH(hs, getEscapedJavaDocCode());
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
        sb.append(dm).append(getEscapedJavaDocCode());
        sb.append(dm).append(getEscapedJavaDocName());
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
    public WhiteEscapedJavaDoc clone() {
        try {
            return (WhiteEscapedJavaDoc)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * @return The value of the column 'ESCAPED_JAVA_DOC_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getEscapedJavaDocCode() {
        return _escapedJavaDocCode;
    }

    /**
     * [set] ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls} <br />
     * @param escapedJavaDocCode The value of the column 'ESCAPED_JAVA_DOC_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setEscapedJavaDocCode(String escapedJavaDocCode) {
        __modifiedProperties.addPropertyName("escapedJavaDocCode");
        this._escapedJavaDocCode = escapedJavaDocCode;
    }

    /**
     * [get] ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'ESCAPED_JAVA_DOC_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getEscapedJavaDocName() {
        return _escapedJavaDocName;
    }

    /**
     * [set] ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)} <br />
     * @param escapedJavaDocName The value of the column 'ESCAPED_JAVA_DOC_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEscapedJavaDocName(String escapedJavaDocName) {
        __modifiedProperties.addPropertyName("escapedJavaDocName");
        this._escapedJavaDocName = escapedJavaDocName;
    }
}
