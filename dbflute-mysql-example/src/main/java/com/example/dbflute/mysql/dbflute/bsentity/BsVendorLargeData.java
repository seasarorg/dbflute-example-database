/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

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
    /** LARGE_DATA_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _largeDataId;

    /** STRING_INDEX: {IX, NotNull, VARCHAR(180)} */
    protected String _stringIndex;

    /** STRING_NO_INDEX: {NotNull, VARCHAR(180)} */
    protected String _stringNoIndex;

    /** STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)} */
    protected String _stringUniqueIndex;

    /** INTFLG_INDEX: {NotNull, INT(10)} */
    protected Integer _intflgIndex;

    /** NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)} */
    protected Integer _numericIntegerIndex;

    /** NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)} */
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
     * @param stringUniqueIndex : UQ, NotNull, VARCHAR(180). (NotNull)
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
    /** vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefList;

    /**
     * [get] vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
     * @return The entity list of referrer property 'vendorLargeDataRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefList() {
        if (_vendorLargeDataRefList == null) { _vendorLargeDataRefList = newReferrerList(); }
        return _vendorLargeDataRefList;
    }

    /**
     * [set] vendor_large_data_ref by LARGE_DATA_ID, named 'vendorLargeDataRefList'.
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
     * [get] LARGE_DATA_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'LARGE_DATA_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] LARGE_DATA_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param largeDataId The value of the column 'LARGE_DATA_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] STRING_INDEX: {IX, NotNull, VARCHAR(180)} <br />
     * @return The value of the column 'STRING_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringIndex() {
        checkSpecifiedProperty("stringIndex");
        return _stringIndex;
    }

    /**
     * [set] STRING_INDEX: {IX, NotNull, VARCHAR(180)} <br />
     * @param stringIndex The value of the column 'STRING_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringIndex(String stringIndex) {
        registerModifiedProperty("stringIndex");
        _stringIndex = stringIndex;
    }

    /**
     * [get] STRING_NO_INDEX: {NotNull, VARCHAR(180)} <br />
     * @return The value of the column 'STRING_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringNoIndex() {
        checkSpecifiedProperty("stringNoIndex");
        return _stringNoIndex;
    }

    /**
     * [set] STRING_NO_INDEX: {NotNull, VARCHAR(180)} <br />
     * @param stringNoIndex The value of the column 'STRING_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringNoIndex(String stringNoIndex) {
        registerModifiedProperty("stringNoIndex");
        _stringNoIndex = stringNoIndex;
    }

    /**
     * [get] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)} <br />
     * @return The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public String getStringUniqueIndex() {
        checkSpecifiedProperty("stringUniqueIndex");
        return _stringUniqueIndex;
    }

    /**
     * [set] STRING_UNIQUE_INDEX: {UQ, NotNull, VARCHAR(180)} <br />
     * @param stringUniqueIndex The value of the column 'STRING_UNIQUE_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setStringUniqueIndex(String stringUniqueIndex) {
        registerModifiedProperty("stringUniqueIndex");
        _stringUniqueIndex = stringUniqueIndex;
    }

    /**
     * [get] INTFLG_INDEX: {NotNull, INT(10)} <br />
     * @return The value of the column 'INTFLG_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getIntflgIndex() {
        checkSpecifiedProperty("intflgIndex");
        return _intflgIndex;
    }

    /**
     * [set] INTFLG_INDEX: {NotNull, INT(10)} <br />
     * @param intflgIndex The value of the column 'INTFLG_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setIntflgIndex(Integer intflgIndex) {
        registerModifiedProperty("intflgIndex");
        _intflgIndex = intflgIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerIndex() {
        checkSpecifiedProperty("numericIntegerIndex");
        return _numericIntegerIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_INDEX: {IX, NotNull, DECIMAL(8)} <br />
     * @param numericIntegerIndex The value of the column 'NUMERIC_INTEGER_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerIndex(Integer numericIntegerIndex) {
        registerModifiedProperty("numericIntegerIndex");
        _numericIntegerIndex = numericIntegerIndex;
    }

    /**
     * [get] NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)} <br />
     * @return The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumericIntegerNoIndex() {
        checkSpecifiedProperty("numericIntegerNoIndex");
        return _numericIntegerNoIndex;
    }

    /**
     * [set] NUMERIC_INTEGER_NO_INDEX: {NotNull, DECIMAL(8)} <br />
     * @param numericIntegerNoIndex The value of the column 'NUMERIC_INTEGER_NO_INDEX'. (basically NotNull if update: for the constraint)
     */
    public void setNumericIntegerNoIndex(Integer numericIntegerNoIndex) {
        registerModifiedProperty("numericIntegerNoIndex");
        _numericIntegerNoIndex = numericIntegerNoIndex;
    }
}
