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
 * The DB meta of white_uq_reference. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqReferenceDbm _instance = new WhiteUqReferenceDbm();
    private WhiteUqReferenceDbm() {}
    public static WhiteUqReferenceDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqReferenceId(), "uqReferenceId");
        setupEpg(_epgMap, new EpgUqReferenceCode(), "uqReferenceCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqReferenceId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReference)e).getUqReferenceId(); }
        public void write(Entity e, Object v) { ((WhiteUqReference)e).setUqReferenceId(ctl(v)); }
    }
    public static class EpgUqReferenceCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReference)e).getUqReferenceCode(); }
        public void write(Entity e, Object v) { ((WhiteUqReference)e).setUqReferenceCode((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_reference";
    protected final String _tablePropertyName = "whiteUqReference";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_REFERENCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqReferenceId = cci("UQ_REFERENCE_ID", "UQ_REFERENCE_ID", null, null, true, "uqReferenceId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, "whiteUqReferenceRefByFkToPkIdList", null);
    protected final ColumnInfo _columnUqReferenceCode = cci("UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", null, null, true, "uqReferenceCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqReferenceRefByFkToUqCodeList", null);

    public ColumnInfo columnUqReferenceId() { return _columnUqReferenceId; }
    public ColumnInfo columnUqReferenceCode() { return _columnUqReferenceCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqReferenceId());
        ls.add(columnUqReferenceCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqReferenceId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public ReferrerInfo referrerWhiteUqReferenceRefByFkToPkIdList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqReferenceId(), WhiteUqReferenceRefDbm.getInstance().columnFkToPkId());
        return cri("FK_WHITE_UQ_REFERENCE_REF_PK", "whiteUqReferenceRefByFkToPkIdList", this, WhiteUqReferenceRefDbm.getInstance(), map, false, "whiteUqReferenceByFkToPkId");
    }
    public ReferrerInfo referrerWhiteUqReferenceRefByFkToUqCodeList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqReferenceCode(), WhiteUqReferenceRefDbm.getInstance().columnFkToUqCode());
        return cri("FK_WHITE_UQ_REFERENCE_REF_UQ", "whiteUqReferenceRefByFkToUqCodeList", this, WhiteUqReferenceRefDbm.getInstance(), map, false, "whiteUqReferenceByFkToUqCode");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqReference"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqReference> getEntityType() { return WhiteUqReference.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqReference newMyEntity() { return new WhiteUqReference(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqReference)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqReference)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
