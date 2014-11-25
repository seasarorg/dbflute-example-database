package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_inherit_inu as TABLE. <br />
 * <pre>
 * [primary-key]
 *     inu_id
 * 
 * [column]
 *     inu_id, inu_name, inu_date
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
 * Integer inuId = entity.getInuId();
 * String inuName = entity.getInuName();
 * java.util.Date inuDate = entity.getInuDate();
 * entity.setInuId(inuId);
 * entity.setInuName(inuName);
 * entity.setInuDate(inuDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorInheritInu extends AbstractEntity implements DomainEntity {

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
    /** inu_id: {PK, NotNull, int4(10)} */
    protected Integer _inuId;

    /** inu_name: {NotNull, varchar(2147483647)} */
    protected String _inuName;

    /** inu_date: {date(13)} */
    protected java.util.Date _inuDate;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_inherit_inu";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorInheritInu";
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
        if (getInuId() == null) { return false; }
        return true;
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
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorInheritInu) {
            BsVendorInheritInu other = (BsVendorInheritInu)obj;
            if (!xSV(_inuId, other._inuId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _inuId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inuId));
        sb.append(dm).append(xfND(_inuName));
        sb.append(dm).append(xfUD(_inuDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public VendorInheritInu clone() {
        return (VendorInheritInu)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] inu_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'inu_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getInuId() {
        checkSpecifiedProperty("inuId");
        return _inuId;
    }

    /**
     * [set] inu_id: {PK, NotNull, int4(10)} <br />
     * @param inuId The value of the column 'inu_id'. (basically NotNull if update: for the constraint)
     */
    public void setInuId(Integer inuId) {
        registerModifiedProperty("inuId");
        _inuId = inuId;
    }

    /**
     * [get] inu_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'inu_name'. (basically NotNull if selected: for the constraint)
     */
    public String getInuName() {
        checkSpecifiedProperty("inuName");
        return _inuName;
    }

    /**
     * [set] inu_name: {NotNull, varchar(2147483647)} <br />
     * @param inuName The value of the column 'inu_name'. (basically NotNull if update: for the constraint)
     */
    public void setInuName(String inuName) {
        registerModifiedProperty("inuName");
        _inuName = inuName;
    }

    /**
     * [get] inu_date: {date(13)} <br />
     * @return The value of the column 'inu_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getInuDate() {
        checkSpecifiedProperty("inuDate");
        return _inuDate;
    }

    /**
     * [set] inu_date: {date(13)} <br />
     * @param inuDate The value of the column 'inu_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInuDate(java.util.Date inuDate) {
        registerModifiedProperty("inuDate");
        _inuDate = inuDate;
    }
}
