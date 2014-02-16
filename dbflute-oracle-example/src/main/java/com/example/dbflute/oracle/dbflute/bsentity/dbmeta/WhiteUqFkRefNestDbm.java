package com.example.dbflute.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.oracle.dbflute.allcommon.*;
import com.example.dbflute.oracle.dbflute.exentity.*;

/**
 * The DB meta of WHITE_UQ_FK_REF_NEST. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkRefNestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkRefNestDbm _instance = new WhiteUqFkRefNestDbm();
    private WhiteUqFkRefNestDbm() {}
    public static WhiteUqFkRefNestDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqFkRefNestId(), "uqFkRefNestId");
        setupEpg(_epgMap, new EpgCompoundUqFirstCode(), "compoundUqFirstCode");
        setupEpg(_epgMap, new EpgCompoundUqSecondCode(), "compoundUqSecondCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqFkRefNestId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRefNest)et).getUqFkRefNestId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRefNest)et).setUqFkRefNestId(ctl(vl)); }
    }
    public static class EpgCompoundUqFirstCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRefNest)et).getCompoundUqFirstCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRefNest)et).setCompoundUqFirstCode((String)vl); }
    }
    public static class EpgCompoundUqSecondCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRefNest)et).getCompoundUqSecondCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRefNest)et).setCompoundUqSecondCode((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_REF_NEST";
    protected final String _tablePropertyName = "whiteUqFkRefNest";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_REF_NEST", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefNestId = cci("UQ_FK_REF_NEST_ID", "UQ_FK_REF_NEST_ID", null, null, true, "uqFkRefNestId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, true, "compoundUqFirstCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqFkRef", null, null);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, true, "compoundUqSecondCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqFkRef", null, null);

    public ColumnInfo columnUqFkRefNestId() { return _columnUqFkRefNestId; }
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefNestId());
        ls.add(columnCompoundUqFirstCode());
        ls.add(columnCompoundUqSecondCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUqFkRefNestId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteUqFkRef() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCompoundUqFirstCode(), WhiteUqFkRefDbm.getInstance().columnCompoundUqFirstCode());
        mp.put(columnCompoundUqSecondCode(), WhiteUqFkRefDbm.getInstance().columnCompoundUqSecondCode());
        return cfi("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRef", this, WhiteUqFkRefDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "whiteUqFkRefNestList");
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
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteUqFkRefNest"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkRefNestCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkRefNestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkRefNest> getEntityType() { return WhiteUqFkRefNest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFkRefNest newMyEntity() { return new WhiteUqFkRefNest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkRefNest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkRefNest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
