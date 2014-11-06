package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_FK_WITHOUT_PK_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     UQ_FK_REF_ID, FK_TO_UQ_CODE
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
 *     WHITE_UQ_FK_WITHOUT_PK
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqFkWithoutPk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefId = entity.getUqFkRefId();
 * String fkToUqCode = entity.getFkToUqCode();
 * entity.setUqFkRefId(uqFkRefId);
 * entity.setFkToUqCode(fkToUqCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkWithoutPkRef extends AbstractEntity {

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
    /** UQ_FK_REF_ID: {NotNull, NUMBER(16)} */
    protected Long _uqFkRefId;

    /** FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} */
    protected String _fkToUqCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_UQ_FK_WITHOUT_PK_REF";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkWithoutPkRef";
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

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'. */
    protected WhiteUqFkWithoutPk _whiteUqFkWithoutPk;

    /**
     * [get] WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @return The entity of foreign property 'whiteUqFkWithoutPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFkWithoutPk getWhiteUqFkWithoutPk() {
        return _whiteUqFkWithoutPk;
    }

    /**
     * [set] WHITE_UQ_FK_WITHOUT_PK by my FK_TO_UQ_CODE, named 'whiteUqFkWithoutPk'.
     * @param whiteUqFkWithoutPk The entity of foreign property 'whiteUqFkWithoutPk'. (NullAllowed)
     */
    public void setWhiteUqFkWithoutPk(WhiteUqFkWithoutPk whiteUqFkWithoutPk) {
        _whiteUqFkWithoutPk = whiteUqFkWithoutPk;
    }

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
        if (obj instanceof BsWhiteUqFkWithoutPkRef) {
            BsWhiteUqFkWithoutPkRef other = (BsWhiteUqFkWithoutPkRef)obj;
            if (!xSV(_uqFkRefId, other._uqFkRefId)) { return false; }
            if (!xSV(_fkToUqCode, other._fkToUqCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkRefId);
        hs = xCH(hs, _fkToUqCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkWithoutPk != null)
        { sb.append(li).append(xbRDS(_whiteUqFkWithoutPk, "whiteUqFkWithoutPk")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkRefId));
        sb.append(dm).append(xfND(_fkToUqCode));
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
        if (_whiteUqFkWithoutPk != null)
        { sb.append(dm).append("whiteUqFkWithoutPk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkWithoutPkRef clone() {
        return (WhiteUqFkWithoutPkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_ID: {NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefId() {
        checkSpecifiedProperty("uqFkRefId");
        return _uqFkRefId;
    }

    /**
     * [set] UQ_FK_REF_ID: {NotNull, NUMBER(16)} <br />
     * @param uqFkRefId The value of the column 'UQ_FK_REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefId(Long uqFkRefId) {
        registerModifiedProperty("uqFkRefId");
        _uqFkRefId = uqFkRefId;
    }

    /**
     * [get] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} <br />
     * @return The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFkToUqCode() {
        checkSpecifiedProperty("fkToUqCode");
        return _fkToUqCode;
    }

    /**
     * [set] FK_TO_UQ_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_WITHOUT_PK} <br />
     * @param fkToUqCode The value of the column 'FK_TO_UQ_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFkToUqCode(String fkToUqCode) {
        registerModifiedProperty("fkToUqCode");
        _fkToUqCode = fkToUqCode;
    }
}
