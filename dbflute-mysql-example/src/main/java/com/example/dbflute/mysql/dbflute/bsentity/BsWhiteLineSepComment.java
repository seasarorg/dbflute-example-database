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
 * The entity of WHITE_LINE_SEP_COMMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     LINE_SEP_COMMENT_CODE
 * 
 * [column]
 *     LINE_SEP_COMMENT_CODE, LINE_SEP_COMMENT_NAME
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
 * String lineSepCommentCode = entity.getLineSepCommentCode();
 * String lineSepCommentName = entity.getLineSepCommentName();
 * entity.setLineSepCommentCode(lineSepCommentCode);
 * entity.setLineSepCommentName(lineSepCommentName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteLineSepComment extends AbstractEntity {

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
    /** LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} */
    protected String _lineSepCommentCode;

    /** LINE_SEP_COMMENT_NAME: {VARCHAR(20)} */
    protected String _lineSepCommentName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_line_sep_comment";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteLineSepComment";
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
        if (getLineSepCommentCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of lineSepCommentCode as the classification of LineSepCommentCls. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.LineSepCommentCls getLineSepCommentCodeAsLineSepCommentCls() {
        return CDef.LineSepCommentCls.codeOf(getLineSepCommentCode());
    }

    /**
     * Set the value of lineSepCommentCode as the classification of LineSepCommentCls. <br />
     * LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * top first line            top second line            top third line
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls cdef) {
        setLineSepCommentCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of lineSepCommentCode as First (FOO). <br />
     * First: foo first line            foo second line
     */
    public void setLineSepCommentCode_First() {
        setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls.First);
    }

    /**
     * Set the value of lineSepCommentCode as Second (BAR). <br />
     * Second: bar first line                        bar second line
     */
    public void setLineSepCommentCode_Second() {
        setLineSepCommentCodeAsLineSepCommentCls(CDef.LineSepCommentCls.Second);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of lineSepCommentCode First? <br />
     * First: foo first line            foo second line
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCodeFirst() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null ? cdef.equals(CDef.LineSepCommentCls.First) : false;
    }

    /**
     * Is the value of lineSepCommentCode Second? <br />
     * Second: bar first line                        bar second line
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCodeSecond() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null ? cdef.equals(CDef.LineSepCommentCls.Second) : false;
    }

    /**
     * group first line                    group second line <br />
     * The group elements:[First, Second]
     * @return The determination, true or false.
     */
    public boolean isLineSepCommentCode_LineGroup() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
        return cdef != null && cdef.isLineGroup();
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'lineSepCommentCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getLineSepCommentCodeName() {
        CDef.LineSepCommentCls cdef = getLineSepCommentCodeAsLineSepCommentCls();
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
        if (obj instanceof BsWhiteLineSepComment) {
            BsWhiteLineSepComment other = (BsWhiteLineSepComment)obj;
            if (!xSV(_lineSepCommentCode, other._lineSepCommentCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _lineSepCommentCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lineSepCommentCode));
        sb.append(dm).append(xfND(_lineSepCommentName));
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
    public WhiteLineSepComment clone() {
        return (WhiteLineSepComment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * @return The value of the column 'LINE_SEP_COMMENT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLineSepCommentCode() {
        checkSpecifiedProperty("lineSepCommentCode");
        return _lineSepCommentCode;
    }

    /**
     * [set] LINE_SEP_COMMENT_CODE: {PK, NotNull, CHAR(3), classification=LineSepCommentCls} <br />
     * @param lineSepCommentCode The value of the column 'LINE_SEP_COMMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setLineSepCommentCode(String lineSepCommentCode) {
        registerModifiedProperty("lineSepCommentCode");
        _lineSepCommentCode = lineSepCommentCode;
    }

    /**
     * [get] LINE_SEP_COMMENT_NAME: {VARCHAR(20)} <br />
     * @return The value of the column 'LINE_SEP_COMMENT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineSepCommentName() {
        checkSpecifiedProperty("lineSepCommentName");
        return _lineSepCommentName;
    }

    /**
     * [set] LINE_SEP_COMMENT_NAME: {VARCHAR(20)} <br />
     * @param lineSepCommentName The value of the column 'LINE_SEP_COMMENT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineSepCommentName(String lineSepCommentName) {
        registerModifiedProperty("lineSepCommentName");
        _lineSepCommentName = lineSepCommentName;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param lineSepCommentCode The value of the column 'LINE_SEP_COMMENT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingLineSepCommentCode(String lineSepCommentCode) {
        setLineSepCommentCode(lineSepCommentCode);
    }
}
