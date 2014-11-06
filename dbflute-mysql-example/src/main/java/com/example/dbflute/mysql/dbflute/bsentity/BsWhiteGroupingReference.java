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
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_GROUPING_REFERENCE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     GROUPING_REFERENCE_ID
 * 
 * [column]
 *     GROUPING_REFERENCE_ID, GROUPING_REFERENCE_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     GROUPING_REFERENCE_ID
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
 * Long groupingReferenceId = entity.getGroupingReferenceId();
 * String groupingReferenceCode = entity.getGroupingReferenceCode();
 * entity.setGroupingReferenceId(groupingReferenceId);
 * entity.setGroupingReferenceCode(groupingReferenceCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteGroupingReference extends AbstractEntity {

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
    /** GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _groupingReferenceId;

    /** GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} */
    protected String _groupingReferenceCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_grouping_reference";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteGroupingReference";
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
        if (getGroupingReferenceId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of groupingReferenceCode as the classification of GroupingReference. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.GroupingReference getGroupingReferenceCodeAsGroupingReference() {
        return CDef.GroupingReference.codeOf(getGroupingReferenceCode());
    }

    /**
     * Set the value of groupingReferenceCode as the classification of GroupingReference. <br />
     * GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * the test of reference variable in grouping map
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference cdef) {
        setGroupingReferenceCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of groupingReferenceCode as LAND_NAME (LND). <br />
     * LAND_NAME
     */
    public void setGroupingReferenceCode_LAND_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.LAND_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as SEA_NAME (SEA). <br />
     * SEA_NAME
     */
    public void setGroupingReferenceCode_SEA_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.SEA_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as IKSPIARY_NAME (IKS). <br />
     * IKSPIARY_NAME
     */
    public void setGroupingReferenceCode_IKSPIARY_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.IKSPIARY_NAME);
    }

    /**
     * Set the value of groupingReferenceCode as AMPHI_NAME (AMP). <br />
     * AMPHI_NAME
     */
    public void setGroupingReferenceCode_AMPHI_NAME() {
        setGroupingReferenceCodeAsGroupingReference(CDef.GroupingReference.AMPHI_NAME);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of groupingReferenceCode LAND_NAME? <br />
     * LAND_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeLAND_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.LAND_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode SEA_NAME? <br />
     * SEA_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeSEA_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.SEA_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode IKSPIARY_NAME? <br />
     * IKSPIARY_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeIKSPIARY_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.IKSPIARY_NAME) : false;
    }

    /**
     * Is the value of groupingReferenceCode AMPHI_NAME? <br />
     * AMPHI_NAME
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCodeAMPHI_NAME() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.equals(CDef.GroupingReference.AMPHI_NAME) : false;
    }

    /**
     * サービスが利用できる会員 <br />
     * The group elements:[LAND_NAME, SEA_NAME]
     * @return The determination, true or false.
     */
    public boolean isGroupingReferenceCode_ServiceAvailable() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isServiceAvailable();
    }

    public boolean isGroupingReferenceCode_ServicePlus() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isServicePlus();
    }

    public boolean isGroupingReferenceCode_NestedPlus() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isNestedPlus();
    }

    public boolean isGroupingReferenceCode_OneDef() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isOneDef();
    }

    public boolean isGroupingReferenceCode_DupRef() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null && cdef.isDupRef();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'groupingReferenceCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getGroupingReferenceCodeName() {
        CDef.GroupingReference cdef = getGroupingReferenceCodeAsGroupingReference();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsWhiteGroupingReference) {
            BsWhiteGroupingReference other = (BsWhiteGroupingReference)obj;
            if (!xSV(_groupingReferenceId, other._groupingReferenceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _groupingReferenceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_groupingReferenceId));
        sb.append(dm).append(xfND(_groupingReferenceCode));
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
    public WhiteGroupingReference clone() {
        return (WhiteGroupingReference)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'GROUPING_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGroupingReferenceId() {
        checkSpecifiedProperty("groupingReferenceId");
        return _groupingReferenceId;
    }

    /**
     * [set] GROUPING_REFERENCE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param groupingReferenceId The value of the column 'GROUPING_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGroupingReferenceId(Long groupingReferenceId) {
        registerModifiedProperty("groupingReferenceId");
        _groupingReferenceId = groupingReferenceId;
    }

    /**
     * [get] GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * @return The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getGroupingReferenceCode() {
        checkSpecifiedProperty("groupingReferenceCode");
        return _groupingReferenceCode;
    }

    /**
     * [set] GROUPING_REFERENCE_CODE: {NotNull, CHAR(3), classification=GroupingReference} <br />
     * @param groupingReferenceCode The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setGroupingReferenceCode(String groupingReferenceCode) {
        registerModifiedProperty("groupingReferenceCode");
        _groupingReferenceCode = groupingReferenceCode;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param groupingReferenceCode The value of the column 'GROUPING_REFERENCE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingGroupingReferenceCode(String groupingReferenceCode) {
        setGroupingReferenceCode(groupingReferenceCode);
    }
}
