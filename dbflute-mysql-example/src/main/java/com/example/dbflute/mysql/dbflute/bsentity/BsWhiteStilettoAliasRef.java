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
 * The entity of WHITE_STILETTO_ALIAS_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, FOO0, FOO_1, FOO2, FOO3, FOO_4, BAR_0, QUX_0, c21, c22, c23, STILETTO_ALIAS_ID
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
 *     white_stiletto_alias
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteStilettoAlias
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer refId = entity.getRefId();
 * String foo0 = entity.getFoo0();
 * String foo1 = entity.getFoo1();
 * String foo2 = entity.getFoo2();
 * String foo3 = entity.getFoo3();
 * String foo4 = entity.getFoo4();
 * String bar0 = entity.getBar0();
 * String qux0 = entity.getQux0();
 * String c21 = entity.getC21();
 * String c22 = entity.getC22();
 * String c23 = entity.getC23();
 * Integer stilettoAliasId = entity.getStilettoAliasId();
 * entity.setRefId(refId);
 * entity.setFoo0(foo0);
 * entity.setFoo1(foo1);
 * entity.setFoo2(foo2);
 * entity.setFoo3(foo3);
 * entity.setFoo4(foo4);
 * entity.setBar0(bar0);
 * entity.setQux0(qux0);
 * entity.setC21(c21);
 * entity.setC22(c22);
 * entity.setC23(c23);
 * entity.setStilettoAliasId(stilettoAliasId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAliasRef extends AbstractEntity {

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

    /** FOO0: {VARCHAR(200)} */
    protected String _foo0;

    /** FOO_1: {VARCHAR(200)} */
    protected String _foo1;

    /** FOO2: {VARCHAR(200)} */
    protected String _foo2;

    /** FOO3: {VARCHAR(200)} */
    protected String _foo3;

    /** FOO_4: {VARCHAR(200)} */
    protected String _foo4;

    /** BAR_0: {VARCHAR(200)} */
    protected String _bar0;

    /** QUX_0: {VARCHAR(200)} */
    protected String _qux0;

    /** c21: {VARCHAR(200)} */
    protected String _c21;

    /** c22: {VARCHAR(200)} */
    protected String _c22;

    /** c23: {VARCHAR(200)} */
    protected String _c23;

    /** STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} */
    protected Integer _stilettoAliasId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_stiletto_alias_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteStilettoAliasRef";
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
    /** white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'. */
    protected WhiteStilettoAlias _whiteStilettoAlias;

    /**
     * [get] white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @return The entity of foreign property 'whiteStilettoAlias'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteStilettoAlias getWhiteStilettoAlias() {
        return _whiteStilettoAlias;
    }

    /**
     * [set] white_stiletto_alias by my STILETTO_ALIAS_ID, named 'whiteStilettoAlias'.
     * @param whiteStilettoAlias The entity of foreign property 'whiteStilettoAlias'. (NullAllowed)
     */
    public void setWhiteStilettoAlias(WhiteStilettoAlias whiteStilettoAlias) {
        _whiteStilettoAlias = whiteStilettoAlias;
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
        if (obj instanceof BsWhiteStilettoAliasRef) {
            BsWhiteStilettoAliasRef other = (BsWhiteStilettoAliasRef)obj;
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
        if (_whiteStilettoAlias != null)
        { sb.append(li).append(xbRDS(_whiteStilettoAlias, "whiteStilettoAlias")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_foo0));
        sb.append(dm).append(xfND(_foo1));
        sb.append(dm).append(xfND(_foo2));
        sb.append(dm).append(xfND(_foo3));
        sb.append(dm).append(xfND(_foo4));
        sb.append(dm).append(xfND(_bar0));
        sb.append(dm).append(xfND(_qux0));
        sb.append(dm).append(xfND(_c21));
        sb.append(dm).append(xfND(_c22));
        sb.append(dm).append(xfND(_c23));
        sb.append(dm).append(xfND(_stilettoAliasId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteStilettoAlias != null) { sb.append(dm).append("whiteStilettoAlias"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteStilettoAliasRef clone() {
        return (WhiteStilettoAliasRef)super.clone();
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
     * [get] FOO0: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO0'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo0() {
        checkSpecifiedProperty("foo0");
        return _foo0;
    }

    /**
     * [set] FOO0: {VARCHAR(200)} <br />
     * @param foo0 The value of the column 'FOO0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo0(String foo0) {
        __modifiedProperties.addPropertyName("foo0");
        _foo0 = foo0;
    }

    /**
     * [get] FOO_1: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo1() {
        checkSpecifiedProperty("foo1");
        return _foo1;
    }

    /**
     * [set] FOO_1: {VARCHAR(200)} <br />
     * @param foo1 The value of the column 'FOO_1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo1(String foo1) {
        __modifiedProperties.addPropertyName("foo1");
        _foo1 = foo1;
    }

    /**
     * [get] FOO2: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo2() {
        checkSpecifiedProperty("foo2");
        return _foo2;
    }

    /**
     * [set] FOO2: {VARCHAR(200)} <br />
     * @param foo2 The value of the column 'FOO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo2(String foo2) {
        __modifiedProperties.addPropertyName("foo2");
        _foo2 = foo2;
    }

    /**
     * [get] FOO3: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo3() {
        checkSpecifiedProperty("foo3");
        return _foo3;
    }

    /**
     * [set] FOO3: {VARCHAR(200)} <br />
     * @param foo3 The value of the column 'FOO3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo3(String foo3) {
        __modifiedProperties.addPropertyName("foo3");
        _foo3 = foo3;
    }

    /**
     * [get] FOO_4: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo4() {
        checkSpecifiedProperty("foo4");
        return _foo4;
    }

    /**
     * [set] FOO_4: {VARCHAR(200)} <br />
     * @param foo4 The value of the column 'FOO_4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo4(String foo4) {
        __modifiedProperties.addPropertyName("foo4");
        _foo4 = foo4;
    }

    /**
     * [get] BAR_0: {VARCHAR(200)} <br />
     * @return The value of the column 'BAR_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getBar0() {
        checkSpecifiedProperty("bar0");
        return _bar0;
    }

    /**
     * [set] BAR_0: {VARCHAR(200)} <br />
     * @param bar0 The value of the column 'BAR_0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBar0(String bar0) {
        __modifiedProperties.addPropertyName("bar0");
        _bar0 = bar0;
    }

    /**
     * [get] QUX_0: {VARCHAR(200)} <br />
     * @return The value of the column 'QUX_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getQux0() {
        checkSpecifiedProperty("qux0");
        return _qux0;
    }

    /**
     * [set] QUX_0: {VARCHAR(200)} <br />
     * @param qux0 The value of the column 'QUX_0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQux0(String qux0) {
        __modifiedProperties.addPropertyName("qux0");
        _qux0 = qux0;
    }

    /**
     * [get] c21: {VARCHAR(200)} <br />
     * @return The value of the column 'c21'. (NullAllowed even if selected: for no constraint)
     */
    public String getC21() {
        checkSpecifiedProperty("c21");
        return _c21;
    }

    /**
     * [set] c21: {VARCHAR(200)} <br />
     * @param c21 The value of the column 'c21'. (NullAllowed: null update allowed for no constraint)
     */
    public void setC21(String c21) {
        __modifiedProperties.addPropertyName("c21");
        _c21 = c21;
    }

    /**
     * [get] c22: {VARCHAR(200)} <br />
     * @return The value of the column 'c22'. (NullAllowed even if selected: for no constraint)
     */
    public String getC22() {
        checkSpecifiedProperty("c22");
        return _c22;
    }

    /**
     * [set] c22: {VARCHAR(200)} <br />
     * @param c22 The value of the column 'c22'. (NullAllowed: null update allowed for no constraint)
     */
    public void setC22(String c22) {
        __modifiedProperties.addPropertyName("c22");
        _c22 = c22;
    }

    /**
     * [get] c23: {VARCHAR(200)} <br />
     * @return The value of the column 'c23'. (NullAllowed even if selected: for no constraint)
     */
    public String getC23() {
        checkSpecifiedProperty("c23");
        return _c23;
    }

    /**
     * [set] c23: {VARCHAR(200)} <br />
     * @param c23 The value of the column 'c23'. (NullAllowed: null update allowed for no constraint)
     */
    public void setC23(String c23) {
        __modifiedProperties.addPropertyName("c23");
        _c23 = c23;
    }

    /**
     * [get] STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} <br />
     * @return The value of the column 'STILETTO_ALIAS_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStilettoAliasId() {
        checkSpecifiedProperty("stilettoAliasId");
        return _stilettoAliasId;
    }

    /**
     * [set] STILETTO_ALIAS_ID: {IX, INT(10), FK to white_stiletto_alias} <br />
     * @param stilettoAliasId The value of the column 'STILETTO_ALIAS_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStilettoAliasId(Integer stilettoAliasId) {
        __modifiedProperties.addPropertyName("stilettoAliasId");
        _stilettoAliasId = stilettoAliasId;
    }
}
