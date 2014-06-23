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
 * The entity of white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_ref_id
 * 
 * [column]
 *     same_name_ref_id, same_name_id, next_same_name_id
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
 *     white_same_name
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSameName
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sameNameRefId = entity.getSameNameRefId();
 * Long sameNameId = entity.getSameNameId();
 * Long nextSameNameId = entity.getNextSameNameId();
 * entity.setSameNameRefId(sameNameRefId);
 * entity.setSameNameId(sameNameId);
 * entity.setNextSameNameId(nextSameNameId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameRef implements Entity, Serializable, Cloneable {

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
    /** same_name_ref_id: {PK, NotNull, int4(10)} */
    protected Integer _sameNameRefId;

    /** same_name_id: {NotNull, int8(19), FK to white_same_name} */
    protected Long _sameNameId;

    /** next_same_name_id: {NotNull, int8(19)} */
    protected Long _nextSameNameId;

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
        return "white_same_name_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameNameRef";
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
        if (getSameNameRefId() == null) { return false; }
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
    /** white_same_name by my same_name_id, named 'whiteSameName'. */
    protected WhiteSameName _whiteSameName;

    /**
     * [get] white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The entity of foreign property 'whiteSameName'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSameName getWhiteSameName() {
        return _whiteSameName;
    }

    /**
     * [set] white_same_name by my same_name_id, named 'whiteSameName'.
     * @param whiteSameName The entity of foreign property 'whiteSameName'. (NullAllowed)
     */
    public void setWhiteSameName(WhiteSameName whiteSameName) {
        _whiteSameName = whiteSameName;
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
        if (obj == null || !(obj instanceof BsWhiteSameNameRef)) { return false; }
        BsWhiteSameNameRef other = (BsWhiteSameNameRef)obj;
        if (!xSV(getSameNameRefId(), other.getSameNameRefId())) { return false; }
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
        hs = xCH(hs, getSameNameRefId());
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
        if (_whiteSameName != null)
        { sb.append(li).append(xbRDS(_whiteSameName, "whiteSameName")); }
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
        sb.append(dm).append(getSameNameRefId());
        sb.append(dm).append(getSameNameId());
        sb.append(dm).append(getNextSameNameId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSameName != null) { sb.append(cm).append("whiteSameName"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public WhiteSameNameRef clone() {
        try {
            return (WhiteSameNameRef)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_ref_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'same_name_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameRefId() {
        return _sameNameRefId;
    }

    /**
     * [set] same_name_ref_id: {PK, NotNull, int4(10)} <br />
     * @param sameNameRefId The value of the column 'same_name_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameRefId(Integer sameNameRefId) {
        __modifiedProperties.addPropertyName("sameNameRefId");
        _sameNameRefId = sameNameRefId;
    }

    /**
     * [get] same_name_id: {NotNull, int8(19), FK to white_same_name} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {NotNull, int8(19), FK to white_same_name} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] next_same_name_id: {NotNull, int8(19)} <br />
     * @return The value of the column 'next_same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextSameNameId() {
        return _nextSameNameId;
    }

    /**
     * [set] next_same_name_id: {NotNull, int8(19)} <br />
     * @param nextSameNameId The value of the column 'next_same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setNextSameNameId(Long nextSameNameId) {
        __modifiedProperties.addPropertyName("nextSameNameId");
        _nextSameNameId = nextSameNameId;
    }
}
