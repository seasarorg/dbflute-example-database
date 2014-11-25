package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WHITE_REF_TARGET as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REF_TARGET_ID
 * 
 * [column]
 *     REF_TARGET_ID, TARGET_ID
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
 *     WHITE_TARGET
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteTarget
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long refTargetId = entity.getRefTargetId();
 * Long targetId = entity.getTargetId();
 * entity.setRefTargetId(refTargetId);
 * entity.setTargetId(targetId);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWhiteRefTarget extends AbstractEntity implements DomainEntity {

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
    /** REF_TARGET_ID: {PK, NotNull, NUMBER(16)} */
    protected Long _refTargetId;

    /** TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} */
    protected Long _targetId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WHITE_REF_TARGET";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteRefTarget";
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
        if (getRefTargetId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_TARGET by my TARGET_ID, named 'whiteTarget'. */
    protected WhiteTarget _whiteTarget;

    /**
     * [get] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @return The entity of foreign property 'whiteTarget'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteTarget getWhiteTarget() {
        return _whiteTarget;
    }

    /**
     * [set] WHITE_TARGET by my TARGET_ID, named 'whiteTarget'.
     * @param whiteTarget The entity of foreign property 'whiteTarget'. (NullAllowed)
     */
    public void setWhiteTarget(WhiteTarget whiteTarget) {
        _whiteTarget = whiteTarget;
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
        if (obj instanceof BsWhiteRefTarget) {
            BsWhiteRefTarget other = (BsWhiteRefTarget)obj;
            if (!xSV(_refTargetId, other._refTargetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _refTargetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteTarget != null)
        { sb.append(li).append(xbRDS(_whiteTarget, "whiteTarget")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_refTargetId));
        sb.append(dm).append(xfND(_targetId));
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
        if (_whiteTarget != null)
        { sb.append(dm).append("whiteTarget"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteRefTarget clone() {
        return (WhiteRefTarget)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REF_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'REF_TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRefTargetId() {
        checkSpecifiedProperty("refTargetId");
        return _refTargetId;
    }

    /**
     * [set] REF_TARGET_ID: {PK, NotNull, NUMBER(16)} <br />
     * @param refTargetId The value of the column 'REF_TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRefTargetId(Long refTargetId) {
        registerModifiedProperty("refTargetId");
        _refTargetId = refTargetId;
    }

    /**
     * [get] TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} <br />
     * @return The value of the column 'TARGET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTargetId() {
        checkSpecifiedProperty("targetId");
        return _targetId;
    }

    /**
     * [set] TARGET_ID: {NotNull, NUMBER(16), FK to WHITE_TARGET} <br />
     * @param targetId The value of the column 'TARGET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTargetId(Long targetId) {
        registerModifiedProperty("targetId");
        _targetId = targetId;
    }
}
