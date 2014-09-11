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
 * The DB meta of white_escaped_number_initial. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteEscapedNumberInitialDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteEscapedNumberInitialDbm _instance = new WhiteEscapedNumberInitialDbm();
    private WhiteEscapedNumberInitialDbm() {}
    public static WhiteEscapedNumberInitialDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgNumberInitialCode(), "numberInitialCode");
        setupEpg(_epgMap, new EpgNumberInitialName(), "numberInitialName");
    }
    public class EpgNumberInitialCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedNumberInitial)et).getNumberInitialCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnNumberInitialCode();
            ccls(col, vl);
            CDef.EscapedNumberInitialCls cls = (CDef.EscapedNumberInitialCls)gcls(col, vl);
            if (cls != null) {
                ((WhiteEscapedNumberInitial)et).setNumberInitialCodeAsEscapedNumberInitialCls(cls);
            } else {
                ((WhiteEscapedNumberInitial)et).mynativeMappingNumberInitialCode((String)vl);
            }
        }
    }
    public static class EpgNumberInitialName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedNumberInitial)et).getNumberInitialName(); }
        public void write(Entity et, Object vl) { ((WhiteEscapedNumberInitial)et).setNumberInitialName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_escaped_number_initial";
    protected final String _tablePropertyName = "whiteEscapedNumberInitial";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ESCAPED_NUMBER_INITIAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNumberInitialCode = cci("NUMBER_INITIAL_CODE", "NUMBER_INITIAL_CODE", null, null, String.class, "numberInitialCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.EscapedNumberInitialCls);
    protected final ColumnInfo _columnNumberInitialName = cci("NUMBER_INITIAL_NAME", "NUMBER_INITIAL_NAME", null, null, String.class, "numberInitialName", null, false, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);

    /**
     * NUMBER_INITIAL_CODE: {PK, NotNull, CHAR(3), classification=EscapedNumberInitialCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberInitialCode() { return _columnNumberInitialCode; }
    /**
     * NUMBER_INITIAL_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumberInitialName() { return _columnNumberInitialName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNumberInitialCode());
        ls.add(columnNumberInitialName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNumberInitialCode()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteEscapedNumberInitial"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteEscapedNumberInitialCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteEscapedNumberInitialBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteEscapedNumberInitial> getEntityType() { return WhiteEscapedNumberInitial.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteEscapedNumberInitial newEntity() { return new WhiteEscapedNumberInitial(); }
    public WhiteEscapedNumberInitial newMyEntity() { return new WhiteEscapedNumberInitial(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteEscapedNumberInitial)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteEscapedNumberInitial)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
