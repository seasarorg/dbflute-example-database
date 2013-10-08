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
 * The entity of WHITE_LINE_SEP_COMMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LINE_SEP_COMMENT_CODE
 * 
 * [column]
 *     LINE_SEP_COMMENT_CODE, LINE_SEP_COMMENT_NAME
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
 * String lineSepCommentCode = entity.getLineSepCommentCode();
 * String lineSepCommentName = entity.getLineSepCommentName();
 * entity.setLineSepCommentCode(lineSepCommentCode);
 * entity.setLineSepCommentName(lineSepCommentName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLineSepComment implements Entity, Serializable, Cloneable {

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
    /** LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} */
    protected String _lineSepCommentCode;

    /** LINE_SEP_COMMENT_NAME: {VARCHAR(20)} */
    protected String _lineSepCommentName;

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
        return "white_line_sep_comment";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteLineSepComment";
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
        if (getLineSepCommentCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lineSepCommentCode as the classification of LineSepCommentCls. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LineSepCommentCls getLineSepCommentCodeAsLineSepCommentCls() {
        return CDef.LineSepCommentCls.codeOf(getLineSepCommentCode());
    }

    /**
     * Set the value of lineSepCommentCode as the classification of LineSepCommentCls. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls cdef) {
        setLineSepCommentCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of lineSepCommentCode as First (FOO). <br />
     * First: foo first line            foo second line
     */
    public void setLineSepCommentCode_First() {
        setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls.First);
    }

    /**
     * Set the value of lineSepCommentCode as Second (BAR). <br />
     * Second: bar first line                        bar second line
     */
    public void setLineSepCommentCode_Second() {
        setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls.Second);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of lineSepCommentCode First? <br />
     * First: foo first line            foo second line
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCodeFirst() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null ? cdef.equals(CDef.LineSepCommentCls.First) : false;
    }

    /**
     * Is the value of lineSepCommentCode Second? <br />
     * Second: bar first line                        bar second line
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCodeSecond() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null ? cdef.equals(CDef.LineSepCommentCls.Second) : false;
    }

    /**
     * group first line                    group second line <br />
     * The group elements:[First, Second]
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCode_LineGroup() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null && cdef.isLineGroup();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'lineSepCommentCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLineSepCommentCodeName() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWhiteLineSepComment)) { return false; }
        BsWhiteLineSepComment otherEntity = (BsWhiteLineSepComment)other;
        if (!xSV(getLineSepCommentCode(), otherEntity.getLineSepCommentCode())) { return false; }
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
        result = xCH(result, getLineSepCommentCode());
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
        String delimiter = ", ";
        sb.append(delimiter).append(getLineSepCommentCode());
        sb.append(delimiter).append(getLineSepCommentName());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
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
    public WhiteLineSepComment clone() {
        try {
            return (WhiteLineSepComment)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * @return The value of the column 'LINE_SEP_COMMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLineSepCommentCode() {
        return _lineSepCommentCode;
    }

    /**
     * [set] LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * @param lineSepCommentCode The value of the column 'LINE_SEP_COMMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLineSepCommentCode(String lineSepCommentCode) {
        __modifiedProperties.addPropertyName("lineSepCommentCode");
        this._lineSepCommentCode = lineSepCommentCode;
    }

    /**
     * [get] LINE_SEP_COMMENT_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'LINE_SEP_COMMENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineSepCommentName() {
        return _lineSepCommentName;
    }

    /**
     * [set] LINE_SEP_COMMENT_NAME: {VARCHAR(20)} <br />
     * @param lineSepCommentName The value of the column 'LINE_SEP_COMMENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineSepCommentName(String lineSepCommentName) {
        __modifiedProperties.addPropertyName("lineSepCommentName");
        this._lineSepCommentName = lineSepCommentName;
    }
}
