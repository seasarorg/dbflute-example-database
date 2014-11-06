package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_same_name_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_ref_id
 * 
 * [column]
 *     same_name_ref_id, same_name_id, next_same_name_id
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
 *     white_same_name
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSameName
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sameNameRefId = entity.getSameNameRefId();
 * Long sameNameId = entity.getSameNameId();
 * Long nextSameNameId = entity.getNextSameNameId();
 * entity.setSameNameRefId(sameNameRefId);
 * entity.setSameNameId(sameNameId);
 * entity.setNextSameNameId(nextSameNameId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameRef extends AbstractEntity {

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
    /** same_name_ref_id: {PK, NotNull, int4(10)} */
    protected Integer _sameNameRefId;

    /** same_name_id: {NotNull, int8(19), FK to white_same_name} */
    protected Long _sameNameId;

    /** next_same_name_id: {NotNull, int8(19)} */
    protected Long _nextSameNameId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_same_name_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameNameRef";
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
        if (getSameNameRefId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_same_name by my same_name_id, named 'whiteSameName'. */
    protected WhiteSameName _whiteSameName;

    /**
     * [get] white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The entity of foreign property 'whiteSameName'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteSameName getWhiteSameName() {
        return _whiteSameName;
    }

    /**
     * [set] white_same_name by my same_name_id, named 'whiteSameName'.
     * @param whiteSameName The entity of foreign property 'whiteSameName'. (NullAllowed)
     */
    public void setWhiteSameName(WhiteSameName whiteSameName) {
        _whiteSameName = whiteSameName;
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
        if (obj instanceof BsWhiteSameNameRef) {
            BsWhiteSameNameRef other = (BsWhiteSameNameRef)obj;
            if (!xSV(_sameNameRefId, other._sameNameRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _sameNameRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameName != null)
        { sb.append(li).append(xbRDS(_whiteSameName, "whiteSameName")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sameNameRefId));
        sb.append(dm).append(xfND(_sameNameId));
        sb.append(dm).append(xfND(_nextSameNameId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameName != null)
        { sb.append(dm).append("whiteSameName"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSameNameRef clone() {
        return (WhiteSameNameRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_ref_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'same_name_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameRefId() {
        checkSpecifiedProperty("sameNameRefId");
        return _sameNameRefId;
    }

    /**
     * [set] same_name_ref_id: {PK, NotNull, int4(10)} <br />
     * @param sameNameRefId The value of the column 'same_name_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameRefId(Integer sameNameRefId) {
        registerModifiedProperty("sameNameRefId");
        _sameNameRefId = sameNameRefId;
    }

    /**
     * [get] same_name_id: {NotNull, int8(19), FK to white_same_name} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {NotNull, int8(19), FK to white_same_name} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        registerModifiedProperty("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] next_same_name_id: {NotNull, int8(19)} <br />
     * @return The value of the column 'next_same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextSameNameId() {
        checkSpecifiedProperty("nextSameNameId");
        return _nextSameNameId;
    }

    /**
     * [set] next_same_name_id: {NotNull, int8(19)} <br />
     * @param nextSameNameId The value of the column 'next_same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setNextSameNameId(Long nextSameNameId) {
        registerModifiedProperty("nextSameNameId");
        _nextSameNameId = nextSameNameId;
    }
}
