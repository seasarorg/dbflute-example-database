package com.example.dbflute.oracle.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.dbmeta.accessory.MappingValueType;
import com.example.dbflute.oracle.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The entity of WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 * 
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL, SYNONYM_MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberWithdrawalList, synonymMemberWithdrawalList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonText = entity.getWithdrawalReasonText();
 * Long displayOrder = entity.getDisplayOrder();
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonText(withdrawalReasonText);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author oracleman
 */
public abstract class BsWithdrawalReason extends AbstractEntity {

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
    /** WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} */
    protected String _withdrawalReasonCode;

    /** WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} */
    protected String _withdrawalReasonText;

    /** DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} */
    protected Long _displayOrder;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "WITHDRAWAL_REASON";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "withdrawalReason";
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
        if (getWithdrawalReasonCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, NUMBER(16). (NotNull)
     */
    public void uniqueBy(Long displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'. */
    protected List<MemberWithdrawal> _memberWithdrawalList;

    /**
     * [get] MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The entity list of referrer property 'memberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberWithdrawal> getMemberWithdrawalList() {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = newReferrerList(); }
        return _memberWithdrawalList;
    }

    /**
     * [set] MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @param memberWithdrawalList The entity list of referrer property 'memberWithdrawalList'. (NullAllowed)
     */
    public void setMemberWithdrawalList(List<MemberWithdrawal> memberWithdrawalList) {
        _memberWithdrawalList = memberWithdrawalList;
    }

    /** SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'. */
    protected List<SynonymMemberWithdrawal> _synonymMemberWithdrawalList;

    /**
     * [get] SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * @return The entity list of referrer property 'synonymMemberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SynonymMemberWithdrawal> getSynonymMemberWithdrawalList() {
        if (_synonymMemberWithdrawalList == null) { _synonymMemberWithdrawalList = newReferrerList(); }
        return _synonymMemberWithdrawalList;
    }

    /**
     * [set] SYNONYM_MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'synonymMemberWithdrawalList'.
     * @param synonymMemberWithdrawalList The entity list of referrer property 'synonymMemberWithdrawalList'. (NullAllowed)
     */
    public void setSynonymMemberWithdrawalList(List<SynonymMemberWithdrawal> synonymMemberWithdrawalList) {
        _synonymMemberWithdrawalList = synonymMemberWithdrawalList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWithdrawalReason) {
            BsWithdrawalReason other = (BsWithdrawalReason)obj;
            if (!xSV(_withdrawalReasonCode, other._withdrawalReasonCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _withdrawalReasonCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberWithdrawalList != null) { for (MemberWithdrawal et : _memberWithdrawalList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberWithdrawalList")); } } }
        if (_synonymMemberWithdrawalList != null) { for (SynonymMemberWithdrawal et : _synonymMemberWithdrawalList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "synonymMemberWithdrawalList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_withdrawalReasonCode));
        sb.append(dm).append(xfND(_withdrawalReasonText));
        sb.append(dm).append(xfND(_displayOrder));
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
        if (_memberWithdrawalList != null && !_memberWithdrawalList.isEmpty())
        { sb.append(dm).append("memberWithdrawalList"); }
        if (_synonymMemberWithdrawalList != null && !_synonymMemberWithdrawalList.isEmpty())
        { sb.append(dm).append("synonymMemberWithdrawalList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WithdrawalReason clone() {
        return (WithdrawalReason)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonCode() {
        checkSpecifiedProperty("withdrawalReasonCode");
        return _withdrawalReasonCode;
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.addPropertyName("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if selected: for the constraint)
     */
    @MappingValueType(keyName = "stringClobType")
    public String getWithdrawalReasonText() {
        checkSpecifiedProperty("withdrawalReasonText");
        return _withdrawalReasonText;
    }

    /**
     * [set] WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(4000)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        __modifiedProperties.addPropertyName("withdrawalReasonText");
        _withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Long getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, NUMBER(16)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Long displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }
}
