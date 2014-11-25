package com.example.dbflute.oracle.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.CustomizeEntity;
import com.example.dbflute.oracle.dbflute.exentity.customize.*;

/**
 * The entity of NESTED_FOO_BEAN. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     FOO_ID, FOO_NAME, FOO_DATE, BAR_BEAN, QUX_LIST, QUUX_LIST, CORGE_LIST
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
 * java.util.Date fooDate = entity.getFooDate();
 * NestedBarBean barBean = entity.getBarBean();
 * List<java.math.BigDecimal> quxList = entity.getQuxList();
 * List<java.math.BigDecimal> quuxList = entity.getQuuxList();
 * List<CorgeBean> corgeList = entity.getCorgeList();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setFooDate(fooDate);
 * entity.setBarBean(barBean);
 * entity.setQuxList(quxList);
 * entity.setQuuxList(quuxList);
 * entity.setCorgeList(corgeList);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNestedFooBean extends AbstractEntity implements CustomizeEntity {

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

    /** FOO_DATE: {DATE} */
    protected java.util.Date _fooDate;

    /** BAR_BEAN: {NESTED_BAR_BEAN} */
    protected NestedBarBean _barBean;

    /** QUX_LIST: {QUX_TABLE} */
    protected List<java.math.BigDecimal> _quxList;

    /** QUUX_LIST: {QUUX_TABLE} */
    protected List<java.math.BigDecimal> _quuxList;

    /** CORGE_LIST: {CORGE_TABLE} */
    protected List<CorgeBean> _corgeList;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "NESTED_FOO_BEAN";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nestedFooBean";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.oracle.dbflute.bsentity.customize.dbmeta.NestedFooBeanDbm.getInstance();
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
        if (obj instanceof BsNestedFooBean) {
            BsNestedFooBean other = (BsNestedFooBean)obj;
            if (!xSV(_fooId, other._fooId)) { return false; }
            if (!xSV(_fooName, other._fooName)) { return false; }
            if (!xSV(_fooDate, other._fooDate)) { return false; }
            if (!xSV(_barBean, other._barBean)) { return false; }
            if (!xSV(_quxList, other._quxList)) { return false; }
            if (!xSV(_quuxList, other._quuxList)) { return false; }
            if (!xSV(_corgeList, other._corgeList)) { return false; }
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
        hs = xCH(hs, _fooDate);
        hs = xCH(hs, _barBean);
        hs = xCH(hs, _quxList);
        hs = xCH(hs, _quuxList);
        hs = xCH(hs, _corgeList);
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
        sb.append(dm).append(xfUD(_fooDate));
        sb.append(dm).append(xfND(_barBean));
        sb.append(dm).append(xfND(_quxList));
        sb.append(dm).append(xfND(_quuxList));
        sb.append(dm).append(xfND(_corgeList));
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
    public NestedFooBean clone() {
        return (NestedFooBean)super.clone();
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
        registerModifiedProperty("fooId");
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
        registerModifiedProperty("fooName");
        _fooName = fooName;
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
        registerModifiedProperty("fooDate");
        _fooDate = fooDate;
    }

    /**
     * [get] BAR_BEAN: {NESTED_BAR_BEAN} <br />
     * @return The value of the column 'BAR_BEAN'. (NullAllowed even if selected: for no constraint)
     */
    public NestedBarBean getBarBean() {
        checkSpecifiedProperty("barBean");
        return _barBean;
    }

    /**
     * [set] BAR_BEAN: {NESTED_BAR_BEAN} <br />
     * @param barBean The value of the column 'BAR_BEAN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBarBean(NestedBarBean barBean) {
        registerModifiedProperty("barBean");
        _barBean = barBean;
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

    /**
     * [get] CORGE_LIST: {CORGE_TABLE} <br />
     * @return The value of the column 'CORGE_LIST'. (NullAllowed even if selected: for no constraint)
     */
    public List<CorgeBean> getCorgeList() {
        checkSpecifiedProperty("corgeList");
        return _corgeList;
    }

    /**
     * [set] CORGE_LIST: {CORGE_TABLE} <br />
     * @param corgeList The value of the column 'CORGE_LIST'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCorgeList(List<CorgeBean> corgeList) {
        registerModifiedProperty("corgeList");
        _corgeList = corgeList;
    }
}
