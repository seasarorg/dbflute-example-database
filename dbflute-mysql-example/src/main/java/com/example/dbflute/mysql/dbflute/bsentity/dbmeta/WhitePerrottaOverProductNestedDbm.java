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
 * The DB meta of white_perrotta_over_product_nested. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverProductNestedDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePerrottaOverProductNestedDbm _instance = new WhitePerrottaOverProductNestedDbm();
    private WhitePerrottaOverProductNestedDbm() {}
    public static WhitePerrottaOverProductNestedDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductNestedCode(), "productNestedCode");
        setupEpg(_epgMap, new EpgProductNestedName(), "productNestedName");
    }
    public static class EpgProductNestedCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProductNested)et).getProductNestedCode(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProductNested)et).setProductNestedCode((String)vl); }
    }
    public static class EpgProductNestedName implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProductNested)et).getProductNestedName(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProductNested)et).setProductNestedName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_perrotta_over_product_nested";
    protected final String _tablePropertyName = "whitePerrottaOverProductNested";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PERROTTA_OVER_PRODUCT_NESTED", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductNestedCode = cci("PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", null, null, String.class, "productNestedCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "whitePerrottaOverProductList", null);
    protected final ColumnInfo _columnProductNestedName = cci("PRODUCT_NESTED_NAME", "PRODUCT_NESTED_NAME", null, null, String.class, "productNestedName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);

    /**
     * PRODUCT_NESTED_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNestedCode() { return _columnProductNestedCode; }
    /**
     * PRODUCT_NESTED_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNestedName() { return _columnProductNestedName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductNestedCode());
        ls.add(columnProductNestedName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductNestedCode()); }
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
     * white_perrotta_over_product by PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePerrottaOverProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductNestedCode(), WhitePerrottaOverProductDbm.getInstance().columnProductNestedCode());
        return cri("FK_WHITE_PERROTTA_OVER_PRODUCT_NESTED", "whitePerrottaOverProductList", this, WhitePerrottaOverProductDbm.getInstance(), mp, false, "whitePerrottaOverProductNested");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverProductNested"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePerrottaOverProductNestedCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverProductNestedBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePerrottaOverProductNested> getEntityType() { return WhitePerrottaOverProductNested.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePerrottaOverProductNested newEntity() { return new WhitePerrottaOverProductNested(); }
    public WhitePerrottaOverProductNested newMyEntity() { return new WhitePerrottaOverProductNested(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePerrottaOverProductNested)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePerrottaOverProductNested)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
