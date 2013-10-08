package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_SAME_NAME_REF_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_REF_ID
 * 
 * [column]
 *     REF_REF_ID, REF_REF_NAME, REF_REF_DATE
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
 * Long refRefId = entity.getRefRefId();
 * String refRefName = entity.getRefRefName();
 * java.util.Date refRefDate = entity.getRefRefDate();
 * entity.setRefRefId(refRefId);
 * entity.setRefRefName(refRefName);
 * entity.setRefRefDate(refRefDate);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteSameNameRefRef implements Entity, Serializable, Cloneable {

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
    /** REF_REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refRefId;

    /** REF_REF_NAME: {NotNull, VARCHAR2(100)} */
    protected String _refRefName;

    /** REF_REF_DATE: {NotNull, DATE(7)} */
    protected java.util.Date _refRefDate;

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
        return "WHITE_SAME_NAME_REF_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameNameRefRef";
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
        if (getRefRefId() == null) { return false; }
        return true;
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
        if (other == null || !(other instanceof BsWhiteSameNameRefRef)) { return false; }
        BsWhiteSameNameRefRef otherEntity = (BsWhiteSameNameRefRef)other;
        if (!xSV(getRefRefId(), otherEntity.getRefRefId())) { return false; }
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
        result = xCH(result, getRefRefId());
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
        sb.append(delimiter).append(getRefRefId());
        sb.append(delimiter).append(getRefRefName());
        sb.append(delimiter).append(xfUD(getRefRefDate()));
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSameNameRefRef clone() {
        try {
            return (WhiteSameNameRefRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefRefId() {
        return _refRefId;
    }

    /**
     * [set] REF_REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refRefId The value of the column 'REF_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefId(Long refRefId) {
        __modifiedProperties.addPropertyName("refRefId");
        this._refRefId = refRefId;
    }

    /**
     * [get] REF_REF_NAME: {NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'REF_REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefRefName() {
        return _refRefName;
    }

    /**
     * [set] REF_REF_NAME: {NotNull, VARCHAR2(100)} <br />
     * @param refRefName The value of the column 'REF_REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefName(String refRefName) {
        __modifiedProperties.addPropertyName("refRefName");
        this._refRefName = refRefName;
    }

    /**
     * [get] REF_REF_DATE: {NotNull, DATE(7)} <br />
     * @return The value of the column 'REF_REF_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getRefRefDate() {
        return _refRefDate;
    }

    /**
     * [set] REF_REF_DATE: {NotNull, DATE(7)} <br />
     * @param refRefDate The value of the column 'REF_REF_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setRefRefDate(java.util.Date refRefDate) {
        __modifiedProperties.addPropertyName("refRefDate");
        this._refRefDate = refRefDate;
    }
}
