package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of VENDOR_LARGE_DATA as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LARGE_DATA_ID
 * 
 * [column]
 *     LARGE_DATA_ID, STRING_INDEX, STRING_NO_INDEX, STRING_UNIQUE_INDEX, INTFLG_INDEX, NUMERIC_INTEGER_INDEX, NUMERIC_INTEGER_NO_INDEX
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
 *     VENDOR_LARGE_DATA_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorLargeDataRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long largeDataId = entity.getLargeDataId();
 * String stringIndex = entity.getStringIndex();
 * String stringNoIndex = entity.getStringNoIndex();
 * String stringUniqueIndex = entity.getStringUniqueIndex();
 * Integer intflgIndex = entity.getIntflgIndex();
 * Integer numericIntegerIndex = entity.getNumericIntegerIndex();
 * Integer numericIntegerNoIndex = entity.getNumericIntegerNoIndex();
 * entity.setLargeDataId(largeDataId);
 * entity.setStringIndex(stringIndex);
 * entity.setStringNoIndex(stringNoIndex);
 * entity.setStringUniqueIndex(stringUniqueIndex);
 * entity.setIntflgIndex(intflgIndex);
 * entity.setNumericIntegerIndex(numericIntegerIndex);
 * entity.setNumericIntegerNoIndex(numericIntegerNoIndex);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsVendorLargeData extends AbstractEntity {

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
    /** LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} */
    protected Long _largeDataId;

    /** STRING_INDEX: {IX, NotNull, VARCHAR2(200)} */
    protected String _stringIndex;

    /** STRING_NO_INDEX: {NotNull, VARCHAR2(200)} */
    protected String _stringNoIndex;

    /** STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} */
    protected String _stringUniqueIndex;

    /** INTFLG_INDEX: {NotNull, NUMBER(8)} */
    protected Integer _intflgIndex;

    /** NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} */
    protected Integer _numericIntegerIndex;

    /** NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} */
    protected Integer _numericIntegerNoIndex;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VENDOR_LARGE_DATA";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorLargeData";
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
        if (getLargeDataId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param stringUniqueIndex : UQ, NotNull, VARCHAR2(200). (NotNull)
     */
    public void uniqueBy(String stringUniqueIndex) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("stringUniqueIndex");
        setStringUniqueIndex(stringUniqueIndex);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefList;

    /**
     * [get] VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @return The entity list of referrer property 'vendorLargeDataRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefList() {
        if (_vendorLargeDataRefList == null) { _vendorLargeDataRefList = newReferrerList(); }
        return _vendorLargeDataRefList;
    }

    /**
     * [set] VENDOR_LARGE_DATA_REF by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @param vendorLargeDataRefList The entity list of referrer property 'vendorLargeDataRefList'. (NullAllowed)
     */
    public void setVendorLargeDataRefList(List<VendorLargeDataRef> vendorLargeDataRefList) {
        _vendorLargeDataRefList = vendorLargeDataRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeData) {
            BsVendorLargeData other = (BsVendorLargeData)obj;
            if (!xSV(_largeDataId, other._largeDataId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _largeDataId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeDataRefList != null) { for (VendorLargeDataRef et : _vendorLargeDataRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeDataId));
        sb.append(dm).append(xfND(_stringIndex));
        sb.append(dm).append(xfND(_stringNoIndex));
        sb.append(dm).append(xfND(_stringUniqueIndex));
        sb.append(dm).append(xfND(_intflgIndex));
        sb.append(dm).append(xfND(_numericIntegerIndex));
        sb.append(dm).append(xfND(_numericIntegerNoIndex));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeDataRefList != null && !_vendorLargeDataRefList.isEmpty())
        { sb.append(dm).append("vendorLargeDataRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeData clone() {
        return (VendorLargeData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {PK, NotNull, NUMBER(12)} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringIndex() {
        checkSpecifiedProperty("stringIndex");
        return _stringIndex;
    }

    /**
     * [set] STRING_INDEX: {IX, NotNull, VARCHAR2(200)} <br />
     * @param stringIndex The value of the column 'STRING_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringIndex(String stringIndex) {
        __modifiedProperties.addPropertyName("stringIndex");
        _stringIndex = stringIndex;
    }

    /**
     * [get] STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringNoIndex() {
        checkSpecifiedProperty("stringNoIndex");
        return _stringNoIndex;
    }

    /**
     * [set] STRING_NO_INDEX: {NotNull, VARCHAR2(200)} <br />
     * @param stringNoIndex The value of the column 'STRING_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringNoIndex(String stringNoIndex) {
        __modifiedProperties.addPropertyName("stringNoIndex");
        _stringNoIndex = stringNoIndex;
    }

    /**
     * [get] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringUniqueIndex() {
        checkSpecifiedProperty("stringUniqueIndex");
        return _stringUniqueIndex;
    }

    /**
     * [set] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR2(200)} <br />
     * @param stringUniqueIndex The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringUniqueIndex(String stringUniqueIndex) {
        __modifiedProperties.addPropertyName("stringUniqueIndex");
        _stringUniqueIndex = stringUniqueIndex;
    }

    /**
     * [get] INTFLG_INDEX: {NotNull, NUMBER(8)} <br />
     * @return The value of the column 'INTFLG_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntflgIndex() {
        checkSpecifiedProperty("intflgIndex");
        return _intflgIndex;
    }

    /**
     * [set] INTFLG_INDEX: {NotNull, NUMBER(8)} <br />
     * @param intflgIndex The value of the column 'INTFLG_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setIntflgIndex(Integer intflgIndex) {
        __modifiedProperties.addPropertyName("intflgIndex");
        _intflgIndex = intflgIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerIndex() {
        checkSpecifiedProperty("numericIntegerIndex");
        return _numericIntegerIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_INDEX: {IX, NotNull, NUMBER(8)} <br />
     * @param numericIntegerIndex The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerIndex(Integer numericIntegerIndex) {
        __modifiedProperties.addPropertyName("numericIntegerIndex");
        _numericIntegerIndex = numericIntegerIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerNoIndex() {
        checkSpecifiedProperty("numericIntegerNoIndex");
        return _numericIntegerNoIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_NO_INDEX: {NotNull, NUMBER(8)} <br />
     * @param numericIntegerNoIndex The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerNoIndex(Integer numericIntegerNoIndex) {
        __modifiedProperties.addPropertyName("numericIntegerNoIndex");
        _numericIntegerNoIndex = numericIntegerNoIndex;
    }
}
