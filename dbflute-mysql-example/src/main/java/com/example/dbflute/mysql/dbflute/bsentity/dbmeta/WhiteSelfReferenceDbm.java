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
 * The DB meta of white_self_reference. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSelfReferenceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSelfReferenceDbm _instance = new WhiteSelfReferenceDbm();
    private WhiteSelfReferenceDbm() {}
    public static WhiteSelfReferenceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSelfReferenceId(), "selfReferenceId");
        setupEpg(_epgMap, new EpgSelfReferenceName(), "selfReferenceName");
        setupEpg(_epgMap, new EpgParentId(), "parentId");
    }
    public static class EpgSelfReferenceId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getSelfReferenceId(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setSelfReferenceId(ctl(vl)); }
    }
    public static class EpgSelfReferenceName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getSelfReferenceName(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setSelfReferenceName((String)vl); }
    }
    public static class EpgParentId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getParentId(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setParentId(ctl(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgWhiteSelfReferenceSelf(), "whiteSelfReferenceSelf");
        setupEfpg(_efpgMap, new EfpgWhiteSelfReferenceRefOneByParentId(), "whiteSelfReferenceRefOneByParentId");
    }
    public class EfpgWhiteSelfReferenceSelf implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getWhiteSelfReferenceSelf(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setWhiteSelfReferenceSelf((WhiteSelfReference)vl); }
    }
    public class EfpgWhiteSelfReferenceRefOneByParentId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getWhiteSelfReferenceRefOneByParentId(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setWhiteSelfReferenceRefOneByParentId((WhiteSelfReferenceRefOne)vl); }
    }
    {
        setupEfpg(_efpgMap, new EfpgWhiteSelfReferenceRefOneAsOne(), "whiteSelfReferenceRefOneAsOne");
    }
    public class EfpgWhiteSelfReferenceRefOneAsOne implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteSelfReference)et).getWhiteSelfReferenceRefOneAsOne(); }
        public void write(Entity et, Object vl) { ((WhiteSelfReference)et).setWhiteSelfReferenceRefOneAsOne((WhiteSelfReferenceRefOne)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_self_reference";
    protected final String _tablePropertyName = "whiteSelfReference";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_SELF_REFERENCE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSelfReferenceId = cci("SELF_REFERENCE_ID", "SELF_REFERENCE_ID", null, null, Long.class, "selfReferenceId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, "whiteSelfReferenceSelfList", null);
    protected final ColumnInfo _columnSelfReferenceName = cci("SELF_REFERENCE_NAME", "SELF_REFERENCE_NAME", null, null, String.class, "selfReferenceName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParentId = cci("PARENT_ID", "PARENT_ID", null, null, Long.class, "parentId", null, false, false, false, "DECIMAL", 16, 0, null, false, null, null, "whiteSelfReferenceSelf,whiteSelfReferenceRefOneByParentId", null, null);

    /**
     * SELF_REFERENCE_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceId() { return _columnSelfReferenceId; }
    /**
     * SELF_REFERENCE_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfReferenceName() { return _columnSelfReferenceName; }
    /**
     * PARENT_ID: {IX, DECIMAL(16), FK to white_self_reference}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentId() { return _columnParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSelfReferenceId());
        ls.add(columnSelfReferenceName());
        ls.add(columnParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSelfReferenceId()); }
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
     * white_self_reference by my PARENT_ID, named 'whiteSelfReferenceSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentId(), WhiteSelfReferenceDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelf", this, WhiteSelfReferenceDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "whiteSelfReferenceSelfList");
    }
    /**
     * white_self_reference_ref_one by my PARENT_ID, named 'whiteSelfReferenceRefOneByParentId'. <br />
     * Implicit Reverse FK to FK_WHITE_SELF_REFERENCE_REF_ONE_DIRECT_PARENT
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceRefOneByParentId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentId(), WhiteSelfReferenceRefOneDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_white_self_reference_white_self_reference_ref_one_IMPLICIT", "whiteSelfReferenceRefOneByParentId", this, WhiteSelfReferenceRefOneDbm.getInstance(), mp, 1, null, false, false, false, true, null, null, false, "whiteSelfReferenceByParentIdList");
    }
    /**
     * white_self_reference_ref_one by SELF_REFERENCE_ID, named 'whiteSelfReferenceRefOneAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignWhiteSelfReferenceRefOneAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceRefOneDbm.getInstance().columnSelfReferenceId());
        return cfi("FK_WHITE_SELF_REFERENCE_REF_ONE", "whiteSelfReferenceRefOneAsOne", this, WhiteSelfReferenceRefOneDbm.getInstance(), mp, 2, null, true, false, true, false, null, null, false, "whiteSelfReference");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * white_self_reference by PARENT_ID, named 'whiteSelfReferenceSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSelfReferenceSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfReferenceId(), WhiteSelfReferenceDbm.getInstance().columnParentId());
        return cri("FK_WHITE_SELF_REFERENCE_PARENT", "whiteSelfReferenceSelfList", this, WhiteSelfReferenceDbm.getInstance(), mp, false, "whiteSelfReferenceSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteSelfReference"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteSelfReferenceCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteSelfReferenceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSelfReference> getEntityType() { return WhiteSelfReference.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSelfReference newEntity() { return new WhiteSelfReference(); }
    public WhiteSelfReference newMyEntity() { return new WhiteSelfReference(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSelfReference)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSelfReference)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
