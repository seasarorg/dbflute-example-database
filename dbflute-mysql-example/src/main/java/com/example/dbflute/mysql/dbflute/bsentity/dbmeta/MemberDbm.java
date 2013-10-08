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
package com.example.dbflute.mysql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of member. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgMemberAccount(), "memberAccount");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberId(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberName(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberName((String)v); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberAccount(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberAccount((String)v); }
    }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) {
            ColumnInfo col = columnMemberStatusCode();
            ccls(col, v);
            ((Member)e).setMemberStatusCodeAsMemberStatus((CDef.MemberStatus)gcls(col, v));
        }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((Member)e).setBirthdate((java.util.Date)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((Member)e).setRegisterUser((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((Member)e).setUpdateUser((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((Member)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のプロフィールやアカウントなどの基本情報を保持する。\n基本的に物理削除はなく、退会したらステータスが退会会員になる。\nライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", true, "memberId", Integer.class, true, true, "INT", 10, 0, null, false, null, "会員を識別するID。連番として基本的に自動採番される。\n（会員IDだけに限らず）採番方法はDBMSによって変わる。", "memberAddressAsValid,memberAddressAsValidBefore,memberLoginAsLoginStatus,memberAddressAsIfComment,memberAddressAsOnlyOneDate,memberLoginAsLocalForeignOverTest,memberLoginAsForeignForeignEachOverTest,memberLoginAsForeignForeignOptimizedBasicOverTest,memberLoginAsForeignForeignOptimizedMarkOverTest,memberLoginAsForeignForeignOptimizedPartOverTest,memberLoginAsForeignForeignOptimizedWholeOverTest,memberLoginAsForeignForeignParameterOverTest,memberLoginAsForeignForeignVariousOverTest,memberLoginAsReferrerOverTest,memberLoginAsReferrerForeignOverTest,memberAddressAsFormattedBasic,memberAddressAsFormattedLong,memberLoginAsFormattedMany,memberLoginAsLatest,memberSecurityAsOne,memberServiceAsOne,memberWithdrawalAsOne", "memberAddressList,memberLoginList,purchaseList", null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", true, "memberName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, "会員のフルネームの名称。", null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", true, "memberAccount", String.class, false, false, "VARCHAR", 50, 0, null, false, null, "会員がログイン時に利用するアカウントNO。", null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", true, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, "会員が正式に確定した日時。一度確定したら更新されない。\n仮会員のときはnull。", null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", false, "birthdate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, "必須項目ではないので、このデータがない会員もいる。", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", true, "registerDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, true, null, "レコードが登録された日時。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザ", true, "registerUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, "レコードを登録したユーザ。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", true, "updateDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, true, null, "レコードが（最後に）更新された日時。共通カラムの一つ。", null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", true, "updateUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, "レコードを更新したユーザ。", null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョンNO", true, "versionNo", Long.class, false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, "レコードのバージョンを示すNO。\n更新回数と等しく、主に排他制御のために利用される。", null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), map, 0, false, false, false, false, null, null, false, "memberList");
    }
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), map, 1, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberAddressAsValidBefore() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID_BEFORE", "memberAddressAsValidBefore", this, MemberAddressDbm.getInstance(), map, 2, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValidBefore.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValidBefore.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberLoginAsLoginStatus() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_STATUS", "memberLoginAsLoginStatus", this, MemberLoginDbm.getInstance(), map, 3, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = /*$$locationBase$$.parameterMapMemberLoginAsLoginStatus.statusCode*/null", newArrayList("statusCode"), false, null);
    }
    public ForeignInfo foreignMemberAddressAsIfComment() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_IF_COMMENT", "memberAddressAsIfComment", this, MemberAddressDbm.getInstance(), map, 4, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsIfComment.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsIfComment.targetDate*/null\n     /*IF $$locationBase$$.parameterMapMemberAddressAsIfComment.region != null*/and $$foreignAlias$$.REGION_ID = /*$$locationBase$$.parameterMapMemberAddressAsIfComment.region*/null/*END*/", newArrayList("targetDate, region"), false, null);
    }
    public ForeignInfo foreignMemberAddressAsOnlyOneDate() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_ONLY_ONE_DATE", "memberAddressAsOnlyOneDate", this, MemberAddressDbm.getInstance(), map, 5, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE = ($$sqbegin$$\nselect max(address.VALID_BEGIN_DATE)\n  from MEMBER_ADDRESS address\n where address.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n   and address.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsOnlyOneDate.targetDate*/null\n)$$sqend$$", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberLoginAsLocalForeignOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LOCAL_FOREIGN_OVER_TEST", "memberLoginAsLocalForeignOverTest", this, MemberLoginDbm.getInstance(), map, 6, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = $$over($localTable.memberStatus)$$.MEMBER_STATUS_NAME", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignEachOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_EACH_OVER_TEST", "memberLoginAsForeignForeignEachOverTest", this, MemberLoginDbm.getInstance(), map, 7, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedBasicOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_BASIC_OVER_TEST", "memberLoginAsForeignForeignOptimizedBasicOverTest", this, MemberLoginDbm.getInstance(), map, 8, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedMarkOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_MARK_OVER_TEST", "memberLoginAsForeignForeignOptimizedMarkOverTest", this, MemberLoginDbm.getInstance(), map, 9, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3\n$$inline$$\n     and $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\n     and $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedPartOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_PART_OVER_TEST", "memberLoginAsForeignForeignOptimizedPartOverTest", this, MemberLoginDbm.getInstance(), map, 10, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3\n     and $$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\n     and $$localAlias$$.BIRTHDATE is not null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\n     and $$localAlias$$.MEMBER_NAME like /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignOptimizedPartOverTest.memberName*/null\n     and $$foreignAlias$$.MOBILE_LOGIN_FLG = (\n             select 'Y'\n         )\n     and $$foreignAlias$$.LOGIN_DATETIME >= now()\n       or $$foreignAlias$$.LOGIN_DATETIME <= now()\n     and $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER", newArrayList("memberName"), false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignOptimizedWholeOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_OPTIMIZED_WHOLE_OVER_TEST", "memberLoginAsForeignForeignOptimizedWholeOverTest", this, MemberLoginDbm.getInstance(), map, 11, true, true, false, true, "$$over($foreignTable.memberStatus)$$.DISPLAY_ORDER = 3\nand $$over($foreignTable.memberStatus, DESCRIPTION)$$.STATUS_DESC is not null\nand $$foreignAlias$$.MOBILE_LOGIN_FLG = 1\nand $$foreignAlias$$.MEMBER_ID >= $$over($foreignTable.memberStatus)$$.DISPLAY_ORDER\nand $$foreignAlias$$.LOGIN_DATETIME < ($$sqbegin$$\nselect max(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$\nand $$foreignAlias$$.LOGIN_DATETIME > ($$sqbegin$$\nselect min(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignParameterOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_PARAMETER_OVER_TEST", "memberLoginAsForeignForeignParameterOverTest", this, MemberLoginDbm.getInstance(), map, 12, true, true, false, true, "$$over($localTable.memberStatus)$$.DISPLAY_ORDER = $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER\n     and $$over($foreignTable.memberStatus, MEMBER_STATUS_CODE)$$.MEMBER_STATUS_CODE is not null\n     and $$over($foreignTable.memberStatus, MEMBER_STATUS_NAME)$$.MEMBER_STATUS_NAME is not null\n     and $$localAlias$$.BIRTHDATE > /*$$locationBase$$.parameterMapMemberLoginAsForeignForeignParameterOverTest.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberLoginAsForeignForeignVariousOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FOREIGN_FOREIGN_VARIOUS_OVER_TEST", "memberLoginAsForeignForeignVariousOverTest", this, MemberLoginDbm.getInstance(), map, 13, true, true, false, true, "$$over($foreignTable.member.memberStatus)$$.DISPLAY_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne)$$.WITHDRAWAL_DATETIME is not null\n     and $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne.withdrawalReason, DISPLAY_ORDER)$$.REASON_ORDER is not null\n     and $$over($foreignTable.memberStatus)$$.MEMBER_STATUS_NAME is not null\n     and $$over(PURCHASE.product.productStatus)$$.PRODUCT_STATUS_NAME is not null\n     $$inline$$", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsReferrerOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_REFERRER_OVER_TEST", "memberLoginAsReferrerOverTest", this, MemberLoginDbm.getInstance(), map, 14, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME > $$over(PURCHASE)$$.PURCHASE_DATETIME", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsReferrerForeignOverTest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_REFERRER_FOREIGN_OVER_TEST", "memberLoginAsReferrerForeignOverTest", this, MemberLoginDbm.getInstance(), map, 15, true, true, false, true, "$$foreignAlias$$.LOGIN_MEMBER_STATUS_CODE = $$over(PURCHASE.product.productStatus)$$.PRODUCT_STATUS_NAME", null, false, null);
    }
    public ForeignInfo foreignMemberAddressAsFormattedBasic() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_FORMATTED_BASIC", "memberAddressAsFormattedBasic", this, MemberAddressDbm.getInstance(), map, 16, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsFormattedBasic.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsFormattedBasic.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberAddressAsFormattedLong() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_FORMATTED_LONG", "memberAddressAsFormattedLong", this, MemberAddressDbm.getInstance(), map, 17, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsFormattedLong.targetDate*/null\n     and $$foreignAlias$$.VALID_END_DATE\n >= /*$$locationBase$$.parameterMapMemberAddressAsFormattedLong.targetDate*/null", newArrayList("targetDate"), false, null);
    }
    public ForeignInfo foreignMemberLoginAsFormattedMany() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_FORMATTED_MANY", "memberLoginAsFormattedMany", this, MemberLoginDbm.getInstance(), map, 18, true, true, false, true, "$$over($foreignTable.member.memberStatus)$$.DISPLAY_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne)$$.WITHDRAWAL_DATETIME is not null\n     and $$over($foreignTable.memberStatus, DISPLAY_ORDER)$$.STATUS_ORDER is not null\n     and $$over($foreignTable.member.memberWithdrawalAsOne.withdrawalReason, DISPLAY_ORDER)$$.REASON_ORDER is not null\n     and $$over($foreignTable.memberStatus)$$.MEMBER_STATUS_NAME is not null\n     and $$over($localTable.memberSecurityAsOne)$$.REMINDER_QUESTION is not null\n     and $$over($localTable.memberServiceAsOne)$$.SERVICE_POINT_COUNT is not null", null, false, null);
    }
    public ForeignInfo foreignMemberLoginAsLatest() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_LOGIN_LATEST", "memberLoginAsLatest", this, MemberLoginDbm.getInstance(), map, 19, true, true, false, true, "$$foreignAlias$$.LOGIN_DATETIME = ($$sqbegin$$\nselect max(login.LOGIN_DATETIME)\n  from MEMBER_LOGIN login\n where login.MEMBER_ID = $$foreignAlias$$.MEMBER_ID\n)$$sqend$$", null, false, null);
    }
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), map, 20, true, false, true, false, null, null, false, "member");
    }
    public ForeignInfo foreignMemberServiceAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberServiceDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "memberServiceAsOne", this, MemberServiceDbm.getInstance(), map, 21, true, false, true, false, null, null, false, "member");
    }
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), map, 22, true, false, true, false, null, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), map, false, "member");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Member newMyEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Member)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Member)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
