package com.example.dbflute.db2.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.db2.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.db2.dbflute.allcommon.CDef;
import com.example.dbflute.db2.dbflute.exentity.*;

/**
 * The entity of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * 会員のステータスを示す固定的なマスタテーブル。いわゆるテーブル区分値！
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 * 
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     ALIAS_MEMBER, ALIAS_MEMBER_LOGIN, MEMBER, MEMBER_LOGIN
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     aliasMemberList, aliasMemberLoginList, memberList, memberLoginList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberStatus implements Entity, Serializable, Cloneable {

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
    /** (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected String _memberStatusName;

    /** (説明)DESCRIPTION: {NotNull, VARCHAR(200)} */
    protected String _description;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
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
        return "MEMBER_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberStatus";
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
        if (getMemberStatusCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * FORMALIZED: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * FORMALIZED: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * WITHDRAWAL: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * PROVISIONAL: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** ALIAS_MEMBER by MEMBER_STATUS_CODE, named 'aliasMemberList'. */
    protected List<AliasMember> _aliasMemberList;

    /**
     * ALIAS_MEMBER by MEMBER_STATUS_CODE, named 'aliasMemberList'.
     * @return The entity list of referrer property 'aliasMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<AliasMember> getAliasMemberList() {
        if (_aliasMemberList == null) { _aliasMemberList = newReferrerList(); }
        return _aliasMemberList;
    }

    /**
     * ALIAS_MEMBER by MEMBER_STATUS_CODE, named 'aliasMemberList'.
     * @param aliasMemberList The entity list of referrer property 'aliasMemberList'. (NullAllowed)
     */
    public void setAliasMemberList(List<AliasMember> aliasMemberList) {
        _aliasMemberList = aliasMemberList;
    }

    /** ALIAS_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'aliasMemberLoginList'. */
    protected List<AliasMemberLogin> _aliasMemberLoginList;

    /**
     * ALIAS_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'aliasMemberLoginList'.
     * @return The entity list of referrer property 'aliasMemberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<AliasMemberLogin> getAliasMemberLoginList() {
        if (_aliasMemberLoginList == null) { _aliasMemberLoginList = newReferrerList(); }
        return _aliasMemberLoginList;
    }

    /**
     * ALIAS_MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'aliasMemberLoginList'.
     * @param aliasMemberLoginList The entity list of referrer property 'aliasMemberLoginList'. (NullAllowed)
     */
    public void setAliasMemberLoginList(List<AliasMemberLogin> aliasMemberLoginList) {
        _aliasMemberLoginList = aliasMemberLoginList;
    }

    /** (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'. */
    protected List<Member> _memberList;

    /**
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The entity list of referrer property 'memberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Member> getMemberList() {
        if (_memberList == null) { _memberList = newReferrerList(); }
        return _memberList;
    }

    /**
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @param memberList The entity list of referrer property 'memberList'. (NullAllowed)
     */
    public void setMemberList(List<Member> memberList) {
        _memberList = memberList;
    }

    /** (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
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
     * @param other The other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMemberStatus)) { return false; }
        BsMemberStatus otherEntity = (BsMemberStatus)other;
        if (!xSV(getMemberStatusCode(), otherEntity.getMemberStatusCode())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getMemberStatusCode());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
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
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_aliasMemberList != null) { for (Entity e : _aliasMemberList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "aliasMemberList")); } } }
        if (_aliasMemberLoginList != null) { for (Entity e : _aliasMemberLoginList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "aliasMemberLoginList")); } } }
        if (_memberList != null) { for (Entity e : _memberList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberList")); } } }
        if (_memberLoginList != null) { for (Entity e : _memberLoginList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "memberLoginList")); } } }
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
        sb.append(delimiter).append(getMemberStatusCode());
        sb.append(delimiter).append(getMemberStatusName());
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
        if (_aliasMemberList != null && !_aliasMemberList.isEmpty())
        { sb.append(c).append("aliasMemberList"); }
        if (_aliasMemberLoginList != null && !_aliasMemberLoginList.isEmpty())
        { sb.append(c).append("aliasMemberLoginList"); }
        if (_memberList != null && !_memberList.isEmpty())
        { sb.append(c).append("memberList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(c).append("memberLoginList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public MemberStatus clone() {
        try {
            return (MemberStatus)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * 会員ステータスを識別するコード。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * 会員ステータスを識別するコード。
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * 表示用の名称。
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * 表示用の名称。
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.addPropertyName("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * 会員ステータスそれぞれの説明。<br />
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * 会員ステータスそれぞれの説明。<br />
     * 区分値の一つ一つの要素に気の利いた説明があるとディベロッパーがとても助かるので絶対に欲しい。
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        __modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        this._displayOrder = displayOrder;
    }
}