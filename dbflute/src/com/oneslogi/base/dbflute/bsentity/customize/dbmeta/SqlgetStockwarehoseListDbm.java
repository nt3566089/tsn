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
 * The DB meta of SqlgetStockwarehoseList. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlgetStockwarehoseListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlgetStockwarehoseListDbm _instance = new SqlgetStockwarehoseListDbm();
    private SqlgetStockwarehoseListDbm() {}
    public static SqlgetStockwarehoseListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlgetStockwarehoseList)et).getLid(), (et, vl) -> ((SqlgetStockwarehoseList)et).setLid(ctl(vl)), "lid");
        setupEpg(_epgMap, et -> ((SqlgetStockwarehoseList)et).getPid(), (et, vl) -> ((SqlgetStockwarehoseList)et).setPid(ctl(vl)), "pid");
        setupEpg(_epgMap, et -> ((SqlgetStockwarehoseList)et).getPcd(), (et, vl) -> ((SqlgetStockwarehoseList)et).setPcd((String)vl), "pcd");
        setupEpg(_epgMap, et -> ((SqlgetStockwarehoseList)et).getSumcharge(), (et, vl) -> ((SqlgetStockwarehoseList)et).setSumcharge(ctb(vl)), "sumcharge");
        setupEpg(_epgMap, et -> ((SqlgetStockwarehoseList)et).getSumalloc(), (et, vl) -> ((SqlgetStockwarehoseList)et).setSumalloc(ctb(vl)), "sumalloc");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlgetStockwarehoseList";
    protected final String _tableDispName = "SqlgetStockwarehoseList";
    protected final String _tablePropertyName = "sqlgetStockwarehoseList";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlgetStockwarehoseList", _tableDbName);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlgetStockwarehoseList"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlgetStockwarehoseList> getEntityType() { return SqlgetStockwarehoseList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlgetStockwarehoseList newEntity() { return new SqlgetStockwarehoseList(); }
    public SqlgetStockwarehoseList newMyEntity() { return new SqlgetStockwarehoseList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlgetStockwarehoseList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlgetStockwarehoseList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
