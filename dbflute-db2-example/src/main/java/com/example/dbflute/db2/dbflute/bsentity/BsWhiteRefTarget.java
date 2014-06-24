package com.example.dbflute.db2.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.db2.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_TARGET as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_TARGET_ID
 * 
 * [column]
 *     REF_TARGET_ID, TARGET_ID
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
 *     WHITE_TARGET
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteTarget
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refTargetId = entity.getRefTargetId();
 * Long targetId = entity.getTargetId();
 * entity.setRefTargetId(refTargetId);
 * entity.setTargetId(targetId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteRefTarget implements Entity, Serializable, Cloneable {

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
    /** REF_TARGET_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _refTargetId;

    /** TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET} */
    protected Long _targetId;

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
        return "WHITE_REF_TARGET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteRefTarget";
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
        if (getRefTargetId() == null) { return false; }
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
    /** WHITE_TARGET by my TARGET_ID, named 'whiteTarget'. */
    protected WhiteTarget _whiteTarget;

    /**
     * [get] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The entity of foreign property 'whiteTarget'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteTarget getWhiteTarget() {
        return _whiteTarget;
    }

    /**
     * [set] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param whiteTarget The entity of foreign property 'whiteTarget'. (NullAllowed)
     */
    public void setWhiteTarget(WhiteTarget whiteTarget) {
        _whiteTarget = whiteTarget;
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
        if (obj == null || !(obj instanceof BsWhiteRefTarget)) { return false; }
        BsWhiteRefTarget other = (BsWhiteRefTarget)obj;
        if (!xSV(getRefTargetId(), other.getRefTargetId())) { return false; }
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
        hs = xCH(hs, getRefTargetId());
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
        if (_whiteTarget != null)
        { sb.append(li).append(xbRDS(_whiteTarget, "whiteTarget")); }
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
        sb.append(dm).append(getRefTargetId());
        sb.append(dm).append(getTargetId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteTarget != null) { sb.append(cm).append("whiteTarget"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteRefTarget clone() {
        try {
            return (WhiteRefTarget)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_TARGET_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'REF_TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefTargetId() {
        return _refTargetId;
    }

    /**
     * [set] REF_TARGET_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param refTargetId The value of the column 'REF_TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefTargetId(Long refTargetId) {
        __modifiedProperties.addPropertyName("refTargetId");
        _refTargetId = refTargetId;
    }

    /**
     * [get] TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET} <br />
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTargetId() {
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {NotNull, DECIMAL(16), FK to WHITE_TARGET} <br />
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Long targetId) {
        __modifiedProperties.addPropertyName("targetId");
        _targetId = targetId;
    }
}
