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
 * The entity of WHITE_PG_RESERV_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, CLASS
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
 *     white_pg_reserv
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whitePgReserv
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer refId = entity.getRefId();
 * Integer classSynonym = entity.getClassSynonym();
 * entity.setRefId(refId);
 * entity.setClassSynonym(classSynonym);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReservRef extends AbstractEntity {

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
    /** REF_ID: {PK, NotNull, INT(10)} */
    protected Integer _refId;

    /** ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} */
    protected Integer _classSynonym;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_pg_reserv_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whitePgReservRef";
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
        if (getRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_pg_reserv by my CLASS, named 'whitePgReserv'. */
    protected WhitePgReserv _whitePgReserv;

    /**
     * [get] white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @return The entity of foreign property 'whitePgReserv'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhitePgReserv getWhitePgReserv() {
        return _whitePgReserv;
    }

    /**
     * [set] white_pg_reserv by my CLASS, named 'whitePgReserv'.
     * @param whitePgReserv The entity of foreign property 'whitePgReserv'. (NullAllowed)
     */
    public void setWhitePgReserv(WhitePgReserv whitePgReserv) {
        _whitePgReserv = whitePgReserv;
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
        if (obj instanceof BsWhitePgReservRef) {
            BsWhitePgReservRef other = (BsWhitePgReservRef)obj;
            if (!xSV(_refId, other._refId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePgReserv != null)
        { sb.append(li).append(xbRDS(_whitePgReserv, "whitePgReserv")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_classSynonym));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePgReserv != null) { sb.append(dm).append("whitePgReserv"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePgReservRef clone() {
        return (WhitePgReservRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefId() {
        checkSpecifiedProperty("refId");
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, INT(10)} <br />
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Integer refId) {
        __modifiedProperties.addPropertyName("refId");
        _refId = refId;
    }

    /**
     * [get] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br />
     * @return The value of the column 'CLASS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getClassSynonym() {
        checkSpecifiedProperty("classSynonym");
        return _classSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CLASS: {IX, INT(10), FK to white_pg_reserv} <br />
     * @param classSynonym The value of the column 'CLASS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClassSynonym(Integer classSynonym) {
        __modifiedProperties.addPropertyName("classSynonym");
        _classSynonym = classSynonym;
    }
}
