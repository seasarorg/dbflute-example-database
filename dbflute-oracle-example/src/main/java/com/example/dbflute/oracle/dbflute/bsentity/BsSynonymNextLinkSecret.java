package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_NEXT_LINK_SECRET as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     SECRET_CODE
 * 
 * [column]
 *     SECRET_CODE, SECRET_NAME, SECRET_AUTH_CODE
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
 * String secretCode = entity.getSecretCode();
 * String secretName = entity.getSecretName();
 * String secretAuthCode = entity.getSecretAuthCode();
 * entity.setSecretCode(secretCode);
 * entity.setSecretName(secretName);
 * entity.setSecretAuthCode(secretAuthCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextLinkSecret implements Entity, Serializable, Cloneable {

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
    /** SECRET_CODE: {PK, NotNull, CHAR(3)} */
    protected String _secretCode;

    /** SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _secretName;

    /** SECRET_AUTH_CODE: {CHAR(3)} */
    protected String _secretAuthCode;

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
        return "SYNONYM_NEXT_LINK_SECRET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymNextLinkSecret";
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
        if (getSecretCode() == null) { return false; }
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
        if (other == null || !(other instanceof BsSynonymNextLinkSecret)) { return false; }
        BsSynonymNextLinkSecret otherEntity = (BsSynonymNextLinkSecret)other;
        if (!xSV(getSecretCode(), otherEntity.getSecretCode())) { return false; }
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
        result = xCH(result, getSecretCode());
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
        sb.append(delimiter).append(getSecretCode());
        sb.append(delimiter).append(getSecretName());
        sb.append(delimiter).append(getSecretAuthCode());
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
    public SynonymNextLinkSecret clone() {
        try {
            return (SynonymNextLinkSecret)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'SECRET_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretCode() {
        return _secretCode;
    }

    /**
     * [set] SECRET_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param secretCode The value of the column 'SECRET_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setSecretCode(String secretCode) {
        __modifiedProperties.addPropertyName("secretCode");
        this._secretCode = secretCode;
    }

    /**
     * [get] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'SECRET_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSecretName() {
        return _secretName;
    }

    /**
     * [set] SECRET_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @param secretName The value of the column 'SECRET_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSecretName(String secretName) {
        __modifiedProperties.addPropertyName("secretName");
        this._secretName = secretName;
    }

    /**
     * [get] SECRET_AUTH_CODE: {CHAR(3)} <br />
     * @return The value of the column 'SECRET_AUTH_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSecretAuthCode() {
        return _secretAuthCode;
    }

    /**
     * [set] SECRET_AUTH_CODE: {CHAR(3)} <br />
     * @param secretAuthCode The value of the column 'SECRET_AUTH_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSecretAuthCode(String secretAuthCode) {
        __modifiedProperties.addPropertyName("secretAuthCode");
        this._secretAuthCode = secretAuthCode;
    }
}
