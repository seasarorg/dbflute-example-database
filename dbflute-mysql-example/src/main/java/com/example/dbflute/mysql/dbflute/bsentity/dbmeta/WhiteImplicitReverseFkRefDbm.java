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
 * The DB meta of white_implicit_reverse_fk_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitReverseFkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitReverseFkRefDbm _instance = new WhiteImplicitReverseFkRefDbm();
    private WhiteImplicitReverseFkRefDbm() {}
    public static WhiteImplicitReverseFkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgWhiteImplicitReverseFkRefId(), "whiteImplicitReverseFkRefId");
        setupEpg(_epgMap, new EpgWhiteImplicitReverseFkId(), "whiteImplicitReverseFkId");
        setupEpg(_epgMap, new EpgValidBeginDate(), "validBeginDate");
        setupEpg(_epgMap, new EpgValidEndDate(), "validEndDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgWhiteImplicitReverseFkRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkRef)et).getWhiteImplicitReverseFkRefId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkRef)et).setWhiteImplicitReverseFkRefId(cti(vl)); }
    }
    public static class EpgWhiteImplicitReverseFkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkRef)et).getWhiteImplicitReverseFkId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkRef)et).setWhiteImplicitReverseFkId(cti(vl)); }
    }
    public static class EpgValidBeginDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkRef)et).getValidBeginDate(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkRef)et).setValidBeginDate((java.util.Date)vl); }
    }
    public static class EpgValidEndDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkRef)et).getValidEndDate(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkRef)et).setValidEndDate((java.util.Date)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_reverse_fk_ref";
    protected final String _tablePropertyName = "whiteImplicitReverseFkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_REVERSE_FK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWhiteImplicitReverseFkRefId = cci("WHITE_IMPLICIT_REVERSE_FK_REF_ID", "WHITE_IMPLICIT_REVERSE_FK_REF_ID", null, null, true, "whiteImplicitReverseFkRefId", Integer.class, true, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWhiteImplicitReverseFkId = cci("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", null, null, true, "whiteImplicitReverseFkId", Integer.class, false, false, "INT", 10, 0, null, false, null, null, "whiteImplicitReverseFk", null, null);
    protected final ColumnInfo _columnValidBeginDate = cci("VALID_BEGIN_DATE", "VALID_BEGIN_DATE", null, null, true, "validBeginDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnValidEndDate = cci("VALID_END_DATE", "VALID_END_DATE", null, null, true, "validEndDate", java.util.Date.class, false, false, "DATE", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnWhiteImplicitReverseFkRefId() { return _columnWhiteImplicitReverseFkRefId; }
    public ColumnInfo columnWhiteImplicitReverseFkId() { return _columnWhiteImplicitReverseFkId; }
    public ColumnInfo columnValidBeginDate() { return _columnValidBeginDate; }
    public ColumnInfo columnValidEndDate() { return _columnValidEndDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWhiteImplicitReverseFkRefId());
        ls.add(columnWhiteImplicitReverseFkId());
        ls.add(columnValidBeginDate());
        ls.add(columnValidEndDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnWhiteImplicitReverseFkRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteImplicitReverseFk() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWhiteImplicitReverseFkId(), WhiteImplicitReverseFkDbm.getInstance().columnWhiteImplicitReverseFkId());
        return cfi("FK_white_implicit_reverse_fk_ref_white_implicit_reverse_fk_IMPLICIT", "whiteImplicitReverseFk", this, WhiteImplicitReverseFkDbm.getInstance(), mp, 0, false, false, false, true, null, null, false, "whiteImplicitReverseFkRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitReverseFkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitReverseFkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitReverseFkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitReverseFkRef> getEntityType() { return WhiteImplicitReverseFkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteImplicitReverseFkRef newMyEntity() { return new WhiteImplicitReverseFkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitReverseFkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitReverseFkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
