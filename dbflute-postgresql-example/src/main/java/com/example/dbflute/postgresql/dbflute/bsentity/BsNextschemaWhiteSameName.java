package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of nextschema.white_same_name as TABLE. <br />
 * <pre>
 * [primary-key]
 *     same_name_id
 * 
 * [column]
 *     same_name_id, same_name_name, same_name_long
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
 *     nextschema.white_same_name_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteSameNameRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sameNameId = entity.getSameNameId();
 * String sameNameName = entity.getSameNameName();
 * Long sameNameLong = entity.getSameNameLong();
 * entity.setSameNameId(sameNameId);
 * entity.setSameNameName(sameNameName);
 * entity.setSameNameLong(sameNameLong);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameName extends AbstractEntity {

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
    /** same_name_id: {PK, NotNull, int4(10)} */
    protected Integer _sameNameId;

    /** same_name_name: {varchar(100)} */
    protected String _sameNameName;

    /** same_name_long: {int8(19)} */
    protected Long _sameNameLong;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "nextschema.white_same_name";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteSameName";
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
        if (getSameNameId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'. */
    protected List<NextschemaWhiteSameNameRef> _whiteSameNameRefList;

    /**
     * [get] nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The entity list of referrer property 'whiteSameNameRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<NextschemaWhiteSameNameRef> getWhiteSameNameRefList() {
        if (_whiteSameNameRefList == null) { _whiteSameNameRefList = newReferrerList(); }
        return _whiteSameNameRefList;
    }

    /**
     * [set] nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @param whiteSameNameRefList The entity list of referrer property 'whiteSameNameRefList'. (NullAllowed)
     */
    public void setWhiteSameNameRefList(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        _whiteSameNameRefList = whiteSameNameRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsNextschemaWhiteSameName) {
            BsNextschemaWhiteSameName other = (BsNextschemaWhiteSameName)obj;
            if (!xSV(_sameNameId, other._sameNameId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _sameNameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameNameRefList != null) { for (NextschemaWhiteSameNameRef et : _whiteSameNameRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSameNameRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sameNameId));
        sb.append(dm).append(xfND(_sameNameName));
        sb.append(dm).append(xfND(_sameNameLong));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameNameRefList != null && !_whiteSameNameRefList.isEmpty())
        { sb.append(dm).append("whiteSameNameRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public NextschemaWhiteSameName clone() {
        return (NextschemaWhiteSameName)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {PK, NotNull, int4(10)} <br />
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Integer sameNameId) {
        __modifiedProperties.addPropertyName("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] same_name_name: {varchar(100)} <br />
     * @return The value of the column 'same_name_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getSameNameName() {
        checkSpecifiedProperty("sameNameName");
        return _sameNameName;
    }

    /**
     * [set] same_name_name: {varchar(100)} <br />
     * @param sameNameName The value of the column 'same_name_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameName(String sameNameName) {
        __modifiedProperties.addPropertyName("sameNameName");
        _sameNameName = sameNameName;
    }

    /**
     * [get] same_name_long: {int8(19)} <br />
     * @return The value of the column 'same_name_long'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSameNameLong() {
        checkSpecifiedProperty("sameNameLong");
        return _sameNameLong;
    }

    /**
     * [set] same_name_long: {int8(19)} <br />
     * @param sameNameLong The value of the column 'same_name_long'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameLong(Long sameNameLong) {
        __modifiedProperties.addPropertyName("sameNameLong");
        _sameNameLong = sameNameLong;
    }
}
