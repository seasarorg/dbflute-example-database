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
 * The DB meta of white_implicit_reverse_fk_suppress. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteImplicitReverseFkSuppressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteImplicitReverseFkSuppressDbm _instance = new WhiteImplicitReverseFkSuppressDbm();
    private WhiteImplicitReverseFkSuppressDbm() {}
    public static WhiteImplicitReverseFkSuppressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgWhiteImplicitReverseFkSuppressId(), "whiteImplicitReverseFkSuppressId");
        setupEpg(_epgMap, new EpgWhiteImplicitReverseFkId(), "whiteImplicitReverseFkId");
        setupEpg(_epgMap, new EpgValidBeginDate(), "validBeginDate");
        setupEpg(_epgMap, new EpgValidEndDate(), "validEndDate");
    }
    public static class EpgWhiteImplicitReverseFkSuppressId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkSuppress)et).getWhiteImplicitReverseFkSuppressId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkSuppress)et).setWhiteImplicitReverseFkSuppressId(cti(vl)); }
    }
    public static class EpgWhiteImplicitReverseFkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkSuppress)et).getWhiteImplicitReverseFkId(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkSuppress)et).setWhiteImplicitReverseFkId(cti(vl)); }
    }
    public static class EpgValidBeginDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkSuppress)et).getValidBeginDate(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkSuppress)et).setValidBeginDate((java.util.Date)vl); }
    }
    public static class EpgValidEndDate implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteImplicitReverseFkSuppress)et).getValidEndDate(); }
        public void write(Entity et, Object vl) { ((WhiteImplicitReverseFkSuppress)et).setValidEndDate((java.util.Date)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_implicit_reverse_fk_suppress";
    protected final String _tablePropertyName = "whiteImplicitReverseFkSuppress";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_IMPLICIT_REVERSE_FK_SUPPRESS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnWhiteImplicitReverseFkSuppressId = cci("WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", "WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID", null, null, Integer.class, "whiteImplicitReverseFkSuppressId", null, true, true, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWhiteImplicitReverseFkId = cci("WHITE_IMPLICIT_REVERSE_FK_ID", "WHITE_IMPLICIT_REVERSE_FK_ID", null, null, Integer.class, "whiteImplicitReverseFkId", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnValidBeginDate = cci("VALID_BEGIN_DATE", "VALID_BEGIN_DATE", null, null, java.util.Date.class, "validBeginDate", null, false, false, true, "DATE", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnValidEndDate = cci("VALID_END_DATE", "VALID_END_DATE", null, null, java.util.Date.class, "validEndDate", null, false, false, true, "DATE", 10, 0, null, false, null, null, null, null, null);

    /**
     * WHITE_IMPLICIT_REVERSE_FK_SUPPRESS_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhiteImplicitReverseFkSuppressId() { return _columnWhiteImplicitReverseFkSuppressId; }
    /**
     * WHITE_IMPLICIT_REVERSE_FK_ID: {UQ+, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWhiteImplicitReverseFkId() { return _columnWhiteImplicitReverseFkId; }
    /**
     * VALID_BEGIN_DATE: {+UQ, NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidBeginDate() { return _columnValidBeginDate; }
    /**
     * VALID_END_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidEndDate() { return _columnValidEndDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnWhiteImplicitReverseFkSuppressId());
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
    protected UniqueInfo cpui() { return hpcpui(columnWhiteImplicitReverseFkSuppressId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteImplicitReverseFkSuppress"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteImplicitReverseFkSuppressCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteImplicitReverseFkSuppressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteImplicitReverseFkSuppress> getEntityType() { return WhiteImplicitReverseFkSuppress.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteImplicitReverseFkSuppress newMyEntity() { return new WhiteImplicitReverseFkSuppress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteImplicitReverseFkSuppress)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteImplicitReverseFkSuppress)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
