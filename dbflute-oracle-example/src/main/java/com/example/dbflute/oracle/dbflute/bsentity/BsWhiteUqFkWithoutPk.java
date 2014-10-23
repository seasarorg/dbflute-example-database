package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_FK_WITHOUT_PK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UQ_FK_CODE, UQ_FK_NAME
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
 *     WHITE_UQ_FK_WITHOUT_PK_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteUqFkWithoutPkRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String uqFkCode = entity.getUqFkCode();
 * String uqFkName = entity.getUqFkName();
 * entity.setUqFkCode(uqFkCode);
 * entity.setUqFkName(uqFkName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkWithoutPk extends AbstractEntity {

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
    /** UQ_FK_CODE: {UQ, NotNull, CHAR(3)} */
    protected String _uqFkCode;

    /** UQ_FK_NAME: {NotNull, VARCHAR2(64)} */
    protected String _uqFkName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_UQ_FK_WITHOUT_PK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkWithoutPk";
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
        return false;
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
    /** WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'. */
    protected List<WhiteUqFkWithoutPkRef> _whiteUqFkWithoutPkRefList;

    /**
     * [get] WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'.
     * @return The entity list of referrer property 'whiteUqFkWithoutPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteUqFkWithoutPkRef> getWhiteUqFkWithoutPkRefList() {
        if (_whiteUqFkWithoutPkRefList == null) { _whiteUqFkWithoutPkRefList = newReferrerList(); }
        return _whiteUqFkWithoutPkRefList;
    }

    /**
     * [set] WHITE_UQ_FK_WITHOUT_PK_REF by FK_TO_UQ_CODE, named 'whiteUqFkWithoutPkRefList'.
     * @param whiteUqFkWithoutPkRefList The entity list of referrer property 'whiteUqFkWithoutPkRefList'. (NullAllowed)
     */
    public void setWhiteUqFkWithoutPkRefList(List<WhiteUqFkWithoutPkRef> whiteUqFkWithoutPkRefList) {
        _whiteUqFkWithoutPkRefList = whiteUqFkWithoutPkRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteUqFkWithoutPk) {
            BsWhiteUqFkWithoutPk other = (BsWhiteUqFkWithoutPk)obj;
            if (!xSV(_uqFkCode, other._uqFkCode)) { return false; }
            if (!xSV(_uqFkName, other._uqFkName)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkCode);
        hs = xCH(hs, _uqFkName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkWithoutPkRefList != null) { for (WhiteUqFkWithoutPkRef et : _whiteUqFkWithoutPkRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteUqFkWithoutPkRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkCode));
        sb.append(dm).append(xfND(_uqFkName));
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
        if (_whiteUqFkWithoutPkRefList != null && !_whiteUqFkWithoutPkRefList.isEmpty())
        { sb.append(dm).append("whiteUqFkWithoutPkRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkWithoutPk clone() {
        return (WhiteUqFkWithoutPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

    /**
     * [get] UQ_FK_NAME: {NotNull, VARCHAR2(64)} <br />
     * @return The value of the column 'UQ_FK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUqFkName() {
        checkSpecifiedProperty("uqFkName");
        return _uqFkName;
    }

    /**
     * [set] UQ_FK_NAME: {NotNull, VARCHAR2(64)} <br />
     * @param uqFkName The value of the column 'UQ_FK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkName(String uqFkName) {
        __modifiedProperties.addPropertyName("uqFkName");
        _uqFkName = uqFkName;
    }
}
