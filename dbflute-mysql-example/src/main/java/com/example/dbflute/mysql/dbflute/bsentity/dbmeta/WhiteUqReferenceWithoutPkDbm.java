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
 * The DB meta of white_uq_reference_without_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteUqReferenceWithoutPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqReferenceWithoutPkDbm _instance = new WhiteUqReferenceWithoutPkDbm();
    private WhiteUqReferenceWithoutPkDbm() {}
    public static WhiteUqReferenceWithoutPkDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqReferenceCode(), "uqReferenceCode");
        setupEpg(_epgMap, new EpgUqReferenceName(), "uqReferenceName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqReferenceCode implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceWithoutPk)e).getUqReferenceCode(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceWithoutPk)e).setUqReferenceCode((String)v); }
    }
    public static class EpgUqReferenceName implements PropertyGateway {
        public Object read(Entity e) { return ((WhiteUqReferenceWithoutPk)e).getUqReferenceName(); }
        public void write(Entity e, Object v) { ((WhiteUqReferenceWithoutPk)e).setUqReferenceName((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_uq_reference_without_pk";
    protected final String _tablePropertyName = "whiteUqReferenceWithoutPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_REFERENCE_WITHOUT_PK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqReferenceCode = cci("UQ_REFERENCE_CODE", "UQ_REFERENCE_CODE", null, null, true, "uqReferenceCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqReferenceWithoutPkRefList", null);
    protected final ColumnInfo _columnUqReferenceName = cci("UQ_REFERENCE_NAME", "UQ_REFERENCE_NAME", null, null, true, "uqReferenceName", String.class, false, false, "VARCHAR", 64, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnUqReferenceCode() { return _columnUqReferenceCode; }
    public ColumnInfo columnUqReferenceName() { return _columnUqReferenceName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqReferenceCode());
        ls.add(columnUqReferenceName());
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
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public ReferrerInfo referrerWhiteUqReferenceWithoutPkRefList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUqReferenceCode(), WhiteUqReferenceWithoutPkRefDbm.getInstance().columnUqReferenceCode());
        return cri("FK_WHITE_UQ_REFERENCE_WITHOUT_PK_REF", "whiteUqReferenceWithoutPkRefList", this, WhiteUqReferenceWithoutPkRefDbm.getInstance(), map, false, "whiteUqReferenceWithoutPk");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.WhiteUqReferenceWithoutPk"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.mysql.dbflute.cbean.WhiteUqReferenceWithoutPkCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.mysql.dbflute.exbhv.WhiteUqReferenceWithoutPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqReferenceWithoutPk> getEntityType() { return WhiteUqReferenceWithoutPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqReferenceWithoutPk newMyEntity() { return new WhiteUqReferenceWithoutPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((WhiteUqReferenceWithoutPk)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((WhiteUqReferenceWithoutPk)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
