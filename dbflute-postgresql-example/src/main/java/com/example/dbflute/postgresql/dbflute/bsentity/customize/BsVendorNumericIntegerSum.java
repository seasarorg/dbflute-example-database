package com.example.dbflute.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorNumericIntegerSum. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     integer_non_digit_sum
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
 * java.math.BigDecimal integerNonDigitSum = entity.getIntegerNonDigitSum();
 * entity.setIntegerNonDigitSum(integerNonDigitSum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorNumericIntegerSum extends AbstractEntity {

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
    /** integer_non_digit_sum: {numeric(131089)} */
    protected java.math.BigDecimal _integerNonDigitSum;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VendorNumericIntegerSum";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorNumericIntegerSum";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.postgresql.dbflute.bsentity.customize.dbmeta.VendorNumericIntegerSumDbm.getInstance();
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
        if (obj instanceof BsVendorNumericIntegerSum) {
            BsVendorNumericIntegerSum other = (BsVendorNumericIntegerSum)obj;
            if (!xSV(_integerNonDigitSum, other._integerNonDigitSum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _integerNonDigitSum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_integerNonDigitSum));
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
    public VendorNumericIntegerSum clone() {
        return (VendorNumericIntegerSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] integer_non_digit_sum: {numeric(131089)} <br />
     * @return The value of the column 'integer_non_digit_sum'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getIntegerNonDigitSum() {
        checkSpecifiedProperty("integerNonDigitSum");
        return _integerNonDigitSum;
    }

    /**
     * [set] integer_non_digit_sum: {numeric(131089)} <br />
     * @param integerNonDigitSum The value of the column 'integer_non_digit_sum'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIntegerNonDigitSum(java.math.BigDecimal integerNonDigitSum) {
        __modifiedProperties.addPropertyName("integerNonDigitSum");
        _integerNonDigitSum = integerNonDigitSum;
    }
}
