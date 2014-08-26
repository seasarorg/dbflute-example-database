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
 * The DB meta of white_perrotta_over_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhitePerrottaOverProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhitePerrottaOverProductDbm _instance = new WhitePerrottaOverProductDbm();
    private WhitePerrottaOverProductDbm() {}
    public static WhitePerrottaOverProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductNestedCode(), "productNestedCode");
    }
    public static class EpgProductId implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProduct)et).getProductId(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProduct)et).setProductId(ctl(vl)); }
    }
    public static class EpgProductName implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProduct)et).getProductName(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProduct)et).setProductName((String)vl); }
    }
    public static class EpgProductNestedCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProduct)et).getProductNestedCode(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProduct)et).setProductNestedCode((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhitePerrottaOverProductNested(), "whitePerrottaOverProductNested");
        setupEfpg(_efpgMap, new EfpgWhitePerrottaOverTraceAsPerrotta(), "whitePerrottaOverTraceAsPerrotta");
    }
    public class EfpgWhitePerrottaOverProductNested implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProduct)et).getWhitePerrottaOverProductNested(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProduct)et).setWhitePerrottaOverProductNested((WhitePerrottaOverProductNested)vl); }
    }
    public class EfpgWhitePerrottaOverTraceAsPerrotta implements PropertyGateway {
        public Object read(Entity et) { return ((WhitePerrottaOverProduct)et).getWhitePerrottaOverTraceAsPerrotta(); }
        public void write(Entity et, Object vl) { ((WhitePerrottaOverProduct)et).setWhitePerrottaOverTraceAsPerrotta((WhitePerrottaOverTrace)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_perrotta_over_product";
    protected final String _tablePropertyName = "whitePerrottaOverProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_PERROTTA_OVER_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, "whitePerrottaOverTraceAsPerrotta", "whitePerrottaOverMemberList,whitePerrottaOverTraceByNextProductIdList,whitePerrottaOverTraceByPreviousProductIdList", null);
    protected final ColumnInfo _columnProductName = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, String.class, "productName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProductNestedCode = cci("PRODUCT_NESTED_CODE", "PRODUCT_NESTED_CODE", null, null, String.class, "productNestedCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "whitePerrottaOverProductNested", null, null);

    /**
     * PRODUCT_ID: {PK, NotNull, BIGINT(19), FK to WHITE_PERROTTA_OVER_TRACE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * PRODUCT_NESTED_CODE: {IX, NotNull, CHAR(3), FK to white_perrotta_over_product_nested}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNestedCode() { return _columnProductNestedCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductNestedCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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
     * white_perrotta_over_product_nested by my PRODUCT_NESTED_CODE, named 'whitePerrottaOverProductNested'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverProductNested() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductNestedCode(), WhitePerrottaOverProductNestedDbm.getInstance().columnProductNestedCode());
        return cfi("FK_WHITE_PERROTTA_OVER_PRODUCT_NESTED", "whitePerrottaOverProductNested", this, WhitePerrottaOverProductNestedDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whitePerrottaOverProductList");
    }
    /**
     * white_perrotta_over_trace by my PRODUCT_ID, named 'whitePerrottaOverTraceAsPerrotta'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhitePerrottaOverTraceAsPerrotta() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhitePerrottaOverTraceDbm.getInstance().columnPreviousProductId());
        return cfi("FK_OVER_RELATION_CACHE_TEST", "whitePerrottaOverTraceAsPerrotta", this, WhitePerrottaOverTraceDbm.getInstance(), mp, 1, null, true, true, false, true, "$$foreignAlias$$.TRACE_TYPE_CODE = $$over(WHITE_PERROTTA_OVER_MEMBER)$$.TRACE_TYPE_CODE", null, false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_perrotta_over_member by PRODUCT_ID, named 'whitePerrottaOverMemberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePerrottaOverMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhitePerrottaOverMemberDbm.getInstance().columnProductId());
        return cri("FK_WHITE_PERROTTA_OVER_MEMBER_PRODUCT", "whitePerrottaOverMemberList", this, WhitePerrottaOverMemberDbm.getInstance(), mp, false, "whitePerrottaOverProduct");
    }
    /**
     * white_perrotta_over_trace by NEXT_PRODUCT_ID, named 'whitePerrottaOverTraceByNextProductIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePerrottaOverTraceByNextProductIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhitePerrottaOverTraceDbm.getInstance().columnNextProductId());
        return cri("FK_WHITE_PERROTTA_OVER_TRACE_NEXT", "whitePerrottaOverTraceByNextProductIdList", this, WhitePerrottaOverTraceDbm.getInstance(), mp, false, "whitePerrottaOverProductByNextProductId");
    }
    /**
     * white_perrotta_over_trace by PREVIOUS_PRODUCT_ID, named 'whitePerrottaOverTraceByPreviousProductIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhitePerrottaOverTraceByPreviousProductIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WhitePerrottaOverTraceDbm.getInstance().columnPreviousProductId());
        return cri("FK_WHITE_PERROTTA_OVER_TRACE_PREVIOUS", "whitePerrottaOverTraceByPreviousProductIdList", this, WhitePerrottaOverTraceDbm.getInstance(), mp, false, "whitePerrottaOverProductByPreviousProductId");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhitePerrottaOverProduct"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhitePerrottaOverProductCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhitePerrottaOverProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhitePerrottaOverProduct> getEntityType() { return WhitePerrottaOverProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhitePerrottaOverProduct newEntity() { return new WhitePerrottaOverProduct(); }
    public WhitePerrottaOverProduct newMyEntity() { return new WhitePerrottaOverProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhitePerrottaOverProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhitePerrottaOverProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
