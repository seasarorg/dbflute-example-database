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
 * The DB meta of white_escaped_java_doc. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteEscapedJavaDocDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteEscapedJavaDocDbm _instance = new WhiteEscapedJavaDocDbm();
    private WhiteEscapedJavaDocDbm() {}
    public static WhiteEscapedJavaDocDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgEscapedJavaDocCode(), "escapedJavaDocCode");
        setupEpg(_epgMap, new EpgEscapedJavaDocName(), "escapedJavaDocName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public class EpgEscapedJavaDocCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedJavaDoc)et).getEscapedJavaDocCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnEscapedJavaDocCode();
            ccls(col, vl);
            ((WhiteEscapedJavaDoc)et).setEscapedJavaDocCodeAsEscapedJavaDocCls((CDef.EscapedJavaDocCls)gcls(col, vl));
        }
    }
    public static class EpgEscapedJavaDocName implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteEscapedJavaDoc)et).getEscapedJavaDocName(); }
        public void write(Entity et, Object vl) { ((WhiteEscapedJavaDoc)et).setEscapedJavaDocName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_escaped_java_doc";
    protected final String _tablePropertyName = "whiteEscapedJavaDoc";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_ESCAPED_JAVA_DOC", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEscapedJavaDocCode = cci("ESCAPED_JAVA_DOC_CODE", "ESCAPED_JAVA_DOC_CODE", null, null, true, "escapedJavaDocCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.EscapedJavaDocCls);
    protected final ColumnInfo _columnEscapedJavaDocName = cci("ESCAPED_JAVA_DOC_NAME", "ESCAPED_JAVA_DOC_NAME", null, null, false, "escapedJavaDocName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);

    /**
     * ESCAPED_JAVA_DOC_CODE: {PK, NotNull, CHAR(3), classification=EscapedJavaDocCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedJavaDocCode() { return _columnEscapedJavaDocCode; }
    /**
     * ESCAPED_JAVA_DOC_NAME: {VARCHAR(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEscapedJavaDocName() { return _columnEscapedJavaDocName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEscapedJavaDocCode());
        ls.add(columnEscapedJavaDocName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEscapedJavaDocCode()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteEscapedJavaDoc"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteEscapedJavaDocCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteEscapedJavaDocBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteEscapedJavaDoc> getEntityType() { return WhiteEscapedJavaDoc.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteEscapedJavaDoc newMyEntity() { return new WhiteEscapedJavaDoc(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteEscapedJavaDoc)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteEscapedJavaDoc)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
