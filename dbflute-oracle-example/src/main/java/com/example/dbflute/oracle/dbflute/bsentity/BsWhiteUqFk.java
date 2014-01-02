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
 * The entity of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_ID
 * 
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkId = entity.getUqFkId();
 * String uqFkCode = entity.getUqFkCode();
 * entity.setUqFkId(uqFkId);
 * entity.setUqFkCode(uqFkCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFk implements Entity, Serializable, Cloneable {

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
    /** UQ_FK_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _uqFkId;

    /** UQ_FK_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqFkCode;

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
        return "WHITE_UQ_FK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFk";
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
        if (getUqFkId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToPkIdList;

    /**
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToPkIdList() {
        if (_whiteUqFkRefByFkToPkIdList == null) { _whiteUqFkRefByFkToPkIdList = newReferrerList(); }
        return _whiteUqFkRefByFkToPkIdList;
    }

    /**
     * WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @param whiteUqFkRefByFkToPkIdList The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToPkIdList(List<WhiteUqFkRef> whiteUqFkRefByFkToPkIdList) {
        _whiteUqFkRefByFkToPkIdList = whiteUqFkRefByFkToPkIdList;
    }

    /** WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToUqCodeList;

    /**
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToUqCodeList() {
        if (_whiteUqFkRefByFkToUqCodeList == null) { _whiteUqFkRefByFkToUqCodeList = newReferrerList(); }
        return _whiteUqFkRefByFkToUqCodeList;
    }

    /**
     * WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @param whiteUqFkRefByFkToUqCodeList The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFkRef> whiteUqFkRefByFkToUqCodeList) {
        _whiteUqFkRefByFkToUqCodeList = whiteUqFkRefByFkToUqCodeList;
    }

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
        if (other == null || !(other instanceof BsWhiteUqFk)) { return false; }
        BsWhiteUqFk otherEntity = (BsWhiteUqFk)other;
        if (!xSV(getUqFkId(), otherEntity.getUqFkId())) { return false; }
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
        result = xCH(result, getUqFkId());
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
        String l = "\n  ";
        if (_whiteUqFkRefByFkToPkIdList != null) { for (Entity e : _whiteUqFkRefByFkToPkIdList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqFkRefByFkToPkIdList")); } } }
        if (_whiteUqFkRefByFkToUqCodeList != null) { for (Entity e : _whiteUqFkRefByFkToUqCodeList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "whiteUqFkRefByFkToUqCodeList")); } } }
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
        sb.append(delimiter).append(getUqFkId());
        sb.append(delimiter).append(getUqFkCode());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_whiteUqFkRefByFkToPkIdList != null && !_whiteUqFkRefByFkToPkIdList.isEmpty())
        { sb.append(c).append("whiteUqFkRefByFkToPkIdList"); }
        if (_whiteUqFkRefByFkToUqCodeList != null && !_whiteUqFkRefByFkToUqCodeList.isEmpty())
        { sb.append(c).append("whiteUqFkRefByFkToUqCodeList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteUqFk clone() {
        try {
            return (WhiteUqFk)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkId() {
        return _uqFkId;
    }

    /**
     * [set] UQ_FK_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param uqFkId The value of the column 'UQ_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkId(Long uqFkId) {
        __modifiedProperties.addPropertyName("uqFkId");
        this._uqFkId = uqFkId;
    }

    /**
     * [get] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'UQ_FK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkCode() {
        return _uqFkCode;
    }

    /**
     * [set] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param uqFkCode The value of the column 'UQ_FK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkCode(String uqFkCode) {
        __modifiedProperties.addPropertyName("uqFkCode");
        this._uqFkCode = uqFkCode;
    }
}