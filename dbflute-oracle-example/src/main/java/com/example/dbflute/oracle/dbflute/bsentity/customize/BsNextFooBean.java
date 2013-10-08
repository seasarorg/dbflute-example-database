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
 * The entity of NEXT_FOO_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     FOO_ID, FOO_NAME, FOO_DECIMAL, FOO_DATE, FOO_TIMESTAMP, FOO_CLOB
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
 * Integer fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.math.BigDecimal fooDecimal = entity.getFooDecimal();
 * java.util.Date fooDate = entity.getFooDate();
 * java.sql.Timestamp fooTimestamp = entity.getFooTimestamp();
 * String fooClob = entity.getFooClob();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDecimal(fooDecimal);
 * entity.setFooDate(fooDate);
 * entity.setFooTimestamp(fooTimestamp);
 * entity.setFooClob(fooClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNextFooBean implements Entity, Serializable, Cloneable {

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
    /** FOO_ID: {NUMBER(8)} */
    protected Integer _fooId;

    /** FOO_NAME: {VARCHAR2(20)} */
    protected String _fooName;

    /** FOO_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _fooDecimal;

    /** FOO_DATE: {DATE} */
    protected java.util.Date _fooDate;

    /** FOO_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _fooTimestamp;

    /** FOO_CLOB: {CLOB} */
    protected String _fooClob;

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
        return "NEXT_FOO_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nextFooBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NextFooBeanDbm.getInstance();
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsNextFooBean)) { return false; }
        BsNextFooBean otherEntity = (BsNextFooBean)other;
        if (!xSV(getFooId(), otherEntity.getFooId())) { return false; }
        if (!xSV(getFooName(), otherEntity.getFooName())) { return false; }
        if (!xSV(getFooDecimal(), otherEntity.getFooDecimal())) { return false; }
        if (!xSV(getFooDate(), otherEntity.getFooDate())) { return false; }
        if (!xSV(getFooTimestamp(), otherEntity.getFooTimestamp())) { return false; }
        if (!xSV(getFooClob(), otherEntity.getFooClob())) { return false; }
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
        result = xCH(result, getFooId());
        result = xCH(result, getFooName());
        result = xCH(result, getFooDecimal());
        result = xCH(result, getFooDate());
        result = xCH(result, getFooTimestamp());
        result = xCH(result, getFooClob());
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
        sb.append(delimiter).append(getFooId());
        sb.append(delimiter).append(getFooName());
        sb.append(delimiter).append(getFooDecimal());
        sb.append(delimiter).append(xfUD(getFooDate()));
        sb.append(delimiter).append(getFooTimestamp());
        sb.append(delimiter).append(getFooClob());
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
    public NextFooBean clone() {
        try {
            return (NextFooBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOO_ID: {NUMBER(8)} <br />
     * @return The value of the column 'FOO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFooId() {
        return _fooId;
    }

    /**
     * [set] FOO_ID: {NUMBER(8)} <br />
     * @param fooId The value of the column 'FOO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooId(Integer fooId) {
        __modifiedProperties.addPropertyName("fooId");
        this._fooId = fooId;
    }

    /**
     * [get] FOO_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'FOO_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFooName() {
        return _fooName;
    }

    /**
     * [set] FOO_NAME: {VARCHAR2(20)} <br />
     * @param fooName The value of the column 'FOO_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooName(String fooName) {
        __modifiedProperties.addPropertyName("fooName");
        this._fooName = fooName;
    }

    /**
     * [get] FOO_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'FOO_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFooDecimal() {
        return _fooDecimal;
    }

    /**
     * [set] FOO_DECIMAL: {NUMBER(5, 3)} <br />
     * @param fooDecimal The value of the column 'FOO_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDecimal(java.math.BigDecimal fooDecimal) {
        __modifiedProperties.addPropertyName("fooDecimal");
        this._fooDecimal = fooDecimal;
    }

    /**
     * [get] FOO_DATE: {DATE} <br />
     * @return The value of the column 'FOO_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getFooDate() {
        return _fooDate;
    }

    /**
     * [set] FOO_DATE: {DATE} <br />
     * @param fooDate The value of the column 'FOO_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDate(java.util.Date fooDate) {
        __modifiedProperties.addPropertyName("fooDate");
        this._fooDate = fooDate;
    }

    /**
     * [get] FOO_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'FOO_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFooTimestamp() {
        return _fooTimestamp;
    }

    /**
     * [set] FOO_TIMESTAMP: {TIMESTAMP} <br />
     * @param fooTimestamp The value of the column 'FOO_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooTimestamp(java.sql.Timestamp fooTimestamp) {
        __modifiedProperties.addPropertyName("fooTimestamp");
        this._fooTimestamp = fooTimestamp;
    }

    /** The value type annotation. {CLOB} */
    public static String fooClob_VALUE_TYPE = "stringClobType";

    /**
     * [get] FOO_CLOB: {CLOB} <br />
     * @return The value of the column 'FOO_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    public String getFooClob() {
        return _fooClob;
    }

    /**
     * [set] FOO_CLOB: {CLOB} <br />
     * @param fooClob The value of the column 'FOO_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooClob(String fooClob) {
        __modifiedProperties.addPropertyName("fooClob");
        this._fooClob = fooClob;
    }
}
