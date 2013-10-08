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
 * The DB meta of white_all_in_one_cls_category. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteAllInOneClsCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteAllInOneClsCategoryDbm _instance = new WhiteAllInOneClsCategoryDbm();
    private WhiteAllInOneClsCategoryDbm() {}
    public static WhiteAllInOneClsCategoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgClsCategoryCode(), "clsCategoryCode");
        setupEpg(_epgMap, new EpgClsCategoryName(), "clsCategoryName");
        setupEpg(_epgMap, new EpgDescription(), "description");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgClsCategoryCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCategory)e).getClsCategoryCode(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCategory)e).setClsCategoryCode((String)v); }
    }
    public static class EpgClsCategoryName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCategory)e).getClsCategoryName(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCategory)e).setClsCategoryName((String)v); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteAllInOneClsCategory)e).getDescription(); }
        public void write(Entity e, Object v) { ((WhiteAllInOneClsCategory)e).setDescription((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_all_in_one_cls_category";
    protected final String _tablePropertyName = "whiteAllInOneClsCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ALL_IN_ONE_CLS_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClsCategoryCode = cci("CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", null, null, true, "clsCategoryCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "whiteAllInOneClsElementList", null);
    protected final ColumnInfo _columnClsCategoryName = cci("CLS_CATEGORY_NAME", "CLS_CATEGORY_NAME", null, null, true, "clsCategoryName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, true, "description", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnClsCategoryCode() { return _columnClsCategoryCode; }
    public ColumnInfo columnClsCategoryName() { return _columnClsCategoryName; }
    public ColumnInfo columnDescription() { return _columnDescription; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClsCategoryCode());
        ls.add(columnClsCategoryName());
        ls.add(columnDescription());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnClsCategoryCode()); }
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
    public ReferrerInfo referrerWhiteAllInOneClsElementList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnClsCategoryCode(), WhiteAllInOneClsElementDbm.getInstance().columnClsCategoryCode());
        return cri("FK_WHITE_ALL_IN_ONE_CLS_ELEMENT_CATEGORY", "whiteAllInOneClsElementList", this, WhiteAllInOneClsElementDbm.getInstance(), map, false, "whiteAllInOneClsCategory");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsCategory"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteAllInOneClsCategoryCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteAllInOneClsCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteAllInOneClsCategory> getEntityType() { return WhiteAllInOneClsCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteAllInOneClsCategory newMyEntity() { return new WhiteAllInOneClsCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteAllInOneClsCategory)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteAllInOneClsCategory)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
