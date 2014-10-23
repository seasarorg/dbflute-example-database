package com.example.dbflute.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import com.example.dbflute.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The entity of (会員退会情報)member_withdrawal as TABLE. <br />
 * 退会会員の退会に関する詳細な情報。<br />
 * 退会会員のみデータが存在する。（"1 : 0...1" のパターンの one-to-one）<br />
 * 共通カラムがあってバージョンNOがないパターン。基本的に更新が入ることはないが、登録ユーザを保持したいのと、重要なデータなので更新系の情報も。
 * <pre>
 * [primary-key]
 *     member_id
 * 
 * [column]
 *     member_id, withdrawal_reason_code, withdrawal_reason_input_text, withdrawal_datetime, register_datetime, register_process, register_user, update_datetime, update_process, update_user
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
 *     member, withdrawal_reason
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, withdrawalReason
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonInputText = entity.getWithdrawalReasonInputText();
 * java.sql.Timestamp withdrawalDatetime = entity.getWithdrawalDatetime();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * entity.setMemberId(memberId);
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonInputText(withdrawalReasonInputText);
 * entity.setWithdrawalDatetime(withdrawalDatetime);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterProcess(registerProcess);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateProcess(updateProcess);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberWithdrawal extends AbstractEntity implements EntityDefinedCommonColumn {

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
    /** member_id: {PK, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason} */
    protected String _withdrawalReasonCode;

    /** (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)} */
    protected String _withdrawalReasonInputText;

    /** (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _withdrawalDatetime;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _registerDatetime;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.sql.Timestamp _updateDatetime;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "member_withdrawal";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberWithdrawal";
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
        if (getMemberId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)member by my member_id, named 'member'. */
    protected Member _member;

    /**
     * [get] (会員)member by my member_id, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * [set] (会員)member by my member_id, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
    }

    /** (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'. */
    protected WithdrawalReason _withdrawalReason;

    /**
     * [get] (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @return The entity of foreign property 'withdrawalReason'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public WithdrawalReason getWithdrawalReason() {
        return _withdrawalReason;
    }

    /**
     * [set] (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @param withdrawalReason The entity of foreign property 'withdrawalReason'. (NullAllowed)
     */
    public void setWithdrawalReason(WithdrawalReason withdrawalReason) {
        _withdrawalReason = withdrawalReason;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMemberWithdrawal) {
            BsMemberWithdrawal other = (BsMemberWithdrawal)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_withdrawalReason != null)
        { sb.append(li).append(xbRDS(_withdrawalReason, "withdrawalReason")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_withdrawalReasonCode));
        sb.append(dm).append(xfND(_withdrawalReasonInputText));
        sb.append(dm).append(xfND(_withdrawalDatetime));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null) { sb.append(dm).append("member"); }
        if (_withdrawalReason != null) { sb.append(dm).append("withdrawalReason"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberWithdrawal clone() {
        return (MemberWithdrawal)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] member_id: {PK, NotNull, int4(10), FK to member} <br />
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] member_id: {PK, NotNull, int4(10), FK to member} <br />
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason} <br />
     * 退会した定型理由を参照するコード。<br />
     * 何も言わずに退会する会員もいるので必須項目ではない。
     * @return The value of the column 'withdrawal_reason_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getWithdrawalReasonCode() {
        checkSpecifiedProperty("withdrawalReasonCode");
        return _withdrawalReasonCode;
    }

    /**
     * [set] (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason} <br />
     * 退会した定型理由を参照するコード。<br />
     * 何も言わずに退会する会員もいるので必須項目ではない。
     * @param withdrawalReasonCode The value of the column 'withdrawal_reason_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.addPropertyName("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)} <br />
     * 会員がフリーテキストで入力できる退会理由。<br />
     * もう言いたいこと言ってもらう感じ。<br />
     * サイト運営側としては真摯に受け止めて改善していきたい。
     * @return The value of the column 'withdrawal_reason_input_text'. (NullAllowed even if selected: for no constraint)
     */
    public String getWithdrawalReasonInputText() {
        checkSpecifiedProperty("withdrawalReasonInputText");
        return _withdrawalReasonInputText;
    }

    /**
     * [set] (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)} <br />
     * 会員がフリーテキストで入力できる退会理由。<br />
     * もう言いたいこと言ってもらう感じ。<br />
     * サイト運営側としては真摯に受け止めて改善していきたい。
     * @param withdrawalReasonInputText The value of the column 'withdrawal_reason_input_text'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWithdrawalReasonInputText(String withdrawalReasonInputText) {
        __modifiedProperties.addPropertyName("withdrawalReasonInputText");
        _withdrawalReasonInputText = withdrawalReasonInputText;
    }

    /**
     * [get] (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)} <br />
     * 退会した瞬間の日時。<br />
     * 正式会員日時と違い、こっちはone-to-oneの別テーブルで。
     * @return The value of the column 'withdrawal_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getWithdrawalDatetime() {
        checkSpecifiedProperty("withdrawalDatetime");
        return _withdrawalDatetime;
    }

    /**
     * [set] (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)} <br />
     * 退会した瞬間の日時。<br />
     * 正式会員日時と違い、こっちはone-to-oneの別テーブルで。
     * @param withdrawalDatetime The value of the column 'withdrawal_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalDatetime(java.sql.Timestamp withdrawalDatetime) {
        __modifiedProperties.addPropertyName("withdrawalDatetime");
        _withdrawalDatetime = withdrawalDatetime;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(200)} <br />
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        __modifiedProperties.addPropertyName("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br />
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br />
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_process: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(200)} <br />
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        __modifiedProperties.addPropertyName("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br />
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br />
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }
}
