package com.example.dbflute.tricky.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.tricky.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.tricky.dbflute.exentity.*;

/**
 * The entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_TEXT, TYPE_OF_INTEGER, TYPE_OF_REAL
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
 * Integer vendorCheckId = entity.getVendorCheckId();
 * String typeOfText = entity.getTypeOfText();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * String typeOfReal = entity.getTypeOfReal();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfReal(typeOfReal);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheck extends AbstractEntity {

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
    /** VENDOR_CHECK_ID: {PK, NotNull, INTEGER(2000000000, 10)} */
    protected Integer _vendorCheckId;

    /** TYPE_OF_TEXT: {TEXT(2000000000, 10)} */
    protected String _typeOfText;

    /** TYPE_OF_INTEGER: {INTEGER(2000000000, 10)} */
    protected Integer _typeOfInteger;

    /** TYPE_OF_REAL: {REAL(2000000000, 10)} */
    protected String _typeOfReal;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_CHECK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorCheck";
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
        if (getVendorCheckId() == null) { return false; }
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
        if (obj instanceof BsVendorCheck) {
            BsVendorCheck other = (BsVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfInteger));
        sb.append(dm).append(xfND(_typeOfReal));
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
    public VendorCheck clone() {
        return (VendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, INTEGER(2000000000, 10)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Integer vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_TEXT: {TEXT(2000000000, 10)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {TEXT(2000000000, 10)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(2000000000, 10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInteger() {
        checkSpecifiedProperty("typeOfInteger");
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(2000000000, 10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInteger(Integer typeOfInteger) {
        registerModifiedProperty("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_REAL: {REAL(2000000000, 10)} <br />
     * @return The value of the column 'TYPE_OF_REAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfReal() {
        checkSpecifiedProperty("typeOfReal");
        return _typeOfReal;
    }

    /**
     * [set] TYPE_OF_REAL: {REAL(2000000000, 10)} <br />
     * @param typeOfReal The value of the column 'TYPE_OF_REAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfReal(String typeOfReal) {
        registerModifiedProperty("typeOfReal");
        _typeOfReal = typeOfReal;
    }
}
