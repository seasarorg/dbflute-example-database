package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of SYNONYM_EXCEPT as SYNONYM. <br />
 * <pre>
 * [primary-key]
 *     EXCEPT_ID
 * 
 * [column]
 *     EXCEPT_ID, EXCEPT_NAME
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
 *     SYNONYM_REF_EXCEPT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     synonymRefExceptList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long exceptId = entity.getExceptId();
 * String exceptName = entity.getExceptName();
 * entity.setExceptId(exceptId);
 * entity.setExceptName(exceptName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsSynonymExcept extends AbstractEntity {

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
    /** EXCEPT_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _exceptId;

    /** EXCEPT_NAME: {VARCHAR2(256)} */
    protected String _exceptName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "SYNONYM_EXCEPT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "synonymExcept";
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
        if (getExceptId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'. */
    protected List<SynonymRefExcept> _synonymRefExceptList;

    /**
     * [get] SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * @return The entity list of referrer property 'synonymRefExceptList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymRefExcept> getSynonymRefExceptList() {
        if (_synonymRefExceptList == null) { _synonymRefExceptList = newReferrerList(); }
        return _synonymRefExceptList;
    }

    /**
     * [set] SYNONYM_REF_EXCEPT by EXCEPT_ID, named 'synonymRefExceptList'.
     * @param synonymRefExceptList The entity list of referrer property 'synonymRefExceptList'. (NullAllowed)
     */
    public void setSynonymRefExceptList(List<SynonymRefExcept> synonymRefExceptList) {
        _synonymRefExceptList = synonymRefExceptList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSynonymExcept) {
            BsSynonymExcept other = (BsSynonymExcept)obj;
            if (!xSV(_exceptId, other._exceptId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _exceptId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_synonymRefExceptList != null) { for (SynonymRefExcept et : _synonymRefExceptList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "synonymRefExceptList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_exceptId));
        sb.append(dm).append(xfND(_exceptName));
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
        if (_synonymRefExceptList != null && !_synonymRefExceptList.isEmpty())
        { sb.append(dm).append("synonymRefExceptList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public SynonymExcept clone() {
        return (SynonymExcept)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'EXCEPT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getExceptId() {
        checkSpecifiedProperty("exceptId");
        return _exceptId;
    }

    /**
     * [set] EXCEPT_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param exceptId The value of the column 'EXCEPT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setExceptId(Long exceptId) {
        registerModifiedProperty("exceptId");
        _exceptId = exceptId;
    }

    /**
     * [get] EXCEPT_NAME: {VARCHAR2(256)} <br />
     * @return The value of the column 'EXCEPT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getExceptName() {
        checkSpecifiedProperty("exceptName");
        return _exceptName;
    }

    /**
     * [set] EXCEPT_NAME: {VARCHAR2(256)} <br />
     * @param exceptName The value of the column 'EXCEPT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExceptName(String exceptName) {
        registerModifiedProperty("exceptName");
        _exceptName = exceptName;
    }
}
