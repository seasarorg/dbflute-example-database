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
 * The DB meta of white_implicit_conv_string. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvStringDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitConvStringDbm _instance = new WhiteImplicitConvStringDbm();
    private WhiteImplicitConvStringDbm() {}
    public static WhiteImplicitConvStringDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgImplicitConvStringId(), "implicitConvStringId");
        setupEpg(_epgMap, new EpgImplicitConvIntegerId(), "implicitConvIntegerId");
        setupEpg(_epgMap, new EpgImplicitConvNumericId(), "implicitConvNumericId");
        setupEpg(_epgMap, new EpgImplicitConvName(), "implicitConvName");
    }
    public static class EpgImplicitConvStringId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getImplicitConvStringId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setImplicitConvStringId((String)vl); }
    }
    public static class EpgImplicitConvIntegerId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getImplicitConvIntegerId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setImplicitConvIntegerId((String)vl); }
    }
    public static class EpgImplicitConvNumericId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getImplicitConvNumericId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setImplicitConvNumericId((String)vl); }
    }
    public static class EpgImplicitConvName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getImplicitConvName(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setImplicitConvName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteImplicitConvInteger(), "whiteImplicitConvInteger");
        setupEfpg(_efpgMap, new EfpgWhiteImplicitConvNumeric(), "whiteImplicitConvNumeric");
    }
    public class EfpgWhiteImplicitConvInteger implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getWhiteImplicitConvInteger(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setWhiteImplicitConvInteger((WhiteImplicitConvInteger)vl); }
    }
    public class EfpgWhiteImplicitConvNumeric implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvString)et).getWhiteImplicitConvNumeric(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvString)et).setWhiteImplicitConvNumeric((WhiteImplicitConvNumeric)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_conv_string";
    protected final String _tablePropertyName = "whiteImplicitConvString";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_CONV_STRING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImplicitConvStringId = cci("IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", null, null, String.class, "implicitConvStringId", null, true, false, true, "VARCHAR", 10, 0, null, false, null, null, null, "whiteImplicitConvIntegerList,whiteImplicitConvNumericList", null);
    protected final ColumnInfo _columnImplicitConvIntegerId = cci("IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", null, null, String.class, "implicitConvIntegerId", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, "whiteImplicitConvInteger", null, null);
    protected final ColumnInfo _columnImplicitConvNumericId = cci("IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", null, null, String.class, "implicitConvNumericId", null, false, false, true, "VARCHAR", 10, 0, null, false, null, null, "whiteImplicitConvNumeric", null, null);
    protected final ColumnInfo _columnImplicitConvName = cci("IMPLICIT_CONV_NAME", "IMPLICIT_CONV_NAME", null, null, String.class, "implicitConvName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * IMPLICIT_CONV_STRING_ID: {PK, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImplicitConvStringId() { return _columnImplicitConvStringId; }
    /**
     * IMPLICIT_CONV_INTEGER_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_INTEGER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImplicitConvIntegerId() { return _columnImplicitConvIntegerId; }
    /**
     * IMPLICIT_CONV_NUMERIC_ID: {NotNull, VARCHAR(10), FK to WHITE_IMPLICIT_CONV_NUMERIC}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImplicitConvNumericId() { return _columnImplicitConvNumericId; }
    /**
     * IMPLICIT_CONV_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImplicitConvName() { return _columnImplicitConvName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnImplicitConvStringId());
        ls.add(columnImplicitConvIntegerId());
        ls.add(columnImplicitConvNumericId());
        ls.add(columnImplicitConvName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnImplicitConvStringId()); }
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
    /**
     * white_implicit_conv_integer by my IMPLICIT_CONV_INTEGER_ID, named 'whiteImplicitConvInteger'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteImplicitConvInteger() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvIntegerId(), WhiteImplicitConvIntegerDbm.getInstance().columnImplicitConvIntegerId());
        return cfi("FK_WHITE_IMPLICIT_CONV_STRING_INTEGER", "whiteImplicitConvInteger", this, WhiteImplicitConvIntegerDbm.getInstance(), mp, 0, null, false, false, false, true, null, null, false, "whiteImplicitConvStringList");
    }
    /**
     * white_implicit_conv_numeric by my IMPLICIT_CONV_NUMERIC_ID, named 'whiteImplicitConvNumeric'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteImplicitConvNumeric() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvNumericId(), WhiteImplicitConvNumericDbm.getInstance().columnImplicitConvNumericId());
        return cfi("FK_WHITE_IMPLICIT_CONV_STRING_NUMERIC", "whiteImplicitConvNumeric", this, WhiteImplicitConvNumericDbm.getInstance(), mp, 1, null, false, false, false, true, null, null, false, "whiteImplicitConvStringList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_implicit_conv_integer by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvIntegerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteImplicitConvIntegerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvStringId(), WhiteImplicitConvIntegerDbm.getInstance().columnImplicitConvStringId());
        return cri("FK_WHITE_IMPLICIT_CONV_INTEGER_STRING", "whiteImplicitConvIntegerList", this, WhiteImplicitConvIntegerDbm.getInstance(), mp, false, "whiteImplicitConvString");
    }
    /**
     * white_implicit_conv_numeric by IMPLICIT_CONV_STRING_ID, named 'whiteImplicitConvNumericList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteImplicitConvNumericList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvStringId(), WhiteImplicitConvNumericDbm.getInstance().columnImplicitConvStringId());
        return cri("FK_WHITE_IMPLICIT_CONV_NUMERIC_STRING", "whiteImplicitConvNumericList", this, WhiteImplicitConvNumericDbm.getInstance(), mp, false, "whiteImplicitConvString");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvString"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvStringCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvStringBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitConvString> getEntityType() { return WhiteImplicitConvString.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteImplicitConvString newEntity() { return new WhiteImplicitConvString(); }
    public WhiteImplicitConvString newMyEntity() { return new WhiteImplicitConvString(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitConvString)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitConvString)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
