package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.MappingValueType;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of CORGE_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     CORGE_ID, CORGE_NAME, CORGE_DECIMAL, CORGE_DATE, CORGE_TIMESTAMP, CORGE_CLOB
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
 * Integer corgeId = entity.getCorgeId();
 * String corgeName = entity.getCorgeName();
 * java.math.BigDecimal corgeDecimal = entity.getCorgeDecimal();
 * java.util.Date corgeDate = entity.getCorgeDate();
 * java.sql.Timestamp corgeTimestamp = entity.getCorgeTimestamp();
 * String corgeClob = entity.getCorgeClob();
 * entity.setCorgeId(corgeId);
 * entity.setCorgeName(corgeName);
 * entity.setCorgeDecimal(corgeDecimal);
 * entity.setCorgeDate(corgeDate);
 * entity.setCorgeTimestamp(corgeTimestamp);
 * entity.setCorgeClob(corgeClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsCorgeBean extends AbstractEntity {

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
    /** CORGE_ID: {NUMBER(8)} */
    protected Integer _corgeId;

    /** CORGE_NAME: {VARCHAR2(20)} */
    protected String _corgeName;

    /** CORGE_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _corgeDecimal;

    /** CORGE_DATE: {DATE} */
    protected java.util.Date _corgeDate;

    /** CORGE_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _corgeTimestamp;

    /** CORGE_CLOB: {CLOB} */
    protected String _corgeClob;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "CORGE_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "corgeBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.CorgeBeanDbm.getInstance();
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
        if (obj instanceof BsCorgeBean) {
            BsCorgeBean other = (BsCorgeBean)obj;
            if (!xSV(_corgeId, other._corgeId)) { return false; }
            if (!xSV(_corgeName, other._corgeName)) { return false; }
            if (!xSV(_corgeDecimal, other._corgeDecimal)) { return false; }
            if (!xSV(_corgeDate, other._corgeDate)) { return false; }
            if (!xSV(_corgeTimestamp, other._corgeTimestamp)) { return false; }
            if (!xSV(_corgeClob, other._corgeClob)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _corgeId);
        hs = xCH(hs, _corgeName);
        hs = xCH(hs, _corgeDecimal);
        hs = xCH(hs, _corgeDate);
        hs = xCH(hs, _corgeTimestamp);
        hs = xCH(hs, _corgeClob);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_corgeId));
        sb.append(dm).append(xfND(_corgeName));
        sb.append(dm).append(xfND(_corgeDecimal));
        sb.append(dm).append(xfUD(_corgeDate));
        sb.append(dm).append(xfND(_corgeTimestamp));
        sb.append(dm).append(xfND(_corgeClob));
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
    public CorgeBean clone() {
        return (CorgeBean)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CORGE_ID: {NUMBER(8)} <br />
     * @return The value of the column 'CORGE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCorgeId() {
        checkSpecifiedProperty("corgeId");
        return _corgeId;
    }

    /**
     * [set] CORGE_ID: {NUMBER(8)} <br />
     * @param corgeId The value of the column 'CORGE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeId(Integer corgeId) {
        __modifiedProperties.addPropertyName("corgeId");
        _corgeId = corgeId;
    }

    /**
     * [get] CORGE_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'CORGE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCorgeName() {
        checkSpecifiedProperty("corgeName");
        return _corgeName;
    }

    /**
     * [set] CORGE_NAME: {VARCHAR2(20)} <br />
     * @param corgeName The value of the column 'CORGE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeName(String corgeName) {
        __modifiedProperties.addPropertyName("corgeName");
        _corgeName = corgeName;
    }

    /**
     * [get] CORGE_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'CORGE_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCorgeDecimal() {
        checkSpecifiedProperty("corgeDecimal");
        return _corgeDecimal;
    }

    /**
     * [set] CORGE_DECIMAL: {NUMBER(5, 3)} <br />
     * @param corgeDecimal The value of the column 'CORGE_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeDecimal(java.math.BigDecimal corgeDecimal) {
        __modifiedProperties.addPropertyName("corgeDecimal");
        _corgeDecimal = corgeDecimal;
    }

    /**
     * [get] CORGE_DATE: {DATE} <br />
     * @return The value of the column 'CORGE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getCorgeDate() {
        checkSpecifiedProperty("corgeDate");
        return _corgeDate;
    }

    /**
     * [set] CORGE_DATE: {DATE} <br />
     * @param corgeDate The value of the column 'CORGE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeDate(java.util.Date corgeDate) {
        __modifiedProperties.addPropertyName("corgeDate");
        _corgeDate = corgeDate;
    }

    /**
     * [get] CORGE_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'CORGE_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getCorgeTimestamp() {
        checkSpecifiedProperty("corgeTimestamp");
        return _corgeTimestamp;
    }

    /**
     * [set] CORGE_TIMESTAMP: {TIMESTAMP} <br />
     * @param corgeTimestamp The value of the column 'CORGE_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeTimestamp(java.sql.Timestamp corgeTimestamp) {
        __modifiedProperties.addPropertyName("corgeTimestamp");
        _corgeTimestamp = corgeTimestamp;
    }

    /**
     * [get] CORGE_CLOB: {CLOB} <br />
     * @return The value of the column 'CORGE_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getCorgeClob() {
        checkSpecifiedProperty("corgeClob");
        return _corgeClob;
    }

    /**
     * [set] CORGE_CLOB: {CLOB} <br />
     * @param corgeClob The value of the column 'CORGE_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeClob(String corgeClob) {
        __modifiedProperties.addPropertyName("corgeClob");
        _corgeClob = corgeClob;
    }
}
