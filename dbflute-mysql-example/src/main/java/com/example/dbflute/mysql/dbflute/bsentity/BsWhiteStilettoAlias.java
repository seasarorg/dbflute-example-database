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
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_STILETTO_ALIAS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     STILETTO_ALIAS_ID
 * 
 * [column]
 *     STILETTO_ALIAS_ID, FOO, FOO_0, FOO_1, FOO2, FOO_3, FOO4, BAR, QUX
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
 *     white_stiletto_alias_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteStilettoAliasRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer stilettoAliasId = entity.getStilettoAliasId();
 * String foo = entity.getFoo();
 * String foo0 = entity.getFoo0();
 * String foo1 = entity.getFoo1();
 * String foo2 = entity.getFoo2();
 * String foo3 = entity.getFoo3();
 * String foo4 = entity.getFoo4();
 * String bar = entity.getBar();
 * String qux = entity.getQux();
 * entity.setStilettoAliasId(stilettoAliasId);
 * entity.setFoo(foo);
 * entity.setFoo0(foo0);
 * entity.setFoo1(foo1);
 * entity.setFoo2(foo2);
 * entity.setFoo3(foo3);
 * entity.setFoo4(foo4);
 * entity.setBar(bar);
 * entity.setQux(qux);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteStilettoAlias extends AbstractEntity implements DomainEntity {

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
    /** STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} */
    protected Integer _stilettoAliasId;

    /** FOO: {VARCHAR(200)} */
    protected String _foo;

    /** FOO_0: {VARCHAR(200)} */
    protected String _foo0;

    /** FOO_1: {VARCHAR(200)} */
    protected String _foo1;

    /** FOO2: {VARCHAR(200)} */
    protected String _foo2;

    /** FOO_3: {VARCHAR(200)} */
    protected String _foo3;

    /** FOO4: {VARCHAR(200)} */
    protected String _foo4;

    /** BAR: {VARCHAR(200)} */
    protected String _bar;

    /** QUX: {VARCHAR(200)} */
    protected String _qux;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_stiletto_alias";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteStilettoAlias";
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
        if (getStilettoAliasId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'. */
    protected List<WhiteStilettoAliasRef> _whiteStilettoAliasRefList;

    /**
     * [get] white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * @return The entity list of referrer property 'whiteStilettoAliasRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteStilettoAliasRef> getWhiteStilettoAliasRefList() {
        if (_whiteStilettoAliasRefList == null) { _whiteStilettoAliasRefList = newReferrerList(); }
        return _whiteStilettoAliasRefList;
    }

    /**
     * [set] white_stiletto_alias_ref by STILETTO_ALIAS_ID, named 'whiteStilettoAliasRefList'.
     * @param whiteStilettoAliasRefList The entity list of referrer property 'whiteStilettoAliasRefList'. (NullAllowed)
     */
    public void setWhiteStilettoAliasRefList(List<WhiteStilettoAliasRef> whiteStilettoAliasRefList) {
        _whiteStilettoAliasRefList = whiteStilettoAliasRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteStilettoAlias) {
            BsWhiteStilettoAlias other = (BsWhiteStilettoAlias)obj;
            if (!xSV(_stilettoAliasId, other._stilettoAliasId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _stilettoAliasId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteStilettoAliasRefList != null) { for (WhiteStilettoAliasRef et : _whiteStilettoAliasRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteStilettoAliasRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_stilettoAliasId));
        sb.append(dm).append(xfND(_foo));
        sb.append(dm).append(xfND(_foo0));
        sb.append(dm).append(xfND(_foo1));
        sb.append(dm).append(xfND(_foo2));
        sb.append(dm).append(xfND(_foo3));
        sb.append(dm).append(xfND(_foo4));
        sb.append(dm).append(xfND(_bar));
        sb.append(dm).append(xfND(_qux));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteStilettoAliasRefList != null && !_whiteStilettoAliasRefList.isEmpty())
        { sb.append(dm).append("whiteStilettoAliasRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteStilettoAlias clone() {
        return (WhiteStilettoAlias)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'STILETTO_ALIAS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getStilettoAliasId() {
        checkSpecifiedProperty("stilettoAliasId");
        return _stilettoAliasId;
    }

    /**
     * [set] STILETTO_ALIAS_ID: {PK, NotNull, INT(10)} <br />
     * @param stilettoAliasId The value of the column 'STILETTO_ALIAS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStilettoAliasId(Integer stilettoAliasId) {
        registerModifiedProperty("stilettoAliasId");
        _stilettoAliasId = stilettoAliasId;
    }

    /**
     * [get] FOO: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo() {
        checkSpecifiedProperty("foo");
        return _foo;
    }

    /**
     * [set] FOO: {VARCHAR(200)} <br />
     * @param foo The value of the column 'FOO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo(String foo) {
        registerModifiedProperty("foo");
        _foo = foo;
    }

    /**
     * [get] FOO_0: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_0'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo0() {
        checkSpecifiedProperty("foo0");
        return _foo0;
    }

    /**
     * [set] FOO_0: {VARCHAR(200)} <br />
     * @param foo0 The value of the column 'FOO_0'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo0(String foo0) {
        registerModifiedProperty("foo0");
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
        registerModifiedProperty("foo1");
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
        registerModifiedProperty("foo2");
        _foo2 = foo2;
    }

    /**
     * [get] FOO_3: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO_3'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo3() {
        checkSpecifiedProperty("foo3");
        return _foo3;
    }

    /**
     * [set] FOO_3: {VARCHAR(200)} <br />
     * @param foo3 The value of the column 'FOO_3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo3(String foo3) {
        registerModifiedProperty("foo3");
        _foo3 = foo3;
    }

    /**
     * [get] FOO4: {VARCHAR(200)} <br />
     * @return The value of the column 'FOO4'. (NullAllowed even if selected: for no constraint)
     */
    public String getFoo4() {
        checkSpecifiedProperty("foo4");
        return _foo4;
    }

    /**
     * [set] FOO4: {VARCHAR(200)} <br />
     * @param foo4 The value of the column 'FOO4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFoo4(String foo4) {
        registerModifiedProperty("foo4");
        _foo4 = foo4;
    }

    /**
     * [get] BAR: {VARCHAR(200)} <br />
     * @return The value of the column 'BAR'. (NullAllowed even if selected: for no constraint)
     */
    public String getBar() {
        checkSpecifiedProperty("bar");
        return _bar;
    }

    /**
     * [set] BAR: {VARCHAR(200)} <br />
     * @param bar The value of the column 'BAR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBar(String bar) {
        registerModifiedProperty("bar");
        _bar = bar;
    }

    /**
     * [get] QUX: {VARCHAR(200)} <br />
     * @return The value of the column 'QUX'. (NullAllowed even if selected: for no constraint)
     */
    public String getQux() {
        checkSpecifiedProperty("qux");
        return _qux;
    }

    /**
     * [set] QUX: {VARCHAR(200)} <br />
     * @param qux The value of the column 'QUX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQux(String qux) {
        registerModifiedProperty("qux");
        _qux = qux;
    }
}
