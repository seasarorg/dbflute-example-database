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
        public Object read(Entity et) { return ((WhitePgReserv)et).getClassSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setClassSynonym(cti(vl)); }
    }
    public static class EpgCaseSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getCaseSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setCaseSynonym(cti(vl)); }
    }
    public static class EpgPackageSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getPackageSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setPackageSynonym(cti(vl)); }
    }
    public static class EpgDefaultSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getDefaultSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setDefaultSynonym(cti(vl)); }
    }
    public static class EpgNewSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getNewSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setNewSynonym(cti(vl)); }
    }
    public static class EpgNativeSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getNativeSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setNativeSynonym(cti(vl)); }
    }
    public static class EpgVoidSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getVoidSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setVoidSynonym(cti(vl)); }
    }
    public static class EpgPublicSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getPublicSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setPublicSynonym(cti(vl)); }
    }
    public static class EpgProtectedSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getProtectedSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setProtectedSynonym(cti(vl)); }
    }
    public static class EpgPrivateSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getPrivateSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setPrivateSynonym(cti(vl)); }
    }
    public static class EpgInterfaceSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getInterfaceSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setInterfaceSynonym(cti(vl)); }
    }
    public static class EpgAbstractSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getAbstractSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setAbstractSynonym(cti(vl)); }
    }
    public static class EpgFinalSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getFinalSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setFinalSynonym(cti(vl)); }
    }
    public static class EpgFinallySynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getFinallySynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setFinallySynonym(cti(vl)); }
    }
    public static class EpgReturnSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getReturnSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setReturnSynonym(cti(vl)); }
    }
    public static class EpgDoubleSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getDoubleSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setDoubleSynonym(cti(vl)); }
    }
    public static class EpgFloatSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getFloatSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setFloatSynonym(cti(vl)); }
    }
    public static class EpgShortSynonym implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getShortSynonym(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setShortSynonym(cti(vl)); }
    }
    public static class EpgType implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getType(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setType((String)vl); }
    }
    public static class EpgReservName implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePgReserv)et).getReservName(); }
        public void write(Entity et, Object vl) { ((WhitePgReserv)et).setReservName((String)vl); }
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

    /**
     * ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClassSynonym() { return _columnClassSynonym; }
    /**
     * ((using DBFlute synonym))CASE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseSynonym() { return _columnCaseSynonym; }
    /**
     * ((using DBFlute synonym))PACKAGE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackageSynonym() { return _columnPackageSynonym; }
    /**
     * ((using DBFlute synonym))DEFAULT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDefaultSynonym() { return _columnDefaultSynonym; }
    /**
     * ((using DBFlute synonym))NEW: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewSynonym() { return _columnNewSynonym; }
    /**
     * ((using DBFlute synonym))NATIVE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNativeSynonym() { return _columnNativeSynonym; }
    /**
     * ((using DBFlute synonym))VOID: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVoidSynonym() { return _columnVoidSynonym; }
    /**
     * ((using DBFlute synonym))PUBLIC: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublicSynonym() { return _columnPublicSynonym; }
    /**
     * ((using DBFlute synonym))PROTECTED: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProtectedSynonym() { return _columnProtectedSynonym; }
    /**
     * ((using DBFlute synonym))PRIVATE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrivateSynonym() { return _columnPrivateSynonym; }
    /**
     * ((using DBFlute synonym))INTERFACE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInterfaceSynonym() { return _columnInterfaceSynonym; }
    /**
     * ((using DBFlute synonym))ABSTRACT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAbstractSynonym() { return _columnAbstractSynonym; }
    /**
     * ((using DBFlute synonym))FINAL: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFinalSynonym() { return _columnFinalSynonym; }
    /**
     * ((using DBFlute synonym))FINALLY: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFinallySynonym() { return _columnFinallySynonym; }
    /**
     * ((using DBFlute synonym))RETURN: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReturnSynonym() { return _columnReturnSynonym; }
    /**
     * ((using DBFlute synonym))DOUBLE: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoubleSynonym() { return _columnDoubleSynonym; }
    /**
     * ((using DBFlute synonym))FLOAT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloatSynonym() { return _columnFloatSynonym; }
    /**
     * ((using DBFlute synonym))SHORT: {INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShortSynonym() { return _columnShortSynonym; }
    /**
     * TYPE: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnType() { return _columnType; }
    /**
     * RESERV_NAME: {NotNull, VARCHAR(32)}
     * @return The information object of specified column. (NotNull)
     */
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
    /**
     * white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePgReservRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClassSynonym(), WhitePgReservRefDbm.getInstance().columnClassSynonym());
        return cri("FK_WHITE_PG_RESERV_REF_CLASS", "whitePgReservRefList", this, WhitePgReservRefDbm.getInstance(), mp, false, "whitePgReserv");
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
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePgReserv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePgReserv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
