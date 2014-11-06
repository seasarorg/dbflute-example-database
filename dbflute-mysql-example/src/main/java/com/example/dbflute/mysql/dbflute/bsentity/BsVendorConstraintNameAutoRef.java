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
 * The entity of VENDOR_CONSTRAINT_NAME_AUTO_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CONSTRAINT_NAME_AUTO_REF_ID
 * 
 * [column]
 *     CONSTRAINT_NAME_AUTO_REF_ID, CONSTRAINT_NAME_AUTO_FOO_ID, CONSTRAINT_NAME_AUTO_BAR_ID, CONSTRAINT_NAME_AUTO_QUX_ID, CONSTRAINT_NAME_AUTO_CORGE_ID, CONSTRAINT_NAME_AUTO_UNIQUE
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
 *     vendor_constraint_name_auto_foo, vendor_constraint_name_auto_bar, vendor_constraint_name_auto_qux
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorConstraintNameAutoFoo, vendorConstraintNameAutoBar, vendorConstraintNameAutoQux
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long constraintNameAutoRefId = entity.getConstraintNameAutoRefId();
 * Long constraintNameAutoFooId = entity.getConstraintNameAutoFooId();
 * Long constraintNameAutoBarId = entity.getConstraintNameAutoBarId();
 * Long constraintNameAutoQuxId = entity.getConstraintNameAutoQuxId();
 * Long constraintNameAutoCorgeId = entity.getConstraintNameAutoCorgeId();
 * String constraintNameAutoUnique = entity.getConstraintNameAutoUnique();
 * entity.setConstraintNameAutoRefId(constraintNameAutoRefId);
 * entity.setConstraintNameAutoFooId(constraintNameAutoFooId);
 * entity.setConstraintNameAutoBarId(constraintNameAutoBarId);
 * entity.setConstraintNameAutoQuxId(constraintNameAutoQuxId);
 * entity.setConstraintNameAutoCorgeId(constraintNameAutoCorgeId);
 * entity.setConstraintNameAutoUnique(constraintNameAutoUnique);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorConstraintNameAutoRef extends AbstractEntity {

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
    /** CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _constraintNameAutoRefId;

    /** CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} */
    protected Long _constraintNameAutoFooId;

    /** CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} */
    protected Long _constraintNameAutoBarId;

    /** CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} */
    protected Long _constraintNameAutoQuxId;

    /** CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} */
    protected Long _constraintNameAutoCorgeId;

    /** CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} */
    protected String _constraintNameAutoUnique;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "vendor_constraint_name_auto_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorConstraintNameAutoRef";
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
        if (getConstraintNameAutoRefId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param constraintNameAutoUnique : UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String constraintNameAutoUnique) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("constraintNameAutoUnique");
        setConstraintNameAutoUnique(constraintNameAutoUnique);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'. */
    protected VendorConstraintNameAutoFoo _vendorConstraintNameAutoFoo;

    /**
     * [get] vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @return The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoFoo getVendorConstraintNameAutoFoo() {
        return _vendorConstraintNameAutoFoo;
    }

    /**
     * [set] vendor_constraint_name_auto_foo by my CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoFoo'.
     * @param vendorConstraintNameAutoFoo The entity of foreign property 'vendorConstraintNameAutoFoo'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoFoo(VendorConstraintNameAutoFoo vendorConstraintNameAutoFoo) {
        _vendorConstraintNameAutoFoo = vendorConstraintNameAutoFoo;
    }

    /** vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'. */
    protected VendorConstraintNameAutoBar _vendorConstraintNameAutoBar;

    /**
     * [get] vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @return The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoBar getVendorConstraintNameAutoBar() {
        return _vendorConstraintNameAutoBar;
    }

    /**
     * [set] vendor_constraint_name_auto_bar by my CONSTRAINT_NAME_AUTO_BAR_ID, named 'vendorConstraintNameAutoBar'.
     * @param vendorConstraintNameAutoBar The entity of foreign property 'vendorConstraintNameAutoBar'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoBar(VendorConstraintNameAutoBar vendorConstraintNameAutoBar) {
        _vendorConstraintNameAutoBar = vendorConstraintNameAutoBar;
    }

    /** vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'. */
    protected VendorConstraintNameAutoQux _vendorConstraintNameAutoQux;

    /**
     * [get] vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @return The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VendorConstraintNameAutoQux getVendorConstraintNameAutoQux() {
        return _vendorConstraintNameAutoQux;
    }

    /**
     * [set] vendor_constraint_name_auto_qux by my CONSTRAINT_NAME_AUTO_QUX_ID, named 'vendorConstraintNameAutoQux'.
     * @param vendorConstraintNameAutoQux The entity of foreign property 'vendorConstraintNameAutoQux'. (NullAllowed)
     */
    public void setVendorConstraintNameAutoQux(VendorConstraintNameAutoQux vendorConstraintNameAutoQux) {
        _vendorConstraintNameAutoQux = vendorConstraintNameAutoQux;
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
        if (obj instanceof BsVendorConstraintNameAutoRef) {
            BsVendorConstraintNameAutoRef other = (BsVendorConstraintNameAutoRef)obj;
            if (!xSV(_constraintNameAutoRefId, other._constraintNameAutoRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _constraintNameAutoRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoFoo != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoFoo, "vendorConstraintNameAutoFoo")); }
        if (_vendorConstraintNameAutoBar != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoBar, "vendorConstraintNameAutoBar")); }
        if (_vendorConstraintNameAutoQux != null)
        { sb.append(li).append(xbRDS(_vendorConstraintNameAutoQux, "vendorConstraintNameAutoQux")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_constraintNameAutoRefId));
        sb.append(dm).append(xfND(_constraintNameAutoFooId));
        sb.append(dm).append(xfND(_constraintNameAutoBarId));
        sb.append(dm).append(xfND(_constraintNameAutoQuxId));
        sb.append(dm).append(xfND(_constraintNameAutoCorgeId));
        sb.append(dm).append(xfND(_constraintNameAutoUnique));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorConstraintNameAutoFoo != null)
        { sb.append(dm).append("vendorConstraintNameAutoFoo"); }
        if (_vendorConstraintNameAutoBar != null)
        { sb.append(dm).append("vendorConstraintNameAutoBar"); }
        if (_vendorConstraintNameAutoQux != null)
        { sb.append(dm).append("vendorConstraintNameAutoQux"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorConstraintNameAutoRef clone() {
        return (VendorConstraintNameAutoRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoRefId() {
        checkSpecifiedProperty("constraintNameAutoRefId");
        return _constraintNameAutoRefId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_REF_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param constraintNameAutoRefId The value of the column 'CONSTRAINT_NAME_AUTO_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoRefId(Long constraintNameAutoRefId) {
        registerModifiedProperty("constraintNameAutoRefId");
        _constraintNameAutoRefId = constraintNameAutoRefId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoFooId() {
        checkSpecifiedProperty("constraintNameAutoFooId");
        return _constraintNameAutoFooId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_FOO_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_foo} <br />
     * @param constraintNameAutoFooId The value of the column 'CONSTRAINT_NAME_AUTO_FOO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoFooId(Long constraintNameAutoFooId) {
        registerModifiedProperty("constraintNameAutoFooId");
        _constraintNameAutoFooId = constraintNameAutoFooId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoBarId() {
        checkSpecifiedProperty("constraintNameAutoBarId");
        return _constraintNameAutoBarId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_BAR_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_bar} <br />
     * @param constraintNameAutoBarId The value of the column 'CONSTRAINT_NAME_AUTO_BAR_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoBarId(Long constraintNameAutoBarId) {
        registerModifiedProperty("constraintNameAutoBarId");
        _constraintNameAutoBarId = constraintNameAutoBarId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoQuxId() {
        checkSpecifiedProperty("constraintNameAutoQuxId");
        return _constraintNameAutoQuxId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_QUX_ID: {IX, NotNull, DECIMAL(16), FK to vendor_constraint_name_auto_qux} <br />
     * @param constraintNameAutoQuxId The value of the column 'CONSTRAINT_NAME_AUTO_QUX_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoQuxId(Long constraintNameAutoQuxId) {
        registerModifiedProperty("constraintNameAutoQuxId");
        _constraintNameAutoQuxId = constraintNameAutoQuxId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_CORGE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getConstraintNameAutoCorgeId() {
        checkSpecifiedProperty("constraintNameAutoCorgeId");
        return _constraintNameAutoCorgeId;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_CORGE_ID: {NotNull, DECIMAL(16)} <br />
     * @param constraintNameAutoCorgeId The value of the column 'CONSTRAINT_NAME_AUTO_CORGE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoCorgeId(Long constraintNameAutoCorgeId) {
        registerModifiedProperty("constraintNameAutoCorgeId");
        _constraintNameAutoCorgeId = constraintNameAutoCorgeId;
    }

    /**
     * [get] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if selected: for the constraint)
     */
    public String getConstraintNameAutoUnique() {
        checkSpecifiedProperty("constraintNameAutoUnique");
        return _constraintNameAutoUnique;
    }

    /**
     * [set] CONSTRAINT_NAME_AUTO_UNIQUE: {UQ, NotNull, VARCHAR(50)} <br />
     * @param constraintNameAutoUnique The value of the column 'CONSTRAINT_NAME_AUTO_UNIQUE'. (basically NotNull if update: for the constraint)
     */
    public void setConstraintNameAutoUnique(String constraintNameAutoUnique) {
        registerModifiedProperty("constraintNameAutoUnique");
        _constraintNameAutoUnique = constraintNameAutoUnique;
    }
}
