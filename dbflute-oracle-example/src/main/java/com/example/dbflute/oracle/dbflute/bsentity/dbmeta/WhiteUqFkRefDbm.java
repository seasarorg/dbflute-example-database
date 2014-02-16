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
 * The DB meta of WHITE_UQ_FK_REF. (Singleton)
 * @author oracleman
 */
public class WhiteUqFkRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteUqFkRefDbm _instance = new WhiteUqFkRefDbm();
    private WhiteUqFkRefDbm() {}
    public static WhiteUqFkRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUqFkRefId(), "uqFkRefId");
        setupEpg(_epgMap, new EpgFkToPkId(), "fkToPkId");
        setupEpg(_epgMap, new EpgFkToUqCode(), "fkToUqCode");
        setupEpg(_epgMap, new EpgCompoundUqFirstCode(), "compoundUqFirstCode");
        setupEpg(_epgMap, new EpgCompoundUqSecondCode(), "compoundUqSecondCode");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUqFkRefId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getUqFkRefId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setUqFkRefId(ctl(vl)); }
    }
    public static class EpgFkToPkId implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getFkToPkId(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setFkToPkId(ctl(vl)); }
    }
    public static class EpgFkToUqCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getFkToUqCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setFkToUqCode((String)vl); }
    }
    public static class EpgCompoundUqFirstCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getCompoundUqFirstCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setCompoundUqFirstCode((String)vl); }
    }
    public static class EpgCompoundUqSecondCode implements PropertyGateway {
        public Object read(Entity et) { return ((WhiteUqFkRef)et).getCompoundUqSecondCode(); }
        public void write(Entity et, Object vl) { ((WhiteUqFkRef)et).setCompoundUqSecondCode((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_UQ_FK_REF";
    protected final String _tablePropertyName = "whiteUqFkRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("WHITE_UQ_FK_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUqFkRefId = cci("UQ_FK_REF_ID", "UQ_FK_REF_ID", null, null, true, "uqFkRefId", Long.class, true, false, "NUMBER", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFkToPkId = cci("FK_TO_PK_ID", "FK_TO_PK_ID", null, null, true, "fkToPkId", Long.class, false, false, "NUMBER", 16, 0, null, false, null, null, "whiteUqFkByFkToPkId", null, null);
    protected final ColumnInfo _columnFkToUqCode = cci("FK_TO_UQ_CODE", "FK_TO_UQ_CODE", null, null, true, "fkToUqCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "whiteUqFkByFkToUqCode", null, null);
    protected final ColumnInfo _columnCompoundUqFirstCode = cci("COMPOUND_UQ_FIRST_CODE", "COMPOUND_UQ_FIRST_CODE", null, null, true, "compoundUqFirstCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);
    protected final ColumnInfo _columnCompoundUqSecondCode = cci("COMPOUND_UQ_SECOND_CODE", "COMPOUND_UQ_SECOND_CODE", null, null, true, "compoundUqSecondCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, null, "whiteUqFkRefNestList", null);

    public ColumnInfo columnUqFkRefId() { return _columnUqFkRefId; }
    public ColumnInfo columnFkToPkId() { return _columnFkToPkId; }
    public ColumnInfo columnFkToUqCode() { return _columnFkToUqCode; }
    public ColumnInfo columnCompoundUqFirstCode() { return _columnCompoundUqFirstCode; }
    public ColumnInfo columnCompoundUqSecondCode() { return _columnCompoundUqSecondCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUqFkRefId());
        ls.add(columnFkToPkId());
        ls.add(columnFkToUqCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnUqFkRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignWhiteUqFkByFkToPkId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToPkId(), WhiteUqFkDbm.getInstance().columnUqFkId());
        return cfi("FK_WHITE_UQ_FK_REF_PK", "whiteUqFkByFkToPkId", this, WhiteUqFkDbm.getInstance(), mp, 0, false, false, false, false, null, null, false, "whiteUqFkRefByFkToPkIdList");
    }
    public ForeignInfo foreignWhiteUqFkByFkToUqCode() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFkToUqCode(), WhiteUqFkDbm.getInstance().columnUqFkCode());
        return cfi("FK_WHITE_UQ_FK_REF_UQ", "whiteUqFkByFkToUqCode", this, WhiteUqFkDbm.getInstance(), mp, 1, false, false, false, false, null, null, false, "whiteUqFkRefByFkToUqCodeList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerWhiteUqFkRefNestList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnCompoundUqFirstCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqFirstCode());
        mp.put(columnCompoundUqSecondCode(), WhiteUqFkRefNestDbm.getInstance().columnCompoundUqSecondCode());
        return cri("FK_WHITE_UQ_FK_REF_NEST_UQ", "whiteUqFkRefNestList", this, WhiteUqFkRefNestDbm.getInstance(), mp, false, "whiteUqFkRef");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.oracle.dbflute.exentity.WhiteUqFkRef"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.oracle.dbflute.cbean.WhiteUqFkRefCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.oracle.dbflute.exbhv.WhiteUqFkRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteUqFkRef> getEntityType() { return WhiteUqFkRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public WhiteUqFkRef newMyEntity() { return new WhiteUqFkRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteUqFkRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteUqFkRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
