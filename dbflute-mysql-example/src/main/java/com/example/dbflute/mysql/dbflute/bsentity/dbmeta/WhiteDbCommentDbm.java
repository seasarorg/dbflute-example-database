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
 * The DB meta of white_db_comment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteDbCommentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteDbCommentDbm _instance = new WhiteDbCommentDbm();
    private WhiteDbCommentDbm() {}
    public static WhiteDbCommentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgDbCommentCode(), "dbCommentCode");
        setupEpg(_epgMap, new EpgDbCommentName(), "dbCommentName");
    }
    public static class EpgDbCommentCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDbComment)et).getDbCommentCode(); }
        public void write(Entity et, Object vl) { ((WhiteDbComment)et).setDbCommentCode((String)vl); }
    }
    public static class EpgDbCommentName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteDbComment)et).getDbCommentName(); }
        public void write(Entity et, Object vl) { ((WhiteDbComment)et).setDbCommentName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_db_comment";
    protected final String _tablePropertyName = "whiteDbComment";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_DB_COMMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDbCommentCode = cci("DB_COMMENT_CODE", "DB_COMMENT_CODE", null, "Normal", String.class, "dbCommentCode", null, true, false, true, "CHAR", 3, 0, null, false, null, "this is normal comment.", null, null, null);
    protected final ColumnInfo _columnDbCommentName = cci("DB_COMMENT_NAME", "DB_COMMENT_NAME", null, "JavaDocHeadache", String.class, "dbCommentName", null, false, false, false, "VARCHAR", 20, 0, null, false, null, "e.g. /*BEGIN*/, @ @foo <br />", null, null, null);

    /**
     * (Normal)DB_COMMENT_CODE: {PK, NotNull, CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentCode() { return _columnDbCommentCode; }
    /**
     * (JavaDocHeadache)DB_COMMENT_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDbCommentName() { return _columnDbCommentName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDbCommentCode());
        ls.add(columnDbCommentName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDbCommentCode()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteDbComment"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteDbCommentCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteDbCommentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteDbComment> getEntityType() { return WhiteDbComment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteDbComment newEntity() { return new WhiteDbComment(); }
    public WhiteDbComment newMyEntity() { return new WhiteDbComment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteDbComment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteDbComment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
