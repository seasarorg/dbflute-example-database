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
package com.example.dbflute.mysql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import com.example.dbflute.mysql.dbflute.allcommon.*;
import com.example.dbflute.mysql.dbflute.exentity.customize.*;

/**
 * The DB meta of SpReturnResultSetMoreNotParamResult2. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetMoreNotParamResult2Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetMoreNotParamResult2Dbm _instance = new SpReturnResultSetMoreNotParamResult2Dbm();
    private SpReturnResultSetMoreNotParamResult2Dbm() {}
    public static SpReturnResultSetMoreNotParamResult2Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity et) { return ((SpReturnResultSetMoreNotParamResult2)et).getMemberStatusCode(); }
        public void write(Entity et, Object vl) {
            ColumnInfo col = columnMemberStatusCode();
            ccls(col, vl);
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((SpReturnResultSetMoreNotParamResult2)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((SpReturnResultSetMoreNotParamResult2)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((SpReturnResultSetMoreNotParamResult2)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((SpReturnResultSetMoreNotParamResult2)et).setMemberStatusName((String)vl); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity et) { return ((SpReturnResultSetMoreNotParamResult2)et).getDescription(); }
        public void write(Entity et, Object vl) { ((SpReturnResultSetMoreNotParamResult2)et).setDescription((String)vl); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity et) { return ((SpReturnResultSetMoreNotParamResult2)et).getDisplayOrder(); }
        public void write(Entity et, Object vl) { ((SpReturnResultSetMoreNotParamResult2)et).setDisplayOrder(cti(vl)); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetMoreNotParamResult2";
    protected final String _tablePropertyName = "spReturnResultSetMoreNotParamResult2";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetMoreNotParamResult2", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, "会員ステータスを識別するコード。", null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, "説明", String.class, "description", null, false, false, false, "VARCHAR", 200, 0, null, false, null, "会員ステータスそれぞれの説明。\n気の利いた説明があるとディベロッパーがとても助かる。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", Integer.class, "displayOrder", null, false, false, false, "INT", 11, 0, null, false, null, "UI上のステータスの表示順を示すNO。\n並べるときは、このカラムに対して昇順のソート条件にする。", null, null, null);

    /**
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to member_status.MEMBER_STATUS_CODE, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to member_status.MEMBER_STATUS_NAME}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * (説明)DESCRIPTION: {VARCHAR(200), refers to member_status.DESCRIPTION}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (表示順)DISPLAY_ORDER: {INT(11), refers to member_status.DISPLAY_ORDER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
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
    public String getEntityTypeName() { return "com.example.dbflute.mysql.dbflute.exentity.customize.SpReturnResultSetMoreNotParamResult2"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetMoreNotParamResult2> getEntityType() { return SpReturnResultSetMoreNotParamResult2.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpReturnResultSetMoreNotParamResult2 newEntity() { return new SpReturnResultSetMoreNotParamResult2(); }
    public SpReturnResultSetMoreNotParamResult2 newMyEntity() { return new SpReturnResultSetMoreNotParamResult2(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpReturnResultSetMoreNotParamResult2)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpReturnResultSetMoreNotParamResult2)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
