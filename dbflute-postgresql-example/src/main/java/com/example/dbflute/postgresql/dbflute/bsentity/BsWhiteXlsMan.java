package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_xls_man as TABLE. <br />
 * <pre>
 * [primary-key]
 *     xls_man_id
 * 
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
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
 * Long xlsManId = entity.getXlsManId();
 * String stringConverted = entity.getStringConverted();
 * java.sql.Timestamp timestampZeroDefaultMillis = entity.getTimestampZeroDefaultMillis();
 * java.sql.Timestamp timestampZeroPrefixMillis = entity.getTimestampZeroPrefixMillis();
 * java.sql.Timestamp timestampZeroSuffixMillis = entity.getTimestampZeroSuffixMillis();
 * entity.setXlsManId(xlsManId);
 * entity.setStringConverted(stringConverted);
 * entity.setTimestampZeroDefaultMillis(timestampZeroDefaultMillis);
 * entity.setTimestampZeroPrefixMillis(timestampZeroPrefixMillis);
 * entity.setTimestampZeroSuffixMillis(timestampZeroSuffixMillis);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsMan extends AbstractEntity {

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
    /** xls_man_id: {PK, NotNull, int8(19)} */
    protected Long _xlsManId;

    /** string_converted: {varchar(2147483647)} */
    protected String _stringConverted;

    /** timestamp_zero_default_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroDefaultMillis;

    /** timestamp_zero_prefix_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroPrefixMillis;

    /** timestamp_zero_suffix_millis: {timestamp(26, 3)} */
    protected java.sql.Timestamp _timestampZeroSuffixMillis;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_xls_man";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteXlsMan";
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
        if (getXlsManId() == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteXlsMan) {
            BsWhiteXlsMan other = (BsWhiteXlsMan)obj;
            if (!xSV(_xlsManId, other._xlsManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _xlsManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_xlsManId));
        sb.append(dm).append(xfND(_stringConverted));
        sb.append(dm).append(xfND(_timestampZeroDefaultMillis));
        sb.append(dm).append(xfND(_timestampZeroPrefixMillis));
        sb.append(dm).append(xfND(_timestampZeroSuffixMillis));
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
    public WhiteXlsMan clone() {
        return (WhiteXlsMan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] xls_man_id: {PK, NotNull, int8(19)} <br />
     * @return The value of the column 'xls_man_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getXlsManId() {
        checkSpecifiedProperty("xlsManId");
        return _xlsManId;
    }

    /**
     * [set] xls_man_id: {PK, NotNull, int8(19)} <br />
     * @param xlsManId The value of the column 'xls_man_id'. (basically NotNull if update: for the constraint)
     */
    public void setXlsManId(Long xlsManId) {
        __modifiedProperties.addPropertyName("xlsManId");
        _xlsManId = xlsManId;
    }

    /**
     * [get] string_converted: {varchar(2147483647)} <br />
     * @return The value of the column 'string_converted'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        checkSpecifiedProperty("stringConverted");
        return _stringConverted;
    }

    /**
     * [set] string_converted: {varchar(2147483647)} <br />
     * @param stringConverted The value of the column 'string_converted'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        __modifiedProperties.addPropertyName("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] timestamp_zero_default_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_default_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroDefaultMillis() {
        checkSpecifiedProperty("timestampZeroDefaultMillis");
        return _timestampZeroDefaultMillis;
    }

    /**
     * [set] timestamp_zero_default_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroDefaultMillis The value of the column 'timestamp_zero_default_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroDefaultMillis(java.sql.Timestamp timestampZeroDefaultMillis) {
        __modifiedProperties.addPropertyName("timestampZeroDefaultMillis");
        _timestampZeroDefaultMillis = timestampZeroDefaultMillis;
    }

    /**
     * [get] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroPrefixMillis() {
        checkSpecifiedProperty("timestampZeroPrefixMillis");
        return _timestampZeroPrefixMillis;
    }

    /**
     * [set] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroPrefixMillis The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroPrefixMillis(java.sql.Timestamp timestampZeroPrefixMillis) {
        __modifiedProperties.addPropertyName("timestampZeroPrefixMillis");
        _timestampZeroPrefixMillis = timestampZeroPrefixMillis;
    }

    /**
     * [get] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br />
     * @return The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTimestampZeroSuffixMillis() {
        checkSpecifiedProperty("timestampZeroSuffixMillis");
        return _timestampZeroSuffixMillis;
    }

    /**
     * [set] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br />
     * @param timestampZeroSuffixMillis The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroSuffixMillis(java.sql.Timestamp timestampZeroSuffixMillis) {
        __modifiedProperties.addPropertyName("timestampZeroSuffixMillis");
        _timestampZeroSuffixMillis = timestampZeroSuffixMillis;
    }
}
