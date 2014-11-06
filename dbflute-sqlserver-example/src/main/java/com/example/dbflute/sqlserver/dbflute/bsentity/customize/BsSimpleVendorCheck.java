package com.example.dbflute.sqlserver.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.sqlserver.dbflute.exentity.customize.*;

/**
 * The entity of SimpleVendorCheck. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_TEXT, TYPE_OF_DATETIME, TYPE_OF_SMALLDATETIME, TYPE_OF_BIT, TYPE_OF_UNIQUEIDENTIFIER
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * String typeOfText = entity.getTypeOfText();
 * java.sql.Timestamp typeOfDatetime = entity.getTypeOfDatetime();
 * java.sql.Timestamp typeOfSmalldatetime = entity.getTypeOfSmalldatetime();
 * Boolean typeOfBit = entity.getTypeOfBit();
 * java.util.UUID typeOfUniqueidentifier = entity.getTypeOfUniqueidentifier();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfDatetime(typeOfDatetime);
 * entity.setTypeOfSmalldatetime(typeOfSmalldatetime);
 * entity.setTypeOfBit(typeOfBit);
 * entity.setTypeOfUniqueidentifier(typeOfUniqueidentifier);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSimpleVendorCheck extends AbstractEntity {

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
    /** VENDOR_CHECK_ID: {numeric(16)} */
    protected Long _vendorCheckId;

    /** TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** TYPE_OF_NUMERIC_INTEGER: {numeric(5)} */
    protected Integer _typeOfNumericInteger;

    /** TYPE_OF_NUMERIC_BIGINT: {numeric(12)} */
    protected Long _typeOfNumericBigint;

    /** TYPE_OF_TEXT: {text(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} */
    protected String _typeOfText;

    /** TYPE_OF_DATETIME: {datetime(23, 3)} */
    protected java.sql.Timestamp _typeOfDatetime;

    /** TYPE_OF_SMALLDATETIME: {smalldatetime(16)} */
    protected java.sql.Timestamp _typeOfSmalldatetime;

    /** TYPE_OF_BIT: {bit(1)} */
    protected Boolean _typeOfBit;

    /** TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} */
    protected java.util.UUID _typeOfUniqueidentifier;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SimpleVendorCheck";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "simpleVendorCheck";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.sqlserver.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm.getInstance();
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
        if (obj instanceof BsSimpleVendorCheck) {
            BsSimpleVendorCheck other = (BsSimpleVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfNumericDecimal, other._typeOfNumericDecimal)) { return false; }
            if (!xSV(_typeOfNumericInteger, other._typeOfNumericInteger)) { return false; }
            if (!xSV(_typeOfNumericBigint, other._typeOfNumericBigint)) { return false; }
            if (!xSV(_typeOfText, other._typeOfText)) { return false; }
            if (!xSV(_typeOfDatetime, other._typeOfDatetime)) { return false; }
            if (!xSV(_typeOfSmalldatetime, other._typeOfSmalldatetime)) { return false; }
            if (!xSV(_typeOfBit, other._typeOfBit)) { return false; }
            if (!xSV(_typeOfUniqueidentifier, other._typeOfUniqueidentifier)) { return false; }
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
        hs = xCH(hs, _typeOfNumericDecimal);
        hs = xCH(hs, _typeOfNumericInteger);
        hs = xCH(hs, _typeOfNumericBigint);
        hs = xCH(hs, _typeOfText);
        hs = xCH(hs, _typeOfDatetime);
        hs = xCH(hs, _typeOfSmalldatetime);
        hs = xCH(hs, _typeOfBit);
        hs = xCH(hs, _typeOfUniqueidentifier);
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
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfDatetime));
        sb.append(dm).append(xfND(_typeOfSmalldatetime));
        sb.append(dm).append(xfND(_typeOfBit));
        sb.append(dm).append(xfND(_typeOfUniqueidentifier));
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
    public SimpleVendorCheck clone() {
        return (SimpleVendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {numeric(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {numeric(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {numeric(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {numeric(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {numeric(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_TEXT: {text(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {text(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @return The value of the column 'TYPE_OF_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfDatetime() {
        checkSpecifiedProperty("typeOfDatetime");
        return _typeOfDatetime;
    }

    /**
     * [set] TYPE_OF_DATETIME: {datetime(23, 3)} <br />
     * @param typeOfDatetime The value of the column 'TYPE_OF_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDatetime(java.sql.Timestamp typeOfDatetime) {
        registerModifiedProperty("typeOfDatetime");
        _typeOfDatetime = typeOfDatetime;
    }

    /**
     * [get] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @return The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfSmalldatetime() {
        checkSpecifiedProperty("typeOfSmalldatetime");
        return _typeOfSmalldatetime;
    }

    /**
     * [set] TYPE_OF_SMALLDATETIME: {smalldatetime(16)} <br />
     * @param typeOfSmalldatetime The value of the column 'TYPE_OF_SMALLDATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfSmalldatetime(java.sql.Timestamp typeOfSmalldatetime) {
        registerModifiedProperty("typeOfSmalldatetime");
        _typeOfSmalldatetime = typeOfSmalldatetime;
    }

    /**
     * [get] TYPE_OF_BIT: {bit(1)} <br />
     * @return The value of the column 'TYPE_OF_BIT'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        checkSpecifiedProperty("typeOfBit");
        return _typeOfBit;
    }

    /**
     * [set] TYPE_OF_BIT: {bit(1)} <br />
     * @param typeOfBit The value of the column 'TYPE_OF_BIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        registerModifiedProperty("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @return The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUniqueidentifier() {
        checkSpecifiedProperty("typeOfUniqueidentifier");
        return _typeOfUniqueidentifier;
    }

    /**
     * [set] TYPE_OF_UNIQUEIDENTIFIER: {uniqueidentifier(36)} <br />
     * @param typeOfUniqueidentifier The value of the column 'TYPE_OF_UNIQUEIDENTIFIER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUniqueidentifier(java.util.UUID typeOfUniqueidentifier) {
        registerModifiedProperty("typeOfUniqueidentifier");
        _typeOfUniqueidentifier = typeOfUniqueidentifier;
    }
}
