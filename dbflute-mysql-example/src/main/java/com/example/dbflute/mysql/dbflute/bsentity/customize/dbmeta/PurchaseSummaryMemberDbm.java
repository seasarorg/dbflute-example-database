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
package com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The DB meta of PurchaseSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseSummaryMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseSummaryMemberDbm _instance = new PurchaseSummaryMemberDbm();
    private PurchaseSummaryMemberDbm() {}
    public static PurchaseSummaryMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgPurchaseSummary(), "purchaseSummary");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setMemberName((String)vl); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getBirthdate(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setBirthdate((java.util.Date)vl); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getFormalizedDatetime(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setFormalizedDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgPurchaseSummary implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseSummaryMember)et).getPurchaseSummary(); }
        public void write(Entity et, Object vl) { ((PurchaseSummaryMember)et).setPurchaseSummary(ctb(vl)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PurchaseSummaryMember";
    protected final String _tablePropertyName = "purchaseSummaryMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("PurchaseSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", false, "memberId", Integer.class, false, false, "INT", 11, 0, null, false, null, "会員を識別するID。連番として基本的に自動採番される。\n（会員IDだけに限らず）採番方法はDBMSによって変わる。\n// unique key of this result", null, null, null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", false, "memberName", String.class, false, false, "VARCHAR", 180, 0, null, false, null, "会員のフルネームの名称。", null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", false, "birthdate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, "必須項目ではないので、このデータがない会員もいる。", null, null, null);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, "会員が正式に確定した日時。一度確定したら更新されない。\n仮会員のときはnull。", null, null, null);
    protected final ColumnInfo _columnPurchaseSummary = cci("PURCHASE_SUMMARY", "PURCHASE_SUMMARY", null, null, false, "purchaseSummary", java.math.BigDecimal.class, false, false, "DECIMAL", 32, 0, null, false, null, "// sum of purchase count", null, null, null);

    /**
     * (会員ID)MEMBER_ID: {INT(11), refers to member.MEMBER_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)MEMBER_NAME: {VARCHAR(180), refers to member.MEMBER_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (生年月日)BIRTHDATE: {DATE(10), refers to member.BIRTHDATE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * (正式会員日時)FORMALIZED_DATETIME: {DATETIME(19), refers to member.FORMALIZED_DATETIME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * PURCHASE_SUMMARY: {DECIMAL(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseSummary() { return _columnPurchaseSummary; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnPurchaseSummary());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.customize.PurchaseSummaryMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchaseSummaryMember> getEntityType() { return PurchaseSummaryMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public PurchaseSummaryMember newMyEntity() { return new PurchaseSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchaseSummaryMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchaseSummaryMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
