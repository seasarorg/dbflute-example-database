package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_large_data as TABLE. <br />
 * <pre>
 * [primary-key]
 *     large_data_id
 * 
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
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
 *     vendor_large_data_ref
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
 * @author DBFlute(AutoGenerator)
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
    /** large_data_id: {PK, NotNull, int8(19)} */
    protected Long _largeDataId;

    /** string_index: {IX, NotNull, varchar(200)} */
    protected String _stringIndex;

    /** string_no_index: {NotNull, varchar(200)} */
    protected String _stringNoIndex;

    /** string_unique_index: {UQ, NotNull, varchar(200)} */
    protected String _stringUniqueIndex;

    /** intflg_index: {NotNull, int4(10)} */
    protected Integer _intflgIndex;

    /** numeric_integer_index: {IX, NotNull, numeric(8)} */
    protected Integer _numericIntegerIndex;

    /** numeric_integer_no_index: {NotNull, numeric(8)} */
    protected Integer _numericIntegerNoIndex;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_large_data";
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
     * @param stringUniqueIndex : UQ, NotNull, varchar(200). (NotNull)
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
    /** vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefList;

    /**
     * [get] vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * @return The entity list of referrer property 'vendorLargeDataRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefList() {
        if (_vendorLargeDataRefList == null) { _vendorLargeDataRefList = newReferrerList(); }
        return _vendorLargeDataRefList;
    }

    /**
     * [set] vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
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
     * [get] large_data_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'large_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {PK, NotNull, int8(19)} <br />
     * @param largeDataId The value of the column 'large_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        __modifiedProperties.addPropertyName("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] string_index: {IX, NotNull, varchar(200)} <br />
     * @return The value of the column 'string_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringIndex() {
        checkSpecifiedProperty("stringIndex");
        return _stringIndex;
    }

    /**
     * [set] string_index: {IX, NotNull, varchar(200)} <br />
     * @param stringIndex The value of the column 'string_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringIndex(String stringIndex) {
        __modifiedProperties.addPropertyName("stringIndex");
        _stringIndex = stringIndex;
    }

    /**
     * [get] string_no_index: {NotNull, varchar(200)} <br />
     * @return The value of the column 'string_no_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringNoIndex() {
        checkSpecifiedProperty("stringNoIndex");
        return _stringNoIndex;
    }

    /**
     * [set] string_no_index: {NotNull, varchar(200)} <br />
     * @param stringNoIndex The value of the column 'string_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringNoIndex(String stringNoIndex) {
        __modifiedProperties.addPropertyName("stringNoIndex");
        _stringNoIndex = stringNoIndex;
    }

    /**
     * [get] string_unique_index: {UQ, NotNull, varchar(200)} <br />
     * @return The value of the column 'string_unique_index'. (basically NotNull if selected: for the constraint)
     */
    public String getStringUniqueIndex() {
        checkSpecifiedProperty("stringUniqueIndex");
        return _stringUniqueIndex;
    }

    /**
     * [set] string_unique_index: {UQ, NotNull, varchar(200)} <br />
     * @param stringUniqueIndex The value of the column 'string_unique_index'. (basically NotNull if update: for the constraint)
     */
    public void setStringUniqueIndex(String stringUniqueIndex) {
        __modifiedProperties.addPropertyName("stringUniqueIndex");
        _stringUniqueIndex = stringUniqueIndex;
    }

    /**
     * [get] intflg_index: {NotNull, int4(10)} <br />
     * @return The value of the column 'intflg_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntflgIndex() {
        checkSpecifiedProperty("intflgIndex");
        return _intflgIndex;
    }

    /**
     * [set] intflg_index: {NotNull, int4(10)} <br />
     * @param intflgIndex The value of the column 'intflg_index'. (basically NotNull if update: for the constraint)
     */
    public void setIntflgIndex(Integer intflgIndex) {
        __modifiedProperties.addPropertyName("intflgIndex");
        _intflgIndex = intflgIndex;
    }

    /**
     * [get] numeric_integer_index: {IX, NotNull, numeric(8)} <br />
     * @return The value of the column 'numeric_integer_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerIndex() {
        checkSpecifiedProperty("numericIntegerIndex");
        return _numericIntegerIndex;
    }

    /**
     * [set] numeric_integer_index: {IX, NotNull, numeric(8)} <br />
     * @param numericIntegerIndex The value of the column 'numeric_integer_index'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerIndex(Integer numericIntegerIndex) {
        __modifiedProperties.addPropertyName("numericIntegerIndex");
        _numericIntegerIndex = numericIntegerIndex;
    }

    /**
     * [get] numeric_integer_no_index: {NotNull, numeric(8)} <br />
     * @return The value of the column 'numeric_integer_no_index'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerNoIndex() {
        checkSpecifiedProperty("numericIntegerNoIndex");
        return _numericIntegerNoIndex;
    }

    /**
     * [set] numeric_integer_no_index: {NotNull, numeric(8)} <br />
     * @param numericIntegerNoIndex The value of the column 'numeric_integer_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerNoIndex(Integer numericIntegerNoIndex) {
        __modifiedProperties.addPropertyName("numericIntegerNoIndex");
        _numericIntegerNoIndex = numericIntegerNoIndex;
    }
}
