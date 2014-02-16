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
 * The DB meta of white_implicit_conv_numeric. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitConvNumericDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitConvNumericDbm _instance = new WhiteImplicitConvNumericDbm();
    private WhiteImplicitConvNumericDbm() {}
    public static WhiteImplicitConvNumericDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgImplicitConvNumericId(), "implicitConvNumericId");
        setupEpg(_epgMap, new EpgImplicitConvIntegerId(), "implicitConvIntegerId");
        setupEpg(_epgMap, new EpgImplicitConvStringId(), "implicitConvStringId");
        setupEpg(_epgMap, new EpgImplicitConvName(), "implicitConvName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgImplicitConvNumericId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvNumeric)et).getImplicitConvNumericId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvNumeric)et).setImplicitConvNumericId(ctb(vl)); }
    }
    public static class EpgImplicitConvIntegerId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvNumeric)et).getImplicitConvIntegerId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvNumeric)et).setImplicitConvIntegerId(ctb(vl)); }
    }
    public static class EpgImplicitConvStringId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvNumeric)et).getImplicitConvStringId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvNumeric)et).setImplicitConvStringId(ctb(vl)); }
    }
    public static class EpgImplicitConvName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitConvNumeric)et).getImplicitConvName(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitConvNumeric)et).setImplicitConvName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_conv_numeric";
    protected final String _tablePropertyName = "whiteImplicitConvNumeric";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_CONV_NUMERIC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnImplicitConvNumericId = cci("IMPLICIT_CONV_NUMERIC_ID", "IMPLICIT_CONV_NUMERIC_ID", null, null, true, "implicitConvNumericId", java.math.BigDecimal.class, true, false, "DECIMAL", 20, 0, null, false, null, null, null, "whiteImplicitConvIntegerList,whiteImplicitConvStringList", null);
    protected final ColumnInfo _columnImplicitConvIntegerId = cci("IMPLICIT_CONV_INTEGER_ID", "IMPLICIT_CONV_INTEGER_ID", null, null, true, "implicitConvIntegerId", java.math.BigDecimal.class, false, false, "DECIMAL", 20, 0, null, false, null, null, "whiteImplicitConvInteger", null, null);
    protected final ColumnInfo _columnImplicitConvStringId = cci("IMPLICIT_CONV_STRING_ID", "IMPLICIT_CONV_STRING_ID", null, null, true, "implicitConvStringId", java.math.BigDecimal.class, false, false, "DECIMAL", 20, 0, null, false, null, null, "whiteImplicitConvString", null, null);
    protected final ColumnInfo _columnImplicitConvName = cci("IMPLICIT_CONV_NAME", "IMPLICIT_CONV_NAME", null, null, true, "implicitConvName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnImplicitConvNumericId() { return _columnImplicitConvNumericId; }
    public ColumnInfo columnImplicitConvIntegerId() { return _columnImplicitConvIntegerId; }
    public ColumnInfo columnImplicitConvStringId() { return _columnImplicitConvStringId; }
    public ColumnInfo columnImplicitConvName() { return _columnImplicitConvName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnImplicitConvNumericId());
        ls.add(columnImplicitConvIntegerId());
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
    protected UniqueInfo cpui() { return hpcpui(columnImplicitConvNumericId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteImplicitConvInteger() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvIntegerId(), WhiteImplicitConvIntegerDbm.getInstance().columnImplicitConvIntegerId());
        return cfi("FK_WHITE_IMPLICIT_CONV_NUMERIC_INTEGER", "whiteImplicitConvInteger", this, WhiteImplicitConvIntegerDbm.getInstance(), mp, 0, false, false, false, true, null, null, false, "whiteImplicitConvNumericList");
    }
    public ForeignInfo foreignWhiteImplicitConvString() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvStringId(), WhiteImplicitConvStringDbm.getInstance().columnImplicitConvStringId());
        return cfi("FK_WHITE_IMPLICIT_CONV_NUMERIC_STRING", "whiteImplicitConvString", this, WhiteImplicitConvStringDbm.getInstance(), mp, 1, false, false, false, true, null, null, false, "whiteImplicitConvNumericList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteImplicitConvIntegerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvNumericId(), WhiteImplicitConvIntegerDbm.getInstance().columnImplicitConvNumericId());
        return cri("FK_WHITE_IMPLICIT_CONV_INTEGER_NUMERIC", "whiteImplicitConvIntegerList", this, WhiteImplicitConvIntegerDbm.getInstance(), mp, false, "whiteImplicitConvNumeric");
    }
    public ReferrerInfo referrerWhiteImplicitConvStringList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnImplicitConvNumericId(), WhiteImplicitConvStringDbm.getInstance().columnImplicitConvNumericId());
        return cri("FK_WHITE_IMPLICIT_CONV_STRING_NUMERIC", "whiteImplicitConvStringList", this, WhiteImplicitConvStringDbm.getInstance(), mp, false, "whiteImplicitConvNumeric");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitConvNumeric"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitConvNumericCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitConvNumericBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitConvNumeric> getEntityType() { return WhiteImplicitConvNumeric.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteImplicitConvNumeric newMyEntity() { return new WhiteImplicitConvNumeric(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitConvNumeric)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitConvNumeric)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
