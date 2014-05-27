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
 * The DB meta of vendor_constraint_name_auto_foo. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorConstraintNameAutoFooDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorConstraintNameAutoFooDbm _instance = new VendorConstraintNameAutoFooDbm();
    private VendorConstraintNameAutoFooDbm() {}
    public static VendorConstraintNameAutoFooDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgConstraintNameAutoFooId(), "constraintNameAutoFooId");
        setupEpg(_epgMap, new EpgConstraintNameAutoFooName(), "constraintNameAutoFooName");
    }
    public static class EpgConstraintNameAutoFooId implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoFoo)et).getConstraintNameAutoFooId(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoFoo)et).setConstraintNameAutoFooId(ctl(vl)); }
    }
    public static class EpgConstraintNameAutoFooName implements PropertyGateway {
        public Object read(Entity et) { return ((VendorConstraintNameAutoFoo)et).getConstraintNameAutoFooName(); }
        public void write(Entity et, Object vl) { ((VendorConstraintNameAutoFoo)et).setConstraintNameAutoFooName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_constraint_name_auto_foo";
    protected final String _tablePropertyName = "vendorConstraintNameAutoFoo";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CONSTRAINT_NAME_AUTO_FOO", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnConstraintNameAutoFooId = cci("CONSTRAINT_NAME_AUTO_FOO_ID", "CONSTRAINT_NAME_AUTO_FOO_ID", null, null, Long.class, "constraintNameAutoFooId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, "vendorConstraintNameAutoRefList", null);
    protected final ColumnInfo _columnConstraintNameAutoFooName = cci("CONSTRAINT_NAME_AUTO_FOO_NAME", "CONSTRAINT_NAME_AUTO_FOO_NAME", null, null, String.class, "constraintNameAutoFooName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    /**
     * CONSTRAINT_NAME_AUTO_FOO_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooId() { return _columnConstraintNameAutoFooId; }
    /**
     * CONSTRAINT_NAME_AUTO_FOO_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnConstraintNameAutoFooName() { return _columnConstraintNameAutoFooName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnConstraintNameAutoFooId());
        ls.add(columnConstraintNameAutoFooName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnConstraintNameAutoFooId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // canonot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * vendor_constraint_name_auto_ref by CONSTRAINT_NAME_AUTO_FOO_ID, named 'vendorConstraintNameAutoRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorConstraintNameAutoRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnConstraintNameAutoFooId(), VendorConstraintNameAutoRefDbm.getInstance().columnConstraintNameAutoFooId());
        return cri("vendor_constraint_name_auto_ref_ibfk_1", "vendorConstraintNameAutoRefList", this, VendorConstraintNameAutoRefDbm.getInstance(), mp, false, "vendorConstraintNameAutoFoo");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.VendorConstraintNameAutoFoo"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.VendorConstraintNameAutoFooCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.VendorConstraintNameAutoFooBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorConstraintNameAutoFoo> getEntityType() { return VendorConstraintNameAutoFoo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorConstraintNameAutoFoo newMyEntity() { return new VendorConstraintNameAutoFoo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorConstraintNameAutoFoo)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorConstraintNameAutoFoo)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
