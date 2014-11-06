package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_compound_pk as TABLE. <br />
 * <pre>
 * [primary-key]
 *     pk_first_id, pk_second_id
 * 
 * [column]
 *     pk_first_id, pk_second_id, pk_name
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
 *     white_compound_pk_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whiteCompoundPkRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer pkFirstId = entity.getPkFirstId();
 * Integer pkSecondId = entity.getPkSecondId();
 * String pkName = entity.getPkName();
 * entity.setPkFirstId(pkFirstId);
 * entity.setPkSecondId(pkSecondId);
 * entity.setPkName(pkName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPk extends AbstractEntity {

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
    /** pk_first_id: {PK, NotNull, int4(10)} */
    protected Integer _pkFirstId;

    /** pk_second_id: {PK, NotNull, int4(10)} */
    protected Integer _pkSecondId;

    /** pk_name: {NotNull, varchar(200)} */
    protected String _pkName;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPk";
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
        if (getPkFirstId() == null) { return false; }
        if (getPkSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'. */
    protected List<WhiteCompoundPkRef> _whiteCompoundPkRefList;

    /**
     * [get] white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'.
     * @return The entity list of referrer property 'whiteCompoundPkRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteCompoundPkRef> getWhiteCompoundPkRefList() {
        if (_whiteCompoundPkRefList == null) { _whiteCompoundPkRefList = newReferrerList(); }
        return _whiteCompoundPkRefList;
    }

    /**
     * [set] white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'.
     * @param whiteCompoundPkRefList The entity list of referrer property 'whiteCompoundPkRefList'. (NullAllowed)
     */
    public void setWhiteCompoundPkRefList(List<WhiteCompoundPkRef> whiteCompoundPkRefList) {
        _whiteCompoundPkRefList = whiteCompoundPkRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteCompoundPk) {
            BsWhiteCompoundPk other = (BsWhiteCompoundPk)obj;
            if (!xSV(_pkFirstId, other._pkFirstId)) { return false; }
            if (!xSV(_pkSecondId, other._pkSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _pkFirstId);
        hs = xCH(hs, _pkSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefList != null) { for (WhiteCompoundPkRef et : _whiteCompoundPkRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteCompoundPkRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_pkFirstId));
        sb.append(dm).append(xfND(_pkSecondId));
        sb.append(dm).append(xfND(_pkName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPkRefList != null && !_whiteCompoundPkRefList.isEmpty())
        { sb.append(dm).append("whiteCompoundPkRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPk clone() {
        return (WhiteCompoundPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] pk_first_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'pk_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkFirstId() {
        checkSpecifiedProperty("pkFirstId");
        return _pkFirstId;
    }

    /**
     * [set] pk_first_id: {PK, NotNull, int4(10)} <br />
     * @param pkFirstId The value of the column 'pk_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setPkFirstId(Integer pkFirstId) {
        registerModifiedProperty("pkFirstId");
        _pkFirstId = pkFirstId;
    }

    /**
     * [get] pk_second_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'pk_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPkSecondId() {
        checkSpecifiedProperty("pkSecondId");
        return _pkSecondId;
    }

    /**
     * [set] pk_second_id: {PK, NotNull, int4(10)} <br />
     * @param pkSecondId The value of the column 'pk_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setPkSecondId(Integer pkSecondId) {
        registerModifiedProperty("pkSecondId");
        _pkSecondId = pkSecondId;
    }

    /**
     * [get] pk_name: {NotNull, varchar(200)} <br />
     * @return The value of the column 'pk_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPkName() {
        checkSpecifiedProperty("pkName");
        return _pkName;
    }

    /**
     * [set] pk_name: {NotNull, varchar(200)} <br />
     * @param pkName The value of the column 'pk_name'. (basically NotNull if update: for the constraint)
     */
    public void setPkName(String pkName) {
        registerModifiedProperty("pkName");
        _pkName = pkName;
    }
}
