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
 * The entity of WHITE_SELF_REFERENCE_REF_ONE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SELF_REFERENCE_ID
 * 
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_REF_ONE_NAME
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
 *     white_self_reference, WHITE_SELF_REFERENCE(AsDirectParent)
 * 
 * [referrer table]
 *     white_self_reference
 * 
 * [foreign property]
 *     whiteSelfReference, whiteSelfReferenceAsDirectParent
 * 
 * [referrer property]
 *     whiteSelfReferenceByParentIdList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long selfReferenceId = entity.getSelfReferenceId();
 * String selfReferenceRefOneName = entity.getSelfReferenceRefOneName();
 * entity.setSelfReferenceId(selfReferenceId);
 * entity.setSelfReferenceRefOneName(selfReferenceRefOneName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSelfReferenceRefOne extends AbstractEntity {

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
    /** SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} */
    protected Long _selfReferenceId;

    /** SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} */
    protected String _selfReferenceRefOneName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_self_reference_ref_one";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSelfReferenceRefOne";
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
    /** white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'. */
    protected WhiteSelfReference _whiteSelfReference;

    /**
     * [get] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @return The entity of foreign property 'whiteSelfReference'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReference() {
        return _whiteSelfReference;
    }

    /**
     * [set] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReference'.
     * @param whiteSelfReference The entity of foreign property 'whiteSelfReference'. (NullAllowed)
     */
    public void setWhiteSelfReference(WhiteSelfReference whiteSelfReference) {
        _whiteSelfReference = whiteSelfReference;
    }

    /** white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'. */
    protected WhiteSelfReference _whiteSelfReferenceAsDirectParent;

    /**
     * [get] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @return The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSelfReference getWhiteSelfReferenceAsDirectParent() {
        return _whiteSelfReferenceAsDirectParent;
    }

    /**
     * [set] white_self_reference by my SELF_REFERENCE_ID, named 'whiteSelfReferenceAsDirectParent'.
     * @param whiteSelfReferenceAsDirectParent The entity of foreign property 'whiteSelfReferenceAsDirectParent'. (NullAllowed)
     */
    public void setWhiteSelfReferenceAsDirectParent(WhiteSelfReference whiteSelfReferenceAsDirectParent) {
        _whiteSelfReferenceAsDirectParent = whiteSelfReferenceAsDirectParent;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. */
    protected List<WhiteSelfReference> _whiteSelfReferenceByParentIdList;

    /**
     * [get] white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @return The entity list of referrer property 'whiteSelfReferenceByParentIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSelfReference> getWhiteSelfReferenceByParentIdList() {
        if (_whiteSelfReferenceByParentIdList == null) { _whiteSelfReferenceByParentIdList = newReferrerList(); }
        return _whiteSelfReferenceByParentIdList;
    }

    /**
     * [set] white_self_reference by PARENT_ID, named 'whiteSelfReferenceByParentIdList'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @param whiteSelfReferenceByParentIdList The entity list of referrer property 'whiteSelfReferenceByParentIdList'. (NullAllowed)
     */
    public void setWhiteSelfReferenceByParentIdList(List<WhiteSelfReference> whiteSelfReferenceByParentIdList) {
        _whiteSelfReferenceByParentIdList = whiteSelfReferenceByParentIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSelfReferenceRefOne) {
            BsWhiteSelfReferenceRefOne other = (BsWhiteSelfReferenceRefOne)obj;
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
        if (_whiteSelfReference != null)
        { sb.append(li).append(xbRDS(_whiteSelfReference, "whiteSelfReference")); }
        if (_whiteSelfReferenceAsDirectParent != null)
        { sb.append(li).append(xbRDS(_whiteSelfReferenceAsDirectParent, "whiteSelfReferenceAsDirectParent")); }
        if (_whiteSelfReferenceByParentIdList != null) { for (WhiteSelfReference et : _whiteSelfReferenceByParentIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSelfReferenceByParentIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_selfReferenceId));
        sb.append(dm).append(xfND(_selfReferenceRefOneName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSelfReference != null) { sb.append(dm).append("whiteSelfReference"); }
        if (_whiteSelfReferenceAsDirectParent != null) { sb.append(dm).append("whiteSelfReferenceAsDirectParent"); }
        if (_whiteSelfReferenceByParentIdList != null && !_whiteSelfReferenceByParentIdList.isEmpty())
        { sb.append(dm).append("whiteSelfReferenceByParentIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSelfReferenceRefOne clone() {
        return (WhiteSelfReferenceRefOne)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br />
     * @return The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSelfReferenceId() {
        checkSpecifiedProperty("selfReferenceId");
        return _selfReferenceId;
    }

    /**
     * [set] SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16), FK to white_self_reference} <br />
     * @param selfReferenceId The value of the column 'SELF_REFERENCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceId(Long selfReferenceId) {
        __modifiedProperties.addPropertyName("selfReferenceId");
        _selfReferenceId = selfReferenceId;
    }

    /**
     * [get] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSelfReferenceRefOneName() {
        checkSpecifiedProperty("selfReferenceRefOneName");
        return _selfReferenceRefOneName;
    }

    /**
     * [set] SELF_REFERENCE_REF_ONE_NAME: {NotNull, VARCHAR(200)} <br />
     * @param selfReferenceRefOneName The value of the column 'SELF_REFERENCE_REF_ONE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSelfReferenceRefOneName(String selfReferenceRefOneName) {
        __modifiedProperties.addPropertyName("selfReferenceRefOneName");
        _selfReferenceRefOneName = selfReferenceRefOneName;
    }
}
