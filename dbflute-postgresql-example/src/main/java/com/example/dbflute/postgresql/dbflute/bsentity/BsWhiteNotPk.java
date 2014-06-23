package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_not_pk as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     not_pk_id, not_pk_name, not_pk_integer
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
 * Long notPkId = entity.getNotPkId();
 * String notPkName = entity.getNotPkName();
 * Integer notPkInteger = entity.getNotPkInteger();
 * entity.setNotPkId(notPkId);
 * entity.setNotPkName(notPkName);
 * entity.setNotPkInteger(notPkInteger);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNotPk implements Entity, Serializable, Cloneable {

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
    /** not_pk_id: {NotNull, int8(19)} */
    protected Long _notPkId;

    /** not_pk_name: {varchar(2147483647)} */
    protected String _notPkName;

    /** not_pk_integer: {int4(10)} */
    protected Integer _notPkInteger;

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
        return "white_not_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteNotPk";
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
        return false;
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
        if (obj == null || !(obj instanceof BsWhiteNotPk)) { return false; }
        BsWhiteNotPk other = (BsWhiteNotPk)obj;
        if (!xSV(getNotPkId(), other.getNotPkId())) { return false; }
        if (!xSV(getNotPkName(), other.getNotPkName())) { return false; }
        if (!xSV(getNotPkInteger(), other.getNotPkInteger())) { return false; }
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
        hs = xCH(hs, getNotPkId());
        hs = xCH(hs, getNotPkName());
        hs = xCH(hs, getNotPkInteger());
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
        sb.append(dm).append(getNotPkId());
        sb.append(dm).append(getNotPkName());
        sb.append(dm).append(getNotPkInteger());
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
    public WhiteNotPk clone() {
        try {
            return (WhiteNotPk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] not_pk_id: {NotNull, int8(19)} <br />
     * @return The value of the column 'not_pk_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getNotPkId() {
        return _notPkId;
    }

    /**
     * [set] not_pk_id: {NotNull, int8(19)} <br />
     * @param notPkId The value of the column 'not_pk_id'. (basically NotNull if update: for the constraint)
     */
    public void setNotPkId(Long notPkId) {
        __modifiedProperties.addPropertyName("notPkId");
        _notPkId = notPkId;
    }

    /**
     * [get] not_pk_name: {varchar(2147483647)} <br />
     * @return The value of the column 'not_pk_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotPkName() {
        return _notPkName;
    }

    /**
     * [set] not_pk_name: {varchar(2147483647)} <br />
     * @param notPkName The value of the column 'not_pk_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotPkName(String notPkName) {
        __modifiedProperties.addPropertyName("notPkName");
        _notPkName = notPkName;
    }

    /**
     * [get] not_pk_integer: {int4(10)} <br />
     * @return The value of the column 'not_pk_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNotPkInteger() {
        return _notPkInteger;
    }

    /**
     * [set] not_pk_integer: {int4(10)} <br />
     * @param notPkInteger The value of the column 'not_pk_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotPkInteger(Integer notPkInteger) {
        __modifiedProperties.addPropertyName("notPkInteger");
        _notPkInteger = notPkInteger;
    }
}
