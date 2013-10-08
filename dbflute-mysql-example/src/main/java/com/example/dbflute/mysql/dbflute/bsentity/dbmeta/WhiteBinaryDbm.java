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
 * The DB meta of white_binary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteBinaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteBinaryDbm _instance = new WhiteBinaryDbm();
    private WhiteBinaryDbm() {}
    public static WhiteBinaryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBinaryId(), "binaryId");
        setupEpg(_epgMap, new EpgBinaryData(), "binaryData");
        setupEpg(_epgMap, new EpgBlobData(), "blobData");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBinaryId implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteBinary)e).getBinaryId(); }
        public void write(Entity e, Object v) { ((WhiteBinary)e).setBinaryId(ctl(v)); }
    }
    public static class EpgBinaryData implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteBinary)e).getBinaryData(); }
        public void write(Entity e, Object v) { ((WhiteBinary)e).setBinaryData((byte[])v); }
    }
    public static class EpgBlobData implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteBinary)e).getBlobData(); }
        public void write(Entity e, Object v) { ((WhiteBinary)e).setBlobData((byte[])v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_binary";
    protected final String _tablePropertyName = "whiteBinary";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_BINARY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBinaryId = cci("BINARY_ID", "BINARY_ID", null, null, true, "binaryId", Long.class, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBinaryData = cci("BINARY_DATA", "BINARY_DATA", null, null, false, "binaryData", byte[].class, false, false, "BINARY", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBlobData = cci("BLOB_DATA", "BLOB_DATA", null, null, false, "blobData", byte[].class, false, false, "BLOB", 65535, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnBinaryId() { return _columnBinaryId; }
    public ColumnInfo columnBinaryData() { return _columnBinaryData; }
    public ColumnInfo columnBlobData() { return _columnBlobData; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBinaryId());
        ls.add(columnBinaryData());
        ls.add(columnBlobData());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBinaryId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteBinary"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteBinaryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteBinaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteBinary> getEntityType() { return WhiteBinary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteBinary newMyEntity() { return new WhiteBinary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteBinary)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteBinary)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
