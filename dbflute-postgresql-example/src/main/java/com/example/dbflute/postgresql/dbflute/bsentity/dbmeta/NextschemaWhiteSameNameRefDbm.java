package com.example.dbflute.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.postgresql.dbflute.allcommon.*;
import com.example.dbflute.postgresql.dbflute.exentity.*;

/**
 * The DB meta of nextschema.white_same_name_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NextschemaWhiteSameNameRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextschemaWhiteSameNameRefDbm _instance = new NextschemaWhiteSameNameRefDbm();
    private NextschemaWhiteSameNameRefDbm() {}
    public static NextschemaWhiteSameNameRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSameNameRefId(), "sameNameRefId");
        setupEpg(_epgMap, new EpgSameNameId(), "sameNameId");
        setupEpg(_epgMap, new EpgNextRefDate(), "nextRefDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSameNameRefId implements PropertyGateway {
        public Object read(Entity et) { return ((NextschemaWhiteSameNameRef)et).getSameNameRefId(); }
        public void write(Entity et, Object vl) { ((NextschemaWhiteSameNameRef)et).setSameNameRefId(ctl(vl)); }
    }
    public static class EpgSameNameId implements PropertyGateway {
        public Object read(Entity et) { return ((NextschemaWhiteSameNameRef)et).getSameNameId(); }
        public void write(Entity et, Object vl) { ((NextschemaWhiteSameNameRef)et).setSameNameId(cti(vl)); }
    }
    public static class EpgNextRefDate implements PropertyGateway {
        public Object read(Entity et) { return ((NextschemaWhiteSameNameRef)et).getNextRefDate(); }
        public void write(Entity et, Object vl) { ((NextschemaWhiteSameNameRef)et).setNextRefDate((java.util.Date)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "nextschema.white_same_name_ref";
    protected final String _tablePropertyName = "whiteSameNameRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("nextschema.white_same_name_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameRefId = cci("same_name_ref_id", "same_name_ref_id", null, null, true, "sameNameRefId", Long.class, true, false, "int8", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, true, "sameNameId", Integer.class, false, false, "int4", 10, 0, null, false, null, null, "whiteSameName", null, null);
    protected final ColumnInfo _columnNextRefDate = cci("next_ref_date", "next_ref_date", null, null, false, "nextRefDate", java.util.Date.class, false, false, "date", 13, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSameNameRefId() { return _columnSameNameRefId; }
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    public ColumnInfo columnNextRefDate() { return _columnNextRefDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameRefId());
        ls.add(columnSameNameId());
        ls.add(columnNextRefDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteSameName() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSameNameId(), NextschemaWhiteSameNameDbm.getInstance().columnSameNameId());
        return cfi("fk_white_same_name_ref", "whiteSameName", this, NextschemaWhiteSameNameDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "whiteSameNameRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.postgresql.dbflute.exentity.NextschemaWhiteSameNameRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.postgresql.dbflute.cbean.NextschemaWhiteSameNameRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.postgresql.dbflute.exbhv.NextschemaWhiteSameNameRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextschemaWhiteSameNameRef> getEntityType() { return NextschemaWhiteSameNameRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public NextschemaWhiteSameNameRef newMyEntity() { return new NextschemaWhiteSameNameRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextschemaWhiteSameNameRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextschemaWhiteSameNameRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
