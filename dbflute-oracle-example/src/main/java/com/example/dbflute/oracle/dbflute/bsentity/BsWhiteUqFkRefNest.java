package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_UQ_FK_REF_NEST as TABLE. <br />
 * <pre>
 * [primary-key]
 *     UQ_FK_REF_NEST_ID
 * 
 * [column]
 *     UQ_FK_REF_NEST_ID, COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE
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
 *     WHITE_UQ_FK_REF
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteUqFkRef
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long uqFkRefNestId = entity.getUqFkRefNestId();
 * String compoundUqFirstCode = entity.getCompoundUqFirstCode();
 * String compoundUqSecondCode = entity.getCompoundUqSecondCode();
 * entity.setUqFkRefNestId(uqFkRefNestId);
 * entity.setCompoundUqFirstCode(compoundUqFirstCode);
 * entity.setCompoundUqSecondCode(compoundUqSecondCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteUqFkRefNest extends AbstractEntity {

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
    /** UQ_FK_REF_NEST_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _uqFkRefNestId;

    /** COMPOUND_UQ_FIRST_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} */
    protected String _compoundUqFirstCode;

    /** COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} */
    protected String _compoundUqSecondCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_UQ_FK_REF_NEST";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteUqFkRefNest";
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
        if (getUqFkRefNestId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'. */
    protected WhiteUqFkRef _whiteUqFkRef;

    /**
     * [get] WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @return The entity of foreign property 'whiteUqFkRef'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteUqFkRef getWhiteUqFkRef() {
        return _whiteUqFkRef;
    }

    /**
     * [set] WHITE_UQ_FK_REF by my COMPOUND_UQ_FIRST_CODE, COMPOUND_UQ_SECOND_CODE, named 'whiteUqFkRef'.
     * @param whiteUqFkRef The entity of foreign property 'whiteUqFkRef'. (NullAllowed)
     */
    public void setWhiteUqFkRef(WhiteUqFkRef whiteUqFkRef) {
        _whiteUqFkRef = whiteUqFkRef;
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
        if (obj instanceof BsWhiteUqFkRefNest) {
            BsWhiteUqFkRefNest other = (BsWhiteUqFkRefNest)obj;
            if (!xSV(_uqFkRefNestId, other._uqFkRefNestId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _uqFkRefNestId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteUqFkRef != null)
        { sb.append(li).append(xbRDS(_whiteUqFkRef, "whiteUqFkRef")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_uqFkRefNestId));
        sb.append(dm).append(xfND(_compoundUqFirstCode));
        sb.append(dm).append(xfND(_compoundUqSecondCode));
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
        if (_whiteUqFkRef != null)
        { sb.append(dm).append("whiteUqFkRef"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteUqFkRefNest clone() {
        return (WhiteUqFkRefNest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UQ_FK_REF_NEST_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUqFkRefNestId() {
        checkSpecifiedProperty("uqFkRefNestId");
        return _uqFkRefNestId;
    }

    /**
     * [set] UQ_FK_REF_NEST_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param uqFkRefNestId The value of the column 'UQ_FK_REF_NEST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUqFkRefNestId(Long uqFkRefNestId) {
        registerModifiedProperty("uqFkRefNestId");
        _uqFkRefNestId = uqFkRefNestId;
    }

    /**
     * [get] COMPOUND_UQ_FIRST_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} <br />
     * @return The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqFirstCode() {
        checkSpecifiedProperty("compoundUqFirstCode");
        return _compoundUqFirstCode;
    }

    /**
     * [set] COMPOUND_UQ_FIRST_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} <br />
     * @param compoundUqFirstCode The value of the column 'COMPOUND_UQ_FIRST_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqFirstCode(String compoundUqFirstCode) {
        registerModifiedProperty("compoundUqFirstCode");
        _compoundUqFirstCode = compoundUqFirstCode;
    }

    /**
     * [get] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} <br />
     * @return The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCompoundUqSecondCode() {
        checkSpecifiedProperty("compoundUqSecondCode");
        return _compoundUqSecondCode;
    }

    /**
     * [set] COMPOUND_UQ_SECOND_CODE: {NotNull, CHAR(3), FK to WHITE_UQ_FK_REF} <br />
     * @param compoundUqSecondCode The value of the column 'COMPOUND_UQ_SECOND_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCompoundUqSecondCode(String compoundUqSecondCode) {
        registerModifiedProperty("compoundUqSecondCode");
        _compoundUqSecondCode = compoundUqSecondCode;
    }
}
