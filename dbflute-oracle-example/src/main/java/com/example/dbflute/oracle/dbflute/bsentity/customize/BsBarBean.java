package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.CustomizeEntity;
import org.seasar.dbflute.dbmeta.accessory.MappingValueType;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of BAR_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAR_ID, BAR_NAME, BAR_DECIMAL, BAR_DATE, BAR_TIMESTAMP, BAR_CLOB
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
 * Integer barId = entity.getBarId();
 * String barName = entity.getBarName();
 * java.math.BigDecimal barDecimal = entity.getBarDecimal();
 * java.util.Date barDate = entity.getBarDate();
 * java.sql.Timestamp barTimestamp = entity.getBarTimestamp();
 * String barClob = entity.getBarClob();
 * entity.setBarId(barId);
 * entity.setBarName(barName);
 * entity.setBarDecimal(barDecimal);
 * entity.setBarDate(barDate);
 * entity.setBarTimestamp(barTimestamp);
 * entity.setBarClob(barClob);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsBarBean extends AbstractEntity implements CustomizeEntity {

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
    /** BAR_ID: {NUMBER(8)} */
    protected Integer _barId;

    /** BAR_NAME: {VARCHAR2(20)} */
    protected String _barName;

    /** BAR_DECIMAL: {NUMBER(5, 3)} */
    protected java.math.BigDecimal _barDecimal;

    /** BAR_DATE: {DATE} */
    protected java.util.Date _barDate;

    /** BAR_TIMESTAMP: {TIMESTAMP} */
    protected java.sql.Timestamp _barTimestamp;

    /** BAR_CLOB: {CLOB} */
    protected String _barClob;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "BAR_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "barBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.BarBeanDbm.getInstance();
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
        if (obj instanceof BsBarBean) {
            BsBarBean other = (BsBarBean)obj;
            if (!xSV(_barId, other._barId)) { return false; }
            if (!xSV(_barName, other._barName)) { return false; }
            if (!xSV(_barDecimal, other._barDecimal)) { return false; }
            if (!xSV(_barDate, other._barDate)) { return false; }
            if (!xSV(_barTimestamp, other._barTimestamp)) { return false; }
            if (!xSV(_barClob, other._barClob)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _barId);
        hs = xCH(hs, _barName);
        hs = xCH(hs, _barDecimal);
        hs = xCH(hs, _barDate);
        hs = xCH(hs, _barTimestamp);
        hs = xCH(hs, _barClob);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_barId));
        sb.append(dm).append(xfND(_barName));
        sb.append(dm).append(xfND(_barDecimal));
        sb.append(dm).append(xfUD(_barDate));
        sb.append(dm).append(xfND(_barTimestamp));
        sb.append(dm).append(xfND(_barClob));
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
    public BarBean clone() {
        return (BarBean)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BAR_ID: {NUMBER(8)} <br />
     * @return The value of the column 'BAR_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getBarId() {
        checkSpecifiedProperty("barId");
        return _barId;
    }

    /**
     * [set] BAR_ID: {NUMBER(8)} <br />
     * @param barId The value of the column 'BAR_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarId(Integer barId) {
        registerModifiedProperty("barId");
        _barId = barId;
    }

    /**
     * [get] BAR_NAME: {VARCHAR2(20)} <br />
     * @return The value of the column 'BAR_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getBarName() {
        checkSpecifiedProperty("barName");
        return _barName;
    }

    /**
     * [set] BAR_NAME: {VARCHAR2(20)} <br />
     * @param barName The value of the column 'BAR_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarName(String barName) {
        registerModifiedProperty("barName");
        _barName = barName;
    }

    /**
     * [get] BAR_DECIMAL: {NUMBER(5, 3)} <br />
     * @return The value of the column 'BAR_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getBarDecimal() {
        checkSpecifiedProperty("barDecimal");
        return _barDecimal;
    }

    /**
     * [set] BAR_DECIMAL: {NUMBER(5, 3)} <br />
     * @param barDecimal The value of the column 'BAR_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarDecimal(java.math.BigDecimal barDecimal) {
        registerModifiedProperty("barDecimal");
        _barDecimal = barDecimal;
    }

    /**
     * [get] BAR_DATE: {DATE} <br />
     * @return The value of the column 'BAR_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBarDate() {
        checkSpecifiedProperty("barDate");
        return _barDate;
    }

    /**
     * [set] BAR_DATE: {DATE} <br />
     * @param barDate The value of the column 'BAR_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarDate(java.util.Date barDate) {
        registerModifiedProperty("barDate");
        _barDate = barDate;
    }

    /**
     * [get] BAR_TIMESTAMP: {TIMESTAMP} <br />
     * @return The value of the column 'BAR_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getBarTimestamp() {
        checkSpecifiedProperty("barTimestamp");
        return _barTimestamp;
    }

    /**
     * [set] BAR_TIMESTAMP: {TIMESTAMP} <br />
     * @param barTimestamp The value of the column 'BAR_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarTimestamp(java.sql.Timestamp barTimestamp) {
        registerModifiedProperty("barTimestamp");
        _barTimestamp = barTimestamp;
    }

    /**
     * [get] BAR_CLOB: {CLOB} <br />
     * @return The value of the column 'BAR_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getBarClob() {
        checkSpecifiedProperty("barClob");
        return _barClob;
    }

    /**
     * [set] BAR_CLOB: {CLOB} <br />
     * @param barClob The value of the column 'BAR_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarClob(String barClob) {
        registerModifiedProperty("barClob");
        _barClob = barClob;
    }
}
