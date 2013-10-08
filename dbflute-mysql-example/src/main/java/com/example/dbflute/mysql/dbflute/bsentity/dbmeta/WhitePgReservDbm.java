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
 * The DB meta of white_pg_reserv. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePgReservDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePgReservDbm _instance = new WhitePgReservDbm();
    private WhitePgReservDbm() {}
    public static WhitePgReservDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgClassSynonym(), "classSynonym");
        setupEpg(_epgMap, new EpgCaseSynonym(), "caseSynonym");
        setupEpg(_epgMap, new EpgPackageSynonym(), "packageSynonym");
        setupEpg(_epgMap, new EpgDefaultSynonym(), "defaultSynonym");
        setupEpg(_epgMap, new EpgNewSynonym(), "newSynonym");
        setupEpg(_epgMap, new EpgNativeSynonym(), "nativeSynonym");
        setupEpg(_epgMap, new EpgVoidSynonym(), "voidSynonym");
        setupEpg(_epgMap, new EpgPublicSynonym(), "publicSynonym");
        setupEpg(_epgMap, new EpgProtectedSynonym(), "protectedSynonym");
        setupEpg(_epgMap, new EpgPrivateSynonym(), "privateSynonym");
        setupEpg(_epgMap, new EpgInterfaceSynonym(), "interfaceSynonym");
        setupEpg(_epgMap, new EpgAbstractSynonym(), "abstractSynonym");
        setupEpg(_epgMap, new EpgFinalSynonym(), "finalSynonym");
        setupEpg(_epgMap, new EpgFinallySynonym(), "finallySynonym");
        setupEpg(_epgMap, new EpgReturnSynonym(), "returnSynonym");
        setupEpg(_epgMap, new EpgDoubleSynonym(), "doubleSynonym");
        setupEpg(_epgMap, new EpgFloatSynonym(), "floatSynonym");
        setupEpg(_epgMap, new EpgShortSynonym(), "shortSynonym");
        setupEpg(_epgMap, new EpgType(), "type");
        setupEpg(_epgMap, new EpgReservName(), "reservName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgClassSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getClassSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setClassSynonym(cti(v)); }
    }
    public static class EpgCaseSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getCaseSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setCaseSynonym(cti(v)); }
    }
    public static class EpgPackageSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getPackageSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setPackageSynonym(cti(v)); }
    }
    public static class EpgDefaultSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getDefaultSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setDefaultSynonym(cti(v)); }
    }
    public static class EpgNewSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getNewSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setNewSynonym(cti(v)); }
    }
    public static class EpgNativeSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getNativeSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setNativeSynonym(cti(v)); }
    }
    public static class EpgVoidSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getVoidSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setVoidSynonym(cti(v)); }
    }
    public static class EpgPublicSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getPublicSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setPublicSynonym(cti(v)); }
    }
    public static class EpgProtectedSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getProtectedSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setProtectedSynonym(cti(v)); }
    }
    public static class EpgPrivateSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getPrivateSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setPrivateSynonym(cti(v)); }
    }
    public static class EpgInterfaceSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getInterfaceSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setInterfaceSynonym(cti(v)); }
    }
    public static class EpgAbstractSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getAbstractSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setAbstractSynonym(cti(v)); }
    }
    public static class EpgFinalSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getFinalSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setFinalSynonym(cti(v)); }
    }
    public static class EpgFinallySynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getFinallySynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setFinallySynonym(cti(v)); }
    }
    public static class EpgReturnSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getReturnSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setReturnSynonym(cti(v)); }
    }
    public static class EpgDoubleSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getDoubleSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setDoubleSynonym(cti(v)); }
    }
    public static class EpgFloatSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getFloatSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setFloatSynonym(cti(v)); }
    }
    public static class EpgShortSynonym implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getShortSynonym(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setShortSynonym(cti(v)); }
    }
    public static class EpgType implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getType(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setType((String)v); }
    }
    public static class EpgReservName implements PropertyGateway {
        public Object read(Entity e) { return ((WhitePgReserv)e).getReservName(); }
        public void write(Entity e, Object v) { ((WhitePgReserv)e).setReservName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_pg_reserv";
    protected final String _tablePropertyName = "whitePgReserv";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PG_RESERV", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClassSynonym = cci("CLASS", "CLASS", "CLASS_SYNONYM", "(using DBFlute synonym)", true, "classSynonym", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, "whitePgReservRefList", null);
    protected final ColumnInfo _columnCaseSynonym = cci("CASE", "`CASE`", "CASE_SYNONYM", "(using DBFlute synonym)", false, "caseSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPackageSynonym = cci("PACKAGE", "PACKAGE", "PACKAGE_SYNONYM", "(using DBFlute synonym)", false, "packageSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDefaultSynonym = cci("DEFAULT", "`DEFAULT`", "DEFAULT_SYNONYM", "(using DBFlute synonym)", false, "defaultSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNewSynonym = cci("NEW", "NEW", "NEW_SYNONYM", "(using DBFlute synonym)", false, "newSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNativeSynonym = cci("NATIVE", "NATIVE", "NATIVE_SYNONYM", "(using DBFlute synonym)", false, "nativeSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVoidSynonym = cci("VOID", "VOID", "VOID_SYNONYM", "(using DBFlute synonym)", false, "voidSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPublicSynonym = cci("PUBLIC", "PUBLIC", "PUBLIC_SYNONYM", "(using DBFlute synonym)", false, "publicSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProtectedSynonym = cci("PROTECTED", "PROTECTED", "PROTECTED_SYNONYM", "(using DBFlute synonym)", false, "protectedSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPrivateSynonym = cci("PRIVATE", "PRIVATE", "PRIVATE_SYNONYM", "(using DBFlute synonym)", false, "privateSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInterfaceSynonym = cci("INTERFACE", "INTERFACE", "INTERFACE_SYNONYM", "(using DBFlute synonym)", false, "interfaceSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAbstractSynonym = cci("ABSTRACT", "ABSTRACT", "ABSTRACT_SYNONYM", "(using DBFlute synonym)", false, "abstractSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFinalSynonym = cci("FINAL", "FINAL", "FINAL_SYNONYM", "(using DBFlute synonym)", false, "finalSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFinallySynonym = cci("FINALLY", "FINALLY", "FINALLY_SYNONYM", "(using DBFlute synonym)", false, "finallySynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReturnSynonym = cci("RETURN", "`RETURN`", "RETURN_SYNONYM", "(using DBFlute synonym)", false, "returnSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDoubleSynonym = cci("DOUBLE", "`DOUBLE`", "DOUBLE_SYNONYM", "(using DBFlute synonym)", false, "doubleSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFloatSynonym = cci("FLOAT", "`FLOAT`", "FLOAT_SYNONYM", "(using DBFlute synonym)", false, "floatSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnShortSynonym = cci("SHORT", "SHORT", "SHORT_SYNONYM", "(using DBFlute synonym)", false, "shortSynonym", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnType = cci("TYPE", "TYPE", null, null, false, "type", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnReservName = cci("RESERV_NAME", "RESERV_NAME", null, null, true, "reservName", String.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnClassSynonym() { return _columnClassSynonym; }
    public ColumnInfo columnCaseSynonym() { return _columnCaseSynonym; }
    public ColumnInfo columnPackageSynonym() { return _columnPackageSynonym; }
    public ColumnInfo columnDefaultSynonym() { return _columnDefaultSynonym; }
    public ColumnInfo columnNewSynonym() { return _columnNewSynonym; }
    public ColumnInfo columnNativeSynonym() { return _columnNativeSynonym; }
    public ColumnInfo columnVoidSynonym() { return _columnVoidSynonym; }
    public ColumnInfo columnPublicSynonym() { return _columnPublicSynonym; }
    public ColumnInfo columnProtectedSynonym() { return _columnProtectedSynonym; }
    public ColumnInfo columnPrivateSynonym() { return _columnPrivateSynonym; }
    public ColumnInfo columnInterfaceSynonym() { return _columnInterfaceSynonym; }
    public ColumnInfo columnAbstractSynonym() { return _columnAbstractSynonym; }
    public ColumnInfo columnFinalSynonym() { return _columnFinalSynonym; }
    public ColumnInfo columnFinallySynonym() { return _columnFinallySynonym; }
    public ColumnInfo columnReturnSynonym() { return _columnReturnSynonym; }
    public ColumnInfo columnDoubleSynonym() { return _columnDoubleSynonym; }
    public ColumnInfo columnFloatSynonym() { return _columnFloatSynonym; }
    public ColumnInfo columnShortSynonym() { return _columnShortSynonym; }
    public ColumnInfo columnType() { return _columnType; }
    public ColumnInfo columnReservName() { return _columnReservName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClassSynonym());
        ls.add(columnCaseSynonym());
        ls.add(columnPackageSynonym());
        ls.add(columnDefaultSynonym());
        ls.add(columnNewSynonym());
        ls.add(columnNativeSynonym());
        ls.add(columnVoidSynonym());
        ls.add(columnPublicSynonym());
        ls.add(columnProtectedSynonym());
        ls.add(columnPrivateSynonym());
        ls.add(columnInterfaceSynonym());
        ls.add(columnAbstractSynonym());
        ls.add(columnFinalSynonym());
        ls.add(columnFinallySynonym());
        ls.add(columnReturnSynonym());
        ls.add(columnDoubleSynonym());
        ls.add(columnFloatSynonym());
        ls.add(columnShortSynonym());
        ls.add(columnType());
        ls.add(columnReservName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnClassSynonym()); }
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
    public ReferrerInfo referrerWhitePgReservRefList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnClassSynonym(), WhitePgReservRefDbm.getInstance().columnClassSynonym());
        return cri("FK_WHITE_PG_RESERV_REF_CLASS", "whitePgReservRefList", this, WhitePgReservRefDbm.getInstance(), map, false, "whitePgReserv");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePgReserv"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePgReservCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePgReservBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePgReserv> getEntityType() { return WhitePgReserv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhitePgReserv newMyEntity() { return new WhitePgReserv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhitePgReserv)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhitePgReserv)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
