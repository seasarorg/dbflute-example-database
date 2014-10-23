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
 * The entity of WHITE_ESCAPED_NUMBER_INITIAL as TABLE. <br />
 * <pre>
 * [primary-key]
 *     NUMBER_INITIAL_CODE
 * 
 * [column]
 *     NUMBER_INITIAL_CODE, NUMBER_INITIAL_NAME
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
 * String numberInitialCode = entity.getNumberInitialCode();
 * String numberInitialName = entity.getNumberInitialName();
 * entity.setNumberInitialCode(numberInitialCode);
 * entity.setNumberInitialName(numberInitialName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteEscapedNumberInitial extends AbstractEntity {

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
    /** NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} */
    protected String _numberInitialCode;

    /** NUMBER_INITIAL_NAME: {VARCHAR(20)} */
    protected String _numberInitialName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_escaped_number_initial";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteEscapedNumberInitial";
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
        if (getNumberInitialCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of numberInitialCode as the classification of EscapedNumberInitialCls. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EscapedNumberInitialCls getNumberInitialCodeAsEscapedNumberInitialCls() {
        return CDef.EscapedNumberInitialCls.codeOf(getNumberInitialCode());
    }

    /**
     * Set the value of numberInitialCode as the classification of EscapedNumberInitialCls. <br />
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * 6
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls cdef) {
        setNumberInitialCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of numberInitialCode as N1Foo (1FO). <br />
     * 1Foo
     */
    public void setNumberInitialCode_N1Foo() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N1Foo);
    }

    /**
     * Set the value of numberInitialCode as N3Bar (3BA). <br />
     * 3Bar
     */
    public void setNumberInitialCode_N3Bar() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N3Bar);
    }

    /**
     * Set the value of numberInitialCode as N7Qux (7QU). <br />
     * 7Qux
     */
    public void setNumberInitialCode_N7Qux() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.N7Qux);
    }

    /**
     * Set the value of numberInitialCode as Corge9 (CO9). <br />
     * Corge9
     */
    public void setNumberInitialCode_Corge9() {
        setNumberInitialCodeAsEscapedNumberInitialCls(CDef.EscapedNumberInitialCls.Corge9);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of numberInitialCode N1Foo? <br />
     * 1Foo
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN1Foo() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N1Foo) : false;
    }

    /**
     * Is the value of numberInitialCode N3Bar? <br />
     * 3Bar
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN3Bar() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N3Bar) : false;
    }

    /**
     * Is the value of numberInitialCode N7Qux? <br />
     * 7Qux
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeN7Qux() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.N7Qux) : false;
    }

    /**
     * Is the value of numberInitialCode Corge9? <br />
     * Corge9
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNumberInitialCodeCorge9() {
        CDef.EscapedNumberInitialCls cdef = getNumberInitialCodeAsEscapedNumberInitialCls();
        return cdef != null ? cdef.equals(CDef.EscapedNumberInitialCls.Corge9) : false;
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
        if (obj instanceof BsWhiteEscapedNumberInitial) {
            BsWhiteEscapedNumberInitial other = (BsWhiteEscapedNumberInitial)obj;
            if (!xSV(_numberInitialCode, other._numberInitialCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _numberInitialCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_numberInitialCode));
        sb.append(dm).append(xfND(_numberInitialName));
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
    public WhiteEscapedNumberInitial clone() {
        return (WhiteEscapedNumberInitial)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * @return The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNumberInitialCode() {
        checkSpecifiedProperty("numberInitialCode");
        return _numberInitialCode;
    }

    /**
     * [set] NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls} <br />
     * @param numberInitialCode The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setNumberInitialCode(String numberInitialCode) {
        __modifiedProperties.addPropertyName("numberInitialCode");
        _numberInitialCode = numberInitialCode;
    }

    /**
     * [get] NUMBER_INITIAL_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'NUMBER_INITIAL_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNumberInitialName() {
        checkSpecifiedProperty("numberInitialName");
        return _numberInitialName;
    }

    /**
     * [set] NUMBER_INITIAL_NAME: {VARCHAR(20)} <br />
     * @param numberInitialName The value of the column 'NUMBER_INITIAL_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNumberInitialName(String numberInitialName) {
        __modifiedProperties.addPropertyName("numberInitialName");
        _numberInitialName = numberInitialName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param numberInitialCode The value of the column 'NUMBER_INITIAL_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingNumberInitialCode(String numberInitialCode) {
        setNumberInitialCode(numberInitialCode);
    }
}
