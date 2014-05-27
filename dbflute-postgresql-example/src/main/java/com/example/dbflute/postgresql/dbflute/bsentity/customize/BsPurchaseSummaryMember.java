package com.example.dbflute.postgresql.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of PurchaseSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     member_id, member_name, birthdate, formalized_datetime, purchase_summary
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
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * Long purchaseSummary = entity.getPurchaseSummary();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setPurchaseSummary(purchaseSummary);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseSummaryMember implements Entity, Serializable, Cloneable {

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
    /** member_id: {int4(10)} */
    protected Integer _memberId;

    /** member_name: {varchar(200)} */
    protected String _memberName;

    /** birthdate: {date(13)} */
    protected java.util.Date _birthdate;

    /** formalized_datetime: {timestamp(26, 3)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** purchase_summary: {int8(19)} */
    protected Long _purchaseSummary;

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
        return "PurchaseSummaryMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "purchaseSummaryMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta.PurchaseSummaryMemberDbm.getInstance();
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
    public Set<String> uniqueDrivenProperties() {
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
        if (obj == null || !(obj instanceof BsPurchaseSummaryMember)) { return false; }
        BsPurchaseSummaryMember other = (BsPurchaseSummaryMember)obj;
        if (!xSV(getMemberId(), other.getMemberId())) { return false; }
        if (!xSV(getMemberName(), other.getMemberName())) { return false; }
        if (!xSV(getBirthdate(), other.getBirthdate())) { return false; }
        if (!xSV(getFormalizedDatetime(), other.getFormalizedDatetime())) { return false; }
        if (!xSV(getPurchaseSummary(), other.getPurchaseSummary())) { return false; }
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
        hs = xCH(hs, getMemberId());
        hs = xCH(hs, getMemberName());
        hs = xCH(hs, getBirthdate());
        hs = xCH(hs, getFormalizedDatetime());
        hs = xCH(hs, getPurchaseSummary());
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
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(xfUD(getBirthdate()));
        sb.append(dm).append(getFormalizedDatetime());
        sb.append(dm).append(getPurchaseSummary());
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
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public PurchaseSummaryMember clone() {
        try {
            return (PurchaseSummaryMember)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] member_id: {int4(10)} <br />
     * @return The value of the column 'member_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] member_id: {int4(10)} <br />
     * @param memberId The value of the column 'member_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] member_name: {varchar(200)} <br />
     * @return The value of the column 'member_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] member_name: {varchar(200)} <br />
     * @param memberName The value of the column 'member_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] birthdate: {date(13)} <br />
     * @return The value of the column 'birthdate'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] birthdate: {date(13)} <br />
     * @param birthdate The value of the column 'birthdate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] formalized_datetime: {timestamp(26, 3)} <br />
     * @return The value of the column 'formalized_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] formalized_datetime: {timestamp(26, 3)} <br />
     * @param formalizedDatetime The value of the column 'formalized_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        this._formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] purchase_summary: {int8(19)} <br />
     * @return The value of the column 'purchase_summary'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPurchaseSummary() {
        return _purchaseSummary;
    }

    /**
     * [set] purchase_summary: {int8(19)} <br />
     * @param purchaseSummary The value of the column 'purchase_summary'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseSummary(Long purchaseSummary) {
        __modifiedProperties.addPropertyName("purchaseSummary");
        this._purchaseSummary = purchaseSummary;
    }
}
