package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_NEXT_TARGET as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_NEXT_TARGET_ID
 * 
 * [column]
 *     REF_NEXT_TARGET_ID, NEXT_TARGET_CODE
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
 *     NEXT_SCHEMA_PRODUCT_STATUS
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     nextSchemaProductStatus
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refNextTargetId = entity.getRefNextTargetId();
 * String nextTargetCode = entity.getNextTargetCode();
 * entity.setRefNextTargetId(refNextTargetId);
 * entity.setNextTargetCode(nextTargetCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefNextTarget extends AbstractEntity {

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
    /** REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refNextTargetId;

    /** NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} */
    protected String _nextTargetCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_REF_NEXT_TARGET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteRefNextTarget";
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
        if (getRefNextTargetId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'. */
    protected NextSchemaProductStatus _nextSchemaProductStatus;

    /**
     * [get] (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @return The entity of foreign property 'nextSchemaProductStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public NextSchemaProductStatus getNextSchemaProductStatus() {
        return _nextSchemaProductStatus;
    }

    /**
     * [set] (隣のスキステ)NEXT_SCHEMA_PRODUCT_STATUS by my NEXT_TARGET_CODE, named 'nextSchemaProductStatus'.
     * @param nextSchemaProductStatus The entity of foreign property 'nextSchemaProductStatus'. (NullAllowed)
     */
    public void setNextSchemaProductStatus(NextSchemaProductStatus nextSchemaProductStatus) {
        _nextSchemaProductStatus = nextSchemaProductStatus;
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
        if (obj instanceof BsWhiteRefNextTarget) {
            BsWhiteRefNextTarget other = (BsWhiteRefNextTarget)obj;
            if (!xSV(_refNextTargetId, other._refNextTargetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refNextTargetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_nextSchemaProductStatus != null)
        { sb.append(li).append(xbRDS(_nextSchemaProductStatus, "nextSchemaProductStatus")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refNextTargetId));
        sb.append(dm).append(xfND(_nextTargetCode));
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
        if (_nextSchemaProductStatus != null)
        { sb.append(dm).append("nextSchemaProductStatus"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteRefNextTarget clone() {
        return (WhiteRefNextTarget)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_NEXT_TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefNextTargetId() {
        checkSpecifiedProperty("refNextTargetId");
        return _refNextTargetId;
    }

    /**
     * [set] REF_NEXT_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refNextTargetId The value of the column 'REF_NEXT_TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefNextTargetId(Long refNextTargetId) {
        registerModifiedProperty("refNextTargetId");
        _refNextTargetId = refNextTargetId;
    }

    /**
     * [get] NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * @return The value of the column 'NEXT_TARGET_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNextTargetCode() {
        checkSpecifiedProperty("nextTargetCode");
        return _nextTargetCode;
    }

    /**
     * [set] NEXT_TARGET_CODE: {NotNull, CHAR(3), FK to NEXT_SCHEMA_PRODUCT_STATUS} <br />
     * @param nextTargetCode The value of the column 'NEXT_TARGET_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setNextTargetCode(String nextTargetCode) {
        registerModifiedProperty("nextTargetCode");
        _nextTargetCode = nextTargetCode;
    }
}
