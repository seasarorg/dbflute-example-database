package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_NEXT_EXCEPT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_NEXT_EXCEPT_ID
 * 
 * [column]
 *     REF_NEXT_EXCEPT_ID, NEXT_EXCEPT_CODE
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
 * Long refNextExceptId = entity.getRefNextExceptId();
 * String nextExceptCode = entity.getNextExceptCode();
 * entity.setRefNextExceptId(refNextExceptId);
 * entity.setNextExceptCode(nextExceptCode);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefNextExcept extends AbstractEntity {

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
    /** REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refNextExceptId;

    /** NEXT_EXCEPT_CODE: {NotNull, CHAR(3)} */
    protected String _nextExceptCode;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_REF_NEXT_EXCEPT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteRefNextExcept";
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
        if (getRefNextExceptId() == null) { return false; }
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
        if (obj instanceof BsWhiteRefNextExcept) {
            BsWhiteRefNextExcept other = (BsWhiteRefNextExcept)obj;
            if (!xSV(_refNextExceptId, other._refNextExceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refNextExceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refNextExceptId));
        sb.append(dm).append(xfND(_nextExceptCode));
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
    public WhiteRefNextExcept clone() {
        return (WhiteRefNextExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_NEXT_EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefNextExceptId() {
        checkSpecifiedProperty("refNextExceptId");
        return _refNextExceptId;
    }

    /**
     * [set] REF_NEXT_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refNextExceptId The value of the column 'REF_NEXT_EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefNextExceptId(Long refNextExceptId) {
        __modifiedProperties.addPropertyName("refNextExceptId");
        _refNextExceptId = refNextExceptId;
    }

    /**
     * [get] NEXT_EXCEPT_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'NEXT_EXCEPT_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getNextExceptCode() {
        checkSpecifiedProperty("nextExceptCode");
        return _nextExceptCode;
    }

    /**
     * [set] NEXT_EXCEPT_CODE: {NotNull, CHAR(3)} <br />
     * @param nextExceptCode The value of the column 'NEXT_EXCEPT_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setNextExceptCode(String nextExceptCode) {
        __modifiedProperties.addPropertyName("nextExceptCode");
        _nextExceptCode = nextExceptCode;
    }
}
