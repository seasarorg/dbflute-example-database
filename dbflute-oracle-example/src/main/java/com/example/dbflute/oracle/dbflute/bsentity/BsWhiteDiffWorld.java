package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_DIFF_WORLD as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DIFF_WORLD_ID
 * 
 * [column]
 *     DIFF_WORLD_ID, DIFF_WORLD_NAME
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
 * Long diffWorldId = entity.getDiffWorldId();
 * String diffWorldName = entity.getDiffWorldName();
 * entity.setDiffWorldId(diffWorldId);
 * entity.setDiffWorldName(diffWorldName);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteDiffWorld extends AbstractEntity implements DomainEntity {

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
    /** DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _diffWorldId;

    /** DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} */
    protected String _diffWorldName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_DIFF_WORLD";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteDiffWorld";
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
        if (getDiffWorldId() == null) { return false; }
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
        if (obj instanceof BsWhiteDiffWorld) {
            BsWhiteDiffWorld other = (BsWhiteDiffWorld)obj;
            if (!xSV(_diffWorldId, other._diffWorldId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _diffWorldId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_diffWorldId));
        sb.append(dm).append(xfND(_diffWorldName));
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
    public WhiteDiffWorld clone() {
        return (WhiteDiffWorld)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'DIFF_WORLD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDiffWorldId() {
        checkSpecifiedProperty("diffWorldId");
        return _diffWorldId;
    }

    /**
     * [set] DIFF_WORLD_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param diffWorldId The value of the column 'DIFF_WORLD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDiffWorldId(Long diffWorldId) {
        registerModifiedProperty("diffWorldId");
        _diffWorldId = diffWorldId;
    }

    /**
     * [get] DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br />
     * @return The value of the column 'DIFF_WORLD_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getDiffWorldName() {
        checkSpecifiedProperty("diffWorldName");
        return _diffWorldName;
    }

    /**
     * [set] DIFF_WORLD_NAME: {NotNull, VARCHAR2(50)} <br />
     * @param diffWorldName The value of the column 'DIFF_WORLD_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setDiffWorldName(String diffWorldName) {
        registerModifiedProperty("diffWorldName");
        _diffWorldName = diffWorldName;
    }
}
