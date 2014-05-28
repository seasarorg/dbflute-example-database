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
 * The entity of white_same_name as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_id
 * 
 * [column]
 *     same_name_id, same_name_name, same_name_integer, next_schema_product_id
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
 *     NEXT_SCHEMA_PRODUCT
 * 
 * [referrer table]
 *     white_same_name_ref
 * 
 * [foreign property]
 *     nextSchemaProduct
 * 
 * [referrer property]
 *     whiteSameNameRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long sameNameId = entity.getSameNameId();
 * String sameNameName = entity.getSameNameName();
 * Integer sameNameInteger = entity.getSameNameInteger();
 * Integer nextSchemaProductId = entity.getNextSchemaProductId();
 * entity.setSameNameId(sameNameId);
 * entity.setSameNameName(sameNameName);
 * entity.setSameNameInteger(sameNameInteger);
 * entity.setNextSchemaProductId(nextSchemaProductId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameName implements Entity, Serializable, Cloneable {

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
    /** same_name_id: {PK, NotNull, int8(19)} */
    protected Long _sameNameId;

    /** same_name_name: {varchar(200)} */
    protected String _sameNameName;

    /** same_name_integer: {int4(10)} */
    protected Integer _sameNameInteger;

    /** next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} */
    protected Integer _nextSchemaProductId;

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
        return "white_same_name";
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
    /** next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'. */
    protected NextSchemaProduct _nextSchemaProduct;

    /**
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @return The entity of foreign property 'nextSchemaProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public NextSchemaProduct getNextSchemaProduct() {
        return _nextSchemaProduct;
    }

    /**
     * next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @param nextSchemaProduct The entity of foreign property 'nextSchemaProduct'. (NullAllowed)
     */
    public void setNextSchemaProduct(NextSchemaProduct nextSchemaProduct) {
        _nextSchemaProduct = nextSchemaProduct;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_same_name_ref by same_name_id, named 'whiteSameNameRefList'. */
    protected List<WhiteSameNameRef> _whiteSameNameRefList;

    /**
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The entity list of referrer property 'whiteSameNameRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSameNameRef> getWhiteSameNameRefList() {
        if (_whiteSameNameRefList == null) { _whiteSameNameRefList = newReferrerList(); }
        return _whiteSameNameRefList;
    }

    /**
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @param whiteSameNameRefList The entity list of referrer property 'whiteSameNameRefList'. (NullAllowed)
     */
    public void setWhiteSameNameRefList(List<WhiteSameNameRef> whiteSameNameRefList) {
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
        if (obj == null || !(obj instanceof BsWhiteSameName)) { return false; }
        BsWhiteSameName other = (BsWhiteSameName)obj;
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
        if (_nextSchemaProduct != null)
        { sb.append(li).append(xbRDS(_nextSchemaProduct, "nextSchemaProduct")); }
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
        sb.append(dm).append(getSameNameInteger());
        sb.append(dm).append(getNextSchemaProductId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_nextSchemaProduct != null) { sb.append(cm).append("nextSchemaProduct"); }
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
    public WhiteSameName clone() {
        try {
            return (WhiteSameName)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {PK, NotNull, int8(19)} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        this._sameNameId = sameNameId;
    }

    /**
     * [get] same_name_name: {varchar(200)} <br />
     * @return The value of the column 'same_name_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getSameNameName() {
        return _sameNameName;
    }

    /**
     * [set] same_name_name: {varchar(200)} <br />
     * @param sameNameName The value of the column 'same_name_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameName(String sameNameName) {
        __modifiedProperties.addPropertyName("sameNameName");
        this._sameNameName = sameNameName;
    }

    /**
     * [get] same_name_integer: {int4(10)} <br />
     * @return The value of the column 'same_name_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSameNameInteger() {
        return _sameNameInteger;
    }

    /**
     * [set] same_name_integer: {int4(10)} <br />
     * @param sameNameInteger The value of the column 'same_name_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameInteger(Integer sameNameInteger) {
        __modifiedProperties.addPropertyName("sameNameInteger");
        this._sameNameInteger = sameNameInteger;
    }

    /**
     * [get] next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} <br />
     * @return The value of the column 'next_schema_product_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNextSchemaProductId() {
        return _nextSchemaProductId;
    }

    /**
     * [set] next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} <br />
     * @param nextSchemaProductId The value of the column 'next_schema_product_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNextSchemaProductId(Integer nextSchemaProductId) {
        __modifiedProperties.addPropertyName("nextSchemaProductId");
        this._nextSchemaProductId = nextSchemaProductId;
    }
}
