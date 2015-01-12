package com.example.dbflute.db2.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.db2.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The entity of VENDOR_DEFAULT_VALUE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DEFAULT_VALUE_ID
 * 
 * [column]
 *     DEFAULT_VALUE_ID, DEFAULT_TIMESTAMP
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
 * Long defaultValueId = entity.getDefaultValueId();
 * java.sql.Timestamp defaultTimestamp = entity.getDefaultTimestamp();
 * entity.setDefaultValueId(defaultValueId);
 * entity.setDefaultTimestamp(defaultTimestamp);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDefaultValue extends AbstractEntity implements DomainEntity {

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
    /** DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _defaultValueId;

    /** DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]} */
    protected java.sql.Timestamp _defaultTimestamp;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_DEFAULT_VALUE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorDefaultValue";
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
        if (getDefaultValueId() == null) { return false; }
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
        if (obj instanceof BsVendorDefaultValue) {
            BsVendorDefaultValue other = (BsVendorDefaultValue)obj;
            if (!xSV(_defaultValueId, other._defaultValueId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _defaultValueId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_defaultValueId));
        sb.append(dm).append(xfND(_defaultTimestamp));
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
    public VendorDefaultValue clone() {
        return (VendorDefaultValue)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'DEFAULT_VALUE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDefaultValueId() {
        checkSpecifiedProperty("defaultValueId");
        return _defaultValueId;
    }

    /**
     * [set] DEFAULT_VALUE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param defaultValueId The value of the column 'DEFAULT_VALUE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultValueId(Long defaultValueId) {
        registerModifiedProperty("defaultValueId");
        _defaultValueId = defaultValueId;
    }

    /**
     * [get] DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]} <br />
     * @return The value of the column 'DEFAULT_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getDefaultTimestamp() {
        checkSpecifiedProperty("defaultTimestamp");
        return _defaultTimestamp;
    }

    /**
     * [set] DEFAULT_TIMESTAMP: {NotNull, TIMESTAMP(26, 6), default=[9999-12-31-23.59.59.999999]} <br />
     * @param defaultTimestamp The value of the column 'DEFAULT_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    public void setDefaultTimestamp(java.sql.Timestamp defaultTimestamp) {
        registerModifiedProperty("defaultTimestamp");
        _defaultTimestamp = defaultTimestamp;
    }
}
