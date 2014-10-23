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
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.*;

/**
 * The DB meta of white_compound_referred_primary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundReferredPrimaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundReferredPrimaryDbm _instance = new WhiteCompoundReferredPrimaryDbm();
    private WhiteCompoundReferredPrimaryDbm() {}
    public static WhiteCompoundReferredPrimaryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgReferredId(), "referredId");
        setupEpg(_epgMap, new EpgReferredName(), "referredName");
    }
    public static class EpgReferredId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundReferredPrimary)et).getReferredId(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundReferredPrimary)et).setReferredId(cti(vl)); }
    }
    public static class EpgReferredName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteCompoundReferredPrimary)et).getReferredName(); }
        public void write(Entity et, Object vl) { ((WhiteCompoundReferredPrimary)et).setReferredName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_referred_primary";
    protected final String _tablePropertyName = "whiteCompoundReferredPrimary";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_COMPOUND_REFERRED_PRIMARY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReferredId = cci("REFERRED_ID", "REFERRED_ID", null, null, Integer.class, "referredId", null, true, false, true, "INT", 10, 0, null, false, null, null, null, "whiteCompoundPkList", null);
    protected final ColumnInfo _columnReferredName = cci("REFERRED_NAME", "REFERRED_NAME", null, null, String.class, "referredName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * REFERRED_ID: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferredId() { return _columnReferredId; }
    /**
     * REFERRED_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferredName() { return _columnReferredName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnReferredId());
        ls.add(columnReferredName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnReferredId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_compound_pk by PK_SECOND_ID, named 'whiteCompoundPkList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReferredId(), WhiteCompoundPkDbm.getInstance().columnPkSecondId());
        return cri("FK_WHITE_COMPOUND_PK_REFERRED_PRIMARY_TEST", "whiteCompoundPkList", this, WhiteCompoundPkDbm.getInstance(), mp, false, "whiteCompoundReferredPrimary");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteCompoundReferredPrimary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteCompoundReferredPrimaryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteCompoundReferredPrimaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundReferredPrimary> getEntityType() { return WhiteCompoundReferredPrimary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundReferredPrimary newEntity() { return new WhiteCompoundReferredPrimary(); }
    public WhiteCompoundReferredPrimary newMyEntity() { return new WhiteCompoundReferredPrimary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundReferredPrimary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundReferredPrimary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
