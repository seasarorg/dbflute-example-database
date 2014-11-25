package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.CustomizeEntity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_BAR_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BAR_ID, BAR_NAME, BAR_DATE, BAR_LIST, BAZ_BEAN1, BAZ_BEAN2, QUX_LIST, QUUX_LIST
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
 * java.util.Date barDate = entity.getBarDate();
 * List<BarBean> barList = entity.getBarList();
 * NestedBazBean bazBean1 = entity.getBazBean1();
 * NestedBazBean bazBean2 = entity.getBazBean2();
 * List<java.math.BigDecimal> quxList = entity.getQuxList();
 * List<java.math.BigDecimal> quuxList = entity.getQuuxList();
 * entity.setBarId(barId);
 * entity.setBarName(barName);
 * entity.setBarDate(barDate);
 * entity.setBarList(barList);
 * entity.setBazBean1(bazBean1);
 * entity.setBazBean2(bazBean2);
 * entity.setQuxList(quxList);
 * entity.setQuuxList(quuxList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedBarBean extends AbstractEntity implements CustomizeEntity {

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

    /** BAR_DATE: {DATE} */
    protected java.util.Date _barDate;

    /** BAR_LIST: {BAR_TABLE} */
    protected List<BarBean> _barList;

    /** BAZ_BEAN1: {NESTED_BAZ_BEAN} */
    protected NestedBazBean _bazBean1;

    /** BAZ_BEAN2: {NESTED_BAZ_BEAN} */
    protected NestedBazBean _bazBean2;

    /** QUX_LIST: {QUX_TABLE} */
    protected List<java.math.BigDecimal> _quxList;

    /** QUUX_LIST: {QUUX_TABLE} */
    protected List<java.math.BigDecimal> _quuxList;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "NESTED_BAR_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nestedBarBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NestedBarBeanDbm.getInstance();
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
        if (obj instanceof BsNestedBarBean) {
            BsNestedBarBean other = (BsNestedBarBean)obj;
            if (!xSV(_barId, other._barId)) { return false; }
            if (!xSV(_barName, other._barName)) { return false; }
            if (!xSV(_barDate, other._barDate)) { return false; }
            if (!xSV(_barList, other._barList)) { return false; }
            if (!xSV(_bazBean1, other._bazBean1)) { return false; }
            if (!xSV(_bazBean2, other._bazBean2)) { return false; }
            if (!xSV(_quxList, other._quxList)) { return false; }
            if (!xSV(_quuxList, other._quuxList)) { return false; }
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
        hs = xCH(hs, _barDate);
        hs = xCH(hs, _barList);
        hs = xCH(hs, _bazBean1);
        hs = xCH(hs, _bazBean2);
        hs = xCH(hs, _quxList);
        hs = xCH(hs, _quuxList);
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
        sb.append(dm).append(xfUD(_barDate));
        sb.append(dm).append(xfND(_barList));
        sb.append(dm).append(xfND(_bazBean1));
        sb.append(dm).append(xfND(_bazBean2));
        sb.append(dm).append(xfND(_quxList));
        sb.append(dm).append(xfND(_quuxList));
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
    public NestedBarBean clone() {
        return (NestedBarBean)super.clone();
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
     * [get] BAR_LIST: {BAR_TABLE} <br />
     * @return The value of the column 'BAR_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<BarBean> getBarList() {
        checkSpecifiedProperty("barList");
        return _barList;
    }

    /**
     * [set] BAR_LIST: {BAR_TABLE} <br />
     * @param barList The value of the column 'BAR_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarList(List<BarBean> barList) {
        registerModifiedProperty("barList");
        _barList = barList;
    }

    /**
     * [get] BAZ_BEAN1: {NESTED_BAZ_BEAN} <br />
     * @return The value of the column 'BAZ_BEAN1'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBazBean getBazBean1() {
        checkSpecifiedProperty("bazBean1");
        return _bazBean1;
    }

    /**
     * [set] BAZ_BEAN1: {NESTED_BAZ_BEAN} <br />
     * @param bazBean1 The value of the column 'BAZ_BEAN1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazBean1(NestedBazBean bazBean1) {
        registerModifiedProperty("bazBean1");
        _bazBean1 = bazBean1;
    }

    /**
     * [get] BAZ_BEAN2: {NESTED_BAZ_BEAN} <br />
     * @return The value of the column 'BAZ_BEAN2'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBazBean getBazBean2() {
        checkSpecifiedProperty("bazBean2");
        return _bazBean2;
    }

    /**
     * [set] BAZ_BEAN2: {NESTED_BAZ_BEAN} <br />
     * @param bazBean2 The value of the column 'BAZ_BEAN2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBazBean2(NestedBazBean bazBean2) {
        registerModifiedProperty("bazBean2");
        _bazBean2 = bazBean2;
    }

    /**
     * [get] QUX_LIST: {QUX_TABLE} <br />
     * @return The value of the column 'QUX_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<java.math.BigDecimal> getQuxList() {
        checkSpecifiedProperty("quxList");
        return _quxList;
    }

    /**
     * [set] QUX_LIST: {QUX_TABLE} <br />
     * @param quxList The value of the column 'QUX_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuxList(List<java.math.BigDecimal> quxList) {
        registerModifiedProperty("quxList");
        _quxList = quxList;
    }

    /**
     * [get] QUUX_LIST: {QUUX_TABLE} <br />
     * @return The value of the column 'QUUX_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<java.math.BigDecimal> getQuuxList() {
        checkSpecifiedProperty("quuxList");
        return _quuxList;
    }

    /**
     * [set] QUUX_LIST: {QUUX_TABLE} <br />
     * @param quuxList The value of the column 'QUUX_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setQuuxList(List<java.math.BigDecimal> quuxList) {
        registerModifiedProperty("quuxList");
        _quuxList = quuxList;
    }
}
