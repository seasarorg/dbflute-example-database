package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.MappingValueType;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NEXT_FOO_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     FOO_ID, FOO_NAME, FOO_DECIMAL, FOO_DATE, FOO_TIMESTAMP, FOO_CLOB
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
 * Integer fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.math.BigDecimal fooDecimal = entity.getFooDecimal();
 * java.util.Date fooDate = entity.getFooDate();
 * java.sql.Timestamp fooTimestamp = entity.getFooTimestamp();
 * String fooClob = entity.getFooClob();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDecimal(fooDecimal);
 * entity.setFooDate(fooDate);
 * entity.setFooTimestamp(fooTimestamp);
 * entity.setFooClob(fooClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNextFooBean extends AbstractEntity {

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
    /** FOO_ID: {NUMBER(8)} */
    protected Integer _fooId;

    /** FOO_NAME: {VARCHAR2(20)} */
    protected String _fooName;

    /** FOO_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _fooDecimal;

    /** FOO_DATE: {DATE} */
    protected java.util.Date _fooDate;

    /** FOO_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _fooTimestamp;

    /** FOO_CLOB: {CLOB} */
    protected String _fooClob;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "NEXT_FOO_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nextFooBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NextFooBeanDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsNextFooBean) {
            BsNextFooBean other = (BsNextFooBean)obj;
            if (!xSV(_fooId, other._fooId)) { return false; }
            if (!xSV(_fooName, other._fooName)) { return false; }
            if (!xSV(_fooDecimal, other._fooDecimal)) { return false; }
            if (!xSV(_fooDate, other._fooDate)) { return false; }
            if (!xSV(_fooTimestamp, other._fooTimestamp)) { return false; }
            if (!xSV(_fooClob, other._fooClob)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _fooId);
        hs = xCH(hs, _fooName);
        hs = xCH(hs, _fooDecimal);
        hs = xCH(hs, _fooDate);
        hs = xCH(hs, _fooTimestamp);
        hs = xCH(hs, _fooClob);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooId));
        sb.append(dm).append(xfND(_fooName));
        sb.append(dm).append(xfND(_fooDecimal));
        sb.append(dm).append(xfUD(_fooDate));
        sb.append(dm).append(xfND(_fooTimestamp));
        sb.append(dm).append(xfND(_fooClob));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String myutilDatePattern() {
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public NextFooBean clone() {
        return (NextFooBean)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOO_ID: {NUMBER(8)} <br />
     * @return The value of the column 'FOO_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFooId() {
        checkSpecifiedProperty("fooId");
        return _fooId;
    }

    /**
     * [set] FOO_ID: {NUMBER(8)} <br />
     * @param fooId The value of the column 'FOO_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooId(Integer fooId) {
        __modifiedProperties.addPropertyName("fooId");
        _fooId = fooId;
    }

    /**
     * [get] FOO_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'FOO_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getFooName() {
        checkSpecifiedProperty("fooName");
        return _fooName;
    }

    /**
     * [set] FOO_NAME: {VARCHAR2(20)} <br />
     * @param fooName The value of the column 'FOO_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooName(String fooName) {
        __modifiedProperties.addPropertyName("fooName");
        _fooName = fooName;
    }

    /**
     * [get] FOO_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'FOO_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getFooDecimal() {
        checkSpecifiedProperty("fooDecimal");
        return _fooDecimal;
    }

    /**
     * [set] FOO_DECIMAL: {NUMBER(5, 3)} <br />
     * @param fooDecimal The value of the column 'FOO_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDecimal(java.math.BigDecimal fooDecimal) {
        __modifiedProperties.addPropertyName("fooDecimal");
        _fooDecimal = fooDecimal;
    }

    /**
     * [get] FOO_DATE: {DATE} <br />
     * @return The value of the column 'FOO_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getFooDate() {
        checkSpecifiedProperty("fooDate");
        return _fooDate;
    }

    /**
     * [set] FOO_DATE: {DATE} <br />
     * @param fooDate The value of the column 'FOO_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooDate(java.util.Date fooDate) {
        __modifiedProperties.addPropertyName("fooDate");
        _fooDate = fooDate;
    }

    /**
     * [get] FOO_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'FOO_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFooTimestamp() {
        checkSpecifiedProperty("fooTimestamp");
        return _fooTimestamp;
    }

    /**
     * [set] FOO_TIMESTAMP: {TIMESTAMP} <br />
     * @param fooTimestamp The value of the column 'FOO_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooTimestamp(java.sql.Timestamp fooTimestamp) {
        __modifiedProperties.addPropertyName("fooTimestamp");
        _fooTimestamp = fooTimestamp;
    }

    /**
     * [get] FOO_CLOB: {CLOB} <br />
     * @return The value of the column 'FOO_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getFooClob() {
        checkSpecifiedProperty("fooClob");
        return _fooClob;
    }

    /**
     * [set] FOO_CLOB: {CLOB} <br />
     * @param fooClob The value of the column 'FOO_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFooClob(String fooClob) {
        __modifiedProperties.addPropertyName("fooClob");
        _fooClob = fooClob;
    }
}
