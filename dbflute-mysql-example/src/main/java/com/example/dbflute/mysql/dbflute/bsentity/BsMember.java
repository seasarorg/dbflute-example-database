/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.dbflute.mysql.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import com.example.dbflute.mysql.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.mysql.dbflute.allcommon.CDef;
import com.example.dbflute.mysql.dbflute.exentity.*;
import com.example.dbflute.mysql.dbflute.nogen.cache.*;

/**
 * The entity of (会員)MEMBER as TABLE. <br />
 * 会員のプロフィールやアカウントなどの基本情報を保持する。<br />
 * 基本的に物理削除はなく、退会したらステータスが退会会員になる。<br />
 * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     member_status, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLoginStatus), member_security(AsOne), member_service(AsOne), member_withdrawal(AsOne)
 * 
 * [referrer table]
 *     member_address, member_login, purchase, member_security, member_service, member_withdrawal
 * 
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberAddressAsValidBefore, memberLoginAsLoginStatus, memberAddressAsIfComment, memberAddressAsOnlyOneDate, memberLoginAsLocalBindOverTest, memberLoginAsLocalForeignOverTest, memberLoginAsForeignForeignBindOverTest, memberLoginAsForeignForeignEachOverTest, memberLoginAsForeignForeignOptimizedBasicOverTest, memberLoginAsForeignForeignOptimizedMarkOverTest, memberLoginAsForeignForeignOptimizedPartOverTest, memberLoginAsForeignForeignOptimizedWholeOverTest, memberLoginAsForeignForeignParameterOverTest, memberLoginAsForeignForeignVariousOverTest, memberLoginAsReferrerOverTest, memberLoginAsReferrerForeignOverTest, memberAddressAsFormattedBasic, memberAddressAsFormattedLong, memberLoginAsFormattedMany, memberLoginAsEmbeddedCommentClassificationTest, memberLoginAsLatest, memberLoginAsOldest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember implements EntityDefinedCommonColumn, Serializable, Cloneable {

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
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} */
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} */
    protected String _memberName;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} */
    protected String _memberAccount;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** (生年月日)BIRTHDATE: {DATE(10)} */
    protected java.util.Date _birthdate;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _registerDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _updateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "member";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "member";
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

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String memberAccount) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br />
     * 会員ステータス: 会員の状態を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br />
     * 会員ステータス: 会員の状態を示す
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
     * 正式会員: 正式な会員を示す
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * 仮会員: 仮の会員を示す
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * 退会会員: 退会した会員を示す
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * 正式会員: 正式な会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * 仮会員: 仮の会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * 退会会員: 退会した会員を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'memberStatusCode' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeName() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'memberStatusCode' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getMemberStatusCodeAlias() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected MemberStatus _memberStatus;

    /**
     * [get] (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberStatus getMemberStatus() {
        if (_memberStatus == null) {
            _memberStatus = CachedMemberStatus.get(getMemberStatusCode());
        }
        return _memberStatus;
    }

    /**
     * [set] (会員ステータス)member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(MemberStatus memberStatus) {
        _memberStatus = memberStatus;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'. */
    protected MemberAddress _memberAddressAsValid;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @return The entity of foreign property 'memberAddressAsValid'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsValid() {
        return _memberAddressAsValid;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValid'.
     * @param memberAddressAsValid The entity of foreign property 'memberAddressAsValid'. (NullAllowed)
     */
    public void setMemberAddressAsValid(MemberAddress memberAddressAsValid) {
        _memberAddressAsValid = memberAddressAsValid;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'. */
    protected MemberAddress _memberAddressAsValidBefore;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @return The entity of foreign property 'memberAddressAsValidBefore'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsValidBefore() {
        return _memberAddressAsValidBefore;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsValidBefore'.
     * @param memberAddressAsValidBefore The entity of foreign property 'memberAddressAsValidBefore'. (NullAllowed)
     */
    public void setMemberAddressAsValidBefore(MemberAddress memberAddressAsValidBefore) {
        _memberAddressAsValidBefore = memberAddressAsValidBefore;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'. */
    protected MemberLogin _memberLoginAsLoginStatus;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @return The entity of foreign property 'memberLoginAsLoginStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLoginStatus() {
        return _memberLoginAsLoginStatus;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLoginStatus'.
     * @param memberLoginAsLoginStatus The entity of foreign property 'memberLoginAsLoginStatus'. (NullAllowed)
     */
    public void setMemberLoginAsLoginStatus(MemberLogin memberLoginAsLoginStatus) {
        _memberLoginAsLoginStatus = memberLoginAsLoginStatus;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'. */
    protected MemberAddress _memberAddressAsIfComment;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @return The entity of foreign property 'memberAddressAsIfComment'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsIfComment() {
        return _memberAddressAsIfComment;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsIfComment'.
     * @param memberAddressAsIfComment The entity of foreign property 'memberAddressAsIfComment'. (NullAllowed)
     */
    public void setMemberAddressAsIfComment(MemberAddress memberAddressAsIfComment) {
        _memberAddressAsIfComment = memberAddressAsIfComment;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'. */
    protected MemberAddress _memberAddressAsOnlyOneDate;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @return The entity of foreign property 'memberAddressAsOnlyOneDate'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsOnlyOneDate() {
        return _memberAddressAsOnlyOneDate;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsOnlyOneDate'.
     * @param memberAddressAsOnlyOneDate The entity of foreign property 'memberAddressAsOnlyOneDate'. (NullAllowed)
     */
    public void setMemberAddressAsOnlyOneDate(MemberAddress memberAddressAsOnlyOneDate) {
        _memberAddressAsOnlyOneDate = memberAddressAsOnlyOneDate;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'. */
    protected MemberLogin _memberLoginAsLocalBindOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @return The entity of foreign property 'memberLoginAsLocalBindOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLocalBindOverTest() {
        return _memberLoginAsLocalBindOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalBindOverTest'.
     * @param memberLoginAsLocalBindOverTest The entity of foreign property 'memberLoginAsLocalBindOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsLocalBindOverTest(MemberLogin memberLoginAsLocalBindOverTest) {
        _memberLoginAsLocalBindOverTest = memberLoginAsLocalBindOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'. */
    protected MemberLogin _memberLoginAsLocalForeignOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @return The entity of foreign property 'memberLoginAsLocalForeignOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLocalForeignOverTest() {
        return _memberLoginAsLocalForeignOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLocalForeignOverTest'.
     * @param memberLoginAsLocalForeignOverTest The entity of foreign property 'memberLoginAsLocalForeignOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsLocalForeignOverTest(MemberLogin memberLoginAsLocalForeignOverTest) {
        _memberLoginAsLocalForeignOverTest = memberLoginAsLocalForeignOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignBindOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignBindOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignBindOverTest() {
        return _memberLoginAsForeignForeignBindOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignBindOverTest'.
     * @param memberLoginAsForeignForeignBindOverTest The entity of foreign property 'memberLoginAsForeignForeignBindOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignBindOverTest(MemberLogin memberLoginAsForeignForeignBindOverTest) {
        _memberLoginAsForeignForeignBindOverTest = memberLoginAsForeignForeignBindOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignEachOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignEachOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignEachOverTest() {
        return _memberLoginAsForeignForeignEachOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignEachOverTest'.
     * @param memberLoginAsForeignForeignEachOverTest The entity of foreign property 'memberLoginAsForeignForeignEachOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignEachOverTest(MemberLogin memberLoginAsForeignForeignEachOverTest) {
        _memberLoginAsForeignForeignEachOverTest = memberLoginAsForeignForeignEachOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignOptimizedBasicOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedBasicOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        return _memberLoginAsForeignForeignOptimizedBasicOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedBasicOverTest'.
     * @param memberLoginAsForeignForeignOptimizedBasicOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedBasicOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedBasicOverTest(MemberLogin memberLoginAsForeignForeignOptimizedBasicOverTest) {
        _memberLoginAsForeignForeignOptimizedBasicOverTest = memberLoginAsForeignForeignOptimizedBasicOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignOptimizedMarkOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedMarkOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        return _memberLoginAsForeignForeignOptimizedMarkOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedMarkOverTest'.
     * @param memberLoginAsForeignForeignOptimizedMarkOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedMarkOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedMarkOverTest(MemberLogin memberLoginAsForeignForeignOptimizedMarkOverTest) {
        _memberLoginAsForeignForeignOptimizedMarkOverTest = memberLoginAsForeignForeignOptimizedMarkOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignOptimizedPartOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedPartOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignOptimizedPartOverTest() {
        return _memberLoginAsForeignForeignOptimizedPartOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedPartOverTest'.
     * @param memberLoginAsForeignForeignOptimizedPartOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedPartOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedPartOverTest(MemberLogin memberLoginAsForeignForeignOptimizedPartOverTest) {
        _memberLoginAsForeignForeignOptimizedPartOverTest = memberLoginAsForeignForeignOptimizedPartOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignOptimizedWholeOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignOptimizedWholeOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        return _memberLoginAsForeignForeignOptimizedWholeOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignOptimizedWholeOverTest'.
     * @param memberLoginAsForeignForeignOptimizedWholeOverTest The entity of foreign property 'memberLoginAsForeignForeignOptimizedWholeOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignOptimizedWholeOverTest(MemberLogin memberLoginAsForeignForeignOptimizedWholeOverTest) {
        _memberLoginAsForeignForeignOptimizedWholeOverTest = memberLoginAsForeignForeignOptimizedWholeOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignParameterOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignParameterOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignParameterOverTest() {
        return _memberLoginAsForeignForeignParameterOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignParameterOverTest'.
     * @param memberLoginAsForeignForeignParameterOverTest The entity of foreign property 'memberLoginAsForeignForeignParameterOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignParameterOverTest(MemberLogin memberLoginAsForeignForeignParameterOverTest) {
        _memberLoginAsForeignForeignParameterOverTest = memberLoginAsForeignForeignParameterOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'. */
    protected MemberLogin _memberLoginAsForeignForeignVariousOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @return The entity of foreign property 'memberLoginAsForeignForeignVariousOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsForeignForeignVariousOverTest() {
        return _memberLoginAsForeignForeignVariousOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsForeignForeignVariousOverTest'.
     * @param memberLoginAsForeignForeignVariousOverTest The entity of foreign property 'memberLoginAsForeignForeignVariousOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsForeignForeignVariousOverTest(MemberLogin memberLoginAsForeignForeignVariousOverTest) {
        _memberLoginAsForeignForeignVariousOverTest = memberLoginAsForeignForeignVariousOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'. */
    protected MemberLogin _memberLoginAsReferrerOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @return The entity of foreign property 'memberLoginAsReferrerOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsReferrerOverTest() {
        return _memberLoginAsReferrerOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerOverTest'.
     * @param memberLoginAsReferrerOverTest The entity of foreign property 'memberLoginAsReferrerOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsReferrerOverTest(MemberLogin memberLoginAsReferrerOverTest) {
        _memberLoginAsReferrerOverTest = memberLoginAsReferrerOverTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'. */
    protected MemberLogin _memberLoginAsReferrerForeignOverTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @return The entity of foreign property 'memberLoginAsReferrerForeignOverTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsReferrerForeignOverTest() {
        return _memberLoginAsReferrerForeignOverTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsReferrerForeignOverTest'.
     * @param memberLoginAsReferrerForeignOverTest The entity of foreign property 'memberLoginAsReferrerForeignOverTest'. (NullAllowed)
     */
    public void setMemberLoginAsReferrerForeignOverTest(MemberLogin memberLoginAsReferrerForeignOverTest) {
        _memberLoginAsReferrerForeignOverTest = memberLoginAsReferrerForeignOverTest;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'. */
    protected MemberAddress _memberAddressAsFormattedBasic;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @return The entity of foreign property 'memberAddressAsFormattedBasic'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsFormattedBasic() {
        return _memberAddressAsFormattedBasic;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedBasic'.
     * @param memberAddressAsFormattedBasic The entity of foreign property 'memberAddressAsFormattedBasic'. (NullAllowed)
     */
    public void setMemberAddressAsFormattedBasic(MemberAddress memberAddressAsFormattedBasic) {
        _memberAddressAsFormattedBasic = memberAddressAsFormattedBasic;
    }

    /** (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'. */
    protected MemberAddress _memberAddressAsFormattedLong;

    /**
     * [get] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @return The entity of foreign property 'memberAddressAsFormattedLong'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberAddress getMemberAddressAsFormattedLong() {
        return _memberAddressAsFormattedLong;
    }

    /**
     * [set] (会員住所情報)member_address by my MEMBER_ID, named 'memberAddressAsFormattedLong'.
     * @param memberAddressAsFormattedLong The entity of foreign property 'memberAddressAsFormattedLong'. (NullAllowed)
     */
    public void setMemberAddressAsFormattedLong(MemberAddress memberAddressAsFormattedLong) {
        _memberAddressAsFormattedLong = memberAddressAsFormattedLong;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'. */
    protected MemberLogin _memberLoginAsFormattedMany;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @return The entity of foreign property 'memberLoginAsFormattedMany'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsFormattedMany() {
        return _memberLoginAsFormattedMany;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsFormattedMany'.
     * @param memberLoginAsFormattedMany The entity of foreign property 'memberLoginAsFormattedMany'. (NullAllowed)
     */
    public void setMemberLoginAsFormattedMany(MemberLogin memberLoginAsFormattedMany) {
        _memberLoginAsFormattedMany = memberLoginAsFormattedMany;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'. */
    protected MemberLogin _memberLoginAsEmbeddedCommentClassificationTest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @return The entity of foreign property 'memberLoginAsEmbeddedCommentClassificationTest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsEmbeddedCommentClassificationTest() {
        return _memberLoginAsEmbeddedCommentClassificationTest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsEmbeddedCommentClassificationTest'.
     * @param memberLoginAsEmbeddedCommentClassificationTest The entity of foreign property 'memberLoginAsEmbeddedCommentClassificationTest'. (NullAllowed)
     */
    public void setMemberLoginAsEmbeddedCommentClassificationTest(MemberLogin memberLoginAsEmbeddedCommentClassificationTest) {
        _memberLoginAsEmbeddedCommentClassificationTest = memberLoginAsEmbeddedCommentClassificationTest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'. */
    protected MemberLogin _memberLoginAsLatest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @return The entity of foreign property 'memberLoginAsLatest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsLatest() {
        return _memberLoginAsLatest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsLatest'.
     * @param memberLoginAsLatest The entity of foreign property 'memberLoginAsLatest'. (NullAllowed)
     */
    public void setMemberLoginAsLatest(MemberLogin memberLoginAsLatest) {
        _memberLoginAsLatest = memberLoginAsLatest;
    }

    /** (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'. */
    protected MemberLogin _memberLoginAsOldest;

    /**
     * [get] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @return The entity of foreign property 'memberLoginAsOldest'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MemberLogin getMemberLoginAsOldest() {
        return _memberLoginAsOldest;
    }

    /**
     * [set] (会員ログイン情報)member_login by my MEMBER_ID, named 'memberLoginAsOldest'.
     * @param memberLoginAsOldest The entity of foreign property 'memberLoginAsOldest'. (NullAllowed)
     */
    public void setMemberLoginAsOldest(MemberLogin memberLoginAsOldest) {
        _memberLoginAsOldest = memberLoginAsOldest;
    }

    /** (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected MemberSecurity _memberSecurityAsOne;

    /**
     * [get] (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberSecurity getMemberSecurityAsOne() {
        if (_memberSecurityAsOne == null) {
            _memberSecurityAsOne = CachedMemberSecurity.get(getMemberId());
        }
        return _memberSecurityAsOne;
    }

    /**
     * [set] (会員セキュリティ情報)member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NullAllowed)
     */
    public void setMemberSecurityAsOne(MemberSecurity memberSecurityAsOne) {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /** (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'. */
    protected MemberService _memberServiceAsOne;

    /**
     * [get] (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberService getMemberServiceAsOne() {
        return _memberServiceAsOne;
    }

    /**
     * [set] (会員サービス)member_service by MEMBER_ID, named 'memberServiceAsOne'.
     * @param memberServiceAsOne The entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NullAllowed)
     */
    public void setMemberServiceAsOne(MemberService memberServiceAsOne) {
        _memberServiceAsOne = memberServiceAsOne;
    }

    /** (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected MemberWithdrawal _memberWithdrawalAsOne;

    /**
     * [get] (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed: when e.g. no data, no setupSelect)
     */
    public MemberWithdrawal getMemberWithdrawalAsOne() {
        return _memberWithdrawalAsOne;
    }

    /**
     * [set] (会員退会情報)member_withdrawal by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NullAllowed)
     */
    public void setMemberWithdrawalAsOne(MemberWithdrawal memberWithdrawalAsOne) {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'. */
    protected List<MemberAddress> _memberAddressList;

    /**
     * [get] (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberAddress> getMemberAddressList() {
        if (_memberAddressList == null) { _memberAddressList = newReferrerList(); }
        return _memberAddressList;
    }

    /**
     * [set] (会員住所情報)member_address by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    public void setMemberAddressList(List<MemberAddress> memberAddressList) {
        _memberAddressList = memberAddressList;
    }

    /** (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'. */
    protected List<MemberLogin> _memberLoginList;

    /**
     * [get] (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberLogin> getMemberLoginList() {
        if (_memberLoginList == null) { _memberLoginList = newReferrerList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン情報)member_login by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    public void setMemberLoginList(List<MemberLogin> memberLoginList) {
        _memberLoginList = memberLoginList;
    }

    /** (購入)purchase by MEMBER_ID, named 'purchaseList'. */
    protected List<Purchase> _purchaseList;

    /**
     * [get] (購入)purchase by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Purchase> getPurchaseList() {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)purchase by MEMBER_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    public void setPurchaseList(List<Purchase> purchaseList) {
        _purchaseList = purchaseList;
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
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsMember)) { return false; }
        BsMember other = (BsMember)obj;
        if (!xSV(getMemberId(), other.getMemberId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
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
        String li = "\n  ";
        if (_memberStatus != null)
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberAddressAsValid != null)
        { sb.append(li).append(xbRDS(_memberAddressAsValid, "memberAddressAsValid")); }
        if (_memberAddressAsValidBefore != null)
        { sb.append(li).append(xbRDS(_memberAddressAsValidBefore, "memberAddressAsValidBefore")); }
        if (_memberLoginAsLoginStatus != null)
        { sb.append(li).append(xbRDS(_memberLoginAsLoginStatus, "memberLoginAsLoginStatus")); }
        if (_memberAddressAsIfComment != null)
        { sb.append(li).append(xbRDS(_memberAddressAsIfComment, "memberAddressAsIfComment")); }
        if (_memberAddressAsOnlyOneDate != null)
        { sb.append(li).append(xbRDS(_memberAddressAsOnlyOneDate, "memberAddressAsOnlyOneDate")); }
        if (_memberLoginAsLocalBindOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsLocalBindOverTest, "memberLoginAsLocalBindOverTest")); }
        if (_memberLoginAsLocalForeignOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsLocalForeignOverTest, "memberLoginAsLocalForeignOverTest")); }
        if (_memberLoginAsForeignForeignBindOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignBindOverTest, "memberLoginAsForeignForeignBindOverTest")); }
        if (_memberLoginAsForeignForeignEachOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignEachOverTest, "memberLoginAsForeignForeignEachOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedBasicOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedBasicOverTest, "memberLoginAsForeignForeignOptimizedBasicOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedMarkOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedMarkOverTest, "memberLoginAsForeignForeignOptimizedMarkOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedPartOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedPartOverTest, "memberLoginAsForeignForeignOptimizedPartOverTest")); }
        if (_memberLoginAsForeignForeignOptimizedWholeOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignOptimizedWholeOverTest, "memberLoginAsForeignForeignOptimizedWholeOverTest")); }
        if (_memberLoginAsForeignForeignParameterOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignParameterOverTest, "memberLoginAsForeignForeignParameterOverTest")); }
        if (_memberLoginAsForeignForeignVariousOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsForeignForeignVariousOverTest, "memberLoginAsForeignForeignVariousOverTest")); }
        if (_memberLoginAsReferrerOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsReferrerOverTest, "memberLoginAsReferrerOverTest")); }
        if (_memberLoginAsReferrerForeignOverTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsReferrerForeignOverTest, "memberLoginAsReferrerForeignOverTest")); }
        if (_memberAddressAsFormattedBasic != null)
        { sb.append(li).append(xbRDS(_memberAddressAsFormattedBasic, "memberAddressAsFormattedBasic")); }
        if (_memberAddressAsFormattedLong != null)
        { sb.append(li).append(xbRDS(_memberAddressAsFormattedLong, "memberAddressAsFormattedLong")); }
        if (_memberLoginAsFormattedMany != null)
        { sb.append(li).append(xbRDS(_memberLoginAsFormattedMany, "memberLoginAsFormattedMany")); }
        if (_memberLoginAsEmbeddedCommentClassificationTest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsEmbeddedCommentClassificationTest, "memberLoginAsEmbeddedCommentClassificationTest")); }
        if (_memberLoginAsLatest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsLatest, "memberLoginAsLatest")); }
        if (_memberLoginAsOldest != null)
        { sb.append(li).append(xbRDS(_memberLoginAsOldest, "memberLoginAsOldest")); }
        if (_memberSecurityAsOne != null)
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberServiceAsOne != null)
        { sb.append(li).append(xbRDS(_memberServiceAsOne, "memberServiceAsOne")); }
        if (_memberWithdrawalAsOne != null)
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        if (_memberAddressList != null) { for (Entity et : _memberAddressList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")); } } }
        if (_memberLoginList != null) { for (Entity et : _memberLoginList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")); } } }
        if (_purchaseList != null) { for (Entity et : _purchaseList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
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
        String dm = ", ";
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getMemberAccount());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getFormalizedDatetime());
        sb.append(dm).append(xfUD(getBirthdate()));
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateUser());
        sb.append(dm).append(getVersionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_memberStatus != null) { sb.append(cm).append("memberStatus"); }
        if (_memberAddressAsValid != null) { sb.append(cm).append("memberAddressAsValid"); }
        if (_memberAddressAsValidBefore != null) { sb.append(cm).append("memberAddressAsValidBefore"); }
        if (_memberLoginAsLoginStatus != null) { sb.append(cm).append("memberLoginAsLoginStatus"); }
        if (_memberAddressAsIfComment != null) { sb.append(cm).append("memberAddressAsIfComment"); }
        if (_memberAddressAsOnlyOneDate != null) { sb.append(cm).append("memberAddressAsOnlyOneDate"); }
        if (_memberLoginAsLocalBindOverTest != null) { sb.append(cm).append("memberLoginAsLocalBindOverTest"); }
        if (_memberLoginAsLocalForeignOverTest != null) { sb.append(cm).append("memberLoginAsLocalForeignOverTest"); }
        if (_memberLoginAsForeignForeignBindOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignBindOverTest"); }
        if (_memberLoginAsForeignForeignEachOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignEachOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedBasicOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignOptimizedBasicOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedMarkOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignOptimizedMarkOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedPartOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignOptimizedPartOverTest"); }
        if (_memberLoginAsForeignForeignOptimizedWholeOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignOptimizedWholeOverTest"); }
        if (_memberLoginAsForeignForeignParameterOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignParameterOverTest"); }
        if (_memberLoginAsForeignForeignVariousOverTest != null) { sb.append(cm).append("memberLoginAsForeignForeignVariousOverTest"); }
        if (_memberLoginAsReferrerOverTest != null) { sb.append(cm).append("memberLoginAsReferrerOverTest"); }
        if (_memberLoginAsReferrerForeignOverTest != null) { sb.append(cm).append("memberLoginAsReferrerForeignOverTest"); }
        if (_memberAddressAsFormattedBasic != null) { sb.append(cm).append("memberAddressAsFormattedBasic"); }
        if (_memberAddressAsFormattedLong != null) { sb.append(cm).append("memberAddressAsFormattedLong"); }
        if (_memberLoginAsFormattedMany != null) { sb.append(cm).append("memberLoginAsFormattedMany"); }
        if (_memberLoginAsEmbeddedCommentClassificationTest != null) { sb.append(cm).append("memberLoginAsEmbeddedCommentClassificationTest"); }
        if (_memberLoginAsLatest != null) { sb.append(cm).append("memberLoginAsLatest"); }
        if (_memberLoginAsOldest != null) { sb.append(cm).append("memberLoginAsOldest"); }
        if (_memberSecurityAsOne != null) { sb.append(cm).append("memberSecurityAsOne"); }
        if (_memberServiceAsOne != null) { sb.append(cm).append("memberServiceAsOne"); }
        if (_memberWithdrawalAsOne != null) { sb.append(cm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty())
        { sb.append(cm).append("memberAddressList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty())
        { sb.append(cm).append("memberLoginList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty())
        { sb.append(cm).append("purchaseList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Member clone() {
        try {
            return (Member)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} <br />
     * 会員を識別するID。連番として基本的に自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, INT(10), FK to MEMBER_ADDRESS} <br />
     * 会員を識別するID。連番として基本的に自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMSによって変わる。
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} <br />
     * 会員のフルネームの名称。
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(180)} <br />
     * 会員のフルネームの名称。
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * 会員がログイン時に利用するアカウントNO。
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        return _memberAccount;
    }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * 会員がログイン時に利用するアカウントNO。
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        __modifiedProperties.addPropertyName("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} <br />
     * 会員が正式に確定した日時。一度確定したら更新されない。<br />
     * 仮会員のときはnull。
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, DATETIME(19)} <br />
     * 会員が正式に確定した日時。一度確定したら更新されない。<br />
     * 仮会員のときはnull。
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(10)} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(10)} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * レコードが登録された日時。共通カラムの一つ。
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br />
     * レコードが登録された日時。共通カラムの一つ。
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.sql.Timestamp registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * レコードを登録したユーザ。共通カラムの一つ。
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * レコードを登録したユーザ。共通カラムの一つ。
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * レコードが（最後に）更新された日時。共通カラムの一つ。
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br />
     * レコードが（最後に）更新された日時。共通カラムの一つ。
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.sql.Timestamp updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * レコードを更新したユーザ。
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * レコードを更新したユーザ。
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * レコードのバージョンを示すNO。<br />
     * 更新回数と等しく、主に排他制御のために利用される。
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * レコードのバージョンを示すNO。<br />
     * 更新回数と等しく、主に排他制御のために利用される。
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
