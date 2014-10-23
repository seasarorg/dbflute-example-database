package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_NEXT_SAME_NAME_FK as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     REF_ID
 * 
 * [column]
 *     REF_ID, REF_NAME, SAME_NAME_ID
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
 * Long refId = entity.getRefId();
 * String refName = entity.getRefName();
 * Long sameNameId = entity.getSameNameId();
 * entity.setRefId(refId);
 * entity.setRefName(refName);
 * entity.setSameNameId(sameNameId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymNextSameNameFk extends AbstractEntity {

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
    /** REF_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refId;

    /** REF_NAME: {NotNull, VARCHAR2(50)} */
    protected String _refName;

    /** SAME_NAME_ID: {NUMBER(16)} */
    protected Long _sameNameId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_NEXT_SAME_NAME_FK";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymNextSameNameFk";
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
        if (getRefId() == null) { return false; }
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
        if (obj instanceof BsSynonymNextSameNameFk) {
            BsSynonymNextSameNameFk other = (BsSynonymNextSameNameFk)obj;
            if (!xSV(_refId, other._refId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refId));
        sb.append(dm).append(xfND(_refName));
        sb.append(dm).append(xfND(_sameNameId));
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
    public SynonymNextSameNameFk clone() {
        return (SynonymNextSameNameFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefId() {
        checkSpecifiedProperty("refId");
        return _refId;
    }

    /**
     * [set] REF_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refId The value of the column 'REF_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefId(Long refId) {
        __modifiedProperties.addPropertyName("refId");
        _refId = refId;
    }

    /**
     * [get] REF_NAME: {NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'REF_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getRefName() {
        checkSpecifiedProperty("refName");
        return _refName;
    }

    /**
     * [set] REF_NAME: {NotNull, VARCHAR2(50)} <br />
     * @param refName The value of the column 'REF_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setRefName(String refName) {
        __modifiedProperties.addPropertyName("refName");
        _refName = refName;
    }

    /**
     * [get] SAME_NAME_ID: {NUMBER(16)} <br />
     * @return The value of the column 'SAME_NAME_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] SAME_NAME_ID: {NUMBER(16)} <br />
     * @param sameNameId The value of the column 'SAME_NAME_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameId(Long sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        _sameNameId = sameNameId;
    }
}
