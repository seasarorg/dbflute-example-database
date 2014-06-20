package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_xls_man as TABLE. <br />
 * <pre>
 * [primary-key]
 *     xls_man_id
 * 
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
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
 * Long xlsManId = entity.getXlsManId();
 * String stringConverted = entity.getStringConverted();
 * java.sql.Timestamp timestampZeroDefaultMillis = entity.getTimestampZeroDefaultMillis();
 * java.sql.Timestamp timestampZeroPrefixMillis = entity.getTimestampZeroPrefixMillis();
 * java.sql.Timestamp timestampZeroSuffixMillis = entity.getTimestampZeroSuffixMillis();
 * entity.setXlsManId(xlsManId);
 * entity.setStringConverted(stringConverted);
 * entity.setTimestampZeroDefaultMillis(timestampZeroDefaultMillis);
 * entity.setTimestampZeroPrefixMillis(timestampZeroPrefixMillis);
 * entity.setTimestampZeroSuffixMillis(timestampZeroSuffixMillis);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsMan implements Entity, Serializable, Cloneable {

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
    /** xls_man_id: {PK, NotNull, int8(19)} */
    protected Long _xlsManId;

    /** string_converted: {varchar(2147483647)} */
    protected String _stringConverted;

    /** timestamp_zero_default_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroDefaultMillis;

    /** timestamp_zero_prefix_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroPrefixMillis;

    /** timestamp_zero_suffix_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroSuffixMillis;

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
        return "white_xls_man";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteXlsMan";
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
        if (getXlsManId() == null) { return false; }
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
        if (obj == null || !(obj instanceof BsWhiteXlsMan)) { return false; }
        BsWhiteXlsMan other = (BsWhiteXlsMan)obj;
        if (!xSV(getXlsManId(), other.getXlsManId())) { return false; }
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
        hs = xCH(hs, getXlsManId());
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
        sb.append(dm).append(getXlsManId());
        sb.append(dm).append(getStringConverted());
        sb.append(dm).append(getTimestampZeroDefaultMillis());
        sb.append(dm).append(getTimestampZeroPrefixMillis());
        sb.append(dm).append(getTimestampZeroSuffixMillis());
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
    public WhiteXlsMan clone() {
        try {
            return (WhiteXlsMan)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] xls_man_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'xls_man_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getXlsManId() {
        return _xlsManId;
    }

    /**
     * [set] xls_man_id: {PK, NotNull, int8(19)} <br />
     * @param xlsManId The value of the column 'xls_man_id'. (basically NotNull if update: for the constraint)
     */
    public void setXlsManId(Long xlsManId) {
        __modifiedProperties.addPropertyName("xlsManId");
        _xlsManId = xlsManId;
    }

    /**
     * [get] string_converted: {varchar(2147483647)} <br />
     * @return The value of the column 'string_converted'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        return _stringConverted;
    }

    /**
     * [set] string_converted: {varchar(2147483647)} <br />
     * @param stringConverted The value of the column 'string_converted'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        __modifiedProperties.addPropertyName("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] timestamp_zero_default_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_default_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroDefaultMillis() {
        return _timestampZeroDefaultMillis;
    }

    /**
     * [set] timestamp_zero_default_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroDefaultMillis The value of the column 'timestamp_zero_default_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroDefaultMillis(java.sql.Timestamp timestampZeroDefaultMillis) {
        __modifiedProperties.addPropertyName("timestampZeroDefaultMillis");
        _timestampZeroDefaultMillis = timestampZeroDefaultMillis;
    }

    /**
     * [get] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroPrefixMillis() {
        return _timestampZeroPrefixMillis;
    }

    /**
     * [set] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroPrefixMillis The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroPrefixMillis(java.sql.Timestamp timestampZeroPrefixMillis) {
        __modifiedProperties.addPropertyName("timestampZeroPrefixMillis");
        _timestampZeroPrefixMillis = timestampZeroPrefixMillis;
    }

    /**
     * [get] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroSuffixMillis() {
        return _timestampZeroSuffixMillis;
    }

    /**
     * [set] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroSuffixMillis The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroSuffixMillis(java.sql.Timestamp timestampZeroSuffixMillis) {
        __modifiedProperties.addPropertyName("timestampZeroSuffixMillis");
        _timestampZeroSuffixMillis = timestampZeroSuffixMillis;
    }
}
