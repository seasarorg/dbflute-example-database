package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS as TABLE. <br />
 * これのみえてよい
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME
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
 *     WHITE_REF_NEXT_TARGET, NEXT_SCHEMA_PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteRefNextTargetList, nextSchemaProductList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsNextSchemaProductStatus extends AbstractEntity {

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
    /** PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} */
    protected String _productStatusCode;

    /** PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} */
    protected String _productStatusName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "NEXT_SCHEMA_PRODUCT_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nextSchemaProductStatus";
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
        if (getProductStatusCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productStatusName : UQ, NotNull, VARCHAR2(50). (NotNull)
     */
    public void uniqueBy(String productStatusName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productStatusName");
        setProductStatusName(productStatusName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'. */
    protected List<WhiteRefNextTarget> _whiteRefNextTargetList;

    /**
     * [get] WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * @return The entity list of referrer property 'whiteRefNextTargetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteRefNextTarget> getWhiteRefNextTargetList() {
        if (_whiteRefNextTargetList == null) { _whiteRefNextTargetList = newReferrerList(); }
        return _whiteRefNextTargetList;
    }

    /**
     * [set] WHITE_REF_NEXT_TARGET by NEXT_TARGET_CODE, named 'whiteRefNextTargetList'.
     * @param whiteRefNextTargetList The entity list of referrer property 'whiteRefNextTargetList'. (NullAllowed)
     */
    public void setWhiteRefNextTargetList(List<WhiteRefNextTarget> whiteRefNextTargetList) {
        _whiteRefNextTargetList = whiteRefNextTargetList;
    }

    /** (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'. */
    protected List<NextSchemaProduct> _nextSchemaProductList;

    /**
     * [get] (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * @return The entity list of referrer property 'nextSchemaProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<NextSchemaProduct> getNextSchemaProductList() {
        if (_nextSchemaProductList == null) { _nextSchemaProductList = newReferrerList(); }
        return _nextSchemaProductList;
    }

    /**
     * [set] (隣のスキーマ)NEXT_SCHEMA_PRODUCT by PRODUCT_STATUS_CODE, named 'nextSchemaProductList'.
     * @param nextSchemaProductList The entity list of referrer property 'nextSchemaProductList'. (NullAllowed)
     */
    public void setNextSchemaProductList(List<NextSchemaProduct> nextSchemaProductList) {
        _nextSchemaProductList = nextSchemaProductList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsNextSchemaProductStatus) {
            BsNextSchemaProductStatus other = (BsNextSchemaProductStatus)obj;
            if (!xSV(_productStatusCode, other._productStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteRefNextTargetList != null) { for (WhiteRefNextTarget et : _whiteRefNextTargetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteRefNextTargetList")); } } }
        if (_nextSchemaProductList != null) { for (NextSchemaProduct et : _nextSchemaProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "nextSchemaProductList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productStatusCode));
        sb.append(dm).append(xfND(_productStatusName));
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
        StringBuilder sb = new StringBuilder();
        if (_whiteRefNextTargetList != null && !_whiteRefNextTargetList.isEmpty())
        { sb.append(dm).append("whiteRefNextTargetList"); }
        if (_nextSchemaProductList != null && !_nextSchemaProductList.isEmpty())
        { sb.append(dm).append("nextSchemaProductList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public NextSchemaProductStatus clone() {
        return (NextSchemaProductStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusCode() {
        checkSpecifiedProperty("productStatusCode");
        return _productStatusCode;
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusCode(String productStatusCode) {
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProductStatusName() {
        checkSpecifiedProperty("productStatusName");
        return _productStatusName;
    }

    /**
     * [set] PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR2(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProductStatusName(String productStatusName) {
        __modifiedProperties.addPropertyName("productStatusName");
        _productStatusName = productStatusName;
    }
}
