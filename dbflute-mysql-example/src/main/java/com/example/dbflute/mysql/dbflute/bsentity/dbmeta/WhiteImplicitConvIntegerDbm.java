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
 * The DB meta of white_implicit_conv_integer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvIntegerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitConvIntegerDbm _instance = new WhiteImplicitConvIntegerDbm();
    private WhiteImplicitConvIntegerDbm() {}
    public static WhiteImplicitConvIntegerDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgImplicitConvIntegerId(), "implicitConvIntegerId");
        setupEpg(_epgMap, new EpgImplicitConvNumericId(), "implicitConvNumericId");
        setupEpg(_epgMap, new EpgImplicitConvStringId(), "implicitConvStringId");
        setupEpg(_epgMap, new EpgImplicitConvName(), "implicitConvName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgImplicitConvIntegerId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvInteger)et).getImplicitConvIntegerId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvInteger)et).setImplicitConvIntegerId(cti(vl)); }
    }
    public static class EpgImplicitConvNumericId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvInteger)et).getImplicitConvNumericId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvInteger)et).setImplicitConvNumericId(cti(vl)); }
    }
    public static class EpgImplicitConvStringId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvInteger)et).getImplicitConvStringId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvInteger)et).setImplicitConvStringId(cti(vl)); }
    }
    public static class EpgImplicitConvName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvInteger)et).getImplicitConvName(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvInteger)et).setImplicitConvName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_conv_integer";
    protected final String _tablePropertyName = "whiteImplicitConvInteger";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_CONV_INTEGER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImplicitConvIntegerId = cci("IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", null, null, true, "implicitConvIntegerId", Integer.class, true, false, "INT", 10, 0, null, false, null, null, null, "whiteImplicitConvNumericList,whiteImplicitConvStringList", null);
    protected final ColumnInfo _columnImplicitConvNumericId = cci("IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", null, null, true, "implicitConvNumericId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteImplicitConvNumeric", null, null);
    protected final ColumnInfo _columnImplicitConvStringId = cci("IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", null, null, true, "implicitConvStringId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteImplicitConvString", null, null);
    protected final ColumnInfo _columnImplicitConvName = cci("IMPLICIT_CONV_NAME", "IMPLICIT_CONV_NAME", null, null, true, "implicitConvName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnImplicitConvIntegerId() { return _columnImplicitConvIntegerId; }
    public ColumnInfo columnImplicitConvNumericId() { return _columnImplicitConvNumericId; }
    public ColumnInfo columnImplicitConvStringId() { return _columnImplicitConvStringId; }
    public ColumnInfo columnImplicitConvName() { return _columnImplicitConvName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnImplicitConvIntegerId());
        ls.add(columnImplicitConvNumericId());
        ls.add(columnImplicitConvStringId());
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
    protected UniqueInfo cpui() { return hpcpui(columnImplicitConvIntegerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteImplicitConvNumeric() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvNumericId(), WhiteImplicitConvNumericDbm.getInstance().columnImplicitConvNumericId());
        return cfi("FK_WHITE_IMPLICIT_CONV_INTEGER_NUMERIC", "whiteImplicitConvNumeric", this, WhiteImplicitConvNumericDbm.getInstance(), mp, 0, false, false, false, true, null, null, false, "whiteImplicitConvIntegerList");
    }
    public ForeignInfo foreignWhiteImplicitConvString() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvStringId(), WhiteImplicitConvStringDbm.getInstance().columnImplicitConvStringId());
        return cfi("FK_WHITE_IMPLICIT_CONV_INTEGER_STRING", "whiteImplicitConvString", this, WhiteImplicitConvStringDbm.getInstance(), mp, 1, false, false, false, true, null, null, false, "whiteImplicitConvIntegerList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteImplicitConvNumericList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvIntegerId(), WhiteImplicitConvNumericDbm.getInstance().columnImplicitConvIntegerId());
        return cri("FK_WHITE_IMPLICIT_CONV_NUMERIC_INTEGER", "whiteImplicitConvNumericList", this, WhiteImplicitConvNumericDbm.getInstance(), mp, false, "whiteImplicitConvInteger");
    }
    public ReferrerInfo referrerWhiteImplicitConvStringList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvIntegerId(), WhiteImplicitConvStringDbm.getInstance().columnImplicitConvIntegerId());
        return cri("FK_WHITE_IMPLICIT_CONV_STRING_INTEGER", "whiteImplicitConvStringList", this, WhiteImplicitConvStringDbm.getInstance(), mp, false, "whiteImplicitConvInteger");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvInteger"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvIntegerCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvIntegerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitConvInteger> getEntityType() { return WhiteImplicitConvInteger.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteImplicitConvInteger newMyEntity() { return new WhiteImplicitConvInteger(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitConvInteger)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitConvInteger)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
