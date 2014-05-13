package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of BAR_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAR_ID, BAR_NAME, BAR_DECIMAL, BAR_DATE, BAR_TIMESTAMP, BAR_CLOB
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
 * Integer barId = entity.getBarId();
 * String barName = entity.getBarName();
 * java.math.BigDecimal barDecimal = entity.getBarDecimal();
 * java.util.Date barDate = entity.getBarDate();
 * java.sql.Timestamp barTimestamp = entity.getBarTimestamp();
 * String barClob = entity.getBarClob();
 * entity.setBarId(barId);
 * entity.setBarName(barName);
 * entity.setBarDecimal(barDecimal);
 * entity.setBarDate(barDate);
 * entity.setBarTimestamp(barTimestamp);
 * entity.setBarClob(barClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsBarBean implements Entity, Serializable, Cloneable {

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
    /** BAR_ID: {NUMBER(8)} */
    protected Integer _barId;

    /** BAR_NAME: {VARCHAR2(20)} */
    protected String _barName;

    /** BAR_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _barDecimal;

    /** BAR_DATE: {DATE} */
    protected java.util.Date _barDate;

    /** BAR_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _barTimestamp;

    /** BAR_CLOB: {CLOB} */
    protected String _barClob;

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
        return "BAR_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "barBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.BarBeanDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj == null || !(obj instanceof BsBarBean)) { return false; }
        BsBarBean other = (BsBarBean)obj;
        if (!xSV(getBarId(), other.getBarId())) { return false; }
        if (!xSV(getBarName(), other.getBarName())) { return false; }
        if (!xSV(getBarDecimal(), other.getBarDecimal())) { return false; }
        if (!xSV(getBarDate(), other.getBarDate())) { return false; }
        if (!xSV(getBarTimestamp(), other.getBarTimestamp())) { return false; }
        if (!xSV(getBarClob(), other.getBarClob())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getBarId());
        result = xCH(result, getBarName());
        result = xCH(result, getBarDecimal());
        result = xCH(result, getBarDate());
        result = xCH(result, getBarTimestamp());
        result = xCH(result, getBarClob());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
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
        String delimiter = ", ";
        sb.append(delimiter).append(getBarId());
        sb.append(delimiter).append(getBarName());
        sb.append(delimiter).append(getBarDecimal());
        sb.append(delimiter).append(xfUD(getBarDate()));
        sb.append(delimiter).append(getBarTimestamp());
        sb.append(delimiter).append(getBarClob());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
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
    public BarBean clone() {
        try {
            return (BarBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BAR_ID: {NUMBER(8)} <br />
     * @return The value of the column 'BAR_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBarId() {
        return _barId;
    }

    /**
     * [set] BAR_ID: {NUMBER(8)} <br />
     * @param barId The value of the column 'BAR_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarId(Integer barId) {
        __modifiedProperties.addPropertyName("barId");
        this._barId = barId;
    }

    /**
     * [get] BAR_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'BAR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarName() {
        return _barName;
    }

    /**
     * [set] BAR_NAME: {VARCHAR2(20)} <br />
     * @param barName The value of the column 'BAR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarName(String barName) {
        __modifiedProperties.addPropertyName("barName");
        this._barName = barName;
    }

    /**
     * [get] BAR_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'BAR_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBarDecimal() {
        return _barDecimal;
    }

    /**
     * [set] BAR_DECIMAL: {NUMBER(5, 3)} <br />
     * @param barDecimal The value of the column 'BAR_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarDecimal(java.math.BigDecimal barDecimal) {
        __modifiedProperties.addPropertyName("barDecimal");
        this._barDecimal = barDecimal;
    }

    /**
     * [get] BAR_DATE: {DATE} <br />
     * @return The value of the column 'BAR_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBarDate() {
        return _barDate;
    }

    /**
     * [set] BAR_DATE: {DATE} <br />
     * @param barDate The value of the column 'BAR_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarDate(java.util.Date barDate) {
        __modifiedProperties.addPropertyName("barDate");
        this._barDate = barDate;
    }

    /**
     * [get] BAR_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'BAR_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getBarTimestamp() {
        return _barTimestamp;
    }

    /**
     * [set] BAR_TIMESTAMP: {TIMESTAMP} <br />
     * @param barTimestamp The value of the column 'BAR_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarTimestamp(java.sql.Timestamp barTimestamp) {
        __modifiedProperties.addPropertyName("barTimestamp");
        this._barTimestamp = barTimestamp;
    }

    /** The value type annotation. {CLOB} */
    public static final String barClob_VALUE_TYPE = "stringClobType";

    /**
     * [get] BAR_CLOB: {CLOB} <br />
     * @return The value of the column 'BAR_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarClob() {
        return _barClob;
    }

    /**
     * [set] BAR_CLOB: {CLOB} <br />
     * @param barClob The value of the column 'BAR_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarClob(String barClob) {
        __modifiedProperties.addPropertyName("barClob");
        this._barClob = barClob;
    }
}
