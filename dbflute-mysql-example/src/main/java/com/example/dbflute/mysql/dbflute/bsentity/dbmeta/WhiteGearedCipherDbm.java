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
 * The DB meta of white_geared_cipher. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteGearedCipherDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteGearedCipherDbm _instance = new WhiteGearedCipherDbm();
    private WhiteGearedCipherDbm() {}
    public static WhiteGearedCipherDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgCipherId(), "cipherId");
        setupEpg(_epgMap, new EpgCipherInteger(), "cipherInteger");
        setupEpg(_epgMap, new EpgCipherVarchar(), "cipherVarchar");
        setupEpg(_epgMap, new EpgCipherDate(), "cipherDate");
        setupEpg(_epgMap, new EpgCipherDatetime(), "cipherDatetime");
    }
    public static class EpgCipherId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteGearedCipher)et).getCipherId(); }
        public void write(Entity et, Object vl) { ((WhiteGearedCipher)et).setCipherId(ctl(vl)); }
    }
    public static class EpgCipherInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteGearedCipher)et).getCipherInteger(); }
        public void write(Entity et, Object vl) { ((WhiteGearedCipher)et).setCipherInteger(cti(vl)); }
    }
    public static class EpgCipherVarchar implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteGearedCipher)et).getCipherVarchar(); }
        public void write(Entity et, Object vl) { ((WhiteGearedCipher)et).setCipherVarchar((String)vl); }
    }
    public static class EpgCipherDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteGearedCipher)et).getCipherDate(); }
        public void write(Entity et, Object vl) { ((WhiteGearedCipher)et).setCipherDate((java.util.Date)vl); }
    }
    public static class EpgCipherDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteGearedCipher)et).getCipherDatetime(); }
        public void write(Entity et, Object vl) { ((WhiteGearedCipher)et).setCipherDatetime((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_geared_cipher";
    protected final String _tablePropertyName = "whiteGearedCipher";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_GEARED_CIPHER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCipherId = cci("CIPHER_ID", "CIPHER_ID", null, null, Long.class, "cipherId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCipherInteger = cci("CIPHER_INTEGER", "CIPHER_INTEGER", null, null, Integer.class, "cipherInteger", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCipherVarchar = cci("CIPHER_VARCHAR", "CIPHER_VARCHAR", null, null, String.class, "cipherVarchar", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCipherDate = cci("CIPHER_DATE", "CIPHER_DATE", null, null, java.util.Date.class, "cipherDate", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCipherDatetime = cci("CIPHER_DATETIME", "CIPHER_DATETIME", null, null, java.sql.Timestamp.class, "cipherDatetime", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);

    /**
     * CIPHER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherId() { return _columnCipherId; }
    /**
     * CIPHER_INTEGER: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherInteger() { return _columnCipherInteger; }
    /**
     * CIPHER_VARCHAR: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherVarchar() { return _columnCipherVarchar; }
    /**
     * CIPHER_DATE: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherDate() { return _columnCipherDate; }
    /**
     * CIPHER_DATETIME: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCipherDatetime() { return _columnCipherDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCipherId());
        ls.add(columnCipherInteger());
        ls.add(columnCipherVarchar());
        ls.add(columnCipherDate());
        ls.add(columnCipherDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCipherId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteGearedCipher"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteGearedCipherCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteGearedCipherBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteGearedCipher> getEntityType() { return WhiteGearedCipher.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteGearedCipher newEntity() { return new WhiteGearedCipher(); }
    public WhiteGearedCipher newMyEntity() { return new WhiteGearedCipher(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteGearedCipher)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteGearedCipher)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
