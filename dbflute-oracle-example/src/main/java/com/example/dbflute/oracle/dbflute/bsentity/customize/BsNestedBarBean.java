package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_BAR_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAR_ID, BAR_NAME, BAR_DATE, BAR_LIST, BAZ_BEAN1, BAZ_BEAN2, QUX_LIST, QUUX_LIST
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
 * Integer barId = entity.getBarId();
 * String barName = entity.getBarName();
 * java.util.Date barDate = entity.getBarDate();
 * List<BarBean> barList = entity.getBarList();
 * NestedBazBean bazBean1 = entity.getBazBean1();
 * NestedBazBean bazBean2 = entity.getBazBean2();
 * List<java.math.BigDecimal> quxList = entity.getQuxList();
 * List<java.math.BigDecimal> quuxList = entity.getQuuxList();
 * entity.setBarId(barId);
 * entity.setBarName(barName);
 * entity.setBarDate(barDate);
 * entity.setBarList(barList);
 * entity.setBazBean1(bazBean1);
 * entity.setBazBean2(bazBean2);
 * entity.setQuxList(quxList);
 * entity.setQuuxList(quuxList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedBarBean implements Entity, Serializable, Cloneable {

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
    /** BAR_ID: {NUMBER(8)} */
    protected Integer _barId;

    /** BAR_NAME: {VARCHAR2(20)} */
    protected String _barName;

    /** BAR_DATE: {DATE} */
    protected java.util.Date _barDate;

    /** BAR_LIST: {BAR_TABLE} */
    protected List<BarBean> _barList;

    /** BAZ_BEAN1: {NESTED_BAZ_BEAN} */
    protected NestedBazBean _bazBean1;

    /** BAZ_BEAN2: {NESTED_BAZ_BEAN} */
    protected NestedBazBean _bazBean2;

    /** QUX_LIST: {QUX_TABLE} */
    protected List<java.math.BigDecimal> _quxList;

    /** QUUX_LIST: {QUUX_TABLE} */
    protected List<java.math.BigDecimal> _quuxList;

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
        return "NESTED_BAR_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nestedBarBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NestedBarBeanDbm.getInstance();
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
        if (obj == null || !(obj instanceof BsNestedBarBean)) { return false; }
        BsNestedBarBean other = (BsNestedBarBean)obj;
        if (!xSV(getBarId(), other.getBarId())) { return false; }
        if (!xSV(getBarName(), other.getBarName())) { return false; }
        if (!xSV(getBarDate(), other.getBarDate())) { return false; }
        if (!xSV(getBarList(), other.getBarList())) { return false; }
        if (!xSV(getBazBean1(), other.getBazBean1())) { return false; }
        if (!xSV(getBazBean2(), other.getBazBean2())) { return false; }
        if (!xSV(getQuxList(), other.getQuxList())) { return false; }
        if (!xSV(getQuuxList(), other.getQuuxList())) { return false; }
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
        hs = xCH(hs, getBarId());
        hs = xCH(hs, getBarName());
        hs = xCH(hs, getBarDate());
        hs = xCH(hs, getBarList());
        hs = xCH(hs, getBazBean1());
        hs = xCH(hs, getBazBean2());
        hs = xCH(hs, getQuxList());
        hs = xCH(hs, getQuuxList());
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
        sb.append(dm).append(getBarId());
        sb.append(dm).append(getBarName());
        sb.append(dm).append(xfUD(getBarDate()));
        sb.append(dm).append(getBarList());
        sb.append(dm).append(getBazBean1());
        sb.append(dm).append(getBazBean2());
        sb.append(dm).append(getQuxList());
        sb.append(dm).append(getQuuxList());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public NestedBarBean clone() {
        try {
            return (NestedBarBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BAR_ID: {NUMBER(8)} <br />
     * @return The value of the column 'BAR_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBarId() {
        return _barId;
    }

    /**
     * [set] BAR_ID: {NUMBER(8)} <br />
     * @param barId The value of the column 'BAR_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarId(Integer barId) {
        __modifiedProperties.addPropertyName("barId");
        _barId = barId;
    }

    /**
     * [get] BAR_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'BAR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarName() {
        return _barName;
    }

    /**
     * [set] BAR_NAME: {VARCHAR2(20)} <br />
     * @param barName The value of the column 'BAR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarName(String barName) {
        __modifiedProperties.addPropertyName("barName");
        _barName = barName;
    }

    /**
     * [get] BAR_DATE: {DATE} <br />
     * @return The value of the column 'BAR_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBarDate() {
        return _barDate;
    }

    /**
     * [set] BAR_DATE: {DATE} <br />
     * @param barDate The value of the column 'BAR_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarDate(java.util.Date barDate) {
        __modifiedProperties.addPropertyName("barDate");
        _barDate = barDate;
    }

    /**
     * [get] BAR_LIST: {BAR_TABLE} <br />
     * @return The value of the column 'BAR_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<BarBean> getBarList() {
        return _barList;
    }

    /**
     * [set] BAR_LIST: {BAR_TABLE} <br />
     * @param barList The value of the column 'BAR_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarList(List<BarBean> barList) {
        __modifiedProperties.addPropertyName("barList");
        _barList = barList;
    }

    /**
     * [get] BAZ_BEAN1: {NESTED_BAZ_BEAN} <br />
     * @return The value of the column 'BAZ_BEAN1'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBazBean getBazBean1() {
        return _bazBean1;
    }

    /**
     * [set] BAZ_BEAN1: {NESTED_BAZ_BEAN} <br />
     * @param bazBean1 The value of the column 'BAZ_BEAN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazBean1(NestedBazBean bazBean1) {
        __modifiedProperties.addPropertyName("bazBean1");
        _bazBean1 = bazBean1;
    }

    /**
     * [get] BAZ_BEAN2: {NESTED_BAZ_BEAN} <br />
     * @return The value of the column 'BAZ_BEAN2'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBazBean getBazBean2() {
        return _bazBean2;
    }

    /**
     * [set] BAZ_BEAN2: {NESTED_BAZ_BEAN} <br />
     * @param bazBean2 The value of the column 'BAZ_BEAN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazBean2(NestedBazBean bazBean2) {
        __modifiedProperties.addPropertyName("bazBean2");
        _bazBean2 = bazBean2;
    }

    /**
     * [get] QUX_LIST: {QUX_TABLE} <br />
     * @return The value of the column 'QUX_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<java.math.BigDecimal> getQuxList() {
        return _quxList;
    }

    /**
     * [set] QUX_LIST: {QUX_TABLE} <br />
     * @param quxList The value of the column 'QUX_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuxList(List<java.math.BigDecimal> quxList) {
        __modifiedProperties.addPropertyName("quxList");
        _quxList = quxList;
    }

    /**
     * [get] QUUX_LIST: {QUUX_TABLE} <br />
     * @return The value of the column 'QUUX_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<java.math.BigDecimal> getQuuxList() {
        return _quuxList;
    }

    /**
     * [set] QUUX_LIST: {QUUX_TABLE} <br />
     * @param quuxList The value of the column 'QUUX_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuuxList(List<java.math.BigDecimal> quuxList) {
        __modifiedProperties.addPropertyName("quuxList");
        _quuxList = quuxList;
    }
}
