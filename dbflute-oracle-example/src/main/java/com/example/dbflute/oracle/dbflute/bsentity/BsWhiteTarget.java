package com.example.dbflute.oracle.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_TARGET as TABLE. <br />
 * <pre>
 * [primary-key]
 *     TARGET_ID
 * 
 * [column]
 *     TARGET_ID, TARGET_NAME
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
 *     WHITE_REF_TARGET
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteRefTargetList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long targetId = entity.getTargetId();
 * String targetName = entity.getTargetName();
 * entity.setTargetId(targetId);
 * entity.setTargetName(targetName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteTarget implements Entity, Serializable, Cloneable {

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
    /** TARGET_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _targetId;

    /** TARGET_NAME: {VARCHAR2(256)} */
    protected String _targetName;

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
        return "WHITE_TARGET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteTarget";
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
        if (getTargetId() == null) { return false; }
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
    /** WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'. */
    protected List<WhiteRefTarget> _whiteRefTargetList;

    /**
     * [get] WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * @return The entity list of referrer property 'whiteRefTargetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteRefTarget> getWhiteRefTargetList() {
        if (_whiteRefTargetList == null) { _whiteRefTargetList = newReferrerList(); }
        return _whiteRefTargetList;
    }

    /**
     * [set] WHITE_REF_TARGET by TARGET_ID, named 'whiteRefTargetList'.
     * @param whiteRefTargetList The entity list of referrer property 'whiteRefTargetList'. (NullAllowed)
     */
    public void setWhiteRefTargetList(List<WhiteRefTarget> whiteRefTargetList) {
        _whiteRefTargetList = whiteRefTargetList;
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
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsWhiteTarget)) { return false; }
        BsWhiteTarget other = (BsWhiteTarget)obj;
        if (!xSV(getTargetId(), other.getTargetId())) { return false; }
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
        hs = xCH(hs, getTargetId());
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
        String li = "\n  ";
        if (_whiteRefTargetList != null) { for (Entity et : _whiteRefTargetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteRefTargetList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getTargetId());
        sb.append(dm).append(getTargetName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteRefTargetList != null && !_whiteRefTargetList.isEmpty())
        { sb.append(cm).append("whiteRefTargetList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteTarget clone() {
        try {
            return (WhiteTarget)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTargetId() {
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Long targetId) {
        __modifiedProperties.addPropertyName("targetId");
        _targetId = targetId;
    }

    /**
     * [get] TARGET_NAME: {VARCHAR2(256)} <br />
     * @return The value of the column 'TARGET_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetName() {
        return _targetName;
    }

    /**
     * [set] TARGET_NAME: {VARCHAR2(256)} <br />
     * @param targetName The value of the column 'TARGET_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetName(String targetName) {
        __modifiedProperties.addPropertyName("targetName");
        _targetName = targetName;
    }
}
