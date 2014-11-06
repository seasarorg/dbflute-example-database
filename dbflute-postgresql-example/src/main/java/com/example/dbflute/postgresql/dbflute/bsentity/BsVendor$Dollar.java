package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_$_dollar as TABLE. <br />
 * <pre>
 * [primary-key]
 *     vendor_$_dollar_id
 * 
 * [column]
 *     vendor_$_dollar_id, vendor_$_dollar_name
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
 * Integer vendor$DollarId = entity.getVendor$DollarId();
 * String vendor$DollarName = entity.getVendor$DollarName();
 * entity.setVendor$DollarId(vendor$DollarId);
 * entity.setVendor$DollarName(vendor$DollarName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor$Dollar extends AbstractEntity {

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
    /** vendor_$_dollar_id: {PK, NotNull, int4(10)} */
    protected Integer _vendor$DollarId;

    /** vendor_$_dollar_name: {varchar(64)} */
    protected String _vendor$DollarName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_$_dollar";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendor$Dollar";
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
        if (getVendor$DollarId() == null) { return false; }
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
        if (obj instanceof BsVendor$Dollar) {
            BsVendor$Dollar other = (BsVendor$Dollar)obj;
            if (!xSV(_vendor$DollarId, other._vendor$DollarId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendor$DollarId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendor$DollarId));
        sb.append(dm).append(xfND(_vendor$DollarName));
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
    public Vendor$Dollar clone() {
        return (Vendor$Dollar)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_$_dollar_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'vendor_$_dollar_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVendor$DollarId() {
        checkSpecifiedProperty("vendor$DollarId");
        return _vendor$DollarId;
    }

    /**
     * [set] vendor_$_dollar_id: {PK, NotNull, int4(10)} <br />
     * @param vendor$DollarId The value of the column 'vendor_$_dollar_id'. (basically NotNull if update: for the constraint)
     */
    public void setVendor$DollarId(Integer vendor$DollarId) {
        registerModifiedProperty("vendor$DollarId");
        _vendor$DollarId = vendor$DollarId;
    }

    /**
     * [get] vendor_$_dollar_name: {varchar(64)} <br />
     * @return The value of the column 'vendor_$_dollar_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getVendor$DollarName() {
        checkSpecifiedProperty("vendor$DollarName");
        return _vendor$DollarName;
    }

    /**
     * [set] vendor_$_dollar_name: {varchar(64)} <br />
     * @param vendor$DollarName The value of the column 'vendor_$_dollar_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendor$DollarName(String vendor$DollarName) {
        registerModifiedProperty("vendor$DollarName");
        _vendor$DollarName = vendor$DollarName;
    }
}
