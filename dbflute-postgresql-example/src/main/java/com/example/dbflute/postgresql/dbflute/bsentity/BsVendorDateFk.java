package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_date_fk as TABLE. <br />
 * <pre>
 * [primary-key]
 *     bar_id
 * 
 * [column]
 *     bar_id, bar_date
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
 *     vendor_date_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorDatePk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer barId = entity.getBarId();
 * java.util.Date barDate = entity.getBarDate();
 * entity.setBarId(barId);
 * entity.setBarDate(barDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDateFk extends AbstractEntity {

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
    /** bar_id: {PK, NotNull, int4(10)} */
    protected Integer _barId;

    /** bar_date: {NotNull, date(13), FK to vendor_date_pk} */
    protected java.util.Date _barDate;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_date_fk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorDateFk";
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
        if (getBarId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_date_pk by my bar_date, named 'vendorDatePk'. */
    protected VendorDatePk _vendorDatePk;

    /**
     * [get] vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The entity of foreign property 'vendorDatePk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorDatePk getVendorDatePk() {
        return _vendorDatePk;
    }

    /**
     * [set] vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @param vendorDatePk The entity of foreign property 'vendorDatePk'. (NullAllowed)
     */
    public void setVendorDatePk(VendorDatePk vendorDatePk) {
        _vendorDatePk = vendorDatePk;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorDateFk) {
            BsVendorDateFk other = (BsVendorDateFk)obj;
            if (!xSV(_barId, other._barId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _barId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDatePk != null)
        { sb.append(li).append(xbRDS(_vendorDatePk, "vendorDatePk")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_barId));
        sb.append(dm).append(xfUD(_barDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDatePk != null)
        { sb.append(dm).append("vendorDatePk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorDateFk clone() {
        return (VendorDateFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bar_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBarId() {
        checkSpecifiedProperty("barId");
        return _barId;
    }

    /**
     * [set] bar_id: {PK, NotNull, int4(10)} <br />
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(Integer barId) {
        registerModifiedProperty("barId");
        _barId = barId;
    }

    /**
     * [get] bar_date: {NotNull, date(13), FK to vendor_date_pk} <br />
     * @return The value of the column 'bar_date'. (basically NotNull if selected: for the constraint)
     */
    public java.util.Date getBarDate() {
        checkSpecifiedProperty("barDate");
        return _barDate;
    }

    /**
     * [set] bar_date: {NotNull, date(13), FK to vendor_date_pk} <br />
     * @param barDate The value of the column 'bar_date'. (basically NotNull if update: for the constraint)
     */
    public void setBarDate(java.util.Date barDate) {
        registerModifiedProperty("barDate");
        _barDate = barDate;
    }
}
