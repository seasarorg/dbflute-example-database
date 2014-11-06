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
 * The entity of WHITE_SELF_REFERENCE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_NAME, PARENT_ID
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
 *     white_self_reference, white_self_reference_ref_one(ByParentId)
 * 
 * [referrer table]
 *     white_self_reference, white_self_reference_ref_one
 * 
 * [foreign property]
 *     whiteSelfReferenceSelf, whiteSelfReferenceRefOneByParentId, whiteSelfReferenceRefOneAsOne
 * 
 * [referrer property]
 *     whiteSelfReferenceSelfList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long selfReferenceId = entity.getSelfReferenceId();
 * String selfReferenceName = entity.getSelfReferenceName();
 * Long parentId = entity.getParentId();
 * entity.setSelfReferenceId(selfReferenceId);
 * entity.setSelfReferenceName(selfReferenceName);
 * entity.setParentId(parentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReference extends AbstractEntity {

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
    /** SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _selfReferenceId;

    /** SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceName;

    /** PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} */
    protected Long _parentId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_self_reference";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSelfReference";
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
        if (getSelfReferenceId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'. */
    protected WhiteSelfReference _whiteSelfReferenceSelf;

    /**
     * [get] white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The entity of foreign property 'whiteSelfReferenceSelf'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReferenceSelf() {
        return _whiteSelfReferenceSelf;
    }

    /**
     * [set] white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @param whiteSelfReferenceSelf The entity of foreign property 'whiteSelfReferenceSelf'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelf(WhiteSelfReference whiteSelfReferenceSelf) {
        _whiteSelfReferenceSelf = whiteSelfReferenceSelf;
    }

    /** white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. */
    protected WhiteSelfReferenceRefOne _whiteSelfReferenceRefOneByParentId;

    /**
     * [get] white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @return The entity of foreign property 'whiteSelfReferenceRefOneByParentId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReferenceRefOne getWhiteSelfReferenceRefOneByParentId() {
        return _whiteSelfReferenceRefOneByParentId;
    }

    /**
     * [set] white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @param whiteSelfReferenceRefOneByParentId The entity of foreign property 'whiteSelfReferenceRefOneByParentId'. (NullAllowed)
     */
    public void setWhiteSelfReferenceRefOneByParentId(WhiteSelfReferenceRefOne whiteSelfReferenceRefOneByParentId) {
        _whiteSelfReferenceRefOneByParentId = whiteSelfReferenceRefOneByParentId;
    }

    /** white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'. */
    protected WhiteSelfReferenceRefOne _whiteSelfReferenceRefOneAsOne;

    /**
     * [get] white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'whiteSelfReferenceRefOneAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public WhiteSelfReferenceRefOne getWhiteSelfReferenceRefOneAsOne() {
        return _whiteSelfReferenceRefOneAsOne;
    }

    /**
     * [set] white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @param whiteSelfReferenceRefOneAsOne The entity of foreign property(referrer-as-one) 'whiteSelfReferenceRefOneAsOne'. (NullAllowed)
     */
    public void setWhiteSelfReferenceRefOneAsOne(WhiteSelfReferenceRefOne whiteSelfReferenceRefOneAsOne) {
        _whiteSelfReferenceRefOneAsOne = whiteSelfReferenceRefOneAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'. */
    protected List<WhiteSelfReference> _whiteSelfReferenceSelfList;

    /**
     * [get] white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @return The entity list of referrer property 'whiteSelfReferenceSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSelfReference> getWhiteSelfReferenceSelfList() {
        if (_whiteSelfReferenceSelfList == null) { _whiteSelfReferenceSelfList = newReferrerList(); }
        return _whiteSelfReferenceSelfList;
    }

    /**
     * [set] white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @param whiteSelfReferenceSelfList The entity list of referrer property 'whiteSelfReferenceSelfList'. (NullAllowed)
     */
    public void setWhiteSelfReferenceSelfList(List<WhiteSelfReference> whiteSelfReferenceSelfList) {
        _whiteSelfReferenceSelfList = whiteSelfReferenceSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSelfReference) {
            BsWhiteSelfReference other = (BsWhiteSelfReference)obj;
            if (!xSV(_selfReferenceId, other._selfReferenceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _selfReferenceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReferenceSelf != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceSelf, "whiteSelfReferenceSelf")); }
        if (_whiteSelfReferenceRefOneByParentId != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceRefOneByParentId, "whiteSelfReferenceRefOneByParentId")); }
        if (_whiteSelfReferenceRefOneAsOne != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceRefOneAsOne, "whiteSelfReferenceRefOneAsOne")); }
        if (_whiteSelfReferenceSelfList != null) { for (WhiteSelfReference et : _whiteSelfReferenceSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSelfReferenceSelfList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_selfReferenceId));
        sb.append(dm).append(xfND(_selfReferenceName));
        sb.append(dm).append(xfND(_parentId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReferenceSelf != null)
        { sb.append(dm).append("whiteSelfReferenceSelf"); }
        if (_whiteSelfReferenceRefOneByParentId != null)
        { sb.append(dm).append("whiteSelfReferenceRefOneByParentId"); }
        if (_whiteSelfReferenceRefOneAsOne != null)
        { sb.append(dm).append("whiteSelfReferenceRefOneAsOne"); }
        if (_whiteSelfReferenceSelfList != null && !_whiteSelfReferenceSelfList.isEmpty())
        { sb.append(dm).append("whiteSelfReferenceSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSelfReference clone() {
        return (WhiteSelfReference)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelfReferenceId() {
        checkSpecifiedProperty("selfReferenceId");
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Long selfReferenceId) {
        registerModifiedProperty("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceName() {
        checkSpecifiedProperty("selfReferenceName");
        return _selfReferenceName;
    }

    /**
     * [set] SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param selfReferenceName The value of the column 'SELF_REFERENCE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceName(String selfReferenceName) {
        registerModifiedProperty("selfReferenceName");
        _selfReferenceName = selfReferenceName;
    }

    /**
     * [get] PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} <br />
     * @return The value of the column 'PARENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getParentId() {
        checkSpecifiedProperty("parentId");
        return _parentId;
    }

    /**
     * [set] PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference} <br />
     * @param parentId The value of the column 'PARENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentId(Long parentId) {
        registerModifiedProperty("parentId");
        _parentId = parentId;
    }
}
