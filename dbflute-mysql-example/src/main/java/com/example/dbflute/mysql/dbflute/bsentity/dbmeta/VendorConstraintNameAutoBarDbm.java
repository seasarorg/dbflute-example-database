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
 * The DB meta of vendor_constraint_name_auto_bar. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoBarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorConstraintNameAutoBarDbm _instance = new VendorConstraintNameAutoBarDbm();
    private VendorConstraintNameAutoBarDbm() {}
    public static VendorConstraintNameAutoBarDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgConstraintNameAutoBarId(), "constraintNameAutoBarId");
        setupEpg(_epgMap, new EpgConstraintNameAutoBarName(), "constraintNameAutoBarName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgConstraintNameAutoBarId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoBar)et).getConstraintNameAutoBarId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoBar)et).setConstraintNameAutoBarId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoBarName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoBar)et).getConstraintNameAutoBarName(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoBar)et).setConstraintNameAutoBarName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_constraint_name_auto_bar";
    protected final String _tablePropertyName = "vendorConstraintNameAutoBar";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_BAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoBarId = cci("CONSTRAINT_NAME_AUTO_BAR_ID", "CONSTRAINT_NAME_AUTO_BAR_ID", null, null, true, "constraintNameAutoBarId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, "vendorConstraintNameAutoRefList", null);
    protected final ColumnInfo _columnConstraintNameAutoBarName = cci("CONSTRAINT_NAME_AUTO_BAR_NAME", "CONSTRAINT_NAME_AUTO_BAR_NAME", null, null, true, "constraintNameAutoBarName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnConstraintNameAutoBarId() { return _columnConstraintNameAutoBarId; }
    public ColumnInfo columnConstraintNameAutoBarName() { return _columnConstraintNameAutoBarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoBarId());
        ls.add(columnConstraintNameAutoBarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoBarId()); }
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
    public ReferrerInfo referrerVendorConstraintNameAutoRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoBarId(), VendorConstraintNameAutoRefDbm.getInstance().columnConstraintNameAutoBarId());
        return cri("vendor_constraint_name_auto_ref_ibfk_2", "vendorConstraintNameAutoRefList", this, VendorConstraintNameAutoRefDbm.getInstance(), mp, false, "vendorConstraintNameAutoBar");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.VendorConstraintNameAutoBar"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.VendorConstraintNameAutoBarCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.VendorConstraintNameAutoBarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorConstraintNameAutoBar> getEntityType() { return VendorConstraintNameAutoBar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorConstraintNameAutoBar newMyEntity() { return new VendorConstraintNameAutoBar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorConstraintNameAutoBar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorConstraintNameAutoBar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
