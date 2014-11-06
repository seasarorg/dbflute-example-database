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
 * The entity of WHITE_PERROTTA_OVER_MEMBER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PRODUCT_ID, TRACE_TYPE_CODE, MACHO_CODE
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
 *     white_perrotta_over_member_macho, white_perrotta_over_product
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whitePerrottaOverMemberMacho, whitePerrottaOverProduct
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * Long productId = entity.getProductId();
 * String traceTypeCode = entity.getTraceTypeCode();
 * String machoCode = entity.getMachoCode();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setProductId(productId);
 * entity.setTraceTypeCode(traceTypeCode);
 * entity.setMachoCode(machoCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePerrottaOverMember extends AbstractEntity {

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
    /** MEMBER_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _memberId;

    /** MEMBER_NAME: {NotNull, VARCHAR(200)} */
    protected String _memberName;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} */
    protected Long _productId;

    /** TRACE_TYPE_CODE: {NotNull, CHAR(3)} */
    protected String _traceTypeCode;

    /** MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} */
    protected String _machoCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_perrotta_over_member";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePerrottaOverMember";
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
        if (getMemberId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_perrotta_over_member_macho by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'. */
    protected WhitePerrottaOverMemberMacho _whitePerrottaOverMemberMacho;

    /**
     * [get] white_perrotta_over_member_macho by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'.
     * @return The entity of foreign property 'whitePerrottaOverMemberMacho'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverMemberMacho getWhitePerrottaOverMemberMacho() {
        return _whitePerrottaOverMemberMacho;
    }

    /**
     * [set] white_perrotta_over_member_macho by my MACHO_CODE, named 'whitePerrottaOverMemberMacho'.
     * @param whitePerrottaOverMemberMacho The entity of foreign property 'whitePerrottaOverMemberMacho'. (NullAllowed)
     */
    public void setWhitePerrottaOverMemberMacho(WhitePerrottaOverMemberMacho whitePerrottaOverMemberMacho) {
        _whitePerrottaOverMemberMacho = whitePerrottaOverMemberMacho;
    }

    /** white_perrotta_over_product by my PRODUCT_ID, named 'whitePerrottaOverProduct'. */
    protected WhitePerrottaOverProduct _whitePerrottaOverProduct;

    /**
     * [get] white_perrotta_over_product by my PRODUCT_ID, named 'whitePerrottaOverProduct'.
     * @return The entity of foreign property 'whitePerrottaOverProduct'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePerrottaOverProduct getWhitePerrottaOverProduct() {
        return _whitePerrottaOverProduct;
    }

    /**
     * [set] white_perrotta_over_product by my PRODUCT_ID, named 'whitePerrottaOverProduct'.
     * @param whitePerrottaOverProduct The entity of foreign property 'whitePerrottaOverProduct'. (NullAllowed)
     */
    public void setWhitePerrottaOverProduct(WhitePerrottaOverProduct whitePerrottaOverProduct) {
        _whitePerrottaOverProduct = whitePerrottaOverProduct;
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
        if (obj instanceof BsWhitePerrottaOverMember) {
            BsWhitePerrottaOverMember other = (BsWhitePerrottaOverMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberMacho != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverMemberMacho, "whitePerrottaOverMemberMacho")); }
        if (_whitePerrottaOverProduct != null)
        { sb.append(li).append(xbRDS(_whitePerrottaOverProduct, "whitePerrottaOverProduct")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_traceTypeCode));
        sb.append(dm).append(xfND(_machoCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePerrottaOverMemberMacho != null)
        { sb.append(dm).append("whitePerrottaOverMemberMacho"); }
        if (_whitePerrottaOverProduct != null)
        { sb.append(dm).append("whitePerrottaOverProduct"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePerrottaOverMember clone() {
        return (WhitePerrottaOverMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {NotNull, VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to white_perrotta_over_product} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTraceTypeCode() {
        checkSpecifiedProperty("traceTypeCode");
        return _traceTypeCode;
    }

    /**
     * [set] TRACE_TYPE_CODE: {NotNull, CHAR(3)} <br />
     * @param traceTypeCode The value of the column 'TRACE_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setTraceTypeCode(String traceTypeCode) {
        registerModifiedProperty("traceTypeCode");
        _traceTypeCode = traceTypeCode;
    }

    /**
     * [get] MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} <br />
     * @return The value of the column 'MACHO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMachoCode() {
        checkSpecifiedProperty("machoCode");
        return _machoCode;
    }

    /**
     * [set] MACHO_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_member_macho} <br />
     * @param machoCode The value of the column 'MACHO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMachoCode(String machoCode) {
        registerModifiedProperty("machoCode");
        _machoCode = machoCode;
    }
}
