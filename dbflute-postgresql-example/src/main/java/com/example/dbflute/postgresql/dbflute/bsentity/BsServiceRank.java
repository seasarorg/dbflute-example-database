package com.example.dbflute.postgresql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.allcommon.CDef;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (サービスランク)service_rank as TABLE. <br />
 * 会員のサービスレベルを表現するランク。<br />
 * （ゴールドとかプラチナとか）
 * <pre>
 * [primary-key]
 *     service_rank_code
 * 
 * [column]
 *     service_rank_code, service_rank_name, service_point_incidence, new_acceptable_flg, description, display_order
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
 *     member_service
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberServiceList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String serviceRankCode = entity.getServiceRankCode();
 * String serviceRankName = entity.getServiceRankName();
 * java.math.BigDecimal servicePointIncidence = entity.getServicePointIncidence();
 * Integer newAcceptableFlg = entity.getNewAcceptableFlg();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setServiceRankName(serviceRankName);
 * entity.setServicePointIncidence(servicePointIncidence);
 * entity.setNewAcceptableFlg(newAcceptableFlg);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsServiceRank implements Entity, Serializable, Cloneable {

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
    /** (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} */
    protected String _serviceRankCode;

    /** (サービスランク名称)service_rank_name: {NotNull, varchar(50)} */
    protected String _serviceRankName;

    /** (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)} */
    protected java.math.BigDecimal _servicePointIncidence;

    /** (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} */
    protected Integer _newAcceptableFlg;

    /** (説明)description: {NotNull, varchar(200)} */
    protected String _description;

    /** (表示順)display_order: {UQ, NotNull, int4(10)} */
    protected Integer _displayOrder;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "service_rank";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "serviceRank";
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
        if (getServiceRankCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getNewAcceptableFlgAsFlg() {
        return CDef.Flg.codeOf(getNewAcceptableFlg());
    }

    /**
     * Set the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setNewAcceptableFlgAsFlg(CDef.Flg cdef) {
        setNewAcceptableFlg(cdef != null ? FunCustodial.toNumber(cdef.code(), Integer.class) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of newAcceptableFlg as True (1). <br />
     * Yes: means valid
     */
    public void setNewAcceptableFlg_True() {
        setNewAcceptableFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of newAcceptableFlg as False (0). <br />
     * No: means invalid
     */
    public void setNewAcceptableFlg_False() {
        setNewAcceptableFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of newAcceptableFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgTrue() {
        CDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of newAcceptableFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isNewAcceptableFlgFalse() {
        CDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'newAcceptableFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getNewAcceptableFlgName() {
        CDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'newAcceptableFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getNewAcceptableFlgAlias() {
        CDef.Flg cdef = getNewAcceptableFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員サービス)member_service by service_rank_code, named 'memberServiceList'. */
    protected List<MemberService> _memberServiceList;

    /**
     * (会員サービス)member_service by service_rank_code, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberService> getMemberServiceList() {
        if (_memberServiceList == null) { _memberServiceList = newReferrerList(); }
        return _memberServiceList;
    }

    /**
     * (会員サービス)member_service by service_rank_code, named 'memberServiceList'.
     * @param memberServiceList The entity list of referrer property 'memberServiceList'. (NullAllowed)
     */
    public void setMemberServiceList(List<MemberService> memberServiceList) {
        _memberServiceList = memberServiceList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsServiceRank)) { return false; }
        BsServiceRank other = (BsServiceRank)obj;
        if (!xSV(getServiceRankCode(), other.getServiceRankCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) {
        return FunCustodial.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getServiceRankCode());
        return result;
    }
    protected int xCH(int result, Object value) {
        return FunCustodial.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_memberServiceList != null) { for (Entity e : _memberServiceList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberServiceList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getServiceRankCode());
        sb.append(delimiter).append(getServiceRankName());
        sb.append(delimiter).append(getServicePointIncidence());
        sb.append(delimiter).append(getNewAcceptableFlg());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getDisplayOrder());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_memberServiceList != null && !_memberServiceList.isEmpty())
        { sb.append(c).append("memberServiceList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public ServiceRank clone() {
        try {
            return (ServiceRank)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} <br />
     * サービスランクを識別するコード。
     * @return The value of the column 'service_rank_code'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankCode() {
        return _serviceRankCode;
    }

    /**
     * [set] (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} <br />
     * サービスランクを識別するコード。
     * @param serviceRankCode The value of the column 'service_rank_code'. (basically NotNull if update: for the constraint)
     */
    public void setServiceRankCode(String serviceRankCode) {
        __modifiedProperties.addPropertyName("serviceRankCode");
        this._serviceRankCode = serviceRankCode;
    }

    /**
     * [get] (サービスランク名称)service_rank_name: {NotNull, varchar(50)} <br />
     * サービスランクの名称。<br />
     * （ゴールドとかプラチナとか基本的には威厳のある名前）
     * @return The value of the column 'service_rank_name'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankName() {
        return _serviceRankName;
    }

    /**
     * [set] (サービスランク名称)service_rank_name: {NotNull, varchar(50)} <br />
     * サービスランクの名称。<br />
     * （ゴールドとかプラチナとか基本的には威厳のある名前）
     * @param serviceRankName The value of the column 'service_rank_name'. (basically NotNull if update: for the constraint)
     */
    public void setServiceRankName(String serviceRankName) {
        __modifiedProperties.addPropertyName("serviceRankName");
        this._serviceRankName = serviceRankName;
    }

    /**
     * [get] (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)} <br />
     * 購入ごとのサービスポイントの発生率。<br />
     * 購入価格にこの値をかけた数が発生ポイント。<br />
     * ExampleDBとして数少ない貴重な小数点ありのカラム。
     * @return The value of the column 'service_point_incidence'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getServicePointIncidence() {
        return _servicePointIncidence;
    }

    /**
     * [set] (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)} <br />
     * 購入ごとのサービスポイントの発生率。<br />
     * 購入価格にこの値をかけた数が発生ポイント。<br />
     * ExampleDBとして数少ない貴重な小数点ありのカラム。
     * @param servicePointIncidence The value of the column 'service_point_incidence'. (basically NotNull if update: for the constraint)
     */
    public void setServicePointIncidence(java.math.BigDecimal servicePointIncidence) {
        __modifiedProperties.addPropertyName("servicePointIncidence");
        this._servicePointIncidence = servicePointIncidence;
    }

    /**
     * [get] (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * このランクへの新規受け入れができるかどうか。
     * @return The value of the column 'new_acceptable_flg'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNewAcceptableFlg() {
        return _newAcceptableFlg;
    }

    /**
     * [set] (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br />
     * このランクへの新規受け入れができるかどうか。
     * @param newAcceptableFlg The value of the column 'new_acceptable_flg'. (basically NotNull if update: for the constraint)
     */
    protected void setNewAcceptableFlg(Integer newAcceptableFlg) {
        __modifiedProperties.addPropertyName("newAcceptableFlg");
        this._newAcceptableFlg = newAcceptableFlg;
    }

    /**
     * [get] (説明)description: {NotNull, varchar(200)} <br />
     * ランクに関する業務的な説明。
     * @return The value of the column 'description'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * [set] (説明)description: {NotNull, varchar(200)} <br />
     * ランクに関する業務的な説明。
     * @param description The value of the column 'description'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        __modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /**
     * [get] (表示順)display_order: {UQ, NotNull, int4(10)} <br />
     * UI上の表示順を表現する番号。
     * @return The value of the column 'display_order'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] (表示順)display_order: {UQ, NotNull, int4(10)} <br />
     * UI上の表示順を表現する番号。
     * @param displayOrder The value of the column 'display_order'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        this._displayOrder = displayOrder;
    }
}
