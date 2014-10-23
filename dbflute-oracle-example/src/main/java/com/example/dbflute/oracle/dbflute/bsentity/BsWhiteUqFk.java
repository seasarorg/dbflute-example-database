package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_ID
 * 
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     WHITE_UQ_FK_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkId = entity.getUqFkId();
 * String uqFkCode = entity.getUqFkCode();
 * entity.setUqFkId(uqFkId);
 * entity.setUqFkCode(uqFkCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFk extends AbstractEntity {

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
    /** UQ_FK_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _uqFkId;

    /** UQ_FK_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqFkCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_UQ_FK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFk";
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
        if (getUqFkId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uqFkCode : UQ, NotNull, CHAR(3). (NotNull)
     */
    public void uniqueBy(String uqFkCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uqFkCode");
        setUqFkCode(uqFkCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToPkIdList;

    /**
     * [get] WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToPkIdList() {
        if (_whiteUqFkRefByFkToPkIdList == null) { _whiteUqFkRefByFkToPkIdList = newReferrerList(); }
        return _whiteUqFkRefByFkToPkIdList;
    }

    /**
     * [set] WHITE_UQ_FK_REF by FK_TO_PK_ID, named 'whiteUqFkRefByFkToPkIdList'.
     * @param whiteUqFkRefByFkToPkIdList The entity list of referrer property 'whiteUqFkRefByFkToPkIdList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToPkIdList(List<WhiteUqFkRef> whiteUqFkRefByFkToPkIdList) {
        _whiteUqFkRefByFkToPkIdList = whiteUqFkRefByFkToPkIdList;
    }

    /** WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'. */
    protected List<WhiteUqFkRef> _whiteUqFkRefByFkToUqCodeList;

    /**
     * [get] WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @return The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkRef> getWhiteUqFkRefByFkToUqCodeList() {
        if (_whiteUqFkRefByFkToUqCodeList == null) { _whiteUqFkRefByFkToUqCodeList = newReferrerList(); }
        return _whiteUqFkRefByFkToUqCodeList;
    }

    /**
     * [set] WHITE_UQ_FK_REF by FK_TO_UQ_CODE, named 'whiteUqFkRefByFkToUqCodeList'.
     * @param whiteUqFkRefByFkToUqCodeList The entity list of referrer property 'whiteUqFkRefByFkToUqCodeList'. (NullAllowed)
     */
    public void setWhiteUqFkRefByFkToUqCodeList(List<WhiteUqFkRef> whiteUqFkRefByFkToUqCodeList) {
        _whiteUqFkRefByFkToUqCodeList = whiteUqFkRefByFkToUqCodeList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteUqFk) {
            BsWhiteUqFk other = (BsWhiteUqFk)obj;
            if (!xSV(_uqFkId, other._uqFkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRefByFkToPkIdList != null) { for (WhiteUqFkRef et : _whiteUqFkRefByFkToPkIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkRefByFkToPkIdList")); } } }
        if (_whiteUqFkRefByFkToUqCodeList != null) { for (WhiteUqFkRef et : _whiteUqFkRefByFkToUqCodeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkRefByFkToUqCodeList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkId));
        sb.append(dm).append(xfND(_uqFkCode));
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
        if (_whiteUqFkRefByFkToPkIdList != null && !_whiteUqFkRefByFkToPkIdList.isEmpty())
        { sb.append(dm).append("whiteUqFkRefByFkToPkIdList"); }
        if (_whiteUqFkRefByFkToUqCodeList != null && !_whiteUqFkRefByFkToUqCodeList.isEmpty())
        { sb.append(dm).append("whiteUqFkRefByFkToUqCodeList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFk clone() {
        return (WhiteUqFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkId() {
        checkSpecifiedProperty("uqFkId");
        return _uqFkId;
    }

    /**
     * [set] UQ_FK_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param uqFkId The value of the column 'UQ_FK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkId(Long uqFkId) {
        __modifiedProperties.addPropertyName("uqFkId");
        _uqFkId = uqFkId;
    }

    /**
     * [get] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @return The value of the column 'UQ_FK_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkCode() {
        checkSpecifiedProperty("uqFkCode");
        return _uqFkCode;
    }

    /**
     * [set] UQ_FK_CODE: {UQ, NotNull, CHAR(3)} <br />
     * @param uqFkCode The value of the column 'UQ_FK_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkCode(String uqFkCode) {
        __modifiedProperties.addPropertyName("uqFkCode");
        _uqFkCode = uqFkCode;
    }
}
