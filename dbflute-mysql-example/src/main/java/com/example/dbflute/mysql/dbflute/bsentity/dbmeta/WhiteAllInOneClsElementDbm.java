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
 * The DB meta of white_all_in_one_cls_element. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteAllInOneClsElementDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteAllInOneClsElementDbm _instance = new WhiteAllInOneClsElementDbm();
    private WhiteAllInOneClsElementDbm() {}
    public static WhiteAllInOneClsElementDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgClsCategoryCode(), "clsCategoryCode");
        setupEpg(_epgMap, new EpgClsElementCode(), "clsElementCode");
        setupEpg(_epgMap, new EpgClsElementName(), "clsElementName");
        setupEpg(_epgMap, new EpgAttributeExp(), "attributeExp");
    }
    public static class EpgClsCategoryCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAllInOneClsElement)et).getClsCategoryCode(); }
        public void write(Entity et, Object vl) { ((WhiteAllInOneClsElement)et).setClsCategoryCode((String)vl); }
    }
    public static class EpgClsElementCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAllInOneClsElement)et).getClsElementCode(); }
        public void write(Entity et, Object vl) { ((WhiteAllInOneClsElement)et).setClsElementCode((String)vl); }
    }
    public static class EpgClsElementName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAllInOneClsElement)et).getClsElementName(); }
        public void write(Entity et, Object vl) { ((WhiteAllInOneClsElement)et).setClsElementName((String)vl); }
    }
    public static class EpgAttributeExp implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAllInOneClsElement)et).getAttributeExp(); }
        public void write(Entity et, Object vl) { ((WhiteAllInOneClsElement)et).setAttributeExp((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteAllInOneClsCategory(), "whiteAllInOneClsCategory");
    }
    public class EfpgWhiteAllInOneClsCategory implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteAllInOneClsElement)et).getWhiteAllInOneClsCategory(); }
        public void write(Entity et, Object vl) { ((WhiteAllInOneClsElement)et).setWhiteAllInOneClsCategory((WhiteAllInOneClsCategory)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_all_in_one_cls_element";
    protected final String _tablePropertyName = "whiteAllInOneClsElement";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ALL_IN_ONE_CLS_ELEMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnClsCategoryCode = cci("CLS_CATEGORY_CODE", "CLS_CATEGORY_CODE", null, null, String.class, "clsCategoryCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, "whiteAllInOneClsCategory", null, null);
    protected final ColumnInfo _columnClsElementCode = cci("CLS_ELEMENT_CODE", "CLS_ELEMENT_CODE", null, null, String.class, "clsElementCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnClsElementName = cci("CLS_ELEMENT_NAME", "CLS_ELEMENT_NAME", null, null, String.class, "clsElementName", null, false, false, true, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAttributeExp = cci("ATTRIBUTE_EXP", "ATTRIBUTE_EXP", null, null, String.class, "attributeExp", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null);

    /**
     * CLS_CATEGORY_CODE: {PK, NotNull, CHAR(3), FK to white_all_in_one_cls_category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClsCategoryCode() { return _columnClsCategoryCode; }
    /**
     * CLS_ELEMENT_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClsElementCode() { return _columnClsElementCode; }
    /**
     * CLS_ELEMENT_NAME: {NotNull, VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClsElementName() { return _columnClsElementName; }
    /**
     * ATTRIBUTE_EXP: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttributeExp() { return _columnAttributeExp; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnClsCategoryCode());
        ls.add(columnClsElementCode());
        ls.add(columnClsElementName());
        ls.add(columnAttributeExp());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClsCategoryCode());
        ls.add(columnClsElementCode());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * white_all_in_one_cls_category by my CLS_CATEGORY_CODE, named 'whiteAllInOneClsCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteAllInOneClsCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClsCategoryCode(), WhiteAllInOneClsCategoryDbm.getInstance().columnClsCategoryCode());
        return cfi("FK_WHITE_ALL_IN_ONE_CLS_ELEMENT_CATEGORY", "whiteAllInOneClsCategory", this, WhiteAllInOneClsCategoryDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteAllInOneClsElementList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteAllInOneClsElement"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteAllInOneClsElementCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteAllInOneClsElementBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteAllInOneClsElement> getEntityType() { return WhiteAllInOneClsElement.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteAllInOneClsElement newMyEntity() { return new WhiteAllInOneClsElement(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteAllInOneClsElement)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteAllInOneClsElement)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
