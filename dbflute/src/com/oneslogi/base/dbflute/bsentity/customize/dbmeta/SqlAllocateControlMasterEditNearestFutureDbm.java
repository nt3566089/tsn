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
 * The DB meta of SqlAllocateControlMasterEditNearestFuture. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlAllocateControlMasterEditNearestFutureDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlAllocateControlMasterEditNearestFutureDbm _instance = new SqlAllocateControlMasterEditNearestFutureDbm();
    private SqlAllocateControlMasterEditNearestFutureDbm() {}
    public static SqlAllocateControlMasterEditNearestFutureDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEditNearestFuture)et).getMfpickctlId(), (et, vl) -> ((SqlAllocateControlMasterEditNearestFuture)et).setMfpickctlId(ctl(vl)), "mfpickctlId");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEditNearestFuture)et).getPickfrdate(), (et, vl) -> ((SqlAllocateControlMasterEditNearestFuture)et).setPickfrdate((String)vl), "pickfrdate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEditNearestFuture)et).getPicktodate(), (et, vl) -> ((SqlAllocateControlMasterEditNearestFuture)et).setPicktodate((String)vl), "picktodate");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEditNearestFuture)et).getValidtype(), (et, vl) -> ((SqlAllocateControlMasterEditNearestFuture)et).setValidtype((String)vl), "validtype");
        setupEpg(_epgMap, et -> ((SqlAllocateControlMasterEditNearestFuture)et).getVersionNo(), (et, vl) -> ((SqlAllocateControlMasterEditNearestFuture)et).setVersionNo(ctl(vl)), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlAllocateControlMasterEditNearestFuture";
    protected final String _tableDispName = "SqlAllocateControlMasterEditNearestFuture";
    protected final String _tablePropertyName = "sqlAllocateControlMasterEditNearestFuture";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlAllocateControlMasterEditNearestFuture", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMfpickctlId = cci("MFPICKCTL_ID", "MFPICKCTL_ID", null, null, Long.class, "mfpickctlId", null, false, false, false, "bigint", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickfrdate = cci("PICKFRDATE", "PICKFRDATE", null, null, String.class, "pickfrdate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPicktodate = cci("PICKTODATE", "PICKTODATE", null, null, String.class, "picktodate", null, false, false, false, "varchar", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnValidtype = cci("VALIDTYPE", "VALIDTYPE", null, null, String.class, "validtype", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "bigint", 19, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * MFPICKCTL_ID: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMfpickctlId() { return _columnMfpickctlId; }
    /**
     * PICKFRDATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickfrdate() { return _columnPickfrdate; }
    /**
     * PICKTODATE: {varchar(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPicktodate() { return _columnPicktodate; }
    /**
     * VALIDTYPE: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnValidtype() { return _columnValidtype; }
    /**
     * VERSION_NO: {bigint(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMfpickctlId());
        ls.add(columnPickfrdate());
        ls.add(columnPicktodate());
        ls.add(columnValidtype());
        ls.add(columnVersionNo());
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlAllocateControlMasterEditNearestFuture"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlAllocateControlMasterEditNearestFuture> getEntityType() { return SqlAllocateControlMasterEditNearestFuture.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlAllocateControlMasterEditNearestFuture newEntity() { return new SqlAllocateControlMasterEditNearestFuture(); }
    public SqlAllocateControlMasterEditNearestFuture newMyEntity() { return new SqlAllocateControlMasterEditNearestFuture(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlAllocateControlMasterEditNearestFuture)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlAllocateControlMasterEditNearestFuture)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
