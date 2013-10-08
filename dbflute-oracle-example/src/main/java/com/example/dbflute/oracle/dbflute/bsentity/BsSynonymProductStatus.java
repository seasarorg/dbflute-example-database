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
 * The entity of SYNONYM_PRODUCT_STATUS as SYNONYM. <br />
 * 商品ステータス
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     SYNONYM_PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     synonymProductList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * java.math.BigDecimal displayOrder = entity.getDisplayOrder();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymProductStatus implements Entity, Serializable, Cloneable {

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
    /** PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _productStatusName;

    /** DISPLAY_ORDER: {NotNull, NUMBER(22)} */
    protected java.math.BigDecimal _displayOrder;

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
        return "SYNONYM_PRODUCT_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymProductStatus";
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
        if (getProductStatusCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'. */
    protected List<SynonymProduct> _synonymProductList;

    /**
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * @return The entity list of referrer property 'synonymProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymProduct> getSynonymProductList() {
        if (_synonymProductList == null) { _synonymProductList = newReferrerList(); }
        return _synonymProductList;
    }

    /**
     * (商品)SYNONYM_PRODUCT by PRODUCT_STATUS_CODE, named 'synonymProductList'.
     * @param synonymProductList The entity list of referrer property 'synonymProductList'. (NullAllowed)
     */
    public void setSynonymProductList(List<SynonymProduct> synonymProductList) {
        _synonymProductList = synonymProductList;
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
        if (other == null || !(other instanceof BsSynonymProductStatus)) { return false; }
        BsSynonymProductStatus otherEntity = (BsSynonymProductStatus)other;
        if (!xSV(getProductStatusCode(), otherEntity.getProductStatusCode())) { return false; }
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
        result = xCH(result, getProductStatusCode());
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
        if (_synonymProductList != null) { for (Entity e : _synonymProductList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "synonymProductList")); } } }
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
        sb.append(delimiter).append(getProductStatusCode());
        sb.append(delimiter).append(getProductStatusName());
        sb.append(delimiter).append(getDisplayOrder());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_synonymProductList != null && !_synonymProductList.isEmpty())
        { sb.append(c).append("synonymProductList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public SynonymProductStatus clone() {
        try {
            return (SynonymProductStatus)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusName() {
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.addPropertyName("productStatusName");
        this._productStatusName = productStatusName;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, NUMBER(22)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, NUMBER(22)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(java.math.BigDecimal displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        this._displayOrder = displayOrder;
    }
}
