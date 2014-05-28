package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_FOO_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     FOO_ID, FOO_NAME, FOO_DATE, BAR_BEAN, QUX_LIST, QUUX_LIST, CORGE_LIST
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
 * Integer fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.util.Date fooDate = entity.getFooDate();
 * NestedBarBean barBean = entity.getBarBean();
 * List<java.math.BigDecimal> quxList = entity.getQuxList();
 * List<java.math.BigDecimal> quuxList = entity.getQuuxList();
 * List<CorgeBean> corgeList = entity.getCorgeList();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDate(fooDate);
 * entity.setBarBean(barBean);
 * entity.setQuxList(quxList);
 * entity.setQuuxList(quuxList);
 * entity.setCorgeList(corgeList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedFooBean implements Entity, Serializable, Cloneable {

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
    /** FOO_ID: {NUMBER(8)} */
    protected Integer _fooId;

    /** FOO_NAME: {VARCHAR2(20)} */
    protected String _fooName;

    /** FOO_DATE: {DATE} */
    protected java.util.Date _fooDate;

    /** BAR_BEAN: {NESTED_BAR_BEAN} */
    protected NestedBarBean _barBean;

    /** QUX_LIST: {QUX_TABLE} */
    protected List<java.math.BigDecimal> _quxList;

    /** QUUX_LIST: {QUUX_TABLE} */
    protected List<java.math.BigDecimal> _quuxList;

    /** CORGE_LIST: {CORGE_TABLE} */
    protected List<CorgeBean> _corgeList;

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
        return "NESTED_FOO_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nestedFooBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NestedFooBeanDbm.getInstance();
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
        if (obj == null || !(obj instanceof BsNestedFooBean)) { return false; }
        BsNestedFooBean other = (BsNestedFooBean)obj;
        if (!xSV(getFooId(), other.getFooId())) { return false; }
        if (!xSV(getFooName(), other.getFooName())) { return false; }
        if (!xSV(getFooDate(), other.getFooDate())) { return false; }
        if (!xSV(getBarBean(), other.getBarBean())) { return false; }
        if (!xSV(getQuxList(), other.getQuxList())) { return false; }
        if (!xSV(getQuuxList(), other.getQuuxList())) { return false; }
        if (!xSV(getCorgeList(), other.getCorgeList())) { return false; }
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
        hs = xCH(hs, getFooId());
        hs = xCH(hs, getFooName());
        hs = xCH(hs, getFooDate());
        hs = xCH(hs, getBarBean());
        hs = xCH(hs, getQuxList());
        hs = xCH(hs, getQuuxList());
        hs = xCH(hs, getCorgeList());
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
        sb.append(dm).append(getFooId());
        sb.append(dm).append(getFooName());
        sb.append(dm).append(xfUD(getFooDate()));
        sb.append(dm).append(getBarBean());
        sb.append(dm).append(getQuxList());
        sb.append(dm).append(getQuuxList());
        sb.append(dm).append(getCorgeList());
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
    public NestedFooBean clone() {
        try {
            return (NestedFooBean)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOO_ID: {NUMBER(8)} <br />
     * @return The value of the column 'FOO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFooId() {
        return _fooId;
    }

    /**
     * [set] FOO_ID: {NUMBER(8)} <br />
     * @param fooId The value of the column 'FOO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooId(Integer fooId) {
        __modifiedProperties.addPropertyName("fooId");
        this._fooId = fooId;
    }

    /**
     * [get] FOO_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'FOO_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFooName() {
        return _fooName;
    }

    /**
     * [set] FOO_NAME: {VARCHAR2(20)} <br />
     * @param fooName The value of the column 'FOO_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooName(String fooName) {
        __modifiedProperties.addPropertyName("fooName");
        this._fooName = fooName;
    }

    /**
     * [get] FOO_DATE: {DATE} <br />
     * @return The value of the column 'FOO_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getFooDate() {
        return _fooDate;
    }

    /**
     * [set] FOO_DATE: {DATE} <br />
     * @param fooDate The value of the column 'FOO_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDate(java.util.Date fooDate) {
        __modifiedProperties.addPropertyName("fooDate");
        this._fooDate = fooDate;
    }

    /**
     * [get] BAR_BEAN: {NESTED_BAR_BEAN} <br />
     * @return The value of the column 'BAR_BEAN'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBarBean getBarBean() {
        return _barBean;
    }

    /**
     * [set] BAR_BEAN: {NESTED_BAR_BEAN} <br />
     * @param barBean The value of the column 'BAR_BEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarBean(NestedBarBean barBean) {
        __modifiedProperties.addPropertyName("barBean");
        this._barBean = barBean;
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
        this._quxList = quxList;
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
        this._quuxList = quuxList;
    }

    /**
     * [get] CORGE_LIST: {CORGE_TABLE} <br />
     * @return The value of the column 'CORGE_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<CorgeBean> getCorgeList() {
        return _corgeList;
    }

    /**
     * [set] CORGE_LIST: {CORGE_TABLE} <br />
     * @param corgeList The value of the column 'CORGE_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeList(List<CorgeBean> corgeList) {
        __modifiedProperties.addPropertyName("corgeList");
        this._corgeList = corgeList;
    }
}
