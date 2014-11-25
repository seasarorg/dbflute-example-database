package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.DomainEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of white_compound_pk_ref as TABLE. <br />
 * <pre>
 * [primary-key]
 *     multiple_first_id, multiple_second_id
 * 
 * [column]
 *     multiple_first_id, multiple_second_id, ref_first_id, ref_second_id
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
 *     white_compound_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteCompoundPk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer multipleFirstId = entity.getMultipleFirstId();
 * Integer multipleSecondId = entity.getMultipleSecondId();
 * Integer refFirstId = entity.getRefFirstId();
 * Integer refSecondId = entity.getRefSecondId();
 * entity.setMultipleFirstId(multipleFirstId);
 * entity.setMultipleSecondId(multipleSecondId);
 * entity.setRefFirstId(refFirstId);
 * entity.setRefSecondId(refSecondId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkRef extends AbstractEntity implements DomainEntity {

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
    /** multiple_first_id: {PK, NotNull, int4(10)} */
    protected Integer _multipleFirstId;

    /** multiple_second_id: {PK, NotNull, int4(10)} */
    protected Integer _multipleSecondId;

    /** ref_first_id: {NotNull, int4(10), FK to white_compound_pk} */
    protected Integer _refFirstId;

    /** ref_second_id: {NotNull, int4(10), FK to white_compound_pk} */
    protected Integer _refSecondId;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "white_compound_pk_ref";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "whiteCompoundPkRef";
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
        if (getMultipleFirstId() == null) { return false; }
        if (getMultipleSecondId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'. */
    protected WhiteCompoundPk _whiteCompoundPk;

    /**
     * [get] white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @return The entity of foreign property 'whiteCompoundPk'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WhiteCompoundPk getWhiteCompoundPk() {
        return _whiteCompoundPk;
    }

    /**
     * [set] white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @param whiteCompoundPk The entity of foreign property 'whiteCompoundPk'. (NullAllowed)
     */
    public void setWhiteCompoundPk(WhiteCompoundPk whiteCompoundPk) {
        _whiteCompoundPk = whiteCompoundPk;
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
        if (obj instanceof BsWhiteCompoundPkRef) {
            BsWhiteCompoundPkRef other = (BsWhiteCompoundPkRef)obj;
            if (!xSV(_multipleFirstId, other._multipleFirstId)) { return false; }
            if (!xSV(_multipleSecondId, other._multipleSecondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _multipleFirstId);
        hs = xCH(hs, _multipleSecondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null)
        { sb.append(li).append(xbRDS(_whiteCompoundPk, "whiteCompoundPk")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_multipleFirstId));
        sb.append(dm).append(xfND(_multipleSecondId));
        sb.append(dm).append(xfND(_refFirstId));
        sb.append(dm).append(xfND(_refSecondId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteCompoundPk != null)
        { sb.append(dm).append("whiteCompoundPk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteCompoundPkRef clone() {
        return (WhiteCompoundPkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] multiple_first_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'multiple_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleFirstId() {
        checkSpecifiedProperty("multipleFirstId");
        return _multipleFirstId;
    }

    /**
     * [set] multiple_first_id: {PK, NotNull, int4(10)} <br />
     * @param multipleFirstId The value of the column 'multiple_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleFirstId(Integer multipleFirstId) {
        registerModifiedProperty("multipleFirstId");
        _multipleFirstId = multipleFirstId;
    }

    /**
     * [get] multiple_second_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'multiple_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMultipleSecondId() {
        checkSpecifiedProperty("multipleSecondId");
        return _multipleSecondId;
    }

    /**
     * [set] multiple_second_id: {PK, NotNull, int4(10)} <br />
     * @param multipleSecondId The value of the column 'multiple_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setMultipleSecondId(Integer multipleSecondId) {
        registerModifiedProperty("multipleSecondId");
        _multipleSecondId = multipleSecondId;
    }

    /**
     * [get] ref_first_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @return The value of the column 'ref_first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefFirstId() {
        checkSpecifiedProperty("refFirstId");
        return _refFirstId;
    }

    /**
     * [set] ref_first_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @param refFirstId The value of the column 'ref_first_id'. (basically NotNull if update: for the constraint)
     */
    public void setRefFirstId(Integer refFirstId) {
        registerModifiedProperty("refFirstId");
        _refFirstId = refFirstId;
    }

    /**
     * [get] ref_second_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @return The value of the column 'ref_second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRefSecondId() {
        checkSpecifiedProperty("refSecondId");
        return _refSecondId;
    }

    /**
     * [set] ref_second_id: {NotNull, int4(10), FK to white_compound_pk} <br />
     * @param refSecondId The value of the column 'ref_second_id'. (basically NotNull if update: for the constraint)
     */
    public void setRefSecondId(Integer refSecondId) {
        registerModifiedProperty("refSecondId");
        _refSecondId = refSecondId;
    }
}
