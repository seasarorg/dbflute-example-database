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
 * The entity of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UQ_FK_REF_ID, FK_TO_UQ_CODE
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
 *     WHITE_UQ_FK_WITHOUT_PK
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqFkWithoutPk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefId = entity.getUqFkRefId();
 * String fkToUqCode = entity.getFkToUqCode();
 * entity.setUqFkRefId(uqFkRefId);
 * entity.setFkToUqCode(fkToUqCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkWithoutPkRef implements Entity, Serializable, Cloneable {

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
    /** UQ_FK_REF_ID: {NotNull, NUMBER(16)} */
    protected Long _uqFkRefId;

    /** FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} */
    protected String _fkToUqCode;

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
        return "WHITE_UQ_FK_WITHOUT_PK_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkWithoutPkRef";
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

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'. */
    protected WhiteUqFkWithoutPk _whiteUqFkWithoutPk;

    /**
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The entity of foreign property 'whiteUqFkWithoutPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFkWithoutPk getWhiteUqFkWithoutPk() {
        return _whiteUqFkWithoutPk;
    }

    /**
     * WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @param whiteUqFkWithoutPk The entity of foreign property 'whiteUqFkWithoutPk'. (NullAllowed)
     */
    public void setWhiteUqFkWithoutPk(WhiteUqFkWithoutPk whiteUqFkWithoutPk) {
        _whiteUqFkWithoutPk = whiteUqFkWithoutPk;
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteUqFkWithoutPkRef)) { return false; }
        BsWhiteUqFkWithoutPkRef other = (BsWhiteUqFkWithoutPkRef)obj;
        if (!xSV(getUqFkRefId(), other.getUqFkRefId())) { return false; }
        if (!xSV(getFkToUqCode(), other.getFkToUqCode())) { return false; }
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
        result = xCH(result, getUqFkRefId());
        result = xCH(result, getFkToUqCode());
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
        String l = "\n  ";
        if (_whiteUqFkWithoutPk != null)
        { sb.append(l).append(xbRDS(_whiteUqFkWithoutPk, "whiteUqFkWithoutPk")); }
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
        sb.append(delimiter).append(getUqFkRefId());
        sb.append(delimiter).append(getFkToUqCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqFkWithoutPk != null) { sb.append(c).append("whiteUqFkWithoutPk"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqFkWithoutPkRef clone() {
        try {
            return (WhiteUqFkWithoutPkRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_ID: {NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefId() {
        return _uqFkRefId;
    }

    /**
     * [set] UQ_FK_REF_ID: {NotNull, NUMBER(16)} <br />
     * @param uqFkRefId The value of the column 'UQ_FK_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefId(Long uqFkRefId) {
        __modifiedProperties.addPropertyName("uqFkRefId");
        this._uqFkRefId = uqFkRefId;
    }

    /**
     * [get] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} <br />
     * @return The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFkToUqCode() {
        return _fkToUqCode;
    }

    /**
     * [set] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} <br />
     * @param fkToUqCode The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFkToUqCode(String fkToUqCode) {
        __modifiedProperties.addPropertyName("fkToUqCode");
        this._fkToUqCode = fkToUqCode;
    }
}
