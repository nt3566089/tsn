package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlgetStockHozeiList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlgetStockHozeiListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlgetStockHozeiListDbm _instance = new SqlgetStockHozeiListDbm();
    private SqlgetStockHozeiListDbm() {}
    public static SqlgetStockHozeiListDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getLid(), (et, vl) -> ((SqlgetStockHozeiList)et).setLid(ctl(vl)), "lid");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getPid(), (et, vl) -> ((SqlgetStockHozeiList)et).setPid(ctl(vl)), "pid");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getPcd(), (et, vl) -> ((SqlgetStockHozeiList)et).setPcd((String)vl), "pcd");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getLot1(), (et, vl) -> ((SqlgetStockHozeiList)et).setLot1((String)vl), "lot1");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getLot4(), (et, vl) -> ((SqlgetStockHozeiList)et).setLot4((String)vl), "lot4");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getLot2(), (et, vl) -> ((SqlgetStockHozeiList)et).setLot2((String)vl), "lot2");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getSumcharge(), (et, vl) -> ((SqlgetStockHozeiList)et).setSumcharge(ctb(vl)), "sumcharge");
        setupEpg(_epgMap, et -> ((SqlgetStockHozeiList)et).getSumalloc(), (et, vl) -> ((SqlgetStockHozeiList)et).setSumalloc(ctb(vl)), "sumalloc");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlgetStockHozeiList";
    protected final String _tableDispName = "SqlgetStockHozeiList";
    protected final String _tablePropertyName = "sqlgetStockHozeiList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlgetStockHozeiList", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLid = cci("LID", "LID", null, null, Long.class, "lid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPid = cci("PID", "PID", null, null, Long.class, "pid", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPcd = cci("PCD", "PCD", null, null, String.class, "pcd", null, false, false, false, "varchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot1 = cci("LOT1", "LOT1", null, null, String.class, "lot1", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot4 = cci("LOT4", "LOT4", null, null, String.class, "lot4", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot2 = cci("LOT2", "LOT2", null, null, String.class, "lot2", null, false, false, false, "varchar", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumcharge = cci("SUMCHARGE", "SUMCHARGE", null, null, java.math.BigDecimal.class, "sumcharge", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSumalloc = cci("SUMALLOC", "SUMALLOC", null, null, java.math.BigDecimal.class, "sumalloc", null, false, false, false, "decimal", 38, 6, null, null, false, null, null, null, null, null, false);

    /**
     * LID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLid() { return _columnLid; }
    /**
     * PID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPid() { return _columnPid; }
    /**
     * PCD: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPcd() { return _columnPcd; }
    /**
     * LOT1: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot1() { return _columnLot1; }
    /**
     * LOT4: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot4() { return _columnLot4; }
    /**
     * LOT2: {varchar(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot2() { return _columnLot2; }
    /**
     * SUMCHARGE: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumcharge() { return _columnSumcharge; }
    /**
     * SUMALLOC: {decimal(38, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSumalloc() { return _columnSumalloc; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLid());
        ls.add(columnPid());
        ls.add(columnPcd());
        ls.add(columnLot1());
        ls.add(columnLot4());
        ls.add(columnLot2());
        ls.add(columnSumcharge());
        ls.add(columnSumalloc());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlgetStockHozeiList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlgetStockHozeiList> getEntityType() { return SqlgetStockHozeiList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlgetStockHozeiList newEntity() { return new SqlgetStockHozeiList(); }
    public SqlgetStockHozeiList newMyEntity() { return new SqlgetStockHozeiList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlgetStockHozeiList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlgetStockHozeiList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
