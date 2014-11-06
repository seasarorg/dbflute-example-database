package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of next_schema_product as TABLE. <br />
 * <pre>
 * [primary-key]
 *     product_id
 * 
 * [column]
 *     product_id, product_name
 * 
 * [sequence]
 *     nextschema.next_schema_product_product_id_seq
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
 *     white_same_name
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteSameNameList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextSchemaProduct extends AbstractEntity {

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
    /** product_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _productId;

    /** product_name: {NotNull, varchar(200)} */
    protected String _productName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "next_schema_product";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "nextSchemaProduct";
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
        if (getProductId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_same_name by next_schema_product_id, named 'whiteSameNameList'. */
    protected List<WhiteSameName> _whiteSameNameList;

    /**
     * [get] white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * @return The entity list of referrer property 'whiteSameNameList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSameName> getWhiteSameNameList() {
        if (_whiteSameNameList == null) { _whiteSameNameList = newReferrerList(); }
        return _whiteSameNameList;
    }

    /**
     * [set] white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * @param whiteSameNameList The entity list of referrer property 'whiteSameNameList'. (NullAllowed)
     */
    public void setWhiteSameNameList(List<WhiteSameName> whiteSameNameList) {
        _whiteSameNameList = whiteSameNameList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsNextSchemaProduct) {
            BsNextSchemaProduct other = (BsNextSchemaProduct)obj;
            if (!xSV(_productId, other._productId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _productId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameNameList != null) { for (WhiteSameName et : _whiteSameNameList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSameNameList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_productName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameNameList != null && !_whiteSameNameList.isEmpty())
        { sb.append(dm).append("whiteSameNameList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public NextSchemaProduct clone() {
        return (NextSchemaProduct)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] product_id: {PK, ID, NotNull, serial(10)} <br />
     * @return The value of the column 'product_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] product_id: {PK, ID, NotNull, serial(10)} <br />
     * @param productId The value of the column 'product_id'. (basically NotNull if update: for the constraint)
     */
    public void setProductId(Integer productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] product_name: {NotNull, varchar(200)} <br />
     * @return The value of the column 'product_name'. (basically NotNull if selected: for the constraint)
     */
    public String getProductName() {
        checkSpecifiedProperty("productName");
        return _productName;
    }

    /**
     * [set] product_name: {NotNull, varchar(200)} <br />
     * @param productName The value of the column 'product_name'. (basically NotNull if update: for the constraint)
     */
    public void setProductName(String productName) {
        registerModifiedProperty("productName");
        _productName = productName;
    }
}
