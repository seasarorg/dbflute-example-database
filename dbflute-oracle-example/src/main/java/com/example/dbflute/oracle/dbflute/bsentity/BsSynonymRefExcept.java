package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_REF_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     REF_EXCEPT_ID
 * 
 * [column]
 *     REF_EXCEPT_ID, EXCEPT_ID
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
 *     SYNONYM_EXCEPT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     synonymExcept
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refExceptId = entity.getRefExceptId();
 * Long exceptId = entity.getExceptId();
 * entity.setRefExceptId(refExceptId);
 * entity.setExceptId(exceptId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymRefExcept extends AbstractEntity implements DomainEntity {

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
    /** REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refExceptId;

    /** EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} */
    protected Long _exceptId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_REF_EXCEPT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymRefExcept";
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
        if (getRefExceptId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'. */
    protected SynonymExcept _synonymExcept;

    /**
     * [get] SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @return The entity of foreign property 'synonymExcept'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public SynonymExcept getSynonymExcept() {
        return _synonymExcept;
    }

    /**
     * [set] SYNONYM_EXCEPT by my EXCEPT_ID, named 'synonymExcept'.
     * @param synonymExcept The entity of foreign property 'synonymExcept'. (NullAllowed)
     */
    public void setSynonymExcept(SynonymExcept synonymExcept) {
        _synonymExcept = synonymExcept;
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
        if (obj instanceof BsSynonymRefExcept) {
            BsSynonymRefExcept other = (BsSynonymRefExcept)obj;
            if (!xSV(_refExceptId, other._refExceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refExceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_synonymExcept != null)
        { sb.append(li).append(xbRDS(_synonymExcept, "synonymExcept")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refExceptId));
        sb.append(dm).append(xfND(_exceptId));
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
        if (_synonymExcept != null)
        { sb.append(dm).append("synonymExcept"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SynonymRefExcept clone() {
        return (SynonymRefExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefExceptId() {
        checkSpecifiedProperty("refExceptId");
        return _refExceptId;
    }

    /**
     * [set] REF_EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refExceptId The value of the column 'REF_EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefExceptId(Long refExceptId) {
        registerModifiedProperty("refExceptId");
        _refExceptId = refExceptId;
    }

    /**
     * [get] EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} <br />
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        checkSpecifiedProperty("exceptId");
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {NotNull, NUMBER(16), FK to SYNONYM_EXCEPT} <br />
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        registerModifiedProperty("exceptId");
        _exceptId = exceptId;
    }
}
