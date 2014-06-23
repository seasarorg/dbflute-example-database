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
 * The entity of nextschema.white_same_name as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_id
 * 
 * [column]
 *     same_name_id, same_name_name, same_name_long
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
 *     nextschema.white_same_name_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteSameNameRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sameNameId = entity.getSameNameId();
 * String sameNameName = entity.getSameNameName();
 * Long sameNameLong = entity.getSameNameLong();
 * entity.setSameNameId(sameNameId);
 * entity.setSameNameName(sameNameName);
 * entity.setSameNameLong(sameNameLong);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameName implements Entity, Serializable, Cloneable {

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
    /** same_name_id: {PK, NotNull, int4(10)} */
    protected Integer _sameNameId;

    /** same_name_name: {varchar(100)} */
    protected String _sameNameName;

    /** same_name_long: {int8(19)} */
    protected Long _sameNameLong;

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
        return "nextschema.white_same_name";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameName";
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
        if (getSameNameId() == null) { return false; }
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
    /** nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'. */
    protected List<NextschemaWhiteSameNameRef> _whiteSameNameRefList;

    /**
     * [get] nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The entity list of referrer property 'whiteSameNameRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<NextschemaWhiteSameNameRef> getWhiteSameNameRefList() {
        if (_whiteSameNameRefList == null) { _whiteSameNameRefList = newReferrerList(); }
        return _whiteSameNameRefList;
    }

    /**
     * [set] nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @param whiteSameNameRefList The entity list of referrer property 'whiteSameNameRefList'. (NullAllowed)
     */
    public void setWhiteSameNameRefList(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        _whiteSameNameRefList = whiteSameNameRefList;
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
        if (obj == null || !(obj instanceof BsNextschemaWhiteSameName)) { return false; }
        BsNextschemaWhiteSameName other = (BsNextschemaWhiteSameName)obj;
        if (!xSV(getSameNameId(), other.getSameNameId())) { return false; }
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
        hs = xCH(hs, getSameNameId());
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
        if (_whiteSameNameRefList != null) { for (Entity et : _whiteSameNameRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSameNameRefList")); } } }
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
        sb.append(dm).append(getSameNameId());
        sb.append(dm).append(getSameNameName());
        sb.append(dm).append(getSameNameLong());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_whiteSameNameRefList != null && !_whiteSameNameRefList.isEmpty())
        { sb.append(cm).append("whiteSameNameRefList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public NextschemaWhiteSameName clone() {
        try {
            return (NextschemaWhiteSameName)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameId() {
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {PK, NotNull, int4(10)} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Integer sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] same_name_name: {varchar(100)} <br />
     * @return The value of the column 'same_name_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getSameNameName() {
        return _sameNameName;
    }

    /**
     * [set] same_name_name: {varchar(100)} <br />
     * @param sameNameName The value of the column 'same_name_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameName(String sameNameName) {
        __modifiedProperties.addPropertyName("sameNameName");
        _sameNameName = sameNameName;
    }

    /**
     * [get] same_name_long: {int8(19)} <br />
     * @return The value of the column 'same_name_long'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSameNameLong() {
        return _sameNameLong;
    }

    /**
     * [set] same_name_long: {int8(19)} <br />
     * @param sameNameLong The value of the column 'same_name_long'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameLong(Long sameNameLong) {
        __modifiedProperties.addPropertyName("sameNameLong");
        _sameNameLong = sameNameLong;
    }
}
